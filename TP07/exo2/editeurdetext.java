import java.util.Scanner;
import java.util.Stack;

public class editeurdetext {

	Stack<String> redo =new Stack<String>(); 
	Stack<String> Text = new Stack<String>(); 
	
	
	public editeurdetext(String text) {
		Text.add(text);
	}

	public editeurdetext() {
	}
	
	public void Redo()
	{
		if(!redo.empty())
		Text.add(redo.pop());		
	}
	public void Undo()
	{
		if(!Text.empty())
		redo.add(Text.pop());
	}
	public void Write()
	{
		String text ="";
		while(true)
		{
			Scanner scanner = new Scanner(System.in);
				text = scanner.nextLine();
				if(text.equals("0"))
					break;
				if(text.equals("1"))
				{
					Undo();
					
				}else
				if(text.equals("2"))
				{
					Redo();
					
				}else
				{
					redo.clear();
					Text.add(text);
				}
				show();
		}
		
	
	}
	public void show()
	{
		System.out.println(Text.toString());
	}
}