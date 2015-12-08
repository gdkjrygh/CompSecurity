// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class CommitmentTypeQualifier extends ASN1Object
{

    private ASN1ObjectIdentifier commitmentTypeIdentifier;
    private ASN1Encodable qualifier;

    public CommitmentTypeQualifier(ASN1ObjectIdentifier asn1objectidentifier)
    {
        this(asn1objectidentifier, null);
    }

    public CommitmentTypeQualifier(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        commitmentTypeIdentifier = asn1objectidentifier;
        qualifier = asn1encodable;
    }

    private CommitmentTypeQualifier(ASN1Sequence asn1sequence)
    {
        commitmentTypeIdentifier = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        if (asn1sequence.size() > 1)
        {
            qualifier = asn1sequence.getObjectAt(1);
        }
    }

    public static CommitmentTypeQualifier getInstance(Object obj)
    {
        if (obj instanceof CommitmentTypeQualifier)
        {
            return (CommitmentTypeQualifier)obj;
        }
        if (obj != null)
        {
            return new CommitmentTypeQualifier(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getCommitmentTypeIdentifier()
    {
        return commitmentTypeIdentifier;
    }

    public ASN1Encodable getQualifier()
    {
        return qualifier;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(commitmentTypeIdentifier);
        if (qualifier != null)
        {
            asn1encodablevector.add(qualifier);
        }
        return new DERSequence(asn1encodablevector);
    }
}
