// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            as, App, ty, a3d, 
//            Conversations, m7

class a_ extends as
{

    private static final String z;
    final Conversations a;

    a_(Conversations conversations)
    {
        a = conversations;
        super();
    }

    public void a(a3d a3d1, long l, long l1)
    {
        int i;
        i = App.am;
        System.currentTimeMillis();
        int j = ty.a[a3d1.ordinal()];
        j;
        JVM INSTR tableswitch 1 3: default 48
    //                   1 59
    //                   2 101
    //                   3 101;
           goto _L1 _L2 _L3 _L3
_L1:
        try
        {
            throw new RuntimeException();
        }
        // Misplaced declaration of an exception variable
        catch (a3d a3d1)
        {
            throw a3d1;
        }
_L2:
        if (l >= l1) goto _L5; else goto _L4
_L4:
        a.showDialog(119);
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        if (l <= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        a.showDialog(121);
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        m7.a(a, l, l1);
        if (i != 0) goto _L1; else goto _L6
_L6:
        return;
        a3d1;
        try
        {
            throw a3d1;
        }
        // Misplaced declaration of an exception variable
        catch (a3d a3d1) { }
        try
        {
            throw a3d1;
        }
        // Misplaced declaration of an exception variable
        catch (a3d a3d1) { }
        try
        {
            throw a3d1;
        }
        // Misplaced declaration of an exception variable
        catch (a3d a3d1) { }
        try
        {
            throw a3d1;
        }
        // Misplaced declaration of an exception variable
        catch (a3d a3d1) { }
        throw a3d1;
    }

    public void a(a3d a3d1, long l, long l1, ArrayList arraylist)
    {
        a3d1 = m7.a(a, arraylist);
        Log.i((new StringBuilder()).append(z).append(a3d1).toString());
        a.f(a3d1);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\b?T*\034\031#[(\020\004>I=\032\0379L5\r\022\177[?\032\004%T(T\0042I9\013\0355Hs\035\0021V3\036D7S:\rK".toCharArray();
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
        byte byte0 = 121;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 107;
          goto _L8
_L3:
        byte0 = 80;
          goto _L8
_L4:
        byte0 = 58;
          goto _L8
        byte0 = 92;
          goto _L8
    }
}
