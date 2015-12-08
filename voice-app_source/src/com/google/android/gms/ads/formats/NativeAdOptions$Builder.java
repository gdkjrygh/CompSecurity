// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;


// Referenced classes of package com.google.android.gms.ads.formats:
//            NativeAdOptions

public static final class zznU
{

    private boolean zznS;
    private int zznT;
    private boolean zznU;

    static boolean zza(zznU zznu)
    {
        return zznu.zznS;
    }

    static int zzb(zznS zzns)
    {
        return zzns.zznT;
    }

    static boolean zzc(zznT zznt)
    {
        return zznt.zznU;
    }

    public NativeAdOptions build()
    {
        return new NativeAdOptions(this, null);
    }

    public zznU setImageOrientation(int i)
    {
        zznT = i;
        return this;
    }

    public zznT setRequestMultipleImages(boolean flag)
    {
        zznU = flag;
        return this;
    }

    public zznU setReturnUrlsForImageAssets(boolean flag)
    {
        zznS = flag;
        return this;
    }

    public ()
    {
        zznS = false;
        zznT = 0;
        zznU = false;
    }
}
