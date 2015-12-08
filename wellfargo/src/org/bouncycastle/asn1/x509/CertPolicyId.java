// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;

public class CertPolicyId extends ASN1Object
{

    private ASN1ObjectIdentifier id;

    private CertPolicyId(ASN1ObjectIdentifier asn1objectidentifier)
    {
        id = asn1objectidentifier;
    }

    public static CertPolicyId getInstance(Object obj)
    {
        if (obj instanceof CertPolicyId)
        {
            return (CertPolicyId)obj;
        }
        if (obj != null)
        {
            return new CertPolicyId(ASN1ObjectIdentifier.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public String getId()
    {
        return id.getId();
    }

    public ASN1Primitive toASN1Primitive()
    {
        return id;
    }
}
