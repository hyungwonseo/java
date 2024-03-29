package Java0328;

public enum LectureCategory {
    PROGRAMMING,
    MODELING3D,
    PAINTING,
    TEXTURING,
    SOUND,
    VISUAL_EFFECT;

    public static LectureCategory fromString(String text) {
        //for (LectureCategory category : LectureCategory.values()) {
        LectureCategory[] categories = LectureCategory.values();
        for (int i=0; i<categories.length; i++) {
            if (categories[i].name().equalsIgnoreCase(text)) {
                return categories[i];
            }
        }
        throw new IllegalArgumentException("No constant with name " + text + " found");
    }
}
