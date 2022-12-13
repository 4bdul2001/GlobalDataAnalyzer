package UI;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BottomMenuView extends HBox {
    @FXML
    public ChoiceBox<String> availableCharts;
    @FXML
    public ChoiceBox<String> availableAnalyses;

    @FXML
    public Button addChartBtn;

    @FXML
    public Button removeChartBtn;

    @FXML
    public Button recalculateBtn;

    public BottomMenuView() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "/fxml/BottomMenuView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        addChartBtn.setOnAction(this::addChartToListOfViews);
        removeChartBtn.setOnAction(this::removeChartFromListOfViews);
        recalculateBtn.setOnAction(this::recalculate);

        setAvailableCharts(new ArrayList<>());
        setAvailableAnalyses(new ArrayList<>());
    }

    public void addChartToListOfViews(ActionEvent actionEvent) {
        propertyOnChartAdded.get().handle(new SelectedChartEvent(availableCharts.getValue(), EventType.ROOT));
    }

    public void removeChartFromListOfViews(ActionEvent actionEvent) {
        propertyOnChartRemoved.get().handle(new SelectedChartEvent(availableCharts.getValue(), EventType.ROOT));
    }

    public void recalculate(ActionEvent actionEvent) {
        if(propertyOnRecalculateClicked.isNotNull().getValue())
            propertyOnRecalculateClicked.get().handle
                (new RecalculateEvent(availableAnalyses.getValue(), EventType.ROOT));
    }

    static public class SelectedChartEvent extends Event {
        private String chartName;

        public SelectedChartEvent(String chartName, EventType<? extends Event> eventType) {
            super(eventType);
            this.chartName = chartName;
        }

        public String getChartName() {
            return chartName;
        }
    }

    static public class RecalculateEvent extends Event {
        private String analysisName;

        public RecalculateEvent(String analysisName, EventType<? extends Event> eventType) {
            super(eventType);
            this.analysisName = analysisName;
        }

        public String getAnalysisName() {
            return analysisName;
        }

    }

    //Object Property for the chart added button.
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private ObjectProperty<EventHandler<SelectedChartEvent>> propertyOnChartAdded = new SimpleObjectProperty<>();

    public final ObjectProperty<EventHandler<SelectedChartEvent>> onChartAddedProperty() {
        return propertyOnChartAdded;
    }

    public final void setOnChartAdded(EventHandler<SelectedChartEvent> handler) {
        propertyOnChartAdded.set(handler);
    }

    public final EventHandler<SelectedChartEvent> getOnChartAdded() {
        return propertyOnChartAdded.get();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Object Property for the chart removed button.
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private ObjectProperty<EventHandler<SelectedChartEvent>> propertyOnChartRemoved = new SimpleObjectProperty<>();

    public final ObjectProperty<EventHandler<SelectedChartEvent>> onChartRemovedProperty() {
        return propertyOnChartRemoved;
    }

    public final void setOnChartRemoved(EventHandler<SelectedChartEvent> handler) {
        propertyOnChartRemoved.set(handler);
    }

    public final EventHandler<SelectedChartEvent> getOnChartRemoved() {
        return propertyOnChartRemoved.get();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Object Property for the recalculate button.
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private ObjectProperty<EventHandler<RecalculateEvent>> propertyOnRecalculateClicked = new SimpleObjectProperty<>();

    public final ObjectProperty<EventHandler<RecalculateEvent>> onRecalculateClickedProperty() {
        return propertyOnRecalculateClicked;
    }

    public final void setOnRecalculateClicked(EventHandler<RecalculateEvent> handler) {
        propertyOnRecalculateClicked.set(handler);
    }

    public final EventHandler<RecalculateEvent> getOnRecalculateClicked() {
        return propertyOnRecalculateClicked.get();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Object property for the available chart list.
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private ObjectProperty<List<String>> propertyAvailableCharts = new SimpleObjectProperty<>();

    public final ObjectProperty<List<String>> availableChartsProperty() {
        return propertyAvailableCharts;
    }

    public final void setAvailableCharts(List<String> charts) {
        propertyAvailableCharts.set(charts);
        availableCharts.setItems(FXCollections.observableList(charts));;
    }

    public final List<String> getAvailableCharts() {
        return propertyAvailableCharts.get();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Object property for the available analysis list.
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private ObjectProperty<List<String>> propertyAvailableAnalyses = new SimpleObjectProperty<>();

    public final ObjectProperty<List<String>> availableAnalysesProperty() {
        return propertyAvailableAnalyses;
    }

    public final void setAvailableAnalyses(List<String> analyses) {
        propertyAvailableAnalyses.set(analyses);
        availableAnalyses.setItems(FXCollections.observableList(analyses));
    }

    public final List<String> getAvailableAnalyses() {
        return propertyAvailableAnalyses.get();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
}