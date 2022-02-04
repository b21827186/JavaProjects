import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
	WritetoFile wf = new WritetoFile();
	wf.Write_to_file(args[0], args[1]);
	}
}
