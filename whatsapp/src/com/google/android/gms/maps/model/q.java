// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaCamera, LatLng

public class q
    implements android.os.Parcelable.Creator
{

    public q()
    {
    }

    static void a(StreetViewPanoramaCamera streetviewpanoramacamera, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, streetviewpanoramacamera.getVersionCode());
        b.a(parcel, 2, streetviewpanoramacamera.zoom);
        b.a(parcel, 3, streetviewpanoramacamera.tilt);
        b.a(parcel, 4, streetviewpanoramacamera.bearing);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return di(parcel);
    }

    public StreetViewPanoramaCamera di(Parcel parcel)
    {
        float f;
        float f2;
        float f4;
        int i;
        int j1;
        int k1;
        f4 = 0.0F;
        j1 = com.google.android.gms.maps.model.LatLng.a;
        k1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        f = 0.0F;
        i = 0;
        f2 = 0.0F;
_L7:
        float f1;
        float f3;
        float f5;
        float f6;
        float f7;
        float f8;
        int j;
        int k;
        int l;
        int i1;
        int l1;
        f5 = f4;
        f3 = f2;
        f1 = f;
        j = i;
        if (parcel.dataPosition() >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        k = i;
        f8 = f;
        l = i;
        f7 = f2;
        f6 = f;
        i1 = i;
        com.google.android.gms.common.internal.safeparcel.a.aH(l1);
        JVM INSTR tableswitch 1 4: default 108
    //                   1 188
    //                   2 215
    //                   3 247
    //                   4 283;
           goto _L1 _L2 _L3 _L4 _L5
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
        j = i;
        f1 = f;
        f3 = f2;
        f5 = f4;
_L8:
        f4 = f5;
        f2 = f3;
        f = f1;
        i = j;
        if (j1 == 0) goto _L7; else goto _L6
_L2:
        k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
        f5 = f4;
        f3 = f2;
        f1 = f;
        j = k;
        if (j1 == 0) goto _L8; else goto _L3
_L3:
        f8 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
        f5 = f4;
        f3 = f2;
        f1 = f8;
        j = k;
        if (j1 == 0) goto _L8; else goto _L9
_L9:
        l = k;
_L4:
        f7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
        f5 = f4;
        f3 = f7;
        f1 = f8;
        j = l;
        if (j1 == 0) goto _L8; else goto _L10
_L10:
        i1 = l;
        f6 = f8;
_L5:
        f4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
        f5 = f4;
        f3 = f7;
        f1 = f6;
        j = i1;
        if (j1 == 0) goto _L8; else goto _L11
_L11:
        f2 = f7;
        f = f6;
        i = i1;
          goto _L1
_L6:
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
        return new StreetViewPanoramaCamera(j, f1, f3, f5);
    }

    public StreetViewPanoramaCamera[] fe(int i)
    {
        return new StreetViewPanoramaCamera[i];
    }

    public Object[] newArray(int i)
    {
        return fe(i);
    }
}
