// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import com.crashlytics.android.Crashlytics;
import com.walmart.android.analytics.CrashlyticsKeys;

// Referenced classes of package com.walmart.android.app:
//            WalmartApplication

class this._cls0
    implements com.walmartlabs.utils._cls3
{

    final WalmartApplication this$0;

    public void d(String s, String s1)
    {
        Crashlytics.log((new StringBuilder()).append("d:").append(s).append(": ").append(s1).toString());
    }

    public void e(String s, String s1)
    {
        Crashlytics.log((new StringBuilder()).append("e:").append(s).append(": ").append(s1).toString());
    }

    public void e(String s, String s1, Throwable throwable)
    {
        CrashlyticsKeys.setTimestamp("current_time", System.currentTimeMillis());
        Crashlytics.log((new StringBuilder()).append("e:").append(s).append(": ").append(s1).toString());
        Crashlytics.logException(throwable);
    }

    public void i(String s, String s1)
    {
        Crashlytics.log((new StringBuilder()).append("i:").append(s).append(": ").append(s1).toString());
    }

    public void v(String s, String s1)
    {
        Crashlytics.log((new StringBuilder()).append("v:").append(s).append(": ").append(s1).toString());
    }

    public void w(String s, String s1)
    {
        Crashlytics.log((new StringBuilder()).append("w:").append(s).append(": ").append(s1).toString());
    }

    ()
    {
        this$0 = WalmartApplication.this;
        super();
    }
}
