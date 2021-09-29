package br.com.jogoaprender.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import br.com.jogoaprender.R;


public class TransporteFragment extends Fragment implements View.OnClickListener {

    private ImageView buttonCarro, buttonMoto, buttonAviao, buttonTrem, buttonOnibus, buttonTrator;


    private MediaPlayer mediaPlayer;

    public TransporteFragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_transporte, container, false);

        buttonCarro = view.findViewById(R.id.buttonCarro);
        buttonMoto = view.findViewById(R.id.buttonMoto);
        buttonAviao = view.findViewById(R.id.buttonAviao);
        buttonTrem = view.findViewById(R.id.buttonTrem);
        buttonOnibus = view.findViewById(R.id.buttonOnibus);
        buttonTrator = view.findViewById(R.id.buttonTrator);




        buttonCarro.setOnClickListener(this);
        buttonMoto.setOnClickListener(this);
        buttonAviao.setOnClickListener(this);
        buttonTrem.setOnClickListener(this);
        buttonOnibus.setOnClickListener(this);
        buttonTrator.setOnClickListener(this);




        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.buttonCarro:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.carro );
                tocarSom();
                break;
            case R.id.buttonMoto:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.moto );
                tocarSom();
                break;
            case R.id.buttonAviao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.aviao );
                tocarSom();
                break;
            case R.id.buttonTrem:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.trem );
                tocarSom();
                break;
            case R.id.buttonOnibus:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.onibus );
                tocarSom();
                break;
            case R.id.buttonTrator:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.trator );
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