// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.methods;

import ch.boye.httpclientandroidlib.HttpRequest;
import java.net.URI;

public interface HttpUriRequest
    extends HttpRequest
{

    public abstract void abort()
        throws UnsupportedOperationException;

    public abstract String getMethod();

    public abstract URI getURI();

    public abstract boolean isAborted();
}
