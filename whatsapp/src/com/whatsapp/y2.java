// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import com.whatsapp.util.undobar.d;

// Referenced classes of package com.whatsapp:
//            App, h0, ConversationsFragment, aoz, 
//            a3_, ka

class y2
    implements Runnable
{

    private static final String z;
    final h0 a;

    y2(h0 h0_1)
    {
        a = h0_1;
        super();
    }

    public void run()
    {
        App.ah.b(ConversationsFragment.f(a.b), true);
        Bundle bundle = new Bundle();
        bundle.putString(z, ConversationsFragment.f(a.b));
        (new d(a.b.getActivity())).a(0x7f0e00ea).a(new a3_(this)).a(bundle).a();
        ConversationsFragment.h(a.b).getViewTreeObserver().addOnGlobalLayoutListener(new ka(this));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\031\"7".toCharArray();
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
        byte byte0 = 27;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 115;
          goto _L8
_L3:
        byte0 = 75;
          goto _L8
_L4:
        byte0 = 83;
          goto _L8
        byte0 = 107;
          goto _L8
    }
}
