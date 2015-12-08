// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.cookie;

import ch.boye.httpclientandroidlib.params.HttpParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package ch.boye.httpclientandroidlib.cookie:
//            CookieSpecFactory, CookieSpec

public final class CookieSpecRegistry
{

    private final ConcurrentHashMap registeredSpecs = new ConcurrentHashMap();

    public CookieSpecRegistry()
    {
    }

    public CookieSpec getCookieSpec(String s)
        throws IllegalStateException
    {
        return getCookieSpec(s, null);
    }

    public CookieSpec getCookieSpec(String s, HttpParams httpparams)
        throws IllegalStateException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        }
        CookieSpecFactory cookiespecfactory = (CookieSpecFactory)registeredSpecs.get(s.toLowerCase(Locale.ENGLISH));
        if (cookiespecfactory != null)
        {
            return cookiespecfactory.newInstance(httpparams);
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Unsupported cookie spec: ").append(s).toString());
        }
    }

    public List getSpecNames()
    {
        return new ArrayList(registeredSpecs.keySet());
    }

    public void register(String s, CookieSpecFactory cookiespecfactory)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (cookiespecfactory == null)
        {
            throw new IllegalArgumentException("Cookie spec factory may not be null");
        } else
        {
            registeredSpecs.put(s.toLowerCase(Locale.ENGLISH), cookiespecfactory);
            return;
        }
    }

    public void setItems(Map map)
    {
        if (map == null)
        {
            return;
        } else
        {
            registeredSpecs.clear();
            registeredSpecs.putAll(map);
            return;
        }
    }

    public void unregister(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Id may not be null");
        } else
        {
            registeredSpecs.remove(s.toLowerCase(Locale.ENGLISH));
            return;
        }
    }
}
