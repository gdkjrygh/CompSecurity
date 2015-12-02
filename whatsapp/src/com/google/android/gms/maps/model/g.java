// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(LatLngBounds latlngbounds, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, latlngbounds.getVersionCode());
        b.a(parcel, 2, latlngbounds.southwest, i, false);
        b.a(parcel, 3, latlngbounds.northeast, i, false);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dd(parcel);
    }

    public LatLngBounds dd(Parcel parcel)
    {
        LatLng latlng;
        LatLng latlng1;
        int i;
        int l;
        int i1;
        latlng = null;
        i1 = com.google.android.gms.maps.model.LatLng.a;
        l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        i = 0;
        latlng1 = null;
_L16:
        if (parcel.dataPosition() >= l) goto _L2; else goto _L1
_L1:
        LatLng latlng2;
        int j;
        int k;
        int j1;
        j1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        j = i;
        latlng2 = latlng;
        k = i;
        com.google.android.gms.common.internal.safeparcel.a.aH(j1);
        JVM INSTR tableswitch 1 3: default 76
    //                   1 141
    //                   2 158
    //                   3 188;
           goto _L3 _L4 _L5 _L6
_L3:
        latlng2 = latlng1;
        latlng1 = latlng;
        latlng = latlng2;
_L14:
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
_L13:
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        latlng2 = latlng1;
        latlng1 = latlng;
          goto _L9
_L4:
        j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
        i = j;
        if (i1 == 0) goto _L10; else goto _L5
_L5:
        latlng2 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LatLng.CREATOR);
        latlng = latlng2;
        i = j;
        if (i1 == 0) goto _L10; else goto _L11
_L11:
        k = j;
_L6:
        latlng4 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LatLng.CREATOR);
        latlng = latlng4;
        latlng1 = latlng2;
        i = k;
        if (i1 == 0) goto _L13; else goto _L12
_L12:
        latlng = latlng4;
        latlng1 = latlng2;
        i = k;
          goto _L14
_L9:
        LatLng latlng4;
        try
        {
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        return new LatLngBounds(i, latlng2, latlng1);
_L10:
        latlng2 = latlng;
        latlng = latlng1;
        latlng1 = latlng2;
          goto _L13
_L2:
        latlng2 = latlng;
          goto _L9
_L8:
        LatLng latlng3 = latlng;
        latlng = latlng1;
        latlng1 = latlng3;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public LatLngBounds[] eZ(int i)
    {
        return new LatLngBounds[i];
    }

    public Object[] newArray(int i)
    {
        return eZ(i);
    }
}
