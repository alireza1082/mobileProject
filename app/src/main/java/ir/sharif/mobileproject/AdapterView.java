package ir.sharif.mobileproject;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import ir.sharif.mobileproject.databinding.ItemViewBinding;

public class AdapterView extends RecyclerView.Adapter<AdapterView.ViewHolder> {

    private static final String TAG = "AdapterView";

    private List<User> listItem;

    public void setListItem(List<User> listItem) {
        this.listItem = listItem;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        ItemViewBinding binding=ItemViewBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterView.ViewHolder holder, int position) {

        Log.e(TAG, "onBindViewHolder: "+listItem.size() );
        holder.nameUser.setText(listItem.get(holder.getAdapterPosition()).getName());
    }

    @Override
    public int getItemCount() {
        if(listItem == null)
            return 0;
        else
            return listItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        EditText nameUser;

        public ViewHolder(@NonNull @NotNull ItemViewBinding itemView) {
            super(itemView.getRoot());
            nameUser = itemView.editTextPersonNameDate;
        }
    }
}
