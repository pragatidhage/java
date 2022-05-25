import mypack.FaceBean;
public class FaceBean_test {
public static void main(String args[])
	{
		FaceBean s = new FaceBean(); // object is created
		s.setMouthWidth(20); // setting value to the object
        s.addPropertyChangeListener(e ->{if("mMouthWidth".equals(e.getPropertyName()));});
		System.out.println("MouthWidth is:="+s.getMouthWidth());
	}
}
