// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            Conversation

public final class asa
{

    private static final String z;
    private final Conversation a;
    private final boolean b;

    public asa(Conversation conversation, boolean flag)
    {
        a = conversation;
        b = flag;
    }

    static Conversation a(asa asa1)
    {
        return asa1.a;
    }

    public boolean a()
    {
        return b;
    }

    public Conversation b()
    {
        if (!a())
        {
            throw new AssertionError(z);
        } else
        {
            return a;
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "PW6\001oJQ`\005,M]e\023eQV".toCharArray();
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
        byte byte0 = 12;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 62;
          goto _L8
_L3:
        byte0 = 56;
          goto _L8
_L4:
        byte0 = 22;
          goto _L8
        byte0 = 96;
          goto _L8
    }
}
