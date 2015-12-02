// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            Conversation, s

class lj
    implements Runnable
{

    final int a;
    final Conversation b;

    lj(Conversation conversation, int i)
    {
        b = conversation;
        a = i;
        super();
    }

    public void run()
    {
        b.aK.setTranscriptMode(0);
        int j = s.a(b.U);
        int i = j;
        if (Conversation.E(b) != null)
        {
            i = j + 1;
        }
        b.aK.setSelectionFromTop(i, a);
        Conversation.l(b, false);
        Conversation.e(b, false);
    }
}
