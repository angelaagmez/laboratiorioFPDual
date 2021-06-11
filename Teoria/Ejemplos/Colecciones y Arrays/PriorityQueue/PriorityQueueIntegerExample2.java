package colecciones;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
        // Create a Priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);

        System.out.println(new PriorityQueueExample().getSpecificData(3, numbers));

        //Copia para recorrer ordenadamente
        PriorityQueue<Integer> secondNumbersCollection = new PriorityQueue<>();
        secondNumbersCollection.addAll(numbers);
        
        // Remove items from the Priority Queue (DEQUEUE)
        while (!secondNumbersCollection.isEmpty()) {
            System.out.println(secondNumbersCollection.remove());
        }
        
        System.out.println(numbers.size());

    }
	
	private Integer getSpecificData(int position, PriorityQueue<Integer> numbers) {
		int counter = 0;
		
		if(position < 0 || numbers.size()<position) {
			return null;
		}
		
		for(Integer number : numbers) {
			if(counter == position) {
				return number;
			}
			counter++;
		}
		
		return null;

	}
	
}
