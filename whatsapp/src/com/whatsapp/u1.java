// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.whatsapp.util.c;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            SetStatus, iz, App

class u1 extends ArrayAdapter
{

    private static final String z;
    private ArrayList a;
    final SetStatus b;

    public u1(SetStatus setstatus, Context context, int i, ArrayList arraylist)
    {
        b = setstatus;
        super(context, i, arraylist);
        a = arraylist;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
label0:
        {
            TextView textview;
label1:
            {
                viewgroup = view;
                if (view == null)
                {
                    viewgroup = iz.a((LayoutInflater)b.getSystemService(z), 0x7f0300a1, null);
                }
                view = (String)a.get(i);
                if (view == null)
                {
                    break label0;
                }
                textview = (TextView)viewgroup.findViewById(0x7f0b0297);
                if (textview == null)
                {
                    break label0;
                }
                if (view.equals(App.aJ))
                {
                    textview.setTextColor(Color.argb(255, 51, 102, 153));
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                textview.setTextColor(0xff000000);
            }
            textview.setText(c.b(view, b.getBaseContext()));
        }
        return viewgroup;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\f*,d\021\024\024<e\002\f*!n\026".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
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
        byte byte0 = 100;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 96;
          goto _L8
_L3:
        byte0 = 75;
          goto _L8
_L4:
        byte0 = 85;
          goto _L8
        byte0 = 11;
          goto _L8
    }
}
