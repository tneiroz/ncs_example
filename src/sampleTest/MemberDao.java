package sampleTest;

public interface MemberDao {

	void findAll();

	void findById(int id);

	void findByName(String name);

	void save(Member member);

	void update(Member member);

}
