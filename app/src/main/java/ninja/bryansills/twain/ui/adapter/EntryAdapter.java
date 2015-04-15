package ninja.bryansills.twain.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import ninja.bryansills.twain.R;
import ninja.bryansills.twain.model.Entry;

/**
 * Created by bsills on 4/15/15.
 */
public class EntryAdapter extends RecyclerView.Adapter<EntryAdapter.ViewHolder> {

        private List<Entry> mDataset;

        public static class ViewHolder extends RecyclerView.ViewHolder {

            public TextView mName, mVotes;

            public ViewHolder(View itemView) {
                super(itemView);

                mName = (TextView)itemView.findViewById(R.id.list_item_entry_name);
                mVotes = (TextView)itemView.findViewById(R.id.list_item_entry_votes);
            }
        }

        public EntryAdapter(List<Entry> dataset) {
            mDataset = dataset;
        }

        @Override
        public EntryAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            // create a new view
            View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.list_item_entry, viewGroup, false);

            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(EntryAdapter.ViewHolder viewHolder, int position) {
            final Entry item = mDataset.get(position);

            viewHolder.mName.setText(item.getName());
            viewHolder.mVotes.setText(String.valueOf(item.getVotes()));

            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), item.getName(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return mDataset.size();
        }
    }
