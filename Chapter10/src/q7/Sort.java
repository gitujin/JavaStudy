package q7;

public interface Sort {
	public void ascending(int[] arr);
	public void descending(int[] arr);
	
	default void description(){
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�");
	}
}
