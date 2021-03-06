package la.xiong.androidquick.demo.features.module.network.retrofit;

import java.util.List;

import io.reactivex.Observable;
import la.xiong.androidquick.demo.bean.NameBean;
import la.xiong.androidquick.demo.bean.TestBean;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface TestApis {

    @GET
    Observable<List<TestBean>> getOctocat(@Url String url);

    @GET("https://api.github.com/repos/octocat/Hello-World/contributors")
    Observable<List<TestBean>> getOctocat();

    @GET("http://www.xiong.la/hello")
    Observable<List<NameBean>> getTestData();
}
