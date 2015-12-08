// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            e

public class AccountRecoveryGuidance
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    public final String accountName;
    public final boolean isRecoveryInfoNeeded;
    public final boolean isRecoveryInterstitialSuggested;
    public final boolean isRecoveryUpdateAllowed;
    final int version;

    AccountRecoveryGuidance(int i, String s, boolean flag, boolean flag1, boolean flag2)
    {
        version = i;
        accountName = s;
        isRecoveryInfoNeeded = flag;
        isRecoveryInterstitialSuggested = flag1;
        isRecoveryUpdateAllowed = flag2;
    }

    public AccountRecoveryGuidance(String s, boolean flag, boolean flag1, boolean flag2)
    {
        this(0, gi.a(s), flag, flag1, flag2);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel);
    }

}
