// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            w

public class LocationRequestInternal
    implements SafeParcelable
{

    public static final w CREATOR = new w();
    static final List a = Collections.emptyList();
    LocationRequest b;
    boolean c;
    boolean d;
    boolean e;
    List f;
    final String g;
    boolean h;
    private final int i;

    LocationRequestInternal(int j, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s, 
            boolean flag3)
    {
        i = j;
        b = locationrequest;
        c = flag;
        d = flag1;
        e = flag2;
        f = list;
        g = s;
        h = flag3;
    }

    public static LocationRequestInternal a(LocationRequest locationrequest)
    {
        return a(null, locationrequest);
    }

    public static LocationRequestInternal a(String s, LocationRequest locationrequest)
    {
        return new LocationRequestInternal(1, locationrequest, false, true, true, a, s, false);
    }

    int a()
    {
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LocationRequestInternal)
        {
            if (ar.a(b, ((LocationRequestInternal) (obj = (LocationRequestInternal)obj)).b) && c == ((LocationRequestInternal) (obj)).c && d == ((LocationRequestInternal) (obj)).d && e == ((LocationRequestInternal) (obj)).e && h == ((LocationRequestInternal) (obj)).h && ar.a(f, ((LocationRequestInternal) (obj)).f))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(b.toString());
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(c);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(d);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(e);
        stringbuilder.append(" hideFromAppOps=");
        stringbuilder.append(h);
        stringbuilder.append(" clients=");
        stringbuilder.append(f);
        if (g != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(g);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        w.a(this, parcel, j);
    }

}
