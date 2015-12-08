// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.reporting:
//            i

public final class UploadRequestResult
    implements SafeParcelable
{

    public static final int CALLER_NOT_AUTHORIZED = 4;
    public static final i CREATOR = new i();
    public static final int DURATION_TOO_LONG = 2;
    public static final int EXPIRATION_TOO_LATE = 2;
    public static final long FAILURE_REQUEST_ID = -1L;
    public static final int ID_NOT_FOUND = 100;
    public static final int REPORTING_NOT_ACTIVE = 3;
    public static final int SUCCESS = 0;
    private final int Gp;
    private final int jE;
    private final long qf;

    UploadRequestResult(int j, int k, long l)
    {
        jE = j;
        Gp = k;
        qf = l;
    }

    public UploadRequestResult(int j, long l)
    {
        this(1, j, l);
    }

    public final int describeContents()
    {
        i j = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof UploadRequestResult)
        {
            if (qf == ((UploadRequestResult) (obj = (UploadRequestResult)obj)).qf && Gp == ((UploadRequestResult) (obj)).Gp)
            {
                return true;
            }
        }
        return false;
    }

    public final long getRequestId()
    {
        return qf;
    }

    public final int getResultCode()
    {
        return Gp;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(Gp), Long.valueOf(qf)
        });
    }

    public final String toString()
    {
        return (new StringBuilder("Result{mVersionCode=")).append(jE).append(", mResultCode=").append(Gp).append(", mRequestId=").append(qf).append('}').toString();
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        i k = CREATOR;
        i.a(this, parcel);
    }

}
