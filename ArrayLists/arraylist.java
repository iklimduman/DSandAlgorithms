import java.util.ArrayList;
import java.util.Arrays ;

public class arrayList<T> {

    public final int DEFAULT_SIZE = 10 ;
    public int size ;
    public T[] array ;

    public arrayList(){
        this.array = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0 ;
    }

    public int getSize(){
        return size ;
    }

    public void setSize(int size){
        this.size = size ;
    }

    public void set(int index, T t){
        array[index] = t ;
    }

    public void add(int index, T t){
        if ( index < 0 || index > getSize()){
            throw new IndexOutOfBoundsException();
        }
        // assume available space
        if(index == 0 || index == getSize()){
            set(index,t);
        }
        else{
            shiftTowardsEnd(index,getSize() - 1);
            set(index , t);
        }

        this.setSize(getSize() + 1);

    }

    private  void shiftTowardsEnd(int index, int current){
        if(current >= index){
            array[current + 1] = array[current];
            shiftTowardsEnd(index, current-1);
        }
    }

    public T remove(int index){
        T result = array[index];
        shiftTowardsStart(index + 1);
        this.setSize(getSize() - 1);
        return result;
    }

    private void shiftTowardsStart(int current){
        array[current - 1] = array[current];

        if(current == getSize() - 1){
            set(current , null);
        }
        else{
            shiftTowardsStart(current + 1);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        toString(0,sb);
        sb.append("]");

        return sb.toString();
    }

    private void toString(int index, StringBuilder sb)
    {
        if( index < getSize() -1){
            sb.append(array[index] + ",");
            toString(index+1 , sb);
        }
        else if(index < getSize())
        {
            sb.append(array[index]);
        }
    }


    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>() ;
        System.out.println(myArrayList);  // empty arrayList
        myArrayList.add(0,"Hello");
        System.out.println(myArrayList.toString());

    }
}

