// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App

final class AvailabilityTimeoutAlarmBroadcastReceiver extends BroadcastReceiver
{

    private static final String z[];

    AvailabilityTimeoutAlarmBroadcastReceiver()
    {
    }

    private Intent a()
    {
        return (new Intent(z[3])).setPackage(z[4]);
    }

    public void a(Context context)
    {
        context.registerReceiver(this, new IntentFilter(z[1]), z[2], null);
    }

    void b(Context context)
    {
label0:
        {
            long l = 15000L + System.currentTimeMillis();
            PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, a(), 0);
            context = (AlarmManager)context.getSystemService(z[5]);
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                context.setExact(0, l, pendingintent);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            context.set(0, l, pendingintent);
        }
    }

    void c(Context context)
    {
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, a(), 0x20000000);
        if (pendingintent != null)
        {
            ((AlarmManager)context.getSystemService(z[6])).cancel(pendingintent);
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        Log.i(z[0]);
        if (App.an != 1)
        {
            App.an = 3;
            App.V();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "$Ch8I7VkrW&VyaX,_yuU \034l~T \\mc";
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
                obj = "&\\u9N-RldX5C6vU$Au9x\023rQ[x\007\177]Hm\f~]Xl\021";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "&\\u9N-RldX5C6g\\7^qdJ,\\v9{\027|YSz\004`L";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "&\\u9N-RldX5C6vU$Au9x\023rQ[x\007\177]Hm\f~]Xl\021";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "&\\u9N-RldX5C";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "$_yeT";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "$_yeT";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 57;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 69;
          goto _L9
_L5:
        byte1 = 51;
          goto _L9
_L6:
        byte1 = 24;
          goto _L9
        byte1 = 23;
          goto _L9
    }
}
