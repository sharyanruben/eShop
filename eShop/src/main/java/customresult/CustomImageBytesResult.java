package customresult;

import action.ImageAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;

public class CustomImageBytesResult implements Result {
    @Override
    public void execute(ActionInvocation invocation) throws Exception {
        ImageAction action = (ImageAction) invocation.getAction();
        HttpServletResponse response = ServletActionContext.getResponse();

        response.setContentType(action.getCustomContentType());
        response.getOutputStream().write(action.getCustomImageInBytes());
        response.getOutputStream().flush();
    }
}
