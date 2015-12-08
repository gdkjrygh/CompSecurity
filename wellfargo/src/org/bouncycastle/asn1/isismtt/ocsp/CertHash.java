// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class CertHash extends ASN1Object
{

    private byte certificateHash[];
    private AlgorithmIdentifier hashAlgorithm;

    private CertHash(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            hashAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(0));
            certificateHash = DEROctetString.getInstance(asn1sequence.getObjectAt(1)).getOctets();
            return;
        }
    }

    public CertHash(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        hashAlgorithm = algorithmidentifier;
        certificateHash = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, certificateHash, 0, abyte0.length);
    }

    public static CertHash getInstance(Object obj)
    {
        if (obj == null || (obj instanceof CertHash))
        {
            return (CertHash)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new CertHash((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public byte[] getCertificateHash()
    {
        return certificateHash;
    }

    public AlgorithmIdentifier getHashAlgorithm()
    {
        return hashAlgorithm;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(hashAlgorithm);
        asn1encodablevector.add(new DEROctetString(certificateHash));
        return new DERSequence(asn1encodablevector);
    }
}
