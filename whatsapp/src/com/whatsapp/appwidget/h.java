// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.appwidget;

import android.appwidget.AppWidgetManager;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.appwidget:
//            WidgetProvider, b

class h
    implements Runnable
{

    private static final String z[];
    final ArrayList a;
    final b b;

    h(b b1, ArrayList arraylist)
    {
        b = b1;
        a = arraylist;
        super();
    }

    public void run()
    {
        int ai[];
        int k;
        int i1;
        int j1;
        i1 = WidgetProvider.d;
        WidgetProvider.a(a);
        ai = com.whatsapp.appwidget.b.b(b);
        j1 = ai.length;
        k = 0;
_L4:
        if (k >= j1) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k1;
label0:
        {
            k1 = ai[k];
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                break MISSING_BLOCK_LABEL_175;
            }
            Bundle bundle = com.whatsapp.appwidget.b.a(b).getAppWidgetOptions(k1);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_175;
            }
            j = bundle.getInt(z[1]);
            int l = bundle.getInt(z[0]);
            if (j != 0)
            {
                i = l;
                if (l != 0)
                {
                    break label0;
                }
            }
            i = 0x7fffffff;
            j = 0x7fffffff;
        }
_L5:
        android.widget.RemoteViews remoteviews = WidgetProvider.a(com.whatsapp.appwidget.b.c(b), k1, j, i);
        com.whatsapp.appwidget.b.a(b).updateAppWidget(k1, remoteviews);
        if (WidgetProvider.b(j, i))
        {
            com.whatsapp.appwidget.b.a(b).notifyAppWidgetViewDataChanged(k1, 0x7f0b02e9);
        }
        if (i1 == 0) goto _L3; else goto _L2
_L2:
        return;
_L3:
        k++;
          goto _L4
        i = 0x7fffffff;
        j = 0x7fffffff;
          goto _L5
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "k\"lJvn5yiRc<Txvm:h";
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
                i = 1;
                obj = "k\"lJvn5yiRc<Kt{~:";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 31;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 10;
          goto _L9
_L5:
        byte0 = 82;
          goto _L9
_L6:
        byte0 = 28;
          goto _L9
        byte0 = 29;
          goto _L9
    }
}
