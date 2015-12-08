// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.model.l;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            LanguageSetting, z, y

class x extends BaseAdapter
{

    final LanguageSetting a;
    private LayoutInflater b;

    public x(LanguageSetting languagesetting)
    {
        a = languagesetting;
        super();
        b = LayoutInflater.from(languagesetting);
    }

    public int getCount()
    {
        return LanguageSetting.a(a).size();
    }

    public Object getItem(int i)
    {
        return LanguageSetting.a(a).get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        String s;
        String s1;
        l l1;
        if (view == null)
        {
            view = b.inflate(0x7f0300c0, null);
            viewgroup = new z(a);
            viewgroup.a = (TextView)view.findViewById(0x7f09041a);
            viewgroup.b = (RadioButton)view.findViewById(0x7f09041b);
            viewgroup.c = (Button)view.findViewById(0x7f09041c);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (z)view.getTag();
        }
        l1 = (l)LanguageSetting.a(a).get(i);
        s1 = l1.i();
        s = s1;
        if (s1.equals("default"))
        {
            s = a.getString(0x7f080125);
        }
        ((z) (viewgroup)).a.setText(s);
        if (!l1.a)
        {
            ((z) (viewgroup)).b.setVisibility(8);
            ((z) (viewgroup)).c.setVisibility(0);
            ((z) (viewgroup)).c.setText(0x7f080128);
        } else
        if (!l1.b)
        {
            ((z) (viewgroup)).c.setVisibility(8);
            ((z) (viewgroup)).b.setVisibility(0);
            if (LanguageSetting.c(a).equals(l1.b()))
            {
                ((z) (viewgroup)).b.setChecked(true);
            } else
            {
                ((z) (viewgroup)).b.setChecked(false);
            }
        } else
        {
            ((z) (viewgroup)).c.setVisibility(0);
            ((z) (viewgroup)).c.setText(0x7f080127);
            if (LanguageSetting.c(a).equals(l1.b()))
            {
                ((z) (viewgroup)).b.setVisibility(0);
                ((z) (viewgroup)).b.setChecked(true);
            } else
            {
                ((z) (viewgroup)).b.setVisibility(8);
                ((z) (viewgroup)).b.setChecked(false);
            }
        }
        ((z) (viewgroup)).c.setOnClickListener(new y(this, i));
        return view;
    }
}
