public class MilitarDictator extends Leader implements PowerActions {
    private String militaryRank;

    MilitarDictator(String name, String country, int yearsInPower, String militaryRank) {
        super(name, country, yearsInPower);
        this.militaryRank = militaryRank;
    }

    @Override
    void giveSpeech() {
        System.out.println("Militar dictator giving speech.");
    }

    @Override
    public void implementPolicy() {
        System.out.println("Militar dictator implementing policy.");
    }

    @Override
    public void repressOpposition() {
        System.out.println("Militar dictator repressing opposition.");
    }

    @Override
    public void holdParade() {
        System.out.println("Militar dictator holding parade.");
    }

}
