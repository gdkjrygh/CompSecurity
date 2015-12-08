// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntrySerializationException;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntrySerializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class DefaultHttpCacheEntrySerializer
    implements HttpCacheEntrySerializer
{

    public DefaultHttpCacheEntrySerializer()
    {
    }

    public HttpCacheEntry readFrom(InputStream inputstream)
        throws IOException
    {
        inputstream = new ObjectInputStream(inputstream);
        HttpCacheEntry httpcacheentry = (HttpCacheEntry)inputstream.readObject();
        inputstream.close();
        return httpcacheentry;
        Object obj;
        obj;
        throw new HttpCacheEntrySerializationException((new StringBuilder()).append("Class not found: ").append(((ClassNotFoundException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        obj;
        inputstream.close();
        throw obj;
    }

    public void writeTo(HttpCacheEntry httpcacheentry, OutputStream outputstream)
        throws IOException
    {
        outputstream = new ObjectOutputStream(outputstream);
        outputstream.writeObject(httpcacheentry);
        outputstream.close();
        return;
        httpcacheentry;
        outputstream.close();
        throw httpcacheentry;
    }
}
