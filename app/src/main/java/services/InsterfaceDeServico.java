package services;
import com.professorangoti.projetointegrador4.domain.Categoria;
import com.professorangoti.projetointegrador4.domain.Produto;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface InsterfaceDeServico {

    @GET("/precos")
    Call<List<Produto>> getListCall(@Path("id") int id);
}
