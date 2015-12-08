// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzcs, zzcr

public class zzda extends zzcv.zza
{

    private final com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener zzwF;

    public zzda(com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener oncustomclicklistener)
    {
        zzwF = oncustomclicklistener;
    }

    public void zza(zzcr zzcr, String s)
    {
        zzwF.onCustomClick(new zzcs(zzcr), s);
    }
}
