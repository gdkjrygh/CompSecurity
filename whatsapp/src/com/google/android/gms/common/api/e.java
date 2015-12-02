// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope, Api

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(Scope scope, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, scope.CK);
        b.a(parcel, 2, scope.gO(), false);
        b.H(parcel, i);
    }

    public Scope[] am(int i)
    {
        return new Scope[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return z(parcel);
    }

    public Object[] newArray(int i)
    {
        return am(i);
    }

    public Scope z(Parcel parcel)
    {
        String s;
        int i;
        int l;
        int i1;
        l = com.google.android.gms.common.api.Api.a;
        i1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        i = 0;
        s = null;
_L5:
        String s1;
        int j;
        int k;
        int j1;
        s1 = s;
        j = i;
        if (parcel.dataPosition() >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        k = i;
        com.google.android.gms.common.internal.safeparcel.a.aH(j1);
        JVM INSTR tableswitch 1 2: default 68
    //                   1 132
    //                   2 151;
           goto _L1 _L2 _L3
_L1:
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        j = i;
        s1 = s;
_L6:
        s = s1;
        i = j;
        if (l == 0) goto _L5; else goto _L4
_L2:
        k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
        s1 = s;
        j = k;
        if (l == 0) goto _L6; else goto _L3
_L3:
        s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
        s1 = s;
        j = k;
        if (l == 0) goto _L6; else goto _L7
_L7:
        i = k;
          goto _L1
_L4:
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
        return new Scope(j, s1);
    }
}
