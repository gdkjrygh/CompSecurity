// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.signin:
//            GoogleSignInAccount

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GoogleSignInAccount googlesigninaccount, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, googlesigninaccount.a);
        c.a(parcel, 2, googlesigninaccount.a(), false);
        c.a(parcel, 3, googlesigninaccount.b(), false);
        c.a(parcel, 4, googlesigninaccount.c(), false);
        c.a(parcel, 5, googlesigninaccount.d(), false);
        c.a(parcel, 6, googlesigninaccount.e(), i, false);
        c.a(parcel, j);
    }

    public GoogleSignInAccount a(Parcel parcel)
    {
        Uri uri = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GoogleSignInAccount(i, s3, s2, s1, s, uri);
            }
        } while (true);
    }

    public GoogleSignInAccount[] a(int i)
    {
        return new GoogleSignInAccount[i];
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
