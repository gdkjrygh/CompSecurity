// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            Conversation, mm

class ad4
    implements android.view.View.OnClickListener
{

    final Conversation a;

    ad4(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
        a.aK.onWindowFocusChanged(false);
        a.aK.post(new mm(this));
        Conversation.Q(a).setVisibility(8);
        Conversation.p(a).setVisibility(8);
    }
}
