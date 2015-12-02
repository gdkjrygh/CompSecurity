// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.contact.b;
import com.whatsapp.contact.j;
import com.whatsapp.contact.n;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, k, s3

class bx
    implements Runnable
{

    private static final String z[];
    final s3 a;
    private long b;
    private long c;

    bx(s3 s3_1)
    {
        a = s3_1;
        super();
        b = 5000L;
    }

    public void run()
    {
        int i;
        i = App.am;
        int l = App.az.a();
        int i1 = a.b();
        try
        {
            Log.i((new StringBuilder()).append(z[1]).append(l).append(z[0]).append(i1).toString());
        }
        catch (InterruptedException interruptedexception)
        {
            throw interruptedexception;
        }
        if (i1 != l) goto _L2; else goto _L1
_L1:
        return;
_L2:
        App.au.ab().post(com.whatsapp.s3.b(a));
        if (System.currentTimeMillis() - c <= 5000L)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        b = 5000L;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        Object obj;
        App app;
        boolean flag;
        try
        {
            b = Math.min(b * 2L, 30000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        try
        {
            app = App.au;
            if (!App.R())
            {
                break MISSING_BLOCK_LABEL_231;
            }
            obj = j.INTERACTIVE_DELTA;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
_L3:
        obj = com.whatsapp.contact.b.b(app, ((j) (obj)));
        if (!((n) (obj)).isFailure())
        {
            break MISSING_BLOCK_LABEL_171;
        }
        a.a(false);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        flag = ((n) (obj)).isSuccess();
        InterruptedException interruptedexception1;
        if (flag)
        {
            try
            {
                a.c(false);
            }
            catch (InterruptedException interruptedexception2)
            {
                throw interruptedexception2;
            }
        }
        try
        {
            Thread.sleep(b);
        }
        catch (InterruptedException interruptedexception3) { }
        try
        {
            c = System.currentTimeMillis();
            if (obj == n.IN_PROGRESS)
            {
                s3.a(a);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
          goto _L1
        obj;
        throw obj;
        obj = j.BACKGROUND_DELTA;
          goto _L3
        interruptedexception1;
        throw interruptedexception1;
        interruptedexception1;
        throw interruptedexception1;
          goto _L1
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "X\002\n\027+\034L";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "\033\036\005\025/\033\005D\016,\013\024\031\027+\n^\004\017-\020\020\005\006+W\007\016\023=\021\036\005\\";
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
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 78;
_L9:
        obj[l] = (char)(byte0 ^ c1);
        l++;
          goto _L8
_L4:
        byte0 = 120;
          goto _L9
_L5:
        byte0 = 113;
          goto _L9
_L6:
        byte0 = 107;
          goto _L9
        byte0 = 97;
          goto _L9
    }
}
