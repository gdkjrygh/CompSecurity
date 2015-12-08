// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.people.model:
//            a

public class AccountMetadata
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    public boolean isPagePeriodicSyncEnabled;
    public boolean isPageTickleSyncEnabled;
    public boolean isPlusEnabled;
    public boolean isSyncEnabled;
    final int jE;

    public AccountMetadata()
    {
        jE = 2;
    }

    AccountMetadata(int i, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        jE = i;
        isPlusEnabled = flag;
        isSyncEnabled = flag1;
        isPagePeriodicSyncEnabled = flag2;
        isPageTickleSyncEnabled = flag3;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel);
    }

}
