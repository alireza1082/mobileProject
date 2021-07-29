package ir.sharif.mobileproject;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import ir.sharif.mobileproject.databinding.ItemViewBinding;

public class AdapterView extends RecyclerView.Adapter<AdapterView.ViewHolder> {

    private static final String TAG = "AdapterView";

    public AdapterView() {
    }

    public List<User> listItem;

    public void setListItem(List<User> listItem) {
        this.listItem = listItem;
    }

    public List<User> getListItem() {
        return listItem;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        ItemViewBinding binding = ItemViewBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterView.ViewHolder holder, int position) {

        holder.nameUser.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                listItem.get(holder.getAdapterPosition()).setName(s.toString());
                Log.e("change" , s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        holder.costUser.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                listItem.get(holder.getAdapterPosition()).setCost(s.toString());
                Log.e("change" , s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
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
        EditText costUser;

        public ViewHolder(@NonNull @NotNull ItemViewBinding itemView) {
            super(itemView.getRoot());
            nameUser = itemView.editTextPersonNameDate;
            costUser = itemView.editTextNumberDate;

        }

        public String getNameUser() {
            return nameUser.getText().toString();
        }

        public String getCostUser() {
            return costUser.getText().toString();
        }
    }

    public void okListener(){
        listItem.size();

    }

//    public List<User> getListItem{
//        return listItem;
//    }

}
