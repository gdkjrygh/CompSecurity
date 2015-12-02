// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.PowerManager;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, MediaData, aoz, asg

public class ab6
{

    private static ab6 e;
    private static final String z[];
    private Handler a;
    private ArrayList b;
    private android.os.PowerManager.WakeLock c;
    private asg d;

    private ab6()
    {
        b = new ArrayList();
        a = new Handler();
        PowerManager powermanager = (PowerManager)App.au.getSystemService(z[2]);
        if (powermanager != null)
        {
            c = powermanager.newWakeLock(1, z[1]);
        }
    }

    static android.os.PowerManager.WakeLock a(ab6 ab6_1)
    {
        return ab6_1.c;
    }

    public static ab6 a()
    {
        com/whatsapp/ab6;
        JVM INSTR monitorenter ;
        ab6 ab6_1;
        if (e == null)
        {
            e = new ab6();
        }
        ab6_1 = e;
        com/whatsapp/ab6;
        JVM INSTR monitorexit ;
        return ab6_1;
        Exception exception;
        exception;
        throw exception;
    }

    static ArrayList b(ab6 ab6_1)
    {
        return ab6_1.b;
    }

    static Handler c(ab6 ab6_1)
    {
        return ab6_1.a;
    }

    public void a(c4 c4_1)
    {
        c4_1.M = 1;
        MediaData mediadata = (MediaData)c4_1.B;
        mediadata.transferring = true;
        mediadata.progress = 0L;
        App.ah.a(c4_1, false, -1);
        synchronized (b)
        {
            Log.i((new StringBuilder()).append(z[0]).append(c4_1.y.c).append(" ").append(mediadata.file.getAbsolutePath()).toString());
            b.add(c4_1);
            b.notifyAll();
        }
        if (d == null)
        {
            d = new asg(this);
            d.setPriority(1);
            d.start();
        }
        return;
        c4_1;
        arraylist;
        JVM INSTR monitorexit ;
        throw c4_1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\005570x\007.2;d\020370f\0069&08\002)6 rS";
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
                obj = "\005570x\007.2;d\020370";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\0033$0e";
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
        char c1 = obj[j];
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
        byte byte0 = 23;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 115;
          goto _L9
_L5:
        byte0 = 92;
          goto _L9
_L6:
        byte0 = 83;
          goto _L9
        byte0 = 85;
          goto _L9
    }
}
