// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ic;

// Referenced classes of package com.google.android.gms.location.reporting:
//            d

public class GmmSettings
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    private final long FX;
    private final Account FY;
    private final boolean FZ;
    private final int jE;

    public GmmSettings(int i, long l, Account account, boolean flag)
    {
        jE = i;
        FX = l;
        FY = account;
        FZ = flag;
    }

    public GmmSettings(long l, Account account, boolean flag)
    {
        this(0, l, account, flag);
    }

    public int describeContents()
    {
        d d1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof GmmSettings)
        {
            obj = (GmmSettings)obj;
            if (FX == ((GmmSettings) (obj)).FX && FZ == ((GmmSettings) (obj)).FZ && jE == ((GmmSettings) (obj)).jE && FY == null)
            {
                if (((GmmSettings) (obj)).FY == null)
                {
                    return true;
                }
            } else
            {
                return FY.equals(((GmmSettings) (obj)).FY);
            }
        }
        return false;
    }

    public Account getAccount()
    {
        return FY;
    }

    public long getReadMillis()
    {
        return FX;
    }

    int getVersionCode()
    {
        return jE;
    }

    public int hashCode()
    {
        int j = 0;
        int k = jE;
        int l = (int)(FX ^ FX >>> 32);
        int i;
        if (FY != null)
        {
            i = FY.hashCode();
        } else
        {
            i = 0;
        }
        if (FZ)
        {
            j = 1;
        }
        return (i + (k * 31 + l) * 31) * 31 + j;
    }

    public boolean isReportingSelected()
    {
        return FZ;
    }

    public String toString()
    {
        return (new StringBuilder("GmmSettings{mVersionCode=")).append(jE).append(", mValueReadMillis=").append(FX).append(", mAccount=").append(ic.a(FY)).append(", mReportingSelected=").append(FZ).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d d1 = CREATOR;
        d.a(this, parcel, i);
    }

}
