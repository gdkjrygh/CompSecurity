// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.io.MacInputStream;
import org.bouncycastle.crypto.io.MacOutputStream;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jce.interfaces.BCKeyStore;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.TeeOutputStream;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BouncyCastleProvider

public class JDKKeyStore extends KeyStoreSpi
    implements BCKeyStore
{

    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    private static final String KEY_CIPHER = "PBEWithSHAAnd3-KeyTripleDES-CBC";
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    private static final int KEY_SALT_SIZE = 20;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 1024;
    static final int NULL = 0;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final String STORE_CIPHER = "PBEWithSHAAndTwofish-CBC";
    private static final int STORE_SALT_SIZE = 20;
    private static final int STORE_VERSION = 2;
    protected SecureRandom random;
    protected Hashtable table;

    public JDKKeyStore()
    {
        table = new Hashtable();
        random = new SecureRandom();
    }

    private Certificate decodeCertificate(DataInputStream datainputstream)
    {
        String s = datainputstream.readUTF();
        byte abyte0[] = new byte[datainputstream.readInt()];
        datainputstream.readFully(abyte0);
        try
        {
            datainputstream = CertificateFactory.getInstance(s, BouncyCastleProvider.PROVIDER_NAME).generateCertificate(new ByteArrayInputStream(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (DataInputStream datainputstream)
        {
            throw new IOException(datainputstream.toString());
        }
        // Misplaced declaration of an exception variable
        catch (DataInputStream datainputstream)
        {
            throw new IOException(datainputstream.toString());
        }
        return datainputstream;
    }

    private Key decodeKey(DataInputStream datainputstream)
    {
        String s;
        String s1;
        byte abyte0[];
        int i;
        i = datainputstream.read();
        s1 = datainputstream.readUTF();
        s = datainputstream.readUTF();
        abyte0 = new byte[datainputstream.readInt()];
        datainputstream.readFully(abyte0);
        if (!s1.equals("PKCS#8") && !s1.equals("PKCS8")) goto _L2; else goto _L1
_L1:
        datainputstream = new PKCS8EncodedKeySpec(abyte0);
_L8:
        i;
        JVM INSTR tableswitch 0 2: default 88
    //                   0 235
    //                   1 247
    //                   2 259;
           goto _L3 _L4 _L5 _L6
_L3:
        try
        {
            throw new IOException((new StringBuilder()).append("Key type ").append(i).append(" not recognised!").toString());
        }
        // Misplaced declaration of an exception variable
        catch (DataInputStream datainputstream)
        {
            throw new IOException((new StringBuilder()).append("Exception creating key: ").append(datainputstream.toString()).toString());
        }
_L2:
        if (!s1.equals("X.509") && !s1.equals("X509"))
        {
            break; /* Loop/switch isn't completed */
        }
        datainputstream = new X509EncodedKeySpec(abyte0);
        if (true) goto _L8; else goto _L7
_L7:
        if (s1.equals("RAW"))
        {
            return new SecretKeySpec(abyte0, s);
        } else
        {
            throw new IOException((new StringBuilder()).append("Key format ").append(s1).append(" not recognised!").toString());
        }
_L4:
        return KeyFactory.getInstance(s, BouncyCastleProvider.PROVIDER_NAME).generatePrivate(datainputstream);
_L5:
        return KeyFactory.getInstance(s, BouncyCastleProvider.PROVIDER_NAME).generatePublic(datainputstream);
_L6:
        datainputstream = SecretKeyFactory.getInstance(s, BouncyCastleProvider.PROVIDER_NAME).generateSecret(datainputstream);
        return datainputstream;
    }

    private void encodeCertificate(Certificate certificate, DataOutputStream dataoutputstream)
    {
        try
        {
            byte abyte0[] = certificate.getEncoded();
            dataoutputstream.writeUTF(certificate.getType());
            dataoutputstream.writeInt(abyte0.length);
            dataoutputstream.write(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            throw new IOException(certificate.toString());
        }
    }

    private void encodeKey(Key key, DataOutputStream dataoutputstream)
    {
        byte abyte0[] = key.getEncoded();
        if (key instanceof PrivateKey)
        {
            dataoutputstream.write(0);
        } else
        if (key instanceof PublicKey)
        {
            dataoutputstream.write(1);
        } else
        {
            dataoutputstream.write(2);
        }
        dataoutputstream.writeUTF(key.getFormat());
        dataoutputstream.writeUTF(key.getAlgorithm());
        dataoutputstream.writeInt(abyte0.length);
        dataoutputstream.write(abyte0);
    }

    public Enumeration engineAliases()
    {
        return table.keys();
    }

    public boolean engineContainsAlias(String s)
    {
        return table.get(s) != null;
    }

    public void engineDeleteEntry(String s)
    {
        if (table.get(s) == null)
        {
            throw new KeyStoreException((new StringBuilder()).append("no such entry as ").append(s).toString());
        } else
        {
            table.remove(s);
            return;
        }
    }

    public Certificate engineGetCertificate(String s)
    {
        s = (StoreEntry)table.get(s);
        if (s != null)
        {
            if (s.getType() == 1)
            {
                return (Certificate)s.getObject();
            }
            s = s.getCertificateChain();
            if (s != null)
            {
                return s[0];
            }
        }
        return null;
    }

    public String engineGetCertificateAlias(Certificate certificate)
    {
        for (Enumeration enumeration = table.elements(); enumeration.hasMoreElements();)
        {
            StoreEntry storeentry = (StoreEntry)enumeration.nextElement();
            if (storeentry.getObject() instanceof Certificate)
            {
                if (((Certificate)storeentry.getObject()).equals(certificate))
                {
                    return storeentry.getAlias();
                }
            } else
            {
                Certificate acertificate[] = storeentry.getCertificateChain();
                if (acertificate != null && acertificate[0].equals(certificate))
                {
                    return storeentry.getAlias();
                }
            }
        }

        return null;
    }

    public Certificate[] engineGetCertificateChain(String s)
    {
        s = (StoreEntry)table.get(s);
        if (s != null)
        {
            return s.getCertificateChain();
        } else
        {
            return null;
        }
    }

    public Date engineGetCreationDate(String s)
    {
        s = (StoreEntry)table.get(s);
        if (s != null)
        {
            return s.getDate();
        } else
        {
            return null;
        }
    }

    public Key engineGetKey(String s, char ac[])
    {
        s = (StoreEntry)table.get(s);
        if (s == null || s.getType() == 1)
        {
            return null;
        } else
        {
            return (Key)s.getObject(ac);
        }
    }

    public boolean engineIsCertificateEntry(String s)
    {
        s = (StoreEntry)table.get(s);
        return s != null && s.getType() == 1;
    }

    public boolean engineIsKeyEntry(String s)
    {
        s = (StoreEntry)table.get(s);
        return s != null && s.getType() != 1;
    }

    public void engineLoad(InputStream inputstream, char ac[])
    {
        table.clear();
        if (inputstream != null)
        {
            DataInputStream datainputstream = new DataInputStream(inputstream);
            int i = datainputstream.readInt();
            if (i != 2 && i != 0 && i != 1)
            {
                throw new IOException("Wrong version of key store.");
            }
            int j = datainputstream.readInt();
            if (j <= 0)
            {
                throw new IOException("Invalid salt detected");
            }
            inputstream = new byte[j];
            datainputstream.readFully(inputstream);
            j = datainputstream.readInt();
            HMac hmac = new HMac(new SHA1Digest());
            if (ac != null && ac.length != 0)
            {
                ac = PBEParametersGenerator.PKCS12PasswordToBytes(ac);
                PKCS12ParametersGenerator pkcs12parametersgenerator = new PKCS12ParametersGenerator(new SHA1Digest());
                pkcs12parametersgenerator.init(ac, inputstream, j);
                if (i != 2)
                {
                    inputstream = pkcs12parametersgenerator.generateDerivedMacParameters(hmac.getMacSize());
                } else
                {
                    inputstream = pkcs12parametersgenerator.generateDerivedMacParameters(hmac.getMacSize() * 8);
                }
                Arrays.fill(ac, (byte)0);
                hmac.init(inputstream);
                loadStore(new MacInputStream(datainputstream, hmac));
                inputstream = new byte[hmac.getMacSize()];
                hmac.doFinal(inputstream, 0);
                ac = new byte[hmac.getMacSize()];
                datainputstream.readFully(ac);
                if (!Arrays.constantTimeAreEqual(inputstream, ac))
                {
                    table.clear();
                    throw new IOException("KeyStore integrity check failed.");
                }
            } else
            {
                loadStore(datainputstream);
                datainputstream.readFully(new byte[hmac.getMacSize()]);
                return;
            }
        }
    }

    public void engineSetCertificateEntry(String s, Certificate certificate)
    {
        StoreEntry storeentry = (StoreEntry)table.get(s);
        if (storeentry != null && storeentry.getType() != 1)
        {
            throw new KeyStoreException((new StringBuilder()).append("key store already has a key entry with alias ").append(s).toString());
        } else
        {
            table.put(s, new StoreEntry(s, certificate));
            return;
        }
    }

    public void engineSetKeyEntry(String s, Key key, char ac[], Certificate acertificate[])
    {
        if ((key instanceof PrivateKey) && acertificate == null)
        {
            throw new KeyStoreException("no certificate chain for private key");
        }
        try
        {
            table.put(s, new StoreEntry(s, key, ac, acertificate));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new KeyStoreException(s.toString());
        }
    }

    public void engineSetKeyEntry(String s, byte abyte0[], Certificate acertificate[])
    {
        table.put(s, new StoreEntry(s, abyte0, acertificate));
    }

    public int engineSize()
    {
        return table.size();
    }

    public void engineStore(OutputStream outputstream, char ac[])
    {
        outputstream = new DataOutputStream(outputstream);
        byte abyte0[] = new byte[20];
        int i = (random.nextInt() & 0x3ff) + 1024;
        random.nextBytes(abyte0);
        outputstream.writeInt(2);
        outputstream.writeInt(abyte0.length);
        outputstream.write(abyte0);
        outputstream.writeInt(i);
        HMac hmac = new HMac(new SHA1Digest());
        MacOutputStream macoutputstream = new MacOutputStream(hmac);
        PKCS12ParametersGenerator pkcs12parametersgenerator = new PKCS12ParametersGenerator(new SHA1Digest());
        ac = PBEParametersGenerator.PKCS12PasswordToBytes(ac);
        pkcs12parametersgenerator.init(ac, abyte0, i);
        hmac.init(pkcs12parametersgenerator.generateDerivedMacParameters(hmac.getMacSize() * 8));
        for (int j = 0; j != ac.length; j++)
        {
            ac[j] = '\0';
        }

        saveStore(new TeeOutputStream(outputstream, macoutputstream));
        ac = new byte[hmac.getMacSize()];
        hmac.doFinal(ac, 0);
        outputstream.write(ac);
        outputstream.close();
    }

    protected void loadStore(InputStream inputstream)
    {
        DataInputStream datainputstream;
        int i;
        datainputstream = new DataInputStream(inputstream);
        i = datainputstream.read();
_L2:
        String s;
        Date date;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        s = datainputstream.readUTF();
        date = new Date(datainputstream.readLong());
        int k = datainputstream.readInt();
        inputstream = null;
        if (k != 0)
        {
            Certificate acertificate[] = new Certificate[k];
            int j = 0;
            do
            {
                inputstream = acertificate;
                if (j == k)
                {
                    break;
                }
                acertificate[j] = decodeCertificate(datainputstream);
                j++;
            } while (true);
        }
        switch (i)
        {
        default:
            throw new RuntimeException("Unknown object type in store.");

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
        case 4: // '\004'
            break MISSING_BLOCK_LABEL_204;

        case 1: // '\001'
            inputstream = decodeCertificate(datainputstream);
            table.put(s, new StoreEntry(s, date, 1, inputstream));
            break;
        }
_L3:
        i = datainputstream.read();
        if (true) goto _L2; else goto _L1
_L1:
        Key key = decodeKey(datainputstream);
        table.put(s, new StoreEntry(s, date, 2, key, inputstream));
          goto _L3
        byte abyte0[] = new byte[datainputstream.readInt()];
        datainputstream.readFully(abyte0);
        table.put(s, new StoreEntry(s, date, i, abyte0, inputstream));
          goto _L3
    }

    protected Cipher makePBECipher(String s, int i, char ac[], byte abyte0[], int j)
    {
        try
        {
            ac = new PBEKeySpec(ac);
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(s, BouncyCastleProvider.PROVIDER_NAME);
            abyte0 = new PBEParameterSpec(abyte0, j);
            s = Cipher.getInstance(s, BouncyCastleProvider.PROVIDER_NAME);
            s.init(i, secretkeyfactory.generateSecret(ac), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException((new StringBuilder()).append("Error initialising store of key store: ").append(s).toString());
        }
        return s;
    }

    protected void saveStore(OutputStream outputstream)
    {
        Enumeration enumeration = table.elements();
        outputstream = new DataOutputStream(outputstream);
        do
        {
            if (enumeration.hasMoreElements())
            {
                StoreEntry storeentry = (StoreEntry)enumeration.nextElement();
                outputstream.write(storeentry.getType());
                outputstream.writeUTF(storeentry.getAlias());
                outputstream.writeLong(storeentry.getDate().getTime());
                Certificate acertificate[] = storeentry.getCertificateChain();
                if (acertificate == null)
                {
                    outputstream.writeInt(0);
                } else
                {
                    outputstream.writeInt(acertificate.length);
                    int i = 0;
                    while (i != acertificate.length) 
                    {
                        encodeCertificate(acertificate[i], outputstream);
                        i++;
                    }
                }
                switch (storeentry.getType())
                {
                default:
                    throw new RuntimeException("Unknown object type in store.");

                case 1: // '\001'
                    encodeCertificate((Certificate)storeentry.getObject(), outputstream);
                    break;

                case 2: // '\002'
                    encodeKey((Key)storeentry.getObject(), outputstream);
                    break;

                case 3: // '\003'
                case 4: // '\004'
                    byte abyte0[] = (byte[])(byte[])storeentry.getObject();
                    outputstream.writeInt(abyte0.length);
                    outputstream.write(abyte0);
                    break;
                }
            } else
            {
                outputstream.write(0);
                return;
            }
        } while (true);
    }

    public void setRandom(SecureRandom securerandom)
    {
        random = securerandom;
    }



    private class StoreEntry
    {

        String alias;
        Certificate certChain[];
        Date date;
        Object obj;
        final JDKKeyStore this$0;
        int type;

        String getAlias()
        {
            return alias;
        }

        Certificate[] getCertificateChain()
        {
            return certChain;
        }

        Date getDate()
        {
            return date;
        }

        Object getObject()
        {
            return obj;
        }

        Object getObject(char ac[])
        {
            if ((ac == null || ac.length == 0) && (obj instanceof Key))
            {
                return obj;
            }
            if (type != 4)
            {
                break MISSING_BLOCK_LABEL_405;
            }
            Object obj1 = new DataInputStream(new ByteArrayInputStream((byte[])(byte[])obj));
            Exception exception;
            byte abyte1[];
            ByteArrayOutputStream bytearrayoutputstream;
            DataOutputStream dataoutputstream;
            int j;
            try
            {
                byte abyte0[] = new byte[((DataInputStream) (obj1)).readInt()];
                ((DataInputStream) (obj1)).readFully(abyte0);
                int i = ((DataInputStream) (obj1)).readInt();
                obj1 = new CipherInputStream(((InputStream) (obj1)), makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte0, i));
            }
            // Misplaced declaration of an exception variable
            catch (char ac[])
            {
                throw new UnrecoverableKeyException("no match");
            }
            obj1 = decodeKey(new DataInputStream(((InputStream) (obj1))));
            return obj1;
            exception;
            exception = new DataInputStream(new ByteArrayInputStream((byte[])(byte[])obj));
            abyte1 = new byte[exception.readInt()];
            exception.readFully(abyte1);
            j = exception.readInt();
            exception = new CipherInputStream(exception, makePBECipher("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte1, j));
            exception = decodeKey(new DataInputStream(exception));
_L1:
            if (exception == null)
            {
                break MISSING_BLOCK_LABEL_384;
            }
            bytearrayoutputstream = new ByteArrayOutputStream();
            dataoutputstream = new DataOutputStream(bytearrayoutputstream);
            dataoutputstream.writeInt(abyte1.length);
            dataoutputstream.write(abyte1);
            dataoutputstream.writeInt(j);
            ac = new DataOutputStream(new CipherOutputStream(dataoutputstream, makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, ac, abyte1, j)));
            encodeKey(exception, ac);
            ac.close();
            obj = bytearrayoutputstream.toByteArray();
            return exception;
            exception;
            exception = new DataInputStream(new ByteArrayInputStream((byte[])(byte[])obj));
            abyte1 = new byte[exception.readInt()];
            exception.readFully(abyte1);
            j = exception.readInt();
            exception = new CipherInputStream(exception, makePBECipher("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte1, j));
            exception = decodeKey(new DataInputStream(exception));
              goto _L1
            throw new UnrecoverableKeyException("no match");
            throw new RuntimeException("forget something!");
        }

        int getType()
        {
            return type;
        }

        StoreEntry(String s, Key key, char ac[], Certificate acertificate[])
        {
            this$0 = JDKKeyStore.this;
            super();
            date = new Date();
            type = 4;
            alias = s;
            certChain = acertificate;
            acertificate = new byte[20];
            random.setSeed(System.currentTimeMillis());
            random.nextBytes(acertificate);
            int i = (random.nextInt() & 0x3ff) + 1024;
            s = new ByteArrayOutputStream();
            DataOutputStream dataoutputstream = new DataOutputStream(s);
            dataoutputstream.writeInt(acertificate.length);
            dataoutputstream.write(acertificate);
            dataoutputstream.writeInt(i);
            ac = new DataOutputStream(new CipherOutputStream(dataoutputstream, makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, ac, acertificate, i)));
            encodeKey(key, ac);
            ac.close();
            obj = s.toByteArray();
        }

        StoreEntry(String s, Certificate certificate)
        {
            this$0 = JDKKeyStore.this;
            super();
            date = new Date();
            type = 1;
            alias = s;
            obj = certificate;
            certChain = null;
        }

        StoreEntry(String s, Date date1, int i, Object obj1)
        {
            this$0 = JDKKeyStore.this;
            super();
            date = new Date();
            alias = s;
            date = date1;
            type = i;
            obj = obj1;
        }

        StoreEntry(String s, Date date1, int i, Object obj1, Certificate acertificate[])
        {
            this$0 = JDKKeyStore.this;
            super();
            date = new Date();
            alias = s;
            date = date1;
            type = i;
            obj = obj1;
            certChain = acertificate;
        }

        StoreEntry(String s, byte abyte0[], Certificate acertificate[])
        {
            this$0 = JDKKeyStore.this;
            super();
            date = new Date();
            type = 3;
            alias = s;
            obj = abyte0;
            certChain = acertificate;
        }
    }

}
