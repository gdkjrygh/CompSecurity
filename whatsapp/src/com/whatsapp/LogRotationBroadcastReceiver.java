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
import com.whatsapp.util.x;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.whatsapp:
//            App, ki, nm

final class LogRotationBroadcastReceiver extends BroadcastReceiver
{

    private static final String z[];

    LogRotationBroadcastReceiver()
    {
    }

    public void a(Context context)
    {
        context.registerReceiver(this, new IntentFilter(z[1]), z[0], null);
    }

    public void b(Context context)
    {
label0:
        {
            Object obj = Calendar.getInstance();
            ((Calendar) (obj)).add(5, 1);
            ((Calendar) (obj)).set(14, 0);
            ((Calendar) (obj)).set(13, 0);
            ((Calendar) (obj)).set(12, 0);
            ((Calendar) (obj)).set(11, 0);
            long l = ((Calendar) (obj)).getTimeInMillis();
            Log.i((new StringBuilder()).append(z[4]).append((new Date(l)).toString()).toString());
            obj = PendingIntent.getBroadcast(context, 0, (new Intent(z[5])).setPackage(z[2]), 0);
            context = (AlarmManager)context.getSystemService(z[3]);
            context.cancel(((PendingIntent) (obj)));
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                context.setExact(0, l, ((PendingIntent) (obj)));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            context.set(0, l, ((PendingIntent) (obj)));
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        x.a(new ki(this));
        x.a(new nm(this));
        b(context);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "G0\022,NL>\013qXT/Qr\\V2\026qJM0\021,{v\020>Fze\f+";
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
                obj = "G0\022,NL>\013qXT/QcUE-\022,kk\013>V|{\0230Ej";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "G0\022,NL>\013qXT/";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "E3\036pT";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "E/\017-XH>\ro\026V0\013cMAr\023m^Wp\fvXV+_";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "G0\022,NL>\013qXT/QcUE-\022,kk\013>V|{\0230Ej";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 57;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 36;
          goto _L9
_L5:
        byte1 = 95;
          goto _L9
_L6:
        byte1 = 127;
          goto _L9
        byte1 = 2;
          goto _L9
    }
}
