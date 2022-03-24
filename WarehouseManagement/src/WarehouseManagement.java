import javax.sound.midi.SysexMessage;
import java.lang.reflect.Array;
import java.util.*;



public class WarehouseManagement
{
    //TODO Learn how to use Write to file/Read from file
    public static void main(String[] args)
    {
        ArrayList<String> itemFrozenList = new ArrayList<>(Arrays.asList("Grouper", "Yellowtail"));
        ArrayList<Integer> quantityFrozenList = new ArrayList<>(Arrays.asList(100, 210));
        ArrayList<String> itemDriedList = new ArrayList<>(Arrays.asList("Salted Egg Chips (500g)", "Truffle Chips (500g)"));
        ArrayList<Integer> quantityDriedList = new ArrayList<>(Arrays.asList(100, 210));
        ArrayList<String> itemFreshList = new ArrayList<>(Arrays.asList("Grouper", "Yellowtail"));
        ArrayList<Integer> quantityFreshList = new ArrayList<>(Arrays.asList(100, 210));
        
        
        WarehouseSections ws = new WarehouseSections();
        OverallReordering fs = new OverallReordering(itemFrozenList,quantityFrozenList);
        FrozenSection fs1 = new FrozenSection();
        
        
        int count = 0;
        /*
        int editCount = 0;
        int quantity;
        int price;
        int order;
        int reorder = 0;
        int annoyance = 0;
        int totalPrice = 0;
        String orderString = "";
        String reordering = "";
        */
        
        
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Select section: ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < ws.SectionList.size(); i++) //Change to warehouse section listings
        {
            System.out.println((i + 1) + ".\t\t\t\t" + ws.SectionList.get(i));
        }
        System.out.println("--------------------------------------------------");
    
    
        
