// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

public class MultiCertStoreParameters
    implements CertStoreParameters
{

    private Collection certStores;
    private boolean searchAllStores;

    public MultiCertStoreParameters(Collection collection)
    {
        this(collection, true);
    }

    public MultiCertStoreParameters(Collection collection, boolean flag)
    {
        certStores = collection;
        searchAllStores = flag;
    }

    public Object clone()
    {
        return this;
    }

    public Collection getCertStores()
    {
        return certStores;
    }

    public boolean getSearchAllStores()
    {
        return searchAllStores;
    }
}
