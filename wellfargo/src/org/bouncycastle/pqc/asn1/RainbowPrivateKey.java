// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.crypto.rainbow.Layer;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;

public class RainbowPrivateKey extends ASN1Object
{

    private byte b1[];
    private byte b2[];
    private byte invA1[][];
    private byte invA2[][];
    private Layer layers[];
    private ASN1ObjectIdentifier oid;
    private ASN1Integer version;
    private byte vi[];

    private RainbowPrivateKey(ASN1Sequence asn1sequence)
    {
        ASN1Sequence asn1sequence1;
        if (asn1sequence.getObjectAt(0) instanceof ASN1Integer)
        {
            version = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
        } else
        {
            oid = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
        }
        asn1sequence1 = (ASN1Sequence)asn1sequence.getObjectAt(1);
        invA1 = new byte[asn1sequence1.size()][];
        for (int i = 0; i < asn1sequence1.size(); i++)
        {
            invA1[i] = ((ASN1OctetString)asn1sequence1.getObjectAt(i)).getOctets();
        }

        b1 = ((ASN1OctetString)((ASN1Sequence)asn1sequence.getObjectAt(2)).getObjectAt(0)).getOctets();
        asn1sequence1 = (ASN1Sequence)asn1sequence.getObjectAt(3);
        invA2 = new byte[asn1sequence1.size()][];
        for (int j = 0; j < asn1sequence1.size(); j++)
        {
            invA2[j] = ((ASN1OctetString)asn1sequence1.getObjectAt(j)).getOctets();
        }

        b2 = ((ASN1OctetString)((ASN1Sequence)asn1sequence.getObjectAt(4)).getObjectAt(0)).getOctets();
        vi = ((ASN1OctetString)((ASN1Sequence)asn1sequence.getObjectAt(5)).getObjectAt(0)).getOctets();
        ASN1Sequence asn1sequence2 = (ASN1Sequence)asn1sequence.getObjectAt(6);
        asn1sequence = new byte[asn1sequence2.size()][][][];
        byte abyte0[][][][] = new byte[asn1sequence2.size()][][][];
        byte abyte1[][][] = new byte[asn1sequence2.size()][][];
        byte abyte2[][] = new byte[asn1sequence2.size()][];
        for (int k = 0; k < asn1sequence2.size(); k++)
        {
            ASN1Sequence asn1sequence3 = (ASN1Sequence)asn1sequence2.getObjectAt(k);
            ASN1Sequence asn1sequence4 = (ASN1Sequence)asn1sequence3.getObjectAt(0);
            asn1sequence[k] = new byte[asn1sequence4.size()][][];
            for (int i1 = 0; i1 < asn1sequence4.size(); i1++)
            {
                ASN1Sequence asn1sequence5 = (ASN1Sequence)asn1sequence4.getObjectAt(i1);
                asn1sequence[k][i1] = new byte[asn1sequence5.size()][];
                for (int i2 = 0; i2 < asn1sequence5.size(); i2++)
                {
                    asn1sequence[k][i1][i2] = ((ASN1OctetString)asn1sequence5.getObjectAt(i2)).getOctets();
                }

            }

            asn1sequence4 = (ASN1Sequence)asn1sequence3.getObjectAt(1);
            abyte0[k] = new byte[asn1sequence4.size()][][];
            for (int j1 = 0; j1 < asn1sequence4.size(); j1++)
            {
                ASN1Sequence asn1sequence6 = (ASN1Sequence)asn1sequence4.getObjectAt(j1);
                abyte0[k][j1] = new byte[asn1sequence6.size()][];
                for (int j2 = 0; j2 < asn1sequence6.size(); j2++)
                {
                    abyte0[k][j1][j2] = ((ASN1OctetString)asn1sequence6.getObjectAt(j2)).getOctets();
                }

            }

            asn1sequence4 = (ASN1Sequence)asn1sequence3.getObjectAt(2);
            abyte1[k] = new byte[asn1sequence4.size()][];
            for (int k1 = 0; k1 < asn1sequence4.size(); k1++)
            {
                abyte1[k][k1] = ((ASN1OctetString)asn1sequence4.getObjectAt(k1)).getOctets();
            }

            abyte2[k] = ((ASN1OctetString)asn1sequence3.getObjectAt(3)).getOctets();
        }

        int l1 = vi.length - 1;
        layers = new Layer[l1];
        for (int l = 0; l < l1; l++)
        {
            Layer layer = new Layer(vi[l], vi[l + 1], RainbowUtil.convertArray(asn1sequence[l]), RainbowUtil.convertArray(abyte0[l]), RainbowUtil.convertArray(abyte1[l]), RainbowUtil.convertArray(abyte2[l]));
            layers[l] = layer;
        }

    }

