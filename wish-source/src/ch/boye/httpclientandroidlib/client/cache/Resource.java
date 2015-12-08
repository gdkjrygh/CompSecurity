// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.cache;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public interface Resource
    extends Serializable
{

    public abstract void dispose();

    public abstract InputStream getInputStream()
        throws IOException;

    public abstract long length();
}
