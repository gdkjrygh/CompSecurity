// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;

public final class Protocol extends Enum
{

    private static final Protocol $VALUES[];
    public static final Protocol HTTP_1_0;
    public static final Protocol HTTP_1_1;
    public static final Protocol HTTP_2;
    public static final Protocol SPDY_3;
    private final String protocol;

    private Protocol(String s, int i, String s1)
    {
        super(s, i);
        protocol = s1;
    }

    public static Protocol get(String s)
        throws IOException
    {
        if (s.equals(HTTP_1_0.protocol))
        {
            return HTTP_1_0;
        }
        if (s.equals(HTTP_1_1.protocol))
        {
            return HTTP_1_1;
        }
        if (s.equals(HTTP_2.protocol))
        {
            return HTTP_2;
        }
        if (s.equals(SPDY_3.protocol))
        {
            return SPDY_3;
        } else
        {
            throw new IOException((new StringBuilder()).append("Unexpected protocol: ").append(s).toString());
        }
    }

    public static Protocol valueOf(String s)
    {
        return (Protocol)Enum.valueOf(com/squareup/okhttp/Protocol, s);
    }

    public static Protocol[] values()
    {
        return (Protocol[])$VALUES.clone();
    }

    public String toString()
    {
        return protocol;
    }

    static 
    {
        HTTP_1_0 = new Protocol("HTTP_1_0", 0, "http/1.0");
        HTTP_1_1 = new Protocol("HTTP_1_1", 1, "http/1.1");
        SPDY_3 = new Protocol("SPDY_3", 2, "spdy/3.1");
        HTTP_2 = new Protocol("HTTP_2", 3, "h2");
        $VALUES = (new Protocol[] {
            HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2
        });
    }
}
