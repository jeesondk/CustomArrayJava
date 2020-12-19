public class ExtendedIntegerArray {

    private int[] sum;
    private int[] values;

    public ExtendedIntegerArray(int size){
        if(size< 1)
            throw new IllegalArgumentException("Array size must be greater than 1");

        sum = new int[size];
        values = new int[size];
    }

    public int getValue(int index) {
        return this.values[index];
    }

    public void setValue(int index, int value) {
        this.values[index]= value;
        if(index>0)
            this.sum[index] = value + this.sum[index -1];
        else
            this.sum[index] = value;
    }

    public int length = this.values.length;

    public int sumOf(int position1, int position2){
        return sum[position2] - sum[position1];
    }
}
