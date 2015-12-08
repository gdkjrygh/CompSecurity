// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, OIDTokenizer, ASN1ObjectIdentifier, ASN1Encodable, 
//            ASN1TaggedObject, ASN1OctetString, ASN1OutputStream, StreamUtil

public class DERObjectIdentifier extends ASN1Primitive
{

    private static final long LONG_LIMIT = 0xffffffffffff80L;
    private static ASN1ObjectIdentifier cache[][] = new ASN1ObjectIdentifier[256][];
    private byte body[];
    String identifier;

    public DERObjectIdentifier(String s)
    {
        if (!isValidIdentifier(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("string ").append(s).append(" not an OID").toString());
        } else
        {
            identifier = s;
            return;
        }
    }

    DERObjectIdentifier(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 1;
        BigInteger biginteger = null;
        long l = 0L;
        int k = 0;
        do
        {
            while (k != abyte0.length) 
            {
                int j = abyte0[k] & 0xff;
                if (l <= 0xffffffffffff80L)
                {
                    l += j & 0x7f;
                    if ((j & 0x80) == 0)
                    {
                        j = i;
                        long l1 = l;
                        if (i != 0)
                        {
                            if (l < 40L)
                            {
                                stringbuffer.append('0');
                            } else
                            if (l < 80L)
                            {
                                stringbuffer.append('1');
                                l -= 40L;
                            } else
                            {
                                stringbuffer.append('2');
                                l -= 80L;
                            }
                            j = 0;
                            l1 = l;
                        }
                        stringbuffer.append('.');
                        stringbuffer.append(l1);
                        l = 0L;
                        i = j;
                    } else
                    {
                        l <<= 7;
                    }
                } else
                {
                    BigInteger biginteger1 = biginteger;
                    if (biginteger == null)
                    {
                        biginteger1 = BigInteger.valueOf(l);
                    }
                    biginteger = biginteger1.or(BigInteger.valueOf(j & 0x7f));
                    if ((j & 0x80) == 0)
                    {
                        if (i != 0)
                        {
                            stringbuffer.append('2');
                            biginteger = biginteger.subtract(BigInteger.valueOf(80L));
                            i = 0;
                        }
                        stringbuffer.append('.');
                        stringbuffer.append(biginteger);
                        l = 0L;
                        biginteger = null;
                    } else
                    {
                        biginteger = biginteger.shiftLeft(7);
                    }
                }
                k++;
            }
            identifier = stringbuffer.toString();
            body = Arrays.clone(abyte0);
            return;
        } while (true);
    }

    private void doOutput(ByteArrayOutputStream bytearrayoutputstream)
    {
        OIDTokenizer oidtokenizer = new OIDTokenizer(identifier);
        int i = Integer.parseInt(oidtokenizer.nextToken()) * 40;
        String s = oidtokenizer.nextToken();
        if (s.length() <= 18)
        {
            long l = i;
            writeField(bytearrayoutputstream, Long.parseLong(s) + l);
        } else
        {
            writeField(bytearrayoutputstream, (new BigInteger(s)).add(BigInteger.valueOf(i)));
        }
        while (oidtokenizer.hasMoreTokens()) 
        {
            s = oidtokenizer.nextToken();
            if (s.length() <= 18)
            {
                writeField(bytearrayoutputstream, Long.parseLong(s));
            } else
            {
                writeField(bytearrayoutputstream, new BigInteger(s));
            }
        }
    }

