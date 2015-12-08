// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcl;
import com.google.android.gms.internal.zzcx;

// Referenced classes of package com.google.android.gms.ads.formats:
//            NativeAd

public abstract class NativeAdView extends FrameLayout
{

    private final FrameLayout zznY;
    private final zzcl zznZ;

    public NativeAdView(Context context)
    {
        super(context);
        zznY = zzm(context);
        zznZ = zzaI();
    }

    public NativeAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zznY = zzm(context);
        zznZ = zzaI();
    }

    public NativeAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zznY = zzm(context);
        zznZ = zzaI();
    }

    public NativeAdView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        zznY = zzm(context);
        zznZ = zzaI();
    }

    private zzcl zzaI()
    {
        zzx.zzb(zznY, "createDelegate must be called after mOverlayFrame has been created");
        return zzk.zzcI().zza(zznY.getContext(), this, zznY);
    }

    private FrameLayout zzm(Context context)
    {
        context = zzn(context);
        context.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(context);
        return context;
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i, layoutparams);
        super.bringChildToFront(zznY);
    }

    public void bringChildToFront(View view)
    {
        super.bringChildToFront(view);
        if (zznY != view)
        {
            super.bringChildToFront(zznY);
        }
    }

    public void removeAllViews()
    {
        super.removeAllViews();
        super.addView(zznY);
    }

    public void removeView(View view)
    {
        if (zznY == view)
        {
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }

    public void setNativeAd(NativeAd nativead)
    {
        try
        {
            zznZ.zzb((zzd)nativead.zzaH());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (NativeAd nativead)
        {
            zzb.zzb("Unable to call setNativeAd on delegate", nativead);
        }
    }

    protected void zza(String s, View view)
    {
        try
        {
            zznZ.zza(s, zze.zzx(view));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzb("Unable to call setAssetView on delegate", s);
        }
    }

    protected View zzm(String s)
    {
        s = zznZ.zzU(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        s = (View)zze.zzp(s);
        return s;
        s;
        zzb.zzb("Unable to call getAssetView on delegate", s);
        return null;
    }

    FrameLayout zzn(Context context)
    {
        return new FrameLayout(context);
    }
}
