// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.params;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package ch.boye.httpclientandroidlib.params:
//            AbstractHttpParams, HttpParamsNames, HttpParams

public final class DefaultedHttpParams extends AbstractHttpParams
{

    private final HttpParams defaults;
    private final HttpParams local;

    public DefaultedHttpParams(HttpParams httpparams, HttpParams httpparams1)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            local = httpparams;
            defaults = httpparams1;
            return;
        }
    }

    private Set getNames(HttpParams httpparams)
    {
        if (httpparams instanceof HttpParamsNames)
        {
            return ((HttpParamsNames)httpparams).getNames();
        } else
        {
            throw new UnsupportedOperationException("HttpParams instance does not implement HttpParamsNames");
        }
    }

    public HttpParams copy()
    {
        return new DefaultedHttpParams(local.copy(), defaults);
    }

    public Set getDefaultNames()
    {
        return new HashSet(getNames(defaults));
    }

    public HttpParams getDefaults()
    {
        return defaults;
    }

    public Set getLocalNames()
    {
        return new HashSet(getNames(local));
    }

    public Set getNames()
    {
        HashSet hashset = new HashSet(getNames(defaults));
        hashset.addAll(getNames(local));
        return hashset;
    }

    public Object getParameter(String s)
    {
        Object obj1 = local.getParameter(s);
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            if (defaults != null)
            {
                obj = defaults.getParameter(s);
            }
        }
        return obj;
    }

    public boolean removeParameter(String s)
    {
        return local.removeParameter(s);
    }

    public HttpParams setParameter(String s, Object obj)
    {
        return local.setParameter(s, obj);
    }
}
