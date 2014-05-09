import java.util.LinkedList;
import java.util.Queue;

public class StackMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sum1 = "12+4+*3";
		System.out.println(solution(sum1));
	}

	public static int solution(String S) {
		int n = S.length();
		if (n < 2)
			return -1;

		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Character> queue2 = new LinkedList<Character>();

		for (int i = 0; i < n; ++i) {
			String tmp = String.valueOf(S.charAt(i));
			if (tmp.matches("[0-9]")) {
				queue1.add(Integer.getInteger(tmp));
			} else if (S.charAt(i) == '+' || S.charAt(i) == '*') {
				queue2.add(S.charAt(i));
			}
			// else return -1;
		}

		while (queue1.size() > 1) {
			Integer tmp1 = queue1.remove();
			Integer tmp2 = queue1.remove();
			Character op = queue2.remove();
			if (op == '+') {
				queue1.add(tmp1 + tmp2);
			}
			if (op == '*') {
				queue1.add(tmp1 * tmp2);
			}
		}

		return queue1.remove();
	}
}
