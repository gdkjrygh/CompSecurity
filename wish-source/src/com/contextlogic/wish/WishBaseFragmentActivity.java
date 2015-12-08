// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish;

import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.contextlogic.wish:
//            WishApplication

public class WishBaseFragmentActivity extends FragmentActivity
{

    public WishBaseFragmentActivity()
    {
    }

    protected void onPause()
    {
        super.onPause();
        WishApplication.getAppInstance().activityPaused();
    }

    protected void onResume()
    {
        super.onResume();
        WishApplication.getAppInstance().activityResumed();
    }
}
