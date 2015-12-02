// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            App, ConversationRowLocation, k, og, 
//            ats

class ato extends bv
{

    final ConversationRowLocation b;

    private ato(ConversationRowLocation conversationrowlocation)
    {
        b = conversationrowlocation;
        super();
    }

    ato(ConversationRowLocation conversationrowlocation, ats ats)
    {
        this(conversationrowlocation);
    }

    public void a(View view)
    {
label0:
        {
            int i = App.am;
            if (b.C.y.b)
            {
                view = App.au.getString(0x7f0e04b8);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (b.C.y.a.contains("-") && b.C.G != null)
            {
                view = App.az.e(b.C.G).a(b.getContext());
                if (i == 0)
                {
                    break label0;
                }
            }
            view = App.az.e(b.C.y.a).a(b.getContext());
        }
        com.whatsapp.ConversationRowLocation.a(b.getContext(), b.C.o, b.C.v, view);
    }
}
