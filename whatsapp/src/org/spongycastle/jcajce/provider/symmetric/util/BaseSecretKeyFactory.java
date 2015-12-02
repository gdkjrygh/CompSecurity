// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            PBE

public class BaseSecretKeyFactory extends SecretKeyFactorySpi
    implements PBE
{

    private static final String z[];
    protected String algName;

    protected BaseSecretKeyFactory(String s)
    {
        algName = s;
    }

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
    {
        if (keyspec instanceof SecretKeySpec)
        {
            return (SecretKey)keyspec;
        } else
        {
            throw new InvalidKeySpecException(z[4]);
        }
    }

    protected KeySpec engineGetKeySpec(SecretKey secretkey, Class class1)
    {
label0:
        {
            if (class1 == null)
            {
                try
                {
                    throw new InvalidKeySpecException(z[1]);
                }
                // Misplaced declaration of an exception variable
                catch (SecretKey secretkey)
                {
                    throw secretkey;
                }
            }
            if (secretkey == null)
            {
                try
                {
                    throw new InvalidKeySpecException(z[0]);
                }
                // Misplaced declaration of an exception variable
                catch (SecretKey secretkey)
                {
                    throw secretkey;
                }
            }
            try
            {
                if (!javax/crypto/spec/SecretKeySpec.isAssignableFrom(class1))
                {
                    break label0;
                }
                secretkey = new SecretKeySpec(secretkey.getEncoded(), algName);
            }
            // Misplaced declaration of an exception variable
            catch (SecretKey secretkey)
            {
                throw secretkey;
            }
            return secretkey;
        }
        try
        {
            secretkey = (KeySpec)class1.getConstructor(new Class[] {
                [B
            }).newInstance(new Object[] {
                secretkey.getEncoded()
            });
        }
        // Misplaced declaration of an exception variable
        catch (SecretKey secretkey)
        {
            throw new InvalidKeySpecException(secretkey.toString());
        }
        return secretkey;
    }

    protected SecretKey engineTranslateKey(SecretKey secretkey)
    {
        if (secretkey == null)
        {
            throw new InvalidKeyException(z[2]);
        }
        if (!secretkey.getAlgorithm().equalsIgnoreCase(algName))
        {
            throw new InvalidKeyException((new StringBuilder()).append(z[3]).append(algName).append(".").toString());
        } else
        {
            return new SecretKeySpec(secretkey.getEncoded(), algName);
        }
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "K[Sx\035ALK5\bT[Xx\004S\036D-\001L".toCharArray();
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
            obj1 = "K[S\013\035E]\n(\fR_G=\031EL\n1\036\000P_4\001".toCharArray();
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
        byte0 = 109;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 32;
          goto _L7
_L3:
        byte0 = 62;
          goto _L7
_L4:
        byte0 = 42;
          goto _L7
        byte0 = 88;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "K[Sx\035ALK5\bT[Xx\004S\036D-\001L".toCharArray();
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
        byte1 = 109;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 32;
          goto _L14
_L10:
        byte1 = 62;
          goto _L14
_L11:
        byte1 = 42;
          goto _L14
        byte1 = 88;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "k[Sx\003OJ\n7\013\000JS(\b\0".toCharArray();
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
        byte2 = 109;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 32;
          goto _L21
_L17:
        byte2 = 62;
          goto _L21
_L18:
        byte2 = 42;
          goto _L21
        byte2 = 88;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            ac = "iP\\9\001IZ\n\023\bYmZ=\016".toCharArray();
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
        byte3 = 109;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 32;
          goto _L28
_L24:
        byte3 = 62;
          goto _L28
_L25:
        byte3 = 42;
          goto _L28
        byte3 = 88;
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
        byte byte4 = 109;
_L36:
        ac[i] = (char)(byte4 ^ c);
        i++;
        if (true) goto _L35; else goto _L34
_L34:
        byte4 = 32;
          goto _L36
_L31:
        byte4 = 62;
          goto _L36
_L32:
        byte4 = 42;
          goto _L36
        byte4 = 88;
          goto _L36
    }
}
