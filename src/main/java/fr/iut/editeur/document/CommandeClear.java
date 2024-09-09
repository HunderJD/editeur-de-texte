package fr.iut.editeur.document;

import fr.iut.editeur.commande.Commande;
import fr.iut.editeur.commande.CommandeDocument;

public class CommandeClear extends CommandeDocument {


           public CommandeClear(Document document, String[] parameters) {
               super(document, parameters);

           }



               @Override
               public void executer() {




                   this.document.clear();
                   super.executer();


               }




}
