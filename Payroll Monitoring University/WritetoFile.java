import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritetoFile {

	
	
	public void Write_to_file(String file1, String file2) throws IOException{   
		String[] personal = FileReader.readFile(file1);
		String[] monitoring = FileReader.readFile(file2);
		for (String i : monitoring){
			String[] j=i.split("\t");
			File file = new File(j[0]+".txt");
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);
			for (String k : personal){
				String[] l=k.split("\t");
				if (j[0].equals(l[1])){
					String[] namesurname = l[0].split(" ");
					if (l[2].equals("FACULTY_MEMBER")){
						pw.print("Name : " + namesurname[0] + "\n" + "Surname : "  + namesurname[1] + "\n" + "Registiration Number : " + j[0] + "\n" + "Position : " + l[2] + "\n" + "Year of Start : " + l[3] + "\n" + "Total Salary : " + String.valueOf(String.format("%.2f",new Faculty_Member().total(Integer.parseInt(j[1]),Integer.parseInt(j[2]),Integer.parseInt(j[3]),Integer.parseInt(j[4]),Integer.parseInt(l[3]))).replace(",",".")));
					}
					else if (l[2].equals("RESEARCH_ASSISTANT")){
						pw.print("Name : " + namesurname[0] + "\n" + "Surname : "  + namesurname[1] + "\n" + "Registiration Number : " + j[0] + "\n" + "Position : " + l[2] + "\n" + "Year of Start : " + l[3] + "\n" + "Total Salary : " + String.valueOf(String.format("%.2f",new Research_Assistant().total(Integer.parseInt(l[3]))).replace(",",".")));
					}
					else if (l[2].equals("OFFICER")){
						pw.print("Name : " + namesurname[0] + "\n" + "Surname : "  + namesurname[1] + "\n" + "Registiration Number : " + j[0] + "\n" + "Position : " + l[2] + "\n" + "Year of Start : " + l[3] + "\n" + "Total Salary : " + String.valueOf(String.format("%.2f",new Officer().total(Integer.parseInt(j[1]),Integer.parseInt(j[2]),Integer.parseInt(j[3]),Integer.parseInt(j[4]),Integer.parseInt(l[3]))).replace(",",".")));
					}
					else if (l[2].equals("SECURITY")){
						pw.print("Name : " + namesurname[0] + "\n" + "Surname : "  + namesurname[1] + "\n" + "Registiration Number : " + j[0] + "\n" + "Position : " + l[2] + "\n" + "Year of Start : " + l[3] + "\n" + "Total Salary : " + String.valueOf(String.format("%.2f",new Security().total(Integer.parseInt(j[1]),Integer.parseInt(j[2]),Integer.parseInt(j[3]),Integer.parseInt(j[4]),Integer.parseInt(l[3]))).replace(",",".")));
					}
					else if (l[2].equals("WORKER")){
						pw.print("Name : " + namesurname[0] + "\n" + "Surname : "  + namesurname[1] + "\n" + "Registiration Number : " + j[0] + "\n" + "Position : " + l[2] + "\n" + "Year of Start : " + l[3] + "\n" + "Total Salary : " + String.valueOf(String.format("%.2f",new Worker().total(Integer.parseInt(j[1]),Integer.parseInt(j[2]),Integer.parseInt(j[3]),Integer.parseInt(j[4]),Integer.parseInt(l[3]))).replace(",",".")));
					}
					else if (l[2].equals("CHIEF")){
						pw.print("Name : " + namesurname[0] + "\n" + "Surname : "  + namesurname[1] + "\n" + "Registiration Number : " + j[0] + "\n" + "Position : " + l[2] + "\n" + "Year of Start : " + l[3] + "\n" + "Total Salary : " +  String.valueOf(String.format("%.2f",new Chief().total(Integer.parseInt(j[1]),Integer.parseInt(j[2]),Integer.parseInt(j[3]),Integer.parseInt(j[4]),Integer.parseInt(l[3]))).replace(",",".")));
					}
					else if (l[2].equals("PARTTIME_EMPLOYEE")){
						pw.print("Name : " + namesurname[0] + "\n" + "Surname : "  + namesurname[1] + "\n" + "Registiration Number : " + j[0] + "\n" + "Position : " + l[2] + "\n" + "Year of Start : " + l[3] + "\n" + "Total Salary : " + String.valueOf(String.format("%.2f",new Parttime_Employee().total(Integer.parseInt(j[1]),Integer.parseInt(j[2]),Integer.parseInt(j[3]),Integer.parseInt(j[4]),Integer.parseInt(l[3]))).replace(",",".")));
					}
				}
			}
			pw.close();
			
		}
		
		
		
		
		
	}
	
	
}