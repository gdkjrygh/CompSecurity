// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            Conversation

class xa
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final Conversation b;
    final String c;
    final int d[];

    xa(Conversation conversation, int ai[], String s, int i)
    {
        b = conversation;
        d = ai;
        c = s;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Conversation.a(b, d[i], c, a);
    }
}
