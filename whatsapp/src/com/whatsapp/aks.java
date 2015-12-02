// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;

// Referenced classes of package com.whatsapp:
//            ak8, Conversation, dx

class aks extends ak8
{

    final Conversation w;

    aks(Conversation conversation, Activity activity, dx dx)
    {
        w = conversation;
        super(activity, dx);
    }

    public void c()
    {
        Conversation.x(w);
    }
}
