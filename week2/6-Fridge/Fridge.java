public class Fridge {
    private Food [] products;
    private int capacity; //maximum number of Foods in the fridge
    private int weight; //maximum capacity of Fridge

    public Fridge(int capacity){
        this.capacity = capacity;
        this.products = new Food[capacity];
    }

    public Fridge(int capacity, int weight){
        this.capacity = capacity;
        this.products = new Food[capacity];
        this.weight = weight;
    }

    public String toString(){
        String fridgeProducts = "";
        for(Food item:products){
            if(item != null){
                fridgeProducts += item + "\n";
            }
        }
        return fridgeProducts;
    }

    public static void main(String args[]){
        Fridge fridge = new Fridge(10);
        fridge.addFood(new Food("Cheese", "Milk", 300));
        fridge.addFood(new Food("Milk", "Milk", 1000));
        fridge.addFood(new Food("Beer", "Bevarage", 500));

        //System.out.println(fridge);
        //System.out.println(fridge.getFoodsCount());
        String [] temp = fridge.getProductsOfType("Milk");
        for(int i=0; i < temp.length; i++){
            //System.out.println(temp[i]);
        };
        //System.out.println(fridge.getWeight());

        Fridge fridge2 = new Fridge(10, 3000);
        //System.out.println(fridge2.getMaxWeight());
        System.out.println("The heaviest product: " + fridge.getHeaviestFood());
        //System.out.println("The heaviest product: " + fridge2.getHeaviestFood());
        System.out.println(fridge2.getCapacity());

    }

    public boolean addFood(Food food){
        for(int i = 0; i < products.length; i++){
            if(products[i] == null){
                products[i] = food;
                return true;
            }
        }
        return false;
    }

    public int getFoodsCount(){
        int i = 0;
        for(Food item:this.products){
            if(item != null){
                i+=1;
            }
        }
        return i;
    }

    public String [] getProductsOfType(String type){
        String [] typeProducts = new String[ getProductsNumByType(type) ];
        int i = 0;
        for (Food item:products){
            if( item != null && type.equals(item.getType()) ){
                typeProducts[i] = item + "";
                i++;
            }
        }
        return typeProducts;
    }

    private int getProductsNumByType(String type){
        int typeItems = 0;
        for (int i = 0; i < getFoodsCount(); i++){
            if( products[i] != null && type.equals(products[i].getType()) ){
                typeItems++;
            }
        }
        return typeItems;
    }

    public int getWeight(){
        int currentWeight = 0;
        for (Food item:products){
            if( item != null ){
                currentWeight += item.getItemWeight();
            }
        }
        return currentWeight;
    }

    public int getMaxWeight(){
        return weight;
    }

    public Food getHeaviestFood(){
        int itemMaxWeight = 0;
        int itemNum = 0;
        for (int i = 0; i < products.length; i++){
            if( products[i] != null && itemMaxWeight < products[i].getItemWeight()){
                itemMaxWeight = products[i].getItemWeight();
                itemNum = i;
            }
        }
        return products[itemNum];
    }

    public int getCapacity(){
        return capacity;
    }

}
