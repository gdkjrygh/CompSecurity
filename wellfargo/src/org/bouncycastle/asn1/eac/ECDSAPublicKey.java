// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.eac:
//            PublicKeyDataObject, UnsignedInteger

public class ECDSAPublicKey extends PublicKeyDataObject
{

    private static final int A = 2;
    private static final int B = 4;
    private static final int F = 64;
    private static final int G = 8;
    private static final int P = 1;
    private static final int R = 16;
    private static final int Y = 32;
    private byte basePointG[];
    private BigInteger cofactorF;
    private BigInteger firstCoefA;
    private int options;
    private BigInteger orderOfBasePointR;
    private BigInteger primeModulusP;
    private byte publicPointY[];
    private BigInteger secondCoefB;
    private ASN1ObjectIdentifier usage;

    public ECDSAPublicKey(ASN1ObjectIdentifier asn1objectidentifier, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, byte abyte0[], BigInteger biginteger3, byte abyte1[], 
            int i)
    {
        usage = asn1objectidentifier;
        setPrimeModulusP(biginteger);
        setFirstCoefA(biginteger1);
        setSecondCoefB(biginteger2);
        setBasePointG(new DEROctetString(abyte0));
        setOrderOfBasePointR(biginteger3);
        setPublicPointY(new DEROctetString(abyte1));
        setCofactorF(BigInteger.valueOf(i));
    }

    public ECDSAPublicKey(ASN1ObjectIdentifier asn1objectidentifier, byte abyte0[])
    {
        usage = asn1objectidentifier;
        setPublicPointY(new DEROctetString(abyte0));
    }

    ECDSAPublicKey(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        usage = ASN1ObjectIdentifier.getInstance(asn1sequence.nextElement());
        options = 0;
        do
        {
            if (asn1sequence.hasMoreElements())
            {
                Object obj = asn1sequence.nextElement();
                if (obj instanceof ASN1TaggedObject)
                {
                    obj = (ASN1TaggedObject)obj;
                    switch (((ASN1TaggedObject) (obj)).getTagNo())
                    {
                    default:
                        options = 0;
                        throw new IllegalArgumentException("Unknown Object Identifier!");

                    case 1: // '\001'
                        setPrimeModulusP(UnsignedInteger.getInstance(obj).getValue());
                        break;

                    case 2: // '\002'
                        setFirstCoefA(UnsignedInteger.getInstance(obj).getValue());
                        break;

                    case 3: // '\003'
                        setSecondCoefB(UnsignedInteger.getInstance(obj).getValue());
                        break;

                    case 4: // '\004'
                        setBasePointG(ASN1OctetString.getInstance(((ASN1TaggedObject) (obj)), false));
                        break;

                    case 5: // '\005'
                        setOrderOfBasePointR(UnsignedInteger.getInstance(obj).getValue());
                        break;

                    case 6: // '\006'
                        setPublicPointY(ASN1OctetString.getInstance(((ASN1TaggedObject) (obj)), false));
                        break;

                    case 7: // '\007'
                        setCofactorF(UnsignedInteger.getInstance(obj).getValue());
                        break;
                    }
                } else
                {
                    throw new IllegalArgumentException("Unknown Object Identifier!");
                }
                continue;
            }
            if (options != 32 && options != 127)
            {
                throw new IllegalArgumentException("All options must be either present or absent!");
            }
            break;
        } while (true);
    }

    private void setBasePointG(ASN1OctetString asn1octetstring)
    {
        if ((options & 8) == 0)
        {
            options = options | 8;
            basePointG = asn1octetstring.getOctets();
            return;
        } else
        {
            throw new IllegalArgumentException("Base Point G already set");
        }
    }

    private void setCofactorF(BigInteger biginteger)
    {
        if ((options & 0x40) == 0)
        {
            options = options | 0x40;
            cofactorF = biginteger;
            return;
        } else
        {
            throw new IllegalArgumentException("Cofactor F already set");
        }
    }

    private void setFirstCoefA(BigInteger biginteger)
    {
        if ((options & 2) == 0)
        {
            options = options | 2;
            firstCoefA = biginteger;
            return;
        } else
        {
            throw new IllegalArgumentException("First Coef A already set");
        }
    }

    private void setOrderOfBasePointR(BigInteger biginteger)
    {
        if ((options & 0x10) == 0)
        {
            options = options | 0x10;
            orderOfBasePointR = biginteger;
            return;
        } else
        {
            throw new IllegalArgumentException("Order of base point R already set");
        }
    }

    private void setPrimeModulusP(BigInteger biginteger)
    {
        if ((options & 1) == 0)
        {
            options = options | 1;
            primeModulusP = biginteger;
            return;
        } else
        {
            throw new IllegalArgumentException("Prime Modulus P already set");
        }
    }

    private void setPublicPointY(ASN1OctetString asn1octetstring)
    {
        if ((options & 0x20) == 0)
        {
            options = options | 0x20;
            publicPointY = asn1octetstring.getOctets();
            return;
        } else
        {
            throw new IllegalArgumentException("Public Point Y already set");
        }
    }

    private void setSecondCoefB(BigInteger biginteger)
    {
        if ((options & 4) == 0)
        {
            options = options | 4;
            secondCoefB = biginteger;
            return;
        } else
        {
            throw new IllegalArgumentException("Second Coef B already set");
        }
    }

    public ASN1EncodableVector getASN1EncodableVector(ASN1ObjectIdentifier asn1objectidentifier, boolean flag)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(asn1objectidentifier);
        if (!flag)
        {
            asn1encodablevector.add(new UnsignedInteger(1, getPrimeModulusP()));
            asn1encodablevector.add(new UnsignedInteger(2, getFirstCoefA()));
            asn1encodablevector.add(new UnsignedInteger(3, getSecondCoefB()));
            asn1encodablevector.add(new DERTaggedObject(false, 4, new DEROctetString(getBasePointG())));
            asn1encodablevector.add(new UnsignedInteger(5, getOrderOfBasePointR()));
        }
        asn1encodablevector.add(new DERTaggedObject(false, 6, new DEROctetString(getPublicPointY())));
        if (!flag)
        {
            asn1encodablevector.add(new UnsignedInteger(7, getCofactorF()));
        }
        return asn1encodablevector;
    }

    public byte[] getBasePointG()
    {
        if ((options & 8) != 0)
        {
            return basePointG;
        } else
        {
            return null;
        }
    }

    public BigInteger getCofactorF()
    {
        if ((options & 0x40) != 0)
        {
            return cofactorF;
        } else
        {
            return null;
        }
    }

    public BigInteger getFirstCoefA()
    {
        if ((options & 2) != 0)
        {
            return firstCoefA;
        } else
        {
            return null;
        }
    }

    public BigInteger getOrderOfBasePointR()
    {
        if ((options & 0x10) != 0)
        {
            return orderOfBasePointR;
        } else
        {
            return null;
        }
    }

    public BigInteger getPrimeModulusP()
    {
        if ((options & 1) != 0)
        {
            return primeModulusP;
        } else
        {
            return null;
        }
    }

    public byte[] getPublicPointY()
    {
        if ((options & 0x20) != 0)
        {
            return publicPointY;
        } else
        {
            return null;
        }
    }

    public BigInteger getSecondCoefB()
    {
        if ((options & 4) != 0)
        {
            return secondCoefB;
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getUsage()
    {
        return usage;
    }

    public boolean hasParameters()
    {
        return primeModulusP != null;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERSequence(getASN1EncodableVector(usage, false));
    }
}
