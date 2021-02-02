package sd.design.patterns.namu.darbai.Exercise9;

public class EditorTextMemento {

    private final String value;

    public EditorTextMemento(final EditorText editorText) {
        value = editorText.getValue();
    }

    public String getValue() {
        return value;
    }
}