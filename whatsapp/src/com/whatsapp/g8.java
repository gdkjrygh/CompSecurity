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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.af;
import com.google.fi;
import com.whatsapp.util.Log;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            og, iz, App, BlockList, 
//            ao9, a1g

class g8 extends ArrayAdapter
{

    private static final String z[];
    final BlockList a;

    public g8(BlockList blocklist, Context context, int i, List list)
    {
        a = blocklist;
        super(context, i, list);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = (og)getItem(i);
        if (view != null) goto _L2; else goto _L1
_L1:
        viewgroup = new LinearLayout(getContext());
        iz.a((LayoutInflater)getContext().getSystemService(z[0]), 0x7f030039, viewgroup, true);
        viewgroup.findViewById(0x7f0b013e).setVisibility(8);
        if (App.am == 0) goto _L3; else goto _L2
_L2:
        view = (LinearLayout)view;
_L6:
        TextView textview;
        viewgroup = (ImageView)view.findViewById(0x7f0b00b4);
        BlockList.a(a).a(((og) (obj)), viewgroup);
        viewgroup = (TextView)view.findViewById(0x7f0b013d);
        a1g.b(viewgroup);
        viewgroup.setText(((og) (obj)).a(getContext()));
        textview = (TextView)view.findViewById(0x7f0b013f);
        a1g.a(textview);
        viewgroup = ((og) (obj)).a();
        obj = af.a();
        obj = ((af) (obj)).a(((af) (obj)).c(viewgroup, z[1]), fi.INTERNATIONAL);
        viewgroup = ((ViewGroup) (obj));
_L4:
        textview.setText(viewgroup);
        return view;
        Exception exception;
        exception;
        Log.c((new StringBuilder()).append(z[2]).append(viewgroup).toString(), exception);
        if (true) goto _L4; else goto _L3
_L3:
        view = viewgroup;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "M\002\f*4U<\034+'M\002\001 3";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "t0";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "C\017\032&*M\n\0061nD\021\007*3\016";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 65;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 33;
          goto _L9
_L5:
        byte0 = 99;
          goto _L9
_L6:
        byte0 = 117;
          goto _L9
        byte0 = 69;
          goto _L9
    }
}
