// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.reporting:
//            UploadRequestResult

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(UploadRequestResult uploadrequestresult, Parcel parcel)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, uploadrequestresult.getVersionCode());
        b.a(parcel, 2, uploadrequestresult.getResultCode());
        b.a(parcel, 3, uploadrequestresult.getRequestId());
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        long l1 = 0L;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new UploadRequestResult(j, k, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new UploadRequestResult[j];
    }
}
