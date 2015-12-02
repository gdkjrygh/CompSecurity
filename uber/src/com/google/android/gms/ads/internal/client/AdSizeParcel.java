// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kk;
import kv;
import kx;
import oe;
import pe;

public final class AdSizeParcel
    implements SafeParcelable
{

    public static final kv CREATOR = new kv();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final AdSizeParcel h[];
    public final boolean i;

    public AdSizeParcel()
    {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null, false);
    }

    public AdSizeParcel(int j, String s, int k, int l, boolean flag, int i1, int j1, 
            AdSizeParcel aadsizeparcel[], boolean flag1)
    {
        a = j;
        b = s;
        c = k;
        d = l;
        e = flag;
        f = i1;
        g = j1;
        h = aadsizeparcel;
        i = flag1;
    }

    public AdSizeParcel(Context context, kk kk1)
    {
        this(context, new kk[] {
            kk1
        });
    }

    public AdSizeParcel(Context context, kk akk[])
    {
        kk kk1;
        DisplayMetrics displaymetrics;
        int k;
        kk1 = akk[0];
        a = 2;
        e = false;
        f = kk1.b();
        c = kk1.a();
        int j;
        boolean flag;
        if (f == -1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (c == -2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        displaymetrics = context.getResources().getDisplayMetrics();
        if (j == 0) goto _L2; else goto _L1
_L1:
        kx.a();
        if (!oe.c(context)) goto _L4; else goto _L3
_L3:
        kx.a();
        if (!oe.d(context)) goto _L4; else goto _L5
_L5:
        k = a(displaymetrics);
        kx.a();
        g = k - oe.e(context);
_L8:
        k = (int)((float)g / displaymetrics.density);
          goto _L6
_L4:
        g = a(displaymetrics);
        continue; /* Loop/switch isn't completed */
_L2:
        k = f;
        kx.a();
        g = oe.a(displaymetrics, f);
_L6:
        int l;
        if (flag)
        {
            l = c(displaymetrics);
        } else
        {
            l = c;
        }
        kx.a();
        d = oe.a(displaymetrics, l);
        if (j != 0 || flag)
        {
            b = (new StringBuilder()).append(k).append("x").append(l).append("_as").toString();
        } else
        {
            b = kk1.toString();
        }
        if (akk.length > 1)
        {
            h = new AdSizeParcel[akk.length];
            for (j = 0; j < akk.length; j++)
            {
                h[j] = new AdSizeParcel(context, akk[j]);
            }

        } else
        {
            h = null;
        }
        i = false;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public AdSizeParcel(AdSizeParcel adsizeparcel, AdSizeParcel aadsizeparcel[])
    {
        this(2, adsizeparcel.b, adsizeparcel.c, adsizeparcel.d, adsizeparcel.e, adsizeparcel.f, adsizeparcel.g, aadsizeparcel, adsizeparcel.i);
    }

    public static int a(DisplayMetrics displaymetrics)
    {
        return displaymetrics.widthPixels;
    }

    public static int b(DisplayMetrics displaymetrics)
    {
        return (int)((float)c(displaymetrics) * displaymetrics.density);
    }

    private static int c(DisplayMetrics displaymetrics)
    {
        int j = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (j <= 400)
        {
            return 32;
        }
        return j > 720 ? 90 : 50;
    }

    public final kk a()
    {
        return pe.a(f, c, b);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        kv.a(this, parcel, j);
    }

}
