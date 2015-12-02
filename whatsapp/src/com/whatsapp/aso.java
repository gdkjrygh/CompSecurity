// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            Conversation, s

class aso
    implements Runnable
{

    final Conversation a;

    aso(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void run()
    {
        a.aK.setFastScrollEnabled(false);
        a.aK.setTranscriptMode(2);
        a.U.notifyDataSetChanged();
    }
}
