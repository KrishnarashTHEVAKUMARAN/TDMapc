package td2.client;

import td2.Fichier.*;
import td2.Forum.Forum;
import td2.Forum.Message;
import td2.Forum.Salon;
import td2.Forum.Theme;

public class App {

    public static void main(String[] args) {
        /*Exercice 2 Systeme Fichier*/
        FSFactory fsFactory = FSFactoryImp.getInstance();
        Owner owner1 = new Owner("Sarah");
        Composant f1 = fsFactory.createComposant(ComposantType.FICHIER, "Fichier 1", owner1);
        Composant r1 = fsFactory.createComposant(ComposantType.REPERTOIRE, "Repertoire 1", owner1);
        ((Composite<Composant>)r1).addChild(f1);
        f1.appendContent("Hello World\n");
        f1.appendContent("How are you doing?");
        System.out.println("-------------------------");
        System.out.println("Exercice 2 Systeme Fichier");
        System.out.println(r1);
        System.out.println(f1);
        System.out.println("-------------------------");

        /*Exercice 2 Systeme Forum*/
        Forum forum = new Forum("Programmation orientee objet");
        Theme theme1 = new Theme("Constructeurs");
        Theme theme2 = new Theme("Design patterns");
        Salon salon1 = new Salon("Heritage");
        Salon salon2 = new Salon("Composition");
        Salon salon3 = new Salon("Pattern Composite");
        Message message1 = new Message("J'ai un probleme", "voila, j'ai essaye ...");
        Message message2 = new Message("Au secours","ca marche pas ...");
        Message message3 = new Message("Difference ?", "quelle est la difference entre l'aggregation et la composition ");
        Message message4 = new Message("Question","quand utilise-t-on le pattern composite ?");
        forum.add(theme1);
        forum.add(theme2);
        theme1.add(salon1);
        theme1.add(salon2);
        theme2.add(salon3);
        salon1.add(message1);
        salon1.add(message2);
        salon2.add(message3);
        salon3.add(message4);
        System.out.println("Exercice 2 Systeme Forum \n");
        System.out.println(forum.toString());
    }
}

