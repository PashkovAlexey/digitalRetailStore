package it;

public abstract class IT {

    private String itSystemName;
    private String itSystemPurpose;

    public IT() {
    }

    public IT(String itSystemName, String itSystemPurpose) {
        this.itSystemName = itSystemName;
        this.itSystemPurpose = itSystemPurpose;
    }

    public void itSystemUpgrade() {
        System.out.println("Установлено обновление");
    }

    public String getItSystemName() {
        return itSystemName;
    }

    public void setItSystemName(String itSystemName) {
        this.itSystemName = itSystemName;
    }

    public String getItSystemPurpose() {
        return itSystemPurpose;
    }

    public void setItSystemPurpose(String itSystemPurpose) {
        this.itSystemPurpose = itSystemPurpose;
    }

}
