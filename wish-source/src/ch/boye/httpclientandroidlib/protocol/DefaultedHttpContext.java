// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.protocol;


// Referenced classes of package ch.boye.httpclientandroidlib.protocol:
//            HttpContext

public final class DefaultedHttpContext
    implements HttpContext
{

    private final HttpContext defaults;
    private final HttpContext local;

    public DefaultedHttpContext(HttpContext httpcontext, HttpContext httpcontext1)
    {
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else
        {
            local = httpcontext;
            defaults = httpcontext1;
            return;
        }
    }

    public Object getAttribute(String s)
    {
        Object obj1 = local.getAttribute(s);
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = defaults.getAttribute(s);
        }
        return obj;
    }

    public HttpContext getDefaults()
    {
        return defaults;
    }

    public Object removeAttribute(String s)
    {
        return local.removeAttribute(s);
    }

    public void setAttribute(String s, Object obj)
    {
        local.setAttribute(s, obj);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[local: ").append(local);
        stringbuilder.append("defaults: ").append(defaults);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
