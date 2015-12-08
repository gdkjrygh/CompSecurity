// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.asn1;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;

public class RainbowPublicKey extends ASN1Object
{

    private byte coeffQuadratic[][];
    private byte coeffScalar[];
    private byte coeffSingular[][];
    private ASN1Integer docLength;
    private ASN1ObjectIdentifier oid;
    private ASN1Integer version;

    public RainbowPublicKey(int i, short aword0[][], short aword1[][], short aword2[])
    {
        version = new ASN1Integer(0L);
        docLength = new ASN1Integer(i);
        coeffQuadratic = RainbowUtil.convertArray(aword0);
        coeffSingular = RainbowUtil.convertArray(aword1);
        coeffScalar = RainbowUtil.convertArray(aword2);
    }

    private RainbowPublicKey(ASN1Sequence asn1sequence)
    {
        ASN1Sequence asn1sequence1;
        if (asn1sequence.getObjectAt(0) instanceof ASN1Integer)
        {
            version = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
        } else
        {
            oid = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
        }
        docLength = ASN1Integer.getInstance(asn1sequence.getObjectAt(1));
        asn1sequence1 = ASN1Sequence.getInstance(asn1sequence.getObjectAt(2));
        coeffQuadratic = new byte[asn1sequence1.size()][];
        for (int i = 0; i < asn1sequence1.size(); i++)
        {
            coeffQuadratic[i] = ASN1OctetString.getInstance(asn1sequence1.getObjectAt(i)).getOctets();
        }

        asn1sequence1 = (ASN1Sequence)asn1sequence.getObjectAt(3);
        coeffSingular = new byte[asn1sequence1.size()][];
        for (int j = 0; j < asn1sequence1.size(); j++)
        {
            coeffSingular[j] = ASN1OctetString.getInstance(asn1sequence1.getObjectAt(j)).getOctets();
        }

        coeffScalar = ASN1OctetString.getInstance(((ASN1Sequence)asn1sequence.getObjectAt(4)).getObjectAt(0)).getOctets();
    }

    public static RainbowPublicKey getInstance(Object obj)
    {
        if (obj instanceof RainbowPublicKey)
        {
            return (RainbowPublicKey)obj;
        }
        if (obj != null)
        {
            return new RainbowPublicKey(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public short[][] getCoeffQuadratic()
    {
        return RainbowUtil.convertArray(coeffQuadratic);
    }

    public short[] getCoeffScalar()
    {
        return RainbowUtil.convertArray(coeffScalar);
    }

    public short[][] getCoeffSingular()
    {
        return RainbowUtil.convertArray(coeffSingular);
    }

    public int getDocLength()
    {
        return docLength.getValue().intValue();
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        boolean flag = false;
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1;
        if (version != null)
        {
            asn1encodablevector.add(version);
        } else
        {
            asn1encodablevector.add(oid);
        }
        asn1encodablevector.add(docLength);
        asn1encodablevector1 = new ASN1EncodableVector();
        for (int i = 0; i < coeffQuadratic.length; i++)
        {
            asn1encodablevector1.add(new DEROctetString(coeffQuadratic[i]));
        }

        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        asn1encodablevector1 = new ASN1EncodableVector();
        for (int j = ((flag) ? 1 : 0); j < coeffSingular.length; j++)
        {
            asn1encodablevector1.add(new DEROctetString(coeffSingular[j]));
        }

        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        asn1encodablevector1 = new ASN1EncodableVector();
        asn1encodablevector1.add(new DEROctetString(coeffScalar));
        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        return new DERSequence(asn1encodablevector);
    }
}
