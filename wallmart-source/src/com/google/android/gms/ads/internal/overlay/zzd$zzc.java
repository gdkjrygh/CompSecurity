// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.zzip;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzd

public static class <init>
{

    public final Context context;
    public final int index;
    public final android.view.p.LayoutParams zzAM;
    public final ViewGroup zzAN;

    public _cls9(zzip zzip1)
        throws _cls9
    {
        zzAM = zzip1.getLayoutParams();
        android.view.ViewParent viewparent = zzip1.getParent();
        context = zzip1.zzgO();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            zzAN = (ViewGroup)viewparent;
            index = zzAN.indexOfChild(zzip1.getWebView());
            zzAN.removeView(zzip1.getWebView());
            zzip1.zzC(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
