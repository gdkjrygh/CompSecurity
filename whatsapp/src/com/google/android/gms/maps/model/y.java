// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            VisibleRegion, LatLng, LatLngBounds

public class y
    implements android.os.Parcelable.Creator
{

    public y()
    {
    }

    static void a(VisibleRegion visibleregion, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, visibleregion.getVersionCode());
        b.a(parcel, 2, visibleregion.nearLeft, i, false);
        b.a(parcel, 3, visibleregion.nearRight, i, false);
        b.a(parcel, 4, visibleregion.farLeft, i, false);
        b.a(parcel, 5, visibleregion.farRight, i, false);
        b.a(parcel, 6, visibleregion.latLngBounds, i, false);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return _mthdo(parcel);
    }

    public VisibleRegion _mthdo(Parcel parcel)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        int l;
        int i1;
        obj = null;
        i1 = com.google.android.gms.maps.model.LatLng.a;
        l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        obj3 = null;
        obj4 = null;
        obj2 = null;
        i = 0;
        obj1 = null;
_L21:
        if (parcel.dataPosition() >= l) goto _L2; else goto _L1
_L1:
        Object obj5;
        int j;
        int k;
        int j1;
        j1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        j = i;
        obj5 = obj;
        k = i;
        com.google.android.gms.common.internal.safeparcel.a.aH(j1);
        JVM INSTR tableswitch 1 6: default 96
    //                   1 180
    //                   2 197
    //                   3 227
    //                   4 443
    //                   5 446
    //                   6 449;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        Object obj8;
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        obj5 = obj3;
        obj8 = obj4;
        obj4 = obj;
        obj = obj1;
        obj3 = obj2;
        obj2 = obj8;
        obj1 = obj5;
_L20:
        if (i1 == 0) goto _L11; else goto _L10
_L10:
        obj5 = obj1;
        obj1 = obj;
        obj = obj3;
          goto _L12
_L4:
        j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
        i = j;
        if (i1 == 0) goto _L13; else goto _L5
_L5:
        obj5 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LatLng.CREATOR);
        obj = obj5;
        i = j;
        if (i1 == 0) goto _L13; else goto _L14
_L14:
        k = j;
_L6:
        obj = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LatLng.CREATOR);
        if (i1 == 0) goto _L16; else goto _L15
_L15:
        i = k;
        obj2 = obj;
        obj = obj5;
_L7:
        obj4 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LatLng.CREATOR);
        if (i1 == 0) goto _L17; else goto _L8
_L8:
        obj3 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LatLng.CREATOR);
        if (i1 == 0) goto _L18; else goto _L9
_L9:
        obj1 = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LatLngBounds.CREATOR);
        if (i1 == 0) goto _L19; else goto _L3
_L12:
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
        return new VisibleRegion(i, ((LatLng) (obj4)), ((LatLng) (obj)), ((LatLng) (obj2)), ((LatLng) (obj5)), ((LatLngBounds) (obj1)));
_L18:
        obj5 = obj2;
        Object obj9 = obj;
        obj2 = obj4;
        obj = obj1;
        obj1 = obj3;
        obj3 = obj5;
        obj4 = obj9;
          goto _L20
_L17:
        obj5 = obj;
        Object obj10 = obj2;
        obj = obj1;
        obj1 = obj3;
        obj2 = obj4;
        obj3 = obj10;
        obj4 = obj5;
          goto _L20
_L16:
        obj2 = obj4;
        obj4 = obj;
        obj = obj1;
        obj1 = obj3;
        obj3 = obj4;
        obj4 = obj5;
        i = k;
          goto _L20
_L13:
        obj5 = obj2;
        Object obj11 = obj;
        obj = obj1;
        obj1 = obj3;
        obj2 = obj4;
        obj3 = obj5;
        obj4 = obj11;
          goto _L20
_L2:
        obj5 = obj4;
        obj4 = obj;
        obj = obj2;
        obj2 = obj5;
        obj5 = obj3;
          goto _L12
_L11:
        Object obj6 = obj3;
        obj3 = obj1;
        obj1 = obj;
        obj = obj4;
        obj4 = obj2;
        obj2 = obj6;
          goto _L21
_L19:
        Object obj7 = obj2;
        Object obj12 = obj;
        obj = obj1;
        obj1 = obj3;
        obj2 = obj4;
        obj3 = obj7;
        obj4 = obj12;
          goto _L20
    }

    public VisibleRegion[] fk(int i)
    {
        return new VisibleRegion[i];
    }

    public Object[] newArray(int i)
    {
        return fk(i);
    }
}
