// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers

public class RSAESOAEPparams extends ASN1Object
{

    public static final AlgorithmIdentifier DEFAULT_HASH_ALGORITHM;
    public static final AlgorithmIdentifier DEFAULT_MASK_GEN_FUNCTION;
    public static final AlgorithmIdentifier DEFAULT_P_SOURCE_ALGORITHM;
    private AlgorithmIdentifier hashAlgorithm;
    private AlgorithmIdentifier maskGenAlgorithm;
    private AlgorithmIdentifier pSourceAlgorithm;

    public RSAESOAEPparams()
    {
        hashAlgorithm = DEFAULT_HASH_ALGORITHM;
        maskGenAlgorithm = DEFAULT_MASK_GEN_FUNCTION;
        pSourceAlgorithm = DEFAULT_P_SOURCE_ALGORITHM;
    }

    public RSAESOAEPparams(ASN1Sequence asn1sequence)
    {
        int i;
        hashAlgorithm = DEFAULT_HASH_ALGORITHM;
        maskGenAlgorithm = DEFAULT_MASK_GEN_FUNCTION;
        pSourceAlgorithm = DEFAULT_P_SOURCE_ALGORITHM;
        i = 0;
_L2:
        ASN1TaggedObject asn1taggedobject;
        if (i == asn1sequence.size())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        asn1taggedobject = (ASN1TaggedObject)asn1sequence.getObjectAt(i);
        switch (asn1taggedobject.getTagNo())
        {
        default:
            throw new IllegalArgumentException("unknown tag");

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_114;

        case 0: // '\0'
            hashAlgorithm = AlgorithmIdentifier.getInstance(asn1taggedobject, true);
            break;
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        maskGenAlgorithm = AlgorithmIdentifier.getInstance(asn1taggedobject, true);
          goto _L3
        pSourceAlgorithm = AlgorithmIdentifier.getInstance(asn1taggedobject, true);
          goto _L3
    }

    public RSAESOAEPparams(AlgorithmIdentifier algorithmidentifier, AlgorithmIdentifier algorithmidentifier1, AlgorithmIdentifier algorithmidentifier2)
    {
        hashAlgorithm = algorithmidentifier;
        maskGenAlgorithm = algorithmidentifier1;
        pSourceAlgorithm = algorithmidentifier2;
    }

    public static RSAESOAEPparams getInstance(Object obj)
    {
        if (obj instanceof RSAESOAEPparams)
        {
            return (RSAESOAEPparams)obj;
        }
        if (obj != null)
        {
            return new RSAESOAEPparams(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public AlgorithmIdentifier getHashAlgorithm()
    {
        return hashAlgorithm;
    }

    public AlgorithmIdentifier getMaskGenAlgorithm()
    {
        return maskGenAlgorithm;
    }

    public AlgorithmIdentifier getPSourceAlgorithm()
    {
        return pSourceAlgorithm;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (!hashAlgorithm.equals(DEFAULT_HASH_ALGORITHM))
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, hashAlgorithm));
        }
        if (!maskGenAlgorithm.equals(DEFAULT_MASK_GEN_FUNCTION))
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, maskGenAlgorithm));
        }
        if (!pSourceAlgorithm.equals(DEFAULT_P_SOURCE_ALGORITHM))
        {
            asn1encodablevector.add(new DERTaggedObject(true, 2, pSourceAlgorithm));
        }
        return new DERSequence(asn1encodablevector);
    }

    static 
    {
        DEFAULT_HASH_ALGORITHM = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
        DEFAULT_MASK_GEN_FUNCTION = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, DEFAULT_HASH_ALGORITHM);
        DEFAULT_P_SOURCE_ALGORITHM = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_pSpecified, new DEROctetString(new byte[0]));
    }
}
