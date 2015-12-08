// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.crypto.generators.DHKeyPairGenerator;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHKeyParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.parsers.DHIESPublicKeyParser;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jce.interfaces.IESKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.IESParameterSpec;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dh:
//            DHUtil

public class IESCipher extends CipherSpi
{

    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private IESEngine engine;
    private AlgorithmParameters engineParam;
    private IESParameterSpec engineSpec;
    private AsymmetricKeyParameter key;
    private AsymmetricKeyParameter otherKeyParameter;
    private SecureRandom random;
    private int state;

    public IESCipher(IESEngine iesengine)
    {
        state = -1;
        buffer = new ByteArrayOutputStream();
        engineParam = null;
        engineSpec = null;
        dhaesMode = false;
        otherKeyParameter = null;
        engine = iesengine;
    }

    public int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        abyte0 = engineDoFinal(abyte0, i, j);
        System.arraycopy(abyte0, 0, abyte1, k, abyte0.length);
        return abyte0.length;
    }

    public byte[] engineDoFinal(byte abyte0[], int i, int j)
    {
        if (j != 0)
        {
            buffer.write(abyte0, i, j);
        }
        abyte0 = buffer.toByteArray();
        buffer.reset();
        IESWithCipherParameters ieswithcipherparameters = new IESWithCipherParameters(engineSpec.getDerivationV(), engineSpec.getEncodingV(), engineSpec.getMacKeySize(), engineSpec.getCipherKeySize());
        Object obj = ((DHKeyParameters)key).getParameters();
        if (otherKeyParameter != null)
        {
            try
            {
                if (state == 1 || state == 3)
                {
                    engine.init(true, otherKeyParameter, key, ieswithcipherparameters);
                } else
                {
                    engine.init(false, key, otherKeyParameter, ieswithcipherparameters);
                }
                return engine.processBlock(abyte0, 0, abyte0.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new BadPaddingException(abyte0.getMessage());
            }
        }
        if (state == 1 || state == 3)
        {
            DHKeyPairGenerator dhkeypairgenerator = new DHKeyPairGenerator();
            dhkeypairgenerator.init(new DHKeyGenerationParameters(random, ((DHParameters) (obj))));
            obj = new EphemeralKeyPairGenerator(dhkeypairgenerator, new _cls1());
            try
            {
                engine.init(key, ieswithcipherparameters, ((EphemeralKeyPairGenerator) (obj)));
                abyte0 = engine.processBlock(abyte0, 0, abyte0.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new BadPaddingException(abyte0.getMessage());
            }
            return abyte0;
        }
        if (state == 2 || state == 4)
        {
            try
            {
                engine.init(key, ieswithcipherparameters, new DHIESPublicKeyParser(((DHKeyParameters)key).getParameters()));
                abyte0 = engine.processBlock(abyte0, 0, abyte0.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new BadPaddingException(abyte0.getMessage());
            }
            return abyte0;
        } else
        {
            throw new IllegalStateException("IESCipher not initialised");
        }
    }

    public int engineGetBlockSize()
    {
        if (engine.getCipher() != null)
        {
            return engine.getCipher().getBlockSize();
        } else
        {
            return 0;
        }
    }

    public byte[] engineGetIV()
    {
        return null;
    }

    public int engineGetKeySize(Key key1)
    {
        if (key1 instanceof DHKey)
        {
            return ((DHKey)key1).getParams().getP().bitLength();
        } else
        {
            throw new IllegalArgumentException("not a DH key");
        }
    }

    public int engineGetOutputSize(int i)
    {
        int j = engine.getMac().getMacSize();
        int k;
        if (key != null)
        {
            k = ((DHKey)key).getParams().getP().bitLength() / 8 + 1;
            if (engine.getCipher() != null)
            {
                if (state == 1 || state == 3)
                {
                    i = engine.getCipher().getOutputSize(i);
                } else
                if (state == 2 || state == 4)
                {
                    i = engine.getCipher().getOutputSize(i - j - k);
                } else
                {
                    throw new IllegalStateException("cipher not initialised");
                }
            }
            if (state == 1 || state == 3)
            {
                return k + (j + buffer.size()) + i;
            }
        } else
        {
            throw new IllegalStateException("cipher not initialised");
        }
        if (state == 2 || state == 4)
        {
            return (buffer.size() - j - k) + i;
        } else
        {
            throw new IllegalStateException("IESCipher not initialised");
        }
    }

    public AlgorithmParameters engineGetParameters()
    {
        if (engineParam == null && engineSpec != null)
        {
            try
            {
                engineParam = AlgorithmParameters.getInstance("IES", BouncyCastleProvider.PROVIDER_NAME);
                engineParam.init(engineSpec);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.toString());
            }
        }
        return engineParam;
    }

    public void engineInit(int i, Key key1, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        AlgorithmParameterSpec algorithmparameterspec = null;
        if (algorithmparameters != null)
        {
            try
            {
                algorithmparameterspec = algorithmparameters.getParameterSpec(org/bouncycastle/jce/spec/IESParameterSpec);
            }
            // Misplaced declaration of an exception variable
            catch (Key key1)
            {
                throw new InvalidAlgorithmParameterException((new StringBuilder()).append("cannot recognise parameters: ").append(key1.toString()).toString());
            }
        }
        engineParam = algorithmparameters;
        engineInit(i, key1, algorithmparameterspec, securerandom);
    }

    public void engineInit(int i, Key key1, SecureRandom securerandom)
    {
        try
        {
            engineInit(i, key1, (AlgorithmParameterSpec)null, securerandom);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key1)
        {
            throw new IllegalArgumentException("can't handle supplied parameter spec");
        }
    }

    public void engineInit(int i, Key key1, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (algorithmparameterspec == null)
        {
            engineSpec = IESUtil.guessParameterSpec(engine);
        } else
        if (algorithmparameterspec instanceof IESParameterSpec)
        {
            engineSpec = (IESParameterSpec)algorithmparameterspec;
        } else
        {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        }
        if (i == 1 || i == 3)
        {
            if (key1 instanceof DHPublicKey)
            {
                key = DHUtil.generatePublicKeyParameter((PublicKey)key1);
            } else
            if (key1 instanceof IESKey)
            {
                key1 = (IESKey)key1;
                key = DHUtil.generatePublicKeyParameter(key1.getPublic());
                otherKeyParameter = DHUtil.generatePrivateKeyParameter(key1.getPrivate());
            } else
            {
                throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
            }
        } else
        if (i == 2 || i == 4)
        {
            if (key1 instanceof DHPrivateKey)
            {
                key = DHUtil.generatePrivateKeyParameter((PrivateKey)key1);
            } else
            if (key1 instanceof IESKey)
            {
                key1 = (IESKey)key1;
                otherKeyParameter = DHUtil.generatePublicKeyParameter(key1.getPublic());
                key = DHUtil.generatePrivateKeyParameter(key1.getPrivate());
            } else
            {
                throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
            }
        } else
        {
            throw new InvalidKeyException("must be passed EC key");
        }
        random = securerandom;
        state = i;
        buffer.reset();
    }

    public void engineSetMode(String s)
    {
        String s1 = Strings.toUpperCase(s);
        if (s1.equals("NONE"))
        {
            dhaesMode = false;
            return;
        }
        if (s1.equals("DHAES"))
        {
            dhaesMode = true;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("can't support mode ").append(s).toString());
        }
    }

    public void engineSetPadding(String s)
    {
        for (s = Strings.toUpperCase(s); s.equals("NOPADDING") || s.equals("PKCS5PADDING") || s.equals("PKCS7PADDING");)
        {
            return;
        }

        throw new NoSuchPaddingException("padding not available with IESCipher");
    }

    public int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        buffer.write(abyte0, i, j);
        return 0;
    }

    public byte[] engineUpdate(byte abyte0[], int i, int j)
    {
        buffer.write(abyte0, i, j);
        return null;
    }

    private class _cls1
        implements KeyEncoder
    {

        final IESCipher this$0;

        public byte[] getEncoded(AsymmetricKeyParameter asymmetrickeyparameter)
        {
            byte abyte0[] = new byte[(((DHKeyParameters)asymmetrickeyparameter).getParameters().getP().bitLength() + 7) / 8];
            asymmetrickeyparameter = BigIntegers.asUnsignedByteArray(((DHPublicKeyParameters)asymmetrickeyparameter).getY());
            if (asymmetrickeyparameter.length > abyte0.length)
            {
                throw new IllegalArgumentException("Senders's public key longer than expected.");
            } else
            {
                System.arraycopy(asymmetrickeyparameter, 0, abyte0, abyte0.length - asymmetrickeyparameter.length, asymmetrickeyparameter.length);
                return abyte0;
            }
        }

        _cls1()
        {
            this$0 = IESCipher.this;
            super();
        }
    }

}
