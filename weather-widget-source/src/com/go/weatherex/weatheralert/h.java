// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.weatheralert;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.model.c;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.weatheralert:
//            g, WeatherAlertActivity

class h extends BaseAdapter
{

    final WeatherAlertActivity a;
    private ArrayList b;

    public h(WeatherAlertActivity weatheralertactivity)
    {
        a = weatheralertactivity;
        super();
        b = new ArrayList();
    }

    public void a(ArrayList arraylist)
    {
        if (arraylist == null)
        {
            return;
        } else
        {
            b.clear();
            b.addAll(arraylist);
            return;
        }
    }

    public int getCount()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.size();
        }
    }

    public Object getItem(int i)
    {
        if (b == null)
        {
            return null;
        } else
        {
            return (c)b.get(i);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        c c1;
        if (view == null)
        {
            viewgroup = new g(a);
            view = a.getLayoutInflater().inflate(0x7f03012a, null, false);
            viewgroup.a = view.findViewById(0x7f090050);
            viewgroup.b = (ImageView)view.findViewById(0x7f090570);
            viewgroup.c = (TextView)view.findViewById(0x7f090568);
            viewgroup.d = (TextView)view.findViewById(0x7f090571);
            viewgroup.e = (TextView)view.findViewById(0x7f090572);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (g)view.getTag();
        }
        c1 = (c)WeatherAlertActivity.d(a).get(i);
        ((g) (viewgroup)).d.setText(WeatherAlertActivity.a(a, c1.c()));
        ((g) (viewgroup)).c.setText(c1.f());
        ((g) (viewgroup)).e.setText(c1.i());
        switch (c1.h())
        {
        default:
            ((g) (viewgroup)).b.setImageResource(0x7f020616);
            ((g) (viewgroup)).c.setTextColor(a.getResources().getColor(0x7f0a008b));
            return view;

        case 8: // '\b'
            ((g) (viewgroup)).b.setImageResource(0x7f020618);
            ((g) (viewgroup)).c.setTextColor(a.getResources().getColor(0x7f0a008c));
            return view;

        case 9: // '\t'
            ((g) (viewgroup)).b.setImageResource(0x7f020617);
            ((g) (viewgroup)).c.setTextColor(a.getResources().getColor(0x7f0a008d));
            return view;

        case 10: // '\n'
            ((g) (viewgroup)).b.setImageResource(0x7f020619);
            ((g) (viewgroup)).c.setTextColor(a.getResources().getColor(0x7f0a008e));
            return view;

        case 11: // '\013'
            ((g) (viewgroup)).b.setImageResource(0x7f020615);
            break;
        }
        ((g) (viewgroup)).c.setTextColor(a.getResources().getColor(0x7f0a008f));
        return view;
    }
}
