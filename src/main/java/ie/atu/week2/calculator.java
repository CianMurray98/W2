//Cian Murray

package ie.atu.week2;

public class calculator {
    int FirstNumber;
    int SecondNumber;

    public calculator(int FirstNumber, int SecondNumber) {
        this.FirstNumber = FirstNumber;
        this.SecondNumber = SecondNumber;
    }

    public int add(){
        int total = FirstNumber + SecondNumber;
        return total;
    }
}
