// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            TokenWorkflowRequest

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(TokenWorkflowRequest tokenworkflowrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, tokenworkflowrequest.version);
        b.a(parcel, 2, tokenworkflowrequest.mZ, false);
        b.a(parcel, 3, tokenworkflowrequest.accountName, false);
        b.a(parcel, 4, tokenworkflowrequest.mI, false);
        b.a(parcel, 5, tokenworkflowrequest.na, i, false);
        b.a(parcel, 6, tokenworkflowrequest.nb, i, false);
        b.a(parcel, 7, tokenworkflowrequest.ns);
        b.a(parcel, 8, tokenworkflowrequest.callingAppDescription, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        AppDescription appdescription = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Bundle bundle = new Bundle();
        PACLConfig paclconfig = null;
        FACLConfig faclconfig = null;
        String s = null;
        String s1 = null;
        int i = 0;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 5: // '\005'
                    faclconfig = (FACLConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, FACLConfig.CREATOR);
                    break;

                case 6: // '\006'
                    paclconfig = (PACLConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PACLConfig.CREATOR);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 8: // '\b'
                    appdescription = (AppDescription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AppDescription.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TokenWorkflowRequest(i, s1, s, bundle, faclconfig, paclconfig, flag, appdescription);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new TokenWorkflowRequest[i];
    }
}
