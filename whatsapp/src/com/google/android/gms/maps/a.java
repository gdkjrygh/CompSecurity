// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            MapView, GoogleMapOptions, GoogleMap

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j;
        int k;
        boolean flag;
        flag = false;
        j = MapView.a;
        k = b.H(parcel);
        b.c(parcel, 1, googlemapoptions.getVersionCode());
        b.a(parcel, 2, googlemapoptions.nD());
        b.a(parcel, 3, googlemapoptions.nE());
        b.c(parcel, 4, googlemapoptions.getMapType());
        b.a(parcel, 5, googlemapoptions.getCamera(), i, false);
        b.a(parcel, 6, googlemapoptions.nF());
        b.a(parcel, 7, googlemapoptions.nG());
        b.a(parcel, 8, googlemapoptions.nH());
        b.a(parcel, 9, googlemapoptions.nI());
        b.a(parcel, 10, googlemapoptions.nJ());
        b.a(parcel, 11, googlemapoptions.nK());
        b.a(parcel, 12, googlemapoptions.nL());
        b.a(parcel, 14, googlemapoptions.nM());
        b.H(parcel, k);
        if (j != 0)
        {
            boolean flag1;
            try
            {
                flag1 = GoogleMap.a;
            }
            // Misplaced declaration of an exception variable
            catch (GoogleMapOptions googlemapoptions)
            {
                throw googlemapoptions;
            }
            if (!flag1)
            {
                flag = true;
            }
            GoogleMap.a = flag;
        }
        return;
        googlemapoptions;
        throw googlemapoptions;
    }

    public GoogleMapOptions cX(Parcel parcel)
    {
        byte byte0;
        byte byte1;
        byte byte2;
        byte byte3;
        byte byte4;
        byte byte5;
        byte byte6;
        byte byte7;
        byte byte8;
        byte byte9;
        CameraPosition cameraposition;
        int i;
        int j;
        int j2;
        int k2;
        k2 = MapView.a;
        j2 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        byte3 = 0;
        byte4 = 0;
        byte5 = 0;
        byte6 = 0;
        byte7 = 0;
        byte8 = 0;
        byte9 = 0;
        cameraposition = null;
        i = 0;
        byte0 = 0;
        byte1 = 0;
        j = 0;
        byte2 = 0;
_L52:
        if (parcel.dataPosition() >= j2) goto _L2; else goto _L1
_L1:
        byte byte10;
        byte byte11;
        byte byte12;
        byte byte13;
        byte byte14;
        byte byte15;
        byte byte16;
        CameraPosition cameraposition2;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2;
        l2 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        k = j;
        byte10 = byte1;
        i2 = j;
        byte14 = byte0;
        byte12 = byte1;
        l = j;
        k1 = i;
        byte15 = byte0;
        byte16 = byte1;
        i1 = j;
        cameraposition2 = cameraposition;
        j1 = i;
        byte11 = byte0;
        byte13 = byte1;
        l1 = j;
        com.google.android.gms.common.internal.safeparcel.a.aH(l2);
        JVM INSTR tableswitch 1 14: default 192
    //                   1 262
    //                   2 298
    //                   3 315
    //                   4 336
    //                   5 384
    //                   6 442
    //                   7 755
    //                   8 764
    //                   9 773
    //                   10 782
    //                   11 791
    //                   12 800
    //                   13 192
    //                   14 809;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L3 _L16
_L3:
        byte10 = byte1;
        byte1 = byte2;
        byte2 = byte10;
_L43:
        byte byte17;
        CameraPosition cameraposition1;
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, l2);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
_L44:
        if (k2 == 0) goto _L18; else goto _L17
_L17:
        byte10 = byte1;
        byte1 = byte0;
        byte0 = byte2;
          goto _L19
_L4:
        l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
        cameraposition1 = cameraposition;
        j = i;
        byte10 = byte0;
        k = l;
        byte17 = byte3;
        if (k2 == 0) goto _L21; else goto _L20
_L20:
        k = l;
_L5:
        byte10 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l2);
        if (k2 == 0) goto _L23; else goto _L22
_L22:
        i2 = k;
_L6:
        byte14 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l2);
        if (k2 == 0) goto _L25; else goto _L24
_L24:
        l = i2;
        byte12 = byte10;
_L7:
        k1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
        cameraposition1 = cameraposition;
        j = k1;
        byte10 = byte14;
        byte1 = byte12;
        k = l;
        byte17 = byte3;
        if (k2 == 0) goto _L21; else goto _L26
_L26:
        i1 = l;
        byte16 = byte12;
        byte15 = byte14;
