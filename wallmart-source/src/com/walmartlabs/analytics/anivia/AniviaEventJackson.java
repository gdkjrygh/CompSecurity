// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.analytics.anivia;

import com.walmartlabs.anivia.AniviaEvent;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

public abstract class AniviaEventJackson
    implements AniviaEvent
{

    private static final ThreadLocal sObjectMapper = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected ObjectMapper initialValue()
        {
            return new ObjectMapper();
        }

    };
    private long mEventTimeStamp;
    private String mName;

    protected AniviaEventJackson()
    {
    }

    public AniviaEventJackson(String s)
    {
        mName = s;
        mEventTimeStamp = System.currentTimeMillis();
    }

    public String toJson()
    {
        String s;
        try
        {
            s = ((ObjectMapper)sObjectMapper.get()).writeValueAsString(this);
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return null;
        }
        return s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Event [mName=").append(mName).append(", mEventTimeStamp=").append(mEventTimeStamp).append("]").toString();
    }

}
