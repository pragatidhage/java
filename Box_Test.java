import mypack.Box;
public class Box_Test {
public static void main(String args[])
	{
		Box a = new Box(); 
		a.setDepth(30); 
        a.setHeight(25);
        a.setWidth(100);
		System.out.println("Depth of box is := "+a.getDepth());
        System.out.println("Height of box is := "+a.getHeight());
        System.out.println("Width of box is := "+a.getWidth());
	}
}
