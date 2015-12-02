// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

// Referenced classes of package de.greenrobot.event:
//            f, h, b, i, 
//            g, e

final class m extends Handler
{

    private static final String z[];
    private final f a = new f();
    private final int b;
    private boolean c;
    private final g d;

    m(g g1, Looper looper, int j)
    {
        super(looper);
        d = g1;
        b = j;
    }

    void a(e e, Object obj)
    {
        e = de.greenrobot.event.b.a(e, obj);
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        a.a(e);
        flag = c;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        try
        {
            c = true;
            if (!sendMessage(obtainMessage()))
            {
                throw new h(z[0]);
            }
            break MISSING_BLOCK_LABEL_62;
        }
        // Misplaced declaration of an exception variable
        catch (e e) { }
        finally { }
        throw e;
        this;
        JVM INSTR monitorexit ;
        throw e;
        this;
        JVM INSTR monitorexit ;
    }

    public void handleMessage(Message message)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = i.a;
        long l = SystemClock.uptimeMillis();
_L6:
        b b1 = a.a();
        message = b1;
        if (b1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        message = a.a();
        if (message != null) goto _L4; else goto _L3
_L3:
        c = false;
        this;
        JVM INSTR monitorexit ;
        c = false;
_L8:
        return;
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        long l1;
        d.a(message);
        l1 = SystemClock.uptimeMillis();
        if (l1 - l < (long)b) goto _L6; else goto _L5
_L5:
        boolean flag2 = sendMessage(obtainMessage());
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        try
        {
            throw new h(z[1]);
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        finally
        {
            c = false;
        }
        throw message;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
        message;
        throw message;
        try
        {
            c = true;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            try
            {
                throw message;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                throw message;
            }
        }
        if (!flag1) goto _L8; else goto _L7
_L7:
        flag1 = g.n;
        if (!flag1)
        {
            flag = true;
        }
        g.n = flag;
        return;
    }

    static 
    {
        String as[];
        byte byte1;
        int j;
        as = new String[2];
        byte1 = -1;
        j = 0;
_L2:
        String as1[];
        Object obj;
        int k;
        int l;
        as1 = as;
        obj = "*\032\rAzI\033\027Y>\032\020\026I>\001\024\026Ir\f\007X@{\032\006\031J{".toCharArray();
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
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 155
    //                   2 161
    //                   3 167;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_167;
_L3:
        byte byte0 = 30;
_L9:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L8
_L4:
        byte0 = 105;
          goto _L9
_L5:
        byte0 = 117;
          goto _L9
_L6:
        byte0 = 120;
          goto _L9
        byte0 = 45;
          goto _L9
    }
}
