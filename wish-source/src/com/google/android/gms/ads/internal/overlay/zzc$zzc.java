// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.zzgd;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzc

public static class <init>
{

    public final int index;
    public final Context zzmH;
    public final android.view.p.LayoutParams zzwu;
    public final ViewGroup zzwv;

    public _cls9(zzgd zzgd1)
        throws _cls9
    {
        zzwu = zzgd1.getLayoutParams();
        android.view.ViewParent viewparent = zzgd1.getParent();
        zzmH = zzgd1.zzfq();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            zzwv = (ViewGroup)viewparent;
            index = zzwv.indexOfChild(zzgd1.getWebView());
            zzwv.removeView(zzgd1.getWebView());
            zzgd1.zzB(true);
            return;
        } else
        {
            throw new <init>("Could not get the parent of the WebView for an overlay.");
        }
    }
}
