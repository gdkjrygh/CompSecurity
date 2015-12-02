// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.api:
//            Status, Api

public class StatusCreator
    implements android.os.Parcelable.Creator
{

    public StatusCreator()
    {
    }

    static void a(Status status, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, status.getStatusCode());
        b.c(parcel, 1000, status.getVersionCode());
        b.a(parcel, 2, status.getStatusMessage(), false);
        b.a(parcel, 3, status.gP(), i, false);
        b.H(parcel, j);
    }

    public Status createFromParcel(Parcel parcel)
    {
        String s;
        PendingIntent pendingintent;
        int i;
        int k;
        int j2;
        int k2;
        pendingintent = null;
        j2 = com.google.android.gms.common.api.Api.a;
        k2 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        i = 0;
        k = 0;
        s = null;
_L7:
        String s1;
        PendingIntent pendingintent1;
        String s2;
        int j;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2;
        pendingintent1 = pendingintent;
        s1 = s;
        j = i;
        l = k;
        if (parcel.dataPosition() >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
        i1 = i;
        k1 = i;
        l1 = k;
        s2 = s;
        i2 = i;
        j1 = k;
        com.google.android.gms.common.internal.safeparcel.a.aH(l2);
        JVM INSTR lookupswitch 4: default 120
    //                   1: 200
    //                   2: 258
    //                   3: 294
    //                   1000: 227;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        try
        {
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, l2);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        l = k;
        j = i;
        s1 = s;
        pendingintent1 = pendingintent;
_L8:
        pendingintent = pendingintent1;
        s = s1;
        i = j;
        k = l;
        if (j2 == 0) goto _L7; else goto _L6
_L2:
        i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
        pendingintent1 = pendingintent;
        s1 = s;
        j = i1;
        l = k;
        if (j2 == 0) goto _L8; else goto _L5
_L5:
        l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
        pendingintent1 = pendingintent;
        s1 = s;
        j = i1;
        l = l1;
        if (j2 == 0) goto _L8; else goto _L9
_L9:
        k1 = i1;
_L3:
        s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l2);
        pendingintent1 = pendingintent;
        s1 = s2;
        j = k1;
        l = l1;
        if (j2 == 0) goto _L8; else goto _L10
_L10:
        j1 = l1;
        i2 = k1;
_L4:
        pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l2, PendingIntent.CREATOR);
        pendingintent1 = pendingintent;
        s1 = s2;
        j = i2;
        l = j1;
        if (j2 == 0) goto _L8; else goto _L11
_L11:
        s = s2;
        i = i2;
        k = j1;
          goto _L1
_L6:
        try
        {
            if (parcel.dataPosition() != k2)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k2).toString(), parcel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        return new Status(l, j, s1, pendingintent1);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public Status[] newArray(int i)
    {
        return new Status[i];
    }

    public Object[] newArray(int i)
    {
        return newArray(i);
    }
}
