// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AlgorithmIdentifier, Time, SubjectPublicKeyInfo, Extensions

public class TBSCertificate extends ASN1Object
{

    Time endDate;
    Extensions extensions;
    X500Name issuer;
    DERBitString issuerUniqueId;
    ASN1Sequence seq;
    ASN1Integer serialNumber;
    AlgorithmIdentifier signature;
    Time startDate;
    X500Name subject;
    SubjectPublicKeyInfo subjectPublicKeyInfo;
    DERBitString subjectUniqueId;
    ASN1Integer version;

    private TBSCertificate(ASN1Sequence asn1sequence)
    {
        Object obj;
        seq = asn1sequence;
        int i;
        int j;
        if (asn1sequence.getObjectAt(0) instanceof DERTaggedObject)
        {
            version = ASN1Integer.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(0), true);
            i = 0;
        } else
        {
            version = new ASN1Integer(0L);
            i = -1;
        }
        serialNumber = ASN1Integer.getInstance(asn1sequence.getObjectAt(i + 1));
        signature = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(i + 2));
        issuer = X500Name.getInstance(asn1sequence.getObjectAt(i + 3));
        obj = (ASN1Sequence)asn1sequence.getObjectAt(i + 4);
        startDate = Time.getInstance(((ASN1Sequence) (obj)).getObjectAt(0));
        endDate = Time.getInstance(((ASN1Sequence) (obj)).getObjectAt(1));
        subject = X500Name.getInstance(asn1sequence.getObjectAt(i + 5));
        subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(asn1sequence.getObjectAt(i + 6));
        j = asn1sequence.size() - (i + 6) - 1;
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        obj = (DERTaggedObject)asn1sequence.getObjectAt(i + 6 + j);
        switch (((DERTaggedObject) (obj)).getTagNo())
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            subjectUniqueId = DERBitString.getInstance(((ASN1TaggedObject) (obj)), false);
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            break;
        }
        break MISSING_BLOCK_LABEL_258;
_L4:
        j--;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_157;
_L1:
        issuerUniqueId = DERBitString.getInstance(((ASN1TaggedObject) (obj)), false);
        continue; /* Loop/switch isn't completed */
        extensions = Extensions.getInstance(ASN1Sequence.getInstance(((ASN1TaggedObject) (obj)), true));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static TBSCertificate getInstance(Object obj)
    {
        if (obj instanceof TBSCertificate)
        {
            return (TBSCertificate)obj;
        }
        if (obj != null)
        {
            return new TBSCertificate(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static TBSCertificate getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public Time getEndDate()
    {
        return endDate;
    }

    public Extensions getExtensions()
    {
        return extensions;
    }

    public X500Name getIssuer()
    {
        return issuer;
    }

    public DERBitString getIssuerUniqueId()
    {
        return issuerUniqueId;
    }

    public ASN1Integer getSerialNumber()
    {
        return serialNumber;
    }

    public AlgorithmIdentifier getSignature()
    {
        return signature;
    }

    public Time getStartDate()
    {
        return startDate;
    }

    public X500Name getSubject()
    {
        return subject;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo()
    {
        return subjectPublicKeyInfo;
    }

    public DERBitString getSubjectUniqueId()
    {
        return subjectUniqueId;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public int getVersionNumber()
    {
        return version.getValue().intValue() + 1;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return seq;
    }
}
