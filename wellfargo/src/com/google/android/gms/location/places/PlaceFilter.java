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
//            c, h

public final class PlaceFilter extends c
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    final int a;
    final List b;
    final boolean c;
    final List d;
    final List e;
    private final Set f;
    private final Set g;
    private final Set h;

    public PlaceFilter()
    {
        this(false, null);
    }

    PlaceFilter(int i, List list, boolean flag, List list1, List list2)
    {
        a = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        b = list;
        c = flag;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        d = list;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        e = list;
        f = a(b);
        g = a(d);
        h = a(e);
    }

    public PlaceFilter(Collection collection, boolean flag, Collection collection1, Collection collection2)
    {
        this(0, a(collection), flag, a(collection1), a(collection2));
    }

    public PlaceFilter(boolean flag, Collection collection)
    {
        this(null, flag, collection, null);
    }

    public Set a()
    {
        return h;
    }

    public Set b()
    {
        return f;
    }

    public Set c()
    {
        return g;
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
            if (!(obj instanceof PlaceFilter))
            {
                return false;
            }
            obj = (PlaceFilter)obj;
            if (!f.equals(((PlaceFilter) (obj)).f) || c != ((PlaceFilter) (obj)).c || !g.equals(((PlaceFilter) (obj)).g) || !h.equals(((PlaceFilter) (obj)).h))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            f, Boolean.valueOf(c), g, h
        });
    }

    public String toString()
    {
        at at1 = ar.a(this);
        if (!f.isEmpty())
        {
            at1.a("types", f);
        }
        at1.a("requireOpenNow", Boolean.valueOf(c));
        if (!h.isEmpty())
        {
            at1.a("placeIds", h);
        }
        if (!g.isEmpty())
        {
            at1.a("requestedUserDataTypes", g);
        }
        return at1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h h1 = CREATOR;
        com.google.android.gms.location.places.h.a(this, parcel, i);
    }

}
