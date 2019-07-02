package com.jesu.handymanprovider.home.fragments;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jesu.handymanprovider.R;
import com.jesu.handymanprovider.home.adapters.NotificationAdapter;
import com.jesu.handymanprovider.home.models.NotificationModel;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerView;
    private OnFragmentInteractionListener mListener;
    private NotificationAdapter notificationAdapter;

    public NotificationsFragment() {
        // Required empty public constructor
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
        return inflater.inflate(R.layout.fragment_notifications, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_notification);
        // sample data
        List<NotificationModel> notificationModels = new ArrayList<>();
        notificationModels.add(new NotificationModel("first recycler view data", "12:31 pm", BitmapFactory.decodeResource(getResources(), R.drawable.ic_hugh)));
        notificationModels.add(new NotificationModel("second recycler view data", "5 mins ago", BitmapFactory.decodeResource(getResources(), R.drawable.ic_hugh)));
        notificationModels.add(new NotificationModel("third recycler view data. This is the sample data", "1:31 pm", BitmapFactory.decodeResource(getResources(), R.drawable.ic_hugh)));
        notificationModels.add(new NotificationModel("fourth recycler view data", "2:51 pm", BitmapFactory.decodeResource(getResources(), R.drawable.ic_hugh)));
        notificationModels.add(new NotificationModel("fifth recycler view data", "6:59 pm", BitmapFactory.decodeResource(getResources(), R.drawable.ic_hugh)));
        notificationAdapter = new NotificationAdapter();
        notificationAdapter.setNotificationModels(notificationModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(notificationAdapter);
        // add sample data

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
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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
