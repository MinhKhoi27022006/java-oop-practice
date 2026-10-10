
public class TestDao {
	    public static void main(String[] args) {
	        ProductDAO dao = new ProductDAO();
	        dao.add(new Product(1, "Laptop", 1200));
	        dao.add(new Product(2, "Mouse", 25));
	        System.out.println(dao.find(1));
	        dao.update(new Product(1, "Laptop Pro", 1500));
	        System.out.println(dao.find(1));
	        dao.remove(1);
	        System.out.println(dao.getList());
	    }
	}


