// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.qualified;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface RFC3739QCObjectIdentifiers
{

    public static final ASN1ObjectIdentifier id_qcs = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.11");
    public static final ASN1ObjectIdentifier id_qcs_pkixQCSyntax_v1 = id_qcs.branch("1");
    public static final ASN1ObjectIdentifier id_qcs_pkixQCSyntax_v2 = id_qcs.branch("2");

}
