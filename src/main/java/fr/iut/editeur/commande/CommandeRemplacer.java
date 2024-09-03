package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;debut;fin;chaine");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

}
