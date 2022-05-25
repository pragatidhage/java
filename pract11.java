import java.beans.*;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

class pract11{
    private final string name="simplton";
    private int size;

    public string getname(){
        return this.name;
    }
    public string setname(string name){
       this.name=name;
    }
    public string getsize(){
        return this.size;
    }
    public string setsize(int size){
       this.size=size;
    }

    public static void main(string [] args) throws IntrospectionException{
        BeanInfo info = IntroSpector.getBeanInfo(pract11.class);
        for(PropertyDescriptor pd = info.getPropertyDesciptor()){
        system.out.println(pd.getname());
        }
    }

    
}

