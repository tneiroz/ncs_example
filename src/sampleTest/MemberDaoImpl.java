package sampleTest;

public class MemberDaoImpl implements MemberDao {

	@Override
	public void findAll() {
		System.out.println("모든회원 찾기");
	}

	@Override
	public void findById(int id) {
		System.out.println(id+"번 회원을 찾습니다.");
	}

	@Override
	public void findByName(String name) {
		System.out.println(name + "회원 찾습니다.");
	}

	@Override
	public void save(Member member) {
		System.out.println("회원번호 : " + member.id);
		System.out.println("이름 : " + member.name);
		System.out.println("💙회원 가입 완료💙");
	}
	@Override
	public void update(Member member) {
		System.out.println("회원번호 : " + member.id);
		System.out.println("이름 : " + member.name);
		System.out.println("회원 정보 수정");
	}

}
