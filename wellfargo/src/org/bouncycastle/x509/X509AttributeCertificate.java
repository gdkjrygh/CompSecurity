// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.X509Extension;
import java.util.Date;

// Referenced classes of package org.bouncycastle.x509:
//            X509Attribute, AttributeCertificateHolder, AttributeCertificateIssuer

public interface X509AttributeCertificate
    extends X509Extension
{

    public abstract void checkValidity();

    public abstract void checkValidity(Date date);

    public abstract X509Attribute[] getAttributes();

    public abstract X509Attribute[] getAttributes(String s);

    public abstract byte[] getEncoded();

    public abstract AttributeCertificateHolder getHolder();

    public abstract AttributeCertificateIssuer getIssuer();

    public abstract boolean[] getIssuerUniqueID();

    public abstract Date getNotAfter();

    public abstract Date getNotBefore();

    public abstract BigInteger getSerialNumber();

    public abstract byte[] getSignature();

    public abstract int getVersion();

    public abstract void verify(PublicKey publickey, String s);
}
