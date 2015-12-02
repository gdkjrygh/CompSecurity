// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseWrapCipher, PBE, BaseMac, BCPBEKey

public class BaseStreamCipher extends BaseWrapCipher
    implements PBE
{

    private static final String z[];
    private Class availableSpecs[] = {
        javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec, javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec
    };
    private StreamCipher cipher;
    private int ivLength;
    private ParametersWithIV ivParam;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    protected BaseStreamCipher(StreamCipher streamcipher, int i)
    {
        ivLength = 0;
        pbeSpec = null;
        pbeAlgorithm = null;
        cipher = streamcipher;
        ivLength = i;
    }

    protected int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (j != 0)
        {
            try
            {
                cipher.processBytes(abyte0, i, j, abyte1, k);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        cipher.reset();
        return j;
    }

    protected byte[] engineDoFinal(byte abyte0[], int i, int j)
    {
        if (j != 0)
        {
            abyte0 = engineUpdate(abyte0, i, j);
            cipher.reset();
            return abyte0;
        } else
        {
            cipher.reset();
            return new byte[0];
        }
    }

    protected int engineGetBlockSize()
    {
        return 0;
    }

    protected byte[] engineGetIV()
    {
label0:
        {
            byte abyte0[];
            try
            {
                if (ivParam == null)
                {
                    break label0;
                }
                abyte0 = ivParam.getIV();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return abyte0;
        }
        return null;
    }

    protected int engineGetKeySize(Key key)
    {
        return key.getEncoded().length * 8;
    }

    protected int engineGetOutputSize(int i)
    {
        return i;
    }

    protected AlgorithmParameters engineGetParameters()
    {
        PBEParameterSpec pbeparameterspec;
        try
        {
            if (engineParams != null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            pbeparameterspec = pbeSpec;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (pbeparameterspec != null)
        {
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance(pbeAlgorithm, z[11]);
                algorithmparameters.init(pbeSpec);
            }
            catch (Exception exception1)
            {
                return null;
            }
            return algorithmparameters;
        }
        return engineParams;
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        int j = 0;
        if (algorithmparameters == null) goto _L2; else goto _L1
_L1:
        if (j == availableSpecs.length)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = algorithmparameters.getParameterSpec(availableSpecs[j]);
_L4:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            try
            {
                throw new InvalidAlgorithmParameterException((new StringBuilder()).append(z[0]).append(algorithmparameters.toString()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Key key)
            {
                throw key;
            }
        }
        break MISSING_BLOCK_LABEL_98;
        obj;
        j++;
        if (!BaseMac.a) goto _L1; else goto _L3
_L3:
        obj = null;
          goto _L4
        if (true) goto _L1; else goto _L2
_L2:
        obj1 = null;
        engineInit(i, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
        engineParams = algorithmparameters;
        return;
    }

    protected void engineInit(int i, Key key, SecureRandom securerandom)
    {
        try
        {
            engineInit(i, key, (AlgorithmParameterSpec)null, securerandom);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidKeyException(key.getMessage());
        }
    }

    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        boolean flag;
        flag = BaseMac.a;
        try
        {
            pbeSpec = null;
            pbeAlgorithm = null;
            engineParams = null;
            if (!(key instanceof SecretKey))
            {
                throw new InvalidKeyException((new StringBuilder()).append(z[3]).append(key.getAlgorithm()).append(z[6]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw key;
        }
        if (!(key instanceof BCPBEKey)) goto _L2; else goto _L1
_L1:
        Object obj;
        BCPBEKey bcpbekey;
        bcpbekey = (BCPBEKey)key;
        pbeAlgorithm = bcpbekey.getAlgorithm();
        if (bcpbekey.getParam() != null)
        {
            obj = bcpbekey.getParam();
            boolean flag1;
            try
            {
                pbeSpec = new PBEParameterSpec(bcpbekey.getSalt(), bcpbekey.getIterationCount());
            }
            // Misplaced declaration of an exception variable
            catch (Key key)
            {
                throw key;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_197;
            }
        }
        flag1 = algorithmparameterspec instanceof PBEParameterSpec;
        if (flag1)
        {
            obj = PBE.Util.makePBEParameters(bcpbekey, algorithmparameterspec, cipher.getAlgorithmName());
            try
            {
                pbeSpec = (PBEParameterSpec)algorithmparameterspec;
            }
            // Misplaced declaration of an exception variable
            catch (Key key)
            {
                throw key;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_197;
            }
        }
        throw new InvalidAlgorithmParameterException(z[2]);
        try
        {
            if (bcpbekey.getIvSize() > 0)
            {
                ivParam = (ParametersWithIV)obj;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw key;
        }
        if (!flag) goto _L3; else goto _L2
_L2:
        if (algorithmparameterspec != null) goto _L5; else goto _L4
_L4:
        obj = new KeyParameter(key.getEncoded());
        if (!flag) goto _L6; else goto _L5
_L5:
        boolean flag2;
        try
        {
            flag2 = algorithmparameterspec instanceof IvParameterSpec;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw key;
        }
        if (flag2)
        {
            key = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec)algorithmparameterspec).getIV());
            try
            {
                ivParam = (ParametersWithIV)key;
            }
            // Misplaced declaration of an exception variable
            catch (Key key)
            {
                throw key;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_318;
            }
        }
        throw new InvalidAlgorithmParameterException(z[7]);
_L12:
        boolean flag3;
        try
        {
            if (ivLength == 0)
            {
                break MISSING_BLOCK_LABEL_419;
            }
            flag3 = key instanceof ParametersWithIV;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw key;
        }
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        algorithmparameterspec = securerandom;
        if (securerandom == null)
        {
            algorithmparameterspec = new SecureRandom();
        }
        if (i == 1 || i == 3)
        {
            securerandom = new byte[ivLength];
            algorithmparameterspec.nextBytes(securerandom);
            key = new ParametersWithIV(key, securerandom);
            try
            {
                ivParam = (ParametersWithIV)key;
            }
            // Misplaced declaration of an exception variable
            catch (Key key)
            {
                throw key;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_419;
            }
        }
        throw new InvalidAlgorithmParameterException(z[4]);
        i;
        JVM INSTR tableswitch 1 4: default 452
    //                   1 506
    //                   2 522
    //                   3 506
    //                   4 522;
           goto _L7 _L8 _L9 _L8 _L9
_L7:
        try
        {
            throw new InvalidParameterException((new StringBuilder()).append(z[5]).append(i).append(z[1]).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Key key) { }
        try
        {
            throw key;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidKeyException(key.getMessage());
        }
_L8:
        cipher.init(true, key);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L9:
        cipher.init(false, key);
        if (!flag)
        {
            return;
        }
        if (true) goto _L7; else goto _L10
_L10:
        key;
        try
        {
            throw key;
        }
        // Misplaced declaration of an exception variable
        catch (Key key) { }
        throw key;
_L6:
        key = ((Key) (obj));
        continue; /* Loop/switch isn't completed */
_L3:
        key = ((Key) (obj));
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected void engineSetMode(String s)
    {
        try
        {
            if (!s.equalsIgnoreCase(z[12]))
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[13]).append(s).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    protected void engineSetPadding(String s)
    {
        try
        {
            if (!s.equalsIgnoreCase(z[9]))
            {
                throw new NoSuchPaddingException((new StringBuilder()).append(z[10]).append(s).append(z[8]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    protected int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        try
        {
            cipher.processBytes(abyte0, i, j, abyte1, k);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ShortBufferException(abyte0.getMessage());
        }
        return j;
    }

    protected byte[] engineUpdate(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        cipher.processBytes(abyte0, i, j, abyte1, 0);
        return abyte1;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "lB[2g/KT{wcF\025er}BXpgjQ\025".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "/STf`jG".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 608
    //                   0 631
    //                   1 638
    //                   2 645
    //                   3 652;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_652;
_L1:
        byte0 = 19;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 15;
          goto _L7
_L3:
        byte0 = 35;
          goto _L7
_L4:
        byte0 = 53;
          goto _L7
        byte0 = 21;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "_ap5ajR@|ajP\025EQJ\003EtanNPav}P\025a|/AP5`jW\033".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 700
    //                   0 723
    //                   1 730
    //                   2 737
    //                   3 744;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_744;
_L8:
        byte1 = 19;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 15;
          goto _L14
_L10:
        byte1 = 35;
          goto _L14
_L11:
        byte1 = 53;
          goto _L14
        byte1 = 21;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "DFL5u`Q\025t\177hLG|ggN\025".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 792
    //                   0 815
    //                   1 822
    //                   2 829
    //                   3 836;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_836;
_L15:
        byte2 = 19;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 15;
          goto _L21
_L17:
        byte2 = 35;
          goto _L21
_L18:
        byte2 = 53;
          goto _L21
        byte2 = 21;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "aL\025\\E/PPa3xKP{3`MP5vwSPvgjG".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 884
    //                   0 907
    //                   1 914
    //                   2 921
    //                   3 928;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_928;
_L22:
        byte3 = 19;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 15;
          goto _L28
_L24:
        byte3 = 35;
          goto _L28
_L25:
        byte3 = 53;
          goto _L28
        byte3 = 21;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "zM^{|xM\025zcbLQp3".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 976
    //                   0 1000
    //                   1 1007
    //                   2 1014
    //                   3 1021;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_1021;
_L29:
        byte4 = 19;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 15;
          goto _L35
_L31:
        byte4 = 35;
          goto _L35
_L32:
        byte4 = 53;
          goto _L35
        byte4 = 21;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "/MZa3|V\\armOP5u`Q\025fjbNPaaf@\025p}}ZEaz`M\033".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1068
    //                   0 1092
    //                   1 1099
    //                   2 1106
    //                   3 1113;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1113;
_L36:
        byte5 = 19;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 15;
          goto _L42
_L38:
        byte5 = 35;
          goto _L42
_L39:
        byte5 = 53;
          goto _L42
        byte5 = 21;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "zM^{|xM\025er}BXpgjQ\025aj\177F\033".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1160
    //                   0 1184
    //                   1 1191
    //                   2 1198
    //                   3 1205;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1205;
_L43:
        byte6 = 19;
_L49:
        obj6[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 15;
          goto _L49
_L45:
        byte6 = 35;
          goto _L49
_L46:
        byte6 = 53;
          goto _L49
        byte6 = 21;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "/V[~}`T[;".toCharArray();
            j = obj8.length;
            i = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1252
    //                   0 1276
    //                   1 1283
    //                   2 1290
    //                   3 1297;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1297;
_L50:
        byte7 = 19;
_L56:
        obj7[i] = (char)(byte7 ^ c);
        i++;
          goto _L55
_L51:
        byte7 = 15;
          goto _L56
_L52:
        byte7 = 35;
          goto _L56
_L53:
        byte7 = 53;
          goto _L56
        byte7 = 21;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            obj9 = "ALetwkJ[r".toCharArray();
            j = obj9.length;
            i = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c = obj8[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1344
    //                   0 1368
    //                   1 1375
    //                   2 1382
    //                   3 1389;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1389;
_L57:
        byte8 = 19;
_L63:
        obj8[i] = (char)(byte8 ^ c);
        i++;
          goto _L62
_L58:
        byte8 = 15;
          goto _L63
_L59:
        byte8 = 35;
          goto _L63
_L60:
        byte8 = 53;
          goto _L63
        byte8 = 21;
          goto _L63
_L69:
        byte byte8;
        if (j <= i)
        {
            obj9 = (new String(((char []) (obj9)))).intern();
            obj10 = "_BQqzaD\025".toCharArray();
            j = obj10.length;
            i = 0;
            break MISSING_BLOCK_LABEL_359;
        }
        c = obj9[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1436
    //                   0 1460
    //                   1 1467
    //                   2 1474
    //                   3 1481;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_1481;
_L64:
        byte9 = 19;
_L70:
        obj9[i] = (char)(byte9 ^ c);
        i++;
          goto _L69
_L65:
        byte9 = 15;
          goto _L70
_L66:
        byte9 = 35;
          goto _L70
_L67:
        byte9 = 53;
          goto _L70
        byte9 = 21;
          goto _L70
_L76:
        byte byte9;
        if (j <= i)
        {
            obj10 = (new String(((char []) (obj10)))).intern();
            obj11 = "\\`".toCharArray();
            j = obj11.length;
            i = 0;
            break MISSING_BLOCK_LABEL_395;
        }
        c = obj10[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1528
    //                   0 1552
    //                   1 1559
    //                   2 1566
    //                   3 1573;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_1573;
_L71:
        byte10 = 19;
_L77:
        obj10[i] = (char)(byte10 ^ c);
        i++;
          goto _L76
_L72:
        byte10 = 15;
          goto _L77
_L73:
        byte10 = 35;
          goto _L77
_L74:
        byte10 = 53;
          goto _L77
        byte10 = 21;
          goto _L77
_L83:
        byte byte10;
        if (j <= i)
        {
            obj11 = (new String(((char []) (obj11)))).intern();
            obj12 = "J`w".toCharArray();
            j = obj12.length;
            i = 0;
            break MISSING_BLOCK_LABEL_431;
        }
        c = obj11[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1620
    //                   0 1644
    //                   1 1651
    //                   2 1658
    //                   3 1665;
           goto _L78 _L79 _L80 _L81 _L82
_L82:
        break MISSING_BLOCK_LABEL_1665;
_L78:
        byte11 = 19;
_L84:
        obj11[i] = (char)(byte11 ^ c);
        i++;
          goto _L83
_L79:
        byte11 = 15;
          goto _L84
_L80:
        byte11 = 35;
          goto _L84
_L81:
        byte11 = 53;
          goto _L84
        byte11 = 21;
          goto _L84
_L90:
        byte byte11;
        if (j <= i)
        {
            obj12 = (new String(((char []) (obj12)))).intern();
            ac = "lB[2g/P@ec`QA5~`GP5".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_467;
        }
        c = obj12[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1712
    //                   0 1736
    //                   1 1743
    //                   2 1750
    //                   3 1757;
           goto _L85 _L86 _L87 _L88 _L89
_L89:
        break MISSING_BLOCK_LABEL_1757;
_L85:
        byte12 = 19;
_L91:
        obj12[i] = (char)(byte12 ^ c);
        i++;
          goto _L90
_L86:
        byte12 = 15;
          goto _L91
_L87:
        byte12 = 35;
          goto _L91
_L88:
        byte12 = 53;
          goto _L91
        byte12 = 21;
          goto _L91
_L98:
        byte byte12;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
                obj10, obj11, obj12, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1804
    //                   0 1828
    //                   1 1835
    //                   2 1842
    //                   3 1849;
           goto _L92 _L93 _L94 _L95 _L96
_L93:
        break; /* Loop/switch isn't completed */
_L96:
        break MISSING_BLOCK_LABEL_1849;
_L92:
        byte byte13 = 19;
_L99:
        ac[i] = (char)(byte13 ^ c);
        i++;
        if (true) goto _L98; else goto _L97
_L97:
        byte13 = 15;
          goto _L99
_L94:
        byte13 = 35;
          goto _L99
_L95:
        byte13 = 53;
          goto _L99
        byte13 = 21;
          goto _L99
    }
}
