// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AlgorithmIdentifier

public class SubjectPublicKeyInfo extends ASN1Object
{

    private AlgorithmIdentifier algId;
    private DERBitString keyData;

    public SubjectPublicKeyInfo(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            asn1sequence = asn1sequence.getObjects();
            algId = AlgorithmIdentifier.getInstance(asn1sequence.nextElement());
            keyData = DERBitString.getInstance(asn1sequence.nextElement());
            return;
        }
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable)
    {
        keyData = new DERBitString(asn1encodable);
        algId = algorithmidentifier;
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        keyData = new DERBitString(abyte0);
        algId = algorithmidentifier;
    }

    public static SubjectPublicKeyInfo getInstance(Object obj)
    {
        if (obj instanceof SubjectPublicKeyInfo)
        {
            return (SubjectPublicKeyInfo)obj;
        }
        if (obj != null)
        {
            return new SubjectPublicKeyInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static SubjectPublicKeyInfo getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public AlgorithmIdentifier getAlgorithm()
    {
        return algId;
    }

    public AlgorithmIdentifier getAlgorithmId()
    {
        return algId;
    }

    public ASN1Primitive getPublicKey()
    {
        return (new ASN1InputStream(keyData.getBytes())).readObject();
    }

    public DERBitString getPublicKeyData()
    {
        return keyData;
    }

    public ASN1Primitive parsePublicKey()
    {
        return (new ASN1InputStream(keyData.getBytes())).readObject();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(algId);
        asn1encodablevector.add(keyData);
        return new DERSequence(asn1encodablevector);
    }
}
