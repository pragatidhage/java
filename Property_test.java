import mypack.Property;
public class Property_test {
public static void main(String args[])
	{   
		Property s = new Property(); // object is created
		s.setMouthWidth(20) ;// setting value to the object
        s.addPropertyChangeListener(e ->{if("mMouthWidth".equals(e.getPropertyName()));});
        s.addVetoableChangeListener(e ->{if("mMouthWidth".equals(e.getPropertyName()));});
		System.out.println(s.getMouthWidth());
	}
}