_L8:
        cameraposition2 = (CameraPosition)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l2, CameraPosition.CREATOR);
        cameraposition1 = cameraposition2;
        j = k1;
        byte10 = byte15;
        byte1 = byte16;
        k = i1;
        byte17 = byte3;
        if (k2 == 0) goto _L21; else goto _L27
_L27:
        l1 = i1;
        byte13 = byte16;
        byte11 = byte15;
        j1 = k1;
_L9:
        byte0 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l2);
        cameraposition1 = cameraposition2;
        j = j1;
        byte10 = byte11;
        byte1 = byte13;
        k = l1;
        byte17 = byte0;
        if (k2 == 0) goto _L21; else goto _L28
_L28:
        j = l1;
        byte4 = byte13;
        i = j1;
        cameraposition = cameraposition2;
        byte1 = byte0;
        byte0 = byte11;
_L45:
        byte10 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l2);
        if (k2 == 0) goto _L30; else goto _L29
_L29:
        byte3 = byte1;
        byte1 = byte10;
        byte5 = byte4;
_L46:
        byte10 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l2);
        if (k2 == 0) goto _L32; else goto _L31
_L31:
        byte4 = byte1;
        byte1 = byte10;
        byte6 = byte5;
_L47:
        byte10 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l2);
        if (k2 == 0) goto _L34; else goto _L33
_L33:
        byte5 = byte1;
        byte1 = byte10;
        byte7 = byte6;
_L48:
        byte10 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l2);
        if (k2 == 0) goto _L36; else goto _L35
_L35:
        byte6 = byte1;
        byte1 = byte10;
        byte8 = byte7;
_L49:
        byte10 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l2);
        if (k2 == 0) goto _L38; else goto _L37
_L37:
        byte7 = byte1;
        byte1 = byte10;
        byte9 = byte8;
_L50:
        byte10 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l2);
        if (k2 == 0) goto _L40; else goto _L39
_L39:
        byte8 = byte1;
        byte1 = byte10;
        byte2 = byte9;
_L51:
        byte10 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l2);
        if (k2 == 0) goto _L42; else goto _L41
_L41:
        byte9 = byte1;
        byte1 = byte10;
          goto _L43
_L19:
        try
        {
            if (parcel.dataPosition() != j2)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(j2).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        return new GoogleMapOptions(j, byte0, byte1, i, cameraposition, byte3, byte4, byte5, byte6, byte7, byte8, byte9, byte10);
_L21:
        byte3 = byte1;
        byte0 = byte10;
        i = j;
        cameraposition = cameraposition1;
        byte1 = byte2;
        byte2 = byte3;
        byte3 = byte17;
        j = k;
          goto _L44
_L25:
        j = i2;
        byte0 = byte14;
        byte1 = byte2;
        byte2 = byte10;
          goto _L44
_L23:
        j = k;
        byte1 = byte2;
        byte2 = byte10;
          goto _L44
_L10:
        byte4 = byte1;
        byte1 = byte3;
          goto _L45
_L11:
        byte5 = byte1;
        byte1 = byte4;
          goto _L46
_L12:
        byte6 = byte1;
        byte1 = byte5;
          goto _L47
_L13:
        byte7 = byte1;
        byte1 = byte6;
          goto _L48
_L14:
        byte8 = byte1;
        byte1 = byte7;
          goto _L49
_L15:
        byte9 = byte1;
        byte1 = byte8;
          goto _L50
_L16:
        byte2 = byte1;
        byte1 = byte9;
          goto _L51
_L2:
        byte10 = byte0;
        byte0 = byte1;
        byte1 = byte10;
        byte10 = byte2;
          goto _L19
_L18:
        byte10 = byte2;
        byte2 = byte1;
        byte1 = byte10;
          goto _L52
_L42:
        byte9 = byte1;
        byte1 = byte10;
          goto _L44
_L40:
        byte8 = byte1;
        byte1 = byte2;
        byte2 = byte9;
        byte9 = byte10;
          goto _L44
_L38:
        byte7 = byte1;
        byte1 = byte2;
        byte2 = byte8;
        byte8 = byte10;
          goto _L44
_L36:
        byte6 = byte1;
        byte1 = byte2;
        byte2 = byte7;
        byte7 = byte10;
          goto _L44
_L34:
        byte5 = byte1;
        byte1 = byte2;
        byte2 = byte6;
        byte6 = byte10;
          goto _L44
_L32:
        byte4 = byte1;
        byte1 = byte2;
        byte2 = byte5;
        byte5 = byte10;
          goto _L44
_L30:
        byte3 = byte1;
        byte1 = byte2;
        byte2 = byte4;
        byte4 = byte10;
          goto _L44
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cX(parcel);
    }

    public GoogleMapOptions[] eT(int i)
    {
        return new GoogleMapOptions[i];
    }

    public Object[] newArray(int i)
    {
        return eT(i);
    }
}
