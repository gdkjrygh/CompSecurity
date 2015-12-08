// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            ScopeDetail, FACLData

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(ScopeDetail scopedetail, Parcel parcel, int j)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, scopedetail.version);
        b.a(parcel, 2, scopedetail.description, false);
        b.a(parcel, 3, scopedetail.lX, false);
        b.a(parcel, 4, scopedetail.nN, false);
        b.a(parcel, 5, scopedetail.nO, false);
        b.a(parcel, 6, scopedetail.mZ, false);
        b.a(parcel, 7, scopedetail.nP, false);
        b.a(parcel, 8, scopedetail.friendPickerData, j, false);
        b.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        FACLData facldata = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        ArrayList arraylist = new ArrayList();
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.u(parcel, l);
                    break;

                case 8: // '\b'
                    facldata = (FACLData)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, FACLData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ScopeDetail(j, s4, s3, s2, s1, s, arraylist, facldata);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new ScopeDetail[j];
    }
}
