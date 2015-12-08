// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;


// Referenced classes of package com.walmartlabs.ui:
//            SplashScreenManager

class SplashRemovedCallback
    implements Runnable
{

    final SplashScreenManager this$0;
    final SplashRemovedCallback val$callback;

    public void run()
    {
        SplashScreenManager.access$000(SplashScreenManager.this, true, val$callback);
    }

    SplashRemovedCallback()
    {
        this$0 = final_splashscreenmanager;
        val$callback = SplashRemovedCallback.this;
        super();
    }
}
