// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaOptions, MapView

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(StreetViewPanoramaOptions streetviewpanoramaoptions, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, streetviewpanoramaoptions.getVersionCode());
        b.a(parcel, 2, streetviewpanoramaoptions.getStreetViewPanoramaCamera(), i, false);
        b.a(parcel, 3, streetviewpanoramaoptions.getPanoramaId(), false);
        b.a(parcel, 4, streetviewpanoramaoptions.getPosition(), i, false);
        b.a(parcel, 5, streetviewpanoramaoptions.getRadius(), false);
        b.a(parcel, 6, streetviewpanoramaoptions.nS());
        b.a(parcel, 7, streetviewpanoramaoptions.nI());
        b.a(parcel, 8, streetviewpanoramaoptions.nT());
        b.a(parcel, 9, streetviewpanoramaoptions.nU());
        b.a(parcel, 10, streetviewpanoramaoptions.nE());
        b.H(parcel, j);
    }

    public StreetViewPanoramaOptions cY(Parcel parcel)
    {
        byte byte0;
        byte byte1;
        byte byte2;
        byte byte3;
        byte byte4;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int i;
        int i1;
        int j1;
        j1 = com.google.android.gms.maps.MapView.a;
        i1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        obj1 = null;
        obj2 = null;
        obj3 = null;
        byte1 = 0;
        byte2 = 0;
        byte3 = 0;
        byte4 = 0;
        obj = null;
        i = 0;
        byte0 = 0;
_L13:
        Object obj4;
        Object obj6;
        Object obj8;
        int j;
        int k;
        int l;
        int k1;
        if (parcel.dataPosition() >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        j = i;
        obj6 = obj;
        k = i;
        obj8 = obj;
        obj4 = obj1;
        l = i;
        com.google.android.gms.common.internal.safeparcel.a.aH(k1);
        JVM INSTR tableswitch 1 10: default 136
    //                   1 188
    //                   2 209
    //                   3 244
    //                   4 281
    //                   5 592
    //                   6 550
    //                   7 577
    //                   8 580
    //                   9 583
    //                   10 586;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        byte byte5;
        Object obj9;
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
_L22:
        if (j1 == 0) goto _L13; else goto _L12
_L2:
        j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
        obj4 = obj1;
        i = j;
        if (j1 == 0) goto _L14; else goto _L3
_L3:
        obj6 = (StreetViewPanoramaCamera)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, StreetViewPanoramaCamera.CREATOR);
        obj = obj6;
        obj4 = obj1;
        i = j;
        if (j1 == 0) goto _L14; else goto _L15
_L15:
        k = j;
_L4:
        obj1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k1);
        obj = obj6;
        obj4 = obj1;
        i = k;
        if (j1 == 0) goto _L14; else goto _L16
_L16:
        l = k;
        obj4 = obj1;
        obj8 = obj6;
_L5:
        obj1 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, LatLng.CREATOR);
        if (j1 == 0) goto _L18; else goto _L17
_L17:
        obj3 = obj8;
        obj2 = obj4;
        i = l;
_L27:
        obj = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k1);
        obj4 = obj;
        obj6 = obj1;
        obj8 = obj2;
        obj9 = obj3;
        j = i;
        if (j1 == 0) goto _L20; else goto _L19
_L19:
        byte5 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k1);
        obj4 = obj;
        obj6 = obj1;
        obj8 = obj2;
        obj9 = obj3;
        j = i;
        byte1 = byte5;
        if (j1 == 0) goto _L20; else goto _L21
_L21:
        obj4 = obj1;
        obj6 = obj;
        byte1 = byte5;
        obj = obj3;
        obj1 = obj2;
        obj2 = obj4;
        obj3 = obj6;
_L8:
        byte2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k1);
        if (j1 == 0) goto _L22; else goto _L9
_L9:
        byte3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k1);
        if (j1 == 0) goto _L22; else goto _L10
_L10:
        byte4 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k1);
        if (j1 == 0) goto _L22; else goto _L23
_L23:
        byte0 = byte4;
_L26:
        byte5 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k1);
        if (j1 == 0) goto _L25; else goto _L24
_L24:
        byte4 = byte0;
        byte0 = byte5;
          goto _L1
_L12:
        try
        {
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        return new StreetViewPanoramaOptions(i, ((StreetViewPanoramaCamera) (obj)), ((String) (obj1)), ((LatLng) (obj2)), ((Integer) (obj3)), byte1, byte2, byte3, byte4, byte0);
_L20:
        i = j;
        obj = obj9;
        obj1 = obj8;
        obj2 = obj6;
        obj3 = obj4;
          goto _L22
_L18:
        i = l;
        obj = obj8;
        obj2 = obj1;
        obj1 = obj4;
          goto _L22
_L14:
        obj1 = obj4;
          goto _L22
_L7:
        Object obj5 = obj1;
        Object obj7 = obj;
        obj = obj3;
        obj1 = obj2;
        obj2 = obj5;
        obj3 = obj7;
          goto _L19
_L11:
        byte0 = byte4;
          goto _L26
_L6:
        obj3 = obj1;
        obj1 = obj2;
        obj2 = obj3;
        obj3 = obj;
          goto _L27
_L25:
        byte4 = byte0;
        byte0 = byte5;
          goto _L22
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cY(parcel);
    }

    public StreetViewPanoramaOptions[] eU(int i)
    {
        return new StreetViewPanoramaOptions[i];
    }

    public Object[] newArray(int i)
    {
        return eU(i);
    }
}
