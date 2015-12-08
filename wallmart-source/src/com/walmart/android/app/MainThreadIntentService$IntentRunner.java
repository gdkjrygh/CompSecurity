// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.content.Intent;

// Referenced classes of package com.walmart.android.app:
//            MainThreadIntentService

private class mIntent
    implements Runnable
{

    private final Intent mIntent;
    final MainThreadIntentService this$0;

    public void run()
    {
        if (onHandleIntent(mIntent))
        {
            intentHandled(mIntent);
        }
    }

    public (Intent intent)
    {
        this$0 = MainThreadIntentService.this;
        super();
        mIntent = intent;
    }
}
