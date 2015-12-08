// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.icao;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;

public class LDSVersionInfo extends ASN1Object
{

    private DERPrintableString ldsVersion;
    private DERPrintableString unicodeVersion;

    public LDSVersionInfo(String s, String s1)
    {
        ldsVersion = new DERPrintableString(s);
        unicodeVersion = new DERPrintableString(s1);
    }

    private LDSVersionInfo(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException("sequence wrong size for LDSVersionInfo");
        } else
        {
            ldsVersion = DERPrintableString.getInstance(asn1sequence.getObjectAt(0));
            unicodeVersion = DERPrintableString.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
    }

    public static LDSVersionInfo getInstance(Object obj)
    {
        if (obj instanceof LDSVersionInfo)
        {
            return (LDSVersionInfo)obj;
        }
        if (obj != null)
        {
            return new LDSVersionInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public String getLdsVersion()
    {
        return ldsVersion.getString();
    }

    public String getUnicodeVersion()
    {
        return unicodeVersion.getString();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(ldsVersion);
        asn1encodablevector.add(unicodeVersion);
        return new DERSequence(asn1encodablevector);
    }
}
