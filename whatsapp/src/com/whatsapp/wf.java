// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            ConversationRow

class wf
    implements android.view.View.OnLongClickListener
{

    final ConversationRow a;

    wf(ConversationRow conversationrow)
    {
        a = conversationrow;
        super();
    }

    public boolean onLongClick(View view)
    {
        a.j();
        return true;
    }
}
