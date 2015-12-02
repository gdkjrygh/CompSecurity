// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            Conversation

class pj
    implements android.view.View.OnLongClickListener
{

    final Conversation a;

    pj(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public boolean onLongClick(View view)
    {
        Conversation.e(a);
        return true;
    }
}
