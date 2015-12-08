// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.DigestInfo;

public class MacData extends ASN1Object
{

    private static final BigInteger ONE = BigInteger.valueOf(1L);
    DigestInfo digInfo;
    BigInteger iterationCount;
    byte salt[];

    private MacData(ASN1Sequence asn1sequence)
    {
        digInfo = DigestInfo.getInstance(asn1sequence.getObjectAt(0));
        salt = ((ASN1OctetString)asn1sequence.getObjectAt(1)).getOctets();
        if (asn1sequence.size() == 3)
        {
            iterationCount = ((ASN1Integer)asn1sequence.getObjectAt(2)).getValue();
            return;
        } else
        {
            iterationCount = ONE;
            return;
        }
    }

    public MacData(DigestInfo digestinfo, byte abyte0[], int i)
    {
        digInfo = digestinfo;
        salt = abyte0;
        iterationCount = BigInteger.valueOf(i);
    }

    public static MacData getInstance(Object obj)
    {
        if (obj instanceof MacData)
        {
            return (MacData)obj;
        }
        if (obj != null)
        {
            return new MacData(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public BigInteger getIterationCount()
    {
        return iterationCount;
    }

    public DigestInfo getMac()
    {
        return digInfo;
    }

    public byte[] getSalt()
    {
        return salt;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(digInfo);
        asn1encodablevector.add(new DEROctetString(salt));
        if (!iterationCount.equals(ONE))
        {
            asn1encodablevector.add(new ASN1Integer(iterationCount));
        }
        return new DERSequence(asn1encodablevector);
    }

}
