
package ma.emsi.namous.service;

import jakarta.enterprise.context.Dependent;
import java.io.Serializable;

@Dependent
public class GenerateurReponse implements Serializable {

    public String genererReponse(String question, int nombreMystere, int essais) {
        try {
            int nombre = Integer.parseInt(question.trim());

            if (nombre < 1 || nombre > 20) {
                return "Entre un nombre entre 1 et 20.";
            }

            if (nombre < nombreMystere) {
                return "Trop petit ! Essaie encore.";
            }

            if (nombre > nombreMystere) {
                return "Trop grand ! Essaie encore.";
            }

            return "Bravo ! Tu as trouvé le nombre en " + essais + " essai(s).";

        } catch (NumberFormatException e) {
            return "Entre un nombre valide entre 1 et 20.";
        }
    }
}
