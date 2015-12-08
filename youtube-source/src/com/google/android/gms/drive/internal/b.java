// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CloseContentsRequest

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(CloseContentsRequest closecontentsrequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, closecontentsrequest.jE);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, closecontentsrequest.ve, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, closecontentsrequest.vf, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Contents contents = null;
        int i = 0;
        Boolean boolean1 = null;
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
                    contents = (Contents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Contents.CREATOR);
                    break;

                case 3: // '\003'
                    boolean1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CloseContentsRequest(i, contents, boolean1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CloseContentsRequest[i];
    }
}
