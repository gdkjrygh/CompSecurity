// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.cookie.CookieAttributeHandler;
import ch.boye.httpclientandroidlib.cookie.CookieSpec;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractCookieSpec
    implements CookieSpec
{

    private final Map attribHandlerMap = new HashMap(10);

    public AbstractCookieSpec()
    {
    }

    protected CookieAttributeHandler findAttribHandler(String s)
    {
        return (CookieAttributeHandler)attribHandlerMap.get(s);
    }

    protected CookieAttributeHandler getAttribHandler(String s)
    {
        CookieAttributeHandler cookieattributehandler = findAttribHandler(s);
        if (cookieattributehandler == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Handler not registered for ").append(s).append(" attribute.").toString());
        } else
        {
            return cookieattributehandler;
        }
    }

    protected Collection getAttribHandlers()
    {
        return attribHandlerMap.values();
    }

    public void registerAttribHandler(String s, CookieAttributeHandler cookieattributehandler)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Attribute name may not be null");
        }
        if (cookieattributehandler == null)
        {
            throw new IllegalArgumentException("Attribute handler may not be null");
        } else
        {
            attribHandlerMap.put(s, cookieattributehandler);
            return;
        }
    }
}
