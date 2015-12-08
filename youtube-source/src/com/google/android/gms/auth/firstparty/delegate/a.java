// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            ConfirmCredentialsWorkflowRequest

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ConfirmCredentialsWorkflowRequest confirmcredentialsworkflowrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, confirmcredentialsworkflowrequest.version);
        b.a(parcel, 2, confirmcredentialsworkflowrequest.accountName, false);
        b.a(parcel, 3, confirmcredentialsworkflowrequest.callingAppDescription, i, false);
        b.a(parcel, 4, confirmcredentialsworkflowrequest.mI, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Bundle bundle = new Bundle();
        String s = null;
        int i = 0;
        AppDescription appdescription = null;
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
                    appdescription = (AppDescription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AppDescription.CREATOR);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ConfirmCredentialsWorkflowRequest(i, s, appdescription, bundle);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ConfirmCredentialsWorkflowRequest[i];
    }
}
