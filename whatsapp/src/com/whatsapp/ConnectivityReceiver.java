// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import de.greenrobot.event.g;

// Referenced classes of package com.whatsapp:
//            au

public final class ConnectivityReceiver extends BroadcastReceiver
{

    private static final String z[];

    public ConnectivityReceiver()
    {
    }

    public void a(Context context)
    {
        context.registerReceiver(this, new IntentFilter(z[1]));
        context = (ConnectivityManager)context.getSystemService(z[2]);
        g.a().b(au.a(context.getActiveNetworkInfo()));
    }

    public void onReceive(Context context, Intent intent)
    {
        context = ((ConnectivityManager)context.getSystemService(z[0])).getActiveNetworkInfo();
        g.a().b(au.a(context));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "`q\022\033R`j\025\003^wg";
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
                obj = "bp\030\007XjzR\033Rw0\037\032Ym0?:yM[?!~UW(,h@V=;pF";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "`q\022\033R`j\025\003^wg";
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
    //                   1 182
    //                   2 188
    //                   3 194;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        byte byte0 = 55;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 3;
          goto _L9
_L5:
        byte0 = 30;
          goto _L9
_L6:
        byte0 = 124;
          goto _L9
        byte0 = 117;
          goto _L9
    }
}
