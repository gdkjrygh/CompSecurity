// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import javax.crypto.BadPaddingException;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.modes.AEADBlockCipher;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseBlockCipher

class cipher
    implements cipher
{

    private static final Constructor aeadBadTagConstructor;
    private AEADBlockCipher cipher;

    private static Constructor findExceptionConstructor(Class class1)
    {
        try
        {
            class1 = class1.getConstructor(new Class[] {
                java/lang/String
            });
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public int doFinal(byte abyte0[], int i)
    {
        try
        {
            i = cipher.doFinal(abyte0, i);
        }
        catch (InvalidCipherTextException invalidciphertextexception)
        {
            if (aeadBadTagConstructor != null)
            {
                try
                {
                    abyte0 = (BadPaddingException)aeadBadTagConstructor.newInstance(new Object[] {
                        invalidciphertextexception.getMessage()
                    });
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    abyte0 = null;
                }
                if (abyte0 != null)
                {
                    try
                    {
                        throw abyte0;
                    }
                    // Misplaced declaration of an exception variable
                    catch (byte abyte0[])
                    {
                        throw abyte0;
                    }
                }
            }
            throw new BadPaddingException(invalidciphertextexception.getMessage());
        }
        return i;
    }

    public String getAlgorithmName()
    {
        return cipher.getUnderlyingCipher().getAlgorithmName();
    }

    public int getOutputSize(int i)
    {
        return cipher.getOutputSize(i);
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher.getUnderlyingCipher();
    }

    public int getUpdateOutputSize(int i)
    {
        return cipher.getUpdateOutputSize(i);
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        cipher.init(flag, cipherparameters);
    }

    public int processByte(byte byte0, byte abyte0[], int i)
    {
        return cipher.processByte(byte0, abyte0, i);
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        return cipher.processBytes(abyte0, i, j, abyte1, k);
    }

    public void updateAAD(byte abyte0[], int i, int j)
    {
        cipher.processAADBytes(abyte0, i, j);
    }

    public boolean wrapOnNoPadding()
    {
        return false;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "Yb\021\035\005\035`\025\005\rGlI=8rG%\035\031gb\0009\005Pf\027\b\024\\m".toCharArray();
        j = obj.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            obj = BaseBlockCipher.access$000((new String(((char []) (obj)))).intern());
            if (obj != null)
            {
                aeadBadTagConstructor = findExceptionConstructor(((Class) (obj)));
                return;
            } else
            {
                aeadBadTagConstructor = null;
                return;
            }
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 88
    //                   0 106
    //                   1 112
    //                   2 117
    //                   3 123;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_123;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 125;
_L8:
        obj[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 51;
          goto _L8
_L3:
        byte0 = 3;
          goto _L8
_L4:
        byte0 = 103;
          goto _L8
        byte0 = 124;
          goto _L8
    }

    (AEADBlockCipher aeadblockcipher)
    {
        cipher = aeadblockcipher;
    }
}
