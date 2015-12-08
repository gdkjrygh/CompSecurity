// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.MQVPrivateKey;

public class MQVPrivateKeySpec
    implements KeySpec, MQVPrivateKey
{

    private PrivateKey ephemeralPrivateKey;
    private PublicKey ephemeralPublicKey;
    private PrivateKey staticPrivateKey;

    public MQVPrivateKeySpec(PrivateKey privatekey, PrivateKey privatekey1)
    {
        this(privatekey, privatekey1, null);
    }

    public MQVPrivateKeySpec(PrivateKey privatekey, PrivateKey privatekey1, PublicKey publickey)
    {
        staticPrivateKey = privatekey;
        ephemeralPrivateKey = privatekey1;
        ephemeralPublicKey = publickey;
    }

    public String getAlgorithm()
    {
        return "ECMQV";
    }

    public byte[] getEncoded()
    {
        return null;
    }

    public PrivateKey getEphemeralPrivateKey()
    {
        return ephemeralPrivateKey;
    }

    public PublicKey getEphemeralPublicKey()
    {
        return ephemeralPublicKey;
    }

    public String getFormat()
    {
        return null;
    }

    public PrivateKey getStaticPrivateKey()
    {
        return staticPrivateKey;
    }
}
