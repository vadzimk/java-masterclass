package InnerCalsses;

import java.util.Scanner;

public class Button {
    private static Scanner keyboard = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args){

        // ---------- Inner class --------
//        class ClickListener implements Button.OnClickListener{
//            //constructor
//            public ClickListener(){
//                System.out.println("constructor of Clicklinener called");
//            }
//
//            @Override
//            public void onClick(String title){
//                System.out.println(title  + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        // ---------- Anonymous inner class -------

        btnPrint.setOnClickListener( new Button.OnClickListener(){
            @Override
            public void onClick(String title){
                System.out.println(title  + " was clicked");
            }
        });
        listen();
    }

    private static void listen(){

        boolean quit  = false;
        while(!quit){
            int choice = keyboard.nextInt();
            keyboard.nextLine();
            switch(choice){
                case 0: quit = true; break;
                case 1: btnPrint.onClick();

            }
        }
    }


    private String title;

    private OnClickListener onClicklistener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClicklistener = onClickListener;
    }


    public void onClick(){
        this.onClicklistener.onClick(this.title);
    }

    public interface OnClickListener{
         void onClick(String title);
    }
}
