// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(LatLng latlng, Parcel parcel, int j)
    {
        j = b.H(parcel);
        b.c(parcel, 1, latlng.getVersionCode());
        b.a(parcel, 2, latlng.latitude);
        b.a(parcel, 3, latlng.longitude);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return de(parcel);
    }

    public LatLng de(Parcel parcel)
    {
        double d;
        double d2;
        int j;
        int j1;
        int k1;
        d2 = 0.0D;
        j1 = com.google.android.gms.maps.model.LatLng.a;
        k1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        j = 0;
        d = 0.0D;
_L6:
        double d1;
        double d3;
        double d4;
        int k;
        int l;
        int i1;
        int l1;
        d3 = d2;
        d1 = d;
        k = j;
        if (parcel.dataPosition() >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        l = j;
        d4 = d;
        i1 = j;
        com.google.android.gms.common.internal.safeparcel.a.aH(l1);
        JVM INSTR tableswitch 1 3: default 88
    //                   1 162
    //                   2 186
    //                   3 215;
           goto _L1 _L2 _L3 _L4
_L1:
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, l1);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        k = j;
        d1 = d;
        d3 = d2;
_L7:
        d2 = d3;
        d = d1;
        j = k;
        if (j1 == 0) goto _L6; else goto _L5
_L2:
        l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
        d3 = d2;
        d1 = d;
        k = l;
        if (j1 == 0) goto _L7; else goto _L3
_L3:
        d4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
        d3 = d2;
        d1 = d4;
        k = l;
        if (j1 == 0) goto _L7; else goto _L8
_L8:
        i1 = l;
_L4:
        d2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l1);
        d3 = d2;
        d1 = d4;
        k = i1;
        if (j1 == 0) goto _L7; else goto _L9
_L9:
        d = d4;
        j = i1;
          goto _L1
_L5:
        try
        {
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k1).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        return new LatLng(k, d1, d3);
    }

    public LatLng[] fa(int j)
    {
        return new LatLng[j];
    }

    public Object[] newArray(int j)
    {
        return fa(j);
    }
}
