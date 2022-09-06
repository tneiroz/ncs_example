package sampleTest;

public class Test_07 {
	public static void main(String[] args) {
		Member member = new Member(1, "박정은" , "1234" , "jungeun@example.com");
		System.out.println(member);
		
		System.out.println("==========비밀번호 일치 여부 =============");
		boolean result1 = member.confirmPassword("4321");
		boolean result2 = member.confirmPassword("1234");	
		
		System.out.println(result1 ? "비밀번호 일치" : "비밀번호 불일치");
		System.out.println(result2 ? "비밀번호 일치" : "비밀번호 불일치");
	}
}
