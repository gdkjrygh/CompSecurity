// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            ConversationRowContact, ViewSharedContactActivity, a9l

class at8 extends bv
{

    private static final String z;
    final ConversationRowContact b;

    private at8(ConversationRowContact conversationrowcontact)
    {
        b = conversationrowcontact;
        super();
    }

    at8(ConversationRowContact conversationrowcontact, a9l a9l)
    {
        this(conversationrowcontact);
    }

    public void a(View view)
    {
        view = new Intent(b.getContext(), com/whatsapp/ViewSharedContactActivity);
        view.putExtra(z, b.C.e());
        b.getContext().startActivity(view);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "$d\005ky".toCharArray();
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
        byte byte0 = 29;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 82;
          goto _L8
_L3:
        byte0 = 7;
          goto _L8
_L4:
        byte0 = 100;
          goto _L8
        byte0 = 25;
          goto _L8
    }
}
