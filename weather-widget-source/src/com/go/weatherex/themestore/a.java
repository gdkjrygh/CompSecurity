// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.b;
import com.go.weatherex.viewex.SlidingTabStrip;

// Referenced classes of package com.go.weatherex.themestore:
//            b, d, c

public class a extends b
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    private SlidingTabStrip a;
    private int b;
    private c c;
    private final android.view.View.OnClickListener d;

    public a()
    {
        d = new com.go.weatherex.themestore.b(this);
    }

    public a(Context context, View view)
    {
        super(context, view);
        d = new com.go.weatherex.themestore.b(this);
        a = (SlidingTabStrip)view;
        float f = context.getResources().getDisplayMetrics().density;
        a.a((int)(f * 5.3F));
        a.a(false);
        a.a(new int[] {
            -1
        });
        a.a((byte)0);
    }

    static c a(a a1)
    {
        return a1.c;
    }

    private void a(int i, float f)
    {
        a.a(i, f);
        int j = a.getChildCount();
        if (i >= 0 && i < j)
        {
            ((d)a.getChildAt(i).getTag()).a.setTextColor(Color.argb((int)((1.0F - f) * 105F + 150F), 255, 255, 255));
        }
        i++;
        if (i > 0 && i < j)
        {
            ((d)a.getChildAt(i).getTag()).a.setTextColor(Color.argb((int)(105F * f + 150F), 255, 255, 255));
        }
    }

    static SlidingTabStrip b(a a1)
    {
        return a1.a;
    }

    static Context c(a a1)
    {
        return a1.f;
    }

    static android.view.View.OnClickListener d(a a1)
    {
        return a1.d;
    }

    public void a(c c1)
    {
        c = c1;
    }

    public transient void a(String as[])
    {
        a.removeAllViews();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = as[i];
            d d1 = new d(this);
            d1.a.setText(((CharSequence) (obj)));
            obj = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F / (float)as.length);
            a.addView(d1.b(), ((android.view.ViewGroup.LayoutParams) (obj)));
        }

        a.a(0, 0.0F);
    }

    public void c(int i)
    {
        ((d)a.getChildAt(i).getTag()).b.setVisibility(0);
    }

    public void d(int i)
    {
        ((d)a.getChildAt(i).getTag()).b.setVisibility(8);
    }

    public void onPageScrollStateChanged(int i)
    {
        b = i;
    }

    public void onPageScrolled(int i, float f, int j)
    {
        j = a.getChildCount();
        if (j == 0 || i < 0 || i >= j)
        {
            return;
        } else
        {
            a(i, f);
            return;
        }
    }

    public void onPageSelected(int i)
    {
        if (b == 0)
        {
            a(i, 0.0F);
        }
    }
}
