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

public class RC2CBCParameter extends ASN1Object
{

    ASN1OctetString iv;
    ASN1Integer version;

    public RC2CBCParameter(int i, byte abyte0[])
    {
        version = new ASN1Integer(i);
        iv = new DEROctetString(abyte0);
    }

    private RC2CBCParameter(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() == 1)
        {
            version = null;
            iv = (ASN1OctetString)asn1sequence.getObjectAt(0);
            return;
        } else
        {
            version = (ASN1Integer)asn1sequence.getObjectAt(0);
            iv = (ASN1OctetString)asn1sequence.getObjectAt(1);
            return;
        }
    }

    public RC2CBCParameter(byte abyte0[])
    {
        version = null;
        iv = new DEROctetString(abyte0);
    }

    public static RC2CBCParameter getInstance(Object obj)
    {
        if (obj instanceof RC2CBCParameter)
        {
            return (RC2CBCParameter)obj;
        }
        if (obj != null)
        {
            return new RC2CBCParameter(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public byte[] getIV()
    {
        return iv.getOctets();
    }

    public BigInteger getRC2ParameterVersion()
    {
        if (version == null)
        {
            return null;
        } else
        {
            return version.getValue();
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (version != null)
        {
            asn1encodablevector.add(version);
        }
        asn1encodablevector.add(iv);
        return new DERSequence(asn1encodablevector);
    }
}
