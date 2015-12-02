// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class gop extends BaseAdapter
    implements gos
{

    private Context a;
    private List b;
    private List c;
    private Map d;

    public gop(Context context, goo goo1)
    {
        a = context;
        context = goo1.a();
        b = new ArrayList(context.values());
        c = new ArrayList(context.keySet());
        a(goo1);
        gor.a(a, this);
    }

    private void a(goo goo1)
    {
        String s = Locale.getDefault().getCountry();
        goo1 = goo1.a(s);
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(goo1))
        {
            return;
        } else
        {
            b.add(0, s.toLowerCase(Locale.US));
            c.add(0, goo1);
            return;
        }
    }

    private String b(int i)
    {
        return (String)c.get(i);
    }

    public final String a(int i)
    {
        return (String)b.get(i);
    }

    public final void a(Map map)
    {
        d = map;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(a).inflate(gok.ub__locale_countries_listitem_country, viewgroup, false);
        }
        view = a(i);
        viewgroup = b(i);
        TextView textview = (TextView)view1.findViewById(goj.ub__countries_textview_name);
        textview.setText(viewgroup);
        textview.setTag(view);
        if (d != null && d.containsKey(view))
        {
            textview.setCompoundDrawablesWithIntrinsicBounds((Drawable)d.get(view), null, null, null);
            return view1;
        } else
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(goi.ub__locale_icon_flag_blank, 0, 0, 0);
            return view1;
        }
    }

    public final boolean isEmpty()
    {
        return super.isEmpty() || d == null;
    }
}
