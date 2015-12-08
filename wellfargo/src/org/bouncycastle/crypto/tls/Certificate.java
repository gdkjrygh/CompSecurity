// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1InputStream;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsUtils

public class Certificate
{

    public static final Certificate EMPTY_CHAIN = new Certificate(new org.bouncycastle.asn1.x509.Certificate[0]);
    protected org.bouncycastle.asn1.x509.Certificate certs[];

    public Certificate(org.bouncycastle.asn1.x509.Certificate acertificate[])
    {
        if (acertificate == null)
        {
            throw new IllegalArgumentException("'certs' cannot be null");
        } else
        {
            certs = acertificate;
            return;
        }
    }

    protected static Certificate parse(InputStream inputstream)
    {
        int i = TlsUtils.readUint24(inputstream);
        if (i == 0)
        {
            return EMPTY_CHAIN;
        }
        Vector vector = new Vector();
        while (i > 0) 
        {
            int k = TlsUtils.readUint24(inputstream);
            i -= k + 3;
            byte abyte0[] = new byte[k];
            TlsUtils.readFully(abyte0, inputstream);
            ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
            vector.addElement(org.bouncycastle.asn1.x509.Certificate.getInstance((new ASN1InputStream(bytearrayinputstream)).readObject()));
            if (bytearrayinputstream.available() > 0)
            {
                throw new IllegalArgumentException("Sorry, there is garbage data left after the certificate");
            }
        }
        inputstream = new org.bouncycastle.asn1.x509.Certificate[vector.size()];
        for (int j = 0; j < vector.size(); j++)
        {
            inputstream[j] = (org.bouncycastle.asn1.x509.Certificate)vector.elementAt(j);
        }

        return new Certificate(inputstream);
    }

    protected void encode(OutputStream outputstream)
    {
        boolean flag = false;
        Vector vector = new Vector();
        int i = 0;
        int k = 0;
        for (; i < certs.length; i++)
        {
            byte abyte0[] = certs[i].getEncoded("DER");
            vector.addElement(abyte0);
            k += abyte0.length + 3;
        }

        TlsUtils.writeUint24(k, outputstream);
        for (int j = ((flag) ? 1 : 0); j < vector.size(); j++)
        {
            TlsUtils.writeOpaque24((byte[])(byte[])vector.elementAt(j), outputstream);
        }

    }

    public org.bouncycastle.asn1.x509.Certificate[] getCerts()
    {
        org.bouncycastle.asn1.x509.Certificate acertificate[] = new org.bouncycastle.asn1.x509.Certificate[certs.length];
        System.arraycopy(certs, 0, acertificate, 0, certs.length);
        return acertificate;
    }

    public boolean isEmpty()
    {
        return certs.length == 0;
    }

}
