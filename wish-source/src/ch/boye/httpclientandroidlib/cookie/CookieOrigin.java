// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.cookie;

import java.util.Locale;

public final class CookieOrigin
{

    private final String host;
    private final String path;
    private final int port;
    private final boolean secure;

    public CookieOrigin(String s, int i, String s1, boolean flag)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Host of origin may not be null");
        }
        if (s.trim().length() == 0)
        {
            throw new IllegalArgumentException("Host of origin may not be blank");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid port: ").append(i).toString());
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Path of origin may not be null.");
        }
        host = s.toLowerCase(Locale.ENGLISH);
        port = i;
        if (s1.trim().length() != 0)
        {
            path = s1;
        } else
        {
            path = "/";
        }
        secure = flag;
    }

    public String getHost()
    {
        return host;
    }

    public String getPath()
    {
        return path;
    }

    public int getPort()
    {
        return port;
    }

    public boolean isSecure()
    {
        return secure;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('[');
        if (secure)
        {
            stringbuilder.append("(secure)");
        }
        stringbuilder.append(host);
        stringbuilder.append(':');
        stringbuilder.append(Integer.toString(port));
        stringbuilder.append(path);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }
}
