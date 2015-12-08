// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, KeyDerivationFunc, PBKDF2Params, EncryptionScheme

public class PBES2Algorithms extends AlgorithmIdentifier
    implements PKCSObjectIdentifiers
{

    private KeyDerivationFunc func;
    private ASN1ObjectIdentifier objectId;
    private EncryptionScheme scheme;

    public PBES2Algorithms(ASN1Sequence asn1sequence)
    {
        super(asn1sequence);
        asn1sequence = asn1sequence.getObjects();
        objectId = (ASN1ObjectIdentifier)asn1sequence.nextElement();
        asn1sequence = ((ASN1Sequence)asn1sequence.nextElement()).getObjects();
        ASN1Sequence asn1sequence1 = (ASN1Sequence)asn1sequence.nextElement();
        if (asn1sequence1.getObjectAt(0).equals(id_PBKDF2))
        {
            func = new KeyDerivationFunc(id_PBKDF2, PBKDF2Params.getInstance(asn1sequence1.getObjectAt(1)));
        } else
        {
            func = new KeyDerivationFunc(asn1sequence1);
        }
        scheme = new EncryptionScheme((ASN1Sequence)asn1sequence.nextElement());
    }

    public ASN1Primitive getASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        asn1encodablevector.add(objectId);
        asn1encodablevector1.add(func);
        asn1encodablevector1.add(scheme);
        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        return new DERSequence(asn1encodablevector);
    }

    public EncryptionScheme getEncryptionScheme()
    {
        return scheme;
    }

    public KeyDerivationFunc getKeyDerivationFunc()
    {
        return func;
    }

    public ASN1ObjectIdentifier getObjectId()
    {
        return objectId;
    }
}
