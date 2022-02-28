package domain;

// JFrame 의 정보를 담고 있다.

/*
2.28 이 클래스가 바로 JFrame을 상속받는것도 고민중이다....
그렇게 하면 setter, getter도 없어도 되고 덜 번거로울것 같은데
*/
public class PopupFrame {

    // PopupWindow는 프로그램이 실행되는 동안 값이 바뀌지 않는다.
    private static final String title="바둑";
    private static final int width=800;
    private static int height=600;
    private static boolean isVisible=true;
    private static Object location = null;

    public static String getTitle() {
        return title;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    public static boolean IsVisible() {
        return isVisible;
    }

    public static Object getLocation() {
        return location;
    }
}
