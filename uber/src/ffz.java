// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.client.core.model.TaggedLocationDistanceConstraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class ffz
{

    private final chp a;
    private final Resources b;
    private final dal c;
    private TaggedLocationDistanceConstraints d;
    private boolean e;
    private Map f;

    public ffz(chp chp1, Resources resources, dal dal1, TaggedLocationDistanceConstraints taggedlocationdistanceconstraints)
    {
        f = new HashMap();
        a = chp1;
        b = resources;
        c = dal1;
        d = taggedlocationdistanceconstraints;
    }

    private void a(String s, LocationSearchResult locationsearchresult)
    {
        c.a(s, locationsearchresult);
    }

    private static boolean a(String s, String s1, LocationSearchResult locationsearchresult)
    {
        if (locationsearchresult != null)
        {
            Locale locale = Locale.getDefault();
            s = s.toLowerCase(locale);
            locationsearchresult = locationsearchresult.getTitle();
            boolean flag;
            boolean flag1;
            if (!TextUtils.isEmpty(locationsearchresult) && locationsearchresult.toLowerCase(locale).contains(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!TextUtils.isEmpty(s1) && s1.toLowerCase(locale).contains(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 || flag)
            {
                return true;
            }
        }
        return false;
    }

    private boolean c(RiderLocation riderlocation, LocationSearchResult locationsearchresult)
    {
        for (Integer integer = d.getMaximumPickupDistanceInMeters(); integer == null || riderlocation == null || UberLatLng.a(riderlocation.getUberLatLng(), locationsearchresult.getUberLatLng()) <= (double)integer.intValue();)
        {
            return true;
        }

        return false;
    }

    private boolean d(RiderLocation riderlocation, LocationSearchResult locationsearchresult)
    {
        for (Integer integer = d.getMinimumDropoffDistanceInMeters(); integer == null || riderlocation == null || UberLatLng.a(riderlocation.getUberLatLng(), locationsearchresult.getUberLatLng()) >= (double)integer.intValue();)
        {
            return true;
        }

        return false;
    }

    private boolean e(RiderLocation riderlocation, LocationSearchResult locationsearchresult)
    {
        for (Integer integer = d.getMaximumDropoffDistanceInMeters(); integer == null || riderlocation == null || UberLatLng.a(riderlocation.getUberLatLng(), locationsearchresult.getUberLatLng()) <= (double)integer.intValue();)
        {
            return true;
        }

        return false;
    }

    private void g(String s)
    {
        a.a(AnalyticsEvent.create("tap").setName(n.at).setValue(s));
    }

    public final void a()
    {
        c.J();
    }

    public final void a(Bundle bundle)
    {
        bundle.putBoolean("com.ubercab.BUNDLE_TAGGED_LOCATION", e);
    }

    public final void a(LocationSearchResult locationsearchresult, String s)
    {
        a(s, locationsearchresult);
    }

    public final void a(String s, boolean flag, int i)
    {
        l l1;
        if (flag)
        {
            l1 = l.bD;
        } else
        {
            l1 = l.bC;
        }
        a.a(AnalyticsEvent.create("impression").setName(l1).setValue(s).setValuePosition(Long.valueOf(i)));
    }

    public final void a(List list)
    {
        f.clear();
        String as[] = LocationSearchResult.HOME_WORK_TAGS;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            c.j(s);
        }

        if (list != null && !list.isEmpty())
        {
            a();
            ffy ffy1;
            for (list = list.iterator(); list.hasNext(); c.a(ffy1.b(), ffy1.c()))
            {
                ffy1 = (ffy)list.next();
                f.put(ffy1.b(), ffy1);
            }

        }
    }

    public final void a(boolean flag)
    {
        int i = f.size();
        if (flag && i == 0 && !b() && !e)
        {
            e = true;
            c.I();
        }
    }

    public final void a(boolean flag, String s, boolean flag1, int i)
    {
        n n1;
        if (flag)
        {
            if (flag1)
            {
                n1 = n.eW;
            } else
            {
                n1 = n.eX;
            }
        } else
        if (flag1)
        {
            n1 = n.eG;
        } else
        {
            n1 = n.eH;
        }
        a.a(AnalyticsEvent.create("tap").setName(n1).setValue(s).setValuePosition(Long.valueOf(i)));
    }

    public final boolean a(RiderLocation riderlocation, LocationSearchResult locationsearchresult)
    {
        if (d == null)
        {
            return true;
        } else
        {
            return c(riderlocation, locationsearchresult);
        }
    }

    public final boolean a(String s)
    {
        return f.containsKey(s);
    }

    public final ffy b(String s)
    {
        return (ffy)f.get(s);
    }

    public final void b(Bundle bundle)
    {
        e = bundle.getBoolean("com.ubercab.BUNDLE_TAGGED_LOCATION", false);
    }

    public final boolean b()
    {
        int i = b.getInteger(0x7f0b0012);
        return c.K() > i;
    }

    public final boolean b(RiderLocation riderlocation, LocationSearchResult locationsearchresult)
    {
        while (d == null || e(riderlocation, locationsearchresult) && d(riderlocation, locationsearchresult)) 
        {
            return true;
        }
        return false;
    }

    public final String c(String s)
    {
        if (LocationSearchResult.isTagHome(s))
        {
            return b.getString(0x7f07026c);
        }
        if (LocationSearchResult.isTagWork(s))
        {
            return b.getString(0x7f070672);
        } else
        {
            return null;
        }
    }

    public final List d(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (!f.isEmpty())
        {
            String as[] = LocationSearchResult.HOME_WORK_TAGS;
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s1 = as[i];
                ffy ffy1 = b(s1);
                if (ffy1 != null && a(s, c(s1), ffy1.c()))
                {
                    arraylist.add(ffy1);
                }
                i++;
            }
        }
        return arraylist;
    }

    public final void e(String s)
    {
        f(s);
    }

    public final void f(String s)
    {
        g(s);
        c.j(s);
    }
}
