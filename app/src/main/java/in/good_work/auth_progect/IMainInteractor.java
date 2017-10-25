package in.good_work.auth_progect;

import rx.Observable;

/**
 * Created by AELEX on 25.10.2017.
 */

public interface IMainInteractor {
    <T extends Object> Observable<T> reguest(T t);
}
