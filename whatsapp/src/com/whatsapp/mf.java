// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            og, App, ConversationsFragment

class mf
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z;
    final ConversationsFragment.DeleteBroadcastListDialogFragment a;
    final og b;

    mf(ConversationsFragment.DeleteBroadcastListDialogFragment deletebroadcastlistdialogfragment, og og1)
    {
        a = deletebroadcastlistdialogfragment;
        b = og1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Log.i(z);
        App.k(b.a);
        App.n(b.a);
        ConversationsFragment.b(ConversationsFragment.e() + 1);
        a.dismiss();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\003\027j\033j\022\013e\031f\017\026wBk\005\024a\031jM\033k\003{\001\033p".toCharArray();
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
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 15;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 96;
          goto _L8
_L3:
        byte0 = 120;
          goto _L8
_L4:
        byte0 = 4;
          goto _L8
        byte0 = 109;
          goto _L8
    }
}
