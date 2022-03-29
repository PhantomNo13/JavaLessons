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
        ArrayList<Integer> quantityDriedList = new ArrayList<>(Arrays.asList(10, 2121));
        ArrayList<String> itemFreshList = new ArrayList<>(Arrays.asList("Live Chicken", "Live Goat"));
        ArrayList<Integer> quantityFreshList = new ArrayList<>(Arrays.asList(1231, 2211));
    
    
        WarehouseSections ws = new WarehouseSections();
        OverallReordering fs = new OverallReordering(itemFrozenList, quantityFrozenList);
        OverallReordering ds = new OverallReordering(itemDriedList, quantityDriedList);
        OverallReordering frs = new OverallReordering(itemFreshList, quantityFreshList);
        FrozenSection fs1 = new FrozenSection();
        WarehouseReordering wr = new WarehouseReordering();
    
        int count = 0;
   
    
        Scanner scan = new Scanner(System.in);
    
    
        while (count < 1)
        {
            System.out.println("Select section: ");
            System.out.println("--------------------------------------------------");
            for (int i = 0; i < ws.SectionList.size(); i++) //Change to warehouse section listings
            {
                System.out.println((i + 1) + ".\t\t\t\t" + ws.SectionList.get(i));
            }
            System.out.println("--------------------------------------------------");
            int deathCount = 0;
    
            String menuSelect = "";
    
            while (true)
            {
                try
                {
                    menuSelect = scan.nextLine().toUpperCase();
                    break;
                } catch (Exception I)
                {
                    System.out.println(I);
                    System.out.println("WRONG ANSWER");
                    deathCount++;
                }
                if (deathCount == 10)
                {
                    System.out.println("SYSTEM SHUTDOWN");
                    System.exit(0);
                } else if (deathCount == 9)
                {
                    System.out.println("SHUTDOWN IMMINENT");
                }
            }
            switch (menuSelect)
            {
                case "1":
                    while (true)
                    {
    
                        fs.chooseOne(fs1);
    
    
                        break;
                    }
    
                    break;
                case "2":
                    
                    ds.chooseOne(wr);
                    break;
                case "3":
                    frs.chooseOne(wr);
                    break;
                default:
                    System.out.println("Haha, nice try.");
                    break;
                case "EXIT":
                    count++;
                    break;
    
            }
        }
    }
}

        

class WarehouseSections
{
    ArrayList<String> SectionList = new ArrayList<>(Arrays.asList("Frozen Items", "Dried Items", "Fresh Items"));
    
}

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
        System.out.println("1 to add, 2 to remove, 3 to edit, 4 to display items, 5 for special function");
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
            case 5:
                ref.specialFunction();
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
            System.out.println("Select ID of item to remove: ");
            int p;
            while(true)
            {
                try
                {
                    p = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException e)
                {
                    System.out.println("Liar");
                }
            }
            p = p-1;
            if ((p) <= itemList.size())
            {
                //int quantityFromItemList = itemList.indexOf(p);
                itemList.remove(p);
                quantityList.remove(p);
                System.out.println("Removed, anymore? (Y/N)");
                String q = scan.nextLine();
                if (q.equalsIgnoreCase("N"))
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
        
            while (count < 1)
            {
                System.out.println("Which item ID to edit?");
                int p;
                while(true)
                {
                    try
                    {
                        p = Integer.parseInt(scan.nextLine());
                        break;
                    } catch (NumberFormatException e)
                    {
                        System.out.println("Liar");
                    }
                }
                p = p-1;
                if(p<=itemList.size())
                {
                    System.out.println("Name, or price?");
                    String q = scan.nextLine();
                    if (q.equalsIgnoreCase("NAME"))
                    {
                        System.out.println("What would you like to change to? ");
                        String changeNameTo = scan.nextLine();
                        itemList.set(p, changeNameTo);
                        System.out.println("Edited, anymore? (Y/N)");
                        q = scan.nextLine();
                        if (q.equalsIgnoreCase("N"))
                        {
                            count++;
                        }
                    } else if (q.equalsIgnoreCase("PRICE"))
                    {
                        System.out.println("What would you like to change price to? ");
                        int changePriceTo = Integer.parseInt(scan.nextLine());
                        quantityList.set(p, changePriceTo);
                        System.out.println("Edited, anymore? (Y/N)");
                        q = scan.nextLine();
                        if (q.equalsIgnoreCase("N"))
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
    void displayItems(ArrayList<String> itemList, ArrayList<Integer> quantityList)
    {
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < itemList.size(); i++) //Change to warehouse section listings
        {
            System.out.println((i + 1) + ".\t\t\t\t" + itemList.get(i)+ "\t\t\t\t" + quantityList.get(i));
        }
        System.out.println("--------------------------------------------------");
    }
    void specialFunction()
    {
    
    }
    
}

class FrozenSection extends WarehouseReordering
{
    
    void specialFunction()
    {
        Random r = new Random();
        System.out.printf("Current Temperature: %.2f",r.nextDouble(-20, -15));
        System.out.print("°C");
        System.out.println();
    }
}

class DriedSection extends WarehouseReordering
{
    void specialFunction()
    {
    
    }
}

class FreshSection extends WarehouseReordering
{
    void specialFunction()
    {
        
    }
}