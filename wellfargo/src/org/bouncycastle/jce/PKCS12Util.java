// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;

public class PKCS12Util
{

    public PKCS12Util()
    {
    }

    private static byte[] calculatePbeMac(DERObjectIdentifier derobjectidentifier, byte abyte0[], int i, char ac[], byte abyte1[], String s)
    {
        SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(derobjectidentifier.getId(), s);
        abyte0 = new PBEParameterSpec(abyte0, i);
        ac = secretkeyfactory.generateSecret(new PBEKeySpec(ac));
        derobjectidentifier = Mac.getInstance(derobjectidentifier.getId(), s);
        derobjectidentifier.init(ac, abyte0);
        derobjectidentifier.update(abyte1);
        return derobjectidentifier.doFinal();
    }

    public static byte[] convertToDefiniteLength(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        DEROutputStream deroutputstream = new DEROutputStream(bytearrayoutputstream);
        abyte0 = Pfx.getInstance(abyte0);
        bytearrayoutputstream.reset();
        deroutputstream.writeObject(abyte0);
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] convertToDefiniteLength(byte abyte0[], char ac[], String s)
    {
        Object obj = Pfx.getInstance(abyte0);
        ContentInfo contentinfo = ((Pfx) (obj)).getAuthSafe();
        ASN1OctetString asn1octetstring = ASN1OctetString.getInstance(contentinfo.getContent());
        abyte0 = new ByteArrayOutputStream();
        DEROutputStream deroutputstream = new DEROutputStream(abyte0);
        deroutputstream.writeObject((new ASN1InputStream(asn1octetstring.getOctets())).readObject());
        contentinfo = new ContentInfo(contentinfo.getContentType(), new DEROctetString(abyte0.toByteArray()));
        obj = ((Pfx) (obj)).getMacData();
        try
        {
            int i = ((MacData) (obj)).getIterationCount().intValue();
            byte abyte1[] = ASN1OctetString.getInstance(contentinfo.getContent()).getOctets();
            ac = calculatePbeMac(((MacData) (obj)).getMac().getAlgorithmId().getObjectId(), ((MacData) (obj)).getSalt(), i, ac, abyte1, s);
            ac = new MacData(new DigestInfo(new AlgorithmIdentifier(((MacData) (obj)).getMac().getAlgorithmId().getObjectId(), DERNull.INSTANCE), ac), ((MacData) (obj)).getSalt(), i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException((new StringBuilder()).append("error constructing MAC: ").append(abyte0.toString()).toString());
        }
        ac = new Pfx(contentinfo, ac);
        abyte0.reset();
        deroutputstream.writeObject(ac);
        return abyte0.toByteArray();
    }
}
