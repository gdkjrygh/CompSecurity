// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

public class GMSSPublicKey extends ASN1Object
{

    private byte publicKey[];
    private ASN1Integer version;

    private GMSSPublicKey(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("size of seq = ").append(asn1sequence.size()).toString());
        } else
        {
            version = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
            publicKey = ASN1OctetString.getInstance(asn1sequence.getObjectAt(1)).getOctets();
            return;
        }
    }

    public GMSSPublicKey(byte abyte0[])
    {
        version = new ASN1Integer(0L);
        publicKey = abyte0;
    }

    public static GMSSPublicKey getInstance(Object obj)
    {
        if (obj instanceof GMSSPublicKey)
        {
            return (GMSSPublicKey)obj;
        }
        if (obj != null)
        {
            return new GMSSPublicKey(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public byte[] getPublicKey()
    {
        return Arrays.clone(publicKey);
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(new DEROctetString(publicKey));
        return new DERSequence(asn1encodablevector);
    }
}
