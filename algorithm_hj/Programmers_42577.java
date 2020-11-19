package algorithm_hj;

/**
 * 전화번호 목록 (해시)
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 *
 */
public class Programmers_42577 {

	public static void main(String[] args) {
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(solution(phone_book));
	}
	
	 static boolean solution(String[] phone_book) {
        boolean answer = true; 
		for(int i = 0; i < phone_book.length; i++) {
			for(int j = 0; j < phone_book.length; j++) {
				if(phone_book[i] == phone_book[j]) continue;
				if(phone_book[i].indexOf(phone_book[j])==0) {
					answer = false;
                    break;
				}
			}
		}
		return answer;
    }
	 
}
