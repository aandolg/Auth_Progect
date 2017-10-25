package in.good_work.auth_progect;

/**
 * Created by AELEX on 25.10.2017.
 */

public interface IMainView {
    void onShowErrors(String error);
    <T extends Object> void onShowData(T t);
    void showProgress();
    void hideProgress();
}