    public RainbowPrivateKey(short aword0[][], short aword1[], short aword2[][], short aword3[], int ai[], Layer alayer[])
    {
        version = new ASN1Integer(1L);
        invA1 = RainbowUtil.convertArray(aword0);
        b1 = RainbowUtil.convertArray(aword1);
        invA2 = RainbowUtil.convertArray(aword2);
        b2 = RainbowUtil.convertArray(aword3);
        vi = RainbowUtil.convertIntArray(ai);
        layers = alayer;
    }

    public static RainbowPrivateKey getInstance(Object obj)
    {
        if (obj instanceof RainbowPrivateKey)
        {
            return (RainbowPrivateKey)obj;
        }
        if (obj != null)
        {
            return new RainbowPrivateKey(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public short[] getB1()
    {
        return RainbowUtil.convertArray(b1);
    }

    public short[] getB2()
    {
        return RainbowUtil.convertArray(b2);
    }

    public short[][] getInvA1()
    {
        return RainbowUtil.convertArray(invA1);
    }

    public short[][] getInvA2()
    {
        return RainbowUtil.convertArray(invA2);
    }

    public Layer[] getLayers()
    {
        return layers;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public int[] getVi()
    {
        return RainbowUtil.convertArraytoInt(vi);
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1;
        if (version != null)
        {
            asn1encodablevector.add(version);
        } else
        {
            asn1encodablevector.add(oid);
        }
        asn1encodablevector1 = new ASN1EncodableVector();
        for (int i = 0; i < invA1.length; i++)
        {
            asn1encodablevector1.add(new DEROctetString(invA1[i]));
        }

        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        asn1encodablevector1 = new ASN1EncodableVector();
        asn1encodablevector1.add(new DEROctetString(b1));
        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        asn1encodablevector1 = new ASN1EncodableVector();
        for (int j = 0; j < invA2.length; j++)
        {
            asn1encodablevector1.add(new DEROctetString(invA2[j]));
        }

        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        asn1encodablevector1 = new ASN1EncodableVector();
        asn1encodablevector1.add(new DEROctetString(b2));
        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        asn1encodablevector1 = new ASN1EncodableVector();
        asn1encodablevector1.add(new DEROctetString(vi));
        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        asn1encodablevector1 = new ASN1EncodableVector();
        for (int k = 0; k < layers.length; k++)
        {
            ASN1EncodableVector asn1encodablevector2 = new ASN1EncodableVector();
            Object obj = RainbowUtil.convertArray(layers[k].getCoeffAlpha());
            ASN1EncodableVector asn1encodablevector3 = new ASN1EncodableVector();
            for (int l = 0; l < obj.length; l++)
            {
                ASN1EncodableVector asn1encodablevector4 = new ASN1EncodableVector();
                for (int k1 = 0; k1 < obj[l].length; k1++)
                {
                    asn1encodablevector4.add(new DEROctetString(obj[l][k1]));
                }

                asn1encodablevector3.add(new DERSequence(asn1encodablevector4));
            }

            asn1encodablevector2.add(new DERSequence(asn1encodablevector3));
            obj = RainbowUtil.convertArray(layers[k].getCoeffBeta());
            asn1encodablevector3 = new ASN1EncodableVector();
            for (int i1 = 0; i1 < obj.length; i1++)
            {
                ASN1EncodableVector asn1encodablevector5 = new ASN1EncodableVector();
                for (int l1 = 0; l1 < obj[i1].length; l1++)
                {
                    asn1encodablevector5.add(new DEROctetString(obj[i1][l1]));
                }

                asn1encodablevector3.add(new DERSequence(asn1encodablevector5));
            }

            asn1encodablevector2.add(new DERSequence(asn1encodablevector3));
            obj = RainbowUtil.convertArray(layers[k].getCoeffGamma());
            asn1encodablevector3 = new ASN1EncodableVector();
            for (int j1 = 0; j1 < obj.length; j1++)
            {
                asn1encodablevector3.add(new DEROctetString(obj[j1]));
            }

            asn1encodablevector2.add(new DERSequence(asn1encodablevector3));
            asn1encodablevector2.add(new DEROctetString(RainbowUtil.convertArray(layers[k].getCoeffEta())));
            asn1encodablevector1.add(new DERSequence(asn1encodablevector2));
        }

        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        return new DERSequence(asn1encodablevector);
    }
}
