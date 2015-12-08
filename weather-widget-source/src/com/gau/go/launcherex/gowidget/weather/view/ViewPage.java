// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.go.weatherex.i.b;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedRecommendVIPBaseView, AdvancedAnimationView

public class ViewPage extends LinearLayout
{

    private LayoutInflater a;
    private FrameLayout b;
    private AdvancedAnimationView c;
    private TextView d;
    private int e;
    private int f;
    private Bitmap g;
    private int h;
    private int i;
    private int j;
    private Activity k;

    public ViewPage(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = -1;
        f = -1;
        h = -1;
        i = -1;
        j = -1;
        a = LayoutInflater.from(context);
    }

    private boolean e()
    {
        boolean flag = false;
        if (f != -1)
        {
            if (h == 1)
            {
                Object obj = (AdvancedRecommendVIPBaseView)a.inflate(f, null);
                ((AdvancedRecommendVIPBaseView) (obj)).a(k);
                if (i != -1)
                {
                    ((AdvancedRecommendVIPBaseView) (obj)).a(getContext().getString(i));
                }
                if (g != null)
                {
                    ((AdvancedRecommendVIPBaseView) (obj)).a(g);
                }
                if (j != -1)
                {
                    ((AdvancedRecommendVIPBaseView) (obj)).b(getContext().getString(j));
                }
                if (com.go.weatherex.i.b.b())
                {
                    ((AdvancedRecommendVIPBaseView) (obj)).setBackgroundColor(Color.parseColor("#febe89"));
                    ((AdvancedRecommendVIPBaseView) (obj)).c(getContext().getString(0x7f08024e));
                    ((AdvancedRecommendVIPBaseView) (obj)).a(Color.parseColor("#ee4c5d"));
                    ((AdvancedRecommendVIPBaseView) (obj)).b(Color.parseColor("#ffffff"));
                } else
                {
                    ((AdvancedRecommendVIPBaseView) (obj)).b(Color.parseColor("#000000"));
                }
                c = ((AdvancedAnimationView) (obj));
                obj = new android.widget.FrameLayout.LayoutParams(-2, -2);
                obj.gravity = 1;
                b.addView(c, ((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            {
                c = (AdvancedAnimationView)a.inflate(f, null);
                b.addView(c, -1, -1);
            }
            flag = true;
        }
        return flag;
    }

    public void a()
    {
        if (c != null || e())
        {
            c.a();
        }
    }

    public void a(Activity activity, int l, int i1, int j1)
    {
        k = activity;
        e = l;
        f = i1;
        if (j1 != -1)
        {
            d.setText(j1);
        }
    }

    public void a(Activity activity, int l, int i1, int j1, int k1, Bitmap bitmap)
    {
        k = activity;
        e = l;
        f = i1;
        g = bitmap;
        h = 1;
        i = k1;
        j = j1;
        if (k1 != -1)
        {
            d.setVisibility(8);
        }
    }

    public void b()
    {
        if (c != null)
        {
            c.b();
        }
    }

    public long c()
    {
        if (c != null)
        {
            return c.c();
        } else
        {
            return 0L;
        }
    }

    public int d()
    {
        return e;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = (FrameLayout)findViewById(0x7f0900d0);
        d = (TextView)findViewById(0x7f0900d1);
    }
}
