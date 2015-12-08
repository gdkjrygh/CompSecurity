// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.DerivationParameters;

public class DHKDFParameters
    implements DerivationParameters
{

    private ASN1ObjectIdentifier algorithm;
    private byte extraInfo[];
    private int keySize;
    private byte z[];

    public DHKDFParameters(DERObjectIdentifier derobjectidentifier, int i, byte abyte0[])
    {
        this(derobjectidentifier, i, abyte0, null);
    }

    public DHKDFParameters(DERObjectIdentifier derobjectidentifier, int i, byte abyte0[], byte abyte1[])
    {
        algorithm = new ASN1ObjectIdentifier(derobjectidentifier.getId());
        keySize = i;
        z = abyte0;
        extraInfo = abyte1;
    }

    public ASN1ObjectIdentifier getAlgorithm()
    {
        return algorithm;
    }

    public byte[] getExtraInfo()
    {
        return extraInfo;
    }

    public int getKeySize()
    {
        return keySize;
    }

    public byte[] getZ()
    {
        return z;
    }
}
