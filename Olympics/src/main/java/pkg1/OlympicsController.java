package pkg1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;


@RestController
public class OlympicsController {
	public static ArrayList<String> loaddata(String fname) throws IOException{
		File f1 = new File(fname);
		Scanner sc1 = new Scanner(f1);
		ArrayList<String>year1 = new ArrayList<>();
		ArrayList<String>city1 = new ArrayList<>();
		sc1.nextLine();
		while(sc1.hasNext()) {
			String[] templist = sc1.nextLine().split(",");
			year1.add(templist[0]);
			city1.add(templist[1]);
		}
		sc1.close();
		System.out.println(year1);
		return year1;		
	}
	
	@GetMapping("/olympics/data1")
	public String renderdata1() throws IOException{
		System.out.println("Success1");
		return "Success2";
	}
	
}
