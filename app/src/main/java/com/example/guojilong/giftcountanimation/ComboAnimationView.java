package com.example.guojilong.giftcountanimation;

import android.view.View;
import android.view.animation.AnimationSet;

/**
 * Created by guojilong on 16/7/4.
 */
public abstract class ComboAnimationView<T> {
    private T data;
    private View view;
    private int lastTime;
    private int animationDuration = 3000;
    private int mainTainTime = 5000;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public int getAnimationDuration() {
        return animationDuration;
    }

    public void setAnimationDuration(int animationDuration) {
        this.animationDuration = animationDuration;
    }

    public int getMainTainTime() {
        return mainTainTime;
    }

    public void setMainTainTime(int mainTainTime) {
        this.mainTainTime = mainTainTime;
    }

    public abstract AnimationSet getAddAnimation();

    public abstract int onUpdateView(View view, T t);

    public abstract View onCreateView();

    public abstract void onBindView(View view, T t);

    public int getLastTime() {
        return lastTime;
    }
}
