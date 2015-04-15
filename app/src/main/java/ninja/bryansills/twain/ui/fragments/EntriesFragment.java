package ninja.bryansills.twain.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ninja.bryansills.twain.R;
import ninja.bryansills.twain.model.Entry;
import ninja.bryansills.twain.ui.adapter.EntryAdapter;

/**
 * Created by bsills on 4/15/15.
 */
public class EntriesFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public static EntriesFragment newInstance() {
        return new EntriesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.fragment_main_list);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        List<Entry> items = new ArrayList<Entry>();
        for (int i = 1; i <= 100; i++) {
            items.add(new Entry("Item " + i, i));
        }

        mAdapter = new EntryAdapter(items);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }
}
