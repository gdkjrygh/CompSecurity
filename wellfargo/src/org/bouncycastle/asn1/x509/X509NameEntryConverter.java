// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.util.Strings;

public abstract class X509NameEntryConverter
{

    public X509NameEntryConverter()
    {
    }

    protected boolean canBePrintable(String s)
    {
        return DERPrintableString.isPrintableString(s);
    }

    protected ASN1Primitive convertHexEncoded(String s, int i)
    {
        s = Strings.toLowerCase(s);
        byte abyte0[] = new byte[(s.length() - i) / 2];
        int j = 0;
        while (j != abyte0.length) 
        {
            char c = s.charAt(j * 2 + i);
            char c1 = s.charAt(j * 2 + i + 1);
            if (c < 'a')
            {
                abyte0[j] = (byte)(c - 48 << 4);
            } else
            {
                abyte0[j] = (byte)((c - 97) + 10 << 4);
            }
            if (c1 < 'a')
            {
                abyte0[j] = (byte)(abyte0[j] | (byte)(c1 - 48));
            } else
            {
                abyte0[j] = (byte)(abyte0[j] | (byte)((c1 - 97) + 10));
            }
            j++;
        }
        return (new ASN1InputStream(abyte0)).readObject();
    }

    public abstract ASN1Primitive getConvertedValue(ASN1ObjectIdentifier asn1objectidentifier, String s);
}
