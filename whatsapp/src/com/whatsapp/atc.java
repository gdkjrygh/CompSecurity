// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            dx, Conversation, og

class atc
    implements android.content.DialogInterface.OnClickListener
{

    final ConversationsFragment.EmailConversationMediaChoiceDialogFragment a;
    final og b;

    atc(ConversationsFragment.EmailConversationMediaChoiceDialogFragment emailconversationmediachoicedialogfragment, og og)
    {
        a = emailconversationmediachoicedialogfragment;
        b = og;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.dismiss();
        Conversation.a(a.getActivity(), (dx)a.getActivity(), b, true);
    }
}
