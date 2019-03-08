package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CasualesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CasualesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CasualesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ListView lista;
    clsCasualesAdapter adapter;
    ArrayList<clsCasuales> casuales;
    Intent intentcasual;

    private OnFragmentInteractionListener mListener;

    public CasualesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CasualesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CasualesFragment newInstance(String param1, String param2) {
        CasualesFragment fragment = new CasualesFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v =  inflater.inflate(R.layout.fragment_casuales, container, false);
        lista = v.findViewById(R.id.lvListaCasuales);
        casuales = new ArrayList<clsCasuales>();
        casuales.add(new clsCasuales("1","Ramo de rosas rojas","Ramo de 4 rosas rojas, claveles y jazmines",180.00,R.drawable.casuales14rosasclavelesjazmines));
        casuales.add(new clsCasuales("2","Rosas con palmas","Adorno de 7 rosas, flores amarillas y rosa fuerte",350.00,R.drawable.casuales27rosasyotrasflores));
        casuales.add(new clsCasuales("3","Adorno casual 428","Contiene 9 rosas en diagonal, base de madera, orquideas y tulipanes",250.00,R.drawable.casuales39rosaspalmayotrasflores));
        casuales.add(new clsCasuales("4","Girasol y rosas","Cuenta con un gran girasol y 5 rosas en vertical, con algunos claveles",650.00,R.drawable.casuales44rosas1girasolpalmas));
        casuales.add(new clsCasuales("5","Girasoles violentos","Dúo de girasoles entrenados en box, junto a 10 hermosas rosas, el ganador se lleva todo",550.00,R.drawable.casuales510rosa2girasoles));
        adapter = new clsCasualesAdapter(this,casuales);
        lista.setAdapter(adapter);

        elegirCasual();

       return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void elegirCasual (){
        intentcasual = new Intent(getActivity(), CasualesDetalle.class);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                clsCasuales mandarCasual = casuales.get(position);
                Bundle bundle = new Bundle();
                bundle.putSerializable("casual",mandarCasual);
                intentcasual.putExtras(bundle);
                startActivity(intentcasual);
            }
        });
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
