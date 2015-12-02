// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            QuickContactActivity, Conversation

class rw
    implements android.view.View.OnClickListener
{

    final QuickContactActivity a;

    rw(QuickContactActivity quickcontactactivity)
    {
        a = quickcontactactivity;
        super();
    }

    public void onClick(View view)
    {
        a.startActivity(Conversation.a(QuickContactActivity.b(a)));
        QuickContactActivity.a(a, false);
    }
}
