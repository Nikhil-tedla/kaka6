public class Main {

    public static void main(String[] args) {
        String inputStr = "friufjkuifkwfuerkvijeyewehep9ofduqfkcvaoByfxkuieemkskgus1akrfwfnehiuehaiHlifuraakduboeackceqezazfiLs";
        String result =helper(inputStr);
        System.out.println(result);
    }

    public static String helper(String s) {
        StringBuilder evenIndexChars = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            evenIndexChars.append(s.charAt(i));
        }

        String reversedStr = evenIndexChars.reverse().toString();
        String resultStr = reversedStr.replaceAll("[akfeiu]", "");

        return resultStr;
    }
}
