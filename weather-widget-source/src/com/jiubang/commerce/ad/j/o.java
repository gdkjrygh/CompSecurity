// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.jiubang.commerce.ad.f;
import com.jiubang.commerce.utils.d;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            m, p

class o extends RelativeLayout
{

    public ImageView a;
    public int b;
    public int c;
    public ImageView d;
    final m e;

    public o(m m1, Context context)
    {
        e = m1;
        super(context);
        LayoutInflater.from(context).inflate(f.a(m.b(m1)).b("ad_google_guide_download_layout"), this);
        d = (ImageView)findViewById(f.a(m.b(m1)).a("float_window_image_big"));
        a = (ImageView)findViewById(f.a(m.b(m1)).a("float_window_view"));
        b = a.getLayoutParams().width;
        c = a.getLayoutParams().height;
        d.setAlpha(0);
        a.setAlpha(0);
    }

    public void a()
    {
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 24F, 0.0F, 0.0F);
        translateanimation.setStartOffset(250L);
        translateanimation.setDuration(130L);
        translateanimation.setRepeatCount(1);
        translateanimation.setAnimationListener(new p(this));
        a.startAnimation(translateanimation);
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        int i = configuration.orientation;
        int l = f.a(m.b(e)).d("ad_gp_install_btn_margin_left_edge");
        if (2 == i)
        {
            i = com.jiubang.commerce.utils.d.b(m.b(e));
            int j = com.jiubang.commerce.utils.d.c(m.b(e));
            int k;
            if (i < j)
            {
                k = i;
            } else
            {
                k = j;
            }
            if (i <= j)
            {
                i = j;
            }
            i -= k - l;
        } else
        {
            i = l;
        }
        if (m.c(e) != null && com.jiubang.commerce.ad.j.m.d(e) != null)
        {
            m.c(e).x = i;
            com.jiubang.commerce.ad.j.m.d(e).updateViewLayout(m.a(e), m.c(e));
        }
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            super.onConfigurationChanged(configuration);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.onTouchEvent(motionevent);
        e.b();
        return flag;
    }
}
