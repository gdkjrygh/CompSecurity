// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package net.hockeyapp.android:
//            LoginManager

static final class val.context extends Handler
{

    final Context val$context;

    public void handleMessage(Message message)
    {
        if (!message.getData().getBoolean("success"))
        {
            LoginManager.access$000(val$context);
        }
    }

    (Context context1)
    {
        val$context = context1;
        super();
    }
}
