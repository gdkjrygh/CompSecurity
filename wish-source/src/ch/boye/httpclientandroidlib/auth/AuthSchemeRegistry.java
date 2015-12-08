// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth;

import ch.boye.httpclientandroidlib.params.HttpParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package ch.boye.httpclientandroidlib.auth:
//            AuthSchemeFactory, AuthScheme

public final class AuthSchemeRegistry
{

    private final ConcurrentHashMap registeredSchemes = new ConcurrentHashMap();

    public AuthSchemeRegistry()
    {
    }

    public AuthScheme getAuthScheme(String s, HttpParams httpparams)
        throws IllegalStateException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        }
        AuthSchemeFactory authschemefactory = (AuthSchemeFactory)registeredSchemes.get(s.toLowerCase(Locale.ENGLISH));
        if (authschemefactory != null)
        {
            return authschemefactory.newInstance(httpparams);
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Unsupported authentication scheme: ").append(s).toString());
        }
    }

    public List getSchemeNames()
    {
        return new ArrayList(registeredSchemes.keySet());
    }

    public void register(String s, AuthSchemeFactory authschemefactory)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (authschemefactory == null)
        {
            throw new IllegalArgumentException("Authentication scheme factory may not be null");
        } else
        {
            registeredSchemes.put(s.toLowerCase(Locale.ENGLISH), authschemefactory);
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
            registeredSchemes.clear();
            registeredSchemes.putAll(map);
            return;
        }
    }

    public void unregister(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        } else
        {
            registeredSchemes.remove(s.toLowerCase(Locale.ENGLISH));
            return;
        }
    }
}