    static ASN1ObjectIdentifier fromOctetString(byte abyte0[])
    {
        if (abyte0.length >= 3) goto _L2; else goto _L1
_L1:
        Object obj = new ASN1ObjectIdentifier(abyte0);
_L4:
        return ((ASN1ObjectIdentifier) (obj));
_L2:
        int i;
        int j;
        j = abyte0[abyte0.length - 2] & 0xff;
        i = abyte0[abyte0.length - 1] & 0x7f;
        ASN1ObjectIdentifier aasn1objectidentifier1[][] = cache;
        aasn1objectidentifier1;
        JVM INSTR monitorenter ;
        obj = cache[j];
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        ASN1ObjectIdentifier aasn1objectidentifier[][];
        aasn1objectidentifier = cache;
        obj = new ASN1ObjectIdentifier[128];
        aasn1objectidentifier[j] = ((ASN1ObjectIdentifier []) (obj));
        ASN1ObjectIdentifier asn1objectidentifier;
        asn1objectidentifier = obj[i];
        if (asn1objectidentifier != null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        abyte0 = new ASN1ObjectIdentifier(abyte0);
        obj[i] = abyte0;
        aasn1objectidentifier1;
        JVM INSTR monitorexit ;
        return abyte0;
        abyte0;
        aasn1objectidentifier1;
        JVM INSTR monitorexit ;
        throw abyte0;
        if (!Arrays.areEqual(abyte0, asn1objectidentifier.getBody()))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        aasn1objectidentifier1;
        JVM INSTR monitorexit ;
        return asn1objectidentifier;
        j = j + 1 & 0xff;
        obj = cache[j];
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        asn1objectidentifier = cache;
        obj = new ASN1ObjectIdentifier[128];
        asn1objectidentifier[j] = ((ASN1ObjectIdentifier []) (obj));
        asn1objectidentifier = obj[i];
        if (asn1objectidentifier != null)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        abyte0 = new ASN1ObjectIdentifier(abyte0);
        obj[i] = abyte0;
        aasn1objectidentifier1;
        JVM INSTR monitorexit ;
        return abyte0;
        if (!Arrays.areEqual(abyte0, asn1objectidentifier.getBody()))
        {
            break MISSING_BLOCK_LABEL_199;
        }
        aasn1objectidentifier1;
        JVM INSTR monitorexit ;
        return asn1objectidentifier;
        i = i + 1 & 0x7f;
        asn1objectidentifier = obj[i];
        if (asn1objectidentifier != null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        abyte0 = new ASN1ObjectIdentifier(abyte0);
        obj[i] = abyte0;
        aasn1objectidentifier1;
        JVM INSTR monitorexit ;
        return abyte0;
        aasn1objectidentifier1;
        JVM INSTR monitorexit ;
        obj = asn1objectidentifier;
        if (!Arrays.areEqual(abyte0, asn1objectidentifier.getBody()))
        {
            return new ASN1ObjectIdentifier(abyte0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static ASN1ObjectIdentifier getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ASN1ObjectIdentifier))
        {
            return (ASN1ObjectIdentifier)obj;
        }
        if (obj instanceof DERObjectIdentifier)
        {
            return new ASN1ObjectIdentifier(((DERObjectIdentifier)obj).getId());
        }
        if ((obj instanceof ASN1Encodable) && (((ASN1Encodable)obj).toASN1Primitive() instanceof ASN1ObjectIdentifier))
        {
            return (ASN1ObjectIdentifier)((ASN1Encodable)obj).toASN1Primitive();
        }
        if (obj instanceof byte[])
        {
            return ASN1ObjectIdentifier.fromOctetString((byte[])(byte[])obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1ObjectIdentifier getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        ASN1Primitive asn1primitive = asn1taggedobject.getObject();
        if (flag || (asn1primitive instanceof DERObjectIdentifier))
        {
            return getInstance(asn1primitive);
        } else
        {
            return ASN1ObjectIdentifier.fromOctetString(ASN1OctetString.getInstance(asn1taggedobject.getObject()).getOctets());
        }
    }

    private static boolean isValidIdentifier(String s)
    {
        if (s.length() >= 3 && s.charAt(1) == '.') goto _L2; else goto _L1
_L1:
        int i;
        return false;
_L2:
        if ((i = s.charAt(0)) < '0' || i > '2') goto _L1; else goto _L3
_L3:
        boolean flag;
        i = s.length() - 1;
        flag = false;
_L5:
        char c;
        if (i < 2)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        c = s.charAt(i);
        if ('0' > c || c > '9')
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
_L7:
        i--;
        if (true) goto _L5; else goto _L4
_L4:
        if (c != '.' || !flag) goto _L1; else goto _L6
_L6:
        flag = false;
          goto _L7
        return flag;
    }

    private void writeField(ByteArrayOutputStream bytearrayoutputstream, long l)
    {
        byte abyte0[] = new byte[9];
        int i = 8;
        for (abyte0[8] = (byte)((int)l & 0x7f); l >= 128L; abyte0[i] = (byte)((int)l & 0x7f | 0x80))
        {
            l >>= 7;
            i--;
        }

        bytearrayoutputstream.write(abyte0, i, 9 - i);
    }

    private void writeField(ByteArrayOutputStream bytearrayoutputstream, BigInteger biginteger)
    {
        int k = (biginteger.bitLength() + 6) / 7;
        if (k == 0)
        {
            bytearrayoutputstream.write(0);
            return;
        }
        byte abyte0[] = new byte[k];
        for (int i = k - 1; i >= 0; i--)
        {
            abyte0[i] = (byte)(biginteger.intValue() & 0x7f | 0x80);
            biginteger = biginteger.shiftRight(7);
        }

        int j = k - 1;
        abyte0[j] = (byte)(abyte0[j] & 0x7f);
        bytearrayoutputstream.write(abyte0, 0, abyte0.length);
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERObjectIdentifier))
        {
            return false;
        } else
        {
            return identifier.equals(((DERObjectIdentifier)asn1primitive).identifier);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        byte abyte0[] = getBody();
        asn1outputstream.write(6);
        asn1outputstream.writeLength(abyte0.length);
        asn1outputstream.write(abyte0);
    }

    int encodedLength()
    {
        int i = getBody().length;
        return i + (StreamUtil.calculateBodyLength(i) + 1);
    }

    protected byte[] getBody()
    {
        this;
        JVM INSTR monitorenter ;
        byte abyte0[];
        if (body == null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            doOutput(bytearrayoutputstream);
            body = bytearrayoutputstream.toByteArray();
        }
        abyte0 = body;
        this;
        JVM INSTR monitorexit ;
        return abyte0;
        Exception exception;
        exception;
        throw exception;
    }

    public String getId()
    {
        return identifier;
    }

    public int hashCode()
    {
        return identifier.hashCode();
    }

    boolean isConstructed()
    {
        return false;
    }

    public String toString()
    {
        return getId();
    }

}
