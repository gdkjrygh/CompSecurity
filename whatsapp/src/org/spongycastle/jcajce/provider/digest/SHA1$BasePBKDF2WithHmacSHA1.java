// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;

public class scheme extends BaseSecretKeyFactory
{

    private static final String z[];
    private int scheme;

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
    {
        if (keyspec instanceof PBEKeySpec)
        {
            keyspec = (PBEKeySpec)keyspec;
            try
            {
                if (keyspec.getSalt() == null)
                {
                    throw new InvalidKeySpecException(z[3]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (KeySpec keyspec)
            {
                throw keyspec;
            }
            try
            {
                if (keyspec.getIterationCount() <= 0)
                {
                    throw new InvalidKeySpecException((new StringBuilder()).append(z[4]).append(keyspec.getIterationCount()).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (KeySpec keyspec)
            {
                throw keyspec;
            }
            try
            {
                if (keyspec.getKeyLength() <= 0)
                {
                    throw new InvalidKeySpecException((new StringBuilder()).append(z[1]).append(keyspec.getKeyLength()).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (KeySpec keyspec)
            {
                throw keyspec;
            }
            try
            {
                if (keyspec.getPassword().length == 0)
                {
                    throw new IllegalArgumentException(z[0]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (KeySpec keyspec)
            {
                throw keyspec;
            }
            int i = keyspec.getKeyLength();
            org.spongycastle.crypto.CipherParameters cipherparameters = org.spongycastle.jcajce.provider.symmetric.util.s(keyspec, scheme, 1, i);
            return new BCPBEKey(algName, scheme, 1, i, -1, keyspec, cipherparameters);
        } else
        {
            throw new InvalidKeySpecException(z[2]);
        }
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "R+*\034zM8=OhO:-\026".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "R%*\006yK<<OfG3y\003hL--\007-P/(\032dP/=U-".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 251
    //                   1 258
    //                   2 265
    //                   3 272;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_272;
_L1:
        byte0 = 13;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 34;
          goto _L7
_L3:
        byte0 = 74;
          goto _L7
_L4:
        byte0 = 89;
          goto _L7
        byte0 = 111;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "k$/\016aK.y$h[\031)\nn".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 320
    //                   0 343
    //                   1 350
    //                   2 357
    //                   3 364;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_364;
_L8:
        byte1 = 13;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 34;
          goto _L14
_L10:
        byte1 = 74;
          goto _L14
_L11:
        byte1 = 89;
          goto _L14
        byte1 = 111;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "O#*\034dL-y\035hS?0\035hFj*\016aV".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_456;
_L15:
        byte2 = 13;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 34;
          goto _L21
_L17:
        byte2 = 74;
          goto _L21
_L18:
        byte2 = 89;
          goto _L21
        byte2 = 111;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            ac = "R%*\006yK<<OdV/+\016yK%7OnM?7\033-P/(\032dP/=U-".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 504
    //                   0 527
    //                   1 534
    //                   2 541
    //                   3 548;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_548;
_L22:
        byte3 = 13;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 34;
          goto _L28
_L24:
        byte3 = 74;
          goto _L28
_L25:
        byte3 = 89;
          goto _L28
        byte3 = 111;
          goto _L28
_L35:
        byte byte3;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 596
    //                   0 620
    //                   1 627
    //                   2 634
    //                   3 641;
           goto _L29 _L30 _L31 _L32 _L33
_L30:
        break; /* Loop/switch isn't completed */
_L33:
        break MISSING_BLOCK_LABEL_641;
_L29:
        byte byte4 = 13;
_L36:
        ac[i] = (char)(byte4 ^ c);
        i++;
        if (true) goto _L35; else goto _L34
_L34:
        byte4 = 34;
          goto _L36
_L31:
        byte4 = 74;
          goto _L36
_L32:
        byte4 = 89;
          goto _L36
        byte4 = 111;
          goto _L36
    }

    public (String s, int i)
    {
        super(s);
        scheme = i;
    }
}
