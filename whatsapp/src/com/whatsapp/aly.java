// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.PowerManager;
import com.whatsapp.contact.b;
import com.whatsapp.contact.j;
import com.whatsapp.contact.n;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, s3

final class aly
    implements Runnable
{

    private static final String z[];
    final j a;

    aly(j j)
    {
        a = j;
        super();
    }

    public void run()
    {
        Object obj;
        PowerManager powermanager = (PowerManager)App.au.getSystemService(z[6]);
        obj = null;
        if (powermanager != null)
        {
            obj = powermanager.newWakeLock(1, z[4]);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        ((android.os.PowerManager.WakeLock) (obj)).acquire();
        Log.i(z[2]);
        n n1 = b.b(App.au, a);
        int i;
        if (!n1.isSuccess())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        App.ay.c(true);
        App.au.a(System.currentTimeMillis());
        i = App.am;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        boolean flag = n1.isFailure();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        App.ay.a(true);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        Object obj1;
        boolean flag1;
        try
        {
            flag1 = ((android.os.PowerManager.WakeLock) (obj)).isHeld();
        }
        catch (Exception exception)
        {
            try
            {
                throw exception;
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        ((android.os.PowerManager.WakeLock) (obj)).release();
        Log.i(z[0]);
_L2:
        return;
        obj1;
        throw obj1;
        obj1;
        Log.c(z[5], ((Throwable) (obj1)));
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((android.os.PowerManager.WakeLock) (obj)).isHeld()) goto _L2; else goto _L3
_L3:
        ((android.os.PowerManager.WakeLock) (obj)).release();
        Log.i(z[1]);
        return;
        obj;
        throw obj;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        if (obj != null)
        {
            try
            {
                if (((android.os.PowerManager.WakeLock) (obj)).isHeld())
                {
                    ((android.os.PowerManager.WakeLock) (obj)).release();
                    Log.i(z[3]);
                }
            }
            catch (Exception exception2)
            {
                throw exception2;
            }
        }
        throw obj1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "kE\017\017|k_\021\000jtD\036Cna\005\017\tuhK\016\t";
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
                obj = "kE\017\017|k_\021\000jtD\036Cna\005\017\tuhK\016\t";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "kE\017\017|k_\021\000jtD\036Cna\005\034\017hxC\017\t";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "kE\017\017|k_\021\000jtD\036Cna\005\017\tuhK\016\t";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "k_\021\000jtD\036";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "kE\017\017|k_\021\000jtD\036C|\177X\022\036";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "}E\n\tk";
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
        char c = obj[j];
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
        byte byte1 = 25;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 13;
          goto _L9
_L5:
        byte1 = 42;
          goto _L9
_L6:
        byte1 = 125;
          goto _L9
        byte1 = 108;
          goto _L9
    }
}
