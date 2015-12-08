// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.ic;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.reporting:
//            h, c, b

public class UploadRequest
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    private final Account FY;
    private final String Gi;
    private final long Gj;
    private final long Gk;
    private final long Gl;
    private final String Gm;
    private final int jE;

    UploadRequest(int i, Account account, String s, long l, long l1, 
            long l2, String s1)
    {
        jE = i;
        FY = account;
        Gi = s;
        Gj = l;
        Gk = l1;
        Gl = l2;
        Gm = s1;
    }

    private UploadRequest(c c1)
    {
        jE = 1;
        FY = c.a(c1);
        Gi = c.b(c1);
        Gj = c.c(c1);
        Gk = c.d(c1);
        Gl = c.e(c1);
        Gm = c.f(c1);
    }

    UploadRequest(c c1, b b)
    {
        this(c1);
    }

    public static c builder(Account account, String s, long l)
    {
        return new c(account, s, l, (byte)0);
    }

    public int describeContents()
    {
        h h1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UploadRequest))
            {
                return false;
            }
            obj = (UploadRequest)obj;
            if (!FY.equals(((UploadRequest) (obj)).FY) || !Gi.equals(((UploadRequest) (obj)).Gi) || !ge.a(Long.valueOf(Gj), Long.valueOf(((UploadRequest) (obj)).Gj)) || Gk != ((UploadRequest) (obj)).Gk || Gl != ((UploadRequest) (obj)).Gl || !ge.a(Gm, ((UploadRequest) (obj)).Gm))
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

    public String getAppSpecificKey()
    {
        return Gm;
    }

    public long getDurationMillis()
    {
        return Gj;
    }

    public long getMovingLatencyMillis()
    {
        return Gk;
    }

    public String getReason()
    {
        return Gi;
    }

    public long getStationaryLatencyMillis()
    {
        return Gl;
    }

    int getVersionCode()
    {
        return jE;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            FY, Gi, Long.valueOf(Gj), Long.valueOf(Gk), Long.valueOf(Gl), Gm
        });
    }

    public String toString()
    {
        return (new StringBuilder("UploadRequest{mVersionCode=")).append(jE).append(", mAccount=").append(ic.a(FY)).append(", mReason='").append(Gi).append('\'').append(", mDurationMillis=").append(Gj).append(", mMovingLatencyMillis=").append(Gk).append(", mStationaryLatencyMillis=").append(Gl).append(", mAppSpecificKey='").append(Gm).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h h1 = CREATOR;
        h.a(this, parcel, i);
    }

}
