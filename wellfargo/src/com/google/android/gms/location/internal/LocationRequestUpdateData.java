// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.o;
import com.google.android.gms.location.p;
import com.google.android.gms.location.r;
import com.google.android.gms.location.s;

// Referenced classes of package com.google.android.gms.location.internal:
//            x, LocationRequestInternal

public class LocationRequestUpdateData
    implements SafeParcelable
{

    public static final x CREATOR = new x();
    int a;
    LocationRequestInternal b;
    r c;
    PendingIntent d;
    o e;
    private final int f;

    LocationRequestUpdateData(int i, int j, LocationRequestInternal locationrequestinternal, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1)
    {
        Object obj = null;
        super();
        f = i;
        a = j;
        b = locationrequestinternal;
        if (ibinder == null)
        {
            locationrequestinternal = null;
        } else
        {
            locationrequestinternal = s.a(ibinder);
        }
        c = locationrequestinternal;
        d = pendingintent;
        if (ibinder1 == null)
        {
            locationrequestinternal = obj;
        } else
        {
            locationrequestinternal = p.a(ibinder1);
        }
        e = locationrequestinternal;
    }

    public static LocationRequestUpdateData a(LocationRequestInternal locationrequestinternal, r r1)
    {
        return new LocationRequestUpdateData(1, 1, locationrequestinternal, r1.asBinder(), null, null);
    }

    public static LocationRequestUpdateData a(o o1)
    {
        return new LocationRequestUpdateData(1, 2, null, null, null, o1.asBinder());
    }

    public static LocationRequestUpdateData a(r r1)
    {
        return new LocationRequestUpdateData(1, 2, null, r1.asBinder(), null, null);
    }

    int a()
    {
        return f;
    }

    IBinder b()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return c.asBinder();
        }
    }

    IBinder c()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.asBinder();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        x.a(this, parcel, i);
    }

}
