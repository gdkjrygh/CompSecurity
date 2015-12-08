// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzlk;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdOverlayInfoParcel, zza

public class zzd
{

    public zzd()
    {
    }

    public void zza(Context context, AdOverlayInfoParcel adoverlayinfoparcel)
    {
        zza(context, adoverlayinfoparcel, true);
    }

    public void zza(Context context, AdOverlayInfoParcel adoverlayinfoparcel, boolean flag)
    {
        if (adoverlayinfoparcel.zzzK == 4 && adoverlayinfoparcel.zzzD == null)
        {
            if (adoverlayinfoparcel.zzzC != null)
            {
                adoverlayinfoparcel.zzzC.onAdClicked();
            }
            zzo.zzbs().zza(context, adoverlayinfoparcel.zzzB, adoverlayinfoparcel.zzzJ);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adoverlayinfoparcel.zzpJ.zzGJ);
        intent.putExtra("shouldCallOnOverlayOpened", flag);
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zza(intent, adoverlayinfoparcel);
        if (!zzlk.isAtLeastL())
        {
            intent.addFlags(0x80000);
        }
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }
}
