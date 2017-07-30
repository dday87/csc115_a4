package jsjf;

/**
 * Represents a node in a linked list.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class LinearNode<T>
{
	
	
	LinearNode<T> next;
	LinearNode<T> top;
    private T element;
	protected int count = 0;
 
    /**
     * Creates an empty node.
     */
    public LinearNode()
    {
        next = null;
        element = null;
    }
 
    /**
     * Creates a node storing the specified element.
     * @param elem element to be stored
     */
    public LinearNode(T elem)
    {
        next = null;
        element = elem;
    }
 
    /**
     * Returns the node that follows this one.
     * @return reference to next node
     */
    public LinearNode<T> getNext()
    {
        return next;
    }
 
    /**
     * Sets the node that follows this one.
     * @param node node to follow this one
     */
    public void setNext(LinearNode<T> node)
    {
        next = node;
    }
 
    /**
     * Returns the element stored in this node.
     * @return element stored at the node
     */
    public T getElement()
    {
        return element;
    }
 
    /**
     * Sets the element stored in this node.
     * @param elem element to be stored at this node
     */
    public void setElement(T elem)
    {
        element = elem;
    }

	public void removeEnd()
    {     
		LinearNode<T> previous = new LinearNode<T>();
		LinearNode<T> current = new LinearNode<T>();
        do
        {
        	previous = current;
        	current = current.getNext();
        }
        while(current.getNext() != null);
        previous.setNext(null);
        count--;        
    }
    
}
