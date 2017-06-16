package com.example.eleazer.desafiomobfiq.callback;

import com.example.eleazer.desafiomobfiq.MainActivity;
import com.example.eleazer.desafiomobfiq.event.CategoryEvent;
import com.example.eleazer.desafiomobfiq.event.ProductEvent;
import com.example.eleazer.desafiomobfiq.modelos.Categories;
import com.example.eleazer.desafiomobfiq.modelos.JsonRootBean;

import org.greenrobot.eventbus.EventBus;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EnviarCategoryCallback implements Callback<JsonRootBean> {

    private MainActivity activity;
    private EventBus eventBus;

    public EnviarCategoryCallback(EventBus eventBus, MainActivity activity) {
        this.activity = activity;
        this.eventBus = eventBus;
    }

    @Override
    public void onResponse(Call<JsonRootBean> call, Response<JsonRootBean> response) {
        if(response.isSuccessful()) {
            JsonRootBean products = response.body();

            eventBus.post(new ProductEvent(products));
        }

    }

    @Override
    public void onFailure(Call<JsonRootBean> call, Throwable t) {
        System.out.println(t.getMessage());
    }
}
