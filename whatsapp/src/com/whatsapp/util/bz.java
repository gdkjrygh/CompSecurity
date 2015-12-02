// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.os.SystemClock;

// Referenced classes of package com.whatsapp.util:
//            Log

public class bz
{

    private static final String z[];
    private final boolean a;
    private long b;
    private String c;
    private boolean d;

    public bz()
    {
        this(false);
    }

    public bz(String s)
    {
        this(false);
        b(s);
    }

    public bz(boolean flag)
    {
        d = false;
        c = null;
        b = 0L;
        a = flag;
    }

    private long b()
    {
        if (a)
        {
            return SystemClock.elapsedRealtime();
        } else
        {
            return SystemClock.uptimeMillis();
        }
    }

    public long a()
    {
        long l;
label0:
        {
            if (b == 0L)
            {
                return 0L;
            }
            l = b() - b;
            if (!d)
            {
                break label0;
            }
            if (c != null)
            {
                Log.i((new StringBuilder()).append(c).append(z[1]).append(l).toString());
                if (!Log.f)
                {
                    break label0;
                }
            }
            Log.i((new StringBuilder()).append(z[0]).append(l).toString());
        }
        b = 0L;
        d = false;
        c = null;
        return l;
    }

    public long a(String s)
    {
        long l = a();
        b(s);
        return l;
    }

    public void b(String s)
    {
        c = s;
        d = true;
        c();
    }

    public void c()
    {
        if (d)
        {
            if (c == null);
        }
        b = b();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "g\020X'*<\nA-()Y";
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
                obj = "<\r\\/=aVF67cC\025";
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
        char c1 = obj[j];
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
        byte byte0 = 88;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 19;
          goto _L9
_L5:
        byte0 = 121;
          goto _L9
_L6:
        byte0 = 53;
          goto _L9
        byte0 = 66;
          goto _L9
    }
}
