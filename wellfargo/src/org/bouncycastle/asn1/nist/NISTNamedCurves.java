// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.nist;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.util.Strings;

public class NISTNamedCurves
{

    static final Hashtable names = new Hashtable();
    static final Hashtable objIds = new Hashtable();

    public NISTNamedCurves()
    {
    }

    static void defineCurve(String s, ASN1ObjectIdentifier asn1objectidentifier)
    {
        objIds.put(s, asn1objectidentifier);
        names.put(asn1objectidentifier, s);
    }

    public static X9ECParameters getByName(String s)
    {
        s = (ASN1ObjectIdentifier)objIds.get(Strings.toUpperCase(s));
        if (s != null)
        {
            return getByOID(s);
        } else
        {
            return null;
        }
    }

    public static X9ECParameters getByOID(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return SECNamedCurves.getByOID(asn1objectidentifier);
    }

    public static String getName(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return (String)names.get(asn1objectidentifier);
    }

    public static Enumeration getNames()
    {
        return objIds.keys();
    }

    public static ASN1ObjectIdentifier getOID(String s)
    {
        return (ASN1ObjectIdentifier)objIds.get(Strings.toUpperCase(s));
    }

    static 
    {
        defineCurve("B-571", SECObjectIdentifiers.sect571r1);
        defineCurve("B-409", SECObjectIdentifiers.sect409r1);
        defineCurve("B-283", SECObjectIdentifiers.sect283r1);
        defineCurve("B-233", SECObjectIdentifiers.sect233r1);
        defineCurve("B-163", SECObjectIdentifiers.sect163r2);
        defineCurve("P-521", SECObjectIdentifiers.secp521r1);
        defineCurve("P-384", SECObjectIdentifiers.secp384r1);
        defineCurve("P-256", SECObjectIdentifiers.secp256r1);
        defineCurve("P-224", SECObjectIdentifiers.secp224r1);
        defineCurve("P-192", SECObjectIdentifiers.secp192r1);
    }
}
