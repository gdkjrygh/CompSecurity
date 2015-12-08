// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            PIMEUpdate

public final class ae
    implements android.os.Parcelable.Creator
{

    public ae()
    {
    }

    static void a(PIMEUpdate pimeupdate, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, pimeupdate.kf, false);
        b.a(parcel, 1000, pimeupdate.jE);
        b.a(parcel, 2, pimeupdate.kg, false);
        b.a(parcel, 3, pimeupdate.sourceClass);
        b.a(parcel, 4, pimeupdate.sourcePackageName, false);
        b.a(parcel, 5, pimeupdate.sourceCorpusHandle, false);
        b.a(parcel, 6, pimeupdate.inputByUser);
        b.a(parcel, 8, pimeupdate.kh, false);
        b.a(parcel, 9, pimeupdate.score);
        b.a(parcel, 10, pimeupdate.createdTimestamp);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        byte abyte1[] = null;
        byte abyte0[] = null;
        int i = 0;
        String s1 = null;
        String s = null;
        boolean flag = false;
        android.os.Bundle bundle = null;
        long l2 = 0L;
        long l1 = 0L;
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
                    abyte1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 8: // '\b'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 9: // '\t'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, l);
                    break;

                case 10: // '\n'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PIMEUpdate(j, abyte1, abyte0, i, s1, s, flag, bundle, l2, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PIMEUpdate[i];
    }
}
