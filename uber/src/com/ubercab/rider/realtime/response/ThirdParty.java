// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import java.util.Map;

public abstract class ThirdParty
{

    public ThirdParty()
    {
    }

    public abstract Map getSignupAttributes();

    public abstract String getToken();

    public abstract String getUuid();

    public abstract ThirdParty setSignupAttributes(Map map);

    public abstract ThirdParty setToken(String s);

    public abstract ThirdParty setUuid(String s);
}
