// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.transport;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface ServiceConnection
{

    public abstract void connect()
        throws IOException;

    public abstract void disconnect()
        throws IOException;

    public abstract InputStream getErrorStream();

    public abstract InputStream openInputStream()
        throws IOException;

    public abstract OutputStream openOutputStream()
        throws IOException;

    public abstract void setRequestMethod(String s)
        throws IOException;

    public abstract void setRequestProperty(String s, String s1)
        throws IOException;
}
