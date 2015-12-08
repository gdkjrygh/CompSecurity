// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import javax.crypto.SecretKey;

public class RepeatedSecretKeySpec
    implements SecretKey
{

    private String algorithm;

    public RepeatedSecretKeySpec(String s)
    {
        algorithm = s;
    }

    public String getAlgorithm()
    {
        return algorithm;
    }

    public byte[] getEncoded()
    {
        return null;
    }

    public String getFormat()
    {
        return null;
    }
}
