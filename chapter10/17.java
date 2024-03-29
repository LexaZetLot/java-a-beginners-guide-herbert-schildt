import java.io.*;

class Help{
    String helpfile;
    Help(String fname){
        helpfile = fname;
    }
    boolean helpOn(String what){
        int ch;
        String topic, info;

        try(BufferedReader helpRdr =
                new BufferedReader(new FileReader(helpfile))){
            do{
                ch = helpRdr.read();
                if(ch == '#'){
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0){
                        do{
                            info = helpRdr.readLine();
                            if(info != null)
                                System.out.println(info);
                        }while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            }while (ch != -1);
        }
        catch (IOException exc){
            System.out.println("Error accessing the help file");
            return false;
        }
        return false;
    }

    String getSelection(){
        String topic = "";
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in, System.console().charset()));
        System.out.print("Enter subject titles: ");
        try{
            topic = br.readLine();
        }
        catch (IOException exc){
            System.out.println("Console read error.");
        }
        return topic;
    }
}
public class Main
{
    public static void main(String[] args) throws IOException
    {
        Help hlpodj = new Help("helpfile.txt");
        String topic;

        System.out.println("Title the topic or write a stop.");
        do{
            topic = hlpodj.getSelection();

            if(!hlpodj.helpOn(topic))
                System.out.println("Topic not found");
        }while (topic.compareTo("stop") != 0);
    }
}
