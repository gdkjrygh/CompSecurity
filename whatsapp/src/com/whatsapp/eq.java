// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            Conversation

class eq
    implements android.view.View.OnClickListener
{

    final Conversation a;

    eq(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
        a.aK.onWindowFocusChanged(false);
        Conversation.ag(a);
        Conversation.Q(a).setVisibility(8);
        Conversation.p(a).setVisibility(8);
    }
}
