// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import com.whatsapp.protocol.c4;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            ja, og, Conversation, ConversationRow

class kp
    implements android.content.DialogInterface.OnClickListener
{

    final Conversation a;
    final c4 b;
    final List c;
    final ConversationRow d;
    final og e;

    kp(ConversationRow conversationrow, Conversation conversation, List list, og og1, c4 c4)
    {
        d = conversationrow;
        a = conversation;
        c = list;
        e = og1;
        b = c4;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(((ja)c.get(i)).b, e.a(), b);
    }
}
