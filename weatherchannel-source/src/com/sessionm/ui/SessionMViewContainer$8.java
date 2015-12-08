// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;

// Referenced classes of package com.sessionm.ui:
//            SessionMViewContainer

static final class val.appActivity
    implements Runnable
{

    final Activity val$appActivity;

    public void run()
    {
        SessionMViewContainer.access$1000(new SessionMViewContainer(val$appActivity, bViewType.NORMAL, null));
    }

    bViewType(Activity activity)
    {
        val$appActivity = activity;
        super();
    }
}
