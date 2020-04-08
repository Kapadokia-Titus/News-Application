package kapadokia.nyandoro.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {


    Context mContext;
    List<NewsItem> mData;


    public class NewsViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title,tv_context,tv_date;
        ImageView user_imv;
        RelativeLayout item_container;


        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            item_container = itemView.findViewById(R.id.item_container);
            tv_title = itemView.findViewById(R.id.title_text);
            tv_context = itemView.findViewById(R.id.text_description);
            tv_date = itemView.findViewById(R.id.date_text);
            user_imv = itemView.findViewById(R.id.user_image);
        }
    }

    public NewsAdapter(Context mContext, List<NewsItem> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public NewsAdapter.NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.item_news, parent, false);


        return new NewsViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {

        //we apply animation views here
        //first we creare animation for user photo
        holder.user_imv.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.fade_transition_animation));

        //animation for the whole card
        holder.item_container.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.fade_scale_animation));

        holder.tv_title.setText(mData.get(position).getTitle());
        holder.tv_context.setText(mData.get(position).getContext());
        holder.tv_date.setText(mData.get(position).getDate());
        holder.user_imv.setImageResource(mData.get(position).getUserPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}
