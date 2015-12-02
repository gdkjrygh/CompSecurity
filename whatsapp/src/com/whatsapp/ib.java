// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            Conversation, App, og, aoz

class ib
    implements android.content.DialogInterface.OnClickListener
{

    final Conversation a;

    ib(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Conversation.a(a, 0);
        App.ah.g(a.aD.a);
        a.removeDialog(0);
    }
}
