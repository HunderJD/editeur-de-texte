package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {


    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void commandeExecuter() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;chaine");
            return;
        }


        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);


        this.document.effacer(debut, fin);
    }


}
