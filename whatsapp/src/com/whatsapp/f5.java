// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.DataSetObserver;

// Referenced classes of package com.whatsapp:
//            App, Conversation

class f5 extends DataSetObserver
{

    final Conversation a;

    f5(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onChanged()
    {
        if (App.l < 1);
    }

    public void onInvalidated()
    {
        Conversation.a(a, false);
    }
}
