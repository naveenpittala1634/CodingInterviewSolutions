package demopack1;
LinkedListNode nthToLast(LinkedListNode head, int n) {
  if (head == null || n < 1) {
    return null;
  }

  LinkedListNode p1 = head;
  LinkedListNode p2 = head;
  //let us suppose array elements are 5
  //1,2,3,4,5
  //here last 2nd node is  4 i.e, n==2
  
  for (int j = 0; j < n - 1; ++j) { // skip n-1 steps ahead    //loop runs only one time
    if (p2 == null) {
      return null; // not found since list size < n
    }
    p2 = p2.next;  //so p2 here becomes 2
  }

  while (p2.next != null) {  //loop will terminate here
    p1 = p1.next; //2 //3 //4
    p2 = p2.next; //3 //4 //5 
  }

  return p1;
}


