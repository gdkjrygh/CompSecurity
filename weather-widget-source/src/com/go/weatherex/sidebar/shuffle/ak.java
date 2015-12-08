// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            b, al, ShuffleLoadingActivity

class ak
    implements android.view.View.OnTouchListener
{

    final ShuffleLoadingActivity a;
    private int b;
    private int c;
    private float d;
    private float e;
    private boolean f;
    private int g;

    public ak(ShuffleLoadingActivity shuffleloadingactivity, int i, int j)
    {
        a = shuffleloadingactivity;
        super();
        c = i;
        b = j;
        g = com.go.weatherex.sidebar.shuffle.b.a(30F);
    }

    private void a(ImageView imageview)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 2, -1F);
        translateanimation.setDuration(1000L);
        translateanimation.setFillAfter(true);
        translateanimation.setInterpolator(new AccelerateInterpolator());
        translateanimation.setAnimationListener(new al(this, imageview));
        imageview.startAnimation(translateanimation);
    }

    static boolean a(ak ak1, boolean flag)
    {
        ak1.f = flag;
        return flag;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if ((view instanceof ImageView) && !f) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        view = (ImageView)view;
        switch (motionevent.getAction())
        {
        default:
            return true;

        case 0: // '\0'
            d = motionevent.getRawX();
            e = motionevent.getRawY();
            return true;

        case 2: // '\002'
            float f1 = motionevent.getRawX();
            float f2 = motionevent.getRawY();
            float f3 = d;
            float f4 = c;
            float f5 = (f2 - e) + (float)b;
            if (f1 > d - (float)g && f1 < d + (float)g)
            {
                view.setX((f1 - f3) + f4);
            }
            if (f5 < (float)(ShuffleLoadingActivity.j(a) / 6) && (float)b + f2 > 0.0F)
            {
                view.setY(f5);
                return true;
            }
            break;

        case 1: // '\001'
            motionevent = ShuffleLoadingActivity.k(a);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.leftMargin = (int)view.getX();
            layoutparams.topMargin = (int)view.getY();
            ShuffleLoadingActivity.a(a).addView(motionevent, layoutparams);
            ShuffleLoadingActivity.a(a).removeView(view);
            a(motionevent);
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
