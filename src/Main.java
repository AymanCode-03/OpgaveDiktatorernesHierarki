import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Leader> leaders = createLeaders();
        runSimulation(leaders);
    }

    private static ArrayList<Leader> createLeaders() {
        ArrayList<Leader> leaders = new ArrayList<>();

        leaders.add(new MilitarDictator("John Doe", "USA", 5, "Sergeant"));
        leaders.add(new PoliticalDictator("Jane Smith", "Canada", 3, "Liberal Party"));
        leaders.add(new MilitarDictator("Bob Johnson", "UK", 7, "Colonel"));
        leaders.add(new AIDictator("AI Leader", "Global", 10, "GPT-4"));

        return leaders;
    }

    private static void runSimulation(ArrayList<Leader> leaders) {
        for (Leader leader : leaders) {
            processLeader(leader);
            System.out.println();
        }
    }

    private static void processLeader(Leader leader) {
        leader.giveSpeech();
        leader.printDetails();

        if (leader instanceof PowerActions powerActions) {
            powerActions.implementPolicy();
            powerActions.repressOpposition();
            powerActions.holdParade();
        }

        if (leader instanceof Annihilation annihilation) {
            annihilation.destroyWorld();
        }
    }
}



