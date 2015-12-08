// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCredentials, Certificate, CertificateRequest

public interface TlsKeyExchange
{

    public abstract void generateClientKeyExchange(OutputStream outputstream);

    public abstract byte[] generatePremasterSecret();

    public abstract void processClientCredentials(TlsCredentials tlscredentials);

    public abstract void processServerCertificate(Certificate certificate);

    public abstract void processServerKeyExchange(InputStream inputstream);

    public abstract void skipClientCredentials();

    public abstract void skipServerCertificate();

    public abstract void skipServerKeyExchange();

    public abstract void validateCertificateRequest(CertificateRequest certificaterequest);
}
