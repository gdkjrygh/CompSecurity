// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            Conversations

class hj
    implements android.content.DialogInterface.OnClickListener
{

    final Conversations a;

    hj(Conversations conversations)
    {
        a = conversations;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Conversations.b(a);
    }
}
