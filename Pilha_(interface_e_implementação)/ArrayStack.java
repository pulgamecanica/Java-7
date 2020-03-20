import java.util.*;

public class ArrayStack implements Stack<String>{

	private ArrayList<String> list = new ArrayList<>();
	private int countElements = 0;

	public ArrayStack(){
	}

	@Override
	public void push(String element){
		list.add(element);
		countElements++;
	} // insere um elemento no topo da pilha.
	@Override
	public String peek(){
		return list.get(size() - 1);
	} // consulta o elemento que está no topo da pilha (caso exista). FIM ULTIMO
	@Override
	public String pop(){
		String result = peek();
		list.remove(size() - 1);
		countElements--;
		return result;
	} //remove (e devolve) o elemento que está no topo da pilha (caso exista). FIM ULTIMMO
	@Override
	public int size(){
		return countElements;
	} //devolve o número de elementos da pilha.
	@Override
	public boolean isEmpty(){
		return countElements == 0;
	} //devolve verdadeiro caso a pilha esteja vazia, falso caso
}