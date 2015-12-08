// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            PasswordSpecification

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(PasswordSpecification passwordspecification, Parcel parcel, int j)
    {
        j = c.a(parcel);
        c.a(parcel, 1, passwordspecification.d, false);
        c.a(parcel, 1000, passwordspecification.c);
        c.b(parcel, 2, passwordspecification.e, false);
        c.a(parcel, 3, passwordspecification.f, false);
        c.a(parcel, 4, passwordspecification.g);
        c.a(parcel, 5, passwordspecification.h);
        c.a(parcel, j);
    }

    public PasswordSpecification a(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int k = 0;
        java.util.ArrayList arraylist1 = null;
        String s = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.z(parcel, j1);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.y(parcel, j1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new PasswordSpecification(l, s, arraylist1, arraylist, k, j);
            }
        } while (true);
    }

    public PasswordSpecification[] a(int j)
    {
        return new PasswordSpecification[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
