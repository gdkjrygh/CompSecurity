// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            CaptchaChallenge

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(CaptchaChallenge captchachallenge, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, captchachallenge.version);
        b.a(parcel, 2, captchachallenge.lV, false);
        b.a(parcel, 3, captchachallenge.ne, false);
        b.a(parcel, 4, captchachallenge.nC, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Bitmap bitmap = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    bitmap = (Bitmap)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Bitmap.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CaptchaChallenge(i, s, s1, bitmap);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CaptchaChallenge[i];
    }
}
