// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class EncryptedValue extends ASN1Object
{

    private DERBitString encSymmKey;
    private DERBitString encValue;
    private AlgorithmIdentifier intendedAlg;
    private AlgorithmIdentifier keyAlg;
    private AlgorithmIdentifier symmAlg;
    private ASN1OctetString valueHint;

    private EncryptedValue(ASN1Sequence asn1sequence)
    {
        int i;
        i = 0;
_L8:
        ASN1TaggedObject asn1taggedobject;
        if (!(asn1sequence.getObjectAt(i) instanceof ASN1TaggedObject))
        {
            break MISSING_BLOCK_LABEL_131;
        }
        asn1taggedobject = (ASN1TaggedObject)asn1sequence.getObjectAt(i);
        asn1taggedobject.getTagNo();
        JVM INSTR tableswitch 0 4: default 64
    //                   0 71
    //                   1 83
    //                   2 95
    //                   3 107
    //                   4 119;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_119;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L9:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        intendedAlg = AlgorithmIdentifier.getInstance(asn1taggedobject, false);
          goto _L9
_L3:
        symmAlg = AlgorithmIdentifier.getInstance(asn1taggedobject, false);
          goto _L9
_L4:
        encSymmKey = DERBitString.getInstance(asn1taggedobject, false);
          goto _L9
_L5:
        keyAlg = AlgorithmIdentifier.getInstance(asn1taggedobject, false);
          goto _L9
        valueHint = ASN1OctetString.getInstance(asn1taggedobject, false);
          goto _L9
        encValue = DERBitString.getInstance(asn1sequence.getObjectAt(i));
        return;
    }

    public EncryptedValue(AlgorithmIdentifier algorithmidentifier, AlgorithmIdentifier algorithmidentifier1, DERBitString derbitstring, AlgorithmIdentifier algorithmidentifier2, ASN1OctetString asn1octetstring, DERBitString derbitstring1)
    {
        if (derbitstring1 == null)
        {
            throw new IllegalArgumentException("'encValue' cannot be null");
        } else
        {
            intendedAlg = algorithmidentifier;
            symmAlg = algorithmidentifier1;
            encSymmKey = derbitstring;
            keyAlg = algorithmidentifier2;
            valueHint = asn1octetstring;
            encValue = derbitstring1;
            return;
        }
    }

    private void addOptional(ASN1EncodableVector asn1encodablevector, int i, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, i, asn1encodable));
        }
    }

    public static EncryptedValue getInstance(Object obj)
    {
        if (obj instanceof EncryptedValue)
        {
            return (EncryptedValue)obj;
        }
        if (obj != null)
        {
            return new EncryptedValue(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DERBitString getEncSymmKey()
    {
        return encSymmKey;
    }

    public DERBitString getEncValue()
    {
        return encValue;
    }

    public AlgorithmIdentifier getIntendedAlg()
    {
        return intendedAlg;
    }

    public AlgorithmIdentifier getKeyAlg()
    {
        return keyAlg;
    }

    public AlgorithmIdentifier getSymmAlg()
    {
        return symmAlg;
    }

    public ASN1OctetString getValueHint()
    {
        return valueHint;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        addOptional(asn1encodablevector, 0, intendedAlg);
        addOptional(asn1encodablevector, 1, symmAlg);
        addOptional(asn1encodablevector, 2, encSymmKey);
        addOptional(asn1encodablevector, 3, keyAlg);
        addOptional(asn1encodablevector, 4, valueHint);
        asn1encodablevector.add(encValue);
        return new DERSequence(asn1encodablevector);
    }
}
