package com.jesu.handymanprovider.home.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jesu.handymanprovider.R;
import com.jesu.handymanprovider.home.models.NotificationModel;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {
private List<NotificationModel> notificationModels=new ArrayList<>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item, parent, false);
        return new ViewHolder(itemView);
    }

    public NotificationAdapter() {

    }

    public void setNotificationModels(List<NotificationModel> notificationModels) {
        this.notificationModels = notificationModels;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        NotificationModel notificationModel=notificationModels.get(position);
        holder.tvTime.setText(notificationModel.getTime());
        holder.tvContent.setText(notificationModel.getContent());
        holder.circleImageView.setImageBitmap(notificationModel.getbPhoto());
    }

    @Override
    public int getItemCount() {
        return notificationModels.size();
    }


    public NotificationModel getItem(int position) {
        return notificationModels.get(position);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView circleImageView;
        private TextView tvContent, tvTime;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            circleImageView = itemView.findViewById(R.id.circleImageView);
            tvContent = itemView.findViewById(R.id.tvContent);
            tvTime = itemView.findViewById(R.id.tvTime);
        }
    }

}
