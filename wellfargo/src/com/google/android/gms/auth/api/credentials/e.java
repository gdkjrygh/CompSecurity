// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            Credential, IdToken

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(Credential credential, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1001, credential.a(), false);
        c.a(parcel, 1, credential.c(), false);
        c.a(parcel, 1000, credential.a);
        c.a(parcel, 2, credential.d(), false);
        c.a(parcel, 3, credential.e(), i, false);
        c.a(parcel, 1002, credential.b(), false);
        c.c(parcel, 4, credential.f(), false);
        c.a(parcel, 5, credential.g(), false);
        c.a(parcel, 6, credential.i(), false);
        c.a(parcel, 7, credential.h(), false);
        c.a(parcel, 8, credential.j(), false);
        c.a(parcel, j);
    }

    public Credential a(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        java.util.ArrayList arraylist = null;
        Uri uri = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
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

                case 1001: 
                    s7 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 1: // '\001'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 1002: 
                    s6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, IdToken.CREATOR);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new Credential(i, s7, s6, s5, s4, uri, arraylist, s3, s2, s1, s);
            }
        } while (true);
    }

    public Credential[] a(int i)
    {
        return new Credential[i];
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
