package td2.Fichier;

public class FSFactoryImp implements FSFactory{
    private final static FSFactory instance = new FSFactoryImp();

    @Override
    public Composant createComposant(ComposantType type, String name, Owner owner) {
        Composant composant = null;
        switch(type){
            case FICHIER :
                composant = new Fichier(name, owner);
                break;
            case REPERTOIRE :
                composant = new Repertoire(name, owner);
                break;
            default :
                throw new IllegalStateException("Unexpected value: " + type);
        } return composant;
    }

    public static FSFactory getInstance() {
        return instance;
    }


}
