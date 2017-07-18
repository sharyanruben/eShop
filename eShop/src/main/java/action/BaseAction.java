package action;


import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class BaseAction extends ActionSupport implements SessionAware, ApplicationAware {
    protected Map<String, Object> session;
    protected Map<String, Object> application;

    public void setSession(Map<String, Object> map) {
        session = map;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        application = map;
    }

    void invalidate() {
        session.clear();
    }
}
