package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Server.MemberDTO;

public class DAOCenter implements DAOInterface {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
//	private MemberDAO memDAO = null;
//	private ManagementDAO mgmtDAO = null;
//	private CartDAO cartDAO = null;
	private static DAOCenter DAOcenter;
	private String[] check = null;
	//private DAOCenter dc = new DAOCenter();
	private String mm="";
	public DAOCenter() {
		connect();
		if (conn != null) {
//			memDAO = MemberDAO.getInstance(conn);
//			mgmtDAO = ManagementDAO.getInstance(conn);
//			cartDAO = CartDAO.getInstance(conn);
		}
	}

	public static DAOCenter getInstance() {
		if (DAOcenter == null) {
			DAOcenter = new DAOCenter();
		}
		return DAOcenter;
	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class load fail :" + e.getMessage());
		}
	}

	private void connect() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Class load fail : " + e.getMessage());
		}
	}

//	public void whichone(Object objectMember, object m) {
//		System.out.println("디에이오센터에 오신걸 환영합니다.");
//		String mm = String.valueOf(m);
//		if (mm.equals("join")) {
//			MemberDAO dao = MemberDAO.getInstance();
//			dao.InsertMember(objectMember);
//			System.out.println("왔다");
//		}
	
	public void whichone(Object objectMember) {
		System.out.println("디에이오센터에 오신걸 환영합니다.");
		 check = (String[]) objectMember;
	      for (int i = 0; i < check.length; i++) {
	    	  mm= check[check.length - 1];
	         if (check.equals("login")) { // 로그인 체크
	            System.out.println(check[i]);
	            System.out.println("이건 로그인 : " + check[check.length - 1]);
	         } else if (check[check.length - 1].equals("join")) { // 회원가입 체크
	          //  System.out.println(check[i]);
	            System.out.println("이건회원가입 : " + check[check.length - 1]);
	           Insert(check, mm);
	        	System.out.println("왔다");
	            break;
	         } else if (check[check.length - 1].equals("check")) { // 회원가입 체크
	            System.out.println(check[i]);
	            System.out.println("이건중복체크지롱  : " + check[check.length - 1]);
	         }
	

	       }

		
//		switch (mm) {
//
//		case "member":
//			
//			break;
//		case "goods":
//			break;
//		case "cart":
//			break;
//		case "order":
//			break;
//		}

	}

		@Override
		public Boolean Insert(Object objectMember,String mm) {
			switch (mm) {
			case "join":
				System.out.println("여기 왔다");
				MemberDAO dao = MemberDAO.getInstance();
				dao.Insert(objectMember);
				break;
			case "goods":
				break;
			case "cart":
				break;
			case "order":
				break;
			}
			return true;
		}
//		MemberDTO member = new MemberDTO();
//		for (int i = 0; i < check.length; i++) {
//			System.out.println("왔다");
//			member.setId(check[0]);
//			member.setName(check[1]);
//			member.setPwd(check[2]);
//			member.setAdr(check[3]);
//			member.setCell(check[4]);
//		}
//		return true;
//		
//	}
//		String[] check = (String[]) DTO;
//		MemberDTO member = new MemberDTO();
//		for (int i = 0; i < check.length; i++) {
//			member.setId(check[0]);
//			member.setName(check[1]);
//			member.setPwd(check[2]);
//			member.setAdr(check[3]);
//			member.setCell(check[4]);
//		}
//		MemberDAO dao = MemberDAO.getInstance();
//		dao.InsertMember(DTO);
//		return true;
//	}

	@Override
	public Boolean Select(Object objectMember,String mm) {
		switch (mm) {
		case "join":
			System.out.println("Select 왔니??");
			MemberDAO dao = MemberDAO.getInstance();
			dao.Insert(objectMember);
			break;
		case "goods":
			break;
		case "cart":
			break;
		case "order":
			break;
		}
		return null;
	}

	@Override
	public Boolean Edit(Object objectMember,String mm) {
		// TODO Auto-generated method stub
		switch (mm) {
		case "join":
			System.out.println("Edit 어디쯤 왔니??");
			MemberDAO dao = MemberDAO.getInstance();
			dao.Insert(objectMember);
			break;
		case "goods":
			break;
		case "cart":
			break;
		case "order":
			break;
		}

		return null;
	}

	@Override
	public Boolean Delete(Object objectMember,String mm) {
		// TODO Auto-generated method stub
		switch (mm) {
		case "join":
			System.out.println("Delete 여기 있었니?");
			MemberDAO dao = MemberDAO.getInstance();
			dao.Insert(objectMember);
			break;
		case "goods":
			break;
		case "cart":
			break;
		case "order":
			break;
		}
		return null;
	}


}
