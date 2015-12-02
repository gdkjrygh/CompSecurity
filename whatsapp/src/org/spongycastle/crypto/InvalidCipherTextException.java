// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;


// Referenced classes of package org.spongycastle.crypto:
//            CryptoException

public class InvalidCipherTextException extends CryptoException
{

    public InvalidCipherTextException()
    {
    }

    public InvalidCipherTextException(String s)
    {
        super(s);
    }

    public InvalidCipherTextException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
