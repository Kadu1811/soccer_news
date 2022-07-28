package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de Notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem Desfalque Importante", "ypesetting, remaining essentially unchanged. It was popularis"));
        news.add(new News("Ferrinha Joga no Sábado", "ypesetting, remaining essentially unchanged. It was popularis"));
        news.add(new News("Copa do Mundo Feminina Está Terminando", "ypesetting, remaining essentially unchanged. It was popularis"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}