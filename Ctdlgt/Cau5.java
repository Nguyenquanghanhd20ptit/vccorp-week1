import java.util.*;

public class Cau5 {

    private static List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        List<String> result = new ArrayList<>();
        backtrack(s, dict, result, new StringBuilder(), 0);
        return result;
    }

    private static void backtrack(String s, Set<String> dict, List<String> result, StringBuilder current, int start) {
        if (start == s.length()) {
            result.add(current.toString().trim());
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (dict.contains(word)) {
                int lengthBeforeAdding = current.length();
                if (current.length() > 0) {
                    current.append(" ");
                }
                current.append(word);
                backtrack(s, dict, result, current, end);
                current.setLength(lengthBeforeAdding);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào: ");
        String s = scanner.nextLine();
        System.out.println("Nhập số lượng phần tử của từ điển: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập danh sách các phần tử của thư viện: ");
        Set<String> dict = new HashSet<>();
        for(int i=0;i<n;i++){
            dict.add(scanner.nextLine());
        }
        List<String> result = new ArrayList<>();
        backtrack(s, dict, result, new StringBuilder(), 0);
        System.out.println("Output:");
        for (String sentence : result) {
            System.out.println(sentence);
        }
    }
}
