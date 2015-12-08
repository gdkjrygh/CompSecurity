// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler, MetaDataStore, UserMetaData

class val.userEmail
    implements Callable
{

    final CrashlyticsUncaughtExceptionHandler this$0;
    final String val$userEmail;
    final String val$userId;
    final String val$userName;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        String s = CrashlyticsUncaughtExceptionHandler.access$600(CrashlyticsUncaughtExceptionHandler.this);
        (new MetaDataStore(CrashlyticsUncaughtExceptionHandler.access$700(CrashlyticsUncaughtExceptionHandler.this))).writeUserData(s, new UserMetaData(val$userId, val$userName, val$userEmail));
        return null;
    }

    I()
    {
        this$0 = final_crashlyticsuncaughtexceptionhandler;
        val$userId = s;
        val$userName = s1;
        val$userEmail = String.this;
        super();
    }
}
