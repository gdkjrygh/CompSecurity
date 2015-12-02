// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            ko, auu, SettingsChat, u5

class m5
    implements Runnable
{

    private static final String z;
    final ko a;

    m5(ko ko1)
    {
        a = ko1;
        super();
    }

    public void run()
    {
        a.a.b.removeDialog(6);
        Preference preference = a.a.b.findPreference(z);
        int i = u5.b();
        int j = u5.a();
        if (i > 0 || j == 0)
        {
            i = 0x7f0e0048;
        } else
        {
            i = 0x7f0e044f;
        }
        preference.setTitle(i);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "fL|x\tdM~T\034y\\sb\013n`zg\021T\\sj\tx".toCharArray();
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
        byte byte0 = 125;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 11;
          goto _L8
_L3:
        byte0 = 63;
          goto _L8
_L4:
        byte0 = 27;
          goto _L8
        byte0 = 11;
          goto _L8
    }
}
