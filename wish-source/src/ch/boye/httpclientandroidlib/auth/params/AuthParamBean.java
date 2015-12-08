// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth.params;

import ch.boye.httpclientandroidlib.params.HttpAbstractParamBean;
import ch.boye.httpclientandroidlib.params.HttpParams;

// Referenced classes of package ch.boye.httpclientandroidlib.auth.params:
//            AuthParams

public class AuthParamBean extends HttpAbstractParamBean
{

    public AuthParamBean(HttpParams httpparams)
    {
        super(httpparams);
    }

    public void setCredentialCharset(String s)
    {
        AuthParams.setCredentialCharset(params, s);
    }
}
