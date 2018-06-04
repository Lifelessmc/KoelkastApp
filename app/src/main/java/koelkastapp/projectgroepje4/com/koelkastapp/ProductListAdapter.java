package koelkastapp.projectgroepje4.com.koelkastapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.WordViewHolder> {

    class WordViewHolder extends RecyclerView.ViewHolder {
        private final TextView wordItemView;

        private WordViewHolder(View itemView) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.textview);
        }
    }

    private final LayoutInflater mInflater;
    private List<DataActivity> mData;

    ProductListAdapter(Context context) { mInflater = LayoutInflater.from(context);}

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new WordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        DataActivity current = mData.get(position);
        holder.wordItemView.setText(current.getPid());
    }

    void setData(List<DataActivity> dataActivities) {
        mData = dataActivities;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mData != null)
            return mData.size();
        else return 0;
    }

}
