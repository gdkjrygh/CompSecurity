// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

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
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BouncyCastleProvider

public class JCEStreamCipher extends CipherSpi
    implements PBE
{

    private Class availableSpecs[] = {
        javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec, javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec
    };
    private StreamCipher cipher;
    private AlgorithmParameters engineParams;
    private int ivLength;
    private ParametersWithIV ivParam;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    protected JCEStreamCipher(BlockCipher blockcipher, int i)
    {
        ivLength = 0;
        pbeSpec = null;
        pbeAlgorithm = null;
        ivLength = i;
        cipher = new StreamBlockCipher(blockcipher);
    }

    protected JCEStreamCipher(StreamCipher streamcipher, int i)
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
            cipher.processBytes(abyte0, i, j, abyte1, k);
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
        if (ivParam != null)
        {
            return ivParam.getIV();
        } else
        {
            return null;
        }
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
        if (engineParams == null && pbeSpec != null)
        {
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance(pbeAlgorithm, BouncyCastleProvider.PROVIDER_NAME);
                algorithmparameters.init(pbeSpec);
            }
            catch (Exception exception)
            {
                return null;
            }
            return algorithmparameters;
        } else
        {
            return engineParams;
        }
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        if (algorithmparameters == null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        if (j == availableSpecs.length)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        Object obj = algorithmparameters.getParameterSpec(availableSpecs[j]);
_L5:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("can't handle parameter ").append(algorithmparameters.toString()).toString());
        }
          goto _L3
        obj;
        j++;
          goto _L4
_L2:
        obj1 = null;
_L3:
        engineInit(i, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
        engineParams = algorithmparameters;
        return;
        obj = null;
          goto _L5
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
label0:
        {
label1:
            {
                pbeSpec = null;
                pbeAlgorithm = null;
                engineParams = null;
                if (!(key instanceof SecretKey))
                {
                    throw new InvalidKeyException((new StringBuilder()).append("Key for algorithm ").append(key.getAlgorithm()).append(" not suitable for symmetric enryption.").toString());
                }
                if (key instanceof BCPBEKey)
                {
                    BCPBEKey bcpbekey = (BCPBEKey)key;
                    if (bcpbekey.getOID() != null)
                    {
                        pbeAlgorithm = bcpbekey.getOID().getId();
                    } else
                    {
                        pbeAlgorithm = bcpbekey.getAlgorithm();
                    }
                    if (bcpbekey.getParam() != null)
                    {
                        key = bcpbekey.getParam();
                        pbeSpec = new PBEParameterSpec(bcpbekey.getSalt(), bcpbekey.getIterationCount());
                    } else
                    if (algorithmparameterspec instanceof PBEParameterSpec)
                    {
                        key = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(bcpbekey, algorithmparameterspec, cipher.getAlgorithmName());
                        pbeSpec = (PBEParameterSpec)algorithmparameterspec;
                    } else
                    {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                    if (bcpbekey.getIvSize() != 0)
                    {
                        ivParam = (ParametersWithIV)key;
                    }
                } else
                if (algorithmparameterspec == null)
                {
                    key = new KeyParameter(key.getEncoded());
                } else
                if (algorithmparameterspec instanceof IvParameterSpec)
                {
                    key = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec)algorithmparameterspec).getIV());
                    ivParam = (ParametersWithIV)key;
                } else
                {
                    throw new IllegalArgumentException("unknown parameter type.");
                }
                algorithmparameterspec = key;
                if (ivLength != 0)
                {
                    algorithmparameterspec = key;
                    if (!(key instanceof ParametersWithIV))
                    {
                        algorithmparameterspec = securerandom;
                        if (securerandom == null)
                        {
                            algorithmparameterspec = new SecureRandom();
                        }
                        if (i != 1 && i != 3)
                        {
                            break label1;
                        }
                        securerandom = new byte[ivLength];
                        algorithmparameterspec.nextBytes(securerandom);
                        algorithmparameterspec = new ParametersWithIV(key, securerandom);
                        ivParam = (ParametersWithIV)algorithmparameterspec;
                    }
                }
                switch (i)
                {
                default:
                    System.out.println("eeek!");
                    return;

                case 1: // '\001'
                case 3: // '\003'
                    cipher.init(true, algorithmparameterspec);
                    return;

                case 2: // '\002'
                case 4: // '\004'
                    cipher.init(false, algorithmparameterspec);
                    break;
                }
                break label0;
            }
            throw new InvalidAlgorithmParameterException("no IV set when one expected");
        }
    }

    protected void engineSetMode(String s)
    {
        if (!s.equalsIgnoreCase("ECB"))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("can't support mode ").append(s).toString());
        } else
        {
            return;
        }
    }

    protected void engineSetPadding(String s)
    {
        if (!s.equalsIgnoreCase("NoPadding"))
        {
            throw new NoSuchPaddingException((new StringBuilder()).append("Padding ").append(s).append(" unknown.").toString());
        } else
        {
            return;
        }
    }

    protected Key engineUnwrap(byte abyte0[], String s, int i)
    {
        try
        {
            abyte0 = engineDoFinal(abyte0, 0, abyte0.length);
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
        if (i != 3) goto _L2; else goto _L1
_L1:
        abyte0 = new SecretKeySpec(abyte0, s);
_L4:
        return abyte0;
_L2:
        if (!s.equals("") || i != 2)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        PrivateKeyInfo privatekeyinfo;
        try
        {
            privatekeyinfo = PrivateKeyInfo.getInstance(abyte0);
            s = BouncyCastleProvider.getPrivateKey(privatekeyinfo);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException("Invalid key encoding.");
        }
        abyte0 = s;
        if (s != null) goto _L4; else goto _L3
_L3:
        throw new InvalidKeyException((new StringBuilder()).append("algorithm ").append(privatekeyinfo.getPrivateKeyAlgorithm().getAlgorithm()).append(" not supported").toString());
        try
        {
            s = KeyFactory.getInstance(s, BouncyCastleProvider.PROVIDER_NAME);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException((new StringBuilder()).append("Unknown key type ").append(abyte0.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException((new StringBuilder()).append("Unknown key type ").append(abyte0.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new InvalidKeyException((new StringBuilder()).append("Unknown key type ").append(abyte0.getMessage()).toString());
        }
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        return s.generatePublic(new X509EncodedKeySpec(abyte0));
        if (i != 2)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        abyte0 = s.generatePrivate(new PKCS8EncodedKeySpec(abyte0));
        return abyte0;
        throw new InvalidKeyException((new StringBuilder()).append("Unknown key type ").append(i).toString());
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

    protected byte[] engineWrap(Key key)
    {
        key = key.getEncoded();
        if (key == null)
        {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try
        {
            key = engineDoFinal(key, 0, key.length);
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new IllegalBlockSizeException(key.getMessage());
        }
        return key;
    }
}
