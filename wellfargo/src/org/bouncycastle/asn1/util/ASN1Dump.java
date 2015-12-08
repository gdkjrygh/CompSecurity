// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.util;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERApplicationSpecific;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERExternal;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERT61String;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERVisibleString;
import org.bouncycastle.util.encoders.Hex;

public class ASN1Dump
{

    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = "    ";

    public ASN1Dump()
    {
    }

    static void _dumpAsString(String s, boolean flag, ASN1Primitive asn1primitive, StringBuffer stringbuffer)
    {
        String s1 = System.getProperty("line.separator");
        if (!(asn1primitive instanceof ASN1Sequence)) goto _L2; else goto _L1
_L1:
        Enumeration enumeration = ((ASN1Sequence)asn1primitive).getObjects();
        String s3 = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s);
        if (asn1primitive instanceof BERSequence)
        {
            stringbuffer.append("BER Sequence");
        } else
        if (asn1primitive instanceof DERSequence)
        {
            stringbuffer.append("DER Sequence");
        } else
        {
            stringbuffer.append("Sequence");
        }
        stringbuffer.append(s1);
        while (enumeration.hasMoreElements()) 
        {
            s = ((String) (enumeration.nextElement()));
            if (s == null || s.equals(DERNull.INSTANCE))
            {
                stringbuffer.append(s3);
                stringbuffer.append("NULL");
                stringbuffer.append(s1);
            } else
            if (s instanceof ASN1Primitive)
            {
                _dumpAsString(s3, flag, (ASN1Primitive)s, stringbuffer);
            } else
            {
                _dumpAsString(s3, flag, ((ASN1Encodable)s).toASN1Primitive(), stringbuffer);
            }
        }
          goto _L3
_L2:
        if (!(asn1primitive instanceof ASN1TaggedObject)) goto _L5; else goto _L4
_L4:
        String s2;
        s2 = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s);
        if (asn1primitive instanceof BERTaggedObject)
        {
            stringbuffer.append("BER Tagged [");
        } else
        {
            stringbuffer.append("Tagged [");
        }
        s = (ASN1TaggedObject)asn1primitive;
        stringbuffer.append(Integer.toString(s.getTagNo()));
        stringbuffer.append(']');
        if (!s.isExplicit())
        {
            stringbuffer.append(" IMPLICIT ");
        }
        stringbuffer.append(s1);
        if (!s.isEmpty()) goto _L7; else goto _L6
_L6:
        stringbuffer.append(s2);
        stringbuffer.append("EMPTY");
        stringbuffer.append(s1);
_L3:
        return;
_L7:
        _dumpAsString(s2, flag, s.getObject(), stringbuffer);
        return;
_L5:
        if (!(asn1primitive instanceof ASN1Set))
        {
            break; /* Loop/switch isn't completed */
        }
        Enumeration enumeration1 = ((ASN1Set)asn1primitive).getObjects();
        String s4 = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s);
        if (asn1primitive instanceof BERSet)
        {
            stringbuffer.append("BER Set");
        } else
        {
            stringbuffer.append("DER Set");
        }
        stringbuffer.append(s1);
        while (enumeration1.hasMoreElements()) 
        {
            s = ((String) (enumeration1.nextElement()));
            if (s == null)
            {
                stringbuffer.append(s4);
                stringbuffer.append("NULL");
                stringbuffer.append(s1);
            } else
            if (s instanceof ASN1Primitive)
            {
                _dumpAsString(s4, flag, (ASN1Primitive)s, stringbuffer);
            } else
            {
                _dumpAsString(s4, flag, ((ASN1Encodable)s).toASN1Primitive(), stringbuffer);
            }
        }
        if (true) goto _L3; else goto _L8
