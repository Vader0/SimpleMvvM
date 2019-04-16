package com.danielstrelnikov.simplemvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class User extends BaseObservable {


    @Bindable
    private String name;
    @Bindable
    private int age;
    @Bindable
    private boolean adutl;
    @Bindable
    private String imageSmall;
    @Bindable
    private String imageBig;

    public User(){
        name = "Danil";
        age = 18;
        adutl = true;
        imageSmall = "https://medaboutme.ru/upload/resize_cache/iblock/22e/940_540_1/kak_opredelit_pravilno_li_razvivaetsya_malysh.jpg";
        imageBig = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtArk4vZ0z-QyNuYd3rvUg_pxvpRGgAxLA-GGnJSt_29uaPoXi";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdutl() {
        return age >= 18;
    }

    public String getImageSmall() {
        return imageSmall;
    }

    public String getImageBig() {
        return imageBig;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
        notifyPropertyChanged(BR.adutl);
    }

    public void setAdutl(boolean adutl) {
        this.adutl = adutl;
    }

    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }

    public void setImageBig(String imamgeBig) {
        this.imageBig = imamgeBig;
    }

    @BindingAdapter("imageSrc")
    public static void setImage(ImageView view, String string){
        Picasso.with(view.getContext())
                .load(string)
                .noFade()
                .into(view);
    }
}
