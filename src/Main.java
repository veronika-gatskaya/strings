import com.company.service.StringService;
import com.company.service.StringServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringService stringService = new StringServiceImpl();
        stringService.outputStringDetails(str);
        stringService.addString(str, " Joined str");
        stringService.collectStringFromArray(stringService.replaceFirstWordToLast(stringService.replaceEndOfWord(stringService.removeRepeatedWords(stringService.splitString(str)))));
    }
}
