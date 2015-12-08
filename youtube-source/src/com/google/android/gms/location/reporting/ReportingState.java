// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.reporting:
//            g, a

public class ReportingState
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    private final int Gc;
    private final int Gd;
    private final boolean Ge;
    private final boolean Gf;
    private final boolean Gg;
    private final int Gh;
    private final int jE;

    public ReportingState(int i, int j, int k, boolean flag, boolean flag1, boolean flag2, int l)
    {
        jE = i;
        Gc = j;
        Gd = k;
        Ge = flag;
        Gf = flag1;
        Gg = flag2;
        Gh = l;
    }

    public ReportingState(int i, int j, boolean flag, boolean flag1, boolean flag2, int k)
    {
        this(1, i, j, flag, flag1, flag2, k);
    }

    public int describeContents()
    {
        g g1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ReportingState)
        {
            if (Gc == ((ReportingState) (obj = (ReportingState)obj)).Gc && Gd == ((ReportingState) (obj)).Gd && Ge == ((ReportingState) (obj)).Ge && Gf == ((ReportingState) (obj)).Gf && Gg == ((ReportingState) (obj)).Gg && Gh == ((ReportingState) (obj)).Gh)
            {
                return true;
            }
        }
        return false;
    }

    public int getExpectedOptInResult()
    {
        int j = Gh;
        int i = j;
        switch (j)
        {
        case 7: // '\007'
        default:
            i = 1;
            // fall through

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            return i;
        }
    }

    public int getHistoryEnabled()
    {
        return a.a(Gd);
    }

    public int getReportingEnabled()
    {
        return a.a(Gc);
    }

    int getVersionCode()
    {
        return jE;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(Gc), Integer.valueOf(Gd), Boolean.valueOf(Ge), Boolean.valueOf(Gf), Boolean.valueOf(Gg), Integer.valueOf(Gh)
        });
    }

    public boolean isActive()
    {
        return Gf;
    }

    public boolean isAllowed()
    {
        return Ge;
    }

    public boolean isAmbiguous()
    {
        return Gc == -2 || Gd == -2;
    }

    public boolean isDeferringToMaps()
    {
        return Gg;
    }

    public boolean isOptedIn()
    {
        return a.b(Gc) && a.b(Gd);
    }

    public boolean shouldOptIn()
    {
        return shouldOptInInsistent();
    }

    public boolean shouldOptInInsistent()
    {
        return !isOptedIn() && getExpectedOptInResult() == 0;
    }

    public boolean shouldOptInLenient()
    {
        return (a.c(Gc) || a.c(Gd)) && getExpectedOptInResult() == 0;
    }

    public String toString()
    {
        return (new StringBuilder("ReportingState{mReportingEnabled=")).append(Gc).append(", mHistoryEnabled=").append(Gd).append(", mAllowed=").append(Ge).append(", mActive=").append(Gf).append(", mDefer=").append(Gg).append(", mExpectedOptInResult=").append(Gh).append(", mVersionCode=").append(jE).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g g1 = CREATOR;
        g.a(this, parcel);
    }

}
