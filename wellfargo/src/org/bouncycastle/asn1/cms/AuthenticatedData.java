// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            OriginatorInfo, ContentInfo

public class AuthenticatedData extends ASN1Object
{

    private ASN1Set authAttrs;
    private AlgorithmIdentifier digestAlgorithm;
    private ContentInfo encapsulatedContentInfo;
    private ASN1OctetString mac;
    private AlgorithmIdentifier macAlgorithm;
    private OriginatorInfo originatorInfo;
    private ASN1Set recipientInfos;
    private ASN1Set unauthAttrs;
    private ASN1Integer version;

    public AuthenticatedData(ASN1Sequence asn1sequence)
    {
        version = (ASN1Integer)asn1sequence.getObjectAt(0);
        org.bouncycastle.asn1.ASN1Encodable asn1encodable = asn1sequence.getObjectAt(1);
        int i;
        int j;
        if (asn1encodable instanceof ASN1TaggedObject)
        {
            originatorInfo = OriginatorInfo.getInstance((ASN1TaggedObject)asn1encodable, false);
            i = 3;
            asn1encodable = asn1sequence.getObjectAt(2);
        } else
        {
            i = 2;
        }
        recipientInfos = ASN1Set.getInstance(asn1encodable);
        j = i + 1;
        macAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(i));
        i = j + 1;
        asn1encodable = asn1sequence.getObjectAt(j);
        if (asn1encodable instanceof ASN1TaggedObject)
        {
            digestAlgorithm = AlgorithmIdentifier.getInstance((ASN1TaggedObject)asn1encodable, false);
            j = i + 1;
            asn1encodable = asn1sequence.getObjectAt(i);
            i = j;
        }
        encapsulatedContentInfo = ContentInfo.getInstance(asn1encodable);
        j = i + 1;
        asn1encodable = asn1sequence.getObjectAt(i);
        if (asn1encodable instanceof ASN1TaggedObject)
        {
            authAttrs = ASN1Set.getInstance((ASN1TaggedObject)asn1encodable, false);
            i = j + 1;
            asn1encodable = asn1sequence.getObjectAt(j);
        } else
        {
            i = j;
        }
        mac = ASN1OctetString.getInstance(asn1encodable);
        if (asn1sequence.size() > i)
        {
            unauthAttrs = ASN1Set.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(i), false);
        }
    }

    public AuthenticatedData(OriginatorInfo originatorinfo, ASN1Set asn1set, AlgorithmIdentifier algorithmidentifier, AlgorithmIdentifier algorithmidentifier1, ContentInfo contentinfo, ASN1Set asn1set1, ASN1OctetString asn1octetstring, 
            ASN1Set asn1set2)
    {
        if ((algorithmidentifier1 != null || asn1set1 != null) && (algorithmidentifier1 == null || asn1set1 == null))
        {
            throw new IllegalArgumentException("digestAlgorithm and authAttrs must be set together");
        } else
        {
            version = new ASN1Integer(calculateVersion(originatorinfo));
            originatorInfo = originatorinfo;
            macAlgorithm = algorithmidentifier;
            digestAlgorithm = algorithmidentifier1;
            recipientInfos = asn1set;
            encapsulatedContentInfo = contentinfo;
            authAttrs = asn1set1;
            mac = asn1octetstring;
            unauthAttrs = asn1set2;
            return;
        }
    }

    public static int calculateVersion(OriginatorInfo originatorinfo)
    {
        byte byte1;
label0:
        {
            if (originatorinfo == null)
            {
                return 0;
            }
            Enumeration enumeration = originatorinfo.getCertificates().getObjects();
            boolean flag = false;
            Object obj1;
label1:
            do
            {
                do
                {
                    byte1 = flag;
                    if (!enumeration.hasMoreElements())
                    {
                        break label0;
                    }
                    obj1 = enumeration.nextElement();
                    if (obj1 instanceof ASN1TaggedObject)
                    {
                        obj1 = (ASN1TaggedObject)obj1;
                        if (((ASN1TaggedObject) (obj1)).getTagNo() != 2)
                        {
                            continue label1;
                        }
                        flag = true;
                    }
                } while (true);
            } while (((ASN1TaggedObject) (obj1)).getTagNo() != 3);
            byte1 = 3;
        }
        byte byte0;
label2:
        {
            byte0 = byte1;
            if (originatorinfo.getCRLs() == null)
            {
                break label2;
            }
            originatorinfo = originatorinfo.getCRLs().getObjects();
            Object obj;
            do
            {
                byte0 = byte1;
                if (!originatorinfo.hasMoreElements())
                {
                    break label2;
                }
                obj = originatorinfo.nextElement();
            } while (!(obj instanceof ASN1TaggedObject) || ((ASN1TaggedObject)obj).getTagNo() != 1);
            byte0 = 3;
        }
        return byte0;
    }

    public static AuthenticatedData getInstance(Object obj)
    {
        if (obj == null || (obj instanceof AuthenticatedData))
        {
            return (AuthenticatedData)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new AuthenticatedData((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid AuthenticatedData: ").append(obj.getClass().getName()).toString());
        }
    }

    public static AuthenticatedData getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1Set getAuthAttrs()
    {
        return authAttrs;
    }

    public AlgorithmIdentifier getDigestAlgorithm()
    {
        return digestAlgorithm;
    }

    public ContentInfo getEncapsulatedContentInfo()
    {
        return encapsulatedContentInfo;
    }

    public ASN1OctetString getMac()
    {
        return mac;
    }

    public AlgorithmIdentifier getMacAlgorithm()
    {
        return macAlgorithm;
    }

    public OriginatorInfo getOriginatorInfo()
    {
        return originatorInfo;
    }

    public ASN1Set getRecipientInfos()
    {
        return recipientInfos;
    }

    public ASN1Set getUnauthAttrs()
    {
        return unauthAttrs;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        if (originatorInfo != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, originatorInfo));
        }
        asn1encodablevector.add(recipientInfos);
        asn1encodablevector.add(macAlgorithm);
        if (digestAlgorithm != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, digestAlgorithm));
        }
        asn1encodablevector.add(encapsulatedContentInfo);
        if (authAttrs != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 2, authAttrs));
        }
        asn1encodablevector.add(mac);
        if (unauthAttrs != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 3, unauthAttrs));
        }
        return new BERSequence(asn1encodablevector);
    }
}
