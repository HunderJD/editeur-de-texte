package fr.iut.editeur.document;

import java.util.Locale;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }


    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String sousTexte = this.texte.substring(debut, fin);
        String texteMaj = sousTexte.toUpperCase();
        remplacer(debut, fin, texteMaj);

    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void clear() {
        this.texte = "";
    }

    public void inserer(int debut, String texte) {
        remplacer(debut, texte.length(), texte);
    }

}
