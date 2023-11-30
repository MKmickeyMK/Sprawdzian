package workshop;

public class Tool {
    private String toolType;

    public Tool(String toolType) {
        this.toolType = toolType;
    }

    public void useTool() {
        System.out.println("Użycie " + toolType + " narzdędzia");
    }

}


