// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            dx, Conversation, og

class m
    implements android.content.DialogInterface.OnClickListener
{

    final og a;
    final ConversationsFragment.EmailConversationMediaChoiceDialogFragment b;

    m(ConversationsFragment.EmailConversationMediaChoiceDialogFragment emailconversationmediachoicedialogfragment, og og)
    {
        b = emailconversationmediachoicedialogfragment;
        a = og;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.dismiss();
        Conversation.a(b.getActivity(), (dx)b.getActivity(), a, false);
    }
}
