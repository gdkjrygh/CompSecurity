// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.qualified;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509.qualified:
//            Iso4217CurrencyCode

public class MonetaryValue extends ASN1Object
{

    private ASN1Integer amount;
    private Iso4217CurrencyCode currency;
    private ASN1Integer exponent;

    private MonetaryValue(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        currency = Iso4217CurrencyCode.getInstance(asn1sequence.nextElement());
        amount = ASN1Integer.getInstance(asn1sequence.nextElement());
        exponent = ASN1Integer.getInstance(asn1sequence.nextElement());
    }

    public MonetaryValue(Iso4217CurrencyCode iso4217currencycode, int i, int j)
    {
        currency = iso4217currencycode;
        amount = new ASN1Integer(i);
        exponent = new ASN1Integer(j);
    }

    public static MonetaryValue getInstance(Object obj)
    {
        if (obj instanceof MonetaryValue)
        {
            return (MonetaryValue)obj;
        }
        if (obj != null)
        {
            return new MonetaryValue(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public BigInteger getAmount()
    {
        return amount.getValue();
    }

    public Iso4217CurrencyCode getCurrency()
    {
        return currency;
    }

    public BigInteger getExponent()
    {
        return exponent.getValue();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(currency);
        asn1encodablevector.add(amount);
        asn1encodablevector.add(exponent);
        return new DERSequence(asn1encodablevector);
    }
}
