// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.cache;

import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.client.cache:
//            HttpCacheEntry

public interface HttpCacheUpdateCallback
{

    public abstract HttpCacheEntry update(HttpCacheEntry httpcacheentry)
        throws IOException;
}
