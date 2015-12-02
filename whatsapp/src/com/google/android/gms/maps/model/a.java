// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, cameraposition.getVersionCode());
        b.a(parcel, 2, cameraposition.target, i, false);
        b.a(parcel, 3, cameraposition.zoom);
        b.a(parcel, 4, cameraposition.tilt);
        b.a(parcel, 5, cameraposition.bearing);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return da(parcel);
    }

    public CameraPosition da(Parcel parcel)
    {
        float f;
        float f1;
        float f2;
        LatLng latlng;
        int i;
        int i1;
        int j1;
        j1 = LatLng.a;
        i1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        f1 = 0.0F;
        f2 = 0.0F;
        latlng = null;
        i = 0;
        f = 0.0F;
_L21:
        if (parcel.dataPosition() >= i1) goto _L2; else goto _L1
_L1:
        float f3;
        LatLng latlng1;
        LatLng latlng2;
        int j;
        int k;
        int l;
        int k1;
        k1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        j = i;
        latlng1 = latlng;
        k = i;
        latlng2 = latlng;
        l = i;
        f3 = f;
        com.google.android.gms.common.internal.safeparcel.a.aH(k1);
        JVM INSTR tableswitch 1 5: default 100
    //                   1 165
    //                   2 185
    //                   3 219
    //                   4 253
    //                   5 326;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        f3 = f1;
        f1 = f;
        f = f3;
_L19:
        if (j1 == 0) goto _L10; else goto _L9
_L9:
        f3 = f;
        f = f1;
          goto _L11
_L4:
        j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
        i = j;
        f3 = f;
        if (j1 == 0) goto _L12; else goto _L5
_L5:
        latlng1 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, LatLng.CREATOR);
        latlng = latlng1;
        i = j;
        f3 = f;
        if (j1 == 0) goto _L12; else goto _L13
_L13:
        k = j;
_L6:
        f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
        latlng = latlng1;
        i = k;
        f3 = f;
        if (j1 == 0) goto _L12; else goto _L14
_L14:
        f3 = f;
        l = k;
        latlng2 = latlng1;
_L7:
        latlng = latlng2;
        f2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
        if (j1 == 0) goto _L16; else goto _L15
_L15:
        i = l;
        f1 = f3;
_L20:
        f3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
        if (j1 == 0) goto _L18; else goto _L17
_L17:
        f = f1;
        f1 = f3;
          goto _L3
_L11:
        try
        {
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        return new CameraPosition(i, latlng, f, f2, f3);
_L12:
        f = f1;
        f1 = f3;
          goto _L19
_L8:
        f1 = f;
          goto _L20
_L2:
        f3 = f1;
          goto _L11
_L10:
        f3 = f;
        f = f1;
        f1 = f3;
          goto _L21
_L18:
        f = f3;
          goto _L19
_L16:
        i = l;
        f = f1;
        f1 = f3;
          goto _L19
    }

    public CameraPosition[] eW(int i)
    {
        return new CameraPosition[i];
    }

    public Object[] newArray(int i)
    {
        return eW(i);
    }
}
