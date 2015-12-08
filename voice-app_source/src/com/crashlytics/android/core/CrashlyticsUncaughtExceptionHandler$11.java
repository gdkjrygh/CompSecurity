// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler, MetaDataStore

class val.keyData
    implements Callable
{

    final CrashlyticsUncaughtExceptionHandler this$0;
    final Map val$keyData;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        String s = CrashlyticsUncaughtExceptionHandler.access$600(CrashlyticsUncaughtExceptionHandler.this);
        (new MetaDataStore(CrashlyticsUncaughtExceptionHandler.access$700(CrashlyticsUncaughtExceptionHandler.this))).writeKeyData(s, val$keyData);
        return null;
    }

    I()
    {
        this$0 = final_crashlyticsuncaughtexceptionhandler;
        val$keyData = Map.this;
        super();
    }
}
