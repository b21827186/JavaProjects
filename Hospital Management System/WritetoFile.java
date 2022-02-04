import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class WritetoFile {

	public static void DeleteLine(String file ,String linetoRemove) throws IOException {
		File inputFile = new File(file);
		File tempFile = new File("myTempFile.txt");	//to create the updated file
			
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		
		String currentLine;
		
		while((currentLine = reader.readLine()) != null) {    //so it wont iterate over the empty lines.
		  
		    
			
		    if(currentLine.equals(linetoRemove)) continue;
		    writer.write(currentLine + System.getProperty("line.separator"));  // "\n"
		    
		    
		}
		
		
		reader.close();
		writer.close();
		inputFile.delete();
		tempFile.renameTo(inputFile);
	}

	
	public void Output(String inputfile) throws IOException{
		lineseperator_adder();
		File output = new File("Output.txt");
		FileWriter fw = new FileWriter(output,true);
		PrintWriter pw = new PrintWriter(fw);
		String[] input = File_Reader.readFile(inputfile);
		for (String i : input){
			int value = 5;
			String k = "";
			String[] j=i.split(" ");
			if (j[0].equals("AddPatient")){
				while (value<j.length){
					k = k + j[value].replaceFirst(""," ");
					value++;
				}
				Patient patient = new Patient(j[1],j[2],j[3],j[4],k);
				new PatientDAO_Impl().add(patient);
				pw.append("Patient " + patient.getId() + " " + patient.getName() + " added" + "\n");
			}
			if (j[0].equals("RemovePatient")){
				Patient patient = new PatientDAO_Impl().getByID(j[1]);
				pw.append("Patient " + patient.getId() + " " + patient.getName() + " removed" + "\n");
				new PatientDAO_Impl().deleteByID(j[1]);
				
			}
			if (j[0].equals("CreateAdmission")){
				new Admission().CreateAdmission(j[1], j[2]);
				pw.append("Admission " + j[1] + " created" + "\n");
			}
			if (j[0].equals("AddExamination")){
				Examination examinations = null;
				value = 2;
				while (value<j.length){
					if (j[value].equals("Inpatient")){
						examinations = new Inpatient();
						value++;
					}
					else if (j[value].equals("doctorvisit")){
						examinations = new doctorvisit(examinations);
						value++;
					}
					else if (j[value].equals("imaging")){
						examinations = new imaging(examinations);
						value++;
					}
					else if (j[value].equals("measurements")){
						examinations = new measurements(examinations);
						value++;
					}
					else if (j[value].equals("Outpatient")){
						examinations = new Outpatient();
						value++;
					}
					else if (j[value].equals("tests")){
						examinations = new tests(examinations);
						value++;
					}
				}
				new Admission().AddExamination(j[1], examinations);
				pw.append(j[2] + " examination" + " added" + " to" + " admission " + j[1] + "\n" );
			}
			if (j[0].equals("ListPatients")){
				pw.append("Patient List:" + "\n");
				for (Patient z : new PatientDAO_Impl().getALL()){
					pw.append(z.getId() + " " + z.getName() + " " + z.getSurname() + " " + z.getPhone_number() + " " + z.getAddress() + "\n");
				}
			}
		
		
	}
		fw.close();
		pw.close();
	}
		
	public void lineseperator_adder() throws IOException{ // for fixing some errors
		FileWriter fw = new FileWriter("patient.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		pw.append("\n");
		fw.close();
		pw.close();
		FileWriter fw2 = new FileWriter("admission.txt",true);
		PrintWriter pw2 = new PrintWriter(fw);
		pw2.append("\n");
		fw2.close();
		pw2.close();
	}


}
		
		
		
		
		
	

	

