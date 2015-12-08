// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.IESParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.Pack;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

public class IESEngine
{

    byte V[];
    BasicAgreement agree;
    BufferedBlockCipher cipher;
    boolean forEncryption;
    DerivationFunction kdf;
    private EphemeralKeyPairGenerator keyPairGenerator;
    private KeyParser keyParser;
    Mac mac;
    byte macBuf[];
    IESParameters param;
    CipherParameters privParam;
    CipherParameters pubParam;

    public IESEngine(BasicAgreement basicagreement, DerivationFunction derivationfunction, Mac mac1)
    {
        agree = basicagreement;
        kdf = derivationfunction;
        mac = mac1;
        macBuf = new byte[mac1.getMacSize()];
        cipher = null;
    }

    public IESEngine(BasicAgreement basicagreement, DerivationFunction derivationfunction, Mac mac1, BufferedBlockCipher bufferedblockcipher)
    {
        agree = basicagreement;
        kdf = derivationfunction;
        mac = mac1;
        macBuf = new byte[mac1.getMacSize()];
        cipher = bufferedblockcipher;
    }

    private byte[] decryptBlock(byte abyte0[], int i, int j)
    {
        byte abyte1[];
        byte abyte2[];
        byte abyte4[];
        byte abyte6[];
        byte abyte7[];
        byte abyte8[];
        int l;
        if (cipher == null)
        {
            byte abyte3[] = new byte[j - V.length - mac.getMacSize()];
            abyte2 = new byte[param.getMacKeySize() / 8];
            abyte1 = new byte[abyte3.length + abyte2.length];
            kdf.generateBytes(abyte1, 0, abyte1.length);
            if (V.length != 0)
            {
                System.arraycopy(abyte1, 0, abyte2, 0, abyte2.length);
                System.arraycopy(abyte1, abyte2.length, abyte3, 0, abyte3.length);
            } else
            {
                System.arraycopy(abyte1, 0, abyte3, 0, abyte3.length);
                System.arraycopy(abyte1, abyte3.length, abyte2, 0, abyte2.length);
            }
            abyte1 = new byte[abyte3.length];
            for (int k = 0; k != abyte3.length; k++)
            {
                abyte1[k] = (byte)(abyte0[V.length + i + k] ^ abyte3[k]);
            }

            l = abyte3.length;
        } else
        {
            abyte1 = new byte[((IESWithCipherParameters)param).getCipherKeySize() / 8];
            abyte2 = new byte[param.getMacKeySize() / 8];
            byte abyte5[] = new byte[abyte1.length + abyte2.length];
            kdf.generateBytes(abyte5, 0, abyte5.length);
            System.arraycopy(abyte5, 0, abyte1, 0, abyte1.length);
            System.arraycopy(abyte5, abyte1.length, abyte2, 0, abyte2.length);
            cipher.init(false, new KeyParameter(abyte1));
            abyte1 = new byte[cipher.getOutputSize(j - V.length - mac.getMacSize())];
            l = cipher.processBytes(abyte0, i + V.length, j - V.length - mac.getMacSize(), abyte1, 0);
            l += cipher.doFinal(abyte1, l);
        }
        abyte4 = param.getEncodingV();
        abyte6 = new byte[4];
        if (V.length != 0)
        {
            if (abyte4 != null)
            {
                Pack.intToBigEndian(abyte4.length * 8, abyte6, 0);
            } else
            {
                Pack.intToBigEndian(0, abyte6, 0);
            }
        }
        abyte7 = new byte[mac.getMacSize()];
        System.arraycopy(abyte0, (i + j) - abyte7.length, abyte7, 0, abyte7.length);
        abyte8 = new byte[abyte7.length];
        mac.init(new KeyParameter(abyte2));
        mac.update(abyte0, V.length + i, j - V.length - abyte8.length);
        if (abyte4 != null)
        {
            mac.update(abyte4, 0, abyte4.length);
        }
        if (V.length != 0)
        {
            mac.update(abyte6, 0, abyte6.length);
        }
        mac.doFinal(abyte8, 0);
        if (!Arrays.areEqual(abyte7, abyte8))
        {
            throw new InvalidCipherTextException("Invalid MAC.");
        } else
        {
            abyte0 = new byte[l];
            System.arraycopy(abyte1, 0, abyte0, 0, l);
            return abyte0;
        }
    }

