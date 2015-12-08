// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzfb, zzdg, zzip, zzbq, 
//            zzhu, zziq, zzez

public class zzfa extends zzfb
    implements zzdg
{

    private final Context mContext;
    private final zzip zzoL;
    private final WindowManager zzqX;
    private final zzbq zzzN;
    DisplayMetrics zzzO;
    private float zzzP;
    int zzzQ;
    int zzzR;
    private int zzzS;
    int zzzT;
    int zzzU;
    int zzzV;
    int zzzW;

    public zzfa(zzip zzip1, Context context, zzbq zzbq1)
    {
        super(zzip1);
        zzzQ = -1;
        zzzR = -1;
        zzzT = -1;
        zzzU = -1;
        zzzV = -1;
        zzzW = -1;
        zzoL = zzip1;
        mContext = context;
        zzzN = zzbq1;
        zzqX = (WindowManager)context.getSystemService("window");
    }

    private void zzeb()
    {
        zzzO = new DisplayMetrics();
        Display display = zzqX.getDefaultDisplay();
        display.getMetrics(zzzO);
        zzzP = zzzO.density;
        zzzS = display.getRotation();
    }

    private void zzeg()
    {
        int ai[] = new int[2];
        zzoL.getLocationOnScreen(ai);
        zze(zzk.zzcE().zzc(mContext, ai[0]), zzk.zzcE().zzc(mContext, ai[1]));
    }

    private zzez zzej()
    {
        return (new zzez.zza()).zzp(zzzN.zzcV()).zzo(zzzN.zzcW()).zzq(zzzN.zzda()).zzr(zzzN.zzcX()).zzs(zzzN.zzcY()).zzea();
    }

    public void zza(zzip zzip1, Map map)
    {
        zzee();
    }

    public void zze(int i, int j)
    {
        int k;
        if (mContext instanceof Activity)
        {
            k = zzp.zzbx().zzj((Activity)mContext)[0];
        } else
        {
            k = 0;
        }
        zzc(i, j - k, zzzV, zzzW);
        zzoL.zzgS().zzd(i, j);
    }

    void zzec()
    {
        zzzQ = zzk.zzcE().zzb(zzzO, zzzO.widthPixels);
        zzzR = zzk.zzcE().zzb(zzzO, zzzO.heightPixels);
        Activity activity = zzoL.zzgN();
        if (activity == null || activity.getWindow() == null)
        {
            zzzT = zzzQ;
            zzzU = zzzR;
            return;
        } else
        {
            int ai[] = zzp.zzbx().zzg(activity);
            zzzT = zzk.zzcE().zzb(zzzO, ai[0]);
            zzzU = zzk.zzcE().zzb(zzzO, ai[1]);
            return;
        }
    }

    void zzed()
    {
        if (zzoL.zzaN().zzsH)
        {
            zzzV = zzzQ;
            zzzW = zzzR;
            return;
        } else
        {
            zzoL.measure(0, 0);
            zzzV = zzk.zzcE().zzc(mContext, zzoL.getMeasuredWidth());
            zzzW = zzk.zzcE().zzc(mContext, zzoL.getMeasuredHeight());
            return;
        }
    }

    public void zzee()
    {
        zzeb();
        zzec();
        zzed();
        zzeh();
        zzei();
        zzeg();
        zzef();
    }

    void zzef()
    {
        if (zzb.zzM(2))
        {
            zzb.zzaD("Dispatching Ready Event.");
        }
        zzai(zzoL.zzgV().zzIz);
    }

    void zzeh()
    {
        zza(zzzQ, zzzR, zzzT, zzzU, zzzP, zzzS);
    }

    void zzei()
    {
        zzez zzez1 = zzej();
        zzoL.zzb("onDeviceFeaturesReceived", zzez1.toJson());
    }
}
