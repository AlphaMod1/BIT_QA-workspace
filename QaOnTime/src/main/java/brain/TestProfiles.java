package brain;

import com.opencsv.bean.CsvBindByName;

public class TestProfiles {
	
	@CsvBindByName(column = "Address", required = true)
    private String address;

    @CsvBindByName(column = "Email", required = true)
    private String email;

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

}
