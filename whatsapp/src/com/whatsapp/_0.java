// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            VoipActivity

class _0
    implements android.view.View.OnClickListener
{

    final VoipActivity a;

    _0(VoipActivity voipactivity)
    {
        a = voipactivity;
        super();
    }

    public void onClick(View view)
    {
        (new VoipActivity.ReplyWithMessageDialogFragment()).show(a.getSupportFragmentManager(), null);
    }
}
