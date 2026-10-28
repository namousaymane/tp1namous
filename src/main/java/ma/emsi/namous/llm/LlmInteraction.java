package ma.emsi.namous.llm;

public record LlmInteraction(
        String questionJson,
        String reponseJson,
        String reponseExtraite
) {
}