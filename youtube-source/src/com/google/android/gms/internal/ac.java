// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            b, dn

public final class ac
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    public final String eJ;
    public final boolean eK;
    public final ac eL[];
    public final int height;
    public final int heightPixels;
    public final int versionCode;
    public final int width;
    public final int widthPixels;

    public ac()
    {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    ac(int i, String s, int j, int k, boolean flag, int l, int i1, 
            ac aac[])
    {
        versionCode = i;
        eJ = s;
        height = j;
        heightPixels = k;
        eK = flag;
        width = l;
        widthPixels = i1;
        eL = aac;
    }

    public ac(Context context, c c1)
    {
        this(context, new c[] {
            c1
        });
    }

    public ac(Context context, c ac1[])
    {
        boolean flag1 = false;
        super();
        c c1 = ac1[0];
        versionCode = 2;
        eK = false;
        width = c1.b();
        height = c1.a();
        DisplayMetrics displaymetrics;
        int i;
        boolean flag;
        int j;
        int k;
        if (width == -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (height == -2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        displaymetrics = context.getResources().getDisplayMetrics();
        if (i != 0)
        {
            widthPixels = a(displaymetrics);
            j = (int)((float)widthPixels / displaymetrics.density);
        } else
        {
            j = width;
            widthPixels = dn.a(displaymetrics, width);
        }
        if (flag)
        {
            k = c(displaymetrics);
        } else
        {
            k = height;
        }
        heightPixels = dn.a(displaymetrics, k);
        if (i != 0 || flag)
        {
            eJ = (new StringBuilder()).append(j).append("x").append(k).append("_as").toString();
        } else
        {
            eJ = c1.toString();
        }
        if (ac1.length > 1)
        {
            eL = new ac[ac1.length];
            for (i = ((flag1) ? 1 : 0); i < ac1.length; i++)
            {
                eL[i] = new ac(context, ac1[i]);
            }

        } else
        {
            eL = null;
        }
    }

    public ac(ac ac1, ac aac[])
    {
        this(2, ac1.eJ, ac1.height, ac1.heightPixels, ac1.eK, ac1.width, ac1.widthPixels, aac);
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
        int i = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (i <= 400)
        {
            return 32;
        }
        return i > 720 ? 90 : 50;
    }

    public final c P()
    {
        return d.a(width, height, eJ);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.internal.b.a(this, parcel, i);
    }

}
