package wisniowa.tc;

public abstract class Constants {
    public static final int CHARACTER_IMG_WIDTH = 40;
    public static final int CHARACTER_IMG_HEIGHT = 80;
    public static final int WINDOW_HEIGHT = 400 + 40;
    public static final int WINDOW_WIDTH = 400 + 16;
    public static final String STATIC_FOLDER = "static/";
    public static final String IMAGE_FOLDER =
            STATIC_FOLDER + "images/";
    public static final int MAX_RIGHT_POSITION =
            WINDOW_WIDTH - CHARACTER_IMG_WIDTH;
    public static final int MIN_LEFT_POSITION = 0;
    public static final int MAX_TOP_POSITION =
            WINDOW_HEIGHT - CHARACTER_IMG_HEIGHT;
}
