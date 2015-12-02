// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.fieldstats.as;
import com.whatsapp.fieldstats.ax;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            iz, App, vw, o7, 
//            SearchFAQ

class ar extends ArrayAdapter
{

    private static final String z;
    final SearchFAQ a;

    public ar(SearchFAQ searchfaq, Context context, int i, List list)
    {
        a = searchfaq;
        super(context, i, list);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view != null) goto _L2; else goto _L1
_L1:
        viewgroup = new LinearLayout(getContext());
        iz.a((LayoutInflater)getContext().getSystemService(z), 0x7f03009f, viewgroup, true);
        if (App.am == 0) goto _L3; else goto _L2
_L2:
        view = (LinearLayout)view;
_L5:
        TextView textview;
        int j;
        if (i % 2 == 0)
        {
            j = -1;
        } else
        {
            j = 0xffededed;
        }
        view.setBackgroundColor(j);
        viewgroup = (vw)getItem(i);
        textview = (TextView)view.findViewById(0x7f0b0290);
        textview.setText(((vw) (viewgroup)).b);
        textview.setOnClickListener(new o7(this, viewgroup));
        SearchFAQ.b(a).n = Double.valueOf(as.SUGGESTED_FAQ.getCode());
        return view;
_L3:
        view = viewgroup;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\006J[\036f\036tK\037u\006JV\024a".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 19;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 106;
          goto _L8
_L3:
        byte0 = 43;
          goto _L8
_L4:
        byte0 = 34;
          goto _L8
        byte0 = 113;
          goto _L8
    }
}
