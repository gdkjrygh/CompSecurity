// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            Conversation, cq, App

class hx
    implements android.view.View.OnClickListener
{

    final Conversation a;

    hx(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (Conversation.o(a))
            {
                Conversation.P(a).a(true);
                Conversation.af(a);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Conversation.s(a);
        }
    }
}
