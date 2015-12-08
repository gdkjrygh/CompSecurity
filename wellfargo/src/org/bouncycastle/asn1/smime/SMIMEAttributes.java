// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.smime;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

public interface SMIMEAttributes
{

    public static final ASN1ObjectIdentifier encrypKeyPref = PKCSObjectIdentifiers.id_aa_encrypKeyPref;
    public static final ASN1ObjectIdentifier smimeCapabilities = PKCSObjectIdentifiers.pkcs_9_at_smimeCapabilities;

}
