// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.internal:
//            hj, hx, ho, hv, 
//            ia, ge, gf, hw

public final class hu extends hj
    implements SafeParcelable
{

    public static final hx CREATOR = new hx();
    private final String FA;
    private final Uri FB;
    private final boolean FC;
    private final float FD;
    private final int FE;
    private final long FF;
    private final List FG;
    private final Map FH;
    private final TimeZone FI;
    private Locale FJ;
    private ia FK;
    private final Bundle Fv;
    private final hw Fw;
    private final LatLng Fx;
    private final float Fy;
    private final LatLngBounds Fz;
    final int jE;
    private final String zk;

    hu(int i, String s, List list, Bundle bundle, hw hw, LatLng latlng, float f, 
            LatLngBounds latlngbounds, String s1, Uri uri, boolean flag, float f1, int j, long l)
    {
        jE = i;
        zk = s;
        FG = Collections.unmodifiableList(list);
        Fv = bundle;
        Fw = hw;
        Fx = latlng;
        Fy = f;
        Fz = latlngbounds;
        FA = s1;
        FB = uri;
        FC = flag;
        FD = f1;
        FE = j;
        FF = l;
        s = new HashMap();
        for (list = bundle.keySet().iterator(); list.hasNext(); s.put(ho.aB(hw), bundle.getString(hw)))
        {
            hw = (String)list.next();
        }

        FH = Collections.unmodifiableMap(s);
        FI = TimeZone.getTimeZone(FA);
        FJ = null;
        FK = null;
    }

    private void aC(String s)
    {
        if (FK != null)
        {
            FK.a(new hv(zk, s));
        }
    }

    public final List dS()
    {
        aC("getTypes");
        return FG;
    }

    public final LatLng dT()
    {
        aC("getLatLng");
        return Fx;
    }

    public final float dU()
    {
        aC("getLevelNumber");
        return Fy;
    }

    public final LatLngBounds dV()
    {
        aC("getViewport");
        return Fz;
    }

    public final Uri dW()
    {
        aC("getWebsiteUri");
        return FB;
    }

    public final boolean dX()
    {
        aC("isPermanentlyClosed");
        return FC;
    }

    public final int dY()
    {
        aC("getPriceLevel");
        return FE;
    }

    public final long dZ()
    {
        return FF;
    }

    public final int describeContents()
    {
        hx hx1 = CREATOR;
        return 0;
    }

    public final Bundle ea()
    {
        return Fv;
    }

    public final hw eb()
    {
        return Fw;
    }

    public final String ec()
    {
        return FA;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hu))
            {
                return false;
            }
            obj = (hu)obj;
            if (!zk.equals(((hu) (obj)).zk) || !ge.a(FJ, ((hu) (obj)).FJ) || FF != ((hu) (obj)).FF)
            {
                return false;
            }
        }
        return true;
    }

    public final String getId()
    {
        aC("getId");
        return zk;
    }

    public final float getRating()
    {
        aC("getRating");
        return FD;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            zk, FJ, Long.valueOf(FF)
        });
    }

    public final String toString()
    {
        return ge.a(this).a("id", zk).a("localization", Fw).a("locale", FJ).a("latlng", Fx).a("levelNumber", Float.valueOf(Fy)).a("viewport", Fz).a("timeZone", FA).a("websiteUri", FB).a("isPermanentlyClosed", Boolean.valueOf(FC)).a("priceLevel", Integer.valueOf(FE)).a("timestampSecs", Long.valueOf(FF)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        hx hx1 = CREATOR;
        hx.a(this, parcel, i);
    }

}
