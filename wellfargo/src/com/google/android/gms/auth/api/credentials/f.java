// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialPickerConfig

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(CredentialPickerConfig credentialpickerconfig, Parcel parcel, int i)
    {
        i = c.a(parcel);
        c.a(parcel, 1, credentialpickerconfig.a());
        c.a(parcel, 1000, credentialpickerconfig.a);
        c.a(parcel, 2, credentialpickerconfig.b());
        c.a(parcel, i);
    }

    public CredentialPickerConfig a(Parcel parcel)
    {
        boolean flag1 = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean flag = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CredentialPickerConfig(i, flag, flag1);
            }
        } while (true);
    }

    public CredentialPickerConfig[] a(int i)
    {
        return new CredentialPickerConfig[i];
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
