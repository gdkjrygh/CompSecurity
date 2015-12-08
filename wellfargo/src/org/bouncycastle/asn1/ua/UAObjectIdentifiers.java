// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ua;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface UAObjectIdentifiers
{

    public static final ASN1ObjectIdentifier UaOid = new ASN1ObjectIdentifier("1.2.804.2.1.1.1");
    public static final ASN1ObjectIdentifier dstu4145be = UaOid.branch("1.3.1.1.1.1");
    public static final ASN1ObjectIdentifier dstu4145le = UaOid.branch("1.3.1.1");

}
