// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;


// Referenced classes of package com.weather.util:
//            Postable

public abstract class AbstractPostable
    implements Postable
{

    protected String eventOrigin;

    public AbstractPostable()
    {
    }

    public String getOriginTag()
    {
        return eventOrigin;
    }

    public void setOriginTag(String s)
    {
        eventOrigin = s;
    }
}
