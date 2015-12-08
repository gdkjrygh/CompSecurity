// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.f.a;
import com.jiubang.playsdk.main.c;
import com.jiubang.playsdk.main.e;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            IndicatorView

public class ThemeDetailView extends RelativeLayout
    implements android.support.v4.view.ViewPager.OnPageChangeListener, e
{

    private FrameLayout a;
    private View b;
    private ImageView c;
    private TextView d;
    private LinearLayout e;
    private ViewPager f;
    private IndicatorView g;
    private FrameLayout h;

    public ThemeDetailView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(int i)
    {
        b.setVisibility(0);
        c.setVisibility(0);
        c.setImageResource(i);
    }

    public void a(PagerAdapter pageradapter)
    {
        if (pageradapter != null)
        {
            f.setAdapter(pageradapter);
            g.b(pageradapter.getCount());
        }
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        a.setOnClickListener(onclicklistener);
    }

    public void a(View view)
    {
        if (view != null)
        {
            g.setVisibility(8);
            e.removeAllViews();
            com.jiubang.playsdk.f.a.a(view);
            e.addView(view);
        }
    }

    public void a(com.jiubang.playsdk.a.a a1)
    {
label0:
        {
            boolean flag2;
            for (flag2 = false; a1 == null || a1.h() != 1 && a1.h() != 2;)
            {
                return;
            }

            h.setVisibility(0);
            h.removeAllViews();
            TextView textview = new TextView(h.getContext());
            textview.setVisibility(0);
            textview.setTextColor(0xff787878);
            Object obj = new android.widget.FrameLayout.LayoutParams(-2, -2);
            obj.gravity = 17;
            h.addView(textview, ((android.view.ViewGroup.LayoutParams) (obj)));
            obj = getContext();
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append("<font size='16px' color='#FF787878'>");
            boolean flag;
            if (a1.i() || a1.j() || a1.k())
            {
                stringbuffer.append((new StringBuilder()).append(((Context) (obj)).getString(0x7f08059b)).append("&nbsp;").toString());
                StringBuffer stringbuffer1 = new StringBuffer();
                boolean flag1;
                if (a1.i())
                {
                    stringbuffer1.append("4\3272");
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag;
                if (a1.j())
                {
                    if (flag)
                    {
                        stringbuffer1.append("/");
                    }
                    stringbuffer1.append("4\3271");
                    flag1 = true;
                }
                if (a1.j())
                {
                    if (flag1)
                    {
                        stringbuffer1.append("/");
                    }
                    stringbuffer1.append("2\3271");
                }
                stringbuffer.append((new StringBuilder()).append("<b>").append(stringbuffer1.toString()).append("</b>").toString());
                flag = true;
            } else
            {
                flag = false;
            }
            if (!a1.l())
            {
                flag1 = flag;
                if (!a1.m())
                {
                    break label0;
                }
            }
            if (flag)
            {
                stringbuffer.append("<b>&nbsp;&nbsp;|&nbsp;&nbsp;</b>");
            }
            stringbuffer.append((new StringBuilder()).append(((Context) (obj)).getString(0x7f08059c)).append("&nbsp;").toString());
            stringbuffer1 = new StringBuffer();
            flag = flag2;
            if (a1.m())
            {
                stringbuffer1.append("4\3272");
                flag = true;
            }
            if (a1.l())
            {
                if (flag)
                {
                    stringbuffer1.append("/");
                }
                stringbuffer1.append("4\3271");
            }
            stringbuffer.append((new StringBuilder()).append("<b>").append(stringbuffer1.toString()).append("</b>").toString());
            flag1 = true;
        }
        if (a1.n())
        {
            if (flag1)
            {
                stringbuffer.append("<b>&nbsp;&nbsp;|&nbsp;&nbsp;</b>");
            }
            stringbuffer.append(((Context) (obj)).getString(0x7f08059d));
        }
        stringbuffer.append("</font>");
        textview.setText(Html.fromHtml(stringbuffer.toString()));
    }

    public void a(boolean flag)
    {
        a.setEnabled(flag);
    }

    public void b(int i)
    {
        d.setText(i);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        FrameLayout framelayout = (FrameLayout)findViewById(0x7f090538);
        a = (FrameLayout)framelayout.findViewById(0x7f090539);
        a.setBackgroundResource(y.a().b().d());
        b = framelayout.findViewById(0x7f09053b);
        b.setBackgroundResource(y.a().b().e());
        c = (ImageView)framelayout.findViewById(0x7f09053a);
        d = (TextView)framelayout.findViewById(0x7f09053c);
        f = (ViewPager)findViewById(0x7f09053e);
        f.setOnPageChangeListener(this);
        g = (IndicatorView)findViewById(0x7f09053f);
        int i = getContext().getResources().getDimensionPixelSize(0x7f0c0029);
        g.a(i);
        e = (LinearLayout)findViewById(0x7f09053d);
        h = (FrameLayout)findViewById(0x7f090540);
        h.setVisibility(0);
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f1, int j)
    {
    }

    public void onPageSelected(int i)
    {
        g.c(i);
    }
}
