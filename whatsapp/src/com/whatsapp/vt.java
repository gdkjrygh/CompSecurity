// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            RegisterName

class vt
    implements android.content.DialogInterface.OnCancelListener
{

    private static final String z;
    final RegisterName a;

    vt(RegisterName registername)
    {
        a = registername;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        Log.i(z);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "U\001Ug\177S\001@`mJ\001\035jeF\b]i#D\005\\z!D\013\\`iD\020\035mmI\007Wb".toCharArray();
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
        byte0 = 39;
          goto _L8
_L3:
        byte0 = 100;
          goto _L8
_L4:
        byte0 = 50;
          goto _L8
        byte0 = 14;
          goto _L8
    }
}
