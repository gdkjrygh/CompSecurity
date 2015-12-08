// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.map;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.goweather.a.b;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.view.ac;
import com.go.weatherex.home.ArrowIcon;

public class a extends com.go.weatherex.framework.fragment.a
    implements android.view.View.OnClickListener
{

    private com.go.weatherex.common.view.b a;
    private ViewGroup b;
    private ImageView c;
    private ac d;
    private ac e;
    private View f;
    private b g;

    public a()
    {
    }

    public static a a(String s)
    {
        a a1 = new a();
        Bundle bundle = new Bundle();
        bundle.putString("city_name", s);
        a1.setArguments(bundle);
        return a1;
    }

    private void a(int i)
    {
        android.content.SharedPreferences.Editor editor = GoWidgetApplication.c(getActivity().getApplicationContext()).a().edit();
        editor.putInt("key_maps_select_type", i);
        editor.commit();
    }

    private void b(int i)
    {
        if (f.getVisibility() == i)
        {
            return;
        } else
        {
            f.setVisibility(i);
            g.a(f, i);
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        g = new b();
        bundle = getArguments().getString("city_name");
        a.b.setText(bundle);
        c.setSelected(false);
        d.b(true);
        d.a(false);
        e.b(false);
        e.a(false);
        b(0);
    }

    public void onClick(View view)
    {
        if (view.equals(a.a))
        {
            getActivity().finish();
        } else
        {
            if (view.equals(c))
            {
                a(1);
                getActivity().finish();
                return;
            }
            if (!view.equals(d.a) && view.equals(e.a))
            {
                a(3);
                getActivity().finish();
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030084, viewgroup, false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a = new com.go.weatherex.common.view.b(c(0x7f090050));
        a.a.setOnClickListener(this);
        b = (ViewGroup)c(0x7f0901f2);
        b.setVisibility(0);
        c = (ImageView)c(0x7f0901f4);
        d = new ac();
        d.a = b.findViewById(0x7f0901f8);
        d.b = (ImageView)b.findViewById(0x7f0901f9);
        d.c = (ImageView)b.findViewById(0x7f0901fa);
        e = new ac();
        e.a = b.findViewById(0x7f0901f5);
        e.b = (ImageView)b.findViewById(0x7f0901f6);
        e.c = (ImageView)b.findViewById(0x7f0901f7);
        f = c(0x7f0902e9);
        f.setVisibility(8);
        c.setOnClickListener(this);
        d.a(this);
        e.a(this);
    }
}
