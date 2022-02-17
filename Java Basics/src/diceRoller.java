import java.util.Random;
public class diceRoller {
//local and global variables	
	diceRoller(){
		Random rd=new Random();
		int number=0;
		roller(rd,number);
	}
	void roller(Random rd, int number) {
		number=rd.nextInt(6)+1;
	}

}
