package kapadokia.nyandoro.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView newsRecycler;
    NewsAdapter newsAdapter;
    List<NewsItem> newsItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //making this application to be full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        //hide action bar
        getSupportActionBar().hide();


        //inits
        newsRecycler = findViewById(R.id.news_recycler);
        newsItems = new ArrayList<>();

        addNewsItem();
        newsAdapter = new NewsAdapter(this, newsItems);
        newsRecycler.setAdapter(newsAdapter);
        newsRecycler.setLayoutManager(new LinearLayoutManager(this));

    }

    public void addNewsItem(){

        NewsItem news = new NewsItem("matin", "Heroku CLI is a command line application that lets you create, deploy and manage Heroku apps from the command line. You can download Heroku CLI from Heroku Dev Center. You’ll also find the instructions for installing Heroku CLI on your platform on that page.","14th July", R.drawable.one);
        newsItems.add(news);
        news = new NewsItem("matin", "Heroku CLI is a command line application that lets you create, deploy and manage Heroku apps from the command line. You can download Heroku CLI from Heroku Dev Center. You’ll also find the instructions for installing Heroku CLI on your platform on that page.","14th July", R.drawable.two);
        newsItems.add(news);
        news = new NewsItem("klleton", "Heroku CLI is a command line application that lets you create, deploy and manage Heroku apps from the command line. You can download Heroku CLI from Heroku Dev Center. You’ll also find the instructions for installing Heroku CLI on your platform on that page.","14th July", R.drawable.three);
        newsItems.add(news);
        news = new NewsItem("guru", "Heroku CLI is a command line application that lets you create, deploy and manage Heroku apps from the command line. You can download Heroku CLI from Heroku Dev Center. You’ll also find the instructions for installing Heroku CLI on your platform on that page.","14th July", R.drawable.four);
        newsItems.add(news);
        news = new NewsItem("maria", "Heroku CLI is a command line application that lets you create, deploy and manage Heroku apps from the command line. You can download Heroku CLI from Heroku Dev Center. You’ll also find the instructions for installing Heroku CLI on your platform on that page.","14th July", R.drawable.six);
        newsItems.add(news);
        news = new NewsItem("matin", "Heroku CLI is a command line application that lets you create, deploy and manage Heroku apps from the command line. You can download Heroku CLI from Heroku Dev Center. You’ll also find the instructions for installing Heroku CLI on your platform on that page.","14th July", R.drawable.one);
        newsItems.add(news);
        news = new NewsItem("matin", "Heroku CLI is a command line application that lets you create, deploy and manage Heroku apps from the command line. You can download Heroku CLI from Heroku Dev Center. You’ll also find the instructions for installing Heroku CLI on your platform on that page.","14th July", R.drawable.two);
        newsItems.add(news);
        news = new NewsItem("klleton", "Heroku CLI is a command line application that lets you create, deploy and manage Heroku apps from the command line. You can download Heroku CLI from Heroku Dev Center. You’ll also find the instructions for installing Heroku CLI on your platform on that page.","14th July", R.drawable.three);
        newsItems.add(news);
        news = new NewsItem("guru", "Heroku CLI is a command line application that lets you create, deploy and manage Heroku apps from the command line. You can download Heroku CLI from Heroku Dev Center. You’ll also find the instructions for installing Heroku CLI on your platform on that page.","14th July", R.drawable.four);
        newsItems.add(news);
        news = new NewsItem("maria", "Heroku CLI is a command line application that lets you create, deploy and manage Heroku apps from the command line. You can download Heroku CLI from Heroku Dev Center. You’ll also find the instructions for installing Heroku CLI on your platform on that page.","14th July", R.drawable.six);
        newsItems.add(news);

    }
}
