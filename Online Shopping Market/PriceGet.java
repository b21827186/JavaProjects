import java.util.regex.Pattern;

public class PriceGet {
	
	
	public Double priceGetter(String x,String y,String z,String file){      // the product , membership type , date of purchase
		String[] priceList = FileReader.readFile(file);
		for(String i : priceList){	
			String[] j=i.split("\t");
			if ((j[0].equals(x)) && (j[1].equals(y)) && (dateCheck(z,j))){
					return Double.parseDouble(j[4]);
			}
		
		}
		return 1.0; //just not to get error
}
	
	
	
	
	public boolean dateCheck(String z, String[] j){   // date of purchase , the line that we are looking for date.
			String[] k = j[2].split(Pattern.quote("."));  //first date
			String[] l = j[3].split(Pattern.quote("."));  //last date
			String[] x = z.split(Pattern.quote("."));    // date of purchase
			if((Integer.parseInt(k[1]) < Integer.parseInt(x[1])) && (Integer.parseInt(x[1]) < Integer.parseInt(l[1]))){
				return true;
			}
			if((Integer.parseInt(k[2]) < Integer.parseInt(x[2])) && (Integer.parseInt(x[2]) < Integer.parseInt(l[2]))){
				return true;
			}
			if(((Integer.parseInt(k[0]) <=  Integer.parseInt(x[0])) & (Integer.parseInt(x[0]) <= Integer.parseInt(l[0]))) && ((Integer.parseInt(k[1]) <= Integer.parseInt(x[1])) & (Integer.parseInt(x[1]) <= Integer.parseInt(l[1]))) && (( Integer.parseInt(k[2]) <=  Integer.parseInt(x[2])) & (Integer.parseInt(x[2]) <= Integer.parseInt(l[2])))==true){
				return true;
				
			}
			else {
				
			return false;	
				
		}
		
	}
	
	
		
		
		
	
	
	
}