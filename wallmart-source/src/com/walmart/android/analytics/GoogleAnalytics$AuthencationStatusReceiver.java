// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;

import com.walmartlabs.auth.AuthenticationStatusEvent;

// Referenced classes of package com.walmart.android.analytics:
//            GoogleAnalytics

private static class <init>
{

    public AuthenticationStatusEvent mLastAuthStatusEvent;

    public void onAuthencationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        mLastAuthStatusEvent = authenticationstatusevent;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
