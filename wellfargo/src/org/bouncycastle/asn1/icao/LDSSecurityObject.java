// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.icao;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.icao:
//            ICAOObjectIdentifiers, LDSVersionInfo, DataGroupHash

public class LDSSecurityObject extends ASN1Object
    implements ICAOObjectIdentifiers
{

    public static final int ub_DataGroups = 16;
    private DataGroupHash datagroupHash[];
    private AlgorithmIdentifier digestAlgorithmIdentifier;
    private ASN1Integer version;
    private LDSVersionInfo versionInfo;

    private LDSSecurityObject(ASN1Sequence asn1sequence)
    {
        version = new ASN1Integer(0L);
        if (asn1sequence == null || asn1sequence.size() == 0)
        {
            throw new IllegalArgumentException("null or empty sequence passed.");
        }
        asn1sequence = asn1sequence.getObjects();
        version = ASN1Integer.getInstance(asn1sequence.nextElement());
        digestAlgorithmIdentifier = AlgorithmIdentifier.getInstance(asn1sequence.nextElement());
        ASN1Sequence asn1sequence1 = ASN1Sequence.getInstance(asn1sequence.nextElement());
        if (version.getValue().intValue() == 1)
        {
            versionInfo = LDSVersionInfo.getInstance(asn1sequence.nextElement());
        }
        checkDatagroupHashSeqSize(asn1sequence1.size());
        datagroupHash = new DataGroupHash[asn1sequence1.size()];
        for (int i = 0; i < asn1sequence1.size(); i++)
        {
            datagroupHash[i] = DataGroupHash.getInstance(asn1sequence1.getObjectAt(i));
        }

    }

    public LDSSecurityObject(AlgorithmIdentifier algorithmidentifier, DataGroupHash adatagrouphash[])
    {
        version = new ASN1Integer(0L);
        version = new ASN1Integer(0L);
        digestAlgorithmIdentifier = algorithmidentifier;
        datagroupHash = adatagrouphash;
        checkDatagroupHashSeqSize(adatagrouphash.length);
    }

    public LDSSecurityObject(AlgorithmIdentifier algorithmidentifier, DataGroupHash adatagrouphash[], LDSVersionInfo ldsversioninfo)
    {
        version = new ASN1Integer(0L);
        version = new ASN1Integer(1L);
        digestAlgorithmIdentifier = algorithmidentifier;
        datagroupHash = adatagrouphash;
        versionInfo = ldsversioninfo;
        checkDatagroupHashSeqSize(adatagrouphash.length);
    }

    private void checkDatagroupHashSeqSize(int i)
    {
        if (i < 2 || i > 16)
        {
            throw new IllegalArgumentException("wrong size in DataGroupHashValues : not in (2..16)");
        } else
        {
            return;
        }
    }

    public static LDSSecurityObject getInstance(Object obj)
    {
        if (obj instanceof LDSSecurityObject)
        {
            return (LDSSecurityObject)obj;
        }
        if (obj != null)
        {
            return new LDSSecurityObject(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DataGroupHash[] getDatagroupHash()
    {
        return datagroupHash;
    }

    public AlgorithmIdentifier getDigestAlgorithmIdentifier()
    {
        return digestAlgorithmIdentifier;
    }

    public int getVersion()
    {
        return version.getValue().intValue();
    }

    public LDSVersionInfo getVersionInfo()
    {
        return versionInfo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(digestAlgorithmIdentifier);
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        for (int i = 0; i < datagroupHash.length; i++)
        {
            asn1encodablevector1.add(datagroupHash[i]);
        }

        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        if (versionInfo != null)
        {
            asn1encodablevector.add(versionInfo);
        }
        return new DERSequence(asn1encodablevector);
    }
}
