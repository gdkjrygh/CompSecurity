// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            ad4, Conversation

class mm
    implements Runnable
{

    final ad4 a;

    mm(ad4 ad4_1)
    {
        a = ad4_1;
        super();
    }

    public void run()
    {
        a.a.aK.setFastScrollEnabled(false);
        a.a.aK.setTranscriptMode(2);
        a.a.aK.setSelection(0);
    }
}
