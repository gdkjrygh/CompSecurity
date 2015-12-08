// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface OCSPObjectIdentifiers
{

    public static final ASN1ObjectIdentifier id_pkix_ocsp = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1");
    public static final ASN1ObjectIdentifier id_pkix_ocsp_archive_cutoff = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.6");
    public static final ASN1ObjectIdentifier id_pkix_ocsp_basic = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.1");
    public static final ASN1ObjectIdentifier id_pkix_ocsp_crl = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.3");
    public static final ASN1ObjectIdentifier id_pkix_ocsp_nocheck = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.5");
    public static final ASN1ObjectIdentifier id_pkix_ocsp_nonce = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.2");
    public static final ASN1ObjectIdentifier id_pkix_ocsp_response = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.4");
    public static final ASN1ObjectIdentifier id_pkix_ocsp_service_locator = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.7");
    public static final String pkix_ocsp = "1.3.6.1.5.5.7.48.1";

}
