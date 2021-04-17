// 2 1 4 3 2
	void detectLoop() 
	{ 
		Node slow_p = head, fast_p = head; 
		int flag = 0; 
		while (slow_p != null && fast_p != null ) { 
			slow_p = slow_p.next; 
			fast_p = fast_p.next.next; 
			if (slow_p == fast_p) { 
				flag = 1; 
				break; 
			} 
		} 
		if (flag == 1)
		{
			System.out.println("Loop found"+" "+slow_p.data); 
		}
		else
			System.out.println("Loop not found"); 
	} 