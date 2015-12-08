// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.a;
import java.util.List;

public abstract class aa
    implements a
{

    protected com.go.weatherex.framework.fragment.a a;
    private int b;

    public aa(com.go.weatherex.framework.fragment.a a1, int i1)
    {
        a = a1;
        b = i1;
    }

    public void a()
    {
    }

    public void a(int i1)
    {
    }

    public abstract void a(String s);

    public void a(String s, String s1, int i1)
    {
    }

    public void a(List list)
    {
    }

    public void a(List list, int i1)
    {
    }

    public void a(List list, w w)
    {
    }

    public void a(boolean flag)
    {
    }

    public void a(boolean flag, String s, String s1, int i1)
    {
    }

    public void b()
    {
    }

    public void b(int i1)
    {
    }

    public void b(List list)
    {
    }

    public void b(boolean flag)
    {
    }

    public void c()
    {
    }

    public void c(int i1)
    {
    }

    public void c(boolean flag)
    {
    }

    public void d()
    {
    }

    public void d(int i1)
    {
    }

    public void d(boolean flag)
    {
    }

    public void e()
    {
    }

    public void e(int i1)
    {
    }

    public abstract View f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public void j()
    {
    }

    public void k()
    {
    }

    protected void l()
    {
        Object obj;
        if (a.getActivity() != null)
        {
            if (!((SharedPreferences) (obj = GoWidgetApplication.c(a.getActivity().getApplicationContext()).a())).getBoolean("key_brief_card_tap_for_more", false))
            {
                obj = ((SharedPreferences) (obj)).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("key_brief_card_tap_for_more", true);
                ((android.content.SharedPreferences.Editor) (obj)).commit();
                return;
            }
        }
    }
}
