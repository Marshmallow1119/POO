package Aula07.ex7_2;

public class DateYMD extends Date implements Comparable<DateYMD>{
     
    public DateYMD(int day, int month, int year) {
        super(day, month, year);
    }
    public DateYMD() {
        super();
    }
    
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", this.getYear(), this.getMonth(), this.getDay());
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DateYMD)) {
            return false;
        }
        DateYMD dateYMD = (DateYMD) o;
        return dateYMD.getDay() == this.getDay() && dateYMD.getMonth() == this.getMonth()
                && dateYMD.getYear() == this.getYear();
    }
    @Override
    public int hashCode() {
        return this.getDay() + this.getMonth() + this.getYear();
    }
    @Override
    public int compareTo(DateYMD d) {
        if (this.getYear() > d.getYear()) {
            return 1;
        } else if (this.getYear() < d.getYear()) {
            return -1;
        } else {
            if (this.getMonth() > d.getMonth()) {
                return 1;
            } else if (this.getMonth() < d.getMonth()) {
                return -1;
            } else {
                if (this.getDay() > d.getDay()) {
                    return 1;
                } else if (this.getDay() < d.getDay()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

}
