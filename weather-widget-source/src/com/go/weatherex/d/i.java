// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.globalview.y;
import java.util.List;

// Referenced classes of package com.go.weatherex.d:
//            a, k, h, j

class i extends BaseAdapter
{

    final a a;
    private RadioButton b;

    public i(a a1)
    {
        a = a1;
        super();
        b = null;
    }

    static RadioButton a(i l)
    {
        return l.b;
    }

    static RadioButton a(i l, RadioButton radiobutton)
    {
        l.b = radiobutton;
        return radiobutton;
    }

    private void a()
    {
        Object obj1 = a.getActivity().getSharedPreferences("myLocation", 0);
        String s = ((SharedPreferences) (obj1)).getString("lat", "");
        Object obj = ((SharedPreferences) (obj1)).getString("lng", "");
        String s2 = ((SharedPreferences) (obj1)).getString("cityName", "");
        String s1 = ((SharedPreferences) (obj1)).getString("stateName", "");
        obj1 = ((SharedPreferences) (obj1)).getString("countryName", "");
        if (s2.length() == 0 || s1.length() == 0 || ((String) (obj1)).length() == 0 || s.length() == 0 || ((String) (obj)).length() == 0 && !com.go.weatherex.d.a.m(a))
        {
            obj = new y(a.getActivity());
            ((y) (obj)).a(0x7f080385);
            ((y) (obj)).c(0x7f08019b);
            ((y) (obj)).b(0x7f080387);
            ((y) (obj)).a();
            return;
        } else
        {
            s2 = (new StringBuilder()).append(a.getString(0x7f08038a)).append(s2).append(";<br/>").toString();
            s1 = (new StringBuilder()).append(s2).append(a.getString(0x7f08038c)).append(s1).append(";<br/>").toString();
            s1 = (new StringBuilder()).append(s1).append(a.getString(0x7f08038b)).append(((String) (obj1))).append(";<br/>").toString();
            s = (new StringBuilder()).append(s1).append(a.getString(0x7f080389)).append(s).append(";<br/>").toString();
            obj = Html.fromHtml((new StringBuilder()).append(s).append(a.getString(0x7f080388)).append(((String) (obj))).append(".<br/>").toString());
            com.go.weatherex.d.a.a(a).setText(((CharSequence) (obj)));
            return;
        }
    }

    static void a(i l, boolean flag)
    {
        l.a(flag);
    }

    private void a(boolean flag)
    {
        if (!flag)
        {
            com.go.weatherex.d.a.j(a).setText("");
        }
        com.go.weatherex.d.a.l(a).setClickable(flag);
    }

    static void b(i l)
    {
        l.a();
    }

    public int getCount()
    {
        return com.go.weatherex.d.a.e(a).size();
    }

    public Object getItem(int l)
    {
        return com.go.weatherex.d.a.e(a).get(l);
    }

    public long getItemId(int l)
    {
        return (long)l;
    }

    public View getView(int l, View view, ViewGroup viewgroup)
    {
        h h1;
        if (view == null)
        {
            viewgroup = new k(a);
            view = ((k) (viewgroup)).c;
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (k)view.getTag();
        }
        h1 = (h)com.go.weatherex.d.a.e(a).get(l);
        ((k) (viewgroup)).b.setText(h1.b());
        ((k) (viewgroup)).a.setId(l);
        if (h1.b().equals(com.go.weatherex.d.a.f(a).getText().toString()))
        {
            ((k) (viewgroup)).a.setChecked(true);
        } else
        {
            ((k) (viewgroup)).a.setChecked(false);
        }
        ((k) (viewgroup)).c.setOnClickListener(new j(this, viewgroup, h1));
        return view;
    }
}
