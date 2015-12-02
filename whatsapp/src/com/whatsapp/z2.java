// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            akx, og

abstract class z2
    implements akx
{

    private static final String z;
    protected final og a;

    public z2(og og1)
    {
        a = og1;
    }

    public final boolean a(og og1)
    {
        boolean flag = false;
        if (og1 == a)
        {
            flag = true;
        } else
        {
            if (a.a == null)
            {
                Log.e(z);
                return false;
            }
            if (a.a.equals(og1.a))
            {
                return b(og1);
            }
        }
        return flag;
    }

    protected abstract boolean b(og og1);

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "}\025\021r7~\025\021iv\177\004\026|-o\027\035s-k\027\00620d\002\023q0n".toCharArray();
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
        byte byte0 = 89;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 10;
          goto _L8
_L3:
        byte0 = 116;
          goto _L8
_L4:
        byte0 = 114;
          goto _L8
        byte0 = 29;
          goto _L8
    }
}
