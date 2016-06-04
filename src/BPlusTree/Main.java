package BPlusTree;


public class Main {

	public static void main(String[] args){
	
		BPlusTree<Integer, Integer> tree2 = new BPlusTree<Integer, Integer>(3);
		for(int i=200; i>=0; i--){
			if (i%2 == 0){
				tree2.insert(i, i);
			}
		}

		for(int i=0; i<=200; i++){
			System.out.println(i + ": " + tree2.retrieve(i));
		}
		tree2.dump();
		System.out.println(tree2.getHeight());
		
		for(int i=200; i>=0; i--){
			if (i%4 == 0){
				System.out.println(i);
				tree2.remove(i);
			}
		}
		tree2.dump();
		for(int i=0; i<=200; i++){
			System.out.println(i + ": " + tree2.retrieve(i));
		}
		System.out.println(tree2.getHeight());
		
		for(int i=200; i>=0; i--){
			if (i%8 == 2){
				System.out.println(i);
				tree2.remove(i);
			}
		}
		tree2.dump();
		for(int i=0; i<=200; i++){
			System.out.println(i + ": " + tree2.retrieve(i));
		}
		tree2.dump();
		System.out.println(tree2.getHeight());
		
		for(int i=200; i>=0; i--){
			if (i%16 == 6){
				System.out.println(i);
				tree2.remove(i);
			}
		}
		tree2.dump(); //powinny zostac sie liscie postaci 14+16k
		
	}

}
