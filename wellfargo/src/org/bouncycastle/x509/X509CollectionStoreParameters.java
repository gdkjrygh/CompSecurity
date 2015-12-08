// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package org.bouncycastle.x509:
//            X509StoreParameters

public class X509CollectionStoreParameters
    implements X509StoreParameters
{

    private Collection collection;

    public X509CollectionStoreParameters(Collection collection1)
    {
        if (collection1 == null)
        {
            throw new NullPointerException("collection cannot be null");
        } else
        {
            collection = collection1;
            return;
        }
    }

    public Object clone()
    {
        return new X509CollectionStoreParameters(collection);
    }

    public Collection getCollection()
    {
        return new ArrayList(collection);
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("X509CollectionStoreParameters: [\n");
        stringbuffer.append((new StringBuilder()).append("  collection: ").append(collection).append("\n").toString());
        stringbuffer.append("]");
        return stringbuffer.toString();
    }
}
