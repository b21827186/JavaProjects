
public class ShoppingList {
	static PriceGet pl = new PriceGet();
	
	
	
	
	public void output(String file1,String file2){   //giving the wanted output for user.
	String[] shoppingList = FileReader.readFile(file1);
	for(String i : shoppingList){
			String[] j=i.split("\t");
			System.out.println("---" + j[0] + "---");
			int len = j.length;
			int t = 3;    // variable for loop
			double total = 0;
			while (t < len) {
				System.out.println(j[t] + "\t" + pl.priceGetter(j[t], j[1], j[2],file2) + "\t" + j[t+1] + "\t" + pl.priceGetter(j[t], j[1], j[2],file2)*Double.parseDouble(j[t+1])  );
				total = total + (pl.priceGetter(j[t], j[1], j[2],file2)*Double.parseDouble(j[t+1]));
				t = t+2;
			}
			System.out.println("Total" + "\t" + total);
			
		}
		
		
	}
	

}
