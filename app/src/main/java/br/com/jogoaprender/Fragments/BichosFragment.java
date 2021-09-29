package br.com.jogoaprender.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import br.com.jogoaprender.R;


public class BichosFragment extends Fragment implements View.OnClickListener {

    private ImageView buttonCao, buttonElefante, buttonCavalo, buttonOvelha, buttonGato, buttonPassaro;

    private MediaPlayer mediaPlayer;


    public BichosFragment() {
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        buttonCao = view.findViewById(R.id.buttonCao);
        buttonElefante = view.findViewById(R.id.buttonElefante);
        buttonCavalo = view.findViewById(R.id.buttonCavalo);
        buttonOvelha = view.findViewById(R.id.buttonOvelha);
        buttonGato = view.findViewById(R.id.buttonGato);
        buttonPassaro = view.findViewById(R.id.buttonPassaro);


        buttonCao.setOnClickListener(this);
        buttonElefante.setOnClickListener(this);
        buttonCavalo.setOnClickListener(this);
        buttonOvelha.setOnClickListener(this);
        buttonGato.setOnClickListener(this);
        buttonPassaro.setOnClickListener(this);



        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.buttonCao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog );
                tocarSom();
                break;
            case R.id.buttonElefante:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.elefante );
                tocarSom();
                break;
            case R.id.buttonCavalo:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cavalo );
                tocarSom();
                break;
            case R.id.buttonOvelha:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.ovelha );
                tocarSom();
                break;
            case R.id.buttonGato:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.gato );
                tocarSom();
                break;
            case R.id.buttonPassaro:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.passaro );
                tocarSom();
                break;
        }
    }
    public void tocarSom(){
        if(mediaPlayer != null){
           mediaPlayer.start();



            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();

                }
            });
        }
    }


}