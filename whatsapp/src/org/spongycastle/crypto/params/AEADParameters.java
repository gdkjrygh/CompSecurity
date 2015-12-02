// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

// Referenced classes of package org.spongycastle.crypto.params:
//            ParametersWithIV, KeyParameter

public class AEADParameters
    implements CipherParameters
{

    private byte associatedText[];
    private KeyParameter key;
    private int macSize;
    private byte nonce[];

    public AEADParameters(KeyParameter keyparameter, int i, byte abyte0[])
    {
        this(keyparameter, i, abyte0, null);
    }

    public AEADParameters(KeyParameter keyparameter, int i, byte abyte0[], byte abyte1[])
    {
        boolean flag = ParametersWithIV.a;
        super();
        key = keyparameter;
        nonce = abyte0;
        macSize = i;
        associatedText = abyte1;
        if (BaseKeyGenerator.a)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            ParametersWithIV.a = flag;
        }
    }

    public byte[] getAssociatedText()
    {
        return associatedText;
    }

    public KeyParameter getKey()
    {
        return key;
    }

    public int getMacSize()
    {
        return macSize;
    }

    public byte[] getNonce()
    {
        return nonce;
    }
}
