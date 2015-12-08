// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            d, b, ApplicationParameters

public final class BuyFlowConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    String PA;
    String PB;
    String Px;
    ApplicationParameters Py;
    String Pz;
    final int jE;

    BuyFlowConfig()
    {
        jE = 2;
    }

    BuyFlowConfig(int i, String s, ApplicationParameters applicationparameters, String s1, String s2, String s3)
    {
        jE = i;
        Px = s;
        Py = applicationparameters;
        Pz = s1;
        PA = s2;
        PB = s3;
    }

    public static b newBuilder()
    {
        BuyFlowConfig buyflowconfig = new BuyFlowConfig();
        buyflowconfig.getClass();
        return new b(buyflowconfig, (byte)0);
    }

    public static b newBuilderFrom(BuyFlowConfig buyflowconfig)
    {
        b b1 = newBuilder().a(buyflowconfig.getApplicationParams());
        String s = buyflowconfig.getCallingAppIdentifier();
        b1.a.PB = s;
        return b1.b(buyflowconfig.getCallingPackage()).c(buyflowconfig.getFlowName()).a(buyflowconfig.getTransactionId());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ApplicationParameters getApplicationParams()
    {
        return Py;
    }

    public final String getCallingAppIdentifier()
    {
        if (TextUtils.isEmpty(PB))
        {
            return Pz;
        } else
        {
            return PB;
        }
    }

    public final String getCallingPackage()
    {
        return Pz;
    }

    public final String getFlowName()
    {
        return PA;
    }

    public final String getTransactionId()
    {
        return Px;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
