// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            g, PlaceFilter, NearbyAlertFilter

public final class NearbyAlertRequest
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    private final int a;
    private final int b;
    private final int c;
    private final PlaceFilter d = null;
    private final NearbyAlertFilter e;
    private final boolean f;

    NearbyAlertRequest(int i, int j, int k, PlaceFilter placefilter, NearbyAlertFilter nearbyalertfilter, boolean flag)
    {
        a = i;
        b = j;
        c = k;
        f = flag;
        if (nearbyalertfilter != null)
        {
            e = nearbyalertfilter;
        } else
        if (placefilter != null)
        {
            if (a(placefilter))
            {
                e = NearbyAlertFilter.a(placefilter.a(), placefilter.b(), placefilter.c());
            } else
            {
                e = null;
            }
        } else
        {
            e = null;
        }
    }

    public static boolean a(PlaceFilter placefilter)
    {
        return placefilter.b() != null && !placefilter.b().isEmpty() || placefilter.a() != null && !placefilter.a().isEmpty() || placefilter.c() != null && !placefilter.c().isEmpty();
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public PlaceFilter d()
    {
        return d;
    }

    public int describeContents()
    {
        g g1 = CREATOR;
        return 0;
    }

    public NearbyAlertFilter e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof NearbyAlertRequest))
            {
                return false;
            }
            obj = (NearbyAlertRequest)obj;
            if (b != ((NearbyAlertRequest) (obj)).b || c != ((NearbyAlertRequest) (obj)).c || !ar.a(d, ((NearbyAlertRequest) (obj)).d) || !ar.a(e, ((NearbyAlertRequest) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public boolean f()
    {
        return f;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c)
        });
    }

    public String toString()
    {
        return ar.a(this).a("transitionTypes", Integer.valueOf(b)).a("loiteringTimeMillis", Integer.valueOf(c)).a("nearbyAlertFilter", e).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g g1 = CREATOR;
        g.a(this, parcel, i);
    }

}