_L8:
        if (asn1primitive instanceof ASN1OctetString)
        {
            ASN1OctetString asn1octetstring = (ASN1OctetString)asn1primitive;
            if ((asn1primitive instanceof BEROctetString) || (asn1primitive instanceof BERConstructedOctetString))
            {
                stringbuffer.append((new StringBuilder()).append(s).append("BER Constructed Octet String").append("[").append(asn1octetstring.getOctets().length).append("] ").toString());
            } else
            {
                stringbuffer.append((new StringBuilder()).append(s).append("DER Octet String").append("[").append(asn1octetstring.getOctets().length).append("] ").toString());
            }
            if (flag)
            {
                stringbuffer.append(dumpBinaryDataAsString(s, asn1octetstring.getOctets()));
                return;
            } else
            {
                stringbuffer.append(s1);
                return;
            }
        }
        if (asn1primitive instanceof ASN1ObjectIdentifier)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("ObjectIdentifier(").append(((ASN1ObjectIdentifier)asn1primitive).getId()).append(")").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof DERBoolean)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("Boolean(").append(((DERBoolean)asn1primitive).isTrue()).append(")").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof ASN1Integer)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("Integer(").append(((ASN1Integer)asn1primitive).getValue()).append(")").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof DERBitString)
        {
            asn1primitive = (DERBitString)asn1primitive;
            stringbuffer.append((new StringBuilder()).append(s).append("DER Bit String").append("[").append(asn1primitive.getBytes().length).append(", ").append(asn1primitive.getPadBits()).append("] ").toString());
            if (flag)
            {
                stringbuffer.append(dumpBinaryDataAsString(s, asn1primitive.getBytes()));
                return;
            } else
            {
                stringbuffer.append(s1);
                return;
            }
        }
        if (asn1primitive instanceof DERIA5String)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("IA5String(").append(((DERIA5String)asn1primitive).getString()).append(") ").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof DERUTF8String)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("UTF8String(").append(((DERUTF8String)asn1primitive).getString()).append(") ").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof DERPrintableString)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("PrintableString(").append(((DERPrintableString)asn1primitive).getString()).append(") ").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof DERVisibleString)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("VisibleString(").append(((DERVisibleString)asn1primitive).getString()).append(") ").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof DERBMPString)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("BMPString(").append(((DERBMPString)asn1primitive).getString()).append(") ").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof DERT61String)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("T61String(").append(((DERT61String)asn1primitive).getString()).append(") ").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof DERUTCTime)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("UTCTime(").append(((DERUTCTime)asn1primitive).getTime()).append(") ").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof DERGeneralizedTime)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("GeneralizedTime(").append(((DERGeneralizedTime)asn1primitive).getTime()).append(") ").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof BERApplicationSpecific)
        {
            stringbuffer.append(outputApplicationSpecific("BER", s, flag, asn1primitive, s1));
            return;
        }
        if (asn1primitive instanceof DERApplicationSpecific)
        {
            stringbuffer.append(outputApplicationSpecific("DER", s, flag, asn1primitive, s1));
            return;
        }
        if (asn1primitive instanceof DEREnumerated)
        {
            asn1primitive = (DEREnumerated)asn1primitive;
            stringbuffer.append((new StringBuilder()).append(s).append("DER Enumerated(").append(asn1primitive.getValue()).append(")").append(s1).toString());
            return;
        }
        if (asn1primitive instanceof DERExternal)
        {
            asn1primitive = (DERExternal)asn1primitive;
            stringbuffer.append((new StringBuilder()).append(s).append("External ").append(s1).toString());
            s = (new StringBuilder()).append(s).append("    ").toString();
            if (asn1primitive.getDirectReference() != null)
            {
                stringbuffer.append((new StringBuilder()).append(s).append("Direct Reference: ").append(asn1primitive.getDirectReference().getId()).append(s1).toString());
            }
            if (asn1primitive.getIndirectReference() != null)
            {
                stringbuffer.append((new StringBuilder()).append(s).append("Indirect Reference: ").append(asn1primitive.getIndirectReference().toString()).append(s1).toString());
            }
            if (asn1primitive.getDataValueDescriptor() != null)
            {
                _dumpAsString(s, flag, asn1primitive.getDataValueDescriptor(), stringbuffer);
            }
            stringbuffer.append((new StringBuilder()).append(s).append("Encoding: ").append(asn1primitive.getEncoding()).append(s1).toString());
            _dumpAsString(s, flag, asn1primitive.getExternalContent(), stringbuffer);
            return;
        } else
        {
            stringbuffer.append((new StringBuilder()).append(s).append(asn1primitive.toString()).append(s1).toString());
            return;
        }
    }

    private static String calculateAscString(byte abyte0[], int i, int j)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (int k = i; k != i + j; k++)
        {
            if (abyte0[k] >= 32 && abyte0[k] <= 126)
            {
                stringbuffer.append((char)abyte0[k]);
            }
        }

        return stringbuffer.toString();
    }

    public static String dumpAsString(Object obj)
    {
        return dumpAsString(obj, false);
    }

    public static String dumpAsString(Object obj, boolean flag)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (obj instanceof ASN1Primitive)
        {
            _dumpAsString("", flag, (ASN1Primitive)obj, stringbuffer);
        } else
        if (obj instanceof ASN1Encodable)
        {
            _dumpAsString("", flag, ((ASN1Encodable)obj).toASN1Primitive(), stringbuffer);
        } else
        {
            return (new StringBuilder()).append("unknown object type ").append(obj.toString()).toString();
        }
        return stringbuffer.toString();
    }

    private static String dumpBinaryDataAsString(String s, byte abyte0[])
    {
        String s1 = System.getProperty("line.separator");
        StringBuffer stringbuffer = new StringBuffer();
        s = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s1);
        int i = 0;
        while (i < abyte0.length) 
        {
            if (abyte0.length - i > 32)
            {
                stringbuffer.append(s);
                stringbuffer.append(new String(Hex.encode(abyte0, i, 32)));
                stringbuffer.append("    ");
                stringbuffer.append(calculateAscString(abyte0, i, 32));
                stringbuffer.append(s1);
            } else
            {
                stringbuffer.append(s);
                stringbuffer.append(new String(Hex.encode(abyte0, i, abyte0.length - i)));
                for (int j = abyte0.length - i; j != 32; j++)
                {
                    stringbuffer.append("  ");
                }

                stringbuffer.append("    ");
                stringbuffer.append(calculateAscString(abyte0, i, abyte0.length - i));
                stringbuffer.append(s1);
            }
            i += 32;
        }
        return stringbuffer.toString();
    }

    private static String outputApplicationSpecific(String s, String s1, boolean flag, ASN1Primitive asn1primitive, String s2)
    {
        DERApplicationSpecific derapplicationspecific = (DERApplicationSpecific)asn1primitive;
        asn1primitive = new StringBuffer();
        if (derapplicationspecific.isConstructed())
        {
            try
            {
                ASN1Sequence asn1sequence = ASN1Sequence.getInstance(derapplicationspecific.getObject(16));
                asn1primitive.append((new StringBuilder()).append(s1).append(s).append(" ApplicationSpecific[").append(derapplicationspecific.getApplicationTag()).append("]").append(s2).toString());
                for (s = asn1sequence.getObjects(); s.hasMoreElements(); _dumpAsString((new StringBuilder()).append(s1).append("    ").toString(), flag, (ASN1Primitive)s.nextElement(), asn1primitive)) { }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                asn1primitive.append(s);
            }
            return asn1primitive.toString();
        } else
        {
            return (new StringBuilder()).append(s1).append(s).append(" ApplicationSpecific[").append(derapplicationspecific.getApplicationTag()).append("] (").append(new String(Hex.encode(derapplicationspecific.getContents()))).append(")").append(s2).toString();
        }
    }
}
