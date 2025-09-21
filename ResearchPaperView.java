public class ResearchPaperView implements ResearchPaper
{
    private String title;
    private String author;
    private boolean isLoaded;
    public ResearchPaperView(String title, String author, String filePath) {
        this.title = title;
        this.author = author;
        this.isLoaded = false;
    }
    @Override
    public void view() 
         {
            if (!isLoaded) {
                loadPDF();
            }
            System.out.println("Viewing research paper: " + title);
            System.out.println("Author: " + author);
            System.out.println("PDF loaded on demand and ready for viewing.");
        }
    private void loadPDF() {
        System.out.println("Loading PDF from disk...");
    }
