package com.ielts.reading.listening.writing.speaking;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class SmallVideoAdapter  extends RecyclerView.Adapter<SmallVideoAdapter.ViewHolder> {
    private List<List_Data> list_data;
    private Context context;

    public SmallVideoAdapter(List<List_Data> list_data, Context context) {
        this.list_data = list_data;
        this.context = context;
    }

    @Override
    public SmallVideoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.mainvideosmalllist,parent,false);
        return new SmallVideoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SmallVideoAdapter.ViewHolder holder, int position) {
        List_Data listData=list_data.get(position);

        Picasso.get()
                .load(listData
                        .getUrl())
                .fit()
                .into(holder.img);

        holder.txtname.setText(listData.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoPlayer= new Intent(context,VideoDetailView.class);
                videoPlayer.putExtra("videoId",listData.getVideoId());
                videoPlayer.putExtra("title",listData.getTitle());

                context.startActivity(videoPlayer);


            }
        });

    }

    @Override
    public int getItemCount() {
        return list_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView txtname;
        public ViewHolder(View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.image_view);
            txtname=(TextView)itemView.findViewById(R.id.text_name);
        }
    }
}
