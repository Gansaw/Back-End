package chapter10;

import java.util.HashSet;
import java.util.Iterator;

class User {
	String ssn;
	String sname;

	public User(String ssn, String sname) {
		this.ssn = ssn;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return ssn + ":" + sname;
	}
	
	public int hashCode() {
		return Integer.parseInt(ssn);
	}
	
	@Override
	public boolean equals(Object obj) {
		User u = (User)obj;
		if(this.ssn.equals(u.ssn)) {
			return true;
		}else {
			return false;
		}
	}

}

public class Test11 {

	public static void main(String[] args) {

		User u1 = new User("123", "홍길동");
		User u2 = new User("124", "홍길순");
		HashSet<User> users = new HashSet<>();
		if (u1.equals(u2)) {
			users.add(u2);
		} else {
			users.add(u1);
		}
		Iterator<User> iter = users.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());			

		}
	}

}
