// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.jiubang.playsdk.detail.a.a;
import com.jiubang.playsdk.detail.a.d;
import com.jiubang.playsdk.detail.a.e;
import java.util.List;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            IndicatorView

public class ThemeFullPreview extends FrameLayout
    implements android.support.v4.view.ViewPager.OnPageChangeListener, d
{

    private ViewPager a;
    private IndicatorView b;

    public ThemeFullPreview(Context context)
    {
        this(context, null);
    }

    public ThemeFullPreview(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void a(PagerAdapter pageradapter, int i)
    {
        if (a != null)
        {
            a.setAdapter(pageradapter);
            b.b(pageradapter.getCount());
            b.c(i);
            a.setCurrentItem(i);
            pageradapter = AnimationUtils.loadAnimation(getContext(), 0x7f040016);
            pageradapter.setDuration(400L);
            startAnimation(pageradapter);
        }
    }

    public void a()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f040017);
        animation.setDuration(400L);
        startAnimation(animation);
        if (getParent() instanceof ViewGroup)
        {
            ((ViewGroup)getParent()).removeView(this);
        }
    }

    public void a(int i)
    {
        a();
    }

    public void a(com.jiubang.playsdk.d.e e1, int i)
    {
        if (e1 != null)
        {
            e1 = new a(getContext(), e1);
            e1.b(false);
            e1.a(false);
            a(((PagerAdapter) (e1)), i);
        }
    }

    public void a(List list, int i)
    {
        if (list != null && list.size() > 0)
        {
            list = new e(getContext(), list);
            list.a(this);
            list.b(false);
            list.a(false);
            a(((PagerAdapter) (list)), i);
        }
    }

    protected void onFinishInflate()
    {
        a = (ViewPager)findViewById(0x7f090541);
        a.setOnPageChangeListener(this);
        b = (IndicatorView)findViewById(0x7f090542);
        int i = getContext().getResources().getDimensionPixelSize(0x7f0c0029);
        b.a(i);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 0 && i == 4)
        {
            a();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        b.c(i);
    }
}
