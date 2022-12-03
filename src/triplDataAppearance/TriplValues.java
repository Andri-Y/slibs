package triplDataAppearance;

public enum TriplValues {;
    private static final int wrong = -1;
    private static final int right = 1;
    private static final int unknown = 0;

    private int currentValue = TriplValues.unknown;

    TriplValues(Tripl tripl) {

    }
    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }
}
