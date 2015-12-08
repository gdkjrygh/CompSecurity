// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Extension, Extensions

public class KeyUsage extends ASN1Object
{

    public static final int cRLSign = 2;
    public static final int dataEncipherment = 16;
    public static final int decipherOnly = 32768;
    public static final int digitalSignature = 128;
    public static final int encipherOnly = 1;
    public static final int keyAgreement = 8;
    public static final int keyCertSign = 4;
    public static final int keyEncipherment = 32;
    public static final int nonRepudiation = 64;
    private DERBitString bitString;

    public KeyUsage(int i)
    {
        bitString = new DERBitString(i);
    }

    private KeyUsage(DERBitString derbitstring)
    {
        bitString = derbitstring;
    }

    public static KeyUsage fromExtensions(Extensions extensions)
    {
        return getInstance(extensions.getExtensionParsedValue(Extension.keyUsage));
    }

    public static KeyUsage getInstance(Object obj)
    {
        if (obj instanceof KeyUsage)
        {
            return (KeyUsage)obj;
        }
        if (obj != null)
        {
            return new KeyUsage(DERBitString.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public byte[] getBytes()
    {
        return bitString.getBytes();
    }

    public int getPadBits()
    {
        return bitString.getPadBits();
    }

    public ASN1Primitive toASN1Primitive()
    {
        return bitString;
    }

    public String toString()
    {
        byte abyte0[] = bitString.getBytes();
        if (abyte0.length == 1)
        {
            return (new StringBuilder()).append("KeyUsage: 0x").append(Integer.toHexString(abyte0[0] & 0xff)).toString();
        } else
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("KeyUsage: 0x");
            byte byte0 = abyte0[1];
            return stringbuilder.append(Integer.toHexString(abyte0[0] & 0xff | (byte0 & 0xff) << 8)).toString();
        }
    }
}
