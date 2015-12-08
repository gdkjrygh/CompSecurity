// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzh, zzk

public final class AdSizeParcel
    implements SafeParcelable
{

    public static final zzh CREATOR = new zzh();
    public final int height;
    public final int heightPixels;
    public final int versionCode;
    public final int width;
    public final int widthPixels;
    public final String zzsG;
    public final boolean zzsH;
    public final AdSizeParcel zzsI[];
    public final boolean zzsJ;

    public AdSizeParcel()
    {
        this(3, "interstitial_mb", 0, 0, true, 0, 0, null, false);
    }

    AdSizeParcel(int i, String s, int j, int k, boolean flag, int l, int i1, 
            AdSizeParcel aadsizeparcel[], boolean flag1)
    {
        versionCode = i;
        zzsG = s;
        height = j;
        heightPixels = k;
        zzsH = flag;
        width = l;
        widthPixels = i1;
        zzsI = aadsizeparcel;
        zzsJ = flag1;
    }

    public AdSizeParcel(Context context, AdSize adsize)
    {
        this(context, new AdSize[] {
            adsize
        });
    }

    public AdSizeParcel(Context context, AdSize aadsize[])
    {
        AdSize adsize = aadsize[0];
        versionCode = 3;
        zzsH = false;
        width = adsize.getWidth();
        height = adsize.getHeight();
        DisplayMetrics displaymetrics;
        int i;
        boolean flag;
        boolean flag1;
        int j;
        if (width == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (height == -2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        displaymetrics = context.getResources().getDisplayMetrics();
        if (flag)
        {
            double d;
            if (zzk.zzcE().zzS(context) && zzk.zzcE().zzT(context))
            {
                widthPixels = zza(displaymetrics) - zzk.zzcE().zzU(context);
            } else
            {
                widthPixels = zza(displaymetrics);
            }
            d = (float)widthPixels / displaymetrics.density;
            j = (int)d;
            i = j;
            if (d - (double)(int)d >= 0.01D)
            {
                i = j + 1;
            }
        } else
        {
            i = width;
            widthPixels = zzk.zzcE().zza(displaymetrics, width);
        }
        if (flag1)
        {
            j = zzc(displaymetrics);
        } else
        {
            j = height;
        }
        heightPixels = zzk.zzcE().zza(displaymetrics, j);
        if (flag || flag1)
        {
            zzsG = (new StringBuilder()).append(i).append("x").append(j).append("_as").toString();
        } else
        {
            zzsG = adsize.toString();
        }
        if (aadsize.length > 1)
        {
            zzsI = new AdSizeParcel[aadsize.length];
            for (i = 0; i < aadsize.length; i++)
            {
                zzsI[i] = new AdSizeParcel(context, aadsize[i]);
            }

        } else
        {
            zzsI = null;
        }
        zzsJ = false;
    }

    public AdSizeParcel(AdSizeParcel adsizeparcel, AdSizeParcel aadsizeparcel[])
    {
        this(3, adsizeparcel.zzsG, adsizeparcel.height, adsizeparcel.heightPixels, adsizeparcel.zzsH, adsizeparcel.width, adsizeparcel.widthPixels, aadsizeparcel, adsizeparcel.zzsJ);
    }

    public static int zza(DisplayMetrics displaymetrics)
    {
        return displaymetrics.widthPixels;
    }

    public static int zzb(DisplayMetrics displaymetrics)
    {
        return (int)((float)zzc(displaymetrics) * displaymetrics.density);
    }

    private static int zzc(DisplayMetrics displaymetrics)
    {
        int i = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (i <= 400)
        {
            return 32;
        }
        return i > 720 ? 90 : 50;
    }

    public static AdSizeParcel zzcB()
    {
        return new AdSizeParcel(3, "reward_mb", 0, 0, false, 0, 0, null, false);
    }

    public static AdSizeParcel zzs(Context context)
    {
        return new AdSizeParcel(3, "320x50_mb", 0, 0, false, 0, 0, null, true);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.ads.internal.client.zzh.zza(this, parcel, i);
    }

    public AdSize zzcC()
    {
        return com.google.android.gms.ads.zza.zza(width, height, zzsG);
    }

}
