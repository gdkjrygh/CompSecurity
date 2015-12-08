// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            fk, fh

public final class gv
    implements android.os.Parcelable.Creator
{

    public gv()
    {
    }

    static void a(fk fk1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, fk1.getVersionCode());
        b.a(parcel, 2, fk1.cB(), false);
        b.a(parcel, 3, fk1.cC(), i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        fh fh1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        Parcel parcel1 = null;
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
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.v(parcel, k);
                    break;

                case 3: // '\003'
                    fh1 = (fh)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, fh.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new fk(i, parcel1, fh1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new fk[i];
    }
}
