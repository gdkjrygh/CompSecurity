// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            FacebookSignInConfig

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(FacebookSignInConfig facebooksigninconfig, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, facebooksigninconfig.a);
        c.a(parcel, 2, facebooksigninconfig.a(), i, false);
        c.b(parcel, 3, facebooksigninconfig.b(), false);
        c.a(parcel, j);
    }

    public FacebookSignInConfig a(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        Intent intent = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    intent = (Intent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Intent.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.z(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FacebookSignInConfig(i, intent, arraylist);
            }
        } while (true);
    }

    public FacebookSignInConfig[] a(int i)
    {
        return new FacebookSignInConfig[i];
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
