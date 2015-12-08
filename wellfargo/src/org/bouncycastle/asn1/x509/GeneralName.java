// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.StringTokenizer;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.IPAddress;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509Name

public class GeneralName extends ASN1Object
    implements ASN1Choice
{

    public static final int dNSName = 2;
    public static final int directoryName = 4;
    public static final int ediPartyName = 5;
    public static final int iPAddress = 7;
    public static final int otherName = 0;
    public static final int registeredID = 8;
    public static final int rfc822Name = 1;
    public static final int uniformResourceIdentifier = 6;
    public static final int x400Address = 3;
    private ASN1Encodable obj;
    private int tag;

    public GeneralName(int i, String s)
    {
        tag = i;
        if (i == 1 || i == 2 || i == 6)
        {
            obj = new DERIA5String(s);
            return;
        }
        if (i == 8)
        {
            obj = new ASN1ObjectIdentifier(s);
            return;
        }
        if (i == 4)
        {
            obj = new X500Name(s);
            return;
        }
        if (i == 7)
        {
            s = toGeneralNameEncoding(s);
            if (s != null)
            {
                obj = new DEROctetString(s);
                return;
            } else
            {
                throw new IllegalArgumentException("IP Address is invalid");
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("can't process String for tag: ").append(i).toString());
        }
    }

    public GeneralName(int i, ASN1Encodable asn1encodable)
    {
        obj = asn1encodable;
        tag = i;
    }

    public GeneralName(X500Name x500name)
    {
        obj = x500name;
        tag = 4;
    }

    public GeneralName(X509Name x509name)
    {
        obj = X500Name.getInstance(x509name);
        tag = 4;
    }

    private void copyInts(int ai[], byte abyte0[], int i)
    {
        for (int j = 0; j != ai.length; j++)
        {
            abyte0[j * 2 + i] = (byte)(ai[j] >> 8);
            abyte0[j * 2 + 1 + i] = (byte)ai[j];
        }

    }

    public static GeneralName getInstance(Object obj1)
    {
        if (obj1 == null || (obj1 instanceof GeneralName))
        {
            return (GeneralName)obj1;
        }
        if (!(obj1 instanceof ASN1TaggedObject)) goto _L2; else goto _L1
_L1:
        ASN1TaggedObject asn1taggedobject;
        int i;
        asn1taggedobject = (ASN1TaggedObject)obj1;
        i = asn1taggedobject.getTagNo();
        i;
        JVM INSTR tableswitch 0 8: default 84
    //                   0 107
    //                   1 121
    //                   2 135
    //                   3 149
    //                   4 176
    //                   5 190
    //                   6 204
    //                   7 218
    //                   8 232;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L2:
        if (obj1 instanceof byte[])
        {
            try
            {
                obj1 = getInstance(ASN1Primitive.fromByteArray((byte[])(byte[])obj1));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
            return ((GeneralName) (obj1));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in getInstance: ").append(obj1.getClass().getName()).toString());
        }
_L3:
        return new GeneralName(i, ASN1Sequence.getInstance(asn1taggedobject, false));
_L4:
        return new GeneralName(i, DERIA5String.getInstance(asn1taggedobject, false));
_L5:
        return new GeneralName(i, DERIA5String.getInstance(asn1taggedobject, false));
_L6:
        throw new IllegalArgumentException((new StringBuilder()).append("unknown tag: ").append(i).toString());
_L7:
        return new GeneralName(i, X500Name.getInstance(asn1taggedobject, true));
_L8:
        return new GeneralName(i, ASN1Sequence.getInstance(asn1taggedobject, false));
_L9:
        return new GeneralName(i, DERIA5String.getInstance(asn1taggedobject, false));
_L10:
        return new GeneralName(i, ASN1OctetString.getInstance(asn1taggedobject, false));
_L11:
        return new GeneralName(i, ASN1ObjectIdentifier.getInstance(asn1taggedobject, false));
    }

    public static GeneralName getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1TaggedObject.getInstance(asn1taggedobject, true));
    }

    private void parseIPv4(String s, byte abyte0[], int i)
    {
        s = new StringTokenizer(s, "./");
        for (int j = 0; s.hasMoreTokens(); j++)
        {
            abyte0[j + i] = (byte)Integer.parseInt(s.nextToken());
        }

    }

    private void parseIPv4Mask(String s, byte abyte0[], int i)
    {
        int k = Integer.parseInt(s);
        for (int j = 0; j != k; j++)
        {
            int l = j / 8 + i;
            abyte0[l] = (byte)(abyte0[l] | 1 << 7 - j % 8);
        }

    }

    private int[] parseIPv6(String s)
    {
        StringTokenizer stringtokenizer = new StringTokenizer(s, ":", true);
        int ai[] = new int[8];
        if (s.charAt(0) == ':' && s.charAt(1) == ':')
        {
            stringtokenizer.nextToken();
        }
        int j = -1;
        int i = 0;
        while (stringtokenizer.hasMoreTokens()) 
        {
            s = stringtokenizer.nextToken();
            if (s.equals(":"))
            {
                ai[i] = 0;
                int k = i + 1;
                j = i;
                i = k;
            } else
            if (s.indexOf('.') < 0)
            {
                int l = i + 1;
                ai[i] = Integer.parseInt(s, 16);
                int i1;
                if (stringtokenizer.hasMoreTokens())
                {
                    stringtokenizer.nextToken();
                    i = l;
                } else
                {
                    i = l;
                }
            } else
            {
                s = new StringTokenizer(s, ".");
                l = i + 1;
                ai[i] = Integer.parseInt(s.nextToken()) << 8 | Integer.parseInt(s.nextToken());
                i = l + 1;
                i1 = Integer.parseInt(s.nextToken());
                ai[l] = Integer.parseInt(s.nextToken()) | i1 << 8;
            }
        }
        if (i != ai.length)
        {
            System.arraycopy(ai, j, ai, ai.length - (i - j), i - j);
            for (l = j; l != ai.length - (i - j); l++)
            {
                ai[l] = 0;
            }

        }
        return ai;
    }

    private int[] parseMask(String s)
    {
        int ai[] = new int[8];
        int j = Integer.parseInt(s);
        for (int i = 0; i != j; i++)
        {
            int k = i / 16;
            ai[k] = ai[k] | 1 << 15 - i % 16;
        }

        return ai;
    }

    private byte[] toGeneralNameEncoding(String s)
    {
        if (IPAddress.isValidIPv6WithNetmask(s) || IPAddress.isValidIPv6(s))
        {
            int i = s.indexOf('/');
            if (i < 0)
            {
                byte abyte0[] = new byte[16];
                copyInts(parseIPv6(s), abyte0, 0);
                return abyte0;
            }
            byte abyte1[] = new byte[32];
            copyInts(parseIPv6(s.substring(0, i)), abyte1, 0);
            s = s.substring(i + 1);
            if (s.indexOf(':') > 0)
            {
                s = parseIPv6(s);
            } else
            {
                s = parseMask(s);
            }
            copyInts(s, abyte1, 16);
            return abyte1;
        }
        if (IPAddress.isValidIPv4WithNetmask(s) || IPAddress.isValidIPv4(s))
        {
            int j = s.indexOf('/');
            if (j < 0)
            {
                byte abyte2[] = new byte[4];
                parseIPv4(s, abyte2, 0);
                return abyte2;
            }
            byte abyte3[] = new byte[8];
            parseIPv4(s.substring(0, j), abyte3, 0);
            s = s.substring(j + 1);
            if (s.indexOf('.') > 0)
            {
                parseIPv4(s, abyte3, 4);
                return abyte3;
            } else
            {
                parseIPv4Mask(s, abyte3, 4);
                return abyte3;
            }
        } else
        {
            return null;
        }
    }

    public ASN1Encodable getName()
    {
        return obj;
    }

    public int getTagNo()
    {
        return tag;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (tag == 4)
        {
            return new DERTaggedObject(true, tag, obj);
        } else
        {
            return new DERTaggedObject(false, tag, obj);
        }
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        stringbuffer.append(tag);
        stringbuffer.append(": ");
        tag;
        JVM INSTR tableswitch 1 6: default 68
    //                   1 85
    //                   2 85
    //                   3 68
    //                   4 103
    //                   5 68
    //                   6 85;
           goto _L1 _L2 _L2 _L1 _L3 _L1 _L2
_L1:
        stringbuffer.append(obj.toString());
_L5:
        return stringbuffer.toString();
_L2:
        stringbuffer.append(DERIA5String.getInstance(obj).getString());
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append(X500Name.getInstance(obj).toString());
        if (true) goto _L5; else goto _L4
_L4:
    }
}
