public class KLTN<T, V> implements Comparable<KLTN<T, V>> {
    T student;
    V guide;
    String thesisName;

    public KLTN(T student, V guide, String thesisName) {
        this.student = student;
        this.guide = guide;
        this.thesisName = thesisName;
    }

    public String getThesisName() {
        return thesisName;
    }

    @Override
    public int compareTo(KLTN<T, V> other) {
        return this.thesisName.compareTo(other.thesisName);
    }

    @Override
    public String toString() {return thesisName + "\n" +  student.toString() + "\n" + guide.toString();}
}