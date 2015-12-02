// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            ConversationRow

class ry
    implements android.view.View.OnClickListener
{

    final ConversationRow a;

    ry(ConversationRow conversationrow)
    {
        a = conversationrow;
        super();
    }

    public void onClick(View view)
    {
        a.e();
    }
}
