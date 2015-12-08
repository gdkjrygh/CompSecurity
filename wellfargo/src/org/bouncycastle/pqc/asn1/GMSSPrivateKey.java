// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.asn1;

import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.crypto.gmss.GMSSLeaf;
import org.bouncycastle.pqc.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc;
import org.bouncycastle.pqc.crypto.gmss.GMSSRootSig;
import org.bouncycastle.pqc.crypto.gmss.Treehash;

public class GMSSPrivateKey extends ASN1Object
{

    private ASN1Primitive primitive;

    private GMSSPrivateKey(ASN1Sequence asn1sequence)
    {
        ASN1Sequence asn1sequence1 = (ASN1Sequence)asn1sequence.getObjectAt(0);
        Object obj = new int[asn1sequence1.size()];
        for (int i = 0; i < asn1sequence1.size(); i++)
        {
            obj[i] = checkBigIntegerInIntRange(asn1sequence1.getObjectAt(i));
        }

        asn1sequence1 = (ASN1Sequence)asn1sequence.getObjectAt(1);
        obj = new byte[asn1sequence1.size()][];
        for (int j = 0; j < obj.length; j++)
        {
            obj[j] = ((DEROctetString)asn1sequence1.getObjectAt(j)).getOctets();
        }

        asn1sequence1 = (ASN1Sequence)asn1sequence.getObjectAt(2);
        obj = new byte[asn1sequence1.size()][];
        for (int k = 0; k < obj.length; k++)
        {
            obj[k] = ((DEROctetString)asn1sequence1.getObjectAt(k)).getOctets();
        }

        asn1sequence1 = (ASN1Sequence)asn1sequence.getObjectAt(3);
        obj = new byte[asn1sequence1.size()][][];
        for (int l = 0; l < obj.length; l++)
        {
            ASN1Sequence asn1sequence2 = (ASN1Sequence)asn1sequence1.getObjectAt(l);
            obj[l] = new byte[asn1sequence2.size()][];
            for (int j1 = 0; j1 < obj[l].length; j1++)
            {
                obj[l][j1] = ((DEROctetString)asn1sequence2.getObjectAt(j1)).getOctets();
            }

        }

        asn1sequence1 = (ASN1Sequence)asn1sequence.getObjectAt(4);
        byte abyte0[][][] = new byte[asn1sequence1.size()][][];
        for (int i1 = 0; i1 < abyte0.length; i1++)
        {
            ASN1Sequence asn1sequence3 = (ASN1Sequence)asn1sequence1.getObjectAt(i1);
            abyte0[i1] = new byte[asn1sequence3.size()][];
            for (int k1 = 0; k1 < abyte0[i1].length; k1++)
            {
                abyte0[i1][k1] = ((DEROctetString)asn1sequence3.getObjectAt(k1)).getOctets();
            }

        }

        asn1sequence = new Treehash[((ASN1Sequence)asn1sequence.getObjectAt(5)).size()][];
    }

    public GMSSPrivateKey(int ai[], byte abyte0[][], byte abyte1[][], byte abyte2[][][], byte abyte3[][][], Treehash atreehash[][], Treehash atreehash1[][], 
            Vector avector[], Vector avector1[], Vector avector2[][], Vector avector3[][], byte abyte4[][][], GMSSLeaf agmssleaf[], GMSSLeaf agmssleaf1[], 
            GMSSLeaf agmssleaf2[], int ai1[], byte abyte5[][], GMSSRootCalc agmssrootcalc[], byte abyte6[][], GMSSRootSig agmssrootsig[], GMSSParameters gmssparameters, 
            AlgorithmIdentifier algorithmidentifier)
    {
        primitive = encode(ai, abyte0, abyte1, abyte2, abyte3, abyte4, atreehash, atreehash1, avector, avector1, avector2, avector3, agmssleaf, agmssleaf1, agmssleaf2, ai1, abyte5, agmssrootcalc, abyte6, agmssrootsig, gmssparameters, new AlgorithmIdentifier[] {
            algorithmidentifier
        });
    }

