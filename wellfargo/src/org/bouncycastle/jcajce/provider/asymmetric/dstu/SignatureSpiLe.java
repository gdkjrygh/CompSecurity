// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.security.SignatureException;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dstu:
//            SignatureSpi

public class SignatureSpiLe extends SignatureSpi
{

    public SignatureSpiLe()
    {
    }

    protected byte[] engineSign()
    {
        byte abyte0[] = ASN1OctetString.getInstance(super.engineSign()).getOctets();
        reverseBytes(abyte0);
        try
        {
            abyte0 = (new DEROctetString(abyte0)).getEncoded();
        }
        catch (Exception exception)
        {
            throw new SignatureException(exception.toString());
        }
        return abyte0;
    }

    protected boolean engineVerify(byte abyte0[])
    {
        boolean flag;
        try
        {
            abyte0 = ((ASN1OctetString)ASN1OctetString.fromByteArray(abyte0)).getOctets();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignatureException("error decoding signature bytes.");
        }
        reverseBytes(abyte0);
        try
        {
            flag = super.engineVerify((new DEROctetString(abyte0)).getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignatureException(abyte0.toString());
        }
        return flag;
    }

    void reverseBytes(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length / 2; i++)
        {
            byte byte0 = abyte0[i];
            abyte0[i] = abyte0[abyte0.length - 1 - i];
            abyte0[abyte0.length - 1 - i] = byte0;
        }

    }
}
