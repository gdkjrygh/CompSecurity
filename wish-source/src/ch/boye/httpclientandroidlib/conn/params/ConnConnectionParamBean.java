// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.params;

import ch.boye.httpclientandroidlib.params.HttpAbstractParamBean;
import ch.boye.httpclientandroidlib.params.HttpParams;

public class ConnConnectionParamBean extends HttpAbstractParamBean
{

    public ConnConnectionParamBean(HttpParams httpparams)
    {
        super(httpparams);
    }

    public void setMaxStatusLineGarbage(int i)
    {
        params.setIntParameter("http.connection.max-status-line-garbage", i);
    }
}
