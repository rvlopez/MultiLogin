package com.example.rvlopez.multilogin.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.rvlopez.multilogin.R;
import com.example.rvlopez.multilogin.models.LoginOptionModel;
import com.example.rvlopez.multilogin.navigator.Navigator;
import com.example.rvlopez.multilogin.utils.Constants;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginOptionsListAdapter extends RecyclerView.Adapter<LoginOptionsListAdapter.ViewHolder> {

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_layout)
        LinearLayout itemLayout;

        @BindView(R.id.option_icon)
        ImageView optionIcon;

        @BindView(R.id.option_name)
        TextView optionName;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private Context context;
    private List<LoginOptionModel> loginOptionModelList;

    public LoginOptionsListAdapter(Context context, List<LoginOptionModel> loginOptionModelList) {
        this.context = context;
        this.loginOptionModelList = loginOptionModelList;
    }

    @Override
    public LoginOptionsListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final LoginOptionsListAdapter.ViewHolder holder, int position) {
        holder.optionIcon.setImageResource(loginOptionModelList.get(position).getIconId());
        holder.optionName.setText(loginOptionModelList.get(position).getLoginOption());

        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Navigator.class);
                intent.putExtra(Constants.NAVIGATE, holder.optionName.getText());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return loginOptionModelList.size();
    }
}
