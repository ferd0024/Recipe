package com.example.recipe.ui.gallery;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.recipe.HomeActivity;
import com.example.recipe.MyListAdapter;
import com.example.recipe.R;

public class GalleryFragment extends Fragment {
    SearchView searchView;
    ListView list;
    String[] maintitle ={
            "Aloo Paratha","Torlito",
            "Italian","Chineese",
            "Sandwich","Indian Food",
    };
    String[] subtitle ={
            "Iron Rich","fat",
            "Healthy","Junck",
            "FastFood","Healthy",
    };
    Integer[] imgid={
            R.drawable.f,R.drawable.fi,
            R.drawable.fide,R.drawable.fideo,
            R.drawable.ironrich,R.drawable.fi,
    };
    String[] urls={
            "http://www.recipepuppy.com/api/?i=onions,garlic&q=omelet&p=3",
            "https://www.wikipedia.org/",
            "https://www.wikipedia.org/",
            "https://www.wikipedia.org/",
            "https://www.wikipedia.org/",
            "https://www.wikipedia.org/"

    };

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel = new ViewModelProvider( this ).get( GalleryViewModel.class );
        View root = inflater.inflate( R.layout.fragment_gallery, container, false );
        MyListAdapter adapter=new MyListAdapter( getActivity(), maintitle, subtitle,imgid,urls);
        list=(ListView)root.findViewById(R.id.list);
        searchView = (SearchView) root.findViewById(R.id.searchView);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
                    alertDialogBuilder.setIcon(R.drawable.f);
                    alertDialogBuilder.setMessage("Dough made from whole wheat flour – a basic dough is made with whole wheat flour (atta), salt, oil and water. Making dough is very easy and you can either knead with hands or in a stand mixer. Mashed Potato stuffing – potatoes are boiled, peeled and then mashed. To the mashed potatoes, some herbs, spices and salt are added. The spiced mashed potatoes are then stuffed in a rolled dough and roasted or fried.");
                    alertDialogBuilder.setNegativeButton("Delete", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //delete contact or what you want.
                        }
                    });
                    alertDialogBuilder.setPositiveButton( "Save", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText( getActivity(), "This is your Favourite food", Toast.LENGTH_SHORT ).show();

                        }
                    } );
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();

                    //Toast.makeText(getActivity(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
                    alertDialogBuilder.setIcon( R.drawable.fi);
                    alertDialogBuilder.setMessage("Dough made from whole wheat flour – a basic dough is made with whole wheat flour (atta), salt, oil and water. Making dough is very easy and you can either knead with hands or in a stand mixer. Mashed Potato stuffing – potatoes are boiled, peeled and then mashed. To the mashed potatoes, some herbs, spices and salt are added. The spiced mashed potatoes are then stuffed in a rolled dough and roasted or fried.");
                    alertDialogBuilder.setNegativeButton("delete", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText( getActivity(), "This is your Favourite food", Toast.LENGTH_SHORT ).show();
                            //delete contact or what you want.
                        }
                    });
                    alertDialogBuilder.setPositiveButton( "Save", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText( getActivity(), "This is your Favourite food", Toast.LENGTH_SHORT ).show();

                        }
                    } );
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                    Toast.makeText(getActivity(),"opened",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
                    alertDialogBuilder.setIcon( R.drawable.fide);
                    alertDialogBuilder.setMessage("Dough made from whole wheat flour – a basic dough is made with whole wheat flour (atta), salt, oil and water. Making dough is very easy and you can either knead with hands or in a stand mixer. Mashed Potato stuffing – potatoes are boiled, peeled and then mashed. To the mashed potatoes, some herbs, spices and salt are added. The spiced mashed potatoes are then stuffed in a rolled dough and roasted or fried.");
                    alertDialogBuilder.setNegativeButton("Delete", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //delete contact or what you want.
                        }
                    });
                    alertDialogBuilder.setPositiveButton( "Save", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText( getActivity(), "This is your Favourite food", Toast.LENGTH_SHORT ).show();

                        }
                    } );
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();

                    Toast.makeText(getActivity(),"opened",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
                    alertDialogBuilder.setIcon( R.drawable.fideo );
                    alertDialogBuilder.setMessage("Dough made from whole wheat flour – a basic dough is made with whole wheat flour (atta), salt, oil and water. Making dough is very easy and you can either knead with hands or in a stand mixer. Mashed Potato stuffing – potatoes are boiled, peeled and then mashed. To the mashed potatoes, some herbs, spices and salt are added. The spiced mashed potatoes are then stuffed in a rolled dough and roasted or fried.");
                    alertDialogBuilder.setNegativeButton("Delete", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //delete contact or what you want.
                        }
                    });
                    alertDialogBuilder.setPositiveButton( "Save", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText( getActivity(), "This is your Favourite food", Toast.LENGTH_SHORT ).show();

                        }
                    } );
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();

                    Toast.makeText(getActivity(),"opened",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
                    alertDialogBuilder.setIcon( R.drawable.ironrich);
                    alertDialogBuilder.setMessage("Dough made from whole wheat flour – a basic dough is made with whole wheat flour (atta), salt, oil and water. Making dough is very easy and you can either knead with hands or in a stand mixer. Mashed Potato stuffing – potatoes are boiled, peeled and then mashed. To the mashed potatoes, some herbs, spices and salt are added. The spiced mashed potatoes are then stuffed in a rolled dough and roasted or fried.");
                    alertDialogBuilder.setNegativeButton("Delete", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //delete contact or what you want.
                        }
                    });
                    alertDialogBuilder.setPositiveButton( "Save", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText( getActivity(), "This is your Favourite food", Toast.LENGTH_SHORT ).show();

                        }
                    } );
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();

                    Toast.makeText(getActivity(),"opened",Toast.LENGTH_SHORT).show();
                }
                else if(position == 5) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
                    alertDialogBuilder.setIcon( R.drawable.f );
                    alertDialogBuilder.setMessage("Dough made from whole wheat flour – a basic dough is made with whole wheat flour (atta), salt, oil and water. Making dough is very easy and you can either knead with hands or in a stand mixer. Mashed Potato stuffing – potatoes are boiled, peeled and then mashed. To the mashed potatoes, some herbs, spices and salt are added. The spiced mashed potatoes are then stuffed in a rolled dough and roasted or fried.");
                    alertDialogBuilder.setNegativeButton("Delete", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //delete contact or what you want.
                        }
                    });
                    alertDialogBuilder.setPositiveButton( "Save", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText( getActivity(), "This is your Favourite food", Toast.LENGTH_SHORT ).show();

                        }
                    } );
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();

                    Toast.makeText(getActivity(),"opened",Toast.LENGTH_SHORT).show();
                }

            }
        });
     list.setOnItemLongClickListener( new AdapterView.OnItemLongClickListener() {
         @Override
         public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
             if(i==0)
             {
                 Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse( urls[i] ));
                 startActivity( intent );
             }
             if(i==1)
             {
                 Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse( urls[i] ));
                 startActivity( intent );
             }
             if(i==2)
             {
                 Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse( urls[i] ));
                 startActivity( intent );
             }
             if(i==3)
             {
                 Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse( urls[i] ));
                 startActivity( intent );
             }
             if(i==4)
             {
                 Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse( urls[i] ));
                 startActivity( intent );
             }
             if(i==5)
             {
                 Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse( urls[i] ));
                 startActivity( intent );
             }
             return false;
         }
     } );


        //final TextView textView = root.findViewById( R.id.text_gallery );
        galleryViewModel.getText().observe( getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText( s );
            }
        } );
        return root;
    }
}