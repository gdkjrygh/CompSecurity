// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            Conversation, og

class p
    implements android.content.DialogInterface.OnClickListener
{

    final Conversation a;

    p(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(11);
        dialoginterface = a.aD.a();
        Conversation.a(a, dialoginterface, true);
        Conversation.h(a, false);
    }
}
