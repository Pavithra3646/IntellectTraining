package Day4_case_Study;

public class ItemTypeBO {
	public void add(ItemType object ,ItemType[] itemTypeArray,Integer index) {
		itemTypeArray[index]=object;
		System.out.println("New item added successfully");
	}
	public void search(String search, ItemType[] itemTypeArray) {
		int flag=0;

		for(ItemType itype:itemTypeArray) {
			if(itype.getName().equals(search)) {
				flag=1;
				System.out.println("Searched Item Type is : "+itype);

			}
		}if(flag==0)
			System.out.println("Search Item Type is not found");
	}

	public void display(ItemType[] itemTypeArray) {
		for (int i = 0; i < itemTypeArray.length; i++) {
			System.out.printf("\nItem Type Number %d:\n", i + 1);
			System.out.println(itemTypeArray[i]);
		}
	}
}
