// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            as, App, a_m, a3d, 
//            AccountInfoActivity, m7

class ak extends as
{

    private static final String z;
    final AccountInfoActivity a;

    ak(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public void a(a3d a3d1, long l, long l1)
    {
        int i;
        long l2;
        i = App.am;
        l2 = System.currentTimeMillis();
        int j;
        Log.b(z, null, new Object[] {
            a3d1, Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2)
        });
        j = a_m.a[a3d1.ordinal()];
        j;
        JVM INSTR tableswitch 1 3: default 88
    //                   1 99
    //                   2 146
    //                   3 146;
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
        AccountInfoActivity.j(a).sendEmptyMessage(9);
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        if (l <= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        m7.a(a, l, l1);
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        m7.a(a, l, l1);
        if (i != 0) goto _L1; else goto _L6
_L6:
        AccountInfoActivity.j(a).sendEmptyMessage(5);
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
        a3d1 = AccountInfoActivity.j(a).obtainMessage(11, a3d1);
        AccountInfoActivity.j(a).sendMessage(a3d1);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "k3\030>'d$V8<l?T01i?\016?&'?\031\"7x&\036#}i8\032?5o4[#7k#\024?o/#[>>nm^5rd5\flwnp\025>%7u\037".toCharArray();
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
        byte byte0 = 82;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 10;
          goto _L8
_L3:
        byte0 = 80;
          goto _L8
_L4:
        byte0 = 123;
          goto _L8
        byte0 = 81;
          goto _L8
    }
}
