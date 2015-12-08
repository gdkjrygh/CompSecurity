// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzcs, zzcr

public class zzdb extends zzcw.zza
{

    private final com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzwG;

    public zzdb(com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener oncustomtemplateadloadedlistener)
    {
        zzwG = oncustomtemplateadloadedlistener;
    }

    public void zza(zzcr zzcr)
    {
        zzwG.onCustomTemplateAdLoaded(new zzcs(zzcr));
    }
}
