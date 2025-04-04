package ntu.example.usingrecyclerview;

public class LandScape {
    String landImageFileName    ;
    String LandCation;

    public LandScape(String landImageFileName, String landCation) {
        this.landImageFileName = landImageFileName;
        LandCation = landCation;
    }

    public String getLandCation() {
        return LandCation;
    }

    public void setLandCation(String landCation) {
        LandCation = landCation;
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }
}
