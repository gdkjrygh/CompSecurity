// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.io.PrintStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            PBE, BaseMac, BCPBEKey

public abstract class BaseWrapCipher extends CipherSpi
    implements PBE
{

    private static final String z[];
    private Class availableSpecs[] = {
        javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec, javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec
    };
    protected AlgorithmParameters engineParams;
    private byte iv[];
    private int ivSize;
    protected Wrapper wrapEngine;

    protected BaseWrapCipher()
    {
        engineParams = null;
        wrapEngine = null;
    }

    protected BaseWrapCipher(Wrapper wrapper)
    {
        this(wrapper, 0);
    }

    protected BaseWrapCipher(Wrapper wrapper, int i)
    {
        engineParams = null;
        wrapEngine = null;
        wrapEngine = wrapper;
        ivSize = i;
    }

    protected int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        return 0;
    }

    protected byte[] engineDoFinal(byte abyte0[], int i, int j)
    {
        return null;
    }

    protected int engineGetBlockSize()
    {
        return 0;
    }

    protected byte[] engineGetIV()
    {
        return (byte[])(byte[])iv.clone();
    }

    protected int engineGetKeySize(Key key)
    {
        return key.getEncoded().length;
    }

    protected int engineGetOutputSize(int i)
    {
        return -1;
    }

    protected AlgorithmParameters engineGetParameters()
    {
        return null;
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
        engineParams = algorithmparameters;
        engineInit(i, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
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
            throw new IllegalArgumentException(key.getMessage());
        }
    }

    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        boolean flag;
        Object obj;
