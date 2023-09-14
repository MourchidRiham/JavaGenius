import java.util.List;

public class SystèmeDeSécurité {
    private List<AgentDeSécurité> agents;

    public SystèmeDeSécurité(List<AgentDeSécurité> agents) {
        this.agents = agents;
    }

    public void ajouterAgent(AgentDeSécurité agent) {
        agents.add(agent);
    }

    // ... autres méthodes pour gérer la surveillance, les incidents, etc.
}

