package collections;

import java.util.HashSet;

//----->No duplicates
//------>No order
//------->Fastest set



// string only input for this class 
class f{
	public static void dispaly() {
		HashSet<String> j=new HashSet<String>();
	
		// this is no allows duplicate and allows only one null
		// it does not follow the order 
		j.add("bhuvi");
		j.add("mani");
		j.add("kumar");
		j.add("bhuvi");
		j.add("rohan");
		j.add(null);
		j.add(null);
		
		
		System.out.println(j);
		
		for (String e:j) {
			System.out.println(e);
		}
	}
}

// number only input for this class
class o{
	static void dispaly() {
		HashSet<Integer> r=new HashSet<Integer>();
		
		r.add(null);
		r.add(null);
		r.add(1);
		r.add(2);
		r.add(3);
		r.add(4);
		r.add(3);
		r.add(2);
		
		
		System.out.println(r);
	}
}

// both the number and the string are the input for this 

class w{
	static void display() {
		HashSet<Object> q=new HashSet<>();
		q.add(1);
		q.add(12);
		q.add(2);
		q.add(1);
		q.add(12);
		q.add(2);
		q.add(0);
		q.add("bhuvi");
		q.add("ram");
		q.add("bhuvi");
		q.add("ram");
		
		System.out.println(q);
	}
}
public class hashset {

	public static void main(String[] args) {
		f.dispaly();
		o.dispaly();
		w.display();
	
	
	}

}
