// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            CheckRealNameRequest

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(CheckRealNameRequest checkrealnamerequest, Parcel parcel, int i)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, checkrealnamerequest.version);
        b.a(parcel, 2, checkrealnamerequest.callingAppDescription, i, false);
        b.a(parcel, 3, checkrealnamerequest.mp, false);
        b.a(parcel, 4, checkrealnamerequest.mq, false);
        b.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        AppDescription appdescription = null;
        int i = 0;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    appdescription = (AppDescription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, AppDescription.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new CheckRealNameRequest(i, appdescription, s, s1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CheckRealNameRequest[i];
    }
}
