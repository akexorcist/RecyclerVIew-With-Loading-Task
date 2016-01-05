package com.akexorcist.myapplication;

import android.os.AsyncTask;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Akexorcist on 1/5/2016 AD.
 */
public class SimpleAdapter extends RecyclerView.Adapter<SimpleViewHolder> {
    private ArrayList<String> itemList;
    private SparseArray<FakeLoadingTask> taskList;

    public SimpleAdapter(ArrayList<String> itemList) {
        this.itemList = itemList;
        taskList = new SparseArray<>();
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_so_simple, parent, false);
        return new SimpleViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, final int position) {
        FakeLoadingTask task = new FakeLoadingTask(holder.pbLoading, position);
        task.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null);
        taskList.put(position, task);
        holder.tvName.setText(itemList.get(position));
        holder.btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Confirm : " + position, Snackbar.LENGTH_SHORT).show();
            }
        });
        holder.btnDeny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Deny : " + position, Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onViewDetachedFromWindow(SimpleViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        FakeLoadingTask task = taskList.get(holder.getLayoutPosition());
        if(task != null) {
            task.cancel(true);
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
