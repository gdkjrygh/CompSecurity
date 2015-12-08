// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            OtherHashAlgAndValue

public class OtherHash extends ASN1Object
    implements ASN1Choice
{

    private OtherHashAlgAndValue otherHash;
    private ASN1OctetString sha1Hash;

    private OtherHash(ASN1OctetString asn1octetstring)
    {
        sha1Hash = asn1octetstring;
    }

    public OtherHash(OtherHashAlgAndValue otherhashalgandvalue)
    {
        otherHash = otherhashalgandvalue;
    }

    public OtherHash(byte abyte0[])
    {
        sha1Hash = new DEROctetString(abyte0);
    }

    public static OtherHash getInstance(Object obj)
    {
        if (obj instanceof OtherHash)
        {
            return (OtherHash)obj;
        }
        if (obj instanceof ASN1OctetString)
        {
            return new OtherHash((ASN1OctetString)obj);
        } else
        {
            return new OtherHash(OtherHashAlgAndValue.getInstance(obj));
        }
    }

    public AlgorithmIdentifier getHashAlgorithm()
    {
        if (otherHash == null)
        {
            return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1);
        } else
        {
            return otherHash.getHashAlgorithm();
        }
    }

    public byte[] getHashValue()
    {
        if (otherHash == null)
        {
            return sha1Hash.getOctets();
        } else
        {
            return otherHash.getHashValue().getOctets();
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (otherHash == null)
        {
            return sha1Hash;
        } else
        {
            return otherHash.toASN1Primitive();
        }
    }
}
