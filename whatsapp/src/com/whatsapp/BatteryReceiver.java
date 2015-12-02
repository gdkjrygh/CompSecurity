// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import de.greenrobot.event.g;

// Referenced classes of package com.whatsapp:
//            qt, li, App

final class BatteryReceiver extends BroadcastReceiver
{

    private static final String z[];

    BatteryReceiver()
    {
    }

    private void a(Intent intent)
    {
        intent = new qt(intent);
        g.a().b(intent);
    }

    private void b(Context context)
    {
        context = new li(((PowerManager)context.getSystemService(z[5])).isPowerSaveMode());
        g.a().b(context);
    }

    public void a(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        int i;
        try
        {
            intentfilter.addAction(z[1]);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                intentfilter.addAction(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        try
        {
            context.registerReceiver(this, intentfilter);
            i = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (i < 21)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        b(context);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        g.a().b(new li(false));
    }

    public void onReceive(Context context, Intent intent)
    {
        int i;
        i = App.am;
        String s = intent.getAction();
        byte byte1 = -1;
        byte byte0;
        int j;
        boolean flag;
        try
        {
            j = s.hashCode();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        byte0 = byte1;
        j;
        JVM INSTR lookupswitch 2: default 52
    //                   -1538406691: 116
    //                   1779291251: 151;
           goto _L1 _L2 _L3
_L1:
        byte0 = byte1;
_L9:
        byte0;
        JVM INSTR tableswitch 0 1: default 80
    //                   0 179
    //                   1 189;
           goto _L4 _L5 _L6
_L4:
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[4]).append(intent.getAction()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
_L2:
        flag = s.equals(z[3]);
        byte0 = byte1;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte1 = 0;
        byte0 = 0;
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte0 = byte1;
_L3:
        try
        {
            flag = s.equals(z[2]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (flag)
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        a(intent);
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        b(context);
        if (i == 0)
        {
            return;
        }
        if (true) goto _L4; else goto _L7
        context;
        throw context;
_L7:
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "_T\003\037sW^I\002o\020[\004\031uQTI=Si\17752O\177l\"2Qq~\"2_v{)*Yz";
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
                obj = "_T\003\037sW^I\004rJ_\t\0312_Y\023\004sP\024%,Hj\17754C}r&#[{~";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "_T\003\037sW^I\002o\020[\004\031uQTI=Si\17752O\177l\"2Qq~\"2_v{)*Yz";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "_T\003\037sW^I\004rJ_\t\0312_Y\023\004sP\024%,Hj\17754C}r&#[{~";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "kT\002\025l[Y\023\bx\036[\004\031uQT]M";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "NU\020\bn";
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
        byte byte1 = 28;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 62;
          goto _L9
_L5:
        byte1 = 58;
          goto _L9
_L6:
        byte1 = 103;
          goto _L9
        byte1 = 109;
          goto _L9
    }
}
