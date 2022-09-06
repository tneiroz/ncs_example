package sampleTest;

public class Test_06 {
	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		Member member = new Member(100,"박정은");
		dao.findAll();
		System.out.println("====================");
		dao.findById(10);
		System.out.println("====================");
		dao.findByName("이감자");
		System.out.println("====================");
		dao.save(member);
		System.out.println("====================");
		dao.update(member);
	}
}
