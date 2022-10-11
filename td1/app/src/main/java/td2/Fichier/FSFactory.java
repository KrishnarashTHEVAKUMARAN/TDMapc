package td2.Fichier;

public interface FSFactory {
    Composant createComposant(ComposantType type, String name, Owner owner);

}
