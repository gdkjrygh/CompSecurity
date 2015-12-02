// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            Conversation

class as8
    implements android.view.View.OnClickListener
{

    final Conversation a;

    as8(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
        Conversation.x(a);
    }
}
