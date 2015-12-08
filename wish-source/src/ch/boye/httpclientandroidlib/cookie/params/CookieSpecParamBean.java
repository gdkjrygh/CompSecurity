// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.cookie.params;

import ch.boye.httpclientandroidlib.params.HttpAbstractParamBean;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.util.Collection;

public class CookieSpecParamBean extends HttpAbstractParamBean
{

    public CookieSpecParamBean(HttpParams httpparams)
    {
        super(httpparams);
    }

    public void setDatePatterns(Collection collection)
    {
        params.setParameter("http.protocol.cookie-datepatterns", collection);
    }

    public void setSingleHeader(boolean flag)
    {
        params.setBooleanParameter("http.protocol.single-cookie-header", flag);
    }
}
