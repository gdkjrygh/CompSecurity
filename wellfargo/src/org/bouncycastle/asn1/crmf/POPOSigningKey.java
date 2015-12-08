// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            POPOSigningKeyInput

public class POPOSigningKey extends ASN1Object
{

    private AlgorithmIdentifier algorithmIdentifier;
    private POPOSigningKeyInput poposkInput;
    private DERBitString signature;

    private POPOSigningKey(ASN1Sequence asn1sequence)
    {
        int i = 0;
        if (asn1sequence.getObjectAt(0) instanceof ASN1TaggedObject)
        {
            ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)asn1sequence.getObjectAt(0);
            if (asn1taggedobject.getTagNo() != 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown POPOSigningKeyInput tag: ").append(asn1taggedobject.getTagNo()).toString());
            }
            poposkInput = POPOSigningKeyInput.getInstance(asn1taggedobject.getObject());
            i = 1;
        }
        algorithmIdentifier = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(i));
        signature = DERBitString.getInstance(asn1sequence.getObjectAt(i + 1));
    }

    public POPOSigningKey(POPOSigningKeyInput poposigningkeyinput, AlgorithmIdentifier algorithmidentifier, DERBitString derbitstring)
    {
        poposkInput = poposigningkeyinput;
        algorithmIdentifier = algorithmidentifier;
        signature = derbitstring;
    }

    public static POPOSigningKey getInstance(Object obj)
    {
        if (obj instanceof POPOSigningKey)
        {
            return (POPOSigningKey)obj;
        }
        if (obj != null)
        {
            return new POPOSigningKey(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static POPOSigningKey getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public AlgorithmIdentifier getAlgorithmIdentifier()
    {
        return algorithmIdentifier;
    }

    public POPOSigningKeyInput getPoposkInput()
    {
        return poposkInput;
    }

    public DERBitString getSignature()
    {
        return signature;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (poposkInput != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, poposkInput));
        }
        asn1encodablevector.add(algorithmIdentifier);
        asn1encodablevector.add(signature);
        return new DERSequence(asn1encodablevector);
    }
}
