// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AlgorithmIdentifier

public class DigestInfo extends ASN1Object
{

    private AlgorithmIdentifier algId;
    private byte digest[];

    public DigestInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        algId = AlgorithmIdentifier.getInstance(asn1sequence.nextElement());
        digest = ASN1OctetString.getInstance(asn1sequence.nextElement()).getOctets();
    }

    public DigestInfo(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        digest = abyte0;
        algId = algorithmidentifier;
    }

    public static DigestInfo getInstance(Object obj)
    {
        if (obj instanceof DigestInfo)
        {
            return (DigestInfo)obj;
        }
        if (obj != null)
        {
            return new DigestInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static DigestInfo getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public AlgorithmIdentifier getAlgorithmId()
    {
        return algId;
    }

    public byte[] getDigest()
    {
        return digest;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(algId);
        asn1encodablevector.add(new DEROctetString(digest));
        return new DERSequence(asn1encodablevector);
    }
}
