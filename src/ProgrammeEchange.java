import java.util.List ;
public interface ProgrammeEchange {
    void participerProgrammeEchange(String programme);
    void annulerParticipationProgramme(String programme);
    List<String> getProgrammesEchangeParticipes();
}
