// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaOrientation, LatLng

public class t
    implements android.os.Parcelable.Creator
{

    public t()
    {
    }

    static void a(StreetViewPanoramaOrientation streetviewpanoramaorientation, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, streetviewpanoramaorientation.getVersionCode());
        b.a(parcel, 2, streetviewpanoramaorientation.tilt);
        b.a(parcel, 3, streetviewpanoramaorientation.bearing);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dl(parcel);
    }

    public StreetViewPanoramaOrientation dl(Parcel parcel)
    {
        float f;
        float f2;
        int i;
        int i1;
        int j1;
        f2 = 0.0F;
        i1 = com.google.android.gms.maps.model.LatLng.a;
        j1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        i = 0;
        f = 0.0F;
_L6:
        float f1;
        float f3;
        float f4;
        int j;
        int k;
        int l;
        int k1;
        f3 = f2;
        f1 = f;
        j = i;
        if (parcel.dataPosition() >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        k = i;
        f4 = f;
        l = i;
        com.google.android.gms.common.internal.safeparcel.a.aH(k1);
        JVM INSTR tableswitch 1 3: default 88
    //                   1 160
    //                   2 183
    //                   3 211;
           goto _L1 _L2 _L3 _L4
_L1:
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        j = i;
        f1 = f;
        f3 = f2;
_L7:
        f2 = f3;
        f = f1;
        i = j;
        if (i1 == 0) goto _L6; else goto _L5
_L2:
        k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
        f3 = f2;
        f1 = f;
        j = k;
        if (i1 == 0) goto _L7; else goto _L3
_L3:
        f4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
        f3 = f2;
        f1 = f4;
        j = k;
        if (i1 == 0) goto _L7; else goto _L8
_L8:
        l = k;
_L4:
        f2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
        f3 = f2;
        f1 = f4;
        j = l;
        if (i1 == 0) goto _L7; else goto _L9
_L9:
        f = f4;
        i = l;
          goto _L1
_L5:
        try
        {
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j1).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        return new StreetViewPanoramaOrientation(j, f1, f3);
    }

    public StreetViewPanoramaOrientation[] fh(int i)
    {
        return new StreetViewPanoramaOrientation[i];
    }

    public Object[] newArray(int i)
    {
        return fh(i);
    }
}
