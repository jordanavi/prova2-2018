package services;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface InterfaceDeServicos {

    @GET("/precos")
    Call<List<Produto>> getProduto(@Path("id") int id);
    @GET("/precos")
    Call<List<Produto>> getPreco(@Path("id") int id);

}