label0:
        {
label1:
            {
label2:
                {
                    flag = BaseMac.a;
                    if (!(key instanceof BCPBEKey))
                    {
                        break label1;
                    }
                    BCPBEKey bcpbekey = (BCPBEKey)key;
                    if (algorithmparameterspec instanceof PBEParameterSpec)
                    {
                        obj = PBE.Util.makePBEParameters(bcpbekey, algorithmparameterspec, wrapEngine.getAlgorithmName());
                        if (!flag)
                        {
                            break label2;
                        }
                    }
                    try
                    {
                        obj = bcpbekey.getParam();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Key key)
                    {
                        throw key;
                    }
                    if (obj != null)
                    {
                        obj = bcpbekey.getParam();
                        if (!flag)
                        {
                            break label2;
                        }
                    }
                    try
                    {
                        throw new InvalidAlgorithmParameterException(z[4]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Key key)
                    {
                        throw key;
                    }
                }
                if (!flag)
                {
                    break label0;
                }
            }
            obj = new KeyParameter(key.getEncoded());
        }
label3:
        {
            key = ((Key) (obj));
            if (algorithmparameterspec instanceof IvParameterSpec)
            {
                key = new ParametersWithIV(((org.spongycastle.crypto.CipherParameters) (obj)), ((IvParameterSpec)algorithmparameterspec).getIV());
            }
            int j;
            try
            {
                if (!(key instanceof KeyParameter))
                {
                    break label3;
                }
                j = ivSize;
            }
            // Misplaced declaration of an exception variable
            catch (Key key)
            {
                throw key;
            }
            if (j != 0)
            {
                iv = new byte[ivSize];
                securerandom.nextBytes(iv);
                key = new ParametersWithIV(key, iv);
            }
        }
        if (securerandom != null)
        {
            key = new ParametersWithRandom(key, securerandom);
        }
        i;
        JVM INSTR tableswitch 1 4: default 236
    //                   1 283
    //                   2 283
    //                   3 251
    //                   4 267;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        System.out.println(z[2]);
_L5:
        return;
_L3:
        wrapEngine.init(true, key);
        if (!flag) goto _L5; else goto _L4
_L4:
        try
        {
            wrapEngine.init(false, key);
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw key;
        }
        if (!flag) goto _L5; else goto _L2
_L2:
        throw new IllegalArgumentException(z[3]);
        key;
        throw key;
    }

    protected void engineSetMode(String s)
    {
        throw new NoSuchAlgorithmException((new StringBuilder()).append(z[11]).append(s).toString());
    }

    protected void engineSetPadding(String s)
    {
        throw new NoSuchPaddingException((new StringBuilder()).append(z[12]).append(s).append(z[13]).toString());
    }

    protected Key engineUnwrap(byte abyte0[], String s, int i)
    {
        byte abyte1[];
        try
        {
label0:
            {
                if (wrapEngine == null)
                {
                    abyte1 = engineDoFinal(abyte0, 0, abyte0.length);
                    if (!BaseMac.a)
                    {
                        break label0;
                    }
                }
                abyte1 = wrapEngine.unwrap(abyte0, 0, abyte0.length);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException(abyte0.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException(abyte0.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException(abyte0.getMessage());
        }
        if (i == 3)
        {
            try
            {
                abyte0 = new SecretKeySpec(abyte1, s);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            return abyte0;
        }
        break MISSING_BLOCK_LABEL_98;
        try
        {
            abyte0 = KeyFactory.getInstance(s, z[8]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException((new StringBuilder()).append(z[7]).append(abyte0.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException((new StringBuilder()).append(z[10]).append(abyte0.getMessage()).toString());
        }
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        abyte0 = abyte0.generatePublic(new X509EncodedKeySpec(abyte1));
        return abyte0;
        if (i != 2)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        abyte0 = abyte0.generatePrivate(new PKCS8EncodedKeySpec(abyte1));
        return abyte0;
        abyte0;
        throw abyte0;
        throw new InvalidKeyException((new StringBuilder()).append(z[9]).append(i).toString());
    }

    protected int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        throw new RuntimeException(z[1]);
    }

    protected byte[] engineUpdate(byte abyte0[], int i, int j)
    {
        throw new RuntimeException(z[5]);
    }

    protected byte[] engineWrap(Key key)
    {
        key = key.getEncoded();
        if (key == null)
        {
            try
            {
                throw new InvalidKeyException(z[6]);
            }
            // Misplaced declaration of an exception variable
            catch (Key key)
            {
                throw key;
            }
        }
        if (wrapEngine != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        key = engineDoFinal(key, 0, key.length);
        return key;
        key;
        throw key;
        try
        {
            key = wrapEngine.wrap(key, 0, key.length);
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new IllegalBlockSizeException(key.getMessage());
        }
        return key;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = ",i(M_o`'\004O#mf\032J=i+\017_*zf".toCharArray();
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
            obj1 = "!g2JX:x6\005Y;m\"JM zf\035Y.x6\003E(".toCharArray();
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
        byte0 = 43;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 79;
          goto _L7
_L3:
        byte0 = 8;
          goto _L7
_L4:
        byte0 = 70;
          goto _L7
        byte0 = 106;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "*m#\001\n".toCharArray();
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
        byte1 = 43;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 79;
          goto _L14
_L10:
        byte1 = 8;
          goto _L14
_L11:
        byte1 = 70;
          goto _L14
        byte1 = 106;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "*f!\003E*()\004G6(0\013G&lf\fD=(1\030J?x/\004L".toCharArray();
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
        byte2 = 43;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 79;
          goto _L21
_L17:
        byte2 = 8;
          goto _L21
_L18:
        byte2 = 70;
          goto _L21
        byte2 = 106;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "\037J\003JY*y3\003Y*{f:i\n(6\013Y.e#\036N={f\036Doj#JX*|h".toCharArray();
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
        byte3 = 43;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 79;
          goto _L28
_L24:
        byte3 = 8;
          goto _L28
_L25:
        byte3 = 70;
          goto _L28
        byte3 = 106;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "!g2JX:x6\005Y;m\"JM zf\035Y.x6\003E(".toCharArray();
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
        byte4 = 43;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 79;
          goto _L35
_L31:
        byte4 = 8;
          goto _L35
_L32:
        byte4 = 70;
          goto _L35
        byte4 = 106;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "\fi(\004D;(1\030J?(-\017Rc((\037G#(#\004H l/\004La".toCharArray();
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
        byte5 = 43;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 79;
          goto _L42
_L38:
        byte5 = 8;
          goto _L42
_L39:
        byte5 = 70;
          goto _L42
        byte5 = 106;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "\032f-\004D8ff\001N6(2\023[*(".toCharArray();
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
        byte6 = 43;
_L49:
        obj6[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 79;
          goto _L49
_L45:
        byte6 = 8;
          goto _L49
_L46:
        byte6 = 70;
          goto _L49
        byte6 = 106;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "\034K".toCharArray();
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
        byte7 = 43;
_L56:
        obj7[i] = (char)(byte7 ^ c);
        i++;
          goto _L55
_L51:
        byte7 = 79;
          goto _L56
_L52:
        byte7 = 8;
          goto _L56
_L53:
        byte7 = 70;
          goto _L56
        byte7 = 106;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            obj9 = "\032f-\004D8ff\001N6(2\023[*(".toCharArray();
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
        byte8 = 43;
_L63:
        obj8[i] = (char)(byte8 ^ c);
        i++;
          goto _L62
_L58:
        byte8 = 79;
          goto _L63
_L59:
        byte8 = 8;
          goto _L63
_L60:
        byte8 = 70;
          goto _L63
        byte8 = 106;
          goto _L63
_L69:
        byte byte8;
        if (j <= i)
        {
            obj9 = (new String(((char []) (obj9)))).intern();
            obj10 = "\032f-\004D8ff\001N6(2\023[*(".toCharArray();
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
        byte9 = 43;
_L70:
        obj9[i] = (char)(byte9 ^ c);
        i++;
          goto _L69
_L65:
        byte9 = 79;
          goto _L70
_L66:
        byte9 = 8;
          goto _L70
_L67:
        byte9 = 70;
          goto _L70
        byte9 = 106;
          goto _L70
_L76:
        byte byte9;
        if (j <= i)
        {
            obj10 = (new String(((char []) (obj10)))).intern();
            obj11 = ",i(M_o{3\032[ z2JF l#J".toCharArray();
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
        byte10 = 43;
_L77:
        obj10[i] = (char)(byte10 ^ c);
        i++;
          goto _L76
_L72:
        byte10 = 79;
          goto _L77
_L73:
        byte10 = 8;
          goto _L77
_L74:
        byte10 = 70;
          goto _L77
        byte10 = 106;
          goto _L77
_L83:
        byte byte10;
        if (j <= i)
        {
            obj11 = (new String(((char []) (obj11)))).intern();
            obj12 = "\037i\"\016B!of".toCharArray();
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
        byte11 = 43;
_L84:
        obj11[i] = (char)(byte11 ^ c);
        i++;
          goto _L83
_L79:
        byte11 = 79;
          goto _L84
_L80:
        byte11 = 8;
          goto _L84
_L81:
        byte11 = 70;
          goto _L84
        byte11 = 106;
          goto _L84
_L90:
        byte byte11;
        if (j <= i)
        {
            obj12 = (new String(((char []) (obj12)))).intern();
            ac = "o}(\001E \177(D".toCharArray();
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
        byte12 = 43;
_L91:
        obj12[i] = (char)(byte12 ^ c);
        i++;
          goto _L90
_L86:
        byte12 = 79;
          goto _L91
_L87:
        byte12 = 8;
          goto _L91
_L88:
        byte12 = 70;
          goto _L91
        byte12 = 106;
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
        byte byte13 = 43;
_L99:
        ac[i] = (char)(byte13 ^ c);
        i++;
        if (true) goto _L98; else goto _L97
_L97:
        byte13 = 79;
          goto _L99
_L94:
        byte13 = 8;
          goto _L99
_L95:
        byte13 = 70;
          goto _L99
        byte13 = 106;
          goto _L99
    }
}
