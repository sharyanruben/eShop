package action;

public class LogoutAction extends BaseAction {

    @Override
    public String execute() throws Exception {
        invalidate();
        return SUCCESS;
    }
}
