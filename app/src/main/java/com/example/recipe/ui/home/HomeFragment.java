package com.example.recipe.ui.home;

import android.R.layout;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.recipe.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider( this ).get( HomeViewModel.class );
        View root = inflater.inflate( R.layout.fragment_home, container, false );
        searchView = (SearchView) root.findViewById(R.id.searchView);
        listView = (ListView) root.findViewById(R.id.lv1);
        list = new ArrayList<>();
        list.add("Aloo gralic");
        list.add("Daal makhani");
        list.add("chicken");
        list.add("Gobhi aloo");
        list.add("Saahi Paneer");
        list.add("Rice");
        list.add("Rajama Rice");
        list.add("Kari Rice");
        list.add("Aloo Gobhi");
        list.add("Matar Paneer");
        adapter=new ArrayAdapter<String>( getActivity(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter( adapter );
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }
                else
                    {
                    Toast.makeText(getActivity(), "No Match found", Toast.LENGTH_LONG).show();

                    }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //    adapter.getFilter().filter(newText);
                return false;
            }
        });

        //final TextView textView = root.findViewById( R.id.text_home );
        homeViewModel.getText().observe( getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
              //  textView.setText( s );
            }
        } );

        return root;
    }
}