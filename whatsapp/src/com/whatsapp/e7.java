// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.q;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            CallsFragment, yj, en, iz, 
//            at3, og, ao9, TextEmojiLabel, 
//            a1g, App, a9b

class e7 extends BaseAdapter
    implements Filterable
{

    private Filter a;
    final CallsFragment b;

    private e7(CallsFragment callsfragment)
    {
        b = callsfragment;
        super();
    }

    e7(CallsFragment callsfragment, a9b a9b)
    {
        this(callsfragment);
    }

    public yj a(int i)
    {
        return (yj)CallsFragment.b(b).get(i);
    }

    public int getCount()
    {
        return CallsFragment.b(b).size();
    }

    public Filter getFilter()
    {
        if (a == null)
        {
            a = new en(b, null);
        }
        return a;
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)((yj)CallsFragment.b(b).get(i)).hashCode();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        Object obj;
        yj yj1;
        Object obj1;
        obj = null;
        yj1 = a(i);
        view1 = view;
        if (view == null)
        {
            view1 = iz.a(b.getLayoutInflater(null), 0x7f030029, viewgroup, false);
        }
        view = yj1.e();
        viewgroup = (ImageView)view1.findViewById(0x7f0b00ce);
        obj1 = view1.findViewById(0x7f0b00dc);
        at3 at3_1 = new at3(((og) (view)).a, b.getActivity());
        viewgroup.setOnClickListener(at3_1);
        ((View) (obj1)).setOnClickListener(at3_1);
        CallsFragment.h(b).a(view, viewgroup);
        obj1 = (TextEmojiLabel)view1.findViewById(0x7f0b00b6);
        a1g.b(((TextView) (obj1)));
        viewgroup = view.a(b.getActivity());
        view = obj;
        if (TextUtils.isEmpty(CallsFragment.c(b))) goto _L2; else goto _L1
_L1:
        if (!viewgroup.toLowerCase().startsWith(CallsFragment.c(b).toString().toLowerCase())) goto _L4; else goto _L3
_L3:
        view = new SpannableStringBuilder(viewgroup);
        view.setSpan(new ForegroundColorSpan(b.getResources().getColor(0x7f090032)), 0, CallsFragment.c(b).length(), 33);
_L2:
label0:
        {
            if (view == null)
            {
                view = viewgroup;
            }
            ((TextEmojiLabel) (obj1)).setText(view);
            view = (TextView)view1.findViewById(0x7f0b00df);
            a1g.a(view);
            view.setText(q.e(b.getActivity(), yj1.c()));
            view = (TextView)view1.findViewById(0x7f0b00de);
            a1g.a(view);
            i = yj1.a();
            if (i > 1)
            {
                view.setText((new StringBuilder()).append("(").append(Integer.toString(i)).append(")").toString());
                view.setVisibility(0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            view.setVisibility(8);
        }
        ((ImageView)view1.findViewById(0x7f0b00d3)).setImageResource(yj1.d());
        view = view1.findViewById(0x7f0b00dd);
        view.setOnClickListener(b.k);
        view.setTag(yj1);
        return view1;
_L4:
        i = viewgroup.toLowerCase().indexOf((new StringBuilder()).append(" ").append(CallsFragment.c(b).toString().toLowerCase()).toString());
        view = obj;
        if (i > 0)
        {
            view = new SpannableStringBuilder(viewgroup);
            view.setSpan(new ForegroundColorSpan(b.getResources().getColor(0x7f090032)), i + 1, i + 1 + CallsFragment.c(b).length(), 33);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
