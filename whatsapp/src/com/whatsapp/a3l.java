// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            Conversation, u5, og

class a3l
    implements android.content.DialogInterface.OnClickListener
{

    final Conversation a;

    a3l(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(9);
        Conversation.d(a, u5.d(a.A).a());
    }
}
