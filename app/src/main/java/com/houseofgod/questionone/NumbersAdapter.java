package com.houseofgod.questionone;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NumbersAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Integer> dataList;

    public NumbersAdapter(List<Integer> dataList) {
        this.dataList = dataList;
    }

    public class NumbersViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.number_list_item)
        TextView number;

        public NumbersViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return new NumbersViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.numbers_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        NumbersViewHolder numbersViewHolder = (NumbersViewHolder) viewHolder;
        numbersViewHolder.number.setText(String.valueOf(dataList.get(position)));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

}
