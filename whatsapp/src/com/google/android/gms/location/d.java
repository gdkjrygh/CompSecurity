// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location:
//            LocationServices, LocationRequest

public class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(LocationRequest locationrequest, Parcel parcel, int i)
    {
        boolean flag = com.google.android.gms.location.LocationServices.a;
        i = b.H(parcel);
        b.c(parcel, 1, locationrequest.mPriority);
        b.c(parcel, 1000, locationrequest.getVersionCode());
        b.a(parcel, 2, locationrequest.agr);
        b.a(parcel, 3, locationrequest.ags);
        b.a(parcel, 4, locationrequest.Wg);
        b.a(parcel, 5, locationrequest.age);
        b.c(parcel, 6, locationrequest.agt);
        b.a(parcel, 7, locationrequest.agu);
        b.a(parcel, 8, locationrequest.agv);
        b.H(parcel, i);
        if (flag)
        {
            com.google.android.gms.location.LocationServices.a.a++;
        }
    }

    public LocationRequest cJ(Parcel parcel)
    {
        float f;
        int i;
        int k;
        int i1;
        int l5;
        long l6;
        long l8;
        long l10;
        long l12;
        boolean flag;
        boolean flag6;
        flag6 = com.google.android.gms.location.LocationServices.a;
        l5 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        k = 0;
        i = 102;
        l6 = 0x36ee80L;
        l8 = 0x927c0L;
        flag = false;
        l10 = 0x7fffffffffffffffL;
        i1 = 0x7fffffff;
        f = 0.0F;
        l12 = 0L;
_L12:
        float f1;
        float f2;
        int j;
        int l;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int i6;
        long l7;
        long l9;
        long l11;
        long l13;
        long l14;
        long l15;
        long l16;
        long l17;
        long l18;
        long l19;
        long l20;
        long l21;
        long l22;
        long l23;
        long l24;
        long l25;
        long l26;
        long l27;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        l13 = l12;
        f1 = f;
        j1 = i1;
        l11 = l10;
        flag1 = flag;
        j = i;
        l9 = l8;
        l7 = l6;
        l = k;
        if (parcel.dataPosition() >= l5)
        {
            break; /* Loop/switch isn't completed */
        }
        i6 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        l1 = i;
        j3 = i;
        k3 = k;
        l3 = i;
        l17 = l6;
        i4 = k;
        j4 = i;
        l23 = l8;
        l18 = l6;
        k4 = k;
        flag2 = flag;
        l4 = i;
        l19 = l8;
        l20 = l6;
        i5 = k;
        l24 = l10;
        flag3 = flag;
        i2 = i;
        l21 = l8;
        l22 = l6;
        j2 = k;
        j5 = i1;
        l25 = l10;
        flag4 = flag;
        k2 = i;
        l26 = l8;
        l27 = l6;
        l2 = k;
        f2 = f;
        k5 = i1;
        l16 = l10;
        flag5 = flag;
        i3 = i;
        l15 = l8;
        l14 = l6;
        k1 = k;
        com.google.android.gms.common.internal.safeparcel.a.aH(i6);
        JVM INSTR lookupswitch 9: default 324
    //                   1: 444
    //                   2: 542
    //                   3: 597
    //                   4: 656
    //                   5: 719
    //                   6: 786
    //                   7: 857
    //                   8: 933
    //                   1000: 491;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, i6);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        l = k;
        l7 = l6;
        l9 = l8;
        j = i;
        flag1 = flag;
        l11 = l10;
        j1 = i1;
        f1 = f;
        l13 = l12;
_L13:
        l12 = l13;
        f = f1;
        i1 = j1;
        l10 = l11;
        flag = flag1;
        i = j;
        l8 = l9;
        l6 = l7;
        k = l;
        if (!flag6) goto _L12; else goto _L11
_L2:
        l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i6);
        l13 = l12;
        f1 = f;
        j1 = i1;
        l11 = l10;
        flag1 = flag;
        j = l1;
        l9 = l8;
        l7 = l6;
        l = k;
        if (!flag6) goto _L13; else goto _L10
_L10:
        k3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i6);
        l13 = l12;
        f1 = f;
        j1 = i1;
        l11 = l10;
        flag1 = flag;
        j = l1;
        l9 = l8;
        l7 = l6;
        l = k3;
        if (!flag6) goto _L13; else goto _L14
_L14:
        j3 = l1;
_L3:
        l17 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i6);
        l13 = l12;
        f1 = f;
        j1 = i1;
        l11 = l10;
        flag1 = flag;
        j = j3;
        l9 = l8;
        l7 = l17;
        l = k3;
        if (!flag6) goto _L13; else goto _L15
_L15:
        i4 = k3;
        l3 = j3;
_L4:
        l23 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i6);
        l13 = l12;
        f1 = f;
        j1 = i1;
        l11 = l10;
        flag1 = flag;
        j = l3;
        l9 = l23;
        l7 = l17;
        l = i4;
        if (!flag6) goto _L13; else goto _L16
_L16:
        k4 = i4;
        l18 = l17;
        j4 = l3;
_L5:
        flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i6);
        l13 = l12;
        f1 = f;
        j1 = i1;
        l11 = l10;
        flag1 = flag2;
        j = j4;
        l9 = l23;
        l7 = l18;
        l = k4;
        if (!flag6) goto _L13; else goto _L17
_L17:
        i5 = k4;
        l20 = l18;
        l19 = l23;
        l4 = j4;
_L6:
        l24 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i6);
        l13 = l12;
        f1 = f;
        j1 = i1;
        l11 = l24;
        flag1 = flag2;
        j = l4;
        l9 = l19;
        l7 = l20;
        l = i5;
        if (!flag6) goto _L13; else goto _L18
_L18:
        j2 = i5;
        l22 = l20;
        l21 = l19;
        i2 = l4;
        flag3 = flag2;
_L7:
        j5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i6);
        l13 = l12;
        f1 = f;
        j1 = j5;
        l11 = l24;
        flag1 = flag3;
        j = i2;
        l9 = l21;
        l7 = l22;
        l = j2;
        if (!flag6) goto _L13; else goto _L19
_L19:
        l2 = j2;
        l27 = l22;
        l26 = l21;
        k2 = i2;
        flag4 = flag3;
        l25 = l24;
_L8:
        f2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i6);
        l13 = l12;
        f1 = f2;
        j1 = j5;
        l11 = l25;
        flag1 = flag4;
        j = k2;
        l9 = l26;
        l7 = l27;
        l = l2;
        if (!flag6) goto _L13; else goto _L20
_L20:
        k1 = l2;
        l14 = l27;
        l15 = l26;
        i3 = k2;
        flag5 = flag4;
        l16 = l25;
        k5 = j5;
_L9:
        l12 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i6);
        l13 = l12;
        f1 = f2;
        j1 = k5;
        l11 = l16;
        flag1 = flag5;
        j = i3;
        l9 = l15;
        l7 = l14;
        l = k1;
        if (!flag6) goto _L13; else goto _L21
_L21:
        f = f2;
        i1 = k5;
        l10 = l16;
        flag = flag5;
        i = i3;
        l8 = l15;
        l6 = l14;
        k = k1;
          goto _L1
_L11:
        try
        {
            if (parcel.dataPosition() != l5)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l5).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        return new LocationRequest(l, j, l7, l9, flag1, l11, j1, f1, l13);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cJ(parcel);
    }

    public LocationRequest[] eA(int i)
    {
        return new LocationRequest[i];
    }

    public Object[] newArray(int i)
    {
        return eA(i);
    }
}
