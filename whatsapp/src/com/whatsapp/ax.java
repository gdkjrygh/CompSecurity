// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            rb, Conversation, og

class ax
    implements Runnable
{

    final rb a;

    ax(rb rb1)
    {
        a = rb1;
        super();
    }

    public void run()
    {
        if (rb.a(a).equals(a.d.aD.a))
        {
            Conversation.R(a.d);
            Conversation.d(a.d).setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
    }
}
