// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import org.whispersystems.aL;

// Referenced classes of package com.whatsapp:
//            a3, Conversation, asa, a9n, 
//            og, App, aoz

class ast
    implements aL
{

    private static final String z;
    final a3 a;

    ast(a3 a3_1)
    {
        a = a3_1;
        super();
    }

    public void a(byte abyte0[])
    {
        if (!a.e.f())
        {
            Log.i(z);
            a.e.a(abyte0);
        }
        abyte0 = Conversation.B();
        if (abyte0.a() && !a.c.a() && abyte0.b().A.equals(a.d) && a.b.c == 0)
        {
            a.e.M = 13;
        }
        App.ah.c(a.e, -1);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "wj\021]\tb~^\\\003ea\037V\0036v\033R\024ob\nX\tx2\026P\0026|\021\021\002wf\037\nFu{\016Y\003df\033I\0226}\020]\037".toCharArray();
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
        byte byte0 = 102;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 22;
          goto _L8
_L3:
        byte0 = 18;
          goto _L8
_L4:
        byte0 = 126;
          goto _L8
        byte0 = 49;
          goto _L8
    }
}
