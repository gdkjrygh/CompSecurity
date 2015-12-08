// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.params;


// Referenced classes of package ch.boye.httpclientandroidlib.params:
//            HttpParams

public abstract class HttpAbstractParamBean
{

    protected final HttpParams params;

    public HttpAbstractParamBean(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            params = httpparams;
            return;
        }
    }
}
