package workshop;

public class Worker {
    public static void main(String[] args) {
        Tool myTool = new Tool("młotek");
        myTool.useTool();

        Tool[] toolsArray = {new Tool("wkrętak"), new Tool("piła"), new Tool("narząd")};
        for (Tool tool : toolsArray) {
            tool.useTool();
        }
    }
}