    private static int checkBigIntegerInIntRange(ASN1Encodable asn1encodable)
    {
        asn1encodable = ((ASN1Integer)asn1encodable).getValue();
        if (asn1encodable.compareTo(BigInteger.valueOf(0x7fffffffL)) > 0 || asn1encodable.compareTo(BigInteger.valueOf(0xffffffff80000000L)) < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("BigInteger not in Range: ").append(asn1encodable.toString()).toString());
        } else
        {
            return asn1encodable.intValue();
        }
    }

    private ASN1Primitive encode(int ai[], byte abyte0[][], byte abyte1[][], byte abyte2[][][], byte abyte3[][][], byte abyte4[][][], Treehash atreehash[][], 
            Treehash atreehash1[][], Vector avector[], Vector avector1[], Vector avector2[][], Vector avector3[][], GMSSLeaf agmssleaf[], GMSSLeaf agmssleaf1[], 
            GMSSLeaf agmssleaf2[], int ai1[], byte abyte5[][], GMSSRootCalc agmssrootcalc[], byte abyte6[][], GMSSRootSig agmssrootsig[], GMSSParameters gmssparameters, 
            AlgorithmIdentifier aalgorithmidentifier[])
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        for (int i = 0; i < ai.length; i++)
        {
            asn1encodablevector1.add(new ASN1Integer(ai[i]));
        }

        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        ai = new ASN1EncodableVector();
        for (int j = 0; j < abyte0.length; j++)
        {
            ai.add(new DEROctetString(abyte0[j]));
        }

        asn1encodablevector.add(new DERSequence(ai));
        ai = new ASN1EncodableVector();
        for (int k = 0; k < abyte1.length; k++)
        {
            ai.add(new DEROctetString(abyte1[k]));
        }

        asn1encodablevector.add(new DERSequence(ai));
        ai = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        for (int l = 0; l < abyte2.length; l++)
        {
            for (int k5 = 0; k5 < abyte2[l].length; k5++)
            {
                ai.add(new DEROctetString(abyte2[l][k5]));
            }

            abyte0.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte0));
        ai = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        for (int i1 = 0; i1 < abyte3.length; i1++)
        {
            for (int l5 = 0; l5 < abyte3[i1].length; l5++)
            {
                ai.add(new DEROctetString(abyte3[i1][l5]));
            }

            abyte0.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte0));
        abyte3 = new ASN1EncodableVector();
        ai = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        abyte2 = new ASN1EncodableVector();
        abyte1 = new ASN1EncodableVector();
        for (int j1 = 0; j1 < atreehash.length; j1++)
        {
            for (int i6 = 0; i6 < atreehash[j1].length; i6++)
            {
                abyte0.add(new DERSequence(aalgorithmidentifier[0]));
                int l11 = atreehash[j1][i6].getStatInt()[1];
                abyte2.add(new DEROctetString(atreehash[j1][i6].getStatByte()[0]));
                abyte2.add(new DEROctetString(atreehash[j1][i6].getStatByte()[1]));
                abyte2.add(new DEROctetString(atreehash[j1][i6].getStatByte()[2]));
                for (int j9 = 0; j9 < l11; j9++)
                {
                    abyte2.add(new DEROctetString(atreehash[j1][i6].getStatByte()[j9 + 3]));
                }

                abyte0.add(new DERSequence(abyte2));
                abyte2 = new ASN1EncodableVector();
                abyte1.add(new ASN1Integer(atreehash[j1][i6].getStatInt()[0]));
                abyte1.add(new ASN1Integer(l11));
                abyte1.add(new ASN1Integer(atreehash[j1][i6].getStatInt()[2]));
                abyte1.add(new ASN1Integer(atreehash[j1][i6].getStatInt()[3]));
                abyte1.add(new ASN1Integer(atreehash[j1][i6].getStatInt()[4]));
                abyte1.add(new ASN1Integer(atreehash[j1][i6].getStatInt()[5]));
                for (int k9 = 0; k9 < l11; k9++)
                {
                    abyte1.add(new ASN1Integer(atreehash[j1][i6].getStatInt()[k9 + 6]));
                }

                abyte0.add(new DERSequence(abyte1));
                abyte1 = new ASN1EncodableVector();
                ai.add(new DERSequence(abyte0));
                abyte0 = new ASN1EncodableVector();
            }

            abyte3.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte3));
        abyte3 = new ASN1EncodableVector();
        ai = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        abyte2 = new ASN1EncodableVector();
        abyte1 = new ASN1EncodableVector();
        for (int k1 = 0; k1 < atreehash1.length; k1++)
        {
            for (int j6 = 0; j6 < atreehash1[k1].length; j6++)
            {
                abyte0.add(new DERSequence(aalgorithmidentifier[0]));
                int i12 = atreehash1[k1][j6].getStatInt()[1];
                abyte2.add(new DEROctetString(atreehash1[k1][j6].getStatByte()[0]));
                abyte2.add(new DEROctetString(atreehash1[k1][j6].getStatByte()[1]));
                abyte2.add(new DEROctetString(atreehash1[k1][j6].getStatByte()[2]));
                for (int l9 = 0; l9 < i12; l9++)
                {
                    abyte2.add(new DEROctetString(atreehash1[k1][j6].getStatByte()[l9 + 3]));
                }

                abyte0.add(new DERSequence(abyte2));
                abyte2 = new ASN1EncodableVector();
                abyte1.add(new ASN1Integer(atreehash1[k1][j6].getStatInt()[0]));
                abyte1.add(new ASN1Integer(i12));
                abyte1.add(new ASN1Integer(atreehash1[k1][j6].getStatInt()[2]));
                abyte1.add(new ASN1Integer(atreehash1[k1][j6].getStatInt()[3]));
                abyte1.add(new ASN1Integer(atreehash1[k1][j6].getStatInt()[4]));
                abyte1.add(new ASN1Integer(atreehash1[k1][j6].getStatInt()[5]));
                for (int i10 = 0; i10 < i12; i10++)
                {
                    abyte1.add(new ASN1Integer(atreehash1[k1][j6].getStatInt()[i10 + 6]));
                }

                abyte0.add(new DERSequence(abyte1));
                abyte1 = new ASN1EncodableVector();
                ai.add(new DERSequence(abyte0));
                abyte0 = new ASN1EncodableVector();
            }

            abyte3.add(new DERSequence(new DERSequence(ai)));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte3));
        ai = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        for (int l1 = 0; l1 < abyte4.length; l1++)
        {
            for (int k6 = 0; k6 < abyte4[l1].length; k6++)
            {
                ai.add(new DEROctetString(abyte4[l1][k6]));
            }

            abyte0.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte0));
        ai = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        for (int i2 = 0; i2 < avector.length; i2++)
        {
            for (int l6 = 0; l6 < avector[i2].size(); l6++)
            {
                ai.add(new DEROctetString((byte[])(byte[])avector[i2].elementAt(l6)));
            }

            abyte0.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte0));
        ai = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        for (int j2 = 0; j2 < avector1.length; j2++)
        {
            for (int i7 = 0; i7 < avector1[j2].size(); i7++)
            {
                ai.add(new DEROctetString((byte[])(byte[])avector1[j2].elementAt(i7)));
            }

            abyte0.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte0));
        ai = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        abyte1 = new ASN1EncodableVector();
        for (int k2 = 0; k2 < avector2.length; k2++)
        {
            for (int j7 = 0; j7 < avector2[k2].length; j7++)
            {
                for (int j10 = 0; j10 < avector2[k2][j7].size(); j10++)
                {
                    ai.add(new DEROctetString((byte[])(byte[])avector2[k2][j7].elementAt(j10)));
                }

                abyte0.add(new DERSequence(ai));
                ai = new ASN1EncodableVector();
            }

            abyte1.add(new DERSequence(abyte0));
            abyte0 = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte1));
        ai = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        abyte1 = new ASN1EncodableVector();
        for (int l2 = 0; l2 < avector3.length; l2++)
        {
            for (int k7 = 0; k7 < avector3[l2].length; k7++)
            {
                for (int k10 = 0; k10 < avector3[l2][k7].size(); k10++)
                {
                    ai.add(new DEROctetString((byte[])(byte[])avector3[l2][k7].elementAt(k10)));
                }

                abyte0.add(new DERSequence(ai));
                ai = new ASN1EncodableVector();
            }

            abyte1.add(new DERSequence(abyte0));
            abyte0 = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte1));
        abyte2 = new ASN1EncodableVector();
        ai = new ASN1EncodableVector();
        abyte1 = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        for (int i3 = 0; i3 < agmssleaf.length; i3++)
        {
            ai.add(new DERSequence(aalgorithmidentifier[0]));
            abyte3 = agmssleaf[i3].getStatByte();
            abyte1.add(new DEROctetString(abyte3[0]));
            abyte1.add(new DEROctetString(abyte3[1]));
            abyte1.add(new DEROctetString(abyte3[2]));
            abyte1.add(new DEROctetString(abyte3[3]));
            ai.add(new DERSequence(abyte1));
            abyte1 = new ASN1EncodableVector();
            abyte3 = agmssleaf[i3].getStatInt();
            abyte0.add(new ASN1Integer((long)abyte3[0]));
            abyte0.add(new ASN1Integer((long)abyte3[1]));
            abyte0.add(new ASN1Integer((long)abyte3[2]));
            abyte0.add(new ASN1Integer((long)abyte3[3]));
            ai.add(new DERSequence(abyte0));
            abyte0 = new ASN1EncodableVector();
            abyte2.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte2));
        abyte2 = new ASN1EncodableVector();
        ai = new ASN1EncodableVector();
        abyte1 = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        for (int j3 = 0; j3 < agmssleaf1.length; j3++)
        {
            ai.add(new DERSequence(aalgorithmidentifier[0]));
            abyte3 = agmssleaf1[j3].getStatByte();
            abyte1.add(new DEROctetString(abyte3[0]));
            abyte1.add(new DEROctetString(abyte3[1]));
            abyte1.add(new DEROctetString(abyte3[2]));
            abyte1.add(new DEROctetString(abyte3[3]));
            ai.add(new DERSequence(abyte1));
            abyte1 = new ASN1EncodableVector();
            abyte3 = agmssleaf1[j3].getStatInt();
            abyte0.add(new ASN1Integer((long)abyte3[0]));
            abyte0.add(new ASN1Integer((long)abyte3[1]));
            abyte0.add(new ASN1Integer((long)abyte3[2]));
            abyte0.add(new ASN1Integer((long)abyte3[3]));
            ai.add(new DERSequence(abyte0));
            abyte0 = new ASN1EncodableVector();
            abyte2.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte2));
        abyte2 = new ASN1EncodableVector();
        ai = new ASN1EncodableVector();
        abyte1 = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        for (int k3 = 0; k3 < agmssleaf2.length; k3++)
        {
            ai.add(new DERSequence(aalgorithmidentifier[0]));
            abyte3 = agmssleaf2[k3].getStatByte();
            abyte1.add(new DEROctetString(abyte3[0]));
            abyte1.add(new DEROctetString(abyte3[1]));
            abyte1.add(new DEROctetString(abyte3[2]));
            abyte1.add(new DEROctetString(abyte3[3]));
            ai.add(new DERSequence(abyte1));
            abyte1 = new ASN1EncodableVector();
            abyte3 = agmssleaf2[k3].getStatInt();
            abyte0.add(new ASN1Integer((long)abyte3[0]));
            abyte0.add(new ASN1Integer((long)abyte3[1]));
            abyte0.add(new ASN1Integer((long)abyte3[2]));
            abyte0.add(new ASN1Integer((long)abyte3[3]));
            ai.add(new DERSequence(abyte0));
            abyte0 = new ASN1EncodableVector();
            abyte2.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte2));
        ai = new ASN1EncodableVector();
        for (int l3 = 0; l3 < ai1.length; l3++)
        {
            ai.add(new ASN1Integer(ai1[l3]));
        }

        asn1encodablevector.add(new DERSequence(ai));
        ai = new ASN1EncodableVector();
        for (int i4 = 0; i4 < abyte5.length; i4++)
        {
            ai.add(new DEROctetString(abyte5[i4]));
        }

        asn1encodablevector.add(new DERSequence(ai));
        avector = new ASN1EncodableVector();
        ai = new ASN1EncodableVector();
        new ASN1EncodableVector();
        abyte3 = new ASN1EncodableVector();
        abyte2 = new ASN1EncodableVector();
        abyte1 = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        for (int j4 = 0; j4 < agmssrootcalc.length;)
        {
            ai.add(new DERSequence(aalgorithmidentifier[0]));
            new ASN1EncodableVector();
            int l10 = agmssrootcalc[j4].getStatInt()[0];
            int j12 = agmssrootcalc[j4].getStatInt()[7];
            abyte3.add(new DEROctetString(agmssrootcalc[j4].getStatByte()[0]));
            for (int l7 = 0; l7 < l10; l7++)
            {
                abyte3.add(new DEROctetString(agmssrootcalc[j4].getStatByte()[l7 + 1]));
            }

            for (int i8 = 0; i8 < j12; i8++)
            {
                abyte3.add(new DEROctetString(agmssrootcalc[j4].getStatByte()[l10 + 1 + i8]));
            }

            ai.add(new DERSequence(abyte3));
            atreehash = new ASN1EncodableVector();
            abyte2.add(new ASN1Integer(l10));
            abyte2.add(new ASN1Integer(agmssrootcalc[j4].getStatInt()[1]));
            abyte2.add(new ASN1Integer(agmssrootcalc[j4].getStatInt()[2]));
            abyte2.add(new ASN1Integer(agmssrootcalc[j4].getStatInt()[3]));
            abyte2.add(new ASN1Integer(agmssrootcalc[j4].getStatInt()[4]));
            abyte2.add(new ASN1Integer(agmssrootcalc[j4].getStatInt()[5]));
            abyte2.add(new ASN1Integer(agmssrootcalc[j4].getStatInt()[6]));
            abyte2.add(new ASN1Integer(j12));
            for (int j8 = 0; j8 < l10; j8++)
            {
                abyte2.add(new ASN1Integer(agmssrootcalc[j4].getStatInt()[j8 + 8]));
            }

            for (int k8 = 0; k8 < j12; k8++)
            {
                abyte2.add(new ASN1Integer(agmssrootcalc[j4].getStatInt()[l10 + 8 + k8]));
            }

            ai.add(new DERSequence(abyte2));
            atreehash1 = new ASN1EncodableVector();
            abyte2 = new ASN1EncodableVector();
            abyte4 = new ASN1EncodableVector();
            abyte3 = new ASN1EncodableVector();
            if (agmssrootcalc[j4].getTreehash() != null)
            {
                for (int l8 = 0; l8 < agmssrootcalc[j4].getTreehash().length; l8++)
                {
                    abyte2.add(new DERSequence(aalgorithmidentifier[0]));
                    int k12 = agmssrootcalc[j4].getTreehash()[l8].getStatInt()[1];
                    abyte4.add(new DEROctetString(agmssrootcalc[j4].getTreehash()[l8].getStatByte()[0]));
                    abyte4.add(new DEROctetString(agmssrootcalc[j4].getTreehash()[l8].getStatByte()[1]));
                    abyte4.add(new DEROctetString(agmssrootcalc[j4].getTreehash()[l8].getStatByte()[2]));
                    for (int i11 = 0; i11 < k12; i11++)
                    {
                        abyte4.add(new DEROctetString(agmssrootcalc[j4].getTreehash()[l8].getStatByte()[i11 + 3]));
                    }

                    abyte2.add(new DERSequence(abyte4));
                    abyte4 = new ASN1EncodableVector();
                    abyte3.add(new ASN1Integer(agmssrootcalc[j4].getTreehash()[l8].getStatInt()[0]));
                    abyte3.add(new ASN1Integer(k12));
                    abyte3.add(new ASN1Integer(agmssrootcalc[j4].getTreehash()[l8].getStatInt()[2]));
                    abyte3.add(new ASN1Integer(agmssrootcalc[j4].getTreehash()[l8].getStatInt()[3]));
                    abyte3.add(new ASN1Integer(agmssrootcalc[j4].getTreehash()[l8].getStatInt()[4]));
                    abyte3.add(new ASN1Integer(agmssrootcalc[j4].getTreehash()[l8].getStatInt()[5]));
                    for (int j11 = 0; j11 < k12; j11++)
                    {
                        abyte3.add(new ASN1Integer(agmssrootcalc[j4].getTreehash()[l8].getStatInt()[j11 + 6]));
                    }

                    abyte2.add(new DERSequence(abyte3));
                    abyte3 = new ASN1EncodableVector();
                    abyte1.add(new DERSequence(abyte2));
                    abyte2 = new ASN1EncodableVector();
                }

            }
            ai.add(new DERSequence(abyte1));
            abyte2 = new ASN1EncodableVector();
            abyte1 = new ASN1EncodableVector();
            if (agmssrootcalc[j4].getRetain() != null)
            {
                for (int i9 = 0; i9 < agmssrootcalc[j4].getRetain().length; i9++)
                {
                    for (int k11 = 0; k11 < agmssrootcalc[j4].getRetain()[i9].size(); k11++)
                    {
                        abyte1.add(new DEROctetString((byte[])(byte[])agmssrootcalc[j4].getRetain()[i9].elementAt(k11)));
                    }

                    abyte0.add(new DERSequence(abyte1));
                    abyte1 = new ASN1EncodableVector();
                }

            }
            ai.add(new DERSequence(abyte0));
            abyte0 = new ASN1EncodableVector();
            avector.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
            j4++;
            abyte1 = abyte2;
            abyte2 = atreehash1;
            abyte3 = atreehash;
        }

        asn1encodablevector.add(new DERSequence(avector));
        ai = new ASN1EncodableVector();
        for (int k4 = 0; k4 < abyte6.length; k4++)
        {
            ai.add(new DEROctetString(abyte6[k4]));
        }

        asn1encodablevector.add(new DERSequence(ai));
        abyte2 = new ASN1EncodableVector();
        ai = new ASN1EncodableVector();
        new ASN1EncodableVector();
        abyte1 = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        for (int l4 = 0; l4 < agmssrootsig.length; l4++)
        {
            ai.add(new DERSequence(aalgorithmidentifier[0]));
            new ASN1EncodableVector();
            abyte1.add(new DEROctetString(agmssrootsig[l4].getStatByte()[0]));
            abyte1.add(new DEROctetString(agmssrootsig[l4].getStatByte()[1]));
            abyte1.add(new DEROctetString(agmssrootsig[l4].getStatByte()[2]));
            abyte1.add(new DEROctetString(agmssrootsig[l4].getStatByte()[3]));
            abyte1.add(new DEROctetString(agmssrootsig[l4].getStatByte()[4]));
            ai.add(new DERSequence(abyte1));
            abyte1 = new ASN1EncodableVector();
            abyte0.add(new ASN1Integer(agmssrootsig[l4].getStatInt()[0]));
            abyte0.add(new ASN1Integer(agmssrootsig[l4].getStatInt()[1]));
            abyte0.add(new ASN1Integer(agmssrootsig[l4].getStatInt()[2]));
            abyte0.add(new ASN1Integer(agmssrootsig[l4].getStatInt()[3]));
            abyte0.add(new ASN1Integer(agmssrootsig[l4].getStatInt()[4]));
            abyte0.add(new ASN1Integer(agmssrootsig[l4].getStatInt()[5]));
            abyte0.add(new ASN1Integer(agmssrootsig[l4].getStatInt()[6]));
            abyte0.add(new ASN1Integer(agmssrootsig[l4].getStatInt()[7]));
            abyte0.add(new ASN1Integer(agmssrootsig[l4].getStatInt()[8]));
            ai.add(new DERSequence(abyte0));
            abyte0 = new ASN1EncodableVector();
            abyte2.add(new DERSequence(ai));
            ai = new ASN1EncodableVector();
        }

        asn1encodablevector.add(new DERSequence(abyte2));
        ai = new ASN1EncodableVector();
        abyte0 = new ASN1EncodableVector();
        abyte1 = new ASN1EncodableVector();
        abyte2 = new ASN1EncodableVector();
        for (int i5 = 0; i5 < gmssparameters.getHeightOfTrees().length; i5++)
        {
            abyte0.add(new ASN1Integer(gmssparameters.getHeightOfTrees()[i5]));
            abyte1.add(new ASN1Integer(gmssparameters.getWinternitzParameter()[i5]));
            abyte2.add(new ASN1Integer(gmssparameters.getK()[i5]));
        }

        ai.add(new ASN1Integer(gmssparameters.getNumOfLayers()));
        ai.add(new DERSequence(abyte0));
        ai.add(new DERSequence(abyte1));
        ai.add(new DERSequence(abyte2));
        asn1encodablevector.add(new DERSequence(ai));
        ai = new ASN1EncodableVector();
        for (int j5 = 0; j5 < aalgorithmidentifier.length; j5++)
        {
            ai.add(aalgorithmidentifier[j5]);
        }

        asn1encodablevector.add(new DERSequence(ai));
        return new DERSequence(asn1encodablevector);
    }

    public ASN1Primitive toASN1Primitive()
    {
        return primitive;
    }
}
