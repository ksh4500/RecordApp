package com.sds.study.app2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * 파일목록을 보여줄 프레그먼트....
 */

public class DetailFragment extends Fragment implements View.OnClickListener{
    ListFragment fragment;
    String filename;
    TextView txt_filename;
    Button btn_play;
    ImageView disc;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_detail,container,false);
        txt_filename=(TextView)view.findViewById(R.id.txt_filename);
        //페이지를 구성하는 나 아닌 다른 페이지 프레그먼트를 접근해보자!!
        FragmentManager fragmentManager=this.getFragmentManager();
        List<Fragment> list=fragmentManager.getFragments();
        fragment=(ListFragment) list.get(0);
        btn_play=(Button)view.findViewById(R.id.bt_play);
        disc=(ImageView)view.findViewById(R.id.disc);
        btn_play.setOnClickListener(this);

        return view;
    }
    public void play(){
        //안드로이드에서 에니메이션의 대상이 되는 추체는 모든 뷰이다.!!!
        Animation animation=AnimationUtils.loadAnimation(getContext(), R.anim.disc);
        disc.startAnimation(animation);
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bt_play){
            play();

        }


    }
}
