package member.bean;

import lombok.Data;

@Data
public class MemberDTO {

	private int memberId;
	private String email;
	private String name;
	private String pwd;
	private int point;
	private String profile;
	private String preferenceArea;//관심지역
	
}
