package controller;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import model.User;

import java.util.Map;

public class AuthenticationInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
        User user = (User) session.get("user");
        if (user == null) {
            return Action.LOGIN;
        }
        return actionInvocation.invoke();

    }
}
