// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.Context;
import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.util:
//            UserVoiceUtils

static final class val.context
    implements android.content.nClickListener
{

    final Context val$context;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (new com.walmartlabs.anivia..Builder("enjoyUsingApp")).putString("enjoyResponse", "no");
        MessageBus.getBus().post(dialoginterface);
        UserVoiceUtils.access$000(val$context);
    }

    uilder(Context context1)
    {
        val$context = context1;
        super();
    }
}
