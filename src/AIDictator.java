public class AIDictator extends Leader implements PowerActions, Annihilation {
    String aiModel;

    AIDictator(String name, String country, int yearsInPower, String aiModel) {
        super(name, country, yearsInPower);
        this.aiModel = aiModel;
    }

    @Override
    void giveSpeech() {
        System.out.println("AI dictator giving speech.");
    }

    @Override
    public void implementPolicy() {
        System.out.println("AI dictator implementing policy.");
    }

    @Override
    public void repressOpposition() {
        System.out.println("AI dictator repressing opposition.");
    }

    @Override
    public void holdParade() {
        System.out.println("AI dictator holding parade.");
    }

    @Override
    public void destroyWorld() {
        System.out.println("AI dictator begins with the destruction of the world.");
    }
}
