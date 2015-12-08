// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.scheme;

import java.io.IOException;
import java.net.InetAddress;

public interface HostNameResolver
{

    public abstract InetAddress resolve(String s)
        throws IOException;
}
