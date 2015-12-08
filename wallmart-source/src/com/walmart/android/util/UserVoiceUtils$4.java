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
        UserVoiceUtils.launchFeedback(val$context);
        dialoginterface = (new com.walmartlabs.anivia..Builder("popUpModal")).putString("modalType", val$context.getString(0x7f09011e)).putString("modalAction", val$context.getString(0x7f09011d));
        MessageBus.getBus().post(dialoginterface);
    }

    uilder(Context context1)
    {
        val$context = context1;
        super();
    }
}
