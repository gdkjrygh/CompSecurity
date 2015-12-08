// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;


// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCipher

public class TlsNullCipher
    implements TlsCipher
{

    public TlsNullCipher()
    {
    }

    protected byte[] copyData(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return abyte1;
    }

    public byte[] decodeCiphertext(short word0, byte abyte0[], int i, int j)
    {
        return copyData(abyte0, i, j);
    }

    public byte[] encodePlaintext(short word0, byte abyte0[], int i, int j)
    {
        return copyData(abyte0, i, j);
    }
}
