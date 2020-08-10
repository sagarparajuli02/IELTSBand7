package com.ielts.reading.listening.writing.speaking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WritingTaskAdapter extends RecyclerView.Adapter<WritingTaskAdapter.ViewHolder>{

    private Context context;
    private List<GetterSetter> personUtils;

    public WritingTaskAdapter(Context context, List personUtils) {
        this.context = context;
        this.personUtils = personUtils;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(personUtils.get(position));

        GetterSetter pu = personUtils.get(position);

        holder.pName.setText(pu.gettopicTitle());

        holder.numberPosition.setText(String.valueOf(position+1));

    }

    @Override
    public int getItemCount() {
        return personUtils.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView pName;
        public TextView numberPosition;

        public ViewHolder(View itemView) {
            super(itemView);

            pName = (TextView) itemView.findViewById(R.id.pNametxt);
            numberPosition = (TextView) itemView.findViewById(R.id.positionNumber);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    GetterSetter cpu = (GetterSetter) view.getTag();

                    //   Toast.makeText(view.getContext(), cpu.gettopicTitle(), Toast.LENGTH_SHORT).show();

                    Intent detailActivity = new Intent(context,DetailWebView.class);
                    detailActivity.putExtra("localUrl", cpu.getLocalUrl());
                    detailActivity.putExtra("title", cpu.gettopicTitle());
                 context.startActivity(detailActivity);

                }
            });

        }
    }

}