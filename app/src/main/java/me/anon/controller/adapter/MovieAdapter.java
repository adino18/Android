//package me.anon.controller.adapter;
//
//import android.content.Context;
//import android.content.Intent;
//import android.content.res.Configuration;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.bumptech.glide.Glide;
//import com.tutorial.sonth.movieapi.R;
//import com.tutorial.sonth.movieapi.activity.MovieDetailActivity;
//import com.tutorial.sonth.movieapi.model.APlant;
//
//import java.util.List;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
///**
// * Created by sonth on 12-Feb-17.
// */
//
//public class MovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//    Context context;
//    private List<APlant> movies;
//
//    public MovieAdapter(List<APlant> movies) {
//        this.movies = movies;
//    }
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie,parent,false);
//        context = parent.getContext();
//        return new ViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        final APlant movie = movies.get(position);
//        ViewHolder viewHolder = (ViewHolder) holder;
//        viewHolder.tvOverview.setText(movie.getOverview());
//        viewHolder.tvTitle.setText(movie.getTitle()+ " ("+movie.getReleaseDate().substring(0,4)+")");
//        viewHolder.tvIMDBList.setText(movie.getVoteAverage());
//        Configuration configuration = context.getResources().getConfiguration();
//        if(configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
//            Glide.with(viewHolder.ivCover.getContext())
//                    .load(movie.getPosterPath())
//                    .into(viewHolder.ivCover);
//        }else{
//            Glide.with(viewHolder.ivCover.getContext())
//                    .load(movie.getBackdropPath())
//                    .into(viewHolder.ivCover);
//        }
//
//        viewHolder.ivCover.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, MovieDetailActivity.class);
//                intent.putExtra("MOVIE",movie);
//                context.startActivity(intent);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return movies.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder{
//
//        @BindView(R.id.ivCover)
//        ImageView ivCover;
//        @BindView(R.id.tvTitle)
//        TextView tvTitle;
//        @BindView(R.id.tvOverview)
//        TextView tvOverview;
//        @BindView(R.id.tvIMDBList)
//        TextView tvIMDBList;
//        ViewHolder(View itemView) {
//            super(itemView);
//            ButterKnife.bind(this,itemView);
//        }
//
//
//    }
//}
