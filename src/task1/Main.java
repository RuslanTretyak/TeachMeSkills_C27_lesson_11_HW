package task1;

import task1.util.Util;

public class Main {
    public static void main(String[] args) {
        String str = "1234-fbC-6541-AbC-1a2b";
        System.out.println(Util.getNumberBlocks(str));
        System.out.println(Util.getDocumentNumber(str));
        System.out.println(Util.getBriefe(str));
        System.out.println(Util.getBriefeByStringbuilder(str));
        Util.checkSubsting(str);
        Util.checkBegin(str);
        Util.checkEnd(str);
    }
}
