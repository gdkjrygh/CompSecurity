// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.util.s;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedAnimationView, f

public class AdvancedRecommendVIPBaseView extends AdvancedAnimationView
    implements android.view.animation.Animation.AnimationListener
{

    private ImageView b;
    private TextView c;
    private Animation d;
    private Animation e;
    private Animation f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private ImageView k;
    private Activity l;

    public AdvancedRecommendVIPBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = s.a(1500L);
        d.setAnimationListener(this);
        e = s.c(1000L);
        f = s.d(1000L);
        f.setFillAfter(true);
    }

    static Activity a(AdvancedRecommendVIPBaseView advancedrecommendvipbaseview)
    {
        return advancedrecommendvipbaseview.l;
    }

    public void a()
    {
        a = false;
        a(((android.view.View) (b)), d);
        a(((android.view.View) (h)), e);
        a(((android.view.View) (i)), e);
        a(((android.view.View) (j)), e);
        a(((android.view.View) (c)), e);
        a(((android.view.View) (g)), e);
    }

    public void a(int i1)
    {
        if (i1 != -1)
        {
            h.setBackgroundColor(i1);
        }
    }

    public void a(Activity activity)
    {
        l = activity;
    }

    public void a(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            b.setImageBitmap(bitmap);
        }
    }

    public void a(String s1)
    {
        if (s1 != null)
        {
            c.setText(s1);
        }
    }

    public void b()
    {
        a = true;
        d.cancel();
        e.cancel();
        f.cancel();
        b.setVisibility(4);
        b.clearAnimation();
        c.setVisibility(4);
        c.clearAnimation();
        g.setVisibility(4);
        g.clearAnimation();
        h.setVisibility(4);
        h.clearAnimation();
        i.setVisibility(4);
        i.clearAnimation();
        j.setVisibility(4);
        j.clearAnimation();
    }

    public void b(int i1)
    {
        if (i1 != -1)
        {
            h.setTextColor(i1);
        }
    }

    public void b(String s1)
    {
        if (s1 != null)
        {
            g.setText(s1);
        }
    }

    public long c()
    {
        return 2500L;
    }

    public void c(String s1)
    {
        if (s1 != null)
        {
            h.setText(s1);
        }
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!a && animation.equals(e))
        {
            a(b, f);
            a(h, f);
            a(i, f);
            a(j, f);
            a(c, f);
            a(g, f);
        }
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
        b = (ImageView)findViewById(0x7f0900c9);
        c = (TextView)findViewById(0x7f0900c7);
        g = (TextView)findViewById(0x7f0900c8);
        h = (TextView)findViewById(0x7f0900c4);
        i = (TextView)findViewById(0x7f0900c5);
        j = (TextView)findViewById(0x7f0900c6);
        k = (ImageView)findViewById(0x7f0900c3);
        k.setOnClickListener(new f(this));
    }
}
