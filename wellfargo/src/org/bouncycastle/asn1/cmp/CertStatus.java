// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIStatusInfo

public class CertStatus extends ASN1Object
{

    private ASN1OctetString certHash;
    private ASN1Integer certReqId;
    private PKIStatusInfo statusInfo;

    private CertStatus(ASN1Sequence asn1sequence)
    {
        certHash = ASN1OctetString.getInstance(asn1sequence.getObjectAt(0));
        certReqId = ASN1Integer.getInstance(asn1sequence.getObjectAt(1));
        if (asn1sequence.size() > 2)
        {
            statusInfo = PKIStatusInfo.getInstance(asn1sequence.getObjectAt(2));
        }
    }

    public CertStatus(byte abyte0[], BigInteger biginteger)
    {
        certHash = new DEROctetString(abyte0);
        certReqId = new ASN1Integer(biginteger);
    }

    public CertStatus(byte abyte0[], BigInteger biginteger, PKIStatusInfo pkistatusinfo)
    {
        certHash = new DEROctetString(abyte0);
        certReqId = new ASN1Integer(biginteger);
        statusInfo = pkistatusinfo;
    }

    public static CertStatus getInstance(Object obj)
    {
        if (obj instanceof CertStatus)
        {
            return (CertStatus)obj;
        }
        if (obj != null)
        {
            return new CertStatus(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1OctetString getCertHash()
    {
        return certHash;
    }

    public ASN1Integer getCertReqId()
    {
        return certReqId;
    }

    public PKIStatusInfo getStatusInfo()
    {
        return statusInfo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certHash);
        asn1encodablevector.add(certReqId);
        if (statusInfo != null)
        {
            asn1encodablevector.add(statusInfo);
        }
        return new DERSequence(asn1encodablevector);
    }
}
