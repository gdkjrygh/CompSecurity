// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            ContentInfo

public class DigestedData extends ASN1Object
{

    private ASN1OctetString digest;
    private AlgorithmIdentifier digestAlgorithm;
    private ContentInfo encapContentInfo;
    private ASN1Integer version;

    private DigestedData(ASN1Sequence asn1sequence)
    {
        version = (ASN1Integer)asn1sequence.getObjectAt(0);
        digestAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(1));
        encapContentInfo = ContentInfo.getInstance(asn1sequence.getObjectAt(2));
        digest = ASN1OctetString.getInstance(asn1sequence.getObjectAt(3));
    }

    public DigestedData(AlgorithmIdentifier algorithmidentifier, ContentInfo contentinfo, byte abyte0[])
    {
        version = new ASN1Integer(0L);
        digestAlgorithm = algorithmidentifier;
        encapContentInfo = contentinfo;
        digest = new DEROctetString(abyte0);
    }

    public static DigestedData getInstance(Object obj)
    {
        if (obj instanceof DigestedData)
        {
            return (DigestedData)obj;
        }
        if (obj != null)
        {
            return new DigestedData(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static DigestedData getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public byte[] getDigest()
    {
        return digest.getOctets();
    }

    public AlgorithmIdentifier getDigestAlgorithm()
    {
        return digestAlgorithm;
    }

    public ContentInfo getEncapContentInfo()
    {
        return encapContentInfo;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(digestAlgorithm);
        asn1encodablevector.add(encapContentInfo);
        asn1encodablevector.add(digest);
        return new BERSequence(asn1encodablevector);
    }
}
