import java.io.IOException;
import java.util.List;

public interface PatientDAO {
	
	Patient getByID(String ID);
	Object deleteByID(String ID) throws IOException;
	void add(Patient patient) throws IOException;
	List<Patient> getALL();
	
}
