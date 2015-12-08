// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Extension, Extensions, SubjectPublicKeyInfo

public class SubjectKeyIdentifier extends ASN1Object
{

    private byte keyidentifier[];

    protected SubjectKeyIdentifier(ASN1OctetString asn1octetstring)
    {
        keyidentifier = asn1octetstring.getOctets();
    }

    public SubjectKeyIdentifier(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        keyidentifier = getDigest(subjectpublickeyinfo);
    }

    public SubjectKeyIdentifier(byte abyte0[])
    {
        keyidentifier = abyte0;
    }

    public static SubjectKeyIdentifier createSHA1KeyIdentifier(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        return new SubjectKeyIdentifier(subjectpublickeyinfo);
    }

    public static SubjectKeyIdentifier createTruncatedSHA1KeyIdentifier(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        subjectpublickeyinfo = getDigest(subjectpublickeyinfo);
        byte abyte0[] = new byte[8];
        System.arraycopy(subjectpublickeyinfo, subjectpublickeyinfo.length - 8, abyte0, 0, abyte0.length);
        abyte0[0] = (byte)(abyte0[0] & 0xf);
        abyte0[0] = (byte)(abyte0[0] | 0x40);
        return new SubjectKeyIdentifier(abyte0);
    }

    public static SubjectKeyIdentifier fromExtensions(Extensions extensions)
    {
        return getInstance(extensions.getExtensionParsedValue(Extension.subjectKeyIdentifier));
    }

    private static byte[] getDigest(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        SHA1Digest sha1digest = new SHA1Digest();
        byte abyte0[] = new byte[sha1digest.getDigestSize()];
        subjectpublickeyinfo = subjectpublickeyinfo.getPublicKeyData().getBytes();
        sha1digest.update(subjectpublickeyinfo, 0, subjectpublickeyinfo.length);
        sha1digest.doFinal(abyte0, 0);
        return abyte0;
    }

    public static SubjectKeyIdentifier getInstance(Object obj)
    {
        if (obj instanceof SubjectKeyIdentifier)
        {
            return (SubjectKeyIdentifier)obj;
        }
        if (obj != null)
        {
            return new SubjectKeyIdentifier(ASN1OctetString.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static SubjectKeyIdentifier getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1OctetString.getInstance(asn1taggedobject, flag));
    }

    public byte[] getKeyIdentifier()
    {
        return keyidentifier;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DEROctetString(keyidentifier);
    }
}
