//03.10(1)

//public class Box<T,P,Q>  // 갯수 제한 X!
public class Box<T> {	
	private T object;

	public Box(){ }
	
	public Box(T object) {
		super();
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	
}
