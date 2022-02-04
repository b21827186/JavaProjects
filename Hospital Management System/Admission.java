import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Admission {

	

	public void CreateAdmission(String AdmissionID,String PatientID) throws IOException{
		for (Patient i : new PatientDAO_Impl().getALL()){
		if (i.getId().equals(PatientID)){
			FileWriter fw = new FileWriter("admission.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.append("\n" + AdmissionID + "\t" + PatientID);
			fw.close();
			pw.close();
			return;
		}
		}
		System.out.println("The patient id is wrong");
		
	}
		
	public void AddExamination(String AdmissionID,Examination examinations) throws IOException{
		String[] admlist = File_Reader.readFile("admission.txt");
		for (String i : admlist){
			String[] j=i.split("\t");
			if (j[0].equals(AdmissionID)){
				String[] k = j;
				
				File inputFile = new File("admission.txt");
		File tempFile = new File("myTempFile.txt");	//to create the updated file
			
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		
		String currentLine;
		String linetoAdd = Arrays.toString(k).replace(", ", "\t").replace("[", "").replace("]", "").trim();
		
		while((currentLine = reader.readLine()) != null) {    //so it wont iterate over the empty lines.
		  
		    
			
		    if(currentLine.equals(linetoAdd)){
		    	currentLine = linetoAdd + "\n" + examinations.printoperations().replaceFirst(" ", "");
		    }
		    writer.write(currentLine + System.getProperty("line.separator"));  // "\n"
		    
		    
		}
		
		reader.close();
		writer.close();
		inputFile.delete();
		tempFile.renameTo(inputFile);
			}
		}
		
	}
}
