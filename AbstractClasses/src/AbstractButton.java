public abstract class AbstractButton extends MoreAbstractButton implements IComponentClickListener {
    public static final String TAG = "Button";

    String componentName;

    //w klasach abstrakcyjnych MOZEMY pisac zwykle metody (z funkcjonalnoscia - cialem)
    String getComponentName() {
        return componentName;
    }

    abstract void click();

    //NIE TRZEBA implementowac metod abstrakcyjnych z interfejsow badz innych klas abstrakcyjnych
//    @Override
//    public void onClick() {
//
//    }

//    @Override
//    public void veryAbstractMethod() {
//
//    }
}
