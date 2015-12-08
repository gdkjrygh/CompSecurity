// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.utils:
//            TimeoutSettings

static final class val.context
    implements android.content.ClickListener
{

    final Context val$context;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        TimeoutSettings.setTimeoutSetting(TimeoutSettings.access$000()[i], val$context);
        dialoginterface.dismiss();
    }

    ner(Context context1)
    {
        val$context = context1;
        super();
    }
}
