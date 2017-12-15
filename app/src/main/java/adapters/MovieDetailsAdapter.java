package adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.moviedetail.R;

import viewholders.ItemMoviesViewHolder;

/**
 * Created by ICE on 14-12-2017.
 */

public class MovieDetailsAdapter extends RecyclerView.Adapter{

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View moviesItemView=inflater.inflate(R.layout.activity_movie_detail_images,parent,false);
        ItemMoviesViewHolder itemMoviesViewHolder=new ItemMoviesViewHolder(moviesItemView);



        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
