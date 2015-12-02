// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            Conversation

class zs
    implements android.view.View.OnClickListener
{

    final Conversation a;

    zs(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
        if (a.aK.getLastVisiblePosition() >= a.aK.getCount() - 1)
        {
            a.aK.setTranscriptMode(2);
            Conversation.ag(a);
        }
        a.aK.setFastScrollEnabled(false);
    }
}
