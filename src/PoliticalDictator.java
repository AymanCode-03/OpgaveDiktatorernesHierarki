public class PoliticalDictator extends Leader implements PowerActions {
    private String partyName;

    PoliticalDictator(String name, String country, int yearsInPower, String partyName) {
        super(name, country, yearsInPower);
        this.partyName = partyName;
    }

    @Override
    void giveSpeech() {
        System.out.println("Political dictator giving speech.");
    }

    @Override
    public void implementPolicy() {
        System.out.println("Political dictator implementing policy.");
    }

    @Override
    public void repressOpposition() {
        System.out.println("Political dictator repressing opposition.");
    }

    @Override
    public void holdParade() {
        System.out.println("Political dictator holding parade.");
    }
}
