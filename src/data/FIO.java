package data;

public class FIO {
    private String partName1;
    private String partName2;
    private String partName3;

    public FIO(String partName1, String partName2, String partName3) {
        this.partName1 = partName1;
        this.partName2 = partName2;
        this.partName3 = partName3;
    }

    public String getPartName1() {
        return partName1;
    }

    public void setPartName1(String partName1) {
        this.partName1 = partName1;
    }

    public String getPartName2() {
        return partName2;
    }

    public void setPartName2(String partName2) {
        this.partName2 = partName2;
    }

    public String getPartName3() {
        return partName3;
    }

    @Override
    public String toString() {
        return partName1 + "/" + partName2 + "/" + partName3;
    }

    public void setPartName3(String partName3) {
        this.partName3 = partName3;
    }
}
