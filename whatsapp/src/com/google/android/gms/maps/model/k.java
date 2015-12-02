// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.GoogleMap;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng, MarkerOptions

public class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int j;
        int l;
        boolean flag;
        flag = false;
        j = com.google.android.gms.maps.model.LatLng.a;
        l = b.H(parcel);
        b.c(parcel, 1, markeroptions.getVersionCode());
        b.a(parcel, 2, markeroptions.getPosition(), i, false);
        b.a(parcel, 3, markeroptions.getTitle(), false);
        b.a(parcel, 4, markeroptions.getSnippet(), false);
        b.a(parcel, 5, markeroptions.oe(), false);
        b.a(parcel, 6, markeroptions.getAnchorU());
        b.a(parcel, 7, markeroptions.getAnchorV());
        b.a(parcel, 8, markeroptions.isDraggable());
        b.a(parcel, 9, markeroptions.isVisible());
        b.a(parcel, 10, markeroptions.isFlat());
        b.a(parcel, 11, markeroptions.getRotation());
        b.a(parcel, 12, markeroptions.getInfoWindowAnchorU());
        b.a(parcel, 13, markeroptions.getInfoWindowAnchorV());
        b.a(parcel, 14, markeroptions.getAlpha());
        b.H(parcel, l);
        if (j != 0)
        {
            boolean flag1;
            try
            {
                flag1 = GoogleMap.a;
            }
            // Misplaced declaration of an exception variable
            catch (MarkerOptions markeroptions)
            {
                throw markeroptions;
            }
            if (!flag1)
            {
                flag = true;
            }
            GoogleMap.a = flag;
        }
        return;
        markeroptions;
        throw markeroptions;
    }

    public Object createFromParcel(Parcel parcel)
    {
        return df(parcel);
    }

    public MarkerOptions df(Parcel parcel)
    {
        float f;
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int i;
        int k1;
        int l1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        l1 = com.google.android.gms.maps.model.LatLng.a;
        k1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        obj1 = null;
        obj2 = null;
        obj3 = null;
        f1 = 0.0F;
        f2 = 0.0F;
        flag = false;
        flag1 = false;
        flag2 = false;
        f3 = 0.0F;
        f4 = 0.5F;
        f5 = 0.0F;
        obj = null;
        i = 0;
        f = 1.0F;
_L17:
        Object obj4;
        Object obj6;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        int j;
        int l;
        int i1;
        int j1;
        int i2;
        if (parcel.dataPosition() >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        i2 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        j = i;
        obj6 = obj;
        l = i;
        obj8 = obj;
        obj9 = obj1;
        i1 = i;
        obj4 = obj;
        obj11 = obj2;
        obj10 = obj1;
        j1 = i;
        com.google.android.gms.common.internal.safeparcel.a.aH(i2);
        JVM INSTR tableswitch 1 14: default 184
    //                   1 236
    //                   2 261
    //                   3 300
    //                   4 337
    //                   5 378
    //                   6 677
    //                   7 704
    //                   8 707
    //                   9 710
    //                   10 713
    //                   11 716
    //                   12 719
    //                   13 722
    //                   14 725;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        float f6;
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, i2);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
_L25:
        if (l1 == 0) goto _L17; else goto _L16
_L2:
        j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i2);
        obj10 = obj2;
        obj4 = obj1;
        i = j;
        if (l1 == 0) goto _L18; else goto _L3
_L3:
        obj6 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i2, LatLng.CREATOR);
        obj = obj6;
        obj10 = obj2;
        obj4 = obj1;
        i = j;
        if (l1 == 0) goto _L18; else goto _L19
_L19:
        l = j;
_L4:
        obj9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i2);
        obj = obj6;
        obj10 = obj2;
        obj4 = obj9;
        i = l;
        if (l1 == 0) goto _L18; else goto _L20
_L20:
        i1 = l;
        obj8 = obj6;
_L5:
        obj11 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i2);
        obj = obj8;
        obj10 = obj11;
        obj4 = obj9;
        i = i1;
        if (l1 == 0) goto _L18; else goto _L21
_L21:
        j1 = i1;
        obj10 = obj9;
        obj4 = obj8;
_L6:
        obj1 = obj11;
        obj2 = obj10;
        obj3 = obj4;
        obj = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i2);
        obj4 = obj;
        obj6 = obj1;
        obj8 = obj2;
        obj9 = obj3;
        j = j1;
        if (l1 == 0) goto _L23; else goto _L22
_L22:
        i = j1;
_L29:
        f6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i2);
        obj4 = obj;
        obj6 = obj1;
        obj8 = obj2;
        obj9 = obj3;
        j = i;
        f1 = f6;
        if (l1 == 0) goto _L23; else goto _L24
_L24:
        obj4 = obj1;
        obj6 = obj;
        f1 = f6;
        obj = obj3;
        obj1 = obj2;
        obj2 = obj4;
        obj3 = obj6;
_L8:
        f2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i2);
        if (l1 == 0) goto _L25; else goto _L9
_L9:
        flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i2);
        if (l1 == 0) goto _L25; else goto _L10
_L10:
        flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i2);
        if (l1 == 0) goto _L25; else goto _L11
_L11:
        flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i2);
        if (l1 == 0) goto _L25; else goto _L12
_L12:
        f3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i2);
        if (l1 == 0) goto _L25; else goto _L13
_L13:
        f4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i2);
        if (l1 == 0) goto _L25; else goto _L14
_L14:
        f5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i2);
        if (l1 == 0) goto _L25; else goto _L26
_L26:
        f = f5;
_L30:
        f6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i2);
        if (l1 == 0) goto _L28; else goto _L27
_L27:
        f5 = f;
        f = f6;
          goto _L1
_L16:
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
        return new MarkerOptions(i, ((LatLng) (obj)), ((String) (obj1)), ((String) (obj2)), ((android.os.IBinder) (obj3)), f1, f2, flag, flag1, flag2, f3, f4, f5, f);
_L23:
        i = j;
        obj = obj9;
        obj1 = obj8;
        obj2 = obj6;
        obj3 = obj4;
          goto _L25
_L18:
        obj2 = obj10;
        obj1 = obj4;
          goto _L25
_L7:
        Object obj5 = obj1;
        Object obj7 = obj;
        obj = obj3;
        obj1 = obj2;
        obj2 = obj5;
        obj3 = obj7;
          goto _L29
_L15:
        f = f5;
          goto _L30
_L28:
        f5 = f;
        f = f6;
          goto _L25
    }

    public MarkerOptions[] fb(int i)
    {
        return new MarkerOptions[i];
    }

    public Object[] newArray(int i)
    {
        return fb(i);
    }
}
