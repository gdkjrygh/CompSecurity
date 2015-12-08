// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.walmartlabs.ui:
//            SplashScreenManager

class SplashRemovedCallback
    implements android.view.animation.tener
{

    final SplashScreenManager this$0;
    final SplashRemovedCallback val$callback;
    final ViewGroup val$rootContainer;

    public void onAnimationEnd(Animation animation)
    {
        SplashScreenManager.access$100(SplashScreenManager.this);
        if (val$callback != null)
        {
            val$callback.onSplashRemoved();
        }
        if (!SplashScreenManager.access$200(SplashScreenManager.this))
        {
            SplashScreenManager.access$300(SplashScreenManager.this).setRequestedOrientation(2);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        val$rootContainer.setVisibility(0);
    }

    SplashRemovedCallback()
    {
        this$0 = final_splashscreenmanager;
        val$rootContainer = viewgroup;
        val$callback = SplashRemovedCallback.this;
        super();
    }
}
