// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            ConversationsFragment, ArchivedConversationsActivity

class xh
    implements android.view.View.OnClickListener
{

    final ConversationsFragment a;

    xh(ConversationsFragment conversationsfragment)
    {
        a = conversationsfragment;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent(a.getActivity(), com/whatsapp/ArchivedConversationsActivity);
        a.startActivity(view);
    }
}
