package exception;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  {
			for (int i = 0; i <= 15; i++){
				System.out.println("i= "+i);
			}
		}
		catch (NullPointerException e){
			System.out.println("erro: " + e);
		}
	}
}
