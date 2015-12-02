// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.Writer;

// Referenced classes of package com.whatsapp.util:
//            Log

public class ah extends Writer
{

    private static final String z;
    StringBuilder a;

    public ah()
    {
        a = new StringBuilder();
    }

    public void close()
    {
        a = null;
    }

    public void flush()
    {
        if (Log.g() >= 4)
        {
            Log.a(4, Log.a(z, a.toString()));
            a = new StringBuilder();
        }
    }

    public void write(int i)
    {
        if (Log.g() >= 4)
        {
            a.append((char)i);
        }
    }

    public void write(String s, int i, int j)
    {
        if (Log.g() >= 4)
        {
            a.append(s, i, j);
        }
    }

    public void write(char ac[], int i, int j)
    {
        if (Log.g() >= 4)
        {
            a.append(ac, i, j);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "a!\030N\002".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 34;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 45;
          goto _L8
_L3:
        byte0 = 109;
          goto _L8
_L4:
        byte0 = 71;
          goto _L8
        byte0 = 10;
          goto _L8
    }
}
