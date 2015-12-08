// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class PBMParameter extends ASN1Object
{

    private ASN1Integer iterationCount;
    private AlgorithmIdentifier mac;
    private AlgorithmIdentifier owf;
    private ASN1OctetString salt;

    public PBMParameter(ASN1OctetString asn1octetstring, AlgorithmIdentifier algorithmidentifier, ASN1Integer asn1integer, AlgorithmIdentifier algorithmidentifier1)
    {
        salt = asn1octetstring;
        owf = algorithmidentifier;
        iterationCount = asn1integer;
        mac = algorithmidentifier1;
    }

    private PBMParameter(ASN1Sequence asn1sequence)
    {
        salt = ASN1OctetString.getInstance(asn1sequence.getObjectAt(0));
        owf = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(1));
        iterationCount = ASN1Integer.getInstance(asn1sequence.getObjectAt(2));
        mac = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(3));
    }

    public PBMParameter(byte abyte0[], AlgorithmIdentifier algorithmidentifier, int i, AlgorithmIdentifier algorithmidentifier1)
    {
        this(((ASN1OctetString) (new DEROctetString(abyte0))), algorithmidentifier, new ASN1Integer(i), algorithmidentifier1);
    }

    public static PBMParameter getInstance(Object obj)
    {
        if (obj instanceof PBMParameter)
        {
            return (PBMParameter)obj;
        }
        if (obj != null)
        {
            return new PBMParameter(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer getIterationCount()
    {
        return iterationCount;
    }

    public AlgorithmIdentifier getMac()
    {
        return mac;
    }

    public AlgorithmIdentifier getOwf()
    {
        return owf;
    }

    public ASN1OctetString getSalt()
    {
        return salt;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(salt);
        asn1encodablevector.add(owf);
        asn1encodablevector.add(iterationCount);
        asn1encodablevector.add(mac);
        return new DERSequence(asn1encodablevector);
    }
}
