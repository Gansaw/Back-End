package innerClass;

interface Messenger {
	String getMessage();

	void setMessage(String msg);
}

//class GalaxyMessenger implements Messenger {
//	public String getMessage() {
//		return "galaxy";
//	}
//
//	public void setMessage(String msg) {
//		System.out.println("my data : " + msg);
//	}
//
//	public void changeKeyboard() {
//		System.out.println("changed");
//	}
//
//}

public class 익명클래스 {
	public static void main(String[] args) {
//		GalaxyMessenger galaxy = new GalaxyMessenger();
		Messenger galaxy = new Messenger() {
				public String getMessage() {
				return "galaxy";
			}
		
			public void setMessage(String msg) {
				System.out.println("my data : " + msg);
			}
		
//			public void changeKeyboard() {
//				System.out.println("changed");
//			}
						
		};
		galaxy.getMessage();
		galaxy.setMessage("Hong");
//		galaxy.changeKeyboard();
	}
	
}

