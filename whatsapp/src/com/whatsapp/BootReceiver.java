// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Process;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App

public class BootReceiver extends BroadcastReceiver
{

    private static final String z[];

    public BootReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Log.i(z[1]);
        if (App.au != null)
        {
            App.a(App.au, 0);
            boolean flag = ((ConnectivityManager)App.au.getSystemService(z[0])).getBackgroundDataSetting();
            context = App.au;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            App.b(context, flag);
        }
        if (App.f(App.au) != 3)
        {
            Process.killProcess(Process.myPid());
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "~GA]A~\\FEMiQ";
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
                obj = "\177G@G\004~GBCHx\\J";
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
        byte byte0 = 36;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 29;
          goto _L9
_L5:
        byte0 = 40;
          goto _L9
_L6:
        byte0 = 47;
          goto _L9
        byte0 = 51;
          goto _L9
    }
}