        while(count<1)
        {
            int deathCount=0;
    
            int menuSelect = 0;
            
            while (true)
            {
                try
                {
                    menuSelect = Integer.parseInt(scan.nextLine());
                    break;
                } catch (Exception I)
                {
                    System.out.println(I);
                    System.out.println("WRONG ANSWER");
                    deathCount++;
                }
                if(deathCount==10)
                {
                    System.out.println("SYSTEM SHUTDOWN");
                    System.exit(0);
                }
                else if(deathCount==9)
                {
                    System.out.println("SHUTDOWN IMMINENT");
                }
            }
            switch (menuSelect)
            {
                case 1:
                    while (true)
                    {
    
                        fs.chooseOne(fs1);
                        
    
                        
                        break;
                    }
            
                    break;
                case 2:
                    //Dried item section
                    break;
                case 3:
                    //Fresh item section
                    break;
                case 4:
                    break;
                default:
                    count++;
                    break;
        
            }
        }
      
        

        
        /*
        String name = "";
        while(editCount<1)
        {
            System.out.println("Kindly enter your name, dear Customer: ");
            name = scan.nextLine();
            if (name.equalsIgnoreCase("EDIT"))
            {
                System.out.println("Che, an Admin.");
                EditList.editList(IntermediateBill.nameList, IntermediateBill.priceList);
            }
            else
            {
                editCount++;
            }
        }
        System.out.println("Ah, Sir "+name+", welcome, welcome! Please, take a seat, pick your order!");
        while(reorder<1)
        {
            System.out.println("--------------------------------------------------");
            System.out.println("ID\t\t\t\tName\t\t\t\tPrice");
            System.out.println("--------------------------------------------------");
            for (int i = 0; i < IntermediateBill.nameList.size(); i++)
            {
                System.out.println((i+1)+".\t\t\t\t"+IntermediateBill.nameList.get(i)+"\t\t\t\tSGD "+IntermediateBill.priceList.get(i));
            }
            System.out.println("--------------------------------------------------");
            System.out.println("Please sir, what is your order? Pick the ID.");
            order = Integer.parseInt(scan.nextLine());
            if(order>IntermediateBill.nameList.size())
            {
                System.out.println("Sir, please stop joking around");
                annoyance++;
            }
            else
            {
                System.out.println("Ah very good sir. How much of that would you like?");
                quantity = Integer.parseInt(scan.nextLine());
                System.out.println("Your current order would be: ");
                orderString = IntermediateBill.orderPickString(order-1);
                price = IntermediateBill.subtotal(quantity, IntermediateBill.orderPick(order-1));
                System.out.println("Item name:\t\t\t\tQuantity\t\t\t\tSubtotal");
                System.out.println(orderString + "\t\t\t\t\t" + quantity + "\t\t\t\t\t\tSGD " + price);
                
                if (orderList.contains(orderString))
                {
                    quantityList.set(orderList.indexOf(orderString), (quantityList.get(orderList.indexOf(orderString)) + quantity));
                    totalList.set(orderList.indexOf(orderString), (totalList.get(orderList.indexOf(orderString)) + price));
                }
                else
                {
                    totalList.add(price);
                    orderList.add(orderString);
                    quantityList.add(quantity);
                }
                
                
                
                
                System.out.println("Would you like to order more?(Y/N)");
                
                reordering = scan.nextLine();
                if (reordering.toUpperCase().equals("N"))
                {
                    for (int i=0;i<totalList.size();i++)
                    {
                        totalPrice+=totalList.get(i);
                    }
                    System.out.println("Your final bill, sir.");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Item name:\t\t\t\tQuantity\t\t\t\tSubtotal");
                    for (int i = 0; i < orderList.size(); i++)
                    {
                        System.out.println(orderList.get(i)+"\t\t\t\t\t"+quantityList.get(i)+"\t\t\t\t\t\tSGD "+totalList.get(i));
                    }
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Your total to pay is:\t\t\t\t\t\t\tSGD "+totalPrice);
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Thank you, have a great day!");
                    
                    reorder++;
                    
                }
                else
                {
                    continue;
                }
            }
            if(annoyance>10)
            {
                System.out.println("ALRIGHT THAT'S IT GET OUT");
                reorder++;
            }
            
            
        }
        
   
    
         */
    }
}
class WarehouseSections
{
    ArrayList<String> SectionList = new ArrayList<>(Arrays.asList("Frozen Items", "Dried Items", "Fresh Items"));
    
}
/*
class IntermediateBill
{
    static int subtotal(int quantity, int price)
    {
        return quantity * price;
    }
    
    //static Scanner scanPriceFile = new Scanner(new File("F:\\DXC Java Lessons\\Res\\priceList.txt"));
    static ArrayList<Integer> priceList = new ArrayList<>(Arrays.asList(10, 20, 100, 150, 75)); //Read from file?
    
    static ArrayList<Integer> priceListtest = new ArrayList<>();
    /*static void insertPrice()
    {
        while(scanPriceFile.hasNextLine())
        {
            System.out.println(scanPriceFile.nextLine());
        }
    }
    
    
    
    static int orderPick(int selection)
    {
        int priceReturn = priceList.get(selection);
        return priceReturn;
    }
    static ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Water", "Coke", "Pizza", "Burger", "Fries"));
    
    static String orderPickString(int selection)
    {
        String s = nameList.get(selection);
        
        return s;
    }
}
*/
/*
class EditList
{
    static void editList(ArrayList<String> nameList, ArrayList<Integer> priceList)
    {
        
        int countFinal = 0;
        while (countFinal < 1)
        {
            int count = 0;
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < IntermediateBill.nameList.size(); i++)
            {
                System.out.println((i+1)+".\t\t\t\t"+IntermediateBill.nameList.get(i)+"\t\t\t\tSGD "+IntermediateBill.priceList.get(i));
            }
            System.out.println("Add, edit or remove? (Type exit to exit editing)");
            String s = scan.nextLine();
            if (s.equalsIgnoreCase("ADD"))
            {
                while (count < 1)
                {
                    System.out.println("Name of additional item:");
                    String p = scan.nextLine();
                    if (nameList.contains(p))
                    {
                        System.out.println("Lies");
                    } else
                    {
                        nameList.add(p);
                        System.out.println("Right, how much is that then?");
                        int i = Integer.parseInt(scan.nextLine());
                        priceList.add(i);
                        System.out.println("Would you like to add more items?(Y/N)");
                        p = scan.nextLine();
                        if (p.equalsIgnoreCase("N"))
                        {
                            count++;
                        }
                        
                    }
                }
            }
            if (s.toUpperCase().equals("EDIT"))
            {
                while (count < 1)
                {
                    System.out.println("Which item to edit?");
                    String p = scan.nextLine();
                    if (nameList.contains(p))
                    {
                        System.out.println("Name, or price?");
                        String q = scan.nextLine();
                        if (q.equalsIgnoreCase("NAME"))
                        {
                            System.out.println("What would you like to change to? ");
                            String changeNameTo = scan.nextLine();
                            nameList.set(nameList.indexOf(p), changeNameTo);
                            System.out.println("Edited, anymore? (Y/N)");
                            p = scan.nextLine();
                            if (p.equalsIgnoreCase("N"))
                            {
                                count++;
                            }
                        } else if (q.equalsIgnoreCase("PRICE"))
                        {
                            System.out.println("What would you like to change price to? ");
                            int changePriceTo = Integer.parseInt(scan.nextLine());
                            priceList.set(nameList.indexOf(p), changePriceTo);
                            System.out.println("Edited, anymore? (Y/N)");
                            p = scan.nextLine();
                            if (p.equalsIgnoreCase("N"))
                            {
                                count++;
                            }
                        }
                    } else
                    {
                        System.out.println("Lies");
                        
                    }
                }
            }
            if (s.equalsIgnoreCase("REMOVE"))
            {
                while(count<1)
                {
                    System.out.println("Select name of item to remove: ");
                    String p = scan.nextLine();
                    if (nameList.contains(p))
                    {
                        int priceFromNameList = nameList.indexOf(p);
                        nameList.remove(p);
                        priceList.remove(priceFromNameList);
                        System.out.println("Removed, anymore? (Y/N)");
                        p = scan.nextLine();
                        if (p.equalsIgnoreCase("N"))
                        {
                            count++;
                        }
                        
                    } else
                    {
                        
                        System.out.println("Lies");
                        
                    }
                }
            }
            if(s.equalsIgnoreCase("EXIT"))
            {
                countFinal++;
            }
        }
    }
}

 */
