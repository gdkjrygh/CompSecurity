// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            qw

public class jw
    implements android.os.Parcelable.Creator
{

    public jw()
    {
    }

    static void a(jg.a a1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.a(parcel, 1, a1.getAccountName(), false);
        b.c(parcel, 1000, a1.getVersionCode());
        b.b(parcel, 2, a1.ho(), false);
        b.c(parcel, 3, a1.hn());
        b.a(parcel, 4, a1.hq(), false);
        b.H(parcel, i);
    }

    public jg.a E(Parcel parcel)
    {
        String s;
        java.util.ArrayList arraylist;
        String s2;
        int i;
        int k;
        int i2;
        boolean flag;
        k = 0;
        s2 = null;
        flag = com.google.android.gms.internal.qw.a;
        i2 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        arraylist = null;
        s = null;
        i = 0;
_L8:
        String s1;
        java.util.ArrayList arraylist1;
        String s3;
        String s4;
        java.util.ArrayList arraylist2;
        String s5;
        String s6;
        String s7;
        java.util.ArrayList arraylist3;
        int j;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int j2;
        s3 = s2;
        l = k;
        arraylist1 = arraylist;
        s1 = s;
        j = i;
        if (parcel.dataPosition() >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        s7 = s;
        s5 = s;
        k1 = i;
        arraylist3 = arraylist;
        s6 = s;
        j1 = i;
        l1 = k;
        arraylist2 = arraylist;
        s4 = s;
        i1 = i;
        com.google.android.gms.common.internal.safeparcel.a.aH(j2);
        JVM INSTR lookupswitch 5: default 148
    //                   1: 236
    //                   2: 304
    //                   3: 344
    //                   4: 388
    //                   1000: 268;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, j2);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        j = i;
        s1 = s;
        arraylist1 = arraylist;
        l = k;
        s3 = s2;
_L9:
        s2 = s3;
        k = l;
        arraylist = arraylist1;
        s = s1;
        i = j;
        if (!flag) goto _L8; else goto _L7
_L2:
        s7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j2);
        s3 = s2;
        l = k;
        arraylist1 = arraylist;
        s1 = s7;
        j = i;
        if (!flag) goto _L9; else goto _L6
_L6:
        k1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j2);
        s3 = s2;
        l = k;
        arraylist1 = arraylist;
        s1 = s7;
        j = k1;
        if (!flag) goto _L9; else goto _L10
_L10:
        s5 = s7;
_L3:
        arraylist3 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, j2);
        s3 = s2;
        l = k;
        arraylist1 = arraylist3;
        s1 = s5;
        j = k1;
        if (!flag) goto _L9; else goto _L11
_L11:
        j1 = k1;
        s6 = s5;
_L4:
        l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j2);
        s3 = s2;
        l = l1;
        arraylist1 = arraylist3;
        s1 = s6;
        j = j1;
        if (!flag) goto _L9; else goto _L12
_L12:
        i1 = j1;
        s4 = s6;
        arraylist2 = arraylist3;
_L5:
        s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j2);
        s3 = s2;
        l = l1;
        arraylist1 = arraylist2;
        s1 = s4;
        j = i1;
        if (!flag) goto _L9; else goto _L13
_L13:
        k = l1;
        arraylist = arraylist2;
        s = s4;
        i = i1;
          goto _L1
_L7:
        try
        {
            if (parcel.dataPosition() != i2)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i2).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        return new jg.a(j, s1, arraylist1, l, s3);
    }

    public jg.a[] aG(int i)
    {
        return new jg.a[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return E(parcel);
    }

    public Object[] newArray(int i)
    {
        return aG(i);
    }
}
