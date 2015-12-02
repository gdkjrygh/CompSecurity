// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            ao7, Conversation

class qj
    implements android.view.View.OnClickListener
{

    final ao7 a;

    qj(ao7 ao7_1)
    {
        a = ao7_1;
        super();
    }

    public void onClick(View view)
    {
        Conversation.f(a.a, true);
    }
}
