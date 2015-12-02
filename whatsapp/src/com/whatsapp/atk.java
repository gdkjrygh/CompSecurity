// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            ConversationRowLocation, App, ats

class atk extends bv
{

    final ConversationRowLocation b;

    private atk(ConversationRowLocation conversationrowlocation)
    {
        b = conversationrowlocation;
        super();
    }

    atk(ConversationRowLocation conversationrowlocation, ats ats)
    {
        this(conversationrowlocation);
    }

    public void a(View view)
    {
        App.a(b.getContext(), b.C);
    }
}
