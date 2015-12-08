// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.reporting:
//            f

public class PlaceReport
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final String FL;
    private final Account FY;
    final int jE;
    private final String mTag;

    PlaceReport(int i, Account account, String s, String s1)
    {
        jE = i;
        FY = account;
        FL = s;
        mTag = s1;
    }

    public static PlaceReport create(Account account, String s, String s1)
    {
        return new PlaceReport(1, account, s, s1);
    }

    public int describeContents()
    {
        f f1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceReport))
            {
                return false;
            }
            obj = (PlaceReport)obj;
            if (!FY.equals(((PlaceReport) (obj)).FY) || !FL.equals(((PlaceReport) (obj)).FL) || !mTag.equals(((PlaceReport) (obj)).mTag))
            {
                return false;
            }
        }
        return true;
    }

    public Account getAccount()
    {
        return FY;
    }

    public String getPlaceId()
    {
        return FL;
    }

    public String getTag()
    {
        return mTag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            FY, FL, mTag
        });
    }

    public String toString()
    {
        return (new StringBuilder("PlaceReport{mVersionCode=")).append(jE).append(", mAccount=").append(FY).append(", mPlaceId=").append(FL).append(", mTag='").append(mTag).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f f1 = CREATOR;
        f.a(this, parcel, i);
    }

}
