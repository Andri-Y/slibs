package triplDataAppearance;

public abstract class EnvironmentLevel {
    public Triple born(){
        return new Triple(0);
    }
    public Triple sleep(){
        return new Triple(-1);
    }
    public Triple wakeUp(){
        return new Triple(1);
    }
}
