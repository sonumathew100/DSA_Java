package dsa_Java;

import java.util.Iterator;
@SuppressWarnings("unchecked")//https://stackoverflow.com/questions/1129795/what-is-suppresswarnings-unchecked-in-java#:~:text=An%20unchecked%20warning%20tells%20a,won't%20cause%20unexpected%20exceptions.
public class DynamicArray<T> implements Iterable<T> {

	private T[] arr;
	private int len=0;
	private int capacity=0;
	
	public DynamicArray() {
		
		
		this(16);
	}
	
	
	public DynamicArray(int capacity) {
		if(capacity<0) throw new IllegalArgumentException("Illegal Capacity:"+ capacity);
		this.capacity=capacity;
		arr =   (T[]) new Object[capacity];  //https://stackoverflow.com/questions/45665919/what-does-object-mean-in-e-temp-e-new-objectcapacity
		
	}


	public int size() {
	    return len;
	  }

	public boolean isEmpty() {
	    return size() == 0;
	  }
	public T get(int index) {
	    if (index >= len || index < 0) throw new IndexOutOfBoundsException();
	    return arr[index];
	  }
	public void set(int index, T elem) {
	    if (index >= len || index < 0) throw new IndexOutOfBoundsException();
	    arr[index] = elem;
	  } 
	public void clear() {
		    for (int i = 0; i < len; i++) arr[i] = null;
		    len = 0;
		  }
	public void add(T elem) {

	    // Time to resize!
	    if (len + 1 >= capacity) {
	      if (capacity == 0) capacity = 1;
	      else capacity *= 2; // double the size
	      T[] new_arr = (T[]) new Object[capacity];
	      for (int i = 0; i < len; i++) new_arr[i] = arr[i];
	      arr = new_arr; // arr has extra nulls padded
	    }
	    
	    arr[len++] = elem;
	}
	// Removes an element at the specified index in this array.
	  public T removeAt(int rm_index) {
	    if (rm_index >= len || rm_index < 0) throw new IndexOutOfBoundsException();
	    T data = arr[rm_index];
	    T[] new_arr = (T[]) new Object[len - 1];
	    for (int i = 0, j = 0; i < len; i++, j++)
	      if (i == rm_index) j--; // Skip over rm_index by fixing j temporarily
	      else new_arr[j] = arr[i];
	    arr = new_arr;
	    capacity = --len;
	    return data;
	  }
	  
	  




	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
