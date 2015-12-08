// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Hashtable;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.io.DigestInputStream;
import org.bouncycastle.crypto.io.DigestOutputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;
import org.bouncycastle.util.io.TeeOutputStream;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyStore

public class A extends JDKKeyStore
{

    public void engineLoad(InputStream inputstream, char ac[])
    {
        table.clear();
        if (inputstream != null)
        {
            Object obj = new DataInputStream(inputstream);
            int i = ((DataInputStream) (obj)).readInt();
            if (i != 2 && i != 0 && i != 1)
            {
                throw new IOException("Wrong version of key store.");
            }
            byte abyte1[] = new byte[((DataInputStream) (obj)).readInt()];
            if (abyte1.length != 20)
            {
                throw new IOException("Key store corrupted.");
            }
            ((DataInputStream) (obj)).readFully(abyte1);
            int j = ((DataInputStream) (obj)).readInt();
            if (j < 0 || j > 4096)
            {
                throw new IOException("Key store corrupted.");
            }
            byte abyte0[];
            if (i == 0)
            {
                inputstream = "OldPBEWithSHAAndTwofish-CBC";
            } else
            {
                inputstream = "PBEWithSHAAndTwofish-CBC";
            }
            inputstream = new CipherInputStream(((InputStream) (obj)), makePBECipher(inputstream, 2, ac, abyte1, j));
            obj = new SHA1Digest();
            loadStore(new DigestInputStream(inputstream, ((Digest) (obj))));
            ac = new byte[((Digest) (obj)).getDigestSize()];
            ((Digest) (obj)).doFinal(ac, 0);
            abyte0 = new byte[((Digest) (obj)).getDigestSize()];
            Streams.readFully(inputstream, abyte0);
            if (!Arrays.constantTimeAreEqual(ac, abyte0))
            {
                table.clear();
                throw new IOException("KeyStore integrity check failed.");
            }
        }
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
        outputstream = new CipherOutputStream(outputstream, makePBECipher("PBEWithSHAAndTwofish-CBC", 1, ac, abyte0, i));
        ac = new DigestOutputStream(new SHA1Digest());
        saveStore(new TeeOutputStream(outputstream, ac));
        outputstream.write(ac.getDigest());
        outputstream.close();
    }

    public A()
    {
    }
}
