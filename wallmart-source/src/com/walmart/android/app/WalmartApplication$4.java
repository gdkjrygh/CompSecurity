// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import com.walmart.android.analytics.CrashlyticsKeys;

// Referenced classes of package com.walmart.android.app:
//            WalmartApplication

class this._cls0
    implements com.walmart.android.util.allback
{

    final WalmartApplication this$0;

    public void onResult(String s)
    {
        CrashlyticsKeys.setString("walmart_android", s);
    }

    ()
    {
        this$0 = WalmartApplication.this;
        super();
    }
}
