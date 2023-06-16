package com.example.question8;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.jetbrains.annotations.NotNull;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class frag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment frag.
     */
    // TODO: Rename and change types and number of parameters
    public static frag newInstance(String param1, String param2) {
        frag fragment = new frag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public void onAttach(@NotNull Context context){
        super.onAttach(context);
        Log.v("Life Cycle","On attach");
    }
    public void onActivityCreated(@NotNull Bundle bundle){
        super.onActivityCreated(bundle);
        Log.v("Life Cycle", "On Activity Created");
    }
    public void onPause(){
        super.onPause();
        Log.v("Life Cycle","On Pause");
    }
    public void onResume(){
        super.onResume();
        Log.v("Life Cycle :","On Resume");
    }
    public void onStop() {
        super.onStop();
        Log.v("Life Cycle :","On Stop");
    }
    public void onDestroyView(){
        super.onDestroyView();
        Log.v("Life Cycle :","On Destroy View");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.v("Life Cycle :","On Destroy");
    }
    public void onDetach(){
        super.onDetach();
        Log.v("Life Cycle :","On Detach");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.v("Life Cycle :","On Create View");
        return inflater.inflate(R.layout.fragment_frag, container, false);

    }
}