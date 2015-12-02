// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import de.greenrobot.event.g;

// Referenced classes of package com.whatsapp:
//            a9n, App

public final class ScreenLockReceiver extends BroadcastReceiver
{

    private static final String z[];
    private boolean a;

    public ScreenLockReceiver()
    {
    }

    public void a(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(z[0]);
        intentfilter.addAction(z[2]);
        context.registerReceiver(this, intentfilter);
        boolean flag;
        if (!((PowerManager)context.getSystemService(z[1])).isScreenOn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        g.a().b(new a9n(a));
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag;
label0:
        {
            flag = a;
            if (intent.getAction().equals(z[5]))
            {
                Log.i(z[4]);
                a = false;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (intent.getAction().equals(z[6]))
            {
                Log.i(z[7]);
                a = true;
            }
        }
        if (a != flag)
        {
            g.a().b(new a9n(a));
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[3]).append(a).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "\\\013b4?T\001(/>I\000h2~\\\006r/?SKU\005\002x H\031\037{#";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "M\nq#\"";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\\\013b4?T\001(/>I\000h2~\\\006r/?SKU\005\002x H\031\037s";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "n\006t#5S)i%;o\000e#9K\000t=<R\006m#4\0";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\\\025vi#^\027c#>\022\nh";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\\\013b4?T\001(/>I\000h2~\\\006r/?SKU\005\002x H\031\037s";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                obj = "\\\013b4?T\001(/>I\000h2~\\\006r/?SKU\005\002x H\031\037{#";
                byte0 = 5;
                i = 6;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\\\025vi#^\027c#>\022\n` ";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 80;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 61;
          goto _L9
_L5:
        byte1 = 101;
          goto _L9
_L6:
        byte1 = 6;
          goto _L9
        byte1 = 70;
          goto _L9
    }
}
