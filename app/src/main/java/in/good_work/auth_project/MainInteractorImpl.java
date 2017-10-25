package in.good_work.auth_project;

import rx.Observable;

/**
 * Created by AELEX on 25.10.2017.
 */

public class MainInteractorImpl implements IMainInteractor {
    @Override
    public <T> Observable<T> reguest() {
        return Observable.just((T) this.moke());
    }

    private String moke(){
        return "Hello World!";
    }
}
