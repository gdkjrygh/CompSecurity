// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.mapbar.android.location:
//            j, g, h, u

public final class Geocoder
{

    private j a;

    public Geocoder(Context context)
    {
        this(context, Locale.getDefault());
    }

    public Geocoder(Context context, Locale locale)
    {
        if (locale == null)
        {
            throw new NullPointerException("locale == null");
        } else
        {
            a = new j(context, locale);
            return;
        }
    }

    public final List getFromLocation(double d, double d1, int i)
        throws IOException
    {
        if (d < -90D || d > 90D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("latitude == ").append(d).toString());
        }
        if (d1 < -180D || d1 > 180D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("longitude == ").append(d1).toString());
        }
        Object obj;
        Object obj1;
        obj1 = a;
        obj = new ArrayList();
        if (!g.b || i == 0)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        int k = (int)(d1 * 100000D);
        int l = (int)(d * 100000D);
        String s;
        try
        {
            s = (new StringBuilder()).append("http://wireless.mapbar.com/reverse/reverseGeocoding.json?q=").append(h.a(k)).append(",").append(h.a(l)).append("&gb=02&ch=GBK&rn=").append(i).append("&nq=2&format=true").toString();
            u u1 = new u(((j) (obj1)).a, 3, 0);
            u1.a(s);
            s = (String)u1.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("Geocoder", "getFromLocation: got Exception", ((Throwable) (obj)));
            return null;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        obj1 = h.a(((j) (obj1)).b, s);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        if (((List) (obj1)).size() > 0)
        {
            ((List) (obj)).addAll(((java.util.Collection) (obj1)));
        }
        return ((List) (obj));
        return ((List) (obj));
    }

    public final List getFromLocationName(String s, int i)
        throws IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("locationName == null");
        }
        try
        {
            s = a.a(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Geocoder", "getFromLocationName: got Exception", s);
            return null;
        }
        return s;
    }

    public final List getFromLocationName(String s, int i, double d, double d1, double d2, double d3)
        throws IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("locationName == null");
        }
        if (d < -90D || d > 90D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("lowerLeftLatitude == ").append(d).toString());
        }
        if (d1 < -180D || d1 > 180D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("lowerLeftLongitude == ").append(d1).toString());
        }
        if (d2 < -90D || d2 > 90D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("upperRightLatitude == ").append(d2).toString());
        }
        if (d3 < -180D || d3 > 180D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("upperRightLongitude == ").append(d3).toString());
        }
        if (d != 0.0D || d1 != 0.0D || d2 != 0.0D || d3 != 0.0D)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        return a.a(s, i);
        ArrayList arraylist;
        j j1;
        j1 = a;
        arraylist = new ArrayList();
        if (!g.b)
        {
            return arraylist;
        }
        StringBuilder stringbuilder;
        int k;
        int l;
        int i1;
        int k1;
        try
        {
            i1 = (int)(((d1 + d3) / 2D) * 100000D);
            k1 = (int)(((d + d2) / 2D) * 100000D);
            l = Math.max((int)(((d3 - d1) / 2D) * 100000D), (int)(((d2 - d) / 2D) * 100000D));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Geocoder", "getFromLocationName: got Exception", s);
            return null;
        }
        k = l;
        if (l < 500)
        {
            k = 500;
        }
        stringbuilder = new StringBuilder();
        stringbuilder.append(j1.a()).append("ch=UTF-8&fd=5&rn=").append(i).append("&pn=1&tp=2&cp=").append(h.a(i1)).append(",").append(h.a(k1)).append("&m=").append(k).append("&q=").append(URLEncoder.encode(s, "utf-8"));
        s = new u(j1.a, 3, 0);
        s.a(stringbuilder.toString());
        s = (String)s.a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        s = h.b(j1.b, s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        arraylist.addAll(s);
        return arraylist;
    }
}
