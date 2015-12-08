// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.InputStream;
import java.util.Collection;

public abstract class X509StreamParserSpi
{

    public X509StreamParserSpi()
    {
    }

    public abstract void engineInit(InputStream inputstream);

    public abstract Object engineRead();

    public abstract Collection engineReadAll();
}
