// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            ListChatInfo, og, App, iz, 
//            a1g, ao9

class uq extends ArrayAdapter
{

    public LayoutInflater a;
    final ListChatInfo b;

    public uq(ListChatInfo listchatinfo, Context context, int i, List list)
    {
        b = listchatinfo;
        super(context, i, list);
        a = LayoutInflater.from(context);
    }

    private void a(TextView textview, String s)
    {
        textview.setText(c.b(s, b.getBaseContext(), textview.getPaint()));
    }

    public int getCount()
    {
        return ListChatInfo.a(b).size();
    }

    public int getItemViewType(int i)
    {
        return !((og)getItem(i)).l() ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int k = App.am;
        if (view != null) goto _L2; else goto _L1
_L1:
        TextView textview;
        og og1;
        ImageView imageview;
        int j;
        if (getItemViewType(i) == 0)
        {
            j = 0x7f03006c;
        } else
        {
            j = 0x7f03006d;
        }
        viewgroup = iz.a(a, j, viewgroup, false);
        if (k == 0) goto _L3; else goto _L2
_L2:
        view.setBackgroundResource(0x7f02063d);
_L5:
label0:
        {
            view.setBackgroundResource(0x7f0205e0);
            view.findViewById(0x7f0b00d7).setVisibility(0);
            viewgroup = (TextView)view.findViewById(0x7f0b0135);
            textview = (TextView)view.findViewById(0x7f0b00cf);
            imageview = (ImageView)view.findViewById(0x7f0b01ea);
            a1g.a(textview);
            og1 = (og)getItem(i);
            view.setTag(og1);
            viewgroup.setText(og1.a(getContext()));
            ListChatInfo.e(b).a(og1, imageview);
            if (og1.l())
            {
                if (og1.N != null)
                {
                    viewgroup = (new StringBuilder()).append("~").append(og1.N).toString();
                } else
                {
                    viewgroup = null;
                }
                a(textview, viewgroup);
                if (k == 0)
                {
                    break label0;
                }
            }
            a(textview, og1.d);
        }
        return view;
_L3:
        view = viewgroup;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int getViewTypeCount()
    {
        return 2;
    }
}
