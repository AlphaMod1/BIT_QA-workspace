package monethaPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ReportGenerator {
	
	public void start(String tests[], int kiek, boolean pass[]) throws IOException {
		File htmlTemplateFile = new File("C:/Users/liuta/Documents/Pamokos/Testing Workspace/QaOnTime/template.html");
		String htmlString = FileUtils.readFileToString(htmlTemplateFile);
		
		
		String body = "<h1>Report of Monetha.io</h1>";
				body += "<ul>";
				for(int i = 0; i < kiek; i++) {
					String color = "";
					String passText = "";
					if(pass[i]) {
						color = " style=color:green";
						passText = " - PASSED";
					}
					else {
						color = " style=color:red";
						passText = " - FAILED";
					}
					
					body+="<li"+color+">";
					body+=i+1+". "+tests[i]+passText;
					body+="</li>";
				}
				body += "</ul>";
		
		htmlString = htmlString.replace("$body", body);
		File newHtmlFile = new File("C:/Users/liuta/Documents/Pamokos/Testing Workspace/QaOnTime/report.html");
		FileUtils.writeStringToFile(newHtmlFile, htmlString);
	}

}
