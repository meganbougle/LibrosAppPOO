
package entidades;
/**
 * @author Megan Bougle
 * @version 1.0
 * @created 17-Nov-2022 8:33:44 AM
 */
public class Libro {

	private String copyright;
	private int editionNumber;
	private String isbn;
	private String title;
	private Autor m_Autor;

	public Libro(){

	}

    public Libro(String copyright, int editionNumber, String isbn, String title, Autor m_Autor) {
        this.copyright = copyright;
        this.editionNumber = editionNumber;
        this.isbn = isbn;
        this.title = title;
        this.m_Autor = m_Autor;
    }

    public Autor getM_Autor() {
        return m_Autor;
    }

    public void setM_Autor(Autor m_Autor) {
        this.m_Autor = m_Autor;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
}//end Libro