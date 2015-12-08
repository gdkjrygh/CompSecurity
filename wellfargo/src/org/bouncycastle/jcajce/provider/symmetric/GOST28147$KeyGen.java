// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class ator extends BaseKeyGenerator
{

    public ator()
    {
        this(256);
    }

    public <init>(int i)
    {
        super("GOST28147", i, new CipherKeyGenerator());
    }
}
