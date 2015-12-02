// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            Conversation

class au0
    implements android.content.DialogInterface.OnClickListener
{

    final Conversation a;
    final int b[];

    au0(Conversation conversation, int ai[])
    {
        a = conversation;
        b = ai;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b[0] = i;
    }
}
