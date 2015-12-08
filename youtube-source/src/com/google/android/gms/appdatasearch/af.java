// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            PIMEUpdateResponse, PIMEUpdate

public final class af
    implements android.os.Parcelable.Creator
{

    public af()
    {
    }

    static void a(PIMEUpdateResponse pimeupdateresponse, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, pimeupdateresponse.mErrorMessage, false);
        b.a(parcel, 1000, pimeupdateresponse.jE);
        b.a(parcel, 2, pimeupdateresponse.nextIterToken, false);
        b.a(parcel, 3, pimeupdateresponse.updates, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        PIMEUpdate apimeupdate[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        int i = 0;
        byte abyte0[] = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    apimeupdate = (PIMEUpdate[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, PIMEUpdate.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PIMEUpdateResponse(i, s, abyte0, apimeupdate);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PIMEUpdateResponse[i];
    }
}
