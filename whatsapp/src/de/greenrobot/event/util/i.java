// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.util.Log;
import de.greenrobot.event.g;
import java.lang.reflect.Constructor;

// Referenced classes of package de.greenrobot.event.util:
//            f, d, g

class i
    implements Runnable
{

    private static final String z[];
    final d a;
    final f b;

    i(d d1, f f1)
    {
        a = d1;
        b = f1;
        super();
    }

    public void run()
    {
        Object obj;
        try
        {
            b.a();
            return;
        }
        catch (Exception exception)
        {
            try
            {
                obj = d.c(a).newInstance(new Object[] {
                    exception
                });
            }
            catch (Exception exception2)
            {
                Log.e(g.m, z[0], exception);
                throw new RuntimeException(z[1], exception2);
            }
        }
        try
        {
            if (obj instanceof de.greenrobot.event.util.g)
            {
                ((de.greenrobot.event.util.g)obj).a(d.a(a));
            }
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        d.b(a).a(obj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int j;
        as = new String[2];
        obj = ",\035(fJ\r\016-!F\033\f$qW\n\000/;";
        byte1 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[j] = ((String) (obj));
                obj = " \0004mGC\001.u\003\000\035$`W\006O'`J\017\0323d\003\006\031$oW";
                j = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 35;
_L9:
        obj[k] = (char)(byte0 ^ c);
        k++;
          goto _L8
_L4:
        byte0 = 99;
          goto _L9
_L5:
        byte0 = 111;
          goto _L9
_L6:
        byte0 = 65;
          goto _L9
        byte0 = 1;
          goto _L9
    }
}
