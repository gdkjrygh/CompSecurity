// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            k6, App

public class kz extends k6
{

    private static final String z;
    String b;
    Collection c;
    int d;

    public kz(String s, Collection collection, int i)
    {
        b = s;
        c = collection;
        d = i;
    }

    public String a()
    {
        int i = App.am;
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c4 c4_1 = (c4)iterator.next();
            stringbuilder.append(" ");
            stringbuilder.append(c4_1.y.toString());
        } while (i == 0);
        return (new StringBuilder()).append(z).append(b).append(stringbuilder.toString()).append(" ").append(d).toString();
    }

    public void c()
    {
        com.whatsapp.App.a(b, c, d);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "4I^{\035)dll\0376\033".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 120;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 69;
          goto _L8
_L3:
        byte0 = 59;
          goto _L8
_L4:
        byte0 = 1;
          goto _L8
        byte0 = 31;
          goto _L8
    }
}
