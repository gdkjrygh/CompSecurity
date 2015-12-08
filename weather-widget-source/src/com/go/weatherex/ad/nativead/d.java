// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.nativead;

import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.google.android.gms.ads.formats.NativeContentAd;

// Referenced classes of package com.go.weatherex.ad.nativead:
//            a

class d
    implements com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener
{

    final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    public void onContentAdLoaded(NativeContentAd nativecontentad)
    {
        com.go.weatherex.ad.nativead.a.a(a, nativecontentad, com.go.weatherex.ad.nativead.a.f(a));
        nativecontentad = (new e("f000", "ca-app-pub-6646759830189405/8570563171", "3", "", "", "", "")).b();
        com.gau.go.a.e.a(GoWidgetApplication.b()).a(nativecontentad);
    }
}
