package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult9 = healthCareAccessProblemsVsMortalityRate3.recalculate("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = healthCareAccessProblemsVsMortalityRate3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Fetchers.PublicSectorEmploymentShareMale publicSectorEmploymentShareMale3 = new Fetchers.PublicSectorEmploymentShareMale("", "", "hi!");
        java.lang.String str4 = publicSectorEmploymentShareMale3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            WbApi.Response response1 = new WbApi.Response("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Not a JSON Array: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult9 = healthCareAccessProblemsVsMortalityRate3.recalculate("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("", "", "hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        UserDb.LoginCli loginCli0 = new UserDb.LoginCli();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        UserDb.IUser iUser2 = null;
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.createUser(iUser2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.createRecord(UserDb.IDbRecord)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("", "hi!", "");
        java.lang.String str4 = gdpFetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            UserDb.LocalJsonTableDataSource localJsonTableDataSource1 = new UserDb.LocalJsonTableDataSource("GDP");
            org.junit.Assert.fail("Expected exception of type UserDb.LocalJsonTableDataSource.DbFileNotFoundException; message: TableDataSource exception: Specified JSON db file does not exist: GDP");
        } catch (UserDb.LocalJsonTableDataSource.DbFileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userDbModel1.changeUserPassword("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Analyzer.AverageForestArea averageForestArea3 = new Analyzer.AverageForestArea("hi!", "GDP", "");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult7 = averageForestArea3.recalculate("", "GDP", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("hi!", "", "GDP");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("hi!", "GDP", "");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = co2VsGdpPerCap3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException2 = wbApiModel0.new WbApiModelException("");
        WbApi.Request request3 = null;
        // The following exception was thrown during execution in test generation
        try {
            WbApi.Response response4 = wbApiModel0.getData(request3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"WbApi.Request.getCountry()\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("", "", "GDP");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        UserDb.IUser iUser0 = null;
        UserDb.UserRecord userRecord1 = new UserDb.UserRecord(iUser0);
        java.lang.String[] strArray2 = userRecord1.getColumns();
        // The following exception was thrown during execution in test generation
        try {
            UserDb.User user3 = new UserDb.User((UserDb.IRecord) userRecord1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.IUser.getKey()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Fetchers.PublicSectorEmploymentShareMale publicSectorEmploymentShareMale3 = new Fetchers.PublicSectorEmploymentShareMale("hi!", "GDP", "HealthcareAccessProblems");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        java.lang.String str6 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        healthCareAccessProblemsVsMortalityRate3.setEndYear("hi!");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult12 = healthCareAccessProblemsVsMortalityRate3.recalculate("EnergyUse", "hi!", "EnergyUse");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Fetchers.HospitalBedsFetcher hospitalBedsFetcher3 = new Fetchers.HospitalBedsFetcher("", "", "hi!");
        java.lang.String str4 = hospitalBedsFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HospitalBeds" + "'", str4.equals("HospitalBeds"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        java.lang.String str6 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        healthCareAccessProblemsVsMortalityRate3.setEndYear("hi!");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult12 = healthCareAccessProblemsVsMortalityRate3.recalculate("GDP", "HospitalBeds", "HealthcareAccessProblems");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        WbApi.Response response0 = new WbApi.Response();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult7 = healthCareAccessProblemsVsMortalityRate3.recalculate("HospitalBeds", "HospitalBeds", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Fetchers.MortalityRateFetcher mortalityRateFetcher3 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        mortalityRateFetcher3.setStartYear("");
        java.lang.String str6 = mortalityRateFetcher3.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult7 = healthCareAccessProblemsVsMortalityRate3.recalculate("HospitalBeds", "", "GDP");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Fetchers.ForestAreaFetcher forestAreaFetcher3 = new Fetchers.ForestAreaFetcher("GDP", "HospitalBeds", "HospitalBeds");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Double> strMap4 = forestAreaFetcher3.getData();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Analyzer.AverageExpenditureOnEducation averageExpenditureOnEducation3 = new Analyzer.AverageExpenditureOnEducation("GDP", "GDP", "GDP");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = averageExpenditureOnEducation3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("hi!", "hi!", "GDP");
        java.lang.String str4 = energyUseFetcher3.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            WbApi.Response response1 = new WbApi.Response("HospitalBeds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Not a JSON Array: \"HospitalBeds\"");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        UserDb.LocalJsonTableDataSource.NoMetaException noMetaException0 = new UserDb.LocalJsonTableDataSource.NoMetaException();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("HealthcareAccessProblems", "", "GDP");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.getUserById("HospitalBeds");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("hi!", "hi!", "hi!");
        publicSectorEmploymentShareFemale3.setStartYear("GDP");
        publicSectorEmploymentShareFemale3.setEndYear("hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("HospitalBeds", "HospitalBeds", "EnergyUse");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Fetchers.Co2Fetcher co2Fetcher3 = new Fetchers.Co2Fetcher("hi!", "HospitalBeds", "HealthcareAccessProblems");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("hi!", "hi!", "GDP");
        java.lang.String str4 = energyUseFetcher3.getLabel();
        energyUseFetcher3.setEndYear("");
        energyUseFetcher3.setCountry("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EnergyUse" + "'", str4.equals("EnergyUse"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userDbModel1.changeUserUsername("HospitalBeds", "HealthcareAccessProblems");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        UserDb.IUser iUser0 = null;
        UserDb.UserRecord userRecord1 = new UserDb.UserRecord(iUser0);
        java.lang.String[] strArray2 = userRecord1.getColumns();
        java.lang.String[] strArray3 = userRecord1.getColumns();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("hi!", "hi!", "hi!");
        java.lang.String str4 = publicSectorEmploymentShareFemale3.getStartYear();
        java.lang.String str5 = publicSectorEmploymentShareFemale3.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Analyzer.AverageForestArea averageForestArea3 = new Analyzer.AverageForestArea("hi!", "GDP", "");
        java.lang.Class<?> wildcardClass4 = averageForestArea3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Fetchers.Co2Fetcher co2Fetcher3 = new Fetchers.Co2Fetcher("HospitalBeds", "Population", "MortalityRate");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.deleteUser("EnergyUse");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.removeRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("HealthcareAccessProblems", "", "GDP");
        java.lang.String str4 = energyUseFetcher3.getCountry();
        java.lang.String str5 = energyUseFetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Analyzer.PublicSectorEmploymentShareMaleVsFemale publicSectorEmploymentShareMaleVsFemale3 = new Analyzer.PublicSectorEmploymentShareMaleVsFemale("EnergyUse", "GDP", "GDP");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = publicSectorEmploymentShareMaleVsFemale3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            WbApi.Response response1 = new WbApi.Response("ForestArea");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Not a JSON Array: \"ForestArea\"");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userDbModel1.changeUserPassword("HospitalBeds", "Public Sector Employment Share Of Total Employment In Males");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Fetchers.PublicSectorEmploymentShareMale publicSectorEmploymentShareMale3 = new Fetchers.PublicSectorEmploymentShareMale("", "", "GDP");
        publicSectorEmploymentShareMale3.setStartYear("GDP");
        java.lang.String str6 = publicSectorEmploymentShareMale3.getLabel();
        publicSectorEmploymentShareMale3.setCountry("HospitalBeds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Public Sector Employment Share Of Total Employment In Males" + "'", str6.equals("Public Sector Employment Share Of Total Employment In Males"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("", "", "");
        java.lang.String str4 = co2VsGdpPerCap3.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult5 = co2VsGdpPerCap3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("GDP", "GDP", "Public Sector Employment Share Of Total Employment In Males");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("", "hi!", "MortalityRate");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("Population", "CO2", "Public Sector Employment Share Of Total Employment In Males");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.getUserById("Public Sector Employment Share Of Total Employment In Males");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("HealthcareAccessProblems", "Public Sector Employment Share Of Total Employment In Males", "MortalityRate");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("hi!", "HealthcareAccessProblems", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult7 = co2VsGdpPerCap3.recalculate("EnergyUse", "Public Sector Employment Share Of Total Employment In Males", "Public Sector Employment Share Of Total Employment In Males");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Not a JSON Array: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("HealthcareAccessProblems", "ForestArea", "GDP");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        java.lang.String str6 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        healthCareAccessProblemsVsMortalityRate3.setStartYear("hi!");
        healthCareAccessProblemsVsMortalityRate3.setCountry("HealthcareAccessProblems");
        java.lang.Class<?> wildcardClass11 = healthCareAccessProblemsVsMortalityRate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Fetchers.Co2Fetcher co2Fetcher3 = new Fetchers.Co2Fetcher("", "", "Population");
        java.lang.String str4 = co2Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            UserDb.LocalJsonTableDataSource localJsonTableDataSource1 = new UserDb.LocalJsonTableDataSource("Population");
            org.junit.Assert.fail("Expected exception of type UserDb.LocalJsonTableDataSource.DbFileNotFoundException; message: TableDataSource exception: Specified JSON db file does not exist: Population");
        } catch (UserDb.LocalJsonTableDataSource.DbFileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Fetchers.ForestAreaFetcher forestAreaFetcher3 = new Fetchers.ForestAreaFetcher("HealthcareAccessProblems", "hi!", "GDP");
        java.lang.String str4 = forestAreaFetcher3.getLabel();
        java.lang.String str5 = forestAreaFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ForestArea" + "'", str4.equals("ForestArea"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ForestArea" + "'", str5.equals("ForestArea"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        WbApi.Request request4 = new WbApi.Request("HealthcareAccessProblems", "MortalityRate", "MortalityRate", "HealthcareAccessProblems");
        java.lang.String str5 = request4.getIndicatorID();
        java.lang.Class<?> wildcardClass6 = request4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MortalityRate" + "'", str5.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Fetchers.ForestAreaFetcher forestAreaFetcher3 = new Fetchers.ForestAreaFetcher("CO2", "Public Sector Employment Share Of Total Employment In Males", "HealthcareAccessProblems");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("Population", "", "CO2");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        UserDb.LocalJsonTableDataSource.NoColumnsException noColumnsException0 = new UserDb.LocalJsonTableDataSource.NoColumnsException();
        java.lang.String str1 = noColumnsException0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata" + "'", str1.equals("UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("hi!", "GDP", "");
        gdpFetcher3.setCountry("UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("ForestArea", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata", "HealthcareAccessProblems");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("HealthcareAccessProblems", "HospitalBeds", "EnergyUse");
        java.lang.String str4 = energyUseFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EnergyUse" + "'", str4.equals("EnergyUse"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Analyzer.AverageExpenditureOnEducation averageExpenditureOnEducation3 = new Analyzer.AverageExpenditureOnEducation("CO2", "Population", "Population");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Fetchers.MortalityRateFetcher mortalityRateFetcher3 = new Fetchers.MortalityRateFetcher("Public Sector Employment Share Of Total Employment In Males", "HealthExpenditure", "ForestArea");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Analyzer.Co2VsEnergyUseVsAirPollution co2VsEnergyUseVsAirPollution3 = new Analyzer.Co2VsEnergyUseVsAirPollution("HealthcareAccessProblems", "CO2", "CO2");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = co2VsEnergyUseVsAirPollution3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("", "HealthExpenditure", "ForestArea");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Fetchers.HealthExpenditureFetcher healthExpenditureFetcher3 = new Fetchers.HealthExpenditureFetcher("GDP", "HospitalBeds", "HospitalBeds");
        java.lang.String str4 = healthExpenditureFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HealthExpenditure" + "'", str4.equals("HealthExpenditure"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.deleteUser("Public Sector Employment Share Of Total Employment In Males");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.removeRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        // The following exception was thrown during execution in test generation
        try {
            UserDb.ITableDataSource iTableDataSource2 = localJsonTableDataSourceFactory1.createTableDataSource();
            org.junit.Assert.fail("Expected exception of type UserDb.LocalJsonTableDataSource.DbFileNotFoundException; message: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.LocalJsonTableDataSource.DbFileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("hi!", "hi!", "hi!");
        publicSectorEmploymentShareFemale3.setStartYear("GDP");
        java.lang.String str6 = publicSectorEmploymentShareFemale3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Public Sector Employment Share Of Total Employment In Females" + "'", str6.equals("Public Sector Employment Share Of Total Employment In Females"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("hi!", "HealthcareAccessProblems", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = co2VsGdpPerCap3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Fetchers.MortalityRateFetcher mortalityRateFetcher3 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str4 = mortalityRateFetcher3.getLabel();
        java.lang.String str5 = mortalityRateFetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MortalityRate" + "'", str4.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "GDP" + "'", str5.equals("GDP"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("", "", "");
        healthExpenditureVsHospitalBeds3.setEndYear("hi!");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult6 = healthExpenditureVsHospitalBeds3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("HospitalBeds", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata", "Population");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        UserDb.IUser iUser0 = null;
        UserDb.UserRecord userRecord1 = new UserDb.UserRecord(iUser0);
        java.lang.String[] strArray2 = userRecord1.getColumns();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = userRecord1.getKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.IUser.getKey()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("GDP", "Population", "ForestArea");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Analyzer.AverageExpenditureOnEducation averageExpenditureOnEducation3 = new Analyzer.AverageExpenditureOnEducation("ForestArea", "MortalityRate", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata");
        averageExpenditureOnEducation3.setEndYear("HealthExpenditure");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Fetchers.PopulationFetcher populationFetcher3 = new Fetchers.PopulationFetcher("EnergyUse", "", "Public Sector Employment Share Of Total Employment In Females");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Analyzer.PublicSectorEmploymentShareMaleVsFemale publicSectorEmploymentShareMaleVsFemale3 = new Analyzer.PublicSectorEmploymentShareMaleVsFemale("", "EnergyUse", "HealthcareAccessProblems");
        java.lang.String str4 = publicSectorEmploymentShareMaleVsFemale3.getCountry();
        publicSectorEmploymentShareMaleVsFemale3.setCountry("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HealthcareAccessProblems" + "'", str4.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.IUser iUser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userSingleTableDatabase2.createRecord(iUser3);
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Fetchers.Co2Fetcher co2Fetcher3 = new Fetchers.Co2Fetcher("GDP", "ForestArea", "GDP");
        java.lang.String str4 = co2Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException2 = wbApiModel0.new WbApiModelException("");
        java.lang.String str3 = wbApiModelException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "WbApi.WbApiModel$WbApiModelException: " + "'", str3.equals("WbApi.WbApiModel$WbApiModelException: "));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Fetchers.EducationExpenditureFetcher educationExpenditureFetcher3 = new Fetchers.EducationExpenditureFetcher("UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata", "HospitalBeds", "Public Sector Employment Share Of Total Employment In Males");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.getUserByUsername("EnergyUse");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getKeys()\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Analyzer.AverageExpenditureOnEducation averageExpenditureOnEducation3 = new Analyzer.AverageExpenditureOnEducation("GDP", "GDP", "GDP");
        java.lang.String str4 = averageExpenditureOnEducation3.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.String str4 = jsonRecord2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Analyzer.PublicSectorEmploymentShareMaleVsFemale publicSectorEmploymentShareMaleVsFemale3 = new Analyzer.PublicSectorEmploymentShareMaleVsFemale("EnergyUse", "GDP", "GDP");
        publicSectorEmploymentShareMaleVsFemale3.setEndYear("MortalityRate");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Fetchers.MortalityRateFetcher mortalityRateFetcher3 = new Fetchers.MortalityRateFetcher("UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata", "Population", "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("GDP", "HospitalBeds", "EnergyUse");
        healthCareAccessProblemsFetcher3.setCountry("");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("hi!", "GDP", "");
        gdpFetcher3.setStartYear("hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Analyzer.PublicSectorEmploymentShareMaleVsFemale publicSectorEmploymentShareMaleVsFemale3 = new Analyzer.PublicSectorEmploymentShareMaleVsFemale("EnergyUse", "GDP", "GDP");
        java.lang.String str4 = publicSectorEmploymentShareMaleVsFemale3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Analyzer.Co2VsEnergyUseVsAirPollution co2VsEnergyUseVsAirPollution3 = new Analyzer.Co2VsEnergyUseVsAirPollution("Population", "MortalityRate", "HospitalBeds");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("HealthExpenditure", "MortalityRate", "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.String[] strArray4 = jsonRecord2.getColumns();
        java.lang.String[] strArray5 = jsonRecord2.getColumns();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("CO2", "Population", "Public Sector Employment Share Of Total Employment In Females");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>>();
        java.lang.String[] strArray1 = null;
        Analyzer.AnalysisResult analysisResult2 = new Analyzer.AnalysisResult(strMapList0, strArray1);
        java.util.Map<java.lang.String, java.lang.Double> strMap4 = analysisResult2.getValues((int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Double> strMap6 = analysisResult2.getValues((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Double> strMap8 = analysisResult2.getValues((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("hi!", jSONObject1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userSingleTableDatabase2.removeRecord("HealthcareAccessProblems");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("HealthcareAccessProblems", "", "");
        healthExpenditureVsHospitalBeds3.setStartYear("Public Sector Employment Share Of Total Employment In Males");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException2 = wbApiModel0.new WbApiModelException("");
        UserDb.LocalJsonTableDataSource.InvalidRecordException invalidRecordException4 = new UserDb.LocalJsonTableDataSource.InvalidRecordException("Population");
        wbApiModelException2.addSuppressed((java.lang.Throwable) invalidRecordException4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Fetchers.HospitalBedsFetcher hospitalBedsFetcher3 = new Fetchers.HospitalBedsFetcher("hi!", "GDP", "EnergyUse");
        java.lang.String str4 = hospitalBedsFetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Fetchers.Co2Fetcher co2Fetcher3 = new Fetchers.Co2Fetcher("Public Sector Employment Share Of Total Employment In Males", "", "EnergyUse");
        java.lang.String str4 = co2Fetcher3.getLabel();
        java.lang.String str5 = co2Fetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CO2" + "'", str4.equals("CO2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CO2" + "'", str5.equals("CO2"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("WbApi.WbApiModel$WbApiModelException: ", "", "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userDbModel1.changeUserUsername("MortalityRate", "GDP");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException2 = wbApiModel0.new WbApiModelException("");
        WbApi.WbApiModel.WbApiModelException wbApiModelException4 = wbApiModel0.new WbApiModelException("GDP");
        WbApi.WbApiModel.WbApiModelException wbApiModelException6 = wbApiModel0.new WbApiModelException("");
        java.lang.Throwable[] throwableArray7 = wbApiModelException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = wbApiModelException6.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("hi!", "Public Sector Employment Share Of Total Employment In Males", "HospitalBeds");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("HealthcareAccessProblems", "HealthcareAccessProblems", "ForestArea");
        java.lang.String str4 = gdpFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Analyzer.AverageForestArea averageForestArea3 = new Analyzer.AverageForestArea("hi!", "GDP", "");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = averageForestArea3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        WbApi.Request request4 = new WbApi.Request("GDP", "hi!", "Population", "HospitalBeds");
        java.lang.String str5 = request4.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "GDP" + "'", str5.equals("GDP"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userSingleTableDatabase2.getRecord("Public Sector Employment Share Of Total Employment In Females");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userDbModel1.changeUserUsername("UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata", "GDP");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("MortalityRate", jSONObject1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("WbApi.WbApiModel$WbApiModelException: ", "ForestArea", "EnergyUse");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("hi!", "hi!", "GDP");
        java.lang.String str4 = energyUseFetcher3.getStartYear();
        java.lang.String str5 = energyUseFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EnergyUse" + "'", str5.equals("EnergyUse"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Analyzer.AverageForestArea averageForestArea3 = new Analyzer.AverageForestArea("hi!", "GDP", "");
        java.lang.String str4 = averageForestArea3.getEndYear();
        averageForestArea3.setStartYear("");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult7 = averageForestArea3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userSingleTableDatabase2.getRecord("");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Fetchers.PublicSectorEmploymentShareMale publicSectorEmploymentShareMale3 = new Fetchers.PublicSectorEmploymentShareMale("", "", "hi!");
        publicSectorEmploymentShareMale3.setEndYear("hi!");
        java.lang.String str6 = publicSectorEmploymentShareMale3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Public Sector Employment Share Of Total Employment In Males" + "'", str6.equals("Public Sector Employment Share Of Total Employment In Males"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        WbApi.Request request4 = new WbApi.Request("Population", "GDP", "WbApi.WbApiModel$WbApiModelException: ", "HealthcareAccessProblems");
        java.lang.String str5 = request4.getYearTo();
        java.lang.String str6 = request4.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "HealthcareAccessProblems" + "'", str5.equals("HealthcareAccessProblems"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Population" + "'", str6.equals("Population"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Fetchers.PopulationFetcher populationFetcher3 = new Fetchers.PopulationFetcher("Public Sector Employment Share Of Total Employment In Females", "ForestArea", "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Fetchers.ForestAreaFetcher forestAreaFetcher3 = new Fetchers.ForestAreaFetcher("CO2", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata", "WbApi.WbApiModel$WbApiModelException: ");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        WbApi.Request request4 = new WbApi.Request("CO2", "HealthExpenditure", "CO2", "GDP");
        java.lang.String str5 = request4.getYearTo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "GDP" + "'", str5.equals("GDP"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Analyzer.Co2VsEnergyUseVsAirPollution co2VsEnergyUseVsAirPollution3 = new Analyzer.Co2VsEnergyUseVsAirPollution("EnergyUse", "GDP", "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("Public Sector Employment Share Of Total Employment In Females", jSONObject1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException2 = wbApiModel0.new WbApiModelException("");
        WbApi.WbApiModel.WbApiModelException wbApiModelException4 = wbApiModel0.new WbApiModelException("GDP");
        WbApi.WbApiModel.WbApiModelException wbApiModelException6 = wbApiModel0.new WbApiModelException("");
        WbApi.WbApiModel.WbApiModelException wbApiModelException8 = wbApiModel0.new WbApiModelException("CO2");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        com.alibaba.fastjson.JSONObject jSONObject4 = null;
        UserDb.JsonRecord jsonRecord5 = new UserDb.JsonRecord("GDP", jSONObject4);
        java.lang.String str6 = jsonRecord5.getKey();
        java.lang.Object obj8 = jsonRecord5.getCell("HealthcareAccessProblems");
        java.lang.String str9 = jsonRecord5.getKey();
        java.lang.Object obj11 = jsonRecord5.getCell("");
        UserDb.User user12 = new UserDb.User((UserDb.IRecord) jsonRecord5);
        Fetchers.MortalityRateFetcher mortalityRateFetcher16 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str17 = mortalityRateFetcher16.getLabel();
        boolean boolean18 = user12.equals((java.lang.Object) str17);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser19 = userSingleTableDatabase2.updateRecord((UserDb.IUser) user12);
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "GDP" + "'", str9.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "MortalityRate" + "'", str17.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Fetchers.PopulationFetcher populationFetcher3 = new Fetchers.PopulationFetcher("EnergyUse", "HealthcareAccessProblems", "HealthcareAccessProblems");
        java.lang.String str4 = populationFetcher3.getLabel();
        java.lang.String str5 = populationFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Population" + "'", str4.equals("Population"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Population" + "'", str5.equals("Population"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("HealthcareAccessProblems", "HealthcareAccessProblems", "ForestArea");
        gdpFetcher3.setCountry("Public Sector Employment Share Of Total Employment In Females");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("Public Sector Employment Share Of Total Employment In Males", "hi!", "ForestArea");
        publicSectorEmploymentShareFemale3.setCountry("MortalityRate");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        java.lang.String str6 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        java.lang.String str7 = healthCareAccessProblemsVsMortalityRate3.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult8 = healthCareAccessProblemsVsMortalityRate3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("ForestArea", "CO2", "HospitalBeds");
        java.lang.String str4 = healthCareAccessProblemsFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HealthcareAccessProblems" + "'", str4.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        com.alibaba.fastjson.JSONObject jSONObject4 = null;
        UserDb.JsonRecord jsonRecord5 = new UserDb.JsonRecord("GDP", jSONObject4);
        java.lang.String str6 = jsonRecord5.getKey();
        java.lang.Object obj8 = jsonRecord5.getCell("HealthcareAccessProblems");
        java.lang.String str9 = jsonRecord5.getKey();
        java.lang.Object obj11 = jsonRecord5.getCell("");
        UserDb.User user12 = new UserDb.User((UserDb.IRecord) jsonRecord5);
        java.lang.Object obj13 = user12.clone();
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser14 = userSingleTableDatabase2.updateRecord((UserDb.IUser) user12);
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "GDP" + "'", str9.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.getUserByUsername("WbApi.WbApiModel$WbApiModelException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getKeys()\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        WbApi.Request request4 = new WbApi.Request("HealthcareAccessProblems", "MortalityRate", "MortalityRate", "HealthcareAccessProblems");
        java.lang.String str5 = request4.getYearFrom();
        java.lang.String str6 = request4.getYearTo();
        java.lang.String str7 = request4.getIndicatorID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MortalityRate" + "'", str5.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HealthcareAccessProblems" + "'", str6.equals("HealthcareAccessProblems"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MortalityRate" + "'", str7.equals("MortalityRate"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Fetchers.PopulationFetcher populationFetcher3 = new Fetchers.PopulationFetcher("MortalityRate", "EnergyUse", "HospitalBeds");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Fetchers.ForestAreaFetcher forestAreaFetcher3 = new Fetchers.ForestAreaFetcher("Public Sector Employment Share Of Total Employment In Males", "WbApi.WbApiModel$WbApiModelException: ", "Public Sector Employment Share Of Total Employment In Females");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userDbModel1.changeUserPassword("Public Sector Employment Share Of Total Employment In Males", "GDP");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        WbApi.Request request4 = new WbApi.Request("Public Sector Employment Share Of Total Employment In Females", "WbApi.WbApiModel$WbApiModelException: ", "GDP", "HospitalBeds");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("HealthcareAccessProblems", "", "GDP");
        java.lang.String str4 = energyUseFetcher3.getCountry();
        java.lang.String str5 = energyUseFetcher3.getLabel();
        java.lang.String str6 = energyUseFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EnergyUse" + "'", str5.equals("EnergyUse"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "EnergyUse" + "'", str6.equals("EnergyUse"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Analyzer.Co2VsEnergyUseVsAirPollution co2VsEnergyUseVsAirPollution3 = new Analyzer.Co2VsEnergyUseVsAirPollution("Public Sector Employment Share Of Total Employment In Females", "ForestArea", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("HealthcareAccessProblems", "EnergyUse", "GDP");
        java.lang.Class<?> wildcardClass4 = healthCareAccessProblemsVsMortalityRate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("hi!", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("CO2", "Population", "Public Sector Employment Share Of Total Employment In Females");
        publicSectorEmploymentShareFemale3.setEndYear("EnergyUse");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("MortalityRate", "ForestArea", "MortalityRate");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.getUserByUsername("UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getKeys()\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("HealthcareAccessProblems", "HospitalBeds", "EnergyUse");
        energyUseFetcher3.setEndYear("GDP");
        java.lang.String str6 = energyUseFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "EnergyUse" + "'", str6.equals("EnergyUse"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Analyzer.AverageForestArea averageForestArea3 = new Analyzer.AverageForestArea("Population", "Public Sector Employment Share Of Total Employment In Females", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = averageForestArea3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Not a JSON Array: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("CO2", "Population", "Public Sector Employment Share Of Total Employment In Females");
        publicSectorEmploymentShareFemale3.setCountry("WbApi.WbApiModel$WbApiModelException: ");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("MortalityRate", "HospitalBeds", "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Fetchers.Co2Fetcher co2Fetcher3 = new Fetchers.Co2Fetcher("HealthcareAccessProblems", "ForestArea", "GDP");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        WbApi.Request request4 = new WbApi.Request("GDP", "hi!", "Population", "HospitalBeds");
        java.lang.String str5 = request4.getYearTo();
        java.lang.String str6 = request4.getYearFrom();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "HospitalBeds" + "'", str5.equals("HospitalBeds"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Population" + "'", str6.equals("Population"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        UserDb.LocalJsonTableDataSource.DbFileNotFoundException dbFileNotFoundException1 = new UserDb.LocalJsonTableDataSource.DbFileNotFoundException("GDP");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser5 = userDbModel3.getUserById("WbApi.WbApiModel$WbApiModelException: ");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("", "Population", "EnergyUse");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Fetchers.PublicSectorEmploymentShareMale publicSectorEmploymentShareMale3 = new Fetchers.PublicSectorEmploymentShareMale("", "EnergyUse", "Public Sector Employment Share Of Total Employment In Males");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Analyzer.EducationExpenditureVsHealthExpenditure educationExpenditureVsHealthExpenditure3 = new Analyzer.EducationExpenditureVsHealthExpenditure("EnergyUse", "ForestArea", "");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = educationExpenditureVsHealthExpenditure3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Fetchers.HealthExpenditureFetcher healthExpenditureFetcher3 = new Fetchers.HealthExpenditureFetcher("Public Sector Employment Share Of Total Employment In Females", "Public Sector Employment Share Of Total Employment In Males", "Public Sector Employment Share Of Total Employment In Females");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("HealthExpenditure", "HealthExpenditure", "Public Sector Employment Share Of Total Employment In Males");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("GDP", "HospitalBeds", "EnergyUse");
        java.lang.String str4 = healthCareAccessProblemsFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HealthcareAccessProblems" + "'", str4.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException2 = wbApiModel0.new WbApiModelException("");
        WbApi.WbApiModel.WbApiModelException wbApiModelException4 = wbApiModel0.new WbApiModelException("GDP");
        WbApi.WbApiModel.WbApiModelException wbApiModelException6 = wbApiModel0.new WbApiModelException("HealthExpenditure");
        WbApi.WbApiModel.WbApiModelException wbApiModelException8 = wbApiModel0.new WbApiModelException("Public Sector Employment Share Of Total Employment In Females");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Fetchers.PopulationFetcher populationFetcher3 = new Fetchers.PopulationFetcher("EnergyUse", "HealthcareAccessProblems", "Public Sector Employment Share Of Total Employment In Males");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Fetchers.PublicSectorEmploymentShareMale publicSectorEmploymentShareMale3 = new Fetchers.PublicSectorEmploymentShareMale("", "", "hi!");
        publicSectorEmploymentShareMale3.setEndYear("hi!");
        publicSectorEmploymentShareMale3.setEndYear("HealthExpenditure");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel4 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        com.alibaba.fastjson.JSONObject jSONObject6 = null;
        UserDb.JsonRecord jsonRecord7 = new UserDb.JsonRecord("GDP", jSONObject6);
        java.lang.String str8 = jsonRecord7.getKey();
        java.lang.Object obj10 = jsonRecord7.getCell("HealthcareAccessProblems");
        java.lang.String str11 = jsonRecord7.getKey();
        java.lang.Object obj13 = jsonRecord7.getCell("");
        UserDb.User user14 = new UserDb.User((UserDb.IRecord) jsonRecord7);
        Fetchers.MortalityRateFetcher mortalityRateFetcher18 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str19 = mortalityRateFetcher18.getLabel();
        boolean boolean20 = user14.equals((java.lang.Object) str19);
        user14.setUsername("CO2");
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser23 = userDbModel4.createUser((UserDb.IUser) user14);
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "GDP" + "'", str8.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "GDP" + "'", str11.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "MortalityRate" + "'", str19.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        UserDb.IUser iUser0 = null;
        UserDb.UserRecord userRecord1 = new UserDb.UserRecord(iUser0);
        java.lang.Object obj3 = userRecord1.getCell("EnergyUse");
        java.lang.Object obj5 = userRecord1.getCell("EnergyUse");
        java.lang.Object obj7 = userRecord1.getCell("ForestArea");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("", "", "hi!");
        java.lang.String str4 = healthCareAccessProblemsFetcher3.getLabel();
        healthCareAccessProblemsFetcher3.setEndYear("HospitalBeds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HealthcareAccessProblems" + "'", str4.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("HealthcareAccessProblems", "GDP", "HealthcareAccessProblems");
        healthExpenditureVsHospitalBeds3.setStartYear("hi!");
        healthExpenditureVsHospitalBeds3.setStartYear("Population");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult11 = healthExpenditureVsHospitalBeds3.recalculate("EnergyUse", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Fetchers.AirPollutionFetcher airPollutionFetcher3 = new Fetchers.AirPollutionFetcher("HealthcareAccessProblems", "", "EnergyUse");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Fetchers.MortalityRateFetcher mortalityRateFetcher3 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        mortalityRateFetcher3.setStartYear("");
        java.lang.String str6 = mortalityRateFetcher3.getLabel();
        java.lang.String str7 = mortalityRateFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MortalityRate" + "'", str6.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MortalityRate" + "'", str7.equals("MortalityRate"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Analyzer.AverageExpenditureOnEducation averageExpenditureOnEducation3 = new Analyzer.AverageExpenditureOnEducation("HealthExpenditure", "GDP", "HealthExpenditure");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel4 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser6 = userSingleTableDatabase2.getRecord("GDP");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("Public Sector Employment Share Of Total Employment In Males", "MortalityRate", "ForestArea");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Fetchers.EducationExpenditureFetcher educationExpenditureFetcher3 = new Fetchers.EducationExpenditureFetcher("HospitalBeds", "", "MortalityRate");
        java.lang.String str4 = educationExpenditureFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EducationExpenditure" + "'", str4.equals("EducationExpenditure"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Analyzer.PublicSectorEmploymentShareMaleVsFemale publicSectorEmploymentShareMaleVsFemale3 = new Analyzer.PublicSectorEmploymentShareMaleVsFemale("", "EnergyUse", "HealthcareAccessProblems");
        publicSectorEmploymentShareMaleVsFemale3.setStartYear("GDP");
        publicSectorEmploymentShareMaleVsFemale3.setEndYear("");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        healthCareAccessProblemsVsMortalityRate3.setCountry("UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata");
        healthCareAccessProblemsVsMortalityRate3.setCountry("EnergyUse");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("Population", "EnergyUse", "EnergyUse");
        healthExpenditureVsHospitalBeds3.setEndYear("HealthExpenditure");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Fetchers.Co2Fetcher co2Fetcher3 = new Fetchers.Co2Fetcher("HealthExpenditure", "GDP", "");
        co2Fetcher3.setCountry("Public Sector Employment Share Of Total Employment In Males");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Analyzer.AverageForestArea averageForestArea3 = new Analyzer.AverageForestArea("EnergyUse", "Population", "MortalityRate");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.Object obj5 = jsonRecord2.getCell("HealthcareAccessProblems");
        java.lang.String str6 = jsonRecord2.getKey();
        java.lang.Object obj8 = jsonRecord2.getCell("");
        UserDb.User user9 = new UserDb.User((UserDb.IRecord) jsonRecord2);
        java.lang.String str10 = user9.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "GDP" + "'", str10.equals("GDP"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Analyzer.PublicSectorEmploymentShareMaleVsFemale publicSectorEmploymentShareMaleVsFemale3 = new Analyzer.PublicSectorEmploymentShareMaleVsFemale("", "EducationExpenditure", "HealthExpenditure");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        com.alibaba.fastjson.JSONObject jSONObject5 = null;
        UserDb.JsonRecord jsonRecord6 = new UserDb.JsonRecord("GDP", jSONObject5);
        java.lang.String str7 = jsonRecord6.getKey();
        java.lang.Object obj9 = jsonRecord6.getCell("HealthcareAccessProblems");
        java.lang.String str10 = jsonRecord6.getKey();
        java.lang.Object obj12 = jsonRecord6.getCell("");
        UserDb.User user13 = new UserDb.User((UserDb.IRecord) jsonRecord6);
        Fetchers.MortalityRateFetcher mortalityRateFetcher17 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str18 = mortalityRateFetcher17.getLabel();
        boolean boolean19 = user13.equals((java.lang.Object) str18);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser20 = userSingleTableDatabase2.updateRecord((UserDb.IUser) user13);
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "GDP" + "'", str7.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "GDP" + "'", str10.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "MortalityRate" + "'", str18.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        java.lang.String str6 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        healthCareAccessProblemsVsMortalityRate3.setEndYear("hi!");
        healthCareAccessProblemsVsMortalityRate3.setCountry("ForestArea");
        java.lang.String str11 = healthCareAccessProblemsVsMortalityRate3.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult12 = healthCareAccessProblemsVsMortalityRate3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ForestArea" + "'", str11.equals("ForestArea"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("EnergyUse", "CO2", "HealthExpenditure");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Analyzer.Co2VsEnergyUseVsAirPollution co2VsEnergyUseVsAirPollution3 = new Analyzer.Co2VsEnergyUseVsAirPollution("GDP", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata", "Public Sector Employment Share Of Total Employment In Males");
        java.lang.String str4 = co2VsEnergyUseVsAirPollution3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Analyzer.EducationExpenditureVsHealthExpenditure educationExpenditureVsHealthExpenditure3 = new Analyzer.EducationExpenditureVsHealthExpenditure("EnergyUse", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = educationExpenditureVsHealthExpenditure3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Fetchers.EducationExpenditureFetcher educationExpenditureFetcher3 = new Fetchers.EducationExpenditureFetcher("HospitalBeds", "", "MortalityRate");
        educationExpenditureFetcher3.setStartYear("");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Fetchers.PublicSectorEmploymentShareMale publicSectorEmploymentShareMale3 = new Fetchers.PublicSectorEmploymentShareMale("", "", "hi!");
        java.lang.String str4 = publicSectorEmploymentShareMale3.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Fetchers.PublicSectorEmploymentShareFemale publicSectorEmploymentShareFemale3 = new Fetchers.PublicSectorEmploymentShareFemale("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Double> strMap4 = publicSectorEmploymentShareFemale3.getData();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Fetchers.PopulationFetcher populationFetcher3 = new Fetchers.PopulationFetcher("EnergyUse", "HealthcareAccessProblems", "HealthcareAccessProblems");
        java.lang.String str4 = populationFetcher3.getLabel();
        java.lang.String str5 = populationFetcher3.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Population" + "'", str4.equals("Population"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "HealthcareAccessProblems" + "'", str5.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("EducationExpenditure", "", "GDP");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Analyzer.PublicSectorEmploymentShareMaleVsFemale publicSectorEmploymentShareMaleVsFemale3 = new Analyzer.PublicSectorEmploymentShareMaleVsFemale("hi!", "HospitalBeds", "");
        publicSectorEmploymentShareMaleVsFemale3.setEndYear("hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>>();
        java.lang.String[] strArray1 = null;
        Analyzer.AnalysisResult analysisResult2 = new Analyzer.AnalysisResult(strMapList0, strArray1);
        java.util.Map<java.lang.String, java.lang.Double> strMap4 = analysisResult2.getValues((int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Double> strMap6 = analysisResult2.getValues((int) (short) 100);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList7 = analysisResult2.getData();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList8 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>>();
        java.lang.String[] strArray9 = null;
        Analyzer.AnalysisResult analysisResult10 = new Analyzer.AnalysisResult(strMapList8, strArray9);
        java.lang.String[] strArray11 = analysisResult10.getLabels();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList12 = analysisResult10.getData();
        com.alibaba.fastjson.JSONObject jSONObject14 = null;
        UserDb.JsonRecord jsonRecord15 = new UserDb.JsonRecord("GDP", jSONObject14);
        java.lang.String[] strArray16 = jsonRecord15.getColumns();
        Analyzer.AnalysisResult analysisResult17 = new Analyzer.AnalysisResult(strMapList12, strArray16);
        Analyzer.AnalysisResult analysisResult18 = new Analyzer.AnalysisResult(strMapList7, strArray16);
        java.util.Map<java.lang.String, java.lang.Double> strMap20 = analysisResult18.getValues(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMapList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMapList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException2 = wbApiModel0.new WbApiModelException("");
        WbApi.WbApiModel.WbApiModelException wbApiModelException4 = wbApiModel0.new WbApiModelException("GDP");
        WbApi.WbApiModel.WbApiModelException wbApiModelException6 = wbApiModel0.new WbApiModelException("HealthExpenditure");
        WbApi.Request request11 = new WbApi.Request("Population", "GDP", "WbApi.WbApiModel$WbApiModelException: ", "HealthcareAccessProblems");
        java.lang.String str12 = request11.getYearTo();
        // The following exception was thrown during execution in test generation
        try {
            WbApi.Response response13 = wbApiModel0.getData(request11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Not a JSON Array: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "HealthcareAccessProblems" + "'", str12.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException2 = wbApiModel0.new WbApiModelException("");
        UserDb.LocalJsonTableDataSource.InvalidRecordException invalidRecordException4 = new UserDb.LocalJsonTableDataSource.InvalidRecordException("Population");
        java.lang.Throwable[] throwableArray5 = invalidRecordException4.getSuppressed();
        wbApiModelException2.addSuppressed((java.lang.Throwable) invalidRecordException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        UserDb.IUser iUser0 = null;
        UserDb.UserRecord userRecord1 = new UserDb.UserRecord(iUser0);
        java.lang.String[] strArray2 = userRecord1.getColumns();
        java.lang.Object obj4 = userRecord1.getCell("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = userRecord1.getKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.IUser.getKey()\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("WbApi.WbApiModel$WbApiModelException: ", "MortalityRate", "HospitalBeds");
        java.lang.String str4 = healthCareAccessProblemsFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HealthcareAccessProblems" + "'", str4.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("", "", "hi!");
        healthCareAccessProblemsFetcher3.setStartYear("");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Analyzer.Co2VsEnergyUseVsAirPollution co2VsEnergyUseVsAirPollution3 = new Analyzer.Co2VsEnergyUseVsAirPollution("CO2", "HospitalBeds", "HospitalBeds");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>>();
        java.lang.String[] strArray1 = null;
        Analyzer.AnalysisResult analysisResult2 = new Analyzer.AnalysisResult(strMapList0, strArray1);
        java.util.Map<java.lang.String, java.lang.Double> strMap4 = analysisResult2.getValues((int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Double> strMap6 = analysisResult2.getValues((int) (short) 100);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList7 = analysisResult2.getData();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList8 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>>();
        java.lang.String[] strArray9 = null;
        Analyzer.AnalysisResult analysisResult10 = new Analyzer.AnalysisResult(strMapList8, strArray9);
        java.lang.String[] strArray11 = analysisResult10.getLabels();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList12 = analysisResult10.getData();
        com.alibaba.fastjson.JSONObject jSONObject14 = null;
        UserDb.JsonRecord jsonRecord15 = new UserDb.JsonRecord("GDP", jSONObject14);
        java.lang.String[] strArray16 = jsonRecord15.getColumns();
        Analyzer.AnalysisResult analysisResult17 = new Analyzer.AnalysisResult(strMapList12, strArray16);
        Analyzer.AnalysisResult analysisResult18 = new Analyzer.AnalysisResult(strMapList7, strArray16);
        java.lang.String[] strArray19 = analysisResult18.getLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMapList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMapList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Fetchers.MortalityRateFetcher mortalityRateFetcher3 = new Fetchers.MortalityRateFetcher("Population", "Public Sector Employment Share Of Total Employment In Males", "EnergyUse");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("HealthcareAccessProblems", "HealthcareAccessProblems", "HospitalBeds");
        java.lang.String str4 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HealthcareAccessProblems" + "'", str4.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        WbApi.Request request4 = new WbApi.Request("HealthcareAccessProblems", "MortalityRate", "MortalityRate", "HealthcareAccessProblems");
        java.lang.String str5 = request4.getCountry();
        java.lang.String str6 = request4.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "HealthcareAccessProblems" + "'", str5.equals("HealthcareAccessProblems"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HealthcareAccessProblems" + "'", str6.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.Object obj5 = jsonRecord2.getCell("HealthcareAccessProblems");
        java.lang.String str6 = jsonRecord2.getKey();
        java.lang.Object obj8 = jsonRecord2.getCell("");
        UserDb.User user9 = new UserDb.User((UserDb.IRecord) jsonRecord2);
        Fetchers.MortalityRateFetcher mortalityRateFetcher13 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str14 = mortalityRateFetcher13.getLabel();
        boolean boolean15 = user9.equals((java.lang.Object) str14);
        UserDb.UserRecord userRecord16 = new UserDb.UserRecord((UserDb.IUser) user9);
        Fetchers.PopulationFetcher populationFetcher20 = new Fetchers.PopulationFetcher("hi!", "", "hi!");
        java.lang.String str21 = populationFetcher20.getLabel();
        java.lang.String str22 = populationFetcher20.getLabel();
        populationFetcher20.setEndYear("EnergyUse");
        java.lang.String str25 = populationFetcher20.getStartYear();
        boolean boolean26 = user9.equals((java.lang.Object) str25);
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory28 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase29 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory28);
        boolean boolean30 = user9.equals((java.lang.Object) localJsonTableDataSourceFactory28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MortalityRate" + "'", str14.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Population" + "'", str21.equals("Population"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Population" + "'", str22.equals("Population"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException2 = wbApiModel0.new WbApiModelException("HealthcareAccessProblems");
        WbApi.Request request7 = new WbApi.Request("Population", "GDP", "WbApi.WbApiModel$WbApiModelException: ", "HealthcareAccessProblems");
        // The following exception was thrown during execution in test generation
        try {
            WbApi.Response response8 = wbApiModel0.getData(request7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Not a JSON Array: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>>();
        java.lang.String[] strArray1 = null;
        Analyzer.AnalysisResult analysisResult2 = new Analyzer.AnalysisResult(strMapList0, strArray1);
        java.lang.String[] strArray3 = analysisResult2.getLabels();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList4 = analysisResult2.getData();
        com.alibaba.fastjson.JSONObject jSONObject6 = null;
        UserDb.JsonRecord jsonRecord7 = new UserDb.JsonRecord("GDP", jSONObject6);
        java.lang.String[] strArray8 = jsonRecord7.getColumns();
        Analyzer.AnalysisResult analysisResult9 = new Analyzer.AnalysisResult(strMapList4, strArray8);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList10 = analysisResult9.getData();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList11 = analysisResult9.getData();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList12 = analysisResult9.getData();
        java.lang.String[] strArray13 = analysisResult9.getLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMapList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMapList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMapList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMapList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.Request request5 = new WbApi.Request("HealthcareAccessProblems", "MortalityRate", "MortalityRate", "HealthcareAccessProblems");
        java.lang.String str6 = request5.getIndicatorID();
        java.lang.String str7 = request5.getYearFrom();
        java.lang.String str8 = request5.getIndicatorID();
        WbApi.Response response9 = wbApiModel0.getData(request5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MortalityRate" + "'", str6.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MortalityRate" + "'", str7.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MortalityRate" + "'", str8.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("Public Sector Employment Share Of Total Employment In Males", jSONObject1);
        UserDb.User user3 = new UserDb.User((UserDb.IRecord) jsonRecord2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        WbApi.WbApiModel wbApiModel0 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException2 = wbApiModel0.new WbApiModelException("");
        WbApi.WbApiModel wbApiModel3 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException5 = wbApiModel3.new WbApiModelException("");
        WbApi.WbApiModel.WbApiModelException wbApiModelException7 = wbApiModel3.new WbApiModelException("GDP");
        wbApiModelException2.addSuppressed((java.lang.Throwable) wbApiModelException7);
        WbApi.WbApiModel wbApiModel9 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException11 = wbApiModel9.new WbApiModelException("");
        WbApi.WbApiModel.WbApiModelException wbApiModelException13 = wbApiModel9.new WbApiModelException("GDP");
        WbApi.WbApiModel.WbApiModelException wbApiModelException15 = wbApiModel9.new WbApiModelException("");
        java.lang.Throwable[] throwableArray16 = wbApiModelException15.getSuppressed();
        wbApiModelException2.addSuppressed((java.lang.Throwable) wbApiModelException15);
        java.lang.Throwable[] throwableArray18 = wbApiModelException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        UserDb.LocalJsonTableDataSource.DbFileNotFoundException dbFileNotFoundException1 = new UserDb.LocalJsonTableDataSource.DbFileNotFoundException("WbApi.WbApiModel$WbApiModelException: ");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Analyzer.EducationExpenditureVsHealthExpenditure educationExpenditureVsHealthExpenditure3 = new Analyzer.EducationExpenditureVsHealthExpenditure("WbApi.WbApiModel$WbApiModelException: ", "hi!", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("Population", "", "GDP");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Analyzer.PublicSectorEmploymentShareMaleVsFemale publicSectorEmploymentShareMaleVsFemale3 = new Analyzer.PublicSectorEmploymentShareMaleVsFemale("Public Sector Employment Share Of Total Employment In Females", "EnergyUse", "Public Sector Employment Share Of Total Employment In Males");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Fetchers.HealthExpenditureFetcher healthExpenditureFetcher3 = new Fetchers.HealthExpenditureFetcher("Public Sector Employment Share Of Total Employment In Males", "Public Sector Employment Share Of Total Employment In Females", "EducationExpenditure");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("HealthcareAccessProblems", "GDP", "HealthcareAccessProblems");
        healthExpenditureVsHospitalBeds3.setStartYear("hi!");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult6 = healthExpenditureVsHospitalBeds3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Fetchers.EducationExpenditureFetcher educationExpenditureFetcher3 = new Fetchers.EducationExpenditureFetcher("GDP", "HealthcareAccessProblems", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("HealthExpenditure", "EnergyUse", "UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("MortalityRate", "", "hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>>();
        java.lang.String[] strArray1 = null;
        Analyzer.AnalysisResult analysisResult2 = new Analyzer.AnalysisResult(strMapList0, strArray1);
        java.util.Map<java.lang.String, java.lang.Double> strMap4 = analysisResult2.getValues((int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Double> strMap6 = analysisResult2.getValues((int) (short) 100);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList7 = analysisResult2.getData();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList8 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>>();
        java.lang.String[] strArray9 = null;
        Analyzer.AnalysisResult analysisResult10 = new Analyzer.AnalysisResult(strMapList8, strArray9);
        java.lang.String[] strArray11 = analysisResult10.getLabels();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList12 = analysisResult10.getData();
        com.alibaba.fastjson.JSONObject jSONObject14 = null;
        UserDb.JsonRecord jsonRecord15 = new UserDb.JsonRecord("GDP", jSONObject14);
        java.lang.String[] strArray16 = jsonRecord15.getColumns();
        Analyzer.AnalysisResult analysisResult17 = new Analyzer.AnalysisResult(strMapList12, strArray16);
        Analyzer.AnalysisResult analysisResult18 = new Analyzer.AnalysisResult(strMapList7, strArray16);
        java.util.Map<java.lang.String, java.lang.Double> strMap20 = analysisResult18.getValues((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMapList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMapList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Fetchers.EducationExpenditureFetcher educationExpenditureFetcher3 = new Fetchers.EducationExpenditureFetcher("HealthcareAccessProblems", "EducationExpenditure", "HealthExpenditure");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        UserDb.LocalJsonTableDataSource.UnexpectedStructureException unexpectedStructureException0 = new UserDb.LocalJsonTableDataSource.UnexpectedStructureException();
        java.lang.Throwable[] throwableArray1 = unexpectedStructureException0.getSuppressed();
        java.lang.String str2 = unexpectedStructureException0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "UserDb.LocalJsonTableDataSource$UnexpectedStructureException: TableDataSource exception: The structure of the JSON table is unexpected. Expected values to follow the columns defined in the metadata" + "'", str2.equals("UserDb.LocalJsonTableDataSource$UnexpectedStructureException: TableDataSource exception: The structure of the JSON table is unexpected. Expected values to follow the columns defined in the metadata"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        // The following exception was thrown during execution in test generation
        try {
            WbApi.Response response1 = new WbApi.Response("WbApi.WbApiModel$WbApiModelException: ");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException; message: com.google.gson.stream.MalformedJsonException: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 38 path $");
        } catch (com.google.gson.JsonSyntaxException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("", "hi!", "");
        java.lang.String str4 = gdpFetcher3.getLabel();
        java.lang.String str5 = gdpFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "GDP" + "'", str5.equals("GDP"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        WbApi.Request request4 = new WbApi.Request("HealthcareAccessProblems", "MortalityRate", "MortalityRate", "HealthcareAccessProblems");
        java.lang.String str5 = request4.getYearFrom();
        java.lang.String str6 = request4.getYearTo();
        java.lang.String str7 = request4.getYearTo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MortalityRate" + "'", str5.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HealthcareAccessProblems" + "'", str6.equals("HealthcareAccessProblems"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HealthcareAccessProblems" + "'", str7.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Analyzer.Co2VsEnergyUseVsAirPollution co2VsEnergyUseVsAirPollution3 = new Analyzer.Co2VsEnergyUseVsAirPollution("EnergyUse", "GDP", "Public Sector Employment Share Of Total Employment In Females");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.Object obj5 = jsonRecord2.getCell("HealthcareAccessProblems");
        java.lang.String str6 = jsonRecord2.getKey();
        java.lang.Object obj8 = jsonRecord2.getCell("");
        UserDb.User user9 = new UserDb.User((UserDb.IRecord) jsonRecord2);
        Fetchers.MortalityRateFetcher mortalityRateFetcher13 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str14 = mortalityRateFetcher13.getLabel();
        boolean boolean15 = user9.equals((java.lang.Object) str14);
        java.lang.String str16 = user9.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MortalityRate" + "'", str14.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("HealthcareAccessProblems", "GDP", "HealthcareAccessProblems");
        healthExpenditureVsHospitalBeds3.setStartYear("hi!");
        healthExpenditureVsHospitalBeds3.setStartYear("Population");
        java.lang.String str8 = healthExpenditureVsHospitalBeds3.getEndYear();
        java.lang.String str9 = healthExpenditureVsHospitalBeds3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "GDP" + "'", str8.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "GDP" + "'", str9.equals("GDP"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.Object obj5 = jsonRecord2.getCell("HealthcareAccessProblems");
        java.lang.String str6 = jsonRecord2.getKey();
        java.lang.Object obj8 = jsonRecord2.getCell("");
        UserDb.User user9 = new UserDb.User((UserDb.IRecord) jsonRecord2);
        Fetchers.MortalityRateFetcher mortalityRateFetcher13 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str14 = mortalityRateFetcher13.getLabel();
        boolean boolean15 = user9.equals((java.lang.Object) str14);
        UserDb.UserRecord userRecord16 = new UserDb.UserRecord((UserDb.IUser) user9);
        java.lang.String str17 = user9.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MortalityRate" + "'", str14.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Double>>();
        java.lang.String[] strArray1 = null;
        Analyzer.AnalysisResult analysisResult2 = new Analyzer.AnalysisResult(strMapList0, strArray1);
        java.util.Map<java.lang.String, java.lang.Double> strMap4 = analysisResult2.getValues((int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Double> strMap6 = analysisResult2.getValues((int) (short) 100);
        java.lang.String[] strArray7 = analysisResult2.getLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Fetchers.AirPollutionFetcher airPollutionFetcher3 = new Fetchers.AirPollutionFetcher("HealthcareAccessProblems", "HealthcareAccessProblems", "WbApi.WbApiModel$WbApiModelException: ");
        java.lang.String str4 = airPollutionFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AirPollution" + "'", str4.equals("AirPollution"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Fetchers.HospitalBedsFetcher hospitalBedsFetcher3 = new Fetchers.HospitalBedsFetcher("hi!", "GDP", "EnergyUse");
        java.lang.String str4 = hospitalBedsFetcher3.getLabel();
        hospitalBedsFetcher3.setCountry("");
        java.lang.String str7 = hospitalBedsFetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HospitalBeds" + "'", str4.equals("HospitalBeds"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Fetchers.PublicSectorEmploymentShareMale publicSectorEmploymentShareMale3 = new Fetchers.PublicSectorEmploymentShareMale("Population", "EnergyUse", "ForestArea");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("HospitalBeds", "MortalityRate", "WbApi.WbApiModel$WbApiModelException: ");
        java.lang.String str4 = gdpFetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MortalityRate" + "'", str4.equals("MortalityRate"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        java.lang.String str6 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        healthCareAccessProblemsVsMortalityRate3.setStartYear("HealthcareAccessProblems");
        healthCareAccessProblemsVsMortalityRate3.setStartYear("");
        java.lang.String str11 = healthCareAccessProblemsVsMortalityRate3.getCountry();
        healthCareAccessProblemsVsMortalityRate3.setEndYear("Public Sector Employment Share Of Total Employment In Females");
        healthCareAccessProblemsVsMortalityRate3.setCountry("Public Sector Employment Share Of Total Employment In Males");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Fetchers.PopulationFetcher populationFetcher3 = new Fetchers.PopulationFetcher("GDP", "CO2", "ForestArea");
        java.lang.String str4 = populationFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Population" + "'", str4.equals("Population"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        UserDb.LocalJsonTableDataSource.DbFileNotFoundException dbFileNotFoundException1 = new UserDb.LocalJsonTableDataSource.DbFileNotFoundException("hi!");
        WbApi.WbApiModel wbApiModel2 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException4 = wbApiModel2.new WbApiModelException("");
        WbApi.WbApiModel wbApiModel5 = new WbApi.WbApiModel();
        WbApi.WbApiModel.WbApiModelException wbApiModelException7 = wbApiModel5.new WbApiModelException("");
        WbApi.WbApiModel.WbApiModelException wbApiModelException9 = wbApiModel5.new WbApiModelException("GDP");
        wbApiModelException4.addSuppressed((java.lang.Throwable) wbApiModelException9);
        dbFileNotFoundException1.addSuppressed((java.lang.Throwable) wbApiModelException4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Fetchers.EducationExpenditureFetcher educationExpenditureFetcher3 = new Fetchers.EducationExpenditureFetcher("EducationExpenditure", "ForestArea", "GDP");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.Object obj5 = jsonRecord2.getCell("HealthcareAccessProblems");
        java.lang.String str6 = jsonRecord2.getKey();
        java.lang.Object obj8 = jsonRecord2.getCell("");
        UserDb.User user9 = new UserDb.User((UserDb.IRecord) jsonRecord2);
        UserDb.UserRecord userRecord10 = new UserDb.UserRecord((UserDb.IUser) user9);
        user9.setPassword("Population");
        java.lang.String str13 = user9.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Population" + "'", str13.equals("Population"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Fetchers.HealthExpenditureFetcher healthExpenditureFetcher3 = new Fetchers.HealthExpenditureFetcher("MortalityRate", "CO2", "AirPollution");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Fetchers.HealthExpenditureFetcher healthExpenditureFetcher3 = new Fetchers.HealthExpenditureFetcher("HospitalBeds", "GDP", "MortalityRate");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Fetchers.EnergyUseFetcher energyUseFetcher3 = new Fetchers.EnergyUseFetcher("HealthcareAccessProblems", "", "GDP");
        java.lang.String str4 = energyUseFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EnergyUse" + "'", str4.equals("EnergyUse"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("EnergyUse", jSONObject1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        WbApi.Request request4 = new WbApi.Request("Population", "GDP", "WbApi.WbApiModel$WbApiModelException: ", "HealthcareAccessProblems");
        java.lang.String str5 = request4.getYearTo();
        java.lang.String str6 = request4.getYearTo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "HealthcareAccessProblems" + "'", str5.equals("HealthcareAccessProblems"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HealthcareAccessProblems" + "'", str6.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.getUserById("MortalityRate");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.Object obj4 = jsonRecord2.getCell("ForestArea");
        java.lang.String str5 = jsonRecord2.getKey();
        java.lang.Object obj7 = jsonRecord2.getCell("Population");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "GDP" + "'", str5.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("WbApi.WbApiModel$WbApiModelException: ", "MortalityRate", "HospitalBeds");
        healthCareAccessProblemsFetcher3.setEndYear("HealthcareAccessProblems");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("hi!", "CO2", "Public Sector Employment Share Of Total Employment In Males");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            WbApi.Response response1 = new WbApi.Response("HealthExpenditure");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Not a JSON Array: \"HealthExpenditure\"");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("HealthcareAccessProblems", "", "");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult4 = healthExpenditureVsHospitalBeds3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.Object obj5 = jsonRecord2.getCell("HealthcareAccessProblems");
        java.lang.String str6 = jsonRecord2.getKey();
        java.lang.Object obj8 = jsonRecord2.getCell("");
        UserDb.User user9 = new UserDb.User((UserDb.IRecord) jsonRecord2);
        Fetchers.MortalityRateFetcher mortalityRateFetcher13 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str14 = mortalityRateFetcher13.getLabel();
        boolean boolean15 = user9.equals((java.lang.Object) str14);
        Analyzer.AverageExpenditureOnEducation averageExpenditureOnEducation19 = new Analyzer.AverageExpenditureOnEducation("ForestArea", "HealthExpenditure", "HealthExpenditure");
        boolean boolean20 = user9.equals((java.lang.Object) "ForestArea");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MortalityRate" + "'", str14.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        UserDb.LocalJsonTableDataSource.InvalidRecordException invalidRecordException1 = new UserDb.LocalJsonTableDataSource.InvalidRecordException("WbApi.WbApiModel$WbApiModelException: ");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("CO2", "CO2", "hi!");
        java.lang.String str4 = healthExpenditureVsHospitalBeds3.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("GDP", "HealthExpenditure", "WbApi.WbApiModel$WbApiModelException: ");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        java.lang.String str6 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        healthCareAccessProblemsVsMortalityRate3.setStartYear("hi!");
        healthCareAccessProblemsVsMortalityRate3.setCountry("HealthcareAccessProblems");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("HealthcareAccessProblems");
        java.lang.String str13 = healthCareAccessProblemsVsMortalityRate3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "HealthcareAccessProblems" + "'", str13.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userDbModel1.changeUserUsername("UserDb.LocalJsonTableDataSource$UnexpectedStructureException: TableDataSource exception: The structure of the JSON table is unexpected. Expected values to follow the columns defined in the metadata", "HealthcareAccessProblems");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.getUserById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.getRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        UserDb.ISingleTableDatabase<UserDb.IUser> iUserISingleTableDatabase0 = null;
        UserDb.UserDbModel userDbModel1 = new UserDb.UserDbModel(iUserISingleTableDatabase0);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser3 = userDbModel1.deleteUser("CO2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"UserDb.ISingleTableDatabase.removeRecord(String)\" because \"this.db\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        java.lang.String str6 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        healthCareAccessProblemsVsMortalityRate3.setStartYear("hi!");
        healthCareAccessProblemsVsMortalityRate3.setCountry("HealthcareAccessProblems");
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult11 = healthCareAccessProblemsVsMortalityRate3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel4 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel5 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser8 = userDbModel5.changeUserPassword("WbApi.WbApiModel$WbApiModelException: ", "CO2");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Fetchers.HealthExpenditureFetcher healthExpenditureFetcher3 = new Fetchers.HealthExpenditureFetcher("Population", "HospitalBeds", "HealthExpenditure");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.Object obj5 = jsonRecord2.getCell("HealthcareAccessProblems");
        java.lang.String str6 = jsonRecord2.getKey();
        java.lang.Object obj8 = jsonRecord2.getCell("");
        UserDb.User user9 = new UserDb.User((UserDb.IRecord) jsonRecord2);
        UserDb.UserRecord userRecord10 = new UserDb.UserRecord((UserDb.IUser) user9);
        user9.setPassword("Population");
        com.alibaba.fastjson.JSONObject jSONObject14 = null;
        UserDb.JsonRecord jsonRecord15 = new UserDb.JsonRecord("GDP", jSONObject14);
        java.lang.String str16 = jsonRecord15.getKey();
        java.lang.Object obj18 = jsonRecord15.getCell("HealthcareAccessProblems");
        java.lang.String str19 = jsonRecord15.getKey();
        java.lang.Object obj21 = jsonRecord15.getCell("");
        UserDb.User user22 = new UserDb.User((UserDb.IRecord) jsonRecord15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = user9.equals((java.lang.Object) user22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.equals(Object)\" because \"this.username\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "GDP" + "'", str16.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "GDP" + "'", str19.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Analyzer.PublicSectorEmploymentShareMaleVsFemale publicSectorEmploymentShareMaleVsFemale3 = new Analyzer.PublicSectorEmploymentShareMaleVsFemale("hi!", "MortalityRate", "HealthExpenditure");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.Object obj5 = jsonRecord2.getCell("HealthcareAccessProblems");
        java.lang.String str6 = jsonRecord2.getKey();
        java.lang.Object obj8 = jsonRecord2.getCell("");
        UserDb.User user9 = new UserDb.User((UserDb.IRecord) jsonRecord2);
        Fetchers.MortalityRateFetcher mortalityRateFetcher13 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str14 = mortalityRateFetcher13.getLabel();
        boolean boolean15 = user9.equals((java.lang.Object) str14);
        UserDb.UserRecord userRecord16 = new UserDb.UserRecord((UserDb.IUser) user9);
        user9.setUsername("WbApi.WbApiModel$WbApiModelException: ");
        java.lang.String str19 = user9.getKey();
        user9.setUsername("EnergyUse");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MortalityRate" + "'", str14.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "GDP" + "'", str19.equals("GDP"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Fetchers.PopulationFetcher populationFetcher3 = new Fetchers.PopulationFetcher("", "", "GDP");
        java.lang.String str4 = populationFetcher3.getLabel();
        populationFetcher3.setStartYear("Population");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Population" + "'", str4.equals("Population"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        WbApi.Request request4 = new WbApi.Request("UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata", "EducationExpenditure", "HospitalBeds", "WbApi.WbApiModel$WbApiModelException: ");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser5 = userDbModel3.deleteUser("HospitalBeds");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Fetchers.EducationExpenditureFetcher educationExpenditureFetcher3 = new Fetchers.EducationExpenditureFetcher("GDP", "MortalityRate", "EnergyUse");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel4 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser7 = userDbModel4.changeUserPassword("UserDb.LocalJsonTableDataSource$NoColumnsException: TableDataSource exception: No columns detected in the metadata", "EducationExpenditure");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        UserDb.LocalJsonTableDataSource.InvalidRecordException invalidRecordException1 = new UserDb.LocalJsonTableDataSource.InvalidRecordException("ForestArea");
        java.lang.Throwable[] throwableArray2 = invalidRecordException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Fetchers.Co2Fetcher co2Fetcher3 = new Fetchers.Co2Fetcher("HealthExpenditure", "GDP", "");
        java.lang.String str4 = co2Fetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CO2" + "'", str4.equals("CO2"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        UserDb.IUser iUser0 = null;
        UserDb.UserRecord userRecord1 = new UserDb.UserRecord(iUser0);
        java.lang.String[] strArray2 = userRecord1.getColumns();
        java.lang.Object obj4 = userRecord1.getCell("Public Sector Employment Share Of Total Employment In Males");
        java.lang.String[] strArray5 = userRecord1.getColumns();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel4 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        com.alibaba.fastjson.JSONObject jSONObject6 = null;
        UserDb.JsonRecord jsonRecord7 = new UserDb.JsonRecord("GDP", jSONObject6);
        java.lang.String str8 = jsonRecord7.getKey();
        java.lang.Object obj10 = jsonRecord7.getCell("HealthcareAccessProblems");
        java.lang.String str11 = jsonRecord7.getKey();
        java.lang.Object obj13 = jsonRecord7.getCell("");
        UserDb.User user14 = new UserDb.User((UserDb.IRecord) jsonRecord7);
        Fetchers.MortalityRateFetcher mortalityRateFetcher18 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str19 = mortalityRateFetcher18.getLabel();
        boolean boolean20 = user14.equals((java.lang.Object) str19);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser21 = userSingleTableDatabase2.createRecord((UserDb.IUser) user14);
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "GDP" + "'", str8.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "GDP" + "'", str11.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "MortalityRate" + "'", str19.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserSingleTableDatabase userSingleTableDatabase3 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.Object obj5 = jsonRecord2.getCell("HealthcareAccessProblems");
        java.lang.String str6 = jsonRecord2.getKey();
        java.lang.Object obj8 = jsonRecord2.getCell("");
        UserDb.User user9 = new UserDb.User((UserDb.IRecord) jsonRecord2);
        Fetchers.MortalityRateFetcher mortalityRateFetcher13 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str14 = mortalityRateFetcher13.getLabel();
        boolean boolean15 = user9.equals((java.lang.Object) str14);
        WbApi.Request request20 = new WbApi.Request("HealthcareAccessProblems", "MortalityRate", "MortalityRate", "HealthcareAccessProblems");
        java.lang.String str21 = request20.getCountry();
        java.lang.String str22 = request20.getIndicatorID();
        boolean boolean23 = user9.equals((java.lang.Object) request20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MortalityRate" + "'", str14.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "HealthcareAccessProblems" + "'", str21.equals("HealthcareAccessProblems"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "MortalityRate" + "'", str22.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel4 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel5 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser7 = userDbModel5.getUserByUsername("AirPollution");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Fetchers.ForestAreaFetcher forestAreaFetcher3 = new Fetchers.ForestAreaFetcher("", "HealthcareAccessProblems", "HealthcareAccessProblems");
        java.lang.String str4 = forestAreaFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ForestArea" + "'", str4.equals("ForestArea"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Fetchers.PublicSectorEmploymentShareMale publicSectorEmploymentShareMale3 = new Fetchers.PublicSectorEmploymentShareMale("HealthExpenditure", "Public Sector Employment Share Of Total Employment In Females", "Public Sector Employment Share Of Total Employment In Males");
        java.lang.String str4 = publicSectorEmploymentShareMale3.getLabel();
        java.lang.String str5 = publicSectorEmploymentShareMale3.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Public Sector Employment Share Of Total Employment In Males" + "'", str4.equals("Public Sector Employment Share Of Total Employment In Males"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Public Sector Employment Share Of Total Employment In Males" + "'", str5.equals("Public Sector Employment Share Of Total Employment In Males"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Analyzer.PublicSectorEmploymentShareMaleVsFemale publicSectorEmploymentShareMaleVsFemale3 = new Analyzer.PublicSectorEmploymentShareMaleVsFemale("", "EnergyUse", "HealthcareAccessProblems");
        java.lang.String str4 = publicSectorEmploymentShareMaleVsFemale3.getCountry();
        java.lang.String str5 = publicSectorEmploymentShareMaleVsFemale3.getEndYear();
        // The following exception was thrown during execution in test generation
        try {
            Analyzer.AnalysisResult analysisResult6 = publicSectorEmploymentShareMaleVsFemale3.recalculate();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HealthcareAccessProblems" + "'", str4.equals("HealthcareAccessProblems"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EnergyUse" + "'", str5.equals("EnergyUse"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Analyzer.HealthExpenditureVsHospitalBeds healthExpenditureVsHospitalBeds3 = new Analyzer.HealthExpenditureVsHospitalBeds("HealthcareAccessProblems", "GDP", "HealthcareAccessProblems");
        healthExpenditureVsHospitalBeds3.setStartYear("hi!");
        healthExpenditureVsHospitalBeds3.setStartYear("Population");
        java.lang.String str8 = healthExpenditureVsHospitalBeds3.getEndYear();
        healthExpenditureVsHospitalBeds3.setCountry("");
        healthExpenditureVsHospitalBeds3.setEndYear("EducationExpenditure");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "GDP" + "'", str8.equals("GDP"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Fetchers.PublicSectorEmploymentShareMale publicSectorEmploymentShareMale3 = new Fetchers.PublicSectorEmploymentShareMale("Public Sector Employment Share Of Total Employment In Males", "ForestArea", "");
        java.lang.String str4 = publicSectorEmploymentShareMale3.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Fetchers.ForestAreaFetcher forestAreaFetcher3 = new Fetchers.ForestAreaFetcher("GDP", "HospitalBeds", "HospitalBeds");
        java.lang.String str4 = forestAreaFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ForestArea" + "'", str4.equals("ForestArea"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.alibaba.fastjson.JSONObject jSONObject1 = null;
        UserDb.JsonRecord jsonRecord2 = new UserDb.JsonRecord("GDP", jSONObject1);
        java.lang.String str3 = jsonRecord2.getKey();
        java.lang.Object obj5 = jsonRecord2.getCell("HealthcareAccessProblems");
        java.lang.String str6 = jsonRecord2.getKey();
        java.lang.Object obj8 = jsonRecord2.getCell("");
        UserDb.User user9 = new UserDb.User((UserDb.IRecord) jsonRecord2);
        UserDb.UserRecord userRecord10 = new UserDb.UserRecord((UserDb.IUser) user9);
        UserDb.UserRecord userRecord11 = new UserDb.UserRecord((UserDb.IUser) user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GDP" + "'", str3.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "GDP" + "'", str6.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        UserDb.LocalJsonTableDataSource.InvalidRecordException invalidRecordException1 = new UserDb.LocalJsonTableDataSource.InvalidRecordException("Population");
        java.lang.Throwable[] throwableArray2 = invalidRecordException1.getSuppressed();
        java.lang.String str3 = invalidRecordException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UserDb.LocalJsonTableDataSource$InvalidRecordException: TableDataSource exception: Invalid record encountered: Population" + "'", str3.equals("UserDb.LocalJsonTableDataSource$InvalidRecordException: TableDataSource exception: Invalid record encountered: Population"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        // The following exception was thrown during execution in test generation
        try {
            UserDb.LocalJsonTableDataSource localJsonTableDataSource1 = new UserDb.LocalJsonTableDataSource("HealthExpenditure");
            org.junit.Assert.fail("Expected exception of type UserDb.LocalJsonTableDataSource.DbFileNotFoundException; message: TableDataSource exception: Specified JSON db file does not exist: HealthExpenditure");
        } catch (UserDb.LocalJsonTableDataSource.DbFileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("Public Sector Employment Share Of Total Employment In Males");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser4 = userSingleTableDatabase2.removeRecord("EnergyUse");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: Public Sector Employment Share Of Total Employment In Males");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Analyzer.Co2VsGdpPerCap co2VsGdpPerCap3 = new Analyzer.Co2VsGdpPerCap("hi!", "HealthcareAccessProblems", "hi!");
        co2VsGdpPerCap3.setEndYear("WbApi.WbApiModel$WbApiModelException: ");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Fetchers.AirPollutionFetcher airPollutionFetcher3 = new Fetchers.AirPollutionFetcher("EnergyUse", "Public Sector Employment Share Of Total Employment In Males", "GDP");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Fetchers.Co2Fetcher co2Fetcher3 = new Fetchers.Co2Fetcher("HealthExpenditure", "UserDb.LocalJsonTableDataSource$InvalidRecordException: TableDataSource exception: Invalid record encountered: Population", "ForestArea");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser5 = userDbModel3.deleteUser("");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        UserDb.LocalJsonTableDataSource.DbFileNotFoundException dbFileNotFoundException1 = new UserDb.LocalJsonTableDataSource.DbFileNotFoundException("Public Sector Employment Share Of Total Employment In Females");
        java.lang.String str2 = dbFileNotFoundException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "UserDb.LocalJsonTableDataSource$DbFileNotFoundException: TableDataSource exception: Specified JSON db file does not exist: Public Sector Employment Share Of Total Employment In Females" + "'", str2.equals("UserDb.LocalJsonTableDataSource$DbFileNotFoundException: TableDataSource exception: Specified JSON db file does not exist: Public Sector Employment Share Of Total Employment In Females"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        java.lang.String str6 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        healthCareAccessProblemsVsMortalityRate3.setStartYear("HealthcareAccessProblems");
        healthCareAccessProblemsVsMortalityRate3.setStartYear("Public Sector Employment Share Of Total Employment In Females");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel4 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel5 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        com.alibaba.fastjson.JSONObject jSONObject7 = null;
        UserDb.JsonRecord jsonRecord8 = new UserDb.JsonRecord("GDP", jSONObject7);
        java.lang.String str9 = jsonRecord8.getKey();
        java.lang.Object obj11 = jsonRecord8.getCell("HealthcareAccessProblems");
        java.lang.String str12 = jsonRecord8.getKey();
        java.lang.Object obj14 = jsonRecord8.getCell("");
        UserDb.User user15 = new UserDb.User((UserDb.IRecord) jsonRecord8);
        Fetchers.MortalityRateFetcher mortalityRateFetcher19 = new Fetchers.MortalityRateFetcher("GDP", "GDP", "hi!");
        java.lang.String str20 = mortalityRateFetcher19.getLabel();
        boolean boolean21 = user15.equals((java.lang.Object) str20);
        user15.setUsername("CO2");
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser24 = userSingleTableDatabase2.createRecord((UserDb.IUser) user15);
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "GDP" + "'", str9.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "GDP" + "'", str12.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "MortalityRate" + "'", str20.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        Analyzer.HealthCareAccessProblemsVsMortalityRate healthCareAccessProblemsVsMortalityRate3 = new Analyzer.HealthCareAccessProblemsVsMortalityRate("hi!", "", "");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("");
        java.lang.String str6 = healthCareAccessProblemsVsMortalityRate3.getStartYear();
        healthCareAccessProblemsVsMortalityRate3.setStartYear("HealthcareAccessProblems");
        healthCareAccessProblemsVsMortalityRate3.setCountry("");
        healthCareAccessProblemsVsMortalityRate3.setEndYear("GDP");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        UserDb.IUser iUser0 = null;
        UserDb.UserRecord userRecord1 = new UserDb.UserRecord(iUser0);
        java.lang.Object obj3 = userRecord1.getCell("ForestArea");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Fetchers.HospitalBedsFetcher hospitalBedsFetcher3 = new Fetchers.HospitalBedsFetcher("EnergyUse", "GDP", "HealthcareAccessProblems");
        java.lang.String str4 = hospitalBedsFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HospitalBeds" + "'", str4.equals("HospitalBeds"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        UserDb.LocalJsonTableDataSource.DbFileNotFoundException dbFileNotFoundException1 = new UserDb.LocalJsonTableDataSource.DbFileNotFoundException("");
        java.lang.String str2 = dbFileNotFoundException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "UserDb.LocalJsonTableDataSource$DbFileNotFoundException: TableDataSource exception: Specified JSON db file does not exist: " + "'", str2.equals("UserDb.LocalJsonTableDataSource$DbFileNotFoundException: TableDataSource exception: Specified JSON db file does not exist: "));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Fetchers.GdpFetcher gdpFetcher3 = new Fetchers.GdpFetcher("hi!", "GDP", "");
        java.lang.String str4 = gdpFetcher3.getLabel();
        java.lang.String str5 = gdpFetcher3.getLabel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "GDP" + "'", str4.equals("GDP"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "GDP" + "'", str5.equals("GDP"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Fetchers.HealthCareAccessProblemsFetcher healthCareAccessProblemsFetcher3 = new Fetchers.HealthCareAccessProblemsFetcher("Public Sector Employment Share Of Total Employment In Females", "AirPollution", "WbApi.WbApiModel$WbApiModelException: ");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        WbApi.Request request4 = new WbApi.Request("HealthcareAccessProblems", "MortalityRate", "MortalityRate", "HealthcareAccessProblems");
        java.lang.String str5 = request4.getIndicatorID();
        java.lang.String str6 = request4.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MortalityRate" + "'", str5.equals("MortalityRate"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HealthcareAccessProblems" + "'", str6.equals("HealthcareAccessProblems"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        UserDb.LocalJsonTableDataSource.DbFileNotFoundException dbFileNotFoundException1 = new UserDb.LocalJsonTableDataSource.DbFileNotFoundException("CO2");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        Fetchers.HealthExpenditureFetcher healthExpenditureFetcher3 = new Fetchers.HealthExpenditureFetcher("EnergyUse", "HospitalBeds", "Public Sector Employment Share Of Total Employment In Males");
        java.lang.String str4 = healthExpenditureFetcher3.getLabel();
        java.lang.String str5 = healthExpenditureFetcher3.getLabel();
        java.lang.String str6 = healthExpenditureFetcher3.getCountry();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HealthExpenditure" + "'", str4.equals("HealthExpenditure"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "HealthExpenditure" + "'", str5.equals("HealthExpenditure"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Public Sector Employment Share Of Total Employment In Males" + "'", str6.equals("Public Sector Employment Share Of Total Employment In Males"));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        UserDb.LocalJsonTableDataSourceFactory localJsonTableDataSourceFactory1 = new UserDb.LocalJsonTableDataSourceFactory("EnergyUse");
        UserDb.UserSingleTableDatabase userSingleTableDatabase2 = new UserDb.UserSingleTableDatabase((UserDb.ITableDataSourceFactory) localJsonTableDataSourceFactory1);
        UserDb.UserDbModel userDbModel3 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel4 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        UserDb.UserDbModel userDbModel5 = new UserDb.UserDbModel((UserDb.ISingleTableDatabase<UserDb.IUser>) userSingleTableDatabase2);
        // The following exception was thrown during execution in test generation
        try {
            UserDb.IUser iUser7 = userDbModel5.deleteUser("Public Sector Employment Share Of Total Employment In Females");
            org.junit.Assert.fail("Expected exception of type UserDb.ISingleTableDatabase.DatabaseException; message: Database exception: Data source exception: TableDataSource exception: Specified JSON db file does not exist: EnergyUse");
        } catch (UserDb.ISingleTableDatabase.DatabaseException e) {
        // Expected exception.
        }
    }
}

