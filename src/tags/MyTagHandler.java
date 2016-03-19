package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class MyTagHandler implements Tag{
	
	private PageContext context;

	
	@Override
	public void setPageContext(PageContext context) {
		
		this.context = context;
		
	}

	@Override
	public void setParent(Tag arg0) {
		
		
	}

	

	@Override
	public int doStartTag() throws JspException {
		try{
			JspWriter out = context.getOut();
			out.println("Hello!! from tag handler..");
		}catch(IOException e){
			
		}
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_BODY_INCLUDE;
	}


	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}

	
}