    private byte[] encryptBlock(byte abyte0[], int i, int j)
    {
        byte abyte1[];
        byte abyte2[];
        int l;
        if (cipher == null)
        {
            byte abyte8[] = new byte[j];
            byte abyte3[] = new byte[param.getMacKeySize() / 8];
            abyte1 = new byte[abyte8.length + abyte3.length];
            kdf.generateBytes(abyte1, 0, abyte1.length);
            byte abyte6[];
            int k;
            if (V.length != 0)
            {
                System.arraycopy(abyte1, 0, abyte3, 0, abyte3.length);
                System.arraycopy(abyte1, abyte3.length, abyte8, 0, abyte8.length);
            } else
            {
                System.arraycopy(abyte1, 0, abyte8, 0, abyte8.length);
                System.arraycopy(abyte1, j, abyte3, 0, abyte3.length);
            }
            abyte6 = new byte[j];
            k = 0;
            do
            {
                abyte2 = abyte3;
                abyte1 = abyte6;
                l = j;
                if (k == j)
                {
                    break;
                }
                abyte6[k] = (byte)(abyte0[i + k] ^ abyte8[k]);
                k++;
            } while (true);
        } else
        {
            abyte1 = new byte[((IESWithCipherParameters)param).getCipherKeySize() / 8];
            abyte2 = new byte[param.getMacKeySize() / 8];
            byte abyte4[] = new byte[abyte1.length + abyte2.length];
            kdf.generateBytes(abyte4, 0, abyte4.length);
            System.arraycopy(abyte4, 0, abyte1, 0, abyte1.length);
            System.arraycopy(abyte4, abyte1.length, abyte2, 0, abyte2.length);
            cipher.init(true, new KeyParameter(abyte1));
            abyte1 = new byte[cipher.getOutputSize(j)];
            i = cipher.processBytes(abyte0, i, j, abyte1, 0);
            l = i + cipher.doFinal(abyte1, i);
        }
        byte abyte5[] = param.getEncodingV();
        byte abyte7[] = new byte[4];
        if (V.length != 0)
        {
            if (abyte5 == null)
            {
                Pack.intToBigEndian(0, abyte7, 0);
            } else
            {
                Pack.intToBigEndian(abyte5.length * 8, abyte7, 0);
            }
        }
        abyte0 = new byte[mac.getMacSize()];
        mac.init(new KeyParameter(abyte2));
        mac.update(abyte1, 0, abyte1.length);
        if (abyte5 != null)
        {
            mac.update(abyte5, 0, abyte5.length);
        }
        if (V.length != 0)
        {
            mac.update(abyte7, 0, abyte7.length);
        }
        mac.doFinal(abyte0, 0);
        abyte2 = new byte[V.length + l + abyte0.length];
        System.arraycopy(V, 0, abyte2, 0, V.length);
        System.arraycopy(abyte1, 0, abyte2, V.length, l);
        System.arraycopy(abyte0, 0, abyte2, V.length + l, abyte0.length);
        return abyte2;
    }

    public BufferedBlockCipher getCipher()
    {
        return cipher;
    }

    public Mac getMac()
    {
        return mac;
    }

    public void init(AsymmetricKeyParameter asymmetrickeyparameter, CipherParameters cipherparameters, KeyParser keyparser)
    {
        forEncryption = false;
        privParam = asymmetrickeyparameter;
        param = (IESParameters)cipherparameters;
        keyParser = keyparser;
    }

    public void init(AsymmetricKeyParameter asymmetrickeyparameter, CipherParameters cipherparameters, EphemeralKeyPairGenerator ephemeralkeypairgenerator)
    {
        forEncryption = true;
        pubParam = asymmetrickeyparameter;
        param = (IESParameters)cipherparameters;
        keyPairGenerator = ephemeralkeypairgenerator;
    }

    public void init(boolean flag, CipherParameters cipherparameters, CipherParameters cipherparameters1, CipherParameters cipherparameters2)
    {
        forEncryption = flag;
        privParam = cipherparameters;
        pubParam = cipherparameters1;
        param = (IESParameters)cipherparameters2;
        V = new byte[0];
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
    {
        Object obj;
        byte abyte1[];
        if (forEncryption)
        {
            if (keyPairGenerator != null)
            {
                EphemeralKeyPair ephemeralkeypair = keyPairGenerator.generate();
                privParam = ephemeralkeypair.getKeyPair().getPrivate();
                V = ephemeralkeypair.getEncodedPublicKey();
            }
        } else
        if (keyParser != null)
        {
            ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0, i, j);
            try
            {
                pubParam = keyParser.readKey(bytearrayinputstream);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new InvalidCipherTextException((new StringBuilder()).append("unable to recover ephemeral public key: ").append(abyte0.getMessage()).toString(), abyte0);
            }
            V = new byte[j - bytearrayinputstream.available()];
            System.arraycopy(abyte0, i, V, 0, V.length);
        }
        agree.init(privParam);
        obj = agree.calculateAgreement(pubParam);
        abyte1 = BigIntegers.asUnsignedByteArray(agree.getFieldSize(), ((java.math.BigInteger) (obj)));
        if (V.length != 0)
        {
            byte abyte2[] = new byte[V.length + abyte1.length];
            System.arraycopy(V, 0, abyte2, 0, V.length);
            System.arraycopy(abyte1, 0, abyte2, V.length, abyte1.length);
            abyte1 = abyte2;
        }
        abyte1 = new KDFParameters(abyte1, param.getDerivationV());
        kdf.init(abyte1);
        if (forEncryption)
        {
            return encryptBlock(abyte0, i, j);
        } else
        {
            return decryptBlock(abyte0, i, j);
        }
    }
}
