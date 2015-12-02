// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseMac, BCPBEKey

public class ator
{

    private static final String z[];

    private static byte[] convertPassword(int i, PBEKeySpec pbekeyspec)
    {
        byte abyte0[];
label0:
        {
            if (i == 5)
            {
                abyte0 = PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(pbekeyspec.getPassword());
                if (!BaseMac.a)
                {
                    break label0;
                }
            }
            abyte0 = PBEParametersGenerator.PKCS5PasswordToBytes(pbekeyspec.getPassword());
        }
        return abyte0;
    }

    private static PBEParametersGenerator makePBEGenerator(int i, int j)
    {
        boolean flag = BaseMac.a;
        if (i != 1 && i != 5) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 0 4: default 48
    //                   0 64
    //                   1 83
    //                   2 48
    //                   3 48
    //                   4 102;
           goto _L3 _L4 _L5 _L3 _L3 _L6
_L3:
        try
        {
            throw new IllegalStateException(z[3]);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
_L4:
        PKCS5S2ParametersGenerator pkcs5s2parametersgenerator;
        pkcs5s2parametersgenerator = new PKCS5S2ParametersGenerator(new MD5Digest());
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        pkcs5s2parametersgenerator = new PKCS5S2ParametersGenerator(new SHA1Digest());
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        pkcs5s2parametersgenerator = new PKCS5S2ParametersGenerator(new SHA256Digest());
        if (flag) goto _L3; else goto _L7
_L7:
        return pkcs5s2parametersgenerator;
_L2:
        throw new IllegalStateException(z[2]);
    }

    public static CipherParameters makePBEMacParameters(PBEKeySpec pbekeyspec, int i, int j, int k)
    {
        boolean flag = BaseMac.a;
        PBEParametersGenerator pbeparametersgenerator = makePBEGenerator(i, j);
        byte abyte0[] = convertPassword(i, pbekeyspec);
        pbeparametersgenerator.init(abyte0, pbekeyspec.getSalt(), pbekeyspec.getIterationCount());
        pbekeyspec = pbeparametersgenerator.generateDerivedMacParameters(k);
        i = 0;
        do
        {
            if (i == abyte0.length)
            {
                break;
            }
            abyte0[i] = 0;
            i++;
        } while (!flag);
        return pbekeyspec;
    }

    public static CipherParameters makePBEMacParameters(BCPBEKey bcpbekey, AlgorithmParameterSpec algorithmparameterspec)
    {
        boolean flag;
        flag = BaseMac.a;
        if (algorithmparameterspec == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (algorithmparameterspec instanceof PBEParameterSpec)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        throw new IllegalArgumentException(z[0]);
        bcpbekey;
        throw bcpbekey;
        PBEParameterSpec pbeparameterspec = (PBEParameterSpec)algorithmparameterspec;
        PBEParametersGenerator pbeparametersgenerator = makePBEGenerator(bcpbekey.getType(), bcpbekey.getDigest());
        algorithmparameterspec = bcpbekey.getEncoded();
        if (bcpbekey.shouldTryWrongPKCS12())
        {
            algorithmparameterspec = new byte[2];
        }
        pbeparametersgenerator.init(algorithmparameterspec, pbeparameterspec.getSalt(), pbeparameterspec.getIterationCount());
        bcpbekey = pbeparametersgenerator.generateDerivedMacParameters(bcpbekey.getKeySize());
        int i = 0;
        do
        {
            if (i == algorithmparameterspec.length)
            {
                break;
            }
            algorithmparameterspec[i] = 0;
            i++;
        } while (!flag);
        return bcpbekey;
    }

    public static CipherParameters makePBEParameters(PBEKeySpec pbekeyspec, int i, int j, int k, int l)
    {
        byte abyte0[];
        boolean flag;
label0:
        {
            flag = BaseMac.a;
            PBEParametersGenerator pbeparametersgenerator = makePBEGenerator(i, j);
            abyte0 = convertPassword(i, pbekeyspec);
            pbeparametersgenerator.init(abyte0, pbekeyspec.getSalt(), pbekeyspec.getIterationCount());
            if (l != 0)
            {
                pbekeyspec = pbeparametersgenerator.generateDerivedParameters(k, l);
                if (!flag)
                {
                    break label0;
                }
            }
            pbekeyspec = pbeparametersgenerator.generateDerivedParameters(k);
        }
        i = 0;
        do
        {
            if (i == abyte0.length)
            {
                break;
            }
            abyte0[i] = 0;
            i++;
        } while (!flag);
        return pbekeyspec;
    }

    public static CipherParameters makePBEParameters(BCPBEKey bcpbekey, AlgorithmParameterSpec algorithmparameterspec, String s)
    {
        boolean flag;
        flag = BaseMac.a;
        if (algorithmparameterspec == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (algorithmparameterspec instanceof PBEParameterSpec)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        throw new IllegalArgumentException(z[1]);
        bcpbekey;
        throw bcpbekey;
label0:
        {
            s = (PBEParameterSpec)algorithmparameterspec;
            PBEParametersGenerator pbeparametersgenerator = makePBEGenerator(bcpbekey.getType(), bcpbekey.getDigest());
            algorithmparameterspec = bcpbekey.getEncoded();
            if (bcpbekey.shouldTryWrongPKCS12())
            {
                algorithmparameterspec = new byte[2];
            }
            pbeparametersgenerator.init(algorithmparameterspec, s.getSalt(), s.getIterationCount());
            if (bcpbekey.getIvSize() != 0)
            {
                s = pbeparametersgenerator.generateDerivedParameters(bcpbekey.getKeySize(), bcpbekey.getIvSize());
                if (!flag)
                {
                    break label0;
                }
            }
            s = pbeparametersgenerator.generateDerivedParameters(bcpbekey.getKeySize());
        }
        int i = 0;
        do
        {
            if (i == algorithmparameterspec.length)
            {
                break;
            }
            algorithmparameterspec[i] = 0;
            i++;
        } while (!flag);
        return s;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "R\0338}U}^\r[0L\037/x\030y\n8kUo\0168zUk\027)qU}^\r[0<\0258`[".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "R\0338}U}^\r[0L\037/x\030y\n8kUo\0168zUk\027)qU}^\r[0<\0258`[".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_236;
_L1:
        byte0 = 117;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 28;
          goto _L7
_L3:
        byte0 = 126;
          goto _L7
_L4:
        byte0 = 93;
          goto _L7
        byte0 = 25;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "i\0206w\032k\020}m\fl\033}j\026t\0330|Uz\021/9%^;}|\033\177\f$i\001u\02137".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 284
    //                   0 307
    //                   1 314
    //                   2 321
    //                   3 328;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_328;
_L8:
        byte1 = 117;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 28;
          goto _L14
_L10:
        byte1 = 126;
          goto _L14
_L11:
        byte1 = 93;
          goto _L14
        byte1 = 25;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = "i\0206w\032k\020}}\034{\033.mUo\0355|\030y^;v\007<.\037\\UL5\036J@OL}|\033\177\f$i\001u\02137".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 399
    //                   1 406
    //                   2 413
    //                   3 420;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_420;
_L15:
        byte2 = 117;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 28;
          goto _L21
_L17:
        byte2 = 126;
          goto _L21
_L18:
        byte2 = 93;
          goto _L21
        byte2 = 25;
          goto _L21
_L28:
        byte byte2;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 468
    //                   0 491
    //                   1 498
    //                   2 505
    //                   3 512;
           goto _L22 _L23 _L24 _L25 _L26
_L23:
        break; /* Loop/switch isn't completed */
_L26:
        break MISSING_BLOCK_LABEL_512;
_L22:
        byte byte3 = 117;
_L29:
        ac[i] = (char)(byte3 ^ c);
        i++;
        if (true) goto _L28; else goto _L27
_L27:
        byte3 = 28;
          goto _L29
_L24:
        byte3 = 126;
          goto _L29
_L25:
        byte3 = 93;
          goto _L29
        byte3 = 25;
          goto _L29
    }

    public ator()
    {
    }
}
