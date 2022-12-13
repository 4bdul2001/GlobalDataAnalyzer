package UI;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TopMenuView extends HBox implements Initializable {

    @FXML
    public ChoiceBox<String> availableCountries;
    @FXML
    public ChoiceBox<String> availableFromYears;
    @FXML
    public ChoiceBox<String> availableToYears;

    public TopMenuView() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "/fxml/topMenuView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        availableCountries.setOnAction(this::countryOrYearsSelected);
        availableFromYears.setOnAction(this::countryOrYearsSelected);
        availableToYears.setOnAction(this::countryOrYearsSelected);
    }

    static public class CountryOrYearsSelectedEvent extends Event {
        private String country;
        private String fromYear;
        private String toYear;

        public CountryOrYearsSelectedEvent(String country, String fromYear, String toYear, EventType<? extends Event> eventType) {
            super(eventType);
            this.country = country;
            this.fromYear = fromYear;
            this.toYear = toYear;
        }

        public String getCountry() {
            return country;
        }

        public String getFromYear() {
            return fromYear;
        }

        public String getToYear() {
            return toYear;
        }
    }

    private void countryOrYearsSelected(ActionEvent actionEvent) {
        if(propertyOnCountryOrYearsSelected.getValue() != null)
            propertyOnCountryOrYearsSelected.get().handle(new CountryOrYearsSelectedEvent(
                    availableCountries.getValue(), availableFromYears.getValue(), availableToYears.getValue(), EventType.ROOT));
    }

    private ObjectProperty<EventHandler<CountryOrYearsSelectedEvent>> propertyOnCountryOrYearsSelected = new SimpleObjectProperty<>();

    public final ObjectProperty<EventHandler<CountryOrYearsSelectedEvent>> propertyOnCountryOrYearsSelected() {
        return propertyOnCountryOrYearsSelected;
    }

    public final void setOnCountryOrYearsSelected(EventHandler<CountryOrYearsSelectedEvent> handler) {
        propertyOnCountryOrYearsSelected.set(handler);
    }

    public final EventHandler<CountryOrYearsSelectedEvent> getOnCountryOrYearsSelected() {
        return propertyOnCountryOrYearsSelected.get();
    }

    public final void setAvailableToYears(List<String> toYears) {
        availableToYears.setItems(FXCollections.observableList(toYears));
    }

    public final void setAvailableCountries(List<String> toCountries) {
        availableCountries.setItems(FXCollections.observableList(toCountries));
    }

    public final void setAvailableFromYears(List<String> fromYears) {
        availableFromYears.setItems(FXCollections.observableList(fromYears));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setAvailableCountries(new ArrayList<>());
        setAvailableFromYears(new ArrayList<>());
        setAvailableToYears(new ArrayList<>());
    }
}
