// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            c, a

public final class ApplicationParameters
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    int Pp;
    Account Pu;
    boolean Pv;
    final int jE;
    Bundle mArgs;
    int mTheme;

    ApplicationParameters()
    {
        Pv = false;
        jE = 2;
        Pp = 1;
        mTheme = 0;
    }

    ApplicationParameters(int i, int j, Account account, Bundle bundle, boolean flag, int k)
    {
        Pv = false;
        jE = i;
        Pp = j;
        Pu = account;
        mArgs = bundle;
        Pv = flag;
        mTheme = k;
    }

    public static a newBuilder()
    {
        ApplicationParameters applicationparameters = new ApplicationParameters();
        applicationparameters.getClass();
        return new a(applicationparameters, (byte)0);
    }

    public static a newBuilderFrom(ApplicationParameters applicationparameters)
    {
        a a1 = newBuilder().a(applicationparameters.getEnvironment()).a(applicationparameters.getBuyerAccount()).a(applicationparameters.getArgs());
        boolean flag = applicationparameters.isAccountSelectionAllowed();
        a1.a.Pv = flag;
        return a1.b(applicationparameters.getTheme());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Bundle getArgs()
    {
        return mArgs;
    }

    public final Account getBuyerAccount()
    {
        return Pu;
    }

    public final int getEnvironment()
    {
        return Pp;
    }

    public final int getTheme()
    {
        return mTheme;
    }

    public final boolean isAccountSelectionAllowed()
    {
        return Pv;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
