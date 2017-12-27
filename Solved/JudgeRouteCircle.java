import java.util.*;
//to the original place.

//The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

//Example 1:

//Input: "UD"
//Output: true

//Example 2:

//Input: "LL"
//Output: false
public class JudgeRouteCircle {
	public static void main(String[] args) {
		JudgeRouteCircle tester = new JudgeRouteCircle();
		tester.unitTest();
	}
	public void unitTest() {

	}
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') y++;
            else if (moves.charAt(i) == 'D') y--;
            else if (moves.charAt(i) == 'R') x++;
            else x--;
        }        
        return x == 0 && y == 0;
    }
}
