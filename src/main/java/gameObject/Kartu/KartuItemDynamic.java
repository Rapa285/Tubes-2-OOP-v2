package gameObject.Kartu;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class KartuItemDynamic extends KartuItem{
    // private attributes
    private Map<String, Map<String, Method>> specificTypeMethods = new HashMap<>();

    // public methods
    public KartuItemDynamic(String nama, String kategori, String imagePath) {
        super(nama, kategori, imagePath);
    }

    public void addSpecificTypeMethod(String cardType, String methodName, Method method) {
        Map<String, Method> temp = new HashMap<String, Method>();
        temp.putIfAbsent(methodName, method);
        this.specificTypeMethods.putIfAbsent(cardType, temp);
    }

    public Object invokeMethod(String cardType, String methodName, Object... args) throws Exception {
        Map<String, Method> methods = this.specificTypeMethods.get(cardType);
        if (methods != null) {
            Method method = methods.get(methodName);
            if (method != null) {
                return method.invoke(this, args);
            }
        }
        throw new NoSuchMethodException("No method found with name: " + methodName + " for card type: " + cardType);
    }

    public void goodEffect() {

    }

    public void badEffect() {

    }

}
