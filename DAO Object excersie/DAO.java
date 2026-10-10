import java.util.ArrayList;
import java.util.List;

abstract public class DAO<T> implements Identifiable {
	protected ArrayList<T> myList;
	public DAO() {
		myList = new ArrayList<>();
	}

	public void add(T itemAdd) {
		myList.add(itemAdd);
	}

	public void remove(int i) {
		myList.remove(i);
	}

	abstract public void update(T obj);

	abstract public T find(int id);

	public ArrayList<T> getList() {
		return myList;

	}

}
