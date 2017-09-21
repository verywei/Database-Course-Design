package contacts;

import org.apache.ibatis.annotations.Delete;

public interface PeopleOperation {
	public People selectById(String id);

	public void addPeople(People people);

	public void updatePeople(People people);

	public void deletePeople(String id);
}
