import java.util.Objects;

public class studentHashSet {
    public int rollNo;
    public String name;

    public studentHashSet(int rollNo, String name){ //constructor
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override 
    public String toString(){
        return "studentHashSet{"+
                "rollNo="+rollNo+
                ", name="+name+'\''+
                '}';
    }

    @Override 
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        studentHashSet student = (studentHashSet) o;
        return rollNo == student.rollNo;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(rollNo);
    }


}