/*
class Bill
{
    int itemID;
    int itemPrice;
    String name;
    int subtotal;
}
 */
class OverallReordering
{
    
    Scanner scan = new Scanner(System.in);
    ArrayList<String> itemList;
    ArrayList<Integer> quantityList;
    
    OverallReordering(ArrayList<String> itemList, ArrayList<Integer> quantityList)
    {
        this.itemList=itemList;
        this.quantityList=quantityList;
    }
    void chooseOne(WarehouseReordering ref)
    {
    
        ref.displayItems(itemList, quantityList);
        System.out.println("1 to add, 2 to remove, 3 to edit");
        int menuSelect = Integer.parseInt(scan.nextLine());
        switch (menuSelect)
        {
            case 1:
                ref.addItems(itemList, quantityList);
                break;
            case 2:
                ref.removeItems(itemList, quantityList);
                break;
            case 3:
                ref.editItems(itemList, quantityList);
                break;
            case 4:
                ref.displayItems(itemList, quantityList);
    
                break;
            default:
                break;
        }
    }
}
class WarehouseReordering
{
    Scanner scan = new Scanner(System.in);
    int count = 0;
    //int menuSelect = Integer.parseInt(scan.nextLine());
    void addItems(ArrayList<String> itemList, ArrayList<Integer> quantityList)
    {
        while (true)
        {
            System.out.println("Name of additional item:");
            String p = scan.nextLine();
            if (itemList.contains(p))
            {
                System.out.println("Lies");
            } else
            {
                itemList.add(p);
                System.out.println("Quantity?");
                int i = Integer.parseInt(scan.nextLine());
                quantityList.add(i);
                System.out.println("Would you like to add more items?(Y/N)");
                p = scan.nextLine();
                if (p.equalsIgnoreCase("N"))
                {
                    break;
                }
                
            }
        }
    }
    void removeItems(ArrayList<String> itemList, ArrayList<Integer> quantityList)
    {
        while(true)
        {
            System.out.println("Select name of item to remove: ");
            String p = scan.nextLine();
            if (itemList.contains(p))
            {
                int quantityFromItemList = itemList.indexOf(p);
                itemList.remove(p);
                quantityList.remove(quantityFromItemList);
                System.out.println("Removed, anymore? (Y/N)");
                p = scan.nextLine();
                if (p.equalsIgnoreCase("N"))
                {
                    break;
                }
                
            } else
            {
                
                System.out.println("Lies");
                
            }
        }
    }
    void editItems(ArrayList<String> itemList, ArrayList<Integer> quantityList)
    {
    
    }
    void displayItems(ArrayList<String> itemList, ArrayList<Integer> quantityList)
    {
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < itemList.size(); i++) //Change to warehouse section listings
        {
            System.out.println((i + 1) + ".\t\t\t\t" + itemList.get(i)+ ".\t\t\t\t" + quantityList.get(i));
        }
        System.out.println("--------------------------------------------------");
    }
}

class FrozenSection extends WarehouseReordering
{
    
    void temp()
    {
        Random r = new Random();
        System.out.printf("Current Temperature: %.2f",r.nextDouble(-20, -15));
        System.out.print("°C");
        System.out.println();
    }
}
