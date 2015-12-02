// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.webclient.app;

import android.webkit.WebChromeClient;

// Referenced classes of package com.ubercab.webclient.app:
//            WebClientActivity

final class a extends WebChromeClient
{

    final WebClientActivity a;

    public final void onGeolocationPermissionsShowPrompt(String s, android.webkit.ns.Callback callback)
    {
        callback.invoke(s, true, false);
    }

    (WebClientActivity webclientactivity)
    {
        a = webclientactivity;
        super();
    }
}
