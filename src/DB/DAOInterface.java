package DB;

public interface DAOInterface {
	
	Boolean Insert(Object objectMember, String mm);
	Boolean Delete(Object objectMember, String mm);
	Boolean Select(Object objectMember, String mm);
	Boolean Edit(Object objectMember, String mm);
	

}

