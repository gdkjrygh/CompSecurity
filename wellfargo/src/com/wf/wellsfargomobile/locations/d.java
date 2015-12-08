// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

public class d extends ArrayAdapter
{

    private Context a;
    private List b;

    public d(Context context, int i, List list)
    {
        super(context, i, list);
        a = context;
        b = list;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = ((LayoutInflater)a.getSystemService("layout_inflater")).inflate(0x7f040039, viewgroup, false);
        view.setTag(Integer.valueOf(i));
        Object obj = (TextView)view.findViewById(0x7f0f00b9);
        Object obj1 = (TextView)view.findViewById(0x7f0f00ba);
        TextView textview = (TextView)view.findViewById(0x7f0f00bb);
        TextView textview1 = (TextView)view.findViewById(0x7f0f00bc);
        viewgroup = (HashMap)b.get(i);
        ((TextView) (obj)).setText((new StringBuilder()).append("").append(i + 1).append(". ").append((String)viewgroup.get("siteName")).toString());
        ((TextView) (obj1)).setText((CharSequence)viewgroup.get("addrLine1"));
        textview.setText((new StringBuilder()).append((String)viewgroup.get("city")).append(", ").append((String)viewgroup.get("state")).append(" ").append((String)viewgroup.get("postalcode")).toString());
        textview1.setText((new StringBuilder()).append("(").append((String)viewgroup.get("distFromStart")).append(" miles)").toString());
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append((String)viewgroup.get("siteName")).append("\n");
        ((StringBuilder) (obj)).append((String)viewgroup.get("addrLine1")).append("\n");
        ((StringBuilder) (obj)).append((String)viewgroup.get("city")).append(", ").append((String)viewgroup.get("state")).append(" ").append((String)viewgroup.get("postalcode")).append("\n");
        obj1 = (String)viewgroup.get("phone");
        ((StringBuilder) (obj)).append(a.getString(0x7f0800bd)).append(((String) (obj1)).substring(0, 3)).append("-").append(((String) (obj1)).substring(3, 6)).append("-").append(((String) (obj1)).substring(6, 10)).append("\n");
        ((StringBuilder) (obj)).append(a.getString(0x7f0800f4)).append(" ");
        if (viewgroup.containsKey("serviceType"))
        {
            ((StringBuilder) (obj)).append((String)viewgroup.get("serviceType")).append(" ");
        }
        if (viewgroup.containsKey("atmCount"))
        {
            ((StringBuilder) (obj)).append((String)viewgroup.get("atmCount")).append(" ATM(s)");
        }
        ((StringBuilder) (obj)).append("\n");
        view.setContentDescription(((CharSequence) (obj)));
        if (i % 2 == 0)
        {
            view.setBackgroundColor(a.getResources().getColor(0x7f0e0034));
            return view;
        } else
        {
            view.setBackgroundColor(a.getResources().getColor(0x7f0e0035));
            return view;
        }
    }
}
