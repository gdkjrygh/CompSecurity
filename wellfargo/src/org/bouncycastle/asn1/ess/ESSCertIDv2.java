// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.IssuerSerial;

public class ESSCertIDv2 extends ASN1Object
{

    private static final AlgorithmIdentifier DEFAULT_ALG_ID;
    private byte certHash[];
    private AlgorithmIdentifier hashAlgorithm;
    private IssuerSerial issuerSerial;

    private ESSCertIDv2(ASN1Sequence asn1sequence)
    {
        int i = 0;
        super();
        if (asn1sequence.size() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        int j;
        if (asn1sequence.getObjectAt(0) instanceof ASN1OctetString)
        {
            hashAlgorithm = DEFAULT_ALG_ID;
        } else
        {
            hashAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(0).toASN1Primitive());
            i = 1;
        }
        j = i + 1;
        certHash = ASN1OctetString.getInstance(asn1sequence.getObjectAt(i).toASN1Primitive()).getOctets();
        if (asn1sequence.size() > j)
        {
            issuerSerial = IssuerSerial.getInstance(asn1sequence.getObjectAt(j));
        }
    }

    public ESSCertIDv2(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        this(algorithmidentifier, abyte0, null);
    }

    public ESSCertIDv2(AlgorithmIdentifier algorithmidentifier, byte abyte0[], IssuerSerial issuerserial)
    {
        if (algorithmidentifier == null)
        {
            hashAlgorithm = DEFAULT_ALG_ID;
        } else
        {
            hashAlgorithm = algorithmidentifier;
        }
        certHash = abyte0;
        issuerSerial = issuerserial;
    }

    public static ESSCertIDv2 getInstance(Object obj)
    {
        if (obj instanceof ESSCertIDv2)
        {
            return (ESSCertIDv2)obj;
        }
        if (obj != null)
        {
            return new ESSCertIDv2(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public byte[] getCertHash()
    {
        return certHash;
    }

    public AlgorithmIdentifier getHashAlgorithm()
    {
        return hashAlgorithm;
    }

    public IssuerSerial getIssuerSerial()
    {
        return issuerSerial;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (!hashAlgorithm.equals(DEFAULT_ALG_ID))
        {
            asn1encodablevector.add(hashAlgorithm);
        }
        asn1encodablevector.add((new DEROctetString(certHash)).toASN1Primitive());
        if (issuerSerial != null)
        {
            asn1encodablevector.add(issuerSerial);
        }
        return new DERSequence(asn1encodablevector);
    }

    static 
    {
        DEFAULT_ALG_ID = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
    }
}
