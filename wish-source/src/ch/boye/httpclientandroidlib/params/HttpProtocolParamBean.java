// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.params;

import ch.boye.httpclientandroidlib.HttpVersion;

// Referenced classes of package ch.boye.httpclientandroidlib.params:
//            HttpAbstractParamBean, HttpProtocolParams, HttpParams

public class HttpProtocolParamBean extends HttpAbstractParamBean
{

    public HttpProtocolParamBean(HttpParams httpparams)
    {
        super(httpparams);
    }

    public void setContentCharset(String s)
    {
        HttpProtocolParams.setContentCharset(params, s);
    }

    public void setHttpElementCharset(String s)
    {
        HttpProtocolParams.setHttpElementCharset(params, s);
    }

    public void setUseExpectContinue(boolean flag)
    {
        HttpProtocolParams.setUseExpectContinue(params, flag);
    }

    public void setUserAgent(String s)
    {
        HttpProtocolParams.setUserAgent(params, s);
    }

    public void setVersion(HttpVersion httpversion)
    {
        HttpProtocolParams.setVersion(params, httpversion);
    }
}
