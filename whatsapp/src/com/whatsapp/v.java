// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, VoipActivity, k, Conversation

class v
    implements android.view.View.OnClickListener
{

    final VoipActivity a;

    v(VoipActivity voipactivity)
    {
        a = voipactivity;
        super();
    }

    public void onClick(View view)
    {
        a.startActivity(Conversation.a(App.az.e(VoipActivity.g(a))));
    }
}
