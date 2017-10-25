package in.good_work.auth_project;

import java.util.Observable;

/**
 * Created by AELEX on 25.10.2017.
 */

public class MainPresenterImpl implements IMainPresenter {
    private IMainView view;
    private IMainInteractor interator;

    public MainPresenterImpl(IMainView view) {
        this.view = view;
        this.interator = new MainInteractorImpl();
    }

    @Override
    public void getData() {
        this.view.showProgress();
        this.interator.reguest().subscribe(info -> {
            this.view.onShowData(info);
        }, throwable -> {
            this.view.onShowErrors(throwable.getMessage());
        });
        this.view.hideProgress();
    }
}
