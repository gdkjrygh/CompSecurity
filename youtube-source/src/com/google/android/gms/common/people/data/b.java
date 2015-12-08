// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.common.people.data:
//            AudienceMember

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    public static AudienceMember a(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int j = 0;
        int k = 0;
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

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 7: // '\007'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AudienceMember(k, j, i, s3, s2, s1, s, bundle);
            }
        } while (true);
    }

    static void a(AudienceMember audiencemember, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, audiencemember.getType());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, audiencemember.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, audiencemember.getCircleType());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, audiencemember.getCircleId(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, audiencemember.getPeopleQualifiedId(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, audiencemember.getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, audiencemember.getAvatarUrl(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, audiencemember.getMetadata(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new AudienceMember[i];
    }
}
