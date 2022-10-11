package td2.Fichier;

import java.util.List;

public interface Composite<C> {
    void addChild(Composant composant);
    void removeChild(Composant composant);
    void getChildren(List<Composant> composantList);
    void removeChildren(List<Composant> composantList);
}
