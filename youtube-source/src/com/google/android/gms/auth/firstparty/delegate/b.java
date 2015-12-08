// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            SetupAccountWorkflowRequest

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(SetupAccountWorkflowRequest setupaccountworkflowrequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, setupaccountworkflowrequest.version);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, setupaccountworkflowrequest.np);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, setupaccountworkflowrequest.nq);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, setupaccountworkflowrequest.nr, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, setupaccountworkflowrequest.mI, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, setupaccountworkflowrequest.callingAppDescription, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        AppDescription appdescription = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Bundle bundle = new Bundle();
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
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
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.u(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    appdescription = (AppDescription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AppDescription.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SetupAccountWorkflowRequest(i, flag1, flag, arraylist, bundle, appdescription);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new SetupAccountWorkflowRequest[i];
    }
}
