// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;


// Referenced classes of package com.walmartlabs.payment.service.customer:
//            EncryptCreditCardService

public static class <init>
{

    public final String encryptedCc;
    public final String encryptedCvv;
    public final String integrityCheck;
    public final String keyId;
    public final String phase;

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("encryptedCc = ").append(encryptedCc).append(", encryptedCvv = ").append(encryptedCvv).append(", integrityCheck = ").append(integrityCheck).append(", keyId = ").append(keyId).append(", phase = ").append(phase);
        return stringbuilder.toString();
    }

    private (String s, String s1, String s2, String s3, String s4)
    {
        encryptedCc = s;
        encryptedCvv = s1;
        integrityCheck = s2;
        keyId = s3;
        phase = s4;
    }

    phase(String s, String s1, String s2, String s3, String s4, phase phase1)
    {
        this(s, s1, s2, s3, s4);
    }
}
