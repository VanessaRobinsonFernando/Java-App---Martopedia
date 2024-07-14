/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martopediareal;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Font;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;



/**
 *
 * @author zobia
 */
public class UserInterface extends javax.swing.JFrame {

    /**
     * Creates new form UserInterface
     */
    
    //The following method generates random number so that each order gets a unique number
    public void randomnumbers() {  
          Random random = new Random();
          int no = random.nextInt(1000000)+1;
          String value1 = String.valueOf(no);
          UserInterface.RandomNoLabel.setText(value1);
      }
    
    public UserInterface() {
        initComponents();
        randomnumbers();
        
        //Visibility is set false
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
                                                                                                                                        
        
        
        
        
        RequiredLabel.setVisible(false);
        
        //Panels will be invisible initially when the application runs
        jLayeredPane2.setVisible(false);
        
        ItemCode.setEditable(false);
        BrandItem.setEditable(false);
        Price.setEditable(false);
        
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);               
        BreadTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        BreadTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        BreadTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        BreadTable.getColumnModel().getColumn(1).setPreferredWidth(278);  
        BreadTable.getColumnModel().getColumn(2).setPreferredWidth(116);
        BreadTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);           
        DessertTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        DessertTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        DessertTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        DessertTable.getColumnModel().getColumn(1).setPreferredWidth(278);  
        DessertTable.getColumnModel().getColumn(2).setPreferredWidth(116);
        DessertTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);        
        CoffeeTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        CoffeeTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        CoffeeTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        CoffeeTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        CoffeeTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        CoffeeTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);        
        JuiceTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        JuiceTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        JuiceTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        JuiceTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        JuiceTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        JuiceTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);        
        NutritionTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        NutritionTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        NutritionTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        NutritionTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        NutritionTable.getColumnModel().getColumn(2).setPreferredWidth(113);  
        NutritionTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);        
        TeaTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        TeaTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        TeaTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        TeaTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        TeaTable.getColumnModel().getColumn(2).setPreferredWidth(113);  
        TeaTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);        
        VeganTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        VeganTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        VeganTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        VeganTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        VeganTable.getColumnModel().getColumn(2).setPreferredWidth(113);  
         VeganTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);        
        WaterTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        WaterTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        WaterTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        WaterTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        WaterTable.getColumnModel().getColumn(2).setPreferredWidth(113);  
         WaterTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);        
        ButterTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        ButterTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        ButterTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        ButterTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        ButterTable.getColumnModel().getColumn(2).setPreferredWidth(113);
         ButterTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);
        CheeseTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        CheeseTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        CheeseTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        CheeseTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        CheeseTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        CheeseTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        EggPane.setVisible(false);
        EggTable.setVisible(false);
        EggTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        EggTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        EggTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        EggTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        EggTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        EggTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);
        CreamTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        CreamTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        CreamTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        CreamTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        CreamTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        CreamTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        MilkTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        MilkTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        MilkTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        MilkTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        MilkTable.getColumnModel().getColumn(2).setPreferredWidth(113);   
        MilkTable.getColumnModel().getColumn(3).setPreferredWidth(80);


        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        YoghurtTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        YoghurtTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        YoghurtTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        YoghurtTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        YoghurtTable.getColumnModel().getColumn(2).setPreferredWidth(113);   
        YoghurtTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        BakingTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        BakingTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        BakingTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        BakingTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        BakingTable.getColumnModel().getColumn(2).setPreferredWidth(113);   
        BakingTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        ChipsTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        ChipsTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        ChipsTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        ChipsTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        ChipsTable.getColumnModel().getColumn(2).setPreferredWidth(113);   
        ChipsTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        NoodlesTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        NoodlesTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        NoodlesTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        NoodlesTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        NoodlesTable.getColumnModel().getColumn(2).setPreferredWidth(113);   
        NoodlesTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        RiceTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        RiceTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        RiceTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        RiceTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        RiceTable.getColumnModel().getColumn(2).setPreferredWidth(113);    
        RiceTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        SweetenerTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        SweetenerTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        SweetenerTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        SweetenerTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        SweetenerTable.getColumnModel().getColumn(2).setPreferredWidth(113);  
        SweetenerTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FruitTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        FruitTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        FruitTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        FruitTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        FruitTable.getColumnModel().getColumn(2).setPreferredWidth(113);         
        FruitTable.getColumnModel().getColumn(3).setPreferredWidth(80);

                
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        VegTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        VegTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        VegTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        VegTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        VegTable.getColumnModel().getColumn(2).setPreferredWidth(113);  
        VegTable.getColumnModel().getColumn(3).setPreferredWidth(80);
         VegTable.getColumnModel().getColumn(3).setPreferredWidth(80);


        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);    
        FrozenTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        FrozenTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        FrozenTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        FrozenTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        FrozenTable.getColumnModel().getColumn(2).setPreferredWidth(113);   
        FrozenTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        DetergentTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        DetergentTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        DetergentTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        DetergentTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        DetergentTable.getColumnModel().getColumn(2).setPreferredWidth(113); 
        DetergentTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        GloveTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        GloveTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        GloveTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        GloveTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        GloveTable.getColumnModel().getColumn(2).setPreferredWidth(113); 
        GloveTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        HairTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        HairTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        HairTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        HairTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        HairTable.getColumnModel().getColumn(2).setPreferredWidth(113); 
        HairTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        SoapTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        SoapTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        SoapTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        SoapTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        SoapTable.getColumnModel().getColumn(2).setPreferredWidth(113); 
        SoapTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        LentilTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        LentilTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        LentilTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        LentilTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        LentilTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        LentilTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        BeanTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        BeanTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        BeanTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        BeanTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        BeanTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        BeanTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        NutTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        NutTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        NutTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        NutTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        NutTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        NutTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        BasilTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        BasilTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        BasilTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        BasilTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        BasilTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        BasilTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
        PeaTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        PeaTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        PeaTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        PeaTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        PeaTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        PeaTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
        PepperTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        PepperTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        PepperTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        PepperTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        PepperTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        PepperTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CinnamonTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        CinnamonTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        CinnamonTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        CinnamonTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        CinnamonTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        CinnamonTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CuminTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
        CuminTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //Auto resize is turned off 
        CuminTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        CuminTable.getColumnModel().getColumn(1).setPreferredWidth(310);  
        CuminTable.getColumnModel().getColumn(2).setPreferredWidth(113);
        CuminTable.getColumnModel().getColumn(3).setPreferredWidth(80);

        
        CurryPane.setVisible(false); //new methods
        CurryTable.setVisible(false);
        CurryTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        CurryTable.getColumnModel().getColumn(1).setPreferredWidth(278);  
        CurryTable.getColumnModel().getColumn(2).setPreferredWidth(116);
        CurryTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        SaltTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        SaltTable.getColumnModel().getColumn(1).setPreferredWidth(278);  
        SaltTable.getColumnModel().getColumn(2).setPreferredWidth(116);
        SaltTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        ThymeTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        ThymeTable.getColumnModel().getColumn(1).setPreferredWidth(278);  
        ThymeTable.getColumnModel().getColumn(2).setPreferredWidth(116);
        ThymeTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        TurmericTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        TurmericTable.getColumnModel().getColumn(1).setPreferredWidth(278);  
        TurmericTable.getColumnModel().getColumn(2).setPreferredWidth(116);
        TurmericTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
        PeaTable.getColumnModel().getColumn(0).setPreferredWidth(120);  
        PeaTable.getColumnModel().getColumn(1).setPreferredWidth(278);  
        PeaTable.getColumnModel().getColumn(2).setPreferredWidth(116);  
        PeaTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        
    }
    
     public void switchPanels(JPanel panel)  //This is created so that the panels can move whenever "switchPanels" function is called later in other codes
     {
         jLayeredPane2.removeAll();
         jLayeredPane2.add(panel);
         jLayeredPane2.repaint();
         jLayeredPane2.revalidate();
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BreadPane = new javax.swing.JScrollPane();
        BreadTable = new javax.swing.JTable();
        DessertPane = new javax.swing.JScrollPane();
        DessertTable = new javax.swing.JTable();
        CoffeePane = new javax.swing.JScrollPane();
        CoffeeTable = new javax.swing.JTable();
        JuicePane = new javax.swing.JScrollPane();
        JuiceTable = new javax.swing.JTable();
        NutritionPane = new javax.swing.JScrollPane();
        NutritionTable = new javax.swing.JTable();
        TeaPane = new javax.swing.JScrollPane();
        TeaTable = new javax.swing.JTable();
        VeganPane = new javax.swing.JScrollPane();
        VeganTable = new javax.swing.JTable();
        WaterPane = new javax.swing.JScrollPane();
        WaterTable = new javax.swing.JTable();
        ButterPane = new javax.swing.JScrollPane();
        ButterTable = new javax.swing.JTable();
        CheesePane = new javax.swing.JScrollPane();
        CheeseTable = new javax.swing.JTable();
        EggPane = new javax.swing.JScrollPane();
        EggTable = new javax.swing.JTable();
        CreamPane = new javax.swing.JScrollPane();
        CreamTable = new javax.swing.JTable();
        MilkPane = new javax.swing.JScrollPane();
        MilkTable = new javax.swing.JTable();
        YoghurtPane = new javax.swing.JScrollPane();
        YoghurtTable = new javax.swing.JTable();
        BakingPane = new javax.swing.JScrollPane();
        BakingTable = new javax.swing.JTable();
        ChipsPane = new javax.swing.JScrollPane();
        ChipsTable = new javax.swing.JTable();
        NoodlesPane = new javax.swing.JScrollPane();
        NoodlesTable = new javax.swing.JTable();
        RicePane = new javax.swing.JScrollPane();
        RiceTable = new javax.swing.JTable();
        SweetenerPane = new javax.swing.JScrollPane();
        SweetenerTable = new javax.swing.JTable();
        FruitPane = new javax.swing.JScrollPane();
        FruitTable = new javax.swing.JTable();
        VegPane = new javax.swing.JScrollPane();
        VegTable = new javax.swing.JTable();
        FrozenPane = new javax.swing.JScrollPane();
        FrozenTable = new javax.swing.JTable();
        DetergentPane = new javax.swing.JScrollPane();
        DetergentTable = new javax.swing.JTable();
        GlovePane = new javax.swing.JScrollPane();
        GloveTable = new javax.swing.JTable();
        HairPane = new javax.swing.JScrollPane();
        HairTable = new javax.swing.JTable();
        SoapPane = new javax.swing.JScrollPane();
        SoapTable = new javax.swing.JTable();
        BeanPane = new javax.swing.JScrollPane();
        BeanTable = new javax.swing.JTable();
        LentilPane = new javax.swing.JScrollPane();
        LentilTable = new javax.swing.JTable();
        NutPane = new javax.swing.JScrollPane();
        NutTable = new javax.swing.JTable();
        PeaPane = new javax.swing.JScrollPane();
        PeaTable = new javax.swing.JTable();
        BasilPane = new javax.swing.JScrollPane();
        BasilTable = new javax.swing.JTable();
        PepperPane = new javax.swing.JScrollPane();
        PepperTable = new javax.swing.JTable();
        CinnamonPane = new javax.swing.JScrollPane();
        CinnamonTable = new javax.swing.JTable();
        CuminPane = new javax.swing.JScrollPane();
        CuminTable = new javax.swing.JTable();
        CurryPane = new javax.swing.JScrollPane();
        CurryTable = new javax.swing.JTable();
        SaltPane = new javax.swing.JScrollPane();
        SaltTable = new javax.swing.JTable();
        ThymePane = new javax.swing.JScrollPane();
        ThymeTable = new javax.swing.JTable();
        TurmericPane = new javax.swing.JScrollPane();
        TurmericTable = new javax.swing.JTable();
        headerPanel = new javax.swing.JPanel();
        logOUT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        myCart = new javax.swing.JButton();
        CategoriesPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        BakeryButton = new javax.swing.JLabel();
        BeveButton = new javax.swing.JLabel();
        DairyButton = new javax.swing.JLabel();
        DryBakingButton = new javax.swing.JLabel();
        FreshProduceButton = new javax.swing.JLabel();
        FrozenButton = new javax.swing.JLabel();
        HygieneButton = new javax.swing.JLabel();
        PulsesButton = new javax.swing.JLabel();
        SpicesButton = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        BakeryPanel = new javax.swing.JPanel();
        BreadButton = new javax.swing.JLabel();
        DessertsButton = new javax.swing.JLabel();
        BeveragePanel = new javax.swing.JPanel();
        CoffeeButton = new javax.swing.JLabel();
        JuiceButton = new javax.swing.JLabel();
        NutritionButton = new javax.swing.JLabel();
        TeaButton = new javax.swing.JLabel();
        VeganButton = new javax.swing.JLabel();
        WaterButton = new javax.swing.JLabel();
        DairyPanel = new javax.swing.JPanel();
        ButterButton = new javax.swing.JLabel();
        CheeseButton = new javax.swing.JLabel();
        CreamButton = new javax.swing.JLabel();
        EggButton = new javax.swing.JLabel();
        MilkButton = new javax.swing.JLabel();
        YoghurtButton = new javax.swing.JLabel();
        BakingPanel = new javax.swing.JPanel();
        BakingButton = new javax.swing.JLabel();
        ChipsSnackButton = new javax.swing.JLabel();
        NoodlesButton = new javax.swing.JLabel();
        RiceButton = new javax.swing.JLabel();
        SweetnerButton = new javax.swing.JLabel();
        freshProPanel = new javax.swing.JPanel();
        FruitsButton = new javax.swing.JLabel();
        VegButton = new javax.swing.JLabel();
        FrozenPanel = new javax.swing.JPanel();
        FrozenFButton = new javax.swing.JLabel();
        HygieneItemsPanel = new javax.swing.JPanel();
        DetergentButton = new javax.swing.JLabel();
        GlovesButton = new javax.swing.JLabel();
        hairWashButton = new javax.swing.JLabel();
        SoapsButton = new javax.swing.JLabel();
        PulsesPanel = new javax.swing.JPanel();
        BeansButton = new javax.swing.JLabel();
        LentilsButton = new javax.swing.JLabel();
        NutsButton = new javax.swing.JLabel();
        PeasButton = new javax.swing.JLabel();
        SpicesPanel = new javax.swing.JPanel();
        BasilButton = new javax.swing.JLabel();
        BlackPButton = new javax.swing.JLabel();
        CinnamonButton = new javax.swing.JLabel();
        CuminButton = new javax.swing.JLabel();
        CurryButton = new javax.swing.JLabel();
        SaltButton = new javax.swing.JLabel();
        ThymeButton = new javax.swing.JLabel();
        TurmericPButton = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        DisplayPanel = new javax.swing.JPanel();
        Quantity = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addToCart = new javax.swing.JButton();
        Price = new javax.swing.JTextField();
        BrandItem = new javax.swing.JTextField();
        ItemCode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RandomNoLabel = new javax.swing.JLabel();
        WeightPiece = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        RequiredLabel = new javax.swing.JLabel();
        turmericBG = new javax.swing.JLabel();
        thymeBG = new javax.swing.JLabel();
        saltBG = new javax.swing.JLabel();
        curryBG = new javax.swing.JLabel();
        cuminBG = new javax.swing.JLabel();
        cinnamonBG = new javax.swing.JLabel();
        blackPBG = new javax.swing.JLabel();
        basilBG = new javax.swing.JLabel();
        peaBG = new javax.swing.JLabel();
        nutBG = new javax.swing.JLabel();
        lentilBG = new javax.swing.JLabel();
        beanBG = new javax.swing.JLabel();
        soapBG = new javax.swing.JLabel();
        hairBG = new javax.swing.JLabel();
        gloveBG = new javax.swing.JLabel();
        detergentBG = new javax.swing.JLabel();
        frozenBG = new javax.swing.JLabel();
        vegeBG = new javax.swing.JLabel();
        fruitBG = new javax.swing.JLabel();
        sweetBG = new javax.swing.JLabel();
        riceBG = new javax.swing.JLabel();
        noodlesBG = new javax.swing.JLabel();
        chipsBG = new javax.swing.JLabel();
        bakingBG = new javax.swing.JLabel();
        yoghurtBG = new javax.swing.JLabel();
        milkBG = new javax.swing.JLabel();
        eggBG = new javax.swing.JLabel();
        creamBG = new javax.swing.JLabel();
        cheeseBG = new javax.swing.JLabel();
        butterBG = new javax.swing.JLabel();
        waterBG = new javax.swing.JLabel();
        veganBG = new javax.swing.JLabel();
        teaBG = new javax.swing.JLabel();
        nutritionBG = new javax.swing.JLabel();
        juiceBG = new javax.swing.JLabel();
        coffeeBG = new javax.swing.JLabel();
        breadBG = new javax.swing.JLabel();
        dessertBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BreadPane.setBackground(new java.awt.Color(255, 255, 255));

        BreadTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BreadTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"BR101", "Dahabi", "600 g", "6"},
                {"BR202", "Golden Loaf Brown", "600 g", "5.5"},
                {"BR303", "Golden Loaf White", "600 g", "5.5"},
                {"BR404", "L'usine Brown", "600 g", "7"},
                {"BR505", "L'usine White", "600 g", "7"},
                {"BR606", "L'usine Whole Wheat", "600 g", "7"},
                {"BR707", "L'usine Burger Buns", "6 pcs", "6.5"},
                {"BR808", "L'usine Sandwich Roll", "11.25 g", "5.5"},
                {"BR909", "Mission Tortilla Wraps", "6 pcs", "10.25"},
                {"BR1010", "Modern Bakery Brown", "600 g", "5"},
                {"BR1020", "Modern Bakery White", "600 g", "5"},
                {"BR1030", "Modern Bakery Burger Buns", "6 pcs", "6.5"},
                {"BR1040", "Modern Bakery Lebanese Bread", "6 pcs", "2"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BreadTable.setRowHeight(30);
        BreadTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        BreadTable.getTableHeader().setReorderingAllowed(false);
        BreadTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BreadTableMouseClicked(evt);
            }
        });
        BreadPane.setViewportView(BreadTable);
        if (BreadTable.getColumnModel().getColumnCount() > 0) {
            BreadTable.getColumnModel().getColumn(0).setResizable(false);
            BreadTable.getColumnModel().getColumn(1).setResizable(false);
            BreadTable.getColumnModel().getColumn(2).setResizable(false);
            BreadTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(BreadPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 430));

        DessertTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DessertTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"DS101", "Chocolate Cookies", "28 g x 10", "12"},
                {"DS202", "Chocolate Cupcakes", "60 g", "1.5"},
                {"DS303", "Fudgee Barr", "200 g", "8.5"},
                {"DS404", "Honey Cake", "1 Kg", "45.5"},
                {"DS505", "Strawberry Cupcake", "60 g", "1.5"},
                {"DS606", "Super Roll", "360 g", "7.5"},
                {"DS707", "Two Bite Brownies", "265 g", "14"},
                {"DS808", "Vanilla Cupcakes", "60 g", "1.5 "}
            },
            new String [] {
                "Item Code", "Desserts", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DessertTable.setRowHeight(30);
        DessertTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        DessertTable.getTableHeader().setReorderingAllowed(false);
        DessertTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DessertTableMouseClicked(evt);
            }
        });
        DessertPane.setViewportView(DessertTable);
        if (DessertTable.getColumnModel().getColumnCount() > 0) {
            DessertTable.getColumnModel().getColumn(0).setResizable(false);
            DessertTable.getColumnModel().getColumn(1).setResizable(false);
            DessertTable.getColumnModel().getColumn(2).setResizable(false);
            DessertTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(DessertPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 290));

        CoffeeTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CoffeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CF101", "AliCafe French Roast Coffee Jar", "50 g", "12"},
                {"CF202", "Espresso Venezia", "30 pcs", "15"},
                {"CF303", "Italian Espresso Napoli", "30 pcs", "20"},
                {"CF404", "Organic Espresso", "30 pcs", "15"},
                {"CF505", "Kava Noir Roasted Coffee Beans", "1 Kg", "25"}
            },
            new String [] {
                "Item Code", "Brands", "Weight/Price", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CoffeeTable.setRowHeight(30);
        CoffeeTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        CoffeeTable.getTableHeader().setReorderingAllowed(false);
        CoffeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoffeeTableMouseClicked(evt);
            }
        });
        CoffeePane.setViewportView(CoffeeTable);
        if (CoffeeTable.getColumnModel().getColumnCount() > 0) {
            CoffeeTable.getColumnModel().getColumn(0).setResizable(false);
            CoffeeTable.getColumnModel().getColumn(1).setResizable(false);
            CoffeeTable.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(CoffeePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        JuiceTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JuiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"JC101", "Aqua Coco Coconut Water", "330 ml", "6"},
                {"JC202", "Lacnor Essentials Mango Fruit Drink ", "180ml x 8pcs", "12"},
                {"JC303", "Lulu Basil Seed Drink Passion Fruit", "290 ml", "20"},
                {"JC404", "Sun Blast Organic Apple Juice", "200ml x 10pcs", "15"},
                {"JC505", "Suntop Berry Mix Juice", "125ml x 6pcs", "10"}
            },
            new String [] {
                "Item Code", "Brands", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JuiceTable.setRowHeight(30);
        JuiceTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        JuiceTable.getTableHeader().setReorderingAllowed(false);
        JuiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JuiceTableMouseClicked(evt);
            }
        });
        JuicePane.setViewportView(JuiceTable);
        if (JuiceTable.getColumnModel().getColumnCount() > 0) {
            JuiceTable.getColumnModel().getColumn(0).setResizable(false);
            JuiceTable.getColumnModel().getColumn(1).setResizable(false);
            JuiceTable.getColumnModel().getColumn(2).setResizable(false);
            JuiceTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(JuicePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        NutritionTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NutritionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NT101", "Boost Complete", "100 g", "12"},
                {"NT202", "Herbal Plus Senna Leaf Extract", "125 g", "20"},
                {"NT303", "Glutamine Dietary Supplement ", "120 pcs", "21"},
                {"NT404", "GNC Alani Nu Energy Sour", "50 g", "15.75"},
                {"NT505", " Valley Protein", "20", "14.5"}
            },
            new String [] {
                "Item Code", "Brands", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NutritionTable.setRowHeight(30);
        NutritionTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        NutritionTable.getTableHeader().setReorderingAllowed(false);
        NutritionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NutritionTableMouseClicked(evt);
            }
        });
        NutritionPane.setViewportView(NutritionTable);
        if (NutritionTable.getColumnModel().getColumnCount() > 0) {
            NutritionTable.getColumnModel().getColumn(0).setResizable(false);
            NutritionTable.getColumnModel().getColumn(1).setResizable(false);
            NutritionTable.getColumnModel().getColumn(2).setResizable(false);
            NutritionTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(NutritionPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        TeaTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TeaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"TA101", "Alitea Signature 3in1 Karak Tea", "800 g", "22"},
                {"TA202", "Brooke Bond Red Label Black", "800 g", "20"},
                {"TA303", "Eastern Black Tea Dust", "200 g", "10.25"},
                {"TA404", "Kanan Devan Tea Dust Jar", "400 g", "24"},
                {"TA505", "Lipton Yellow Label Black Tea", "200 pcs", "17.25"}
            },
            new String [] {
                "Item Code", "Brands", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TeaTable.setRowHeight(30);
        TeaTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        TeaTable.getTableHeader().setReorderingAllowed(false);
        TeaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeaTableMouseClicked(evt);
            }
        });
        TeaPane.setViewportView(TeaTable);
        if (TeaTable.getColumnModel().getColumnCount() > 0) {
            TeaTable.getColumnModel().getColumn(0).setResizable(false);
            TeaTable.getColumnModel().getColumn(1).setResizable(false);
            TeaTable.getColumnModel().getColumn(2).setResizable(false);
            TeaTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(TeaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        VeganTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        VeganTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"VN101", "Alpro Organic Coconut Drink", "1 L", "17.5"},
                {"VN202", "Lacnor Essentials Strawberry Flavoured Milk", "125ml x 24", "22"},
                {"VN303", "Oatly Foamable Oat Drink", "1 L", "15"},
                {"VN404", "Danao Juice Drink with Milk 5 Vitamins", "180ml x 6", "10.80"},
                {"VN505", "Yakult Regular Probiotic Drinks ", "80ml x 5", "15"}
            },
            new String [] {
                "Item Code", "Brands", "Weight/Piece", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VeganTable.setRowHeight(30);
        VeganTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        VeganTable.getTableHeader().setReorderingAllowed(false);
        VeganTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VeganTableMouseClicked(evt);
            }
        });
        VeganPane.setViewportView(VeganTable);
        if (VeganTable.getColumnModel().getColumnCount() > 0) {
            VeganTable.getColumnModel().getColumn(0).setResizable(false);
            VeganTable.getColumnModel().getColumn(1).setResizable(false);
            VeganTable.getColumnModel().getColumn(2).setResizable(false);
            VeganTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(VeganPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        WaterTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        WaterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"WT101", "Arwa Natural Bottled Water", "1.5L x 6", "9.75"},
                {"WT202", "Oasis Bottled Water Low Sodium", "1.5L x 6", "5"},
                {"WT303", "Masafi Bottled Drinking Water", "500ml x 12", "8"},
                {"WT404", "Oasis Water bottle", "500ml", "1.5"},
                {"WT505", "Al Ain Zero Sodium Free Drinking Water", "330 ml", "6"}
            },
            new String [] {
                "Item Code", "Brands", "Weight/Piece", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        WaterTable.setRowHeight(30);
        WaterTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        WaterTable.getTableHeader().setReorderingAllowed(false);
        WaterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WaterTableMouseClicked(evt);
            }
        });
        WaterPane.setViewportView(WaterTable);
        if (WaterTable.getColumnModel().getColumnCount() > 0) {
            WaterTable.getColumnModel().getColumn(0).setResizable(false);
            WaterTable.getColumnModel().getColumn(1).setResizable(false);
            WaterTable.getColumnModel().getColumn(2).setResizable(false);
            WaterTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(WaterPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        ButterTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ButterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"BT101", "Lurpak", "500 g", "10"},
                {"BT202", "Almarai ", "500 g", "10.5"},
                {"BT303", "Amul ", "500 g", "11"},
                {"BT404", "Kerrygold", "500 g", "11.5"}
            },
            new String [] {
                "Item Code", "Item Name", "Weight/Piece", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ButterTable.setRowHeight(30);
        ButterTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        ButterTable.getTableHeader().setReorderingAllowed(false);
        ButterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButterTableMouseClicked(evt);
            }
        });
        ButterPane.setViewportView(ButterTable);
        if (ButterTable.getColumnModel().getColumnCount() > 0) {
            ButterTable.getColumnModel().getColumn(0).setResizable(false);
            ButterTable.getColumnModel().getColumn(1).setResizable(false);
            ButterTable.getColumnModel().getColumn(2).setResizable(false);
            ButterTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(ButterPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 170));

        CheeseTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CheeseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CH202", "Al Marai", "500 g", "12.5"},
                {"CH101", "Al Rawabi", "500 g", "13"},
                {"CH303", "Kiri", "500 g", "13.25"},
                {"CH404", "Kraft", "500 g", "13.25"},
                {"CH505", "Puck", "500 g", "12"}
            },
            new String [] {
                "Item Code", "Item Name", "Weight/Piece", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CheeseTable.setRowHeight(30);
        CheeseTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        CheeseTable.getTableHeader().setReorderingAllowed(false);
        CheeseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheeseTableMouseClicked(evt);
            }
        });
        CheesePane.setViewportView(CheeseTable);
        if (CheeseTable.getColumnModel().getColumnCount() > 0) {
            CheeseTable.getColumnModel().getColumn(0).setResizable(false);
            CheeseTable.getColumnModel().getColumn(1).setResizable(false);
            CheeseTable.getColumnModel().getColumn(2).setResizable(false);
            CheeseTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(CheesePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        EggTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EggTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"E303", "Garden Fresh brown ", "12 pcs", "10"},
                {"E404", "Jenan white ", "12 pcs", "8"},
                {"E101", "Omega 3 white ", "12 pcs", "10"},
                {"E202", "Saha brown ", "12 pcs", "9.5"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Piece", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EggTable.setRowHeight(30);
        EggTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        EggTable.getTableHeader().setReorderingAllowed(false);
        EggTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EggTableMouseClicked(evt);
            }
        });
        EggPane.setViewportView(EggTable);
        if (EggTable.getColumnModel().getColumnCount() > 0) {
            EggTable.getColumnModel().getColumn(0).setResizable(false);
            EggTable.getColumnModel().getColumn(1).setResizable(false);
            EggTable.getColumnModel().getColumn(2).setResizable(false);
            EggTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(EggPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 170));

        CreamTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CreamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CC101", "Almarai", "500 g", "12.5"},
                {"CC202", "Al Rawabi ", "500 g", "13.5"},
                {"CC404", "Nestle ", "500 g", "13"},
                {"CC303", "Puck ", "500 g", "12"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CreamTable.setRowHeight(30);
        CreamTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        CreamTable.getTableHeader().setReorderingAllowed(false);
        CreamTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreamTableMouseClicked(evt);
            }
        });
        CreamPane.setViewportView(CreamTable);
        if (CreamTable.getColumnModel().getColumnCount() > 0) {
            CreamTable.getColumnModel().getColumn(0).setResizable(false);
            CreamTable.getColumnModel().getColumn(1).setResizable(false);
            CreamTable.getColumnModel().getColumn(2).setResizable(false);
            CreamTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(CreamPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 170));

        MilkTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MilkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"M101", "Al Ain Dairy", "1 L ", "5.00"},
                {"M202", "Al Marai", "1 L ", "6"},
                {"M303", "Al Rawabi", "1 L ", "5.50"},
                {"M404", "Brookside", "1 L ", "6.50"},
                {"M505", "Marmum", "1 L ", "5.00"}
            },
            new String [] {
                "Item Code", "Brand Name", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MilkTable.setRowHeight(30);
        MilkTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        MilkTable.getTableHeader().setReorderingAllowed(false);
        MilkTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MilkTableMouseClicked(evt);
            }
        });
        MilkPane.setViewportView(MilkTable);
        if (MilkTable.getColumnModel().getColumnCount() > 0) {
            MilkTable.getColumnModel().getColumn(0).setResizable(false);
            MilkTable.getColumnModel().getColumn(1).setResizable(false);
            MilkTable.getColumnModel().getColumn(2).setResizable(false);
            MilkTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(MilkPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        YoghurtTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        YoghurtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Y101", "Al Ain Dairy", "1Kg", "8.5"},
                {"Y202", "Al Marai", "1Kg", "8.5"},
                {"Y303", "Al Rawabi", "1Kg", "8"},
                {"Y404", "Brookside", "1Kg", "7.5"},
                {"Y505", "Marmum", "1Kg", "7"}
            },
            new String [] {
                "Item Code", "Brand", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        YoghurtTable.setRowHeight(30);
        YoghurtTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        YoghurtTable.getTableHeader().setReorderingAllowed(false);
        YoghurtTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YoghurtTableMouseClicked(evt);
            }
        });
        YoghurtPane.setViewportView(YoghurtTable);
        if (YoghurtTable.getColumnModel().getColumnCount() > 0) {
            YoghurtTable.getColumnModel().getColumn(0).setResizable(false);
            YoghurtTable.getColumnModel().getColumn(1).setResizable(false);
            YoghurtTable.getColumnModel().getColumn(2).setResizable(false);
            YoghurtTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(YoghurtPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        BakingTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BakingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"BK101", "Al Baker All Purpose Flour ", "1 Kg", "7.5"},
                {"BK202", "Al Baker Whole Wheat", "1 Kg", "8.5"},
                {"BK303", "Arm and hammer Baking soda", "450 g", "6.5"},
                {"BK404", "Eastern Roasted Rice Powder ", "1 Kg", "4"},
                {"BK505", "Foster Clark's Baking Powder", "450 g", "8.9"},
                {"BK606", "Foster Clark's Bicarbonate Soda", "150 g", "3.7"},
                {"BK707 ", "Symega Vanilla Extract", "400 ml", "4.7"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BakingTable.setRowHeight(30);
        BakingTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        BakingTable.getTableHeader().setReorderingAllowed(false);
        BakingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BakingTableMouseClicked(evt);
            }
        });
        BakingPane.setViewportView(BakingTable);
        if (BakingTable.getColumnModel().getColumnCount() > 0) {
            BakingTable.getColumnModel().getColumn(0).setResizable(false);
            BakingTable.getColumnModel().getColumn(2).setResizable(false);
            BakingTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(BakingPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 270));

        ChipsTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ChipsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CS101", "Lay's Salt Chips 40g", "40 g", "2"},
                {"CS202", "Lay's Chilli Chips 40g", "40 g", "2"},
                {"CS303", "Lays Salt n Vinegar 40g ", "40 g", "2"},
                {"CS404", "Super Rings Cheese 60g", "60 g", "2.5"},
                {"CS505", "Pringles Salty 160g", "160 g", "5"}
            },
            new String [] {
                "Item code", "Brand", "Weight/Piece", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ChipsTable.setRowHeight(30);
        ChipsTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        ChipsTable.getTableHeader().setReorderingAllowed(false);
        ChipsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChipsTableMouseClicked(evt);
            }
        });
        ChipsPane.setViewportView(ChipsTable);
        if (ChipsTable.getColumnModel().getColumnCount() > 0) {
            ChipsTable.getColumnModel().getColumn(0).setResizable(false);
            ChipsTable.getColumnModel().getColumn(1).setResizable(false);
            ChipsTable.getColumnModel().getColumn(2).setResizable(false);
            ChipsTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(ChipsPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        NoodlesTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NoodlesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ND101", "Chicken Ramen 60g", "60 g", "2.5"},
                {"ND202", "Chicken Ramen 230g", "230 g", "4.5"},
                {"ND303", "Cup Noodles 60g", "60 g", "2.5"},
                {"ND404", "Cup Noodles 230g", "230 g", "5.5"},
                {"ND505", "Indomie 60g", "60 g", "3"},
                {"ND606", "Indomie 230g", "230 g", "5"},
                {"ND707", "Maggi 60g", "60 g", "3.5"},
                {"ND808", "Maggi 230g", "230 g", "5"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Piece", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NoodlesTable.setRowHeight(30);
        NoodlesTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        NoodlesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoodlesTableMouseClicked(evt);
            }
        });
        NoodlesPane.setViewportView(NoodlesTable);
        if (NoodlesTable.getColumnModel().getColumnCount() > 0) {
            NoodlesTable.getColumnModel().getColumn(0).setResizable(false);
            NoodlesTable.getColumnModel().getColumn(1).setResizable(false);
            NoodlesTable.getColumnModel().getColumn(2).setResizable(false);
            NoodlesTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(NoodlesPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 290));

        RiceTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        RiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"R101", "Gautam 1kg", "1 Kg", "11.5"},
                {"R202", "India Gate 1kg", "1 Kg", "10.5"},
                {"R303", "Kausar 1kg", "1 Kg", "10"},
                {"R404", "Zeeba 1kg", "1 Kg", "11"}
            },
            new String [] {
                "Item Code", "Brands", "Weight/Piece", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RiceTable.setRowHeight(30);
        RiceTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        RiceTable.getTableHeader().setReorderingAllowed(false);
        RiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RiceTableMouseClicked(evt);
            }
        });
        RicePane.setViewportView(RiceTable);
        if (RiceTable.getColumnModel().getColumnCount() > 0) {
            RiceTable.getColumnModel().getColumn(0).setResizable(false);
            RiceTable.getColumnModel().getColumn(1).setResizable(false);
            RiceTable.getColumnModel().getColumn(2).setResizable(false);
            RiceTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(RicePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 170));

        SweetenerTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SweetenerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ST101", "AL Fares Brown Sugar", "1 Kg", "AED 12"},
                {"ST202", "Al Osra White Sugar ", "1 Kg", "AED 4.95"},
                {"ST303", "SIS Brown Sugar ", "1 Kg", "AED 6.6"},
                {"ST404", "SIS White Sugar ", "1 Kg", "AED 5.5"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Piece", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SweetenerTable.setRowHeight(30);
        SweetenerTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        SweetenerTable.getTableHeader().setReorderingAllowed(false);
        SweetenerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SweetenerTableMouseClicked(evt);
            }
        });
        SweetenerPane.setViewportView(SweetenerTable);
        if (SweetenerTable.getColumnModel().getColumnCount() > 0) {
            SweetenerTable.getColumnModel().getColumn(0).setResizable(false);
            SweetenerTable.getColumnModel().getColumn(1).setResizable(false);
            SweetenerTable.getColumnModel().getColumn(2).setResizable(false);
            SweetenerTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(SweetenerPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 170));

        FruitTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FruitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"FR101", "Apple", "0.5 kg", "4"},
                {"FR202", "Banana", "0.5 kg", "4"},
                {"FR303", "Black Berry", "0.5 kg", "5.5"},
                {"FR404", "Cherry", "0.5 kg", "5"},
                {"FR505", "Grapefruit", "0.5 kg", "6"},
                {"FR606", "Grapes", "0.5 kg", "4.75"},
                {"FR707", "Mango", "0.5 kg", "5.80"},
                {"FR808", "Orange", "0.5 kg", "4"},
                {"FR909", "Pears", "0.5 kg", "5"},
                {"FR1010", "Strawberry", "0.5 kg", "5.25"},
                {"FR1020", "Watermelon", "1 kg", "5"}
            },
            new String [] {
                "Item Code", "Fruit (s)", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FruitTable.setRowHeight(30);
        FruitTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        FruitTable.getTableHeader().setReorderingAllowed(false);
        FruitTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FruitTableMouseClicked(evt);
            }
        });
        FruitPane.setViewportView(FruitTable);
        if (FruitTable.getColumnModel().getColumnCount() > 0) {
            FruitTable.getColumnModel().getColumn(0).setResizable(false);
            FruitTable.getColumnModel().getColumn(1).setResizable(false);
            FruitTable.getColumnModel().getColumn(2).setResizable(false);
            FruitTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(FruitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 380));

        VegTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        VegTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"VG101", "Beans", "0.5 Kg", "5"},
                {"VG202", "BokChoy", "0.5 Kg", "3"},
                {"VG303", "Broccoli", "0.5 Kg", "4.60"},
                {"VG404", "Cabbage", "0.5 Kg", "3.95"},
                {"VG505", "Carrot", "0.5 Kg", "6"},
                {"VG606", "Cauliflower", "0.5 Kg", "5"},
                {"VG707", "Cilantro", "0.5 Kg", "4.25"},
                {"VG808", "Cucumber", "0.5 Kg", "4"},
                {"VG909", "Eggplant", "0.5 Kg", "5.25"},
                {"VG1010", "Lettuce", "0.5 Kg", "3.75"},
                {"VG1020", "Mint", "0.5 Kg", "2"},
                {"VG1030", "Okra", "0.5 Kg", "4.75"},
                {"VG1040", "Onion", "0.5 Kg", "5"},
                {"VG1050", "Potato", "0.5 Kg", "5"},
                {"VG1060", "Tomato", "0.5 Kg", "5.5"}
            },
            new String [] {
                "Item Code", "Vegetable (s)", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VegTable.setRowHeight(30);
        VegTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        VegTable.getTableHeader().setReorderingAllowed(false);
        VegTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VegTableMouseClicked(evt);
            }
        });
        VegPane.setViewportView(VegTable);
        if (VegTable.getColumnModel().getColumnCount() > 0) {
            VegTable.getColumnModel().getColumn(0).setResizable(false);
            VegTable.getColumnModel().getColumn(1).setResizable(false);
            VegTable.getColumnModel().getColumn(2).setResizable(false);
            VegTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(VegPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 500));

        FrozenTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FrozenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"FF101", "Admirals margherita pizza base 600g", "600 g", "29.5"},
                {"FF202", "Al Islami frozen strawberry 400g", "400 g", "7"},
                {"FF303", "BR chocolate ice cream 1L", "1 L", "22.5"},
                {"FF404", "BR strawberry ice cream 1L", "1 L", "22.5"},
                {"FF505", "Creapan pancake 220g", "220 g", "20"},
                {"FF606", "Dr.Oetker Riseorante pizza 345g", "345 g", "21.75"},
                {"FF707", "Emdorg frozen broccoli 450g", "450 g", "10"},
                {"FF808", "Felis Kitchen bites chocolate 480g ", "480g", "19.75"},
                {"FF909", "Frozen croissant 60g", "60 g", "12.5"},
                {"FF1010", "Kwality chocolate ice cream 1L", "1 L", "25"},
                {"FF1020", "Kwality vanilla ice cream 1L", "1 L", "25"},
                {"FF1030", "McCain potatoes spirals 750g", "750 g", "13.5"},
                {"FF1040", "Shoprite Blueberry woffles 350g ", "350 g", "20.5"},
                {"FF1050", "Sunbulah frozen okra 400g", "400 g", "6"}
            },
            new String [] {
                "Item Code", "Food Item", "Weight/Piece", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FrozenTable.setRowHeight(30);
        FrozenTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        FrozenTable.getTableHeader().setReorderingAllowed(false);
        FrozenTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrozenTableMouseClicked(evt);
            }
        });
        FrozenPane.setViewportView(FrozenTable);
        if (FrozenTable.getColumnModel().getColumnCount() > 0) {
            FrozenTable.getColumnModel().getColumn(0).setResizable(false);
            FrozenTable.getColumnModel().getColumn(1).setResizable(false);
            FrozenTable.getColumnModel().getColumn(2).setResizable(false);
            FrozenTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(FrozenPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 470));

        DetergentTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DetergentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"DT101", "Tide Automatic Powder Laundry Detergent", "2 L", "7"},
                {"DT202", "Persil Detergent Powder", "2 L", "7.5"},
                {"DT303", "Ariel Automatic Powder Detergent", "2 L", "6.25"},
                {"DT404", "Persil Power Gel", "2 L", "7"},
                {"DT505", "Downy Concentrate Fabric Softener", "2 L", "6"}
            },
            new String [] {
                "Item Code", "Brand", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DetergentTable.setRowHeight(30);
        DetergentTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        DetergentTable.getTableHeader().setReorderingAllowed(false);
        DetergentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetergentTableMouseClicked(evt);
            }
        });
        DetergentPane.setViewportView(DetergentTable);
        if (DetergentTable.getColumnModel().getColumnCount() > 0) {
            DetergentTable.getColumnModel().getColumn(0).setResizable(false);
            DetergentTable.getColumnModel().getColumn(1).setResizable(false);
            DetergentTable.getColumnModel().getColumn(2).setResizable(false);
            DetergentTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(DetergentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        GloveTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        GloveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"GM101", "Bcleen Vinyl Non Powdered Gloves", "100", "12"},
                {"GM202", "Disposable Plastic Large Gloves", "100", "8"},
                {"GM303", "EiioX Nitrile Disposable Gloves", "100", "15.75"},
                {"GM404", "Falcon Latex Examination Gloves", "100", "14"},
                {"GM505", "Vinyl Disposable Powder Free Gloves", "100", "9"},
                {"GM606", "Disposable Face Mask", "50", "5 "},
                {"GM707", "Disposable Bacterial Filter Surgical Face Mask", "100", "12"},
                {"GM808", "Washable Respiratory Sponge Mask", "1", "2"},
                {"GM909", "3 Layer Disposable Face Mask", "50", "15"},
                {"GM1010", "3-Ply Disposable Kids Face Mask", "50", "10"}
            },
            new String [] {
                "Item Code", "Brand", "Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GloveTable.setRowHeight(30);
        GloveTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        GloveTable.getTableHeader().setReorderingAllowed(false);
        GloveTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GloveTableMouseClicked(evt);
            }
        });
        GlovePane.setViewportView(GloveTable);
        if (GloveTable.getColumnModel().getColumnCount() > 0) {
            GloveTable.getColumnModel().getColumn(0).setResizable(false);
            GloveTable.getColumnModel().getColumn(1).setResizable(false);
            GloveTable.getColumnModel().getColumn(2).setResizable(false);
            GloveTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(GlovePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 350));

        HairTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        HairTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"HW101", "MEERA Herbal Hairwash Powder ", "120 g", "12"},
                {"HW202", "Head & Shoulders Menthol", "400 ml", "18"},
                {"HW303", "Pantene Silky Shampoo", "400 ml", "15"},
                {"HW404", "Dove Nourishing Oil Care Shampoo", "400 ml", "13.75"},
                {"HW505", "Sunsilk Shampoo Shine And Strength", "400 ml", "15.25"}
            },
            new String [] {
                "Item Code", "Brand", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HairTable.setRowHeight(30);
        HairTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        HairTable.getTableHeader().setReorderingAllowed(false);
        HairTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HairTableMouseClicked(evt);
            }
        });
        HairPane.setViewportView(HairTable);
        if (HairTable.getColumnModel().getColumnCount() > 0) {
            HairTable.getColumnModel().getColumn(0).setResizable(false);
            HairTable.getColumnModel().getColumn(1).setResizable(false);
            HairTable.getColumnModel().getColumn(2).setResizable(false);
            HairTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(HairPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 210));

        SoapTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SoapTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SP101", "Dettol Original Anti Bacterial Bar Soap", "165 g x4", "12"},
                {"SP202", "Nivea Pearl And Beauty Soap", "100 g x4", "10"},
                {"SP303", "Johnson's Anti-Bacterial Soap", "125 g", "4"},
                {"SP404", "Cool&cool Liquid Soap ", "250 ml", "11.80"},
                {"SP505", "Lux Magical Beauty Bath Soap", "120 g", "4"}
            },
            new String [] {
                "Item Code", "Brand", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SoapTable.setRowHeight(30);
        SoapTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        SoapTable.getTableHeader().setReorderingAllowed(false);
        SoapTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SoapTableMouseClicked(evt);
            }
        });
        SoapPane.setViewportView(SoapTable);
        if (SoapTable.getColumnModel().getColumnCount() > 0) {
            SoapTable.getColumnModel().getColumn(0).setResizable(false);
            SoapTable.getColumnModel().getColumn(1).setResizable(false);
            SoapTable.getColumnModel().getColumn(2).setResizable(false);
            SoapTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(SoapPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        BeanTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BeanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"BN101", "Canned Baked Beans In Tomato Sauce", "420 g", "5.25"},
                {"BN202", "California Garden Canned Beans", "450 g", "4"},
                {"BN303", "Dana Dana Rajma Red Kidney Beans ", "1 Kg", "10"},
                {"BN404", "Madhoor Soya Bean Vadi", "250 g", "5"},
                {"BN505", "Martpedia Red Kidney Beans ", "1 Kg", "9.5"}
            },
            new String [] {
                "Item Code", "Brand", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BeanTable.setRowHeight(30);
        BeanTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        BeanTable.getTableHeader().setReorderingAllowed(false);
        BeanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BeanTableMouseClicked(evt);
            }
        });
        BeanPane.setViewportView(BeanTable);
        if (BeanTable.getColumnModel().getColumnCount() > 0) {
            BeanTable.getColumnModel().getColumn(1).setResizable(false);
            BeanTable.getColumnModel().getColumn(2).setResizable(false);
            BeanTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(BeanPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        LentilTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LentilTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"LT101", "Bayara Chana Dal", "400 g", "4"},
                {"LT202", "Bayara Chick Peas", "400 g", "5"},
                {"LT303", "Bayara Green Lentils", "400 g", "4.25"},
                {"LT404", "Bayara Red Masoor Whole", "400 g", "4.5"},
                {"LT505", "Bayara Toor Dal", "400 g", "4.75"},
                {"LT606", "Bayara Urid Dal", "400 g", "4.40"},
                {"LT707", "Bayara Whole Moong", "400 g", "4.5"}
            },
            new String [] {
                "Item Code", "Brand", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LentilTable.setRowHeight(30);
        LentilTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        LentilTable.getTableHeader().setReorderingAllowed(false);
        LentilTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LentilTableMouseClicked(evt);
            }
        });
        LentilPane.setViewportView(LentilTable);
        if (LentilTable.getColumnModel().getColumnCount() > 0) {
            LentilTable.getColumnModel().getColumn(0).setResizable(false);
            LentilTable.getColumnModel().getColumn(1).setResizable(false);
            LentilTable.getColumnModel().getColumn(2).setResizable(false);
            LentilTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(LentilPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 260));

        NutTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NutTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NT101", "Al Rifai Assorted Mixed Nuts", "200 g", "11.40"},
                {"NT202", "Bayara Arabic Mixed Nuts", "400 g", "10"},
                {"NT303", "Bayara Salted Pistachios", "500 g", "15"},
                {"NT404", "Best Almond Raw Nuts", "325 g", "12"},
                {"NT505", "Best Classic Salted Mixed Nuts", "150 g", "8"},
                {"NT606", "Best Mixed Nuts", "20 g", "2"},
                {"NT707", "Castania Super Extra Nuts", "450 g", "13.70"}
            },
            new String [] {
                "Item Code", "Brand", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NutTable.setRowHeight(30);
        NutTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        NutTable.getTableHeader().setReorderingAllowed(false);
        NutTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NutTableMouseClicked(evt);
            }
        });
        NutPane.setViewportView(NutTable);
        if (NutTable.getColumnModel().getColumnCount() > 0) {
            NutTable.getColumnModel().getColumn(0).setResizable(false);
            NutTable.getColumnModel().getColumn(1).setResizable(false);
            NutTable.getColumnModel().getColumn(2).setResizable(false);
            NutTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(NutPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 250));

        PeaTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PeaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PS101", "Al Kabeer Green Peas", "400 g", "6.30"},
                {"PS202", "Americana Garden Peas", "450 g", "5.75"},
                {"PS303", "Castania Coated Chick Peas", "200 g", "7"},
                {"PS404", "Martopedia Green Peas", "400 g", "4"},
                {"PS505", "Mr Organic Chick Peas", "400 g", "6"},
                {"PS606", "Zarah White Chick Peas", "400 g", "7"}
            },
            new String [] {
                "Item Code", "Brand", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PeaTable.setRowHeight(30);
        PeaTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        PeaTable.getTableHeader().setReorderingAllowed(false);
        PeaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PeaTableMouseClicked(evt);
            }
        });
        PeaPane.setViewportView(PeaTable);
        if (PeaTable.getColumnModel().getColumnCount() > 0) {
            PeaTable.getColumnModel().getColumn(0).setResizable(false);
            PeaTable.getColumnModel().getColumn(1).setResizable(false);
            PeaTable.getColumnModel().getColumn(2).setResizable(false);
            PeaTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(PeaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 220));

        BasilTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BasilTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"BL101", "Bayara", "500 g", "5.30"},
                {"BL202", "Eastern", "500 g", "5"},
                {"BL303", "Kitchen Treasures", "500 g", "5.80"},
                {"BL404", "New Land", "500 g", "6"},
                {"BL505", "Shama", "500 g", "6"}
            },
            new String [] {
                "Item Code", "Brand", "Weight", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BasilTable.setRowHeight(30);
        BasilTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        BasilTable.getTableHeader().setReorderingAllowed(false);
        BasilTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BasilTableMouseClicked(evt);
            }
        });
        BasilPane.setViewportView(BasilTable);
        if (BasilTable.getColumnModel().getColumnCount() > 0) {
            BasilTable.getColumnModel().getColumn(0).setResizable(false);
            BasilTable.getColumnModel().getColumn(1).setResizable(false);
            BasilTable.getColumnModel().getColumn(2).setResizable(false);
            BasilTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(BasilPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        PepperPane.setBackground(new java.awt.Color(255, 255, 255));

        PepperTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PepperTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"BP101", "Bayara", "500 g", "6"},
                {"BP202", "Eastern", "500 g", "5.5"},
                {"BP303", "Kitchen Treasures", "500 g", "5.5"},
                {"BP404", "New Land", "500 g", "7"},
                {"BP505", "Shama", "500 g", "7"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PepperTable.setRowHeight(30);
        PepperTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        PepperTable.getTableHeader().setReorderingAllowed(false);
        PepperTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PepperTableMouseClicked(evt);
            }
        });
        PepperPane.setViewportView(PepperTable);
        if (PepperTable.getColumnModel().getColumnCount() > 0) {
            PepperTable.getColumnModel().getColumn(0).setResizable(false);
            PepperTable.getColumnModel().getColumn(1).setResizable(false);
            PepperTable.getColumnModel().getColumn(2).setResizable(false);
            PepperTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(PepperPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 190));

        CinnamonPane.setBackground(new java.awt.Color(255, 255, 255));

        CinnamonTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CinnamonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CP101", "Bayara", "500 g", "6"},
                {"CP202", "Eastern", "500 g", "5.5"},
                {"CP303", "Kitchen Treasures", "500 g", "5.5"},
                {"CP404", "New Land", "500 g", "7"},
                {"CP505", "Shama", "500 g", "7"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CinnamonTable.setRowHeight(30);
        CinnamonTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        CinnamonTable.getTableHeader().setReorderingAllowed(false);
        CinnamonTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CinnamonTableMouseClicked(evt);
            }
        });
        CinnamonPane.setViewportView(CinnamonTable);
        if (CinnamonTable.getColumnModel().getColumnCount() > 0) {
            CinnamonTable.getColumnModel().getColumn(0).setResizable(false);
            CinnamonTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(CinnamonPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 190));

        CuminPane.setBackground(new java.awt.Color(255, 255, 255));

        CuminTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CuminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CM101", "Bayara", "500 g", "6"},
                {"CM202", "Eastern", "500 g", "5.5"},
                {"CM303", "Kitchen Treasures", "500 g", "5.5"},
                {"CM404", "New Land", "500 g", "7"},
                {"CM505", "Shama", "500 g", "7"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CuminTable.setRowHeight(30);
        CuminTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        CuminTable.getTableHeader().setReorderingAllowed(false);
        CuminTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuminTableMouseClicked(evt);
            }
        });
        CuminPane.setViewportView(CuminTable);
        if (CuminTable.getColumnModel().getColumnCount() > 0) {
            CuminTable.getColumnModel().getColumn(0).setResizable(false);
            CuminTable.getColumnModel().getColumn(1).setResizable(false);
            CuminTable.getColumnModel().getColumn(2).setResizable(false);
            CuminTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(CuminPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 190));

        CurryPane.setBackground(new java.awt.Color(255, 255, 255));

        CurryTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CurryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CR101", "Bayara", "500 g", "6"},
                {"CR202", "Eastern", "500 g", "5.5"},
                {"CR303", "Kitchen Treasures", "500 g", "5.5"},
                {"CR404", "New Land", "500 g", "7"},
                {"CR505", "Shama", "500 g", "7"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CurryTable.setRowHeight(30);
        CurryTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        CurryTable.getTableHeader().setReorderingAllowed(false);
        CurryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CurryTableMouseClicked(evt);
            }
        });
        CurryPane.setViewportView(CurryTable);
        if (CurryTable.getColumnModel().getColumnCount() > 0) {
            CurryTable.getColumnModel().getColumn(0).setResizable(false);
            CurryTable.getColumnModel().getColumn(1).setResizable(false);
            CurryTable.getColumnModel().getColumn(2).setResizable(false);
            CurryTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(CurryPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 190));

        SaltPane.setBackground(new java.awt.Color(255, 255, 255));

        SaltTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SaltTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SL101", "Bayara", "500 g", "6"},
                {"SL202", "Eastern", "500 g", "5.5"},
                {"SL303", "Kitchen Treasures", "500 g", "5.7"},
                {"SL404", "New Land", "500 g", "7"},
                {"SL505", "Shama", "500 g", "7"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SaltTable.setRowHeight(30);
        SaltTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        SaltTable.getTableHeader().setReorderingAllowed(false);
        SaltTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaltTableMouseClicked(evt);
            }
        });
        SaltPane.setViewportView(SaltTable);
        if (SaltTable.getColumnModel().getColumnCount() > 0) {
            SaltTable.getColumnModel().getColumn(0).setResizable(false);
            SaltTable.getColumnModel().getColumn(1).setResizable(false);
            SaltTable.getColumnModel().getColumn(2).setResizable(false);
            SaltTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(SaltPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 200));

        ThymePane.setBackground(new java.awt.Color(255, 255, 255));

        ThymeTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ThymeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"TH101", "Bayara", "500 g", "6"},
                {"TH202", "Eastern", "500 g", "5.5"},
                {"TH303", "Kitchen Treasures", "500 g", "5.5"},
                {"TH404", "New Land", "500 g", "7"},
                {"TH505", "Shama", "500 g", "7.7"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Pieces", "Price"
            }
        ));
        ThymeTable.setRowHeight(30);
        ThymeTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        ThymeTable.getTableHeader().setReorderingAllowed(false);
        ThymeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThymeTableMouseClicked(evt);
            }
        });
        ThymePane.setViewportView(ThymeTable);

        getContentPane().add(ThymePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 190));

        TurmericPane.setBackground(new java.awt.Color(255, 255, 255));

        TurmericTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TurmericTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"TH101", "Bayara", "500 g", "6"},
                {"TH202", "Eastern", "500 g", "5.5"},
                {"TH303", "Kitchen Treasures", "500 g", "5.5"},
                {"TH404", "New Land", "500 g", "7"},
                {"TH505", "Shama", "500 g", "7"}
            },
            new String [] {
                "Item Code", "Brand", "Weight/Pieces", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TurmericTable.setRowHeight(30);
        TurmericTable.setSelectionBackground(new java.awt.Color(255, 140, 86));
        TurmericTable.getTableHeader().setReorderingAllowed(false);
        TurmericTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TurmericTableMouseClicked(evt);
            }
        });
        TurmericPane.setViewportView(TurmericTable);
        if (TurmericTable.getColumnModel().getColumnCount() > 0) {
            TurmericTable.getColumnModel().getColumn(0).setResizable(false);
            TurmericTable.getColumnModel().getColumn(1).setResizable(false);
            TurmericTable.getColumnModel().getColumn(2).setResizable(false);
            TurmericTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(TurmericPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 600, 190));

        headerPanel.setBackground(new java.awt.Color(77, 81, 152));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOUT.setBackground(new java.awt.Color(77, 81, 152));
        logOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserWhite.png"))); // NOI18N
        logOUT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOUTActionPerformed(evt);
            }
        });
        headerPanel.add(logOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 30, 90, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 242, 220));
        jLabel2.setText("LOG OUT");
        headerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 90, 100, 40));

        emailLabel.setBackground(new java.awt.Color(255, 255, 255));
        emailLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setToolTipText("");
        headerPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 920, 60));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(218, 242, 220));
        jLabel7.setText("MY CART");
        headerPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 90, 90, 40));

        myCart.setBackground(new java.awt.Color(77, 81, 152));
        myCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CartIcon - Copy.png"))); // NOI18N
        myCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myCartActionPerformed(evt);
            }
        });
        headerPanel.add(myCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 30, 90, 60));

        getContentPane().add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 140));

        CategoriesPanel.setBackground(new java.awt.Color(129, 183, 210));

        jSeparator1.setBackground(new java.awt.Color(218, 242, 220));
        jSeparator1.setForeground(new java.awt.Color(218, 242, 220));
        jSeparator1.setFont(new java.awt.Font("Venus Rising", 1, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana Pro Black", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 242, 220));
        jLabel1.setText("  CATEGORIES");

        BakeryButton.setBackground(new java.awt.Color(102, 255, 51));
        BakeryButton.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        BakeryButton.setForeground(new java.awt.Color(77, 81, 152));
        BakeryButton.setText("                   Bakery");
        BakeryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BakeryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BakeryButtonMouseEntered(evt);
            }
        });

        BeveButton.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        BeveButton.setForeground(new java.awt.Color(77, 81, 152));
        BeveButton.setText("               Beverages");
        BeveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BeveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BeveButtonMouseEntered(evt);
            }
        });

        DairyButton.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        DairyButton.setForeground(new java.awt.Color(77, 81, 152));
        DairyButton.setText("        Dairy Products");
        DairyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DairyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DairyButtonMouseEntered(evt);
            }
        });

        DryBakingButton.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        DryBakingButton.setForeground(new java.awt.Color(77, 81, 152));
        DryBakingButton.setText(" Dry or Baking Goods");
        DryBakingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DryBakingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DryBakingButtonMouseEntered(evt);
            }
        });

        FreshProduceButton.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        FreshProduceButton.setForeground(new java.awt.Color(77, 81, 152));
        FreshProduceButton.setText("         Fresh Produce");
        FreshProduceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FreshProduceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FreshProduceButtonMouseEntered(evt);
            }
        });

        FrozenButton.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        FrozenButton.setForeground(new java.awt.Color(77, 81, 152));
        FrozenButton.setText("            Frozen Food");
        FrozenButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FrozenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FrozenButtonMouseEntered(evt);
            }
        });

        HygieneButton.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        HygieneButton.setForeground(new java.awt.Color(77, 81, 152));
        HygieneButton.setText("         Hygiene Items   ");
        HygieneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HygieneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HygieneButtonMouseEntered(evt);
            }
        });

        PulsesButton.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        PulsesButton.setForeground(new java.awt.Color(77, 81, 152));
        PulsesButton.setText("                    Pulses");
        PulsesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PulsesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PulsesButtonMouseEntered(evt);
            }
        });

        SpicesButton.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        SpicesButton.setForeground(new java.awt.Color(77, 81, 152));
        SpicesButton.setText("                    Spices   ");
        SpicesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SpicesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SpicesButtonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout CategoriesPanelLayout = new javax.swing.GroupLayout(CategoriesPanel);
        CategoriesPanel.setLayout(CategoriesPanelLayout);
        CategoriesPanelLayout.setHorizontalGroup(
            CategoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DryBakingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DairyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BeveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BakeryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FreshProduceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FrozenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HygieneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PulsesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SpicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addGroup(CategoriesPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(CategoriesPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CategoriesPanelLayout.setVerticalGroup(
            CategoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoriesPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BakeryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BeveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DairyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DryBakingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FreshProduceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FrozenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HygieneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PulsesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpicesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        getContentPane().add(CategoriesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, 690));

        jLayeredPane2.setLayout(new java.awt.CardLayout());

        BakeryPanel.setBackground(new java.awt.Color(255, 204, 231));
        BakeryPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BakeryPanelMouseEntered(evt);
            }
        });

        BreadButton.setBackground(new java.awt.Color(102, 255, 51));
        BreadButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        BreadButton.setForeground(new java.awt.Color(210, 105, 30));
        BreadButton.setText("   Bread");
        BreadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BreadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BreadButtonMousePressed(evt);
            }
        });

        DessertsButton.setBackground(new java.awt.Color(102, 255, 51));
        DessertsButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        DessertsButton.setForeground(new java.awt.Color(210, 105, 30));
        DessertsButton.setText("   Desserts");
        DessertsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DessertsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DessertsButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BakeryPanelLayout = new javax.swing.GroupLayout(BakeryPanel);
        BakeryPanel.setLayout(BakeryPanelLayout);
        BakeryPanelLayout.setHorizontalGroup(
            BakeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BreadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DessertsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        BakeryPanelLayout.setVerticalGroup(
            BakeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BakeryPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(BreadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DessertsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(476, Short.MAX_VALUE))
        );

        jLayeredPane2.add(BakeryPanel, "card2");

        BeveragePanel.setBackground(new java.awt.Color(255, 204, 231));
        BeveragePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BeveragePanelMouseEntered(evt);
            }
        });

        CoffeeButton.setBackground(new java.awt.Color(102, 255, 51));
        CoffeeButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        CoffeeButton.setForeground(new java.awt.Color(255, 0, 0));
        CoffeeButton.setText("   Coffee");
        CoffeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CoffeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CoffeeButtonMousePressed(evt);
            }
        });

        JuiceButton.setBackground(new java.awt.Color(102, 255, 51));
        JuiceButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        JuiceButton.setForeground(new java.awt.Color(255, 0, 0));
        JuiceButton.setText("   Juices");
        JuiceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JuiceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JuiceButtonMousePressed(evt);
            }
        });

        NutritionButton.setBackground(new java.awt.Color(102, 255, 51));
        NutritionButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        NutritionButton.setForeground(new java.awt.Color(255, 0, 0));
        NutritionButton.setText("   Nutritional Drinks");
        NutritionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NutritionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NutritionButtonMousePressed(evt);
            }
        });

        TeaButton.setBackground(new java.awt.Color(102, 255, 51));
        TeaButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        TeaButton.setForeground(new java.awt.Color(255, 0, 0));
        TeaButton.setText("   Tea");
        TeaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TeaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TeaButtonMousePressed(evt);
            }
        });

        VeganButton.setBackground(new java.awt.Color(102, 255, 51));
        VeganButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        VeganButton.setForeground(new java.awt.Color(255, 0, 0));
        VeganButton.setText("   Vegan Milk");
        VeganButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VeganButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VeganButtonMousePressed(evt);
            }
        });

        WaterButton.setBackground(new java.awt.Color(102, 255, 51));
        WaterButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        WaterButton.setForeground(new java.awt.Color(255, 0, 0));
        WaterButton.setText("   Water");
        WaterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WaterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                WaterButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BeveragePanelLayout = new javax.swing.GroupLayout(BeveragePanel);
        BeveragePanel.setLayout(BeveragePanelLayout);
        BeveragePanelLayout.setHorizontalGroup(
            BeveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CoffeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JuiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NutritionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(TeaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(VeganButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WaterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BeveragePanelLayout.setVerticalGroup(
            BeveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeveragePanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(CoffeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JuiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NutritionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TeaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VeganButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WaterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jLayeredPane2.add(BeveragePanel, "card3");

        DairyPanel.setBackground(new java.awt.Color(255, 204, 231));
        DairyPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DairyPanelMouseEntered(evt);
            }
        });

        ButterButton.setBackground(new java.awt.Color(102, 255, 51));
        ButterButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        ButterButton.setForeground(new java.awt.Color(42, 22, 112));
        ButterButton.setText("   Butter");
        ButterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButterButtonMousePressed(evt);
            }
        });

        CheeseButton.setBackground(new java.awt.Color(102, 255, 51));
        CheeseButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        CheeseButton.setForeground(new java.awt.Color(42, 22, 112));
        CheeseButton.setText("   Cheese");
        CheeseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheeseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheeseButtonMousePressed(evt);
            }
        });

        CreamButton.setBackground(new java.awt.Color(102, 255, 51));
        CreamButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        CreamButton.setForeground(new java.awt.Color(42, 22, 112));
        CreamButton.setText("   Cream");
        CreamButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreamButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CreamButtonMousePressed(evt);
            }
        });

        EggButton.setBackground(new java.awt.Color(102, 255, 51));
        EggButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        EggButton.setForeground(new java.awt.Color(42, 22, 112));
        EggButton.setText("   Eggs");
        EggButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EggButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EggButtonMousePressed(evt);
            }
        });

        MilkButton.setBackground(new java.awt.Color(102, 255, 51));
        MilkButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        MilkButton.setForeground(new java.awt.Color(42, 22, 112));
        MilkButton.setText("   Milk");
        MilkButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MilkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MilkButtonMousePressed(evt);
            }
        });

        YoghurtButton.setBackground(new java.awt.Color(102, 255, 51));
        YoghurtButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        YoghurtButton.setForeground(new java.awt.Color(42, 22, 112));
        YoghurtButton.setText("   Yoghurt");
        YoghurtButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YoghurtButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                YoghurtButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout DairyPanelLayout = new javax.swing.GroupLayout(DairyPanel);
        DairyPanel.setLayout(DairyPanelLayout);
        DairyPanelLayout.setHorizontalGroup(
            DairyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CheeseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CreamButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(EggButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MilkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(YoghurtButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DairyPanelLayout.setVerticalGroup(
            DairyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DairyPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(ButterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheeseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EggButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MilkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YoghurtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jLayeredPane2.add(DairyPanel, "card3");

        BakingPanel.setBackground(new java.awt.Color(255, 204, 231));
        BakingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BakingPanelMouseEntered(evt);
            }
        });

        BakingButton.setBackground(new java.awt.Color(102, 255, 51));
        BakingButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        BakingButton.setForeground(new java.awt.Color(101, 53, 15));
        BakingButton.setText("   Baking");
        BakingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BakingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BakingButtonMousePressed(evt);
            }
        });

        ChipsSnackButton.setBackground(new java.awt.Color(102, 255, 51));
        ChipsSnackButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        ChipsSnackButton.setForeground(new java.awt.Color(101, 53, 15));
        ChipsSnackButton.setText("   Chips & Snacks");
        ChipsSnackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChipsSnackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChipsSnackButtonMousePressed(evt);
            }
        });

        NoodlesButton.setBackground(new java.awt.Color(102, 255, 51));
        NoodlesButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        NoodlesButton.setForeground(new java.awt.Color(101, 53, 15));
        NoodlesButton.setText("   Noodles");
        NoodlesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NoodlesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NoodlesButtonMousePressed(evt);
            }
        });

        RiceButton.setBackground(new java.awt.Color(102, 255, 51));
        RiceButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        RiceButton.setForeground(new java.awt.Color(101, 53, 15));
        RiceButton.setText("   Rice");
        RiceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RiceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RiceButtonMousePressed(evt);
            }
        });

        SweetnerButton.setBackground(new java.awt.Color(102, 255, 51));
        SweetnerButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        SweetnerButton.setForeground(new java.awt.Color(101, 53, 15));
        SweetnerButton.setText("   Sweeteners");
        SweetnerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SweetnerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SweetnerButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BakingPanelLayout = new javax.swing.GroupLayout(BakingPanel);
        BakingPanel.setLayout(BakingPanelLayout);
        BakingPanelLayout.setHorizontalGroup(
            BakingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BakingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ChipsSnackButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(NoodlesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SweetnerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BakingPanelLayout.setVerticalGroup(
            BakingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BakingPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(BakingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChipsSnackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoodlesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SweetnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        jLayeredPane2.add(BakingPanel, "card3");

        freshProPanel.setBackground(new java.awt.Color(255, 204, 231));
        freshProPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                freshProPanelMouseEntered(evt);
            }
        });

        FruitsButton.setBackground(new java.awt.Color(102, 255, 51));
        FruitsButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        FruitsButton.setForeground(new java.awt.Color(47, 156, 0));
        FruitsButton.setText("   Fruits");
        FruitsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FruitsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FruitsButtonMousePressed(evt);
            }
        });

        VegButton.setBackground(new java.awt.Color(102, 255, 51));
        VegButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        VegButton.setForeground(new java.awt.Color(47, 156, 0));
        VegButton.setText("   Vegetables");
        VegButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VegButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VegButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout freshProPanelLayout = new javax.swing.GroupLayout(freshProPanel);
        freshProPanel.setLayout(freshProPanelLayout);
        freshProPanelLayout.setHorizontalGroup(
            freshProPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FruitsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(VegButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        freshProPanelLayout.setVerticalGroup(
            freshProPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, freshProPanelLayout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addComponent(FruitsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );

        jLayeredPane2.add(freshProPanel, "card3");

        FrozenPanel.setBackground(new java.awt.Color(255, 204, 231));
        FrozenPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FrozenPanelMouseEntered(evt);
            }
        });

        FrozenFButton.setBackground(new java.awt.Color(102, 255, 51));
        FrozenFButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        FrozenFButton.setForeground(new java.awt.Color(0, 102, 0));
        FrozenFButton.setText("   Food Items");
        FrozenFButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FrozenFButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrozenFButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrozenPanelLayout = new javax.swing.GroupLayout(FrozenPanel);
        FrozenPanel.setLayout(FrozenPanelLayout);
        FrozenPanelLayout.setHorizontalGroup(
            FrozenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrozenFButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        FrozenPanelLayout.setVerticalGroup(
            FrozenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrozenPanelLayout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(FrozenFButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );

        jLayeredPane2.add(FrozenPanel, "card3");

        HygieneItemsPanel.setBackground(new java.awt.Color(255, 204, 231));
        HygieneItemsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HygieneItemsPanelMouseEntered(evt);
            }
        });

        DetergentButton.setBackground(new java.awt.Color(102, 255, 51));
        DetergentButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        DetergentButton.setForeground(new java.awt.Color(44, 62, 76));
        DetergentButton.setText("   Detergents");
        DetergentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DetergentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DetergentButtonMousePressed(evt);
            }
        });

        GlovesButton.setBackground(new java.awt.Color(102, 255, 51));
        GlovesButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        GlovesButton.setForeground(new java.awt.Color(44, 62, 76));
        GlovesButton.setText("   Masks & Gloves");
        GlovesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GlovesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GlovesButtonMousePressed(evt);
            }
        });

        hairWashButton.setBackground(new java.awt.Color(102, 255, 51));
        hairWashButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        hairWashButton.setForeground(new java.awt.Color(44, 62, 76));
        hairWashButton.setText("   Hair Wash");
        hairWashButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hairWashButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hairWashButtonMousePressed(evt);
            }
        });

        SoapsButton.setBackground(new java.awt.Color(102, 255, 51));
        SoapsButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        SoapsButton.setForeground(new java.awt.Color(44, 62, 76));
        SoapsButton.setText("   Soaps");
        SoapsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SoapsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SoapsButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HygieneItemsPanelLayout = new javax.swing.GroupLayout(HygieneItemsPanel);
        HygieneItemsPanel.setLayout(HygieneItemsPanelLayout);
        HygieneItemsPanelLayout.setHorizontalGroup(
            HygieneItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DetergentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GlovesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(hairWashButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SoapsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HygieneItemsPanelLayout.setVerticalGroup(
            HygieneItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HygieneItemsPanelLayout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addComponent(DetergentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GlovesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hairWashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoapsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        jLayeredPane2.add(HygieneItemsPanel, "card3");

        PulsesPanel.setBackground(new java.awt.Color(255, 204, 231));
        PulsesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PulsesPanelMouseEntered(evt);
            }
        });

        BeansButton.setBackground(new java.awt.Color(102, 255, 51));
        BeansButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        BeansButton.setForeground(new java.awt.Color(249, 166, 2));
        BeansButton.setText("   Beans");
        BeansButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BeansButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BeansButtonMousePressed(evt);
            }
        });

        LentilsButton.setBackground(new java.awt.Color(102, 255, 51));
        LentilsButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        LentilsButton.setForeground(new java.awt.Color(249, 166, 2));
        LentilsButton.setText("   Lentils");
        LentilsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LentilsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LentilsButtonMousePressed(evt);
            }
        });

        NutsButton.setBackground(new java.awt.Color(102, 255, 51));
        NutsButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        NutsButton.setForeground(new java.awt.Color(249, 166, 2));
        NutsButton.setText("   Nuts");
        NutsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NutsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NutsButtonMousePressed(evt);
            }
        });

        PeasButton.setBackground(new java.awt.Color(102, 255, 51));
        PeasButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        PeasButton.setForeground(new java.awt.Color(249, 166, 2));
        PeasButton.setText("   Peas");
        PeasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PeasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PeasButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PulsesPanelLayout = new javax.swing.GroupLayout(PulsesPanel);
        PulsesPanel.setLayout(PulsesPanelLayout);
        PulsesPanelLayout.setHorizontalGroup(
            PulsesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BeansButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LentilsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(NutsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PeasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PulsesPanelLayout.setVerticalGroup(
            PulsesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PulsesPanelLayout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(BeansButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LentilsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NutsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PeasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        jLayeredPane2.add(PulsesPanel, "card3");

        SpicesPanel.setBackground(new java.awt.Color(255, 204, 231));
        SpicesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SpicesPanelMouseEntered(evt);
            }
        });

        BasilButton.setBackground(new java.awt.Color(102, 255, 51));
        BasilButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        BasilButton.setForeground(new java.awt.Color(252, 106, 3));
        BasilButton.setText("   Basil");
        BasilButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BasilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BasilButtonMousePressed(evt);
            }
        });

        BlackPButton.setBackground(new java.awt.Color(102, 255, 51));
        BlackPButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        BlackPButton.setForeground(new java.awt.Color(252, 106, 3));
        BlackPButton.setText("   Black Pepper");
        BlackPButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BlackPButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BlackPButtonMousePressed(evt);
            }
        });

        CinnamonButton.setBackground(new java.awt.Color(102, 255, 51));
        CinnamonButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        CinnamonButton.setForeground(new java.awt.Color(252, 106, 3));
        CinnamonButton.setText("   Cinnamon");
        CinnamonButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CinnamonButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CinnamonButtonMousePressed(evt);
            }
        });

        CuminButton.setBackground(new java.awt.Color(102, 255, 51));
        CuminButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        CuminButton.setForeground(new java.awt.Color(252, 106, 3));
        CuminButton.setText("   Cumin");
        CuminButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CuminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CuminButtonMousePressed(evt);
            }
        });

        CurryButton.setBackground(new java.awt.Color(102, 255, 51));
        CurryButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        CurryButton.setForeground(new java.awt.Color(252, 106, 3));
        CurryButton.setText("   Curry Powder");
        CurryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CurryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CurryButtonMousePressed(evt);
            }
        });

        SaltButton.setBackground(new java.awt.Color(102, 255, 51));
        SaltButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        SaltButton.setForeground(new java.awt.Color(252, 106, 3));
        SaltButton.setText("   Salt");
        SaltButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaltButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SaltButtonMousePressed(evt);
            }
        });

        ThymeButton.setBackground(new java.awt.Color(102, 255, 51));
        ThymeButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        ThymeButton.setForeground(new java.awt.Color(252, 106, 3));
        ThymeButton.setText("   Thyme");
        ThymeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThymeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ThymeButtonMousePressed(evt);
            }
        });

        TurmericPButton.setBackground(new java.awt.Color(102, 255, 51));
        TurmericPButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        TurmericPButton.setForeground(new java.awt.Color(252, 106, 3));
        TurmericPButton.setText("   Turmeric Powder");
        TurmericPButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TurmericPButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TurmericPButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SpicesPanelLayout = new javax.swing.GroupLayout(SpicesPanel);
        SpicesPanel.setLayout(SpicesPanelLayout);
        SpicesPanelLayout.setHorizontalGroup(
            SpicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BlackPButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(CinnamonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CuminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CurryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SaltButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ThymeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TurmericPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SpicesPanelLayout.setVerticalGroup(
            SpicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpicesPanelLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(BasilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlackPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CinnamonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CuminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CurryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaltButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThymeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TurmericPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        jLayeredPane2.add(SpicesPanel, "card3");

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 200, 690));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 140, 10, 690));

        DisplayPanel.setBackground(new java.awt.Color(129, 183, 210));
        DisplayPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Quantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        DisplayPanel.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 60, -1));

        jLabel6.setFont(new java.awt.Font("Arial Nova", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(172, 0, 3));
        jLabel6.setText("Quantity:");
        DisplayPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arial Nova", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(172, 0, 3));
        jLabel5.setText(" Price: (AED) ");
        DisplayPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        addToCart.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        addToCart.setText("ADD");
        addToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });
        DisplayPanel.add(addToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 150, 40));
        DisplayPanel.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 180, 30));
        DisplayPanel.add(BrandItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 180, 30));
        DisplayPanel.add(ItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 180, 30));

        jLabel4.setFont(new java.awt.Font("Arial Nova", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(172, 0, 3));
        jLabel4.setText("Brand/Item:");
        DisplayPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Nova", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(172, 0, 3));
        jLabel3.setText("Item Code:");
        DisplayPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, 30));

        RandomNoLabel.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        DisplayPanel.add(RandomNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 670, 90, 20));
        DisplayPanel.add(WeightPiece, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 180, 30));

        jLabel8.setFont(new java.awt.Font("Arial Nova", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(172, 0, 3));
        jLabel8.setText("Weight/Pieces:");
        DisplayPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        RequiredLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        RequiredLabel.setForeground(new java.awt.Color(247, 0, 0));
        DisplayPanel.add(RequiredLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 100, 20));

        getContentPane().add(DisplayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 140, 350, 690));

        turmericBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/turmeric.jpg"))); // NOI18N
        getContentPane().add(turmericBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        thymeBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/thyme.jpg"))); // NOI18N
        getContentPane().add(thymeBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        saltBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salt.jpg"))); // NOI18N
        getContentPane().add(saltBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        curryBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/curry.jpg"))); // NOI18N
        getContentPane().add(curryBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        cuminBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cumin.jpg"))); // NOI18N
        getContentPane().add(cuminBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        cinnamonBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/black pepper.jpg"))); // NOI18N
        getContentPane().add(cinnamonBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        blackPBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/black pepper.jpg"))); // NOI18N
        getContentPane().add(blackPBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        basilBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/basil.jpg"))); // NOI18N
        getContentPane().add(basilBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        peaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/peas.jpg"))); // NOI18N
        getContentPane().add(peaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        nutBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuts.jpg"))); // NOI18N
        getContentPane().add(nutBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        lentilBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bean.jpg"))); // NOI18N
        getContentPane().add(lentilBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        beanBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bean.jpg"))); // NOI18N
        getContentPane().add(beanBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        soapBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soap.jpg"))); // NOI18N
        getContentPane().add(soapBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        hairBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hairwash.jpg"))); // NOI18N
        getContentPane().add(hairBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        gloveBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/glove.jpg"))); // NOI18N
        getContentPane().add(gloveBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        detergentBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/detergent.jpg"))); // NOI18N
        getContentPane().add(detergentBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        frozenBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frozen.jpg"))); // NOI18N
        getContentPane().add(frozenBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        vegeBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vege.jpg"))); // NOI18N
        getContentPane().add(vegeBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        fruitBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fruit.jpg"))); // NOI18N
        getContentPane().add(fruitBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        sweetBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sweeteners.jpg"))); // NOI18N
        getContentPane().add(sweetBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        riceBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rice.jpg"))); // NOI18N
        getContentPane().add(riceBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        noodlesBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/noodles.jpg"))); // NOI18N
        getContentPane().add(noodlesBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        chipsBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chips.jpg"))); // NOI18N
        getContentPane().add(chipsBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        bakingBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baking.jpg"))); // NOI18N
        getContentPane().add(bakingBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        yoghurtBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yoghurt.jpg"))); // NOI18N
        getContentPane().add(yoghurtBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        milkBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nutrition.jpg"))); // NOI18N
        getContentPane().add(milkBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        eggBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/egg.jpg"))); // NOI18N
        getContentPane().add(eggBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        creamBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cheese.jpg"))); // NOI18N
        getContentPane().add(creamBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        cheeseBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cheese.jpg"))); // NOI18N
        getContentPane().add(cheeseBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        butterBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/butter.jpg"))); // NOI18N
        getContentPane().add(butterBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        waterBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/water.jpg"))); // NOI18N
        getContentPane().add(waterBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        veganBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nutrition.jpg"))); // NOI18N
        getContentPane().add(veganBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        teaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tea.jpg"))); // NOI18N
        getContentPane().add(teaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        nutritionBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nutrition.jpg"))); // NOI18N
        getContentPane().add(nutritionBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        juiceBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/juices.jpg"))); // NOI18N
        getContentPane().add(juiceBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        coffeeBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coffee.jpg"))); // NOI18N
        getContentPane().add(coffeeBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        breadBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bread.jpg"))); // NOI18N
        getContentPane().add(breadBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        dessertBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/desserts.jpg"))); // NOI18N
        getContentPane().add(dessertBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 770, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BakeryButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BakeryButtonMouseEntered
        jLayeredPane2.setVisible(true);  //Layered pane becomes visible and
        switchPanels(BakeryPanel);   // switches panel to show Bakery Panel 
    }//GEN-LAST:event_BakeryButtonMouseEntered

    private void BeveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BeveButtonMouseEntered
         jLayeredPane2.setVisible(true);  //Layered pane becomes visible and
        switchPanels(BeveragePanel);    // switches panel to show Beverage Panel 
    }//GEN-LAST:event_BeveButtonMouseEntered

    private void BakeryPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BakeryPanelMouseEntered
        jLayeredPane2.setVisible(true);  //Layered pane remains visible and
        BakeryPanel.setVisible(true);   // Bakery Panel remains visible
    }//GEN-LAST:event_BakeryPanelMouseEntered

    private void BeveragePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BeveragePanelMouseEntered
        jLayeredPane2.setVisible(true);  //Layered pane remains visible and
        BeveragePanel.setVisible(true);  // Bakery Panel remains visible
    }//GEN-LAST:event_BeveragePanelMouseEntered

    private void DairyPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DairyPanelMouseEntered
        jLayeredPane2.setVisible(true);  //Layered pane becomes visible and
        DairyPanel.setVisible(true);   // switches panel to show Dairy Panel  and so on....
    }//GEN-LAST:event_DairyPanelMouseEntered

    private void DairyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DairyButtonMouseEntered
         jLayeredPane2.setVisible(true);
        switchPanels(DairyPanel);  
    }//GEN-LAST:event_DairyButtonMouseEntered

    private void BakingPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BakingPanelMouseEntered
        // TODO add your handling code here:
         jLayeredPane2.setVisible(true);
         BakingPanel.setVisible(true);
    }//GEN-LAST:event_BakingPanelMouseEntered

    private void DryBakingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DryBakingButtonMouseEntered
        // TODO add your handling code here:
         jLayeredPane2.setVisible(true);
        switchPanels(BakingPanel);  
    }//GEN-LAST:event_DryBakingButtonMouseEntered

    private void freshProPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_freshProPanelMouseEntered
        // TODO add your handling code here:
         jLayeredPane2.setVisible(true);
         freshProPanel.setVisible(true);
    }//GEN-LAST:event_freshProPanelMouseEntered

    private void FreshProduceButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FreshProduceButtonMouseEntered
        // TODO add your handling code here:
        jLayeredPane2.setVisible(true);
        switchPanels(freshProPanel);  
    }//GEN-LAST:event_FreshProduceButtonMouseEntered

    private void FrozenPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrozenPanelMouseEntered
        // TODO add your handling code here:
        jLayeredPane2.setVisible(true);
          FrozenPanel.setVisible(true);
    }//GEN-LAST:event_FrozenPanelMouseEntered

    private void FrozenButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrozenButtonMouseEntered
        // TODO add your handling code here:
        jLayeredPane2.setVisible(true);
        switchPanels(FrozenPanel);  
    }//GEN-LAST:event_FrozenButtonMouseEntered

    private void HygieneItemsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HygieneItemsPanelMouseEntered
        // TODO add your handling code here:
        jLayeredPane2.setVisible(true);
          HygieneItemsPanel.setVisible(true);
    }//GEN-LAST:event_HygieneItemsPanelMouseEntered

    private void HygieneButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HygieneButtonMouseEntered
        // TODO add your handling code here:
        jLayeredPane2.setVisible(true);
        switchPanels(HygieneItemsPanel);
    }//GEN-LAST:event_HygieneButtonMouseEntered

    private void PulsesPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PulsesPanelMouseEntered
        // TODO add your handling code here:
        jLayeredPane2.setVisible(true);
          PulsesPanel.setVisible(true);  
    }//GEN-LAST:event_PulsesPanelMouseEntered

    private void PulsesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PulsesButtonMouseEntered
        // TODO add your handling code here:
        jLayeredPane2.setVisible(true);
        switchPanels(PulsesPanel);
    }//GEN-LAST:event_PulsesButtonMouseEntered

    private void SpicesPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpicesPanelMouseEntered
        // TODO add your handling code here:
         jLayeredPane2.setVisible(true);
          SpicesPanel.setVisible(true);  
    }//GEN-LAST:event_SpicesPanelMouseEntered

    private void SpicesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpicesButtonMouseEntered
        // TODO add your handling code here:
        jLayeredPane2.setVisible(true);
        switchPanels(SpicesPanel);
    }//GEN-LAST:event_SpicesButtonMouseEntered

    private void BreadButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BreadButtonMousePressed
         breadBG.setVisible(true);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
         // The following code makes only Bread pane and table visible because Bread button is pressed
         // other all componenets remain invisible
          BreadPane.setVisible(true);  
          BreadTable.setVisible(true);
          
          DessertPane.setVisible(false);
          DessertTable.setVisible(false);
          CoffeePane.setVisible(false);
          CoffeeTable.setVisible(false);
          NutritionPane.setVisible(false);
          NutritionTable.setVisible(false);
          TeaPane.setVisible(false);
          TeaTable.setVisible(false);
          VeganPane.setVisible(false);
          VeganTable.setVisible(false);
          WaterPane.setVisible(false);
          WaterTable.setVisible(false);
          ButterPane.setVisible(false);
          ButterTable.setVisible(false);
          CheesePane.setVisible(false);
          CheeseTable.setVisible(false);
          EggPane.setVisible(false);
          EggTable.setVisible(false);
          CreamPane.setVisible(false);
          CreamTable.setVisible(false);
          MilkPane.setVisible(false);
          MilkTable.setVisible(false);
          YoghurtPane.setVisible(false);
          YoghurtTable.setVisible(false);
          BakingPane.setVisible(false);
          BakingTable.setVisible(false);
          ChipsPane.setVisible(false);
          ChipsTable.setVisible(false);
          NoodlesPane.setVisible(false);
          NoodlesTable.setVisible(false);
          RicePane.setVisible(false);
          RiceTable.setVisible(false);
          SweetenerPane.setVisible(false);
          SweetenerTable.setVisible(false);
          VegPane.setVisible(false);
          VegTable.setVisible(false);
          FruitPane.setVisible(false);
          FruitTable.setVisible(false);
          FrozenPane.setVisible(false);
         FrozenTable.setVisible(false);   
         GlovePane.setVisible(false);
         GloveTable.setVisible(false);
         HairPane.setVisible(false);
         HairTable.setVisible(false);
         SoapPane.setVisible(false);
         SoapTable.setVisible(false);
         DetergentPane.setVisible(false);
         DetergentTable.setVisible(false); 
         LentilPane.setVisible(false);
         LentilTable.setVisible(false);
         BeanPane.setVisible(false);
         BeanTable.setVisible(false);
         NutPane.setVisible(false);
         NutTable.setVisible(false);
         BasilPane.setVisible(false);
         BasilTable.setVisible(false);
         PepperPane.setVisible(false);
         PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
         CinnamonTable.setVisible(false);
         CuminPane.setVisible(false);
         CuminTable.setVisible(false);
         CurryPane.setVisible(false);
         CurryTable.setVisible(false);
         SaltPane.setVisible(false);
         SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_BreadButtonMousePressed

    private void DessertsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DessertsButtonMousePressed
            breadBG.setVisible(false);  
        dessertBG.setVisible(true);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
            
            DessertPane.setVisible(true);
            DessertTable.setVisible(true);
          
          BreadPane.setVisible(false);
          BreadTable.setVisible(false);
          CoffeePane.setVisible(false);
          CoffeeTable.setVisible(false);
          JuicePane.setVisible(false);
          JuiceTable.setVisible(false);
          NutritionPane.setVisible(false);
          NutritionTable.setVisible(false);
          TeaPane.setVisible(false);
          TeaTable.setVisible(false);
          VeganPane.setVisible(false);
          VeganTable.setVisible(false);
          WaterPane.setVisible(false);
          WaterTable.setVisible(false);
          ButterPane.setVisible(false);
          ButterTable.setVisible(false);
          CheesePane.setVisible(false);
          CheeseTable.setVisible(false);
          EggPane.setVisible(false);
          EggTable.setVisible(false);
          CreamPane.setVisible(false);
          CreamTable.setVisible(false);
          MilkPane.setVisible(false);
          MilkTable.setVisible(false);
          YoghurtPane.setVisible(false);
          YoghurtTable.setVisible(false);
          BakingPane.setVisible(false);
          BakingTable.setVisible(false);
          ChipsPane.setVisible(false);
          ChipsTable.setVisible(false);  
          NoodlesPane.setVisible(false);
          NoodlesTable.setVisible(false);
          RicePane.setVisible(false);
          RiceTable.setVisible(false);
          SweetenerPane.setVisible(false);
          SweetenerTable.setVisible(false);
          VegPane.setVisible(false);
          VegTable.setVisible(false);
          FruitPane.setVisible(false);
          FruitTable.setVisible(false);
          FrozenPane.setVisible(false);
          FrozenTable.setVisible(false);   
          GlovePane.setVisible(false);
          GloveTable.setVisible(false);
          HairPane.setVisible(false);
          HairTable.setVisible(false);
          SoapPane.setVisible(false);
          SoapTable.setVisible(false);
          DetergentPane.setVisible(false);
          DetergentTable.setVisible(false);
          LentilPane.setVisible(false);
          LentilTable.setVisible(false);
          BeanPane.setVisible(false);
          BeanTable.setVisible(false);
          NutPane.setVisible(false);
          NutTable.setVisible(false);
          BasilPane.setVisible(false);
          BasilTable.setVisible(false);
          PepperPane.setVisible(false);
          PepperTable.setVisible(false);
          CinnamonPane.setVisible(false);
          CinnamonTable.setVisible(false);
          CuminPane.setVisible(false);
          CuminTable.setVisible(false);
          CurryPane.setVisible(false);
          CurryTable.setVisible(false);
          SaltPane.setVisible(false);
          SaltTable.setVisible(false);
          ThymePane.setVisible(false);
          ThymeTable.setVisible(false);
          TurmericPane.setVisible(false);
          TurmericTable.setVisible(false);
           PeaPane.setVisible(false);
           PeaTable.setVisible(false);
    }//GEN-LAST:event_DessertsButtonMousePressed

    private void CoffeeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoffeeButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(true);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        CoffeePane.setVisible(true);
        CoffeeTable.setVisible(true);
        
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);  
        EggPane.setVisible(false);
        EggTable.setVisible(false);
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
        CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_CoffeeButtonMousePressed

    private void JuiceButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JuiceButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(true);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false); 
        
        JuicePane.setVisible(true);
        JuiceTable.setVisible(true);
        
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);
        EggPane.setVisible(false);
        EggTable.setVisible(false);
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false); 
        CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_JuiceButtonMousePressed

    private void NutritionButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutritionButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(true);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        NutritionPane.setVisible(true);
        NutritionTable.setVisible(true);
        
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);
        EggPane.setVisible(false);
        EggTable.setVisible(false);
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_NutritionButtonMousePressed

    private void TeaButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeaButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(true);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        TeaPane.setVisible(true);
        TeaTable.setVisible(true);
        
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);
        EggPane.setVisible(false);
        EggTable.setVisible(false);
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false); 
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_TeaButtonMousePressed

    private void VeganButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VeganButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(true);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        VeganPane.setVisible(true);
        VeganTable.setVisible(true);
        
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);
        EggPane.setVisible(false);
        EggTable.setVisible(false);
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_VeganButtonMousePressed

    private void WaterButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WaterButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(true);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        WaterPane.setVisible(true);
        WaterTable.setVisible(true);
        
         VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        ButterPane.setVisible(false);
        ButterTable.setVisible(false); 
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);
        EggPane.setVisible(false);
        EggTable.setVisible(false);
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_WaterButtonMousePressed

    private void ButterButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButterButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(true);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        ButterPane.setVisible(true);
        ButterTable.setVisible(true);
        
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);
        EggPane.setVisible(false);
        EggTable.setVisible(false);
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false); 
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_ButterButtonMousePressed

    private void CheeseButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheeseButtonMousePressed
       breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(true);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        CheesePane.setVisible(true);
        CheeseTable.setVisible(true);
        
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        EggPane.setVisible(false);
        EggTable.setVisible(false);
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false); 
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_CheeseButtonMousePressed

    private void EggButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EggButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(true);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        EggPane.setVisible(true);
        EggTable.setVisible(true);
        
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false); 
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_EggButtonMousePressed

    private void CreamButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreamButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(true);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        CreamPane.setVisible(true);
        CreamTable.setVisible(true);
        
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false); 
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_CreamButtonMousePressed

    private void MilkButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MilkButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(true);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        MilkPane.setVisible(true);
        MilkTable.setVisible(true);
        
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);   
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_MilkButtonMousePressed

    private void YoghurtButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YoghurtButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(true);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        YoghurtPane.setVisible(true);
        YoghurtTable.setVisible(true);
        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);   
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);  
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_YoghurtButtonMousePressed

    private void BakingButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BakingButtonMousePressed
       breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(true);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        BakingPane.setVisible(true);
        BakingTable.setVisible(true);
        
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);   
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
         CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_BakingButtonMousePressed

    private void ChipsSnackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChipsSnackButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(true);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        ChipsPane.setVisible(true);
        ChipsTable.setVisible(true);  
        
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
         CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_ChipsSnackButtonMousePressed

    private void NoodlesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoodlesButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(true);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        NoodlesPane.setVisible(true);
        NoodlesTable.setVisible(true);
        
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        RicePane.setVisible(false);
        RiceTable.setVisible(false);
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_NoodlesButtonMousePressed

    private void RiceButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiceButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(true);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        RicePane.setVisible(true);
        RiceTable.setVisible(true);
        
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false); 
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
         CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_RiceButtonMousePressed

    private void SweetnerButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SweetnerButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(true);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        SweetenerPane.setVisible(true);
        SweetenerTable.setVisible(true);
        
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_SweetnerButtonMousePressed

    private void FruitsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FruitsButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(true);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        FruitPane.setVisible(true);
        FruitTable.setVisible(true);
        
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        VegPane.setVisible(false);
        VegTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_FruitsButtonMousePressed

    private void VegButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VegButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(true);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        VegPane.setVisible(true);
        VegTable.setVisible(true);
        
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);   
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_VegButtonMousePressed

    private void FrozenFButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrozenFButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(true);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        FrozenPane.setVisible(true);
        FrozenTable.setVisible(true);   
        
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
         CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_FrozenFButtonMousePressed

    private void DetergentButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetergentButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(true);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false); 
        
        DetergentPane.setVisible(true);
        DetergentTable.setVisible(true);
        
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
         CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_DetergentButtonMousePressed

    private void GlovesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GlovesButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(true);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        GlovePane.setVisible(true);
        GloveTable.setVisible(true);
        
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        HairPane.setVisible(false);
        HairTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_GlovesButtonMousePressed

    private void hairWashButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hairWashButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(true);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        HairPane.setVisible(true);
        HairTable.setVisible(true);
        
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_hairWashButtonMousePressed

    private void SoapsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoapsButtonMousePressed
       breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(true);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        SoapPane.setVisible(true);
        SoapTable.setVisible(true);
        
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
        CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_SoapsButtonMousePressed

    private void LentilsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LentilsButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(true);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        LentilPane.setVisible(true);
        LentilTable.setVisible(true);
        
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_LentilsButtonMousePressed

    private void BeansButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BeansButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(true);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        BeanPane.setVisible(true);
        BeanTable.setVisible(true);
        
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        NutPane.setVisible(false);
        NutTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_BeansButtonMousePressed

    private void NutsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutsButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(true);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        NutPane.setVisible(true);
        NutTable.setVisible(true);
        
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);       
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
         CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_NutsButtonMousePressed

    private void BasilButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BasilButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(true);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        BasilPane.setVisible(true);
        BasilTable.setVisible(true);
        
        NutPane.setVisible(false);
        NutTable.setVisible(false);       
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);       
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);       
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
         CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_BasilButtonMousePressed

    private void BreadTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BreadTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) BreadTable.getModel();  //gets table model 
         
            int i = BreadTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = BreadTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
      
    
    }//GEN-LAST:event_BreadTableMouseClicked

    private void DessertTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DessertTableMouseClicked
       try{
        
            DefaultTableModel model = (DefaultTableModel) DessertTable.getModel();  //gets table model 
         
            int i = DessertTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = DessertTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_DessertTableMouseClicked

    private void PepperTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PepperTableMouseClicked
        // TODO add your handling code here:
        try{

            DefaultTableModel model = (DefaultTableModel) PepperTable.getModel();

            int i = PepperTable.getSelectedRow();
            TableModel Tmodel = PepperTable.getModel();

            ItemCode.setText(Tmodel.getValueAt(i,0).toString());

            BrandItem.setText(Tmodel.getValueAt(i, 1).toString());

            Price.setText(Tmodel.getValueAt(i,2).toString());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_PepperTableMouseClicked

    private void BlackPButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlackPButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(true);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        PepperPane.setVisible(true);
        PepperTable.setVisible(true);
        
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);    
        NutPane.setVisible(false);
        NutTable.setVisible(false);       
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);       
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);  
         CinnamonPane.setVisible(false);
        CinnamonTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_BlackPButtonMousePressed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
       // To get values from components 
      String OrderCode = RandomNoLabel.getText();
      String iCode = ItemCode.getText();
      String iBrand = BrandItem.getText();  
      float iPrice = Float.parseFloat(Price.getText());    
      float iQuantity = (float) Quantity.getSelectedIndex();
      float priQuan = iPrice * iQuantity;      
               
           try
            {
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = (Connection)
                 DriverManager.getConnection("jdbc:mysql://localhost:3306/Martopedia","root","abc.123$");  //establishes relation with MySQL database
          
                 String query = "INSERT INTO Orders(OrderCode, ItemCode, ItemName, Price, Quantity, Total)"+"VALUES(?,?,?,?,?,?)";  //MySQL query to INSERT data into database
                 PreparedStatement pst = con.prepareStatement(query);
          
                       pst.setString(1,OrderCode);
                       pst.setString(2,iCode);
                       pst.setString(3,iBrand);              
                       pst.setDouble(4,iPrice);
                       pst.setDouble(5,iQuantity);
                       pst.setDouble(6,priQuan);
          
                       pst.executeUpdate();
          
                JOptionPane.showMessageDialog(null,"Added to Cart!");  //Displays a success message so that user can have a confirmation
         
             }    
           catch(Exception e)
             {
                   JOptionPane.showMessageDialog(this,e.getMessage());
             }
     
      
    }//GEN-LAST:event_addToCartActionPerformed

    private void CinnamonTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinnamonTableMouseClicked
        // TODO add your handling code here:
        try{

            DefaultTableModel model = (DefaultTableModel) CinnamonTable.getModel();

            int i = CinnamonTable.getSelectedRow();
            TableModel Tmodel = CinnamonTable.getModel();

            ItemCode.setText(Tmodel.getValueAt(i,0).toString());

            BrandItem.setText(Tmodel.getValueAt(i, 1).toString());

            Price.setText(Tmodel.getValueAt(i,2).toString());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_CinnamonTableMouseClicked

    private void CinnamonButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinnamonButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(true);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        CinnamonPane.setVisible(true );
        CinnamonTable.setVisible(true);
       
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);      
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);    
        NutPane.setVisible(false);
        NutTable.setVisible(false);       
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);       
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false); 
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_CinnamonButtonMousePressed

    private void CuminTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuminTableMouseClicked
        // TODO add your handling code here:
        try{

            DefaultTableModel model = (DefaultTableModel) CinnamonTable.getModel();

            int i = CinnamonTable.getSelectedRow();
            TableModel Tmodel = CinnamonTable.getModel();

            ItemCode.setText(Tmodel.getValueAt(i,0).toString());

            BrandItem.setText(Tmodel.getValueAt(i, 1).toString());

            Price.setText(Tmodel.getValueAt(i,2).toString());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_CuminTableMouseClicked

    private void logOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOUTActionPerformed
        // TODO add your handling code here:
        new Getting_IN().setVisible(true);        
        this.dispose();  //The current form will close
    }//GEN-LAST:event_logOUTActionPerformed

    private void myCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myCartActionPerformed
        // TODO add your handling code here:
        new UserCart().setVisible(true);
        UserCart.RandomNoLabel.setText(RandomNoLabel.getText());
        this.dispose();  //The current form will close
    }//GEN-LAST:event_myCartActionPerformed

    private void CurryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurryTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) CurryTable.getModel();  //gets table model 
         
            int i = CurryTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = CurryTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_CurryTableMouseClicked

    private void SaltTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaltTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) SaltTable.getModel();  //gets table model 
         
            int i = SaltTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = SaltTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_SaltTableMouseClicked

    private void ThymeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThymeTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) ThymeTable.getModel();  //gets table model 
         
            int i = ThymeTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = ThymeTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_ThymeTableMouseClicked

    private void TurmericTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TurmericTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) TurmericTable.getModel();  //gets table model 
         
            int i = TurmericTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = TurmericTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_TurmericTableMouseClicked

    private void CuminButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuminButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(true);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        CuminPane.setVisible(true);
        CuminTable.setVisible(true);
        
        CinnamonPane.setVisible(false );
        CinnamonTable.setVisible(false);   
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);      
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);    
        NutPane.setVisible(false);
        NutTable.setVisible(false);       
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);       
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_CuminButtonMousePressed

    private void CurryButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurryButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(true);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        CurryPane.setVisible(true);
        CurryTable.setVisible(true);
        
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);      
        CinnamonPane.setVisible(false );
        CinnamonTable.setVisible(false);   
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);      
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);    
        NutPane.setVisible(false);
        NutTable.setVisible(false);       
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);       
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_CurryButtonMousePressed

    private void SaltButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaltButtonMousePressed
       breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(true);
        thymeBG.setVisible(false);
        turmericBG.setVisible(false);
        
        SaltPane.setVisible(true);
        SaltTable.setVisible(true);
 
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);      
        CinnamonPane.setVisible(false );
        CinnamonTable.setVisible(false);   
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);      
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);    
        NutPane.setVisible(false);
        NutTable.setVisible(false);       
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);       
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_SaltButtonMousePressed

    private void ThymeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThymeButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(true);
        turmericBG.setVisible(false);
        
        ThymePane.setVisible(true);
        ThymeTable.setVisible(true);
 
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);      
        CinnamonPane.setVisible(false );
        CinnamonTable.setVisible(false);   
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);      
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);    
        NutPane.setVisible(false);
        NutTable.setVisible(false);       
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);       
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_ThymeButtonMousePressed

    private void TurmericPButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TurmericPButtonMousePressed
        breadBG.setVisible(false);  
        dessertBG.setVisible(false);
        coffeeBG.setVisible(false);
        juiceBG.setVisible(false);
        nutritionBG.setVisible(false);
        teaBG.setVisible(false);
        veganBG.setVisible(false);
        waterBG.setVisible(false);
        butterBG.setVisible(false);
        cheeseBG.setVisible(false);
        creamBG.setVisible(false);
        eggBG.setVisible(false);
        milkBG.setVisible(false);
        bakingBG.setVisible(false);
        yoghurtBG.setVisible(false);
        chipsBG.setVisible(false);
        noodlesBG.setVisible(false);
        riceBG.setVisible(false);
        sweetBG.setVisible(false);
        fruitBG.setVisible(false);
        vegeBG.setVisible(false);
        frozenBG.setVisible(false);
        detergentBG.setVisible(false);
        gloveBG.setVisible(false);
        hairBG.setVisible(false);
        soapBG.setVisible(false);
        beanBG.setVisible(false);
        lentilBG.setVisible(false);
        nutBG.setVisible(false);
        peaBG.setVisible(false);
        basilBG.setVisible(false);
        blackPBG.setVisible(false);
        cinnamonBG.setVisible(false);
        cuminBG.setVisible(false);
        curryBG.setVisible(false);
        saltBG.setVisible(false);
        thymeBG.setVisible(false);
        turmericBG.setVisible(true);
        
        TurmericPane.setVisible(true);
        TurmericTable.setVisible(true);
         
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);      
        CinnamonPane.setVisible(false );
        CinnamonTable.setVisible(false);   
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);      
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);    
        NutPane.setVisible(false);
        NutTable.setVisible(false);       
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);       
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);        
        PeaPane.setVisible(false);
        PeaTable.setVisible(false);
    }//GEN-LAST:event_TurmericPButtonMousePressed

    private void PeasButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeasButtonMousePressed
        PeaPane.setVisible(true);
        PeaTable.setVisible(true);
        
        TurmericPane.setVisible(false);
        TurmericTable.setVisible(false);       
        SaltPane.setVisible(false);
        SaltTable.setVisible(false);
        CurryPane.setVisible(false);
        CurryTable.setVisible(false);
        ThymePane.setVisible(false);
        ThymeTable.setVisible(false);
        CuminPane.setVisible(false);
        CuminTable.setVisible(false);      
        CinnamonPane.setVisible(false );
        CinnamonTable.setVisible(false);   
        PepperPane.setVisible(false);
        PepperTable.setVisible(false);      
        BasilPane.setVisible(false);
        BasilTable.setVisible(false);    
        NutPane.setVisible(false);
        NutTable.setVisible(false);       
        BeanPane.setVisible(false);
        BeanTable.setVisible(false);       
        LentilPane.setVisible(false);
        LentilTable.setVisible(false);       
        SoapPane.setVisible(false);
        SoapTable.setVisible(false);      
        HairPane.setVisible(false);
        HairTable.setVisible(false);       
        GlovePane.setVisible(false);
        GloveTable.setVisible(false);   
        DetergentPane.setVisible(false);
        DetergentTable.setVisible(false);     
        FrozenPane.setVisible(false);
        FrozenTable.setVisible(false);           
        VegPane.setVisible(false);
        VegTable.setVisible(false);     
        FruitPane.setVisible(false);
        FruitTable.setVisible(false);      
        SweetenerPane.setVisible(false);
        SweetenerTable.setVisible(false);       
        RicePane.setVisible(false);
        RiceTable.setVisible(false);       
        NoodlesPane.setVisible(false);
        NoodlesTable.setVisible(false);     
        ChipsPane.setVisible(false);
        ChipsTable.setVisible(false);       
        BakingPane.setVisible(false);
        BakingTable.setVisible(false);      
        YoghurtPane.setVisible(false);
        YoghurtTable.setVisible(false);        
        MilkPane.setVisible(false);
        MilkTable.setVisible(false);       
        CreamPane.setVisible(false);
        CreamTable.setVisible(false);      
        EggPane.setVisible(false);
        EggTable.setVisible(false);      
        CheesePane.setVisible(false);
        CheeseTable.setVisible(false);   
        ButterPane.setVisible(false);
        ButterTable.setVisible(false);       
        WaterPane.setVisible(false);
        WaterTable.setVisible(false);       
        VeganPane.setVisible(false);
        VeganTable.setVisible(false);     
        TeaPane.setVisible(false);
        TeaTable.setVisible(false);      
        NutritionPane.setVisible(false);
        NutritionTable.setVisible(false);       
        JuicePane.setVisible(false);
        JuiceTable.setVisible(false);     
        CoffeePane.setVisible(false);
        CoffeeTable.setVisible(false);      
        DessertPane.setVisible(false);
        DessertTable.setVisible(false);
        BreadPane.setVisible(false);
        BreadTable.setVisible(false);  
    }//GEN-LAST:event_PeasButtonMousePressed

    private void CoffeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoffeeTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) CoffeeTable.getModel();  //gets table model 
         
            int i = CoffeeTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = CoffeeTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_CoffeeTableMouseClicked

    private void JuiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JuiceTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) JuiceTable.getModel();  //gets table model 
         
            int i = JuiceTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = JuiceTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_JuiceTableMouseClicked

    private void NutritionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutritionTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) NutritionTable.getModel();  //gets table model 
         
            int i = NutritionTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = NutritionTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_NutritionTableMouseClicked

    private void TeaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeaTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) TeaTable.getModel();  //gets table model 
         
            int i = TeaTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = TeaTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_TeaTableMouseClicked

    private void VeganTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VeganTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) VeganTable.getModel();  //gets table model 
         
            int i = VeganTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = VeganTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }//GEN-LAST:event_VeganTableMouseClicked

    private void WaterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WaterTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) WaterTable.getModel();  //gets table model 
         
            int i = WaterTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = WaterTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }//GEN-LAST:event_WaterTableMouseClicked

    private void ButterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButterTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) ButterTable.getModel();  //gets table model 
         
            int i = ButterTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = ButterTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_ButterTableMouseClicked

    private void CheeseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheeseTableMouseClicked
         try{
        
            DefaultTableModel model = (DefaultTableModel) CheeseTable.getModel();  //gets table model 
         
            int i = CheeseTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = CheeseTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_CheeseTableMouseClicked

    private void EggTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EggTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) EggTable.getModel();  //gets table model 
         
            int i = EggTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = EggTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_EggTableMouseClicked

    private void CreamTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreamTableMouseClicked
         try{
        
            DefaultTableModel model = (DefaultTableModel) CreamTable.getModel();  //gets table model 
         
            int i = CreamTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = CreamTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }        
    }//GEN-LAST:event_CreamTableMouseClicked

    private void MilkTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MilkTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) MilkTable.getModel();  //gets table model 
         
            int i = MilkTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = MilkTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_MilkTableMouseClicked

    private void YoghurtTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YoghurtTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) YoghurtTable.getModel();  //gets table model 
         
            int i = YoghurtTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = YoghurtTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }        
    }//GEN-LAST:event_YoghurtTableMouseClicked

    private void BakingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BakingTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) BakingTable.getModel();  //gets table model 
         
            int i = YoghurtTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = BakingTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }        
    }//GEN-LAST:event_BakingTableMouseClicked

    private void ChipsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChipsTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) ChipsTable.getModel();  //gets table model 
         
            int i = ChipsTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = ChipsTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }        
    }//GEN-LAST:event_ChipsTableMouseClicked

    private void NoodlesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoodlesTableMouseClicked
       try{
        
            DefaultTableModel model = (DefaultTableModel) NoodlesTable.getModel();  //gets table model 
         
            int i = NoodlesTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = NoodlesTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_NoodlesTableMouseClicked

    private void RiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiceTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) RiceTable.getModel();  //gets table model 
         
            int i = RiceTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = RiceTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_RiceTableMouseClicked

    private void SweetenerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SweetenerTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) SweetenerTable.getModel();  //gets table model 
         
            int i = SweetenerTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = SweetenerTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_SweetenerTableMouseClicked

    private void FruitTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FruitTableMouseClicked
         try{
        
            DefaultTableModel model = (DefaultTableModel) FruitTable.getModel();  //gets table model 
         
            int i = FruitTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = FruitTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_FruitTableMouseClicked

    private void VegTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VegTableMouseClicked
         try{
        
            DefaultTableModel model = (DefaultTableModel) VegTable.getModel();  //gets table model 
         
            int i = VegTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = VegTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_VegTableMouseClicked

    private void FrozenTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrozenTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) FrozenTable.getModel();  //gets table model 
         
            int i = FrozenTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = FrozenTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_FrozenTableMouseClicked

    private void DetergentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetergentTableMouseClicked
         try{
        
            DefaultTableModel model = (DefaultTableModel) DetergentTable.getModel();  //gets table model 
         
            int i = DetergentTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = DetergentTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_DetergentTableMouseClicked

    private void GloveTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GloveTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) GloveTable.getModel();  //gets table model 
         
            int i = GloveTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = GloveTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_GloveTableMouseClicked

    private void HairTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HairTableMouseClicked
         try{
        
            DefaultTableModel model = (DefaultTableModel) HairTable.getModel();  //gets table model 
         
            int i = HairTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = HairTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_HairTableMouseClicked

    private void SoapTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoapTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) SoapTable.getModel();  //gets table model 
         
            int i = SoapTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = SoapTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_SoapTableMouseClicked

    private void BeanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BeanTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) BeanTable.getModel();  //gets table model 
         
            int i = BeanTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = BeanTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_BeanTableMouseClicked

    private void LentilTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LentilTableMouseClicked
         try{
        
            DefaultTableModel model = (DefaultTableModel) LentilTable.getModel();  //gets table model 
         
            int i = LentilTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = LentilTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_LentilTableMouseClicked

    private void NutTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) NutTable.getModel();  //gets table model 
         
            int i = NutTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = NutTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_NutTableMouseClicked

    private void PeaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeaTableMouseClicked
         try{
        
            DefaultTableModel model = (DefaultTableModel) PeaTable.getModel();  //gets table model 
         
            int i = PeaTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = PeaTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_PeaTableMouseClicked

    private void BasilTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BasilTableMouseClicked
        try{
        
            DefaultTableModel model = (DefaultTableModel) BasilTable.getModel();  //gets table model 
         
            int i = BasilTable.getSelectedRow();  //initialises table row numbers to variable i
            TableModel Tmodel = BasilTable.getModel();
        
           ItemCode.setText(Tmodel.getValueAt(i,0).toString());  // values are taken from table rows and set into their respected fields 
           BrandItem.setText(Tmodel.getValueAt(i, 1).toString());
           WeightPiece.setText(Tmodel.getValueAt(i,2).toString());
           Price.setText(Tmodel.getValueAt(i,3).toString());
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
    }//GEN-LAST:event_BasilTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BakeryButton;
    private javax.swing.JPanel BakeryPanel;
    private javax.swing.JLabel BakingButton;
    private javax.swing.JScrollPane BakingPane;
    private javax.swing.JPanel BakingPanel;
    private javax.swing.JTable BakingTable;
    private javax.swing.JLabel BasilButton;
    private javax.swing.JScrollPane BasilPane;
    private javax.swing.JTable BasilTable;
    private javax.swing.JScrollPane BeanPane;
    private javax.swing.JTable BeanTable;
    private javax.swing.JLabel BeansButton;
    private javax.swing.JLabel BeveButton;
    private javax.swing.JPanel BeveragePanel;
    private javax.swing.JLabel BlackPButton;
    private javax.swing.JTextField BrandItem;
    private javax.swing.JLabel BreadButton;
    private javax.swing.JScrollPane BreadPane;
    private javax.swing.JTable BreadTable;
    private javax.swing.JLabel ButterButton;
    private javax.swing.JScrollPane ButterPane;
    private javax.swing.JTable ButterTable;
    private javax.swing.JPanel CategoriesPanel;
    private javax.swing.JLabel CheeseButton;
    private javax.swing.JScrollPane CheesePane;
    private javax.swing.JTable CheeseTable;
    private javax.swing.JScrollPane ChipsPane;
    private javax.swing.JLabel ChipsSnackButton;
    private javax.swing.JTable ChipsTable;
    private javax.swing.JLabel CinnamonButton;
    private javax.swing.JScrollPane CinnamonPane;
    private javax.swing.JTable CinnamonTable;
    private javax.swing.JLabel CoffeeButton;
    private javax.swing.JScrollPane CoffeePane;
    private javax.swing.JTable CoffeeTable;
    private javax.swing.JLabel CreamButton;
    private javax.swing.JScrollPane CreamPane;
    private javax.swing.JTable CreamTable;
    private javax.swing.JLabel CuminButton;
    private javax.swing.JScrollPane CuminPane;
    private javax.swing.JTable CuminTable;
    private javax.swing.JLabel CurryButton;
    private javax.swing.JScrollPane CurryPane;
    private javax.swing.JTable CurryTable;
    private javax.swing.JLabel DairyButton;
    private javax.swing.JPanel DairyPanel;
    private javax.swing.JScrollPane DessertPane;
    private javax.swing.JTable DessertTable;
    private javax.swing.JLabel DessertsButton;
    private javax.swing.JLabel DetergentButton;
    private javax.swing.JScrollPane DetergentPane;
    private javax.swing.JTable DetergentTable;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JLabel DryBakingButton;
    private javax.swing.JLabel EggButton;
    private javax.swing.JScrollPane EggPane;
    private javax.swing.JTable EggTable;
    private javax.swing.JLabel FreshProduceButton;
    private javax.swing.JLabel FrozenButton;
    private javax.swing.JLabel FrozenFButton;
    private javax.swing.JScrollPane FrozenPane;
    private javax.swing.JPanel FrozenPanel;
    private javax.swing.JTable FrozenTable;
    private javax.swing.JScrollPane FruitPane;
    private javax.swing.JTable FruitTable;
    private javax.swing.JLabel FruitsButton;
    private javax.swing.JScrollPane GlovePane;
    private javax.swing.JTable GloveTable;
    private javax.swing.JLabel GlovesButton;
    private javax.swing.JScrollPane HairPane;
    private javax.swing.JTable HairTable;
    private javax.swing.JLabel HygieneButton;
    private javax.swing.JPanel HygieneItemsPanel;
    private javax.swing.JTextField ItemCode;
    private javax.swing.JLabel JuiceButton;
    private javax.swing.JScrollPane JuicePane;
    private javax.swing.JTable JuiceTable;
    private javax.swing.JScrollPane LentilPane;
    private javax.swing.JTable LentilTable;
    private javax.swing.JLabel LentilsButton;
    private javax.swing.JLabel MilkButton;
    private javax.swing.JScrollPane MilkPane;
    private javax.swing.JTable MilkTable;
    private javax.swing.JLabel NoodlesButton;
    private javax.swing.JScrollPane NoodlesPane;
    private javax.swing.JTable NoodlesTable;
    private javax.swing.JScrollPane NutPane;
    private javax.swing.JTable NutTable;
    private javax.swing.JLabel NutritionButton;
    private javax.swing.JScrollPane NutritionPane;
    private javax.swing.JTable NutritionTable;
    private javax.swing.JLabel NutsButton;
    private javax.swing.JScrollPane PeaPane;
    private javax.swing.JTable PeaTable;
    private javax.swing.JLabel PeasButton;
    private javax.swing.JScrollPane PepperPane;
    private javax.swing.JTable PepperTable;
    private javax.swing.JTextField Price;
    private javax.swing.JLabel PulsesButton;
    private javax.swing.JPanel PulsesPanel;
    private javax.swing.JComboBox<String> Quantity;
    public static javax.swing.JLabel RandomNoLabel;
    private javax.swing.JLabel RequiredLabel;
    private javax.swing.JLabel RiceButton;
    private javax.swing.JScrollPane RicePane;
    private javax.swing.JTable RiceTable;
    private javax.swing.JLabel SaltButton;
    private javax.swing.JScrollPane SaltPane;
    private javax.swing.JTable SaltTable;
    private javax.swing.JScrollPane SoapPane;
    private javax.swing.JTable SoapTable;
    private javax.swing.JLabel SoapsButton;
    private javax.swing.JLabel SpicesButton;
    private javax.swing.JPanel SpicesPanel;
    private javax.swing.JScrollPane SweetenerPane;
    private javax.swing.JTable SweetenerTable;
    private javax.swing.JLabel SweetnerButton;
    private javax.swing.JLabel TeaButton;
    private javax.swing.JScrollPane TeaPane;
    private javax.swing.JTable TeaTable;
    private javax.swing.JLabel ThymeButton;
    private javax.swing.JScrollPane ThymePane;
    private javax.swing.JTable ThymeTable;
    private javax.swing.JLabel TurmericPButton;
    private javax.swing.JScrollPane TurmericPane;
    private javax.swing.JTable TurmericTable;
    private javax.swing.JLabel VegButton;
    private javax.swing.JScrollPane VegPane;
    private javax.swing.JTable VegTable;
    private javax.swing.JLabel VeganButton;
    private javax.swing.JScrollPane VeganPane;
    private javax.swing.JTable VeganTable;
    private javax.swing.JLabel WaterButton;
    private javax.swing.JScrollPane WaterPane;
    private javax.swing.JTable WaterTable;
    private javax.swing.JTextField WeightPiece;
    private javax.swing.JLabel YoghurtButton;
    private javax.swing.JScrollPane YoghurtPane;
    private javax.swing.JTable YoghurtTable;
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel bakingBG;
    private javax.swing.JLabel basilBG;
    private javax.swing.JLabel beanBG;
    private javax.swing.JLabel blackPBG;
    private javax.swing.JLabel breadBG;
    private javax.swing.JLabel butterBG;
    private javax.swing.JLabel cheeseBG;
    private javax.swing.JLabel chipsBG;
    private javax.swing.JLabel cinnamonBG;
    private javax.swing.JLabel coffeeBG;
    private javax.swing.JLabel creamBG;
    private javax.swing.JLabel cuminBG;
    private javax.swing.JLabel curryBG;
    private javax.swing.JLabel dessertBG;
    private javax.swing.JLabel detergentBG;
    private javax.swing.JLabel eggBG;
    public static javax.swing.JLabel emailLabel;
    private javax.swing.JPanel freshProPanel;
    private javax.swing.JLabel frozenBG;
    private javax.swing.JLabel fruitBG;
    private javax.swing.JLabel gloveBG;
    private javax.swing.JLabel hairBG;
    private javax.swing.JLabel hairWashButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel juiceBG;
    private javax.swing.JLabel lentilBG;
    private javax.swing.JButton logOUT;
    private javax.swing.JLabel milkBG;
    private javax.swing.JButton myCart;
    private javax.swing.JLabel noodlesBG;
    private javax.swing.JLabel nutBG;
    private javax.swing.JLabel nutritionBG;
    private javax.swing.JLabel peaBG;
    private javax.swing.JLabel riceBG;
    private javax.swing.JLabel saltBG;
    private javax.swing.JLabel soapBG;
    private javax.swing.JLabel sweetBG;
    private javax.swing.JLabel teaBG;
    private javax.swing.JLabel thymeBG;
    private javax.swing.JLabel turmericBG;
    private javax.swing.JLabel veganBG;
    private javax.swing.JLabel vegeBG;
    private javax.swing.JLabel waterBG;
    private javax.swing.JLabel yoghurtBG;
    // End of variables declaration//GEN-END:variables
}
