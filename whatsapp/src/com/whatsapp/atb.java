// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            ConversationsFragment, ContactPicker, xe

class atb extends bv
{

    private static final String z;
    final ConversationsFragment b;

    atb(ConversationsFragment conversationsfragment)
    {
        b = conversationsfragment;
        super();
    }

    public void a(View view)
    {
        view = new Intent(b.getActivity(), com/whatsapp/ContactPicker);
        view.putExtra(z, xe.a(ConversationsFragment.b(b)));
        b.startActivityForResult(view, 1);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\033\022.8;\0".toCharArray();
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
        byte byte0 = 88;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 104;
          goto _L8
_L3:
        byte0 = 119;
          goto _L8
_L4:
        byte0 = 79;
          goto _L8
        byte0 = 74;
          goto _L8
    }
}
