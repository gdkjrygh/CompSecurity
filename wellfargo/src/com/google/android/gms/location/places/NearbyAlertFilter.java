// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            c, f

public final class NearbyAlertFilter extends c
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    final int a;
    final List b;
    final List c;
    final List d;
    private final Set e;
    private final Set f;
    private final Set g;

    NearbyAlertFilter(int i, List list, List list1, List list2)
    {
        a = i;
        if (list1 == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = Collections.unmodifiableList(list1);
        }
        c = list1;
        if (list2 == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = Collections.unmodifiableList(list2);
        }
        d = list1;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        b = list;
        f = a(c);
        g = a(d);
        e = a(b);
    }

    public static NearbyAlertFilter a(Collection collection, Collection collection1, Collection collection2)
    {
        if ((collection == null || collection.isEmpty()) && (collection1 == null || collection1.isEmpty()) && (collection2 == null || collection2.isEmpty()))
        {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least onePlaceId, PlaceType, or UserDataType to match results with.");
        } else
        {
            return new NearbyAlertFilter(0, a(collection), a(collection1), a(collection2));
        }
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
            if (!(obj instanceof NearbyAlertFilter))
            {
                return false;
            }
            obj = (NearbyAlertFilter)obj;
            if (!f.equals(((NearbyAlertFilter) (obj)).f) || !g.equals(((NearbyAlertFilter) (obj)).g) || !e.equals(((NearbyAlertFilter) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            f, g, e
        });
    }

    public String toString()
    {
        at at1 = ar.a(this);
        if (!f.isEmpty())
        {
            at1.a("types", f);
        }
        if (!e.isEmpty())
        {
            at1.a("placeIds", e);
        }
        if (!g.isEmpty())
        {
            at1.a("requestedUserDataTypes", g);
        }
        return at1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f f1 = CREATOR;
        com.google.android.gms.location.places.f.a(this, parcel, i);
    }

}
