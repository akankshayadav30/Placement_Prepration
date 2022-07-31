class Solution
{
  /*   --------------------       I N S E R T I O N     A  T      B E G I N N I N G     A N D    A  T     E  N  D       -------------------         */

    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node s = new Node(x);
        if(head==null){head = s;return head;}
        s.next = head;
        head = s;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node s = new Node(x);
        if(head==null){head =s ;return head;}
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = s;
        return head;
    }
  
  /*   ------------------------------------------        D E L E T I O N      ---------------------------------------------------*/

  Node deleteNode(Node head, int x)
    {
	// Your code here	
	    if(head == null)return head;
	    if(x==1){
	        head = head.next;
	        return head;
	    }
	    Node temp = head;
	    int count = 1;
	    while(count<x-1 &&temp.next !=null){
	        count++;
	        temp = temp.next;
	    }
	    temp.next = temp.next.next;
	    return head;
    }
  
  /* ----------------------------------------   F I N D  T H E   S I Z E   O F  L I N K E D  L I S T   ---------------------------------  */
  public static int getCount(Node head)
    {
        
        //Code here
        if(head == null)return 0;
        Node temp = head;
        
        int count = 0 ; 
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
  
  /* --------------------------------------  F I N D   T H E   D A T A   O N   G I V E N  I N D E X  ---------------------------------   */
  public static int getNth(Node node, int ind)
    {
       //Your code here
       if(node==null)return -1;
       Node temp = node;
       while(ind>1 && temp!=null){
           temp = temp.next;
           ind--;
       }
       return temp.data;
    }
  /* -----------------------    Function to find the data of nth node from the end of a linked list.  -----------------------------------*/
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	if(head==null)return -1;
    	int count = 0 ;
    	Node temp = head;
    	while(temp != null){
    	    count++;
    	    temp = temp.next;
    	}
    	if(n<0 || count<n)return -1;
    	count = count - n;
    	if(count ==0 )return head.data;
    	temp = head;
    	while(count>1 && temp!=null){
    	    temp = temp.next;
    	    count--;
    	}
    	return temp.next.data;
    }
}
