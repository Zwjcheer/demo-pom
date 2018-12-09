package commonUtils;

public class StringTest {

    public static void main(String[] args) {

        String a="张三三";
        StringBuilder stringBuilder = new StringBuilder(a);
        stringBuilder.replace(0, 1, "*");
        System.err.println(stringBuilder.toString());

        //银行卡前6位显示，后4位显示
        String number="6457348928989874";
        StringBuilder stringBuilder1 = new StringBuilder(number);
        int last=number.length()-10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < last; i++) {
                sb.append("*");
        }
        String lastNu=sb.toString();
        stringBuilder1.replace(6,number.length()-4,lastNu);
        System.err.println(stringBuilder1.toString());
    }
}
