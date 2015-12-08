// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.internal:
//            ValidateAccountRequest

public class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(ValidateAccountRequest validateaccountrequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, validateaccountrequest.a);
        c.a(parcel, 2, validateaccountrequest.a());
        c.a(parcel, 3, validateaccountrequest.b, false);
        c.a(parcel, 4, validateaccountrequest.b(), i, false);
        c.a(parcel, 5, validateaccountrequest.d(), false);
        c.a(parcel, 6, validateaccountrequest.c(), false);
        c.a(parcel, j);
    }

    public ValidateAccountRequest a(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 4: // '\004'
                    ascope = (Scope[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, Scope.CREATOR);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ValidateAccountRequest(j, i, ibinder, ascope, bundle, s);
            }
        } while (true);
    }

    public ValidateAccountRequest[] a(int i)
    {
        return new ValidateAccountRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
