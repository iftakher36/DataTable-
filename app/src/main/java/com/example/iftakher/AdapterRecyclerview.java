package com.example.iftakher;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecyclerview extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int row1=0,row2=1, rowThird =12, rowThird2 =13;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType==row1){
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.sampleview_recyclerview,parent,false);
            return new ViewHolderTableRow1(view);
        }
        else if (viewType== rowThird ||viewType== rowThird2){
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.sampleview_recyclerview3,parent,false);
            return new ViewHolderTableRow3(view);
        }
        else {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.sampleview_recyclerview2,parent,false);
            return new ViewHolderTableRow2(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 14;
    }

    @Override
    public int getItemViewType(int position) {
        if (row1==position){
            return row1;
        }
        else if(rowThird == position){
            return rowThird;
        }
        else if(rowThird2 == position){
            return rowThird;
        }
        else {
            return row2;
        }
    }

    public class ViewHolderTableRow1 extends RecyclerView.ViewHolder{

        public ViewHolderTableRow1(@NonNull View itemView) {
            super(itemView);
        }
    }
    public class ViewHolderTableRow2 extends RecyclerView.ViewHolder{

    public ViewHolderTableRow2(@NonNull View itemView) {
        super(itemView);
    }
    }  public class ViewHolderTableRow3 extends RecyclerView.ViewHolder{

    public ViewHolderTableRow3(@NonNull View itemView) {
        super(itemView);
    }
    }
}
