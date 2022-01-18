package chapter12.arrayList;

import chapter12.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList = new MemberArrayList();
	
		Member memberLee = new Member(1001, "ÀÌÁö¿ø");
		Member memberSon = new Member(1002, "¼Õ¹Î±¹");
		Member memberPark = new Member(1003, "¹Ú¼­ÈÍ");
		Member memberHong = new Member(1004, "È«±æµ¿");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberSon.getMemberId());
		memberArrayList.showAllMember();
		
		memberArrayList.insertMember(memberHong,3);
		memberArrayList.showAllMember();
	}


}
