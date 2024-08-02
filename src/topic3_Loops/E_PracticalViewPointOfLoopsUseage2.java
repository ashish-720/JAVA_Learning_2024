package topic3_Loops;

public class E_PracticalViewPointOfLoopsUseage2 {

    public static void main(String[] args) {

        int scrollBarCoveredLength = 0;
        while (scrollBarCoveredLength < 100) {
            if (isExternalIdColumnHeaderVisible() == true) {
                break;
            }

            scrollByWidth10();
            scrollBarCoveredLength = scrollBarCoveredLength + 10;
        }


    }

    public static boolean isExternalIdColumnHeaderVisible() {
        return true;
    }

    public static void scrollByWidth10() {

    }

}


