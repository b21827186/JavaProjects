
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class PatientDAO_Impl implements PatientDAO {
	String[] patientfile =File_Reader.readFile("patient.txt");
	
	//database
	List<Patient> patients;
	
	public PatientDAO_Impl() {
		patients = new ArrayList<Patient>();
		for (String i : patientfile){
			String[] j=i.split("\t");
			String [] k = j[1].split(" ");
			Patient pat = new Patient(j[0], k[0] ,k[1] , j[2], j[3]);
			patients.add(pat);
		}
	}


	public Patient getByID(String ID) {
		for (Patient patient : getALL()){
			if(ID.equals(patient.getId())){
				return patient;
			}
		}
		return null;
	}

	
	public Object deleteByID(String ID) throws IOException {      //done
		for (Iterator<Patient> iterator = patients.iterator(); iterator.hasNext(); ) {
			 Patient value = iterator.next();
			 	if (value.getId().equals(ID)){
			 		iterator.remove();
			 	}
			}
		for (String i : patientfile){
			String[] j=i.split("\t");
			if (j[0].equals(ID)){
				WritetoFile.DeleteLine("patient.txt", Arrays.toString(j).replace(", ", "\t").replace("[", "").replace("]", ""));
			}
		}
		
		
		return null;
	}


	public void add(Patient patient) throws IOException {
		patients.add(patient);
		FileWriter fw = new FileWriter("patient.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		pw.append(patient.getId() + "\t" + patient.getName() + " " + patient.getSurname() + "\t" + patient.getPhone_number() + "\t" + "Address:" +patient.getAddress()+System.getProperty("line.separator"));
		fw.close();
		pw.close();
	
	}

	
	public List<Patient> getALL() {
		return patients;
	}

}
