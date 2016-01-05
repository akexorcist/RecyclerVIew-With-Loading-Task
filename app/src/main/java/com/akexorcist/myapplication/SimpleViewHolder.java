package com.akexorcist.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by Akexorcist on 1/5/2016 AD.
 */
public class SimpleViewHolder extends RecyclerView.ViewHolder {
    TextView tvName;
    ProgressBar pbLoading;
    Button btnConfirm;
    Button btnDeny;

    public SimpleViewHolder(View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.tv_name);
        pbLoading = (ProgressBar) itemView.findViewById(R.id.pb_loading);
        btnConfirm = (Button) itemView.findViewById(R.id.btn_confirm);
        btnDeny = (Button) itemView.findViewById(R.id.btn_deny);
    }
}
