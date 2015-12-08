// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class OOBCertHash extends ASN1Object
{

    private CertId certId;
    private AlgorithmIdentifier hashAlg;
    private DERBitString hashVal;

    private OOBCertHash(ASN1Sequence asn1sequence)
    {
        int i = asn1sequence.size() - 1;
        hashVal = DERBitString.getInstance(asn1sequence.getObjectAt(i));
        i--;
        while (i >= 0) 
        {
            ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)asn1sequence.getObjectAt(i);
            if (asn1taggedobject.getTagNo() == 0)
            {
                hashAlg = AlgorithmIdentifier.getInstance(asn1taggedobject, true);
            } else
            {
                certId = CertId.getInstance(asn1taggedobject, true);
            }
            i--;
        }
    }

    public OOBCertHash(AlgorithmIdentifier algorithmidentifier, CertId certid, DERBitString derbitstring)
    {
        hashAlg = algorithmidentifier;
        certId = certid;
        hashVal = derbitstring;
    }

    public OOBCertHash(AlgorithmIdentifier algorithmidentifier, CertId certid, byte abyte0[])
    {
        this(algorithmidentifier, certid, new DERBitString(abyte0));
    }

    private void addOptional(ASN1EncodableVector asn1encodablevector, int i, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, i, asn1encodable));
        }
    }

    public static OOBCertHash getInstance(Object obj)
    {
        if (obj instanceof OOBCertHash)
        {
            return (OOBCertHash)obj;
        }
        if (obj != null)
        {
            return new OOBCertHash(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CertId getCertId()
    {
        return certId;
    }

    public AlgorithmIdentifier getHashAlg()
    {
        return hashAlg;
    }

    public DERBitString getHashVal()
    {
        return hashVal;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        addOptional(asn1encodablevector, 0, hashAlg);
        addOptional(asn1encodablevector, 1, certId);
        asn1encodablevector.add(hashVal);
        return new DERSequence(asn1encodablevector);
    }
}
