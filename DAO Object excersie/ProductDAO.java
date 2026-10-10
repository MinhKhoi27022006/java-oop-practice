
public class ProductDAO extends DAO<Product> {

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Product obj) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).getId() == obj.getId()) {
				myList.set(i, obj); // update (replace)
				return;
			}
		}
		System.out.println("Product not found for update!");

	}

	@Override
    public Product find(int id){
        for (Product p : myList) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
	
