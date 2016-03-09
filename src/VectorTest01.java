import java.util.Vector;

public class VectorTest01 {
	// 1,2 Collection Framework가 나오기 전
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		vector.addElement("둘리");
		vector.addElement("고길동");
		vector.addElement("마이콜");
		
		vector.removeElementAt(2);
		for(int i=0; i<vector.size(); i++){
			String s = vector.elementAt(i);
			System.out.println(s);
		}
		
		// ------------------
		Vector v = new Vector();
		System.out.println("Size="+v.size()+" Capacity="+v.capacity());

		for( int i=0; i<10; i++ ) {
		    v.addElement(new Integer(i)); //중요!
		}
		System.out.println("Size="+v.size()+" Capacity="+v.capacity());

		Integer i0 = (Integer)v.elementAt(0); //중요!
////		int i1 = (Integer)v.elementAt(10).intValue();
//		System.out.println(i1);
//
		v.removeElement(i0);
//		v.removeElement(1);
		System.out.println(v);

	}

}
