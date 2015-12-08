// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.net;

import com.weather.dal2.exceptions.DalException;

// Referenced classes of package com.weather.dal2.net:
//            Receiver

public interface HttpGetRequest
{

    public abstract void asyncFetch(String s, boolean flag, Object obj, Receiver receiver);

    public abstract String fetch(String s, boolean flag)
        throws DalException;

    public abstract String fetchGoogleTWCUserAgentRequest(String s)
        throws DalException;

    public abstract int getContentLength();
}
