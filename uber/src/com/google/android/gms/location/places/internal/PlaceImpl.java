// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import asd;
import asg;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import wl;
import wm;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceLocalization

public final class PlaceImpl
    implements SafeParcelable
{

    public static final asd CREATOR = new asd();
    public final int a;
    public final boolean b;
    private final String c;
    private final Bundle d;
    private final PlaceLocalization e;
    private final LatLng f;
    private final float g;
    private final LatLngBounds h;
    private final String i;
    private final Uri j;
    private final boolean k;
    private final float l;
    private final int m;
    private final long n;
    private final List o;
    private final List p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final List u;
    private final Map v = Collections.unmodifiableMap(new HashMap());
    private final TimeZone w = null;
    private Locale x;
    private asg y;

    public PlaceImpl(int i1, String s1, List list, List list1, Bundle bundle, String s2, String s3, 
            String s4, String s5, List list2, LatLng latlng, float f1, LatLngBounds latlngbounds, String s6, 
            Uri uri, boolean flag, float f2, int j1, long l1, boolean flag1, 
            PlaceLocalization placelocalization)
    {
        a = i1;
        c = s1;
        p = Collections.unmodifiableList(list);
        o = list1;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        d = bundle;
        q = s2;
        r = s3;
        s = s4;
        t = s5;
        if (list2 == null)
        {
            list2 = Collections.emptyList();
        }
        u = list2;
        f = latlng;
        g = f1;
        h = latlngbounds;
        if (s6 == null)
        {
            s6 = "UTC";
        }
        i = s6;
        j = uri;
        k = flag;
        l = f2;
        m = j1;
        n = l1;
        x = null;
        b = flag1;
        e = placelocalization;
    }

    private void a(String s1)
    {
        if (b && y != null)
        {
            y.a(c, s1);
        }
    }

    public final String a()
    {
        a("getId");
        return c;
    }

    public final List b()
    {
        a("getPlaceTypes");
        return p;
    }

    public final List c()
    {
        a("getTypesDeprecated");
        return o;
    }

    public final String d()
    {
        a("getName");
        return q;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        a("getAddress");
        return r;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceImpl))
            {
                return false;
            }
            obj = (PlaceImpl)obj;
            if (!c.equals(((PlaceImpl) (obj)).c) || !wl.a(x, ((PlaceImpl) (obj)).x) || n != ((PlaceImpl) (obj)).n)
            {
                return false;
            }
        }
        return true;
    }

    public final LatLng f()
    {
        a("getLatLng");
        return f;
    }

    public final float g()
    {
        a("getLevelNumber");
        return g;
    }

    public final LatLngBounds h()
    {
        a("getViewport");
        return h;
    }

    public final int hashCode()
    {
        return wl.a(new Object[] {
            c, x, Long.valueOf(n)
        });
    }

    public final Uri i()
    {
        a("getWebsiteUri");
        return j;
    }

    public final String j()
    {
        a("getPhoneNumber");
        return s;
    }

    public final String k()
    {
        a("getRegularOpenHours");
        return t;
    }

    public final List l()
    {
        a("getAttributions");
        return u;
    }

    public final boolean m()
    {
        a("isPermanentlyClosed");
        return k;
    }

    public final float n()
    {
        a("getRating");
        return l;
    }

    public final int o()
    {
        a("getPriceLevel");
        return m;
    }

    public final long p()
    {
        return n;
    }

    public final Bundle q()
    {
        return d;
    }

    public final String r()
    {
        return i;
    }

    public final PlaceLocalization s()
    {
        a("getLocalization");
        return e;
    }

    public final String toString()
    {
        return wl.a(this).a("id", c).a("placeTypes", p).a("locale", x).a("name", q).a("address", r).a("phoneNumber", s).a("latlng", f).a("viewport", h).a("websiteUri", j).a("isPermanentlyClosed", Boolean.valueOf(k)).a("priceLevel", Integer.valueOf(m)).a("timestampSecs", Long.valueOf(n)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        asd.a(this, parcel, i1);
    }

}
