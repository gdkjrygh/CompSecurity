// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreegateway.encryption;


// Referenced classes of package com.braintreegateway.encryption:
//            Random, Aes, Rsa

public class Braintree
{

    private final String publicKey;

    public Braintree(String s)
    {
        publicKey = s;
    }

    private String getPrefix()
    {
        return (new StringBuilder("$bt3|android_")).append("2.0.0".replace(".", "_")).append("$").toString();
    }

    public String encrypt(String s)
    {
        byte abyte0[] = Random.secureRandomBytes(32);
        s = Aes.encrypt(s, abyte0, Random.secureRandomBytes(16));
        String s1 = Rsa.encrypt(abyte0, publicKey);
        return (new StringBuilder()).append(getPrefix()).append(s1).append("$").append(s).toString();
    }

    public String getPublicKey()
    {
        return publicKey;
    }
}
