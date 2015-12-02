// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            og, App, ConversationsFragment

class aop
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z;
    final og a;
    final ConversationsFragment.DeleteContactDialogFragment b;

    aop(ConversationsFragment.DeleteContactDialogFragment deletecontactdialogfragment, og og1)
    {
        b = deletecontactdialogfragment;
        a = og1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Log.i(z);
        App.k(a.a);
        ConversationsFragment.b(ConversationsFragment.e() + 1);
        b.dismiss();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\020%\f\013\021\0019\003\t\035\034$\021R\020\026&\007\t\021^)\r\023\000\022)\026".toCharArray();
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
        byte byte0 = 116;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 115;
          goto _L8
_L3:
        byte0 = 74;
          goto _L8
_L4:
        byte0 = 98;
          goto _L8
        byte0 = 125;
          goto _L8
    }
}
