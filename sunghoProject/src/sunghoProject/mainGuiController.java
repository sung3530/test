package sunghoProject;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

import sunghoProject.book.bookAddGui;
import sunghoProject.book.bookBorrowGui;
import sunghoProject.book.bookDeleteGui;
import sunghoProject.book.bookList;
public class mainGuiController {
	private
		bookList bl=new bookList();
	public mainGuiController(JButton[] jb,ActionEvent e){
		
		if(e.getSource().equals(jb[0])){
			bookBorrowGui bbg=new bookBorrowGui();
		}
		else if(e.getSource().equals(jb[1])){
			returnBookGui rbg=new returnBookGui();
		}
		else if(e.getSource().equals(jb[2])){
			bookAddGui bag=new bookAddGui();
		}
		else if(e.getSource().equals(jb[3])){
			bookDeleteGui bdg=new bookDeleteGui();
		}
		else if(e.getSource().equals(jb[4])){
			bl.print();
		}
		else if(e.getSource().equals(jb[5])){
			userJoinGui ujg=new userJoinGui();
		}
		else if(e.getSource().equals(jb[6])){
			findUserGui fug=new findUserGui();
		}
		else if(e.getSource().equals(jb[7])){
			userBookList ubl=new userBookList(bl);
		}
	}

}
