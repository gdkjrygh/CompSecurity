// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class LikeUnlikeAnimView extends RelativeLayout
    implements android.view.animation.Animation.AnimationListener
{

    private ImageView a;

    public LikeUnlikeAnimView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (android.os.Build.VERSION.SDK_INT == 15)
        {
            setLayerType(1, null);
        }
    }

    private void c()
    {
        ViewGroup viewgroup = (ViewGroup)getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(this);
        }
    }

    public void a()
    {
        a.setImageResource(0x7f0203dd);
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f040025);
        animation.setInterpolator(new OvershootInterpolator());
        animation.setAnimationListener(this);
        a.startAnimation(animation);
    }

    public void b()
    {
        a.setImageResource(0x7f0203e6);
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f040025);
        animation.setInterpolator(new OvershootInterpolator());
        animation.setAnimationListener(this);
        a.startAnimation(animation);
    }

    public void onAnimationEnd(Animation animation)
    {
        c();
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (ImageView)findViewById(0x7f0904a6);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return true;
    }
}
