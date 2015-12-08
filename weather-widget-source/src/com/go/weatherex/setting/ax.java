// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.model.l;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.setting:
//            at, az, ay

class ax extends BaseAdapter
{

    final at a;
    private LayoutInflater b;

    public ax(at at1)
    {
        a = at1;
        super();
        b = LayoutInflater.from(at1.getActivity());
    }

    public int getCount()
    {
        return at.a(a).size();
    }

    public Object getItem(int i)
    {
        return at.a(a).get(i);
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
            view = b.inflate(0x7f0300f8, null);
            viewgroup = new az(a);
            viewgroup.a = (TextView)view.findViewById(0x7f09041a);
            viewgroup.b = (RadioButton)view.findViewById(0x7f09041b);
            viewgroup.c = (Button)view.findViewById(0x7f09041c);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (az)view.getTag();
        }
        l1 = (l)at.a(a).get(i);
        s1 = l1.i();
        s = s1;
        if (s1.equals("default"))
        {
            s = a.getString(0x7f080125);
        }
        ((az) (viewgroup)).a.setText(s);
        if (!l1.a)
        {
            ((az) (viewgroup)).b.setVisibility(8);
            ((az) (viewgroup)).c.setVisibility(0);
            ((az) (viewgroup)).c.setText(0x7f080128);
        } else
        if (!l1.b)
        {
            ((az) (viewgroup)).c.setVisibility(8);
            ((az) (viewgroup)).b.setVisibility(0);
            if (at.c(a).equals(l1.b()))
            {
                ((az) (viewgroup)).b.setChecked(true);
            } else
            {
                ((az) (viewgroup)).b.setChecked(false);
            }
        } else
        {
            ((az) (viewgroup)).c.setVisibility(0);
            ((az) (viewgroup)).c.setText(0x7f080127);
            if (at.c(a).equals(l1.b()))
            {
                ((az) (viewgroup)).b.setVisibility(0);
                ((az) (viewgroup)).b.setChecked(true);
            } else
            {
                ((az) (viewgroup)).b.setVisibility(8);
                ((az) (viewgroup)).b.setChecked(false);
            }
        }
        ((az) (viewgroup)).c.setOnClickListener(new ay(this, i));
        return view;
    }
}
