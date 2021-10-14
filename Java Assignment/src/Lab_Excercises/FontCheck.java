package Lab_Excercises;
import java.awt.*; 

public class FontCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Font f;
		f = new Font("TimesNewRoman", Font.BOLD + Font.ITALIC, 12);
		String font = f.getName();
		int style = f.getStyle();
		int size = f.getSize();
		boolean bold = f.isBold();
		boolean normal = f.isPlain();
		boolean italic = f.isItalic();
		System.out.println("Font : " + font + "\nStyle : " + style + "\nSize: " + size + "\nBold : " + bold
				+ "\nItalic : " + italic);

	}

}
