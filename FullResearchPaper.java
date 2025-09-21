public class FullResearchPaper implements ResearchPaper {
    private String title;
    private String author;
    private boolean isLoaded;
    public FullResearchPaper(String title, String author, String filePath) {
        this.title = title;
        this.author = author;
    }
    @Override
    public void view() 
         {
            System.out.println("Viewing research paper: " + title);
            System.out.println("Author: " + author);
            System.out.println("PDF fully loaded into memory and ready for viewing.");
        }
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
}