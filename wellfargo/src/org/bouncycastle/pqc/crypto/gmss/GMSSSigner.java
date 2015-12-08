// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSUtil;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.pqc.crypto.gmss:
//            GMSSDigestProvider, GMSSPrivateKeyParameters, GMSSParameters, GMSSPublicKeyParameters, 
//            GMSSKeyParameters

public class GMSSSigner
    implements MessageSigner
{

    private byte currentAuthPaths[][][];
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private GMSSUtil gmssUtil;
    private int index[];
    GMSSKeyParameters key;
    private int mdLength;
    private Digest messDigestOTS;
    private Digest messDigestTrees;
    private int numLayer;
    private WinternitzOTSignature ots;
    private byte pubKeyBytes[];
    private SecureRandom random;
    private byte subtreeRootSig[][];

    public GMSSSigner(GMSSDigestProvider gmssdigestprovider)
    {
        gmssUtil = new GMSSUtil();
        digestProvider = gmssdigestprovider;
        messDigestTrees = gmssdigestprovider.get();
        messDigestOTS = messDigestTrees;
        mdLength = messDigestTrees.getDigestSize();
        gmssRandom = new GMSSRandom(messDigestTrees);
    }

    private void initSign()
    {
        messDigestTrees.reset();
        GMSSPrivateKeyParameters gmssprivatekeyparameters = (GMSSPrivateKeyParameters)key;
        if (gmssprivatekeyparameters.getIndex(0) >= gmssprivatekeyparameters.getNumLeafs(0))
        {
            throw new RuntimeException("No more signatures can be generated");
        }
        gmssPS = gmssprivatekeyparameters.getParameters();
        numLayer = gmssPS.getNumOfLayers();
        Object obj = gmssprivatekeyparameters.getCurrentSeeds()[numLayer - 1];
        byte abyte1[] = new byte[mdLength];
        abyte1 = new byte[mdLength];
        System.arraycopy(obj, 0, abyte1, 0, mdLength);
        ots = new WinternitzOTSignature(gmssRandom.nextSeed(abyte1), digestProvider.get(), gmssPS.getWinternitzParameter()[numLayer - 1]);
        obj = gmssprivatekeyparameters.getCurrentAuthPaths();
        currentAuthPaths = new byte[numLayer][][];
        for (int i = 0; i < numLayer; i++)
        {
            byte abyte2[][][] = currentAuthPaths;
            int k = obj[i].length;
            int i1 = mdLength;
            abyte2[i] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
                k, i1
            });
            for (int l = 0; l < obj[i].length; l++)
            {
                System.arraycopy(obj[i][l], 0, currentAuthPaths[i][l], 0, mdLength);
            }

        }

        index = new int[numLayer];
        System.arraycopy(gmssprivatekeyparameters.getIndex(), 0, index, 0, numLayer);
        subtreeRootSig = new byte[numLayer - 1][];
        for (int j = 0; j < numLayer - 1; j++)
        {
            byte abyte0[] = gmssprivatekeyparameters.getSubtreeRootSig(j);
            subtreeRootSig[j] = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, subtreeRootSig[j], 0, abyte0.length);
        }

        gmssprivatekeyparameters.nextKey(numLayer - 1);
    }

    private void initVerify()
    {
        messDigestTrees.reset();
        GMSSPublicKeyParameters gmsspublickeyparameters = (GMSSPublicKeyParameters)key;
        pubKeyBytes = gmsspublickeyparameters.getPublicKey();
        gmssPS = gmsspublickeyparameters.getParameters();
        numLayer = gmssPS.getNumOfLayers();
    }

    public byte[] generateSignature(byte abyte0[])
    {
        byte abyte1[] = new byte[mdLength];
        abyte0 = ots.getSignature(abyte0);
        byte abyte2[] = gmssUtil.concatenateArray(currentAuthPaths[numLayer - 1]);
        byte abyte3[] = gmssUtil.intToBytesLittleEndian(index[numLayer - 1]);
        abyte1 = new byte[abyte3.length + abyte0.length + abyte2.length];
        System.arraycopy(abyte3, 0, abyte1, 0, abyte3.length);
        System.arraycopy(abyte0, 0, abyte1, abyte3.length, abyte0.length);
        int i = abyte3.length;
        System.arraycopy(abyte2, 0, abyte1, abyte0.length + i, abyte2.length);
        abyte0 = new byte[0];
        for (int j = numLayer - 1 - 1; j >= 0; j--)
        {
            abyte2 = gmssUtil.concatenateArray(currentAuthPaths[j]);
            byte abyte4[] = gmssUtil.intToBytesLittleEndian(index[j]);
            byte abyte5[] = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, abyte5, 0, abyte0.length);
            abyte0 = new byte[abyte5.length + abyte4.length + subtreeRootSig[j].length + abyte2.length];
            System.arraycopy(abyte5, 0, abyte0, 0, abyte5.length);
            System.arraycopy(abyte4, 0, abyte0, abyte5.length, abyte4.length);
            System.arraycopy(subtreeRootSig[j], 0, abyte0, abyte5.length + abyte4.length, subtreeRootSig[j].length);
            int k = abyte5.length;
            System.arraycopy(abyte2, 0, abyte0, abyte4.length + k + subtreeRootSig[j].length, abyte2.length);
        }

        abyte2 = new byte[abyte1.length + abyte0.length];
        System.arraycopy(abyte1, 0, abyte2, 0, abyte1.length);
        System.arraycopy(abyte0, 0, abyte2, abyte1.length, abyte0.length);
        return abyte2;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (flag)
        {
            if (cipherparameters instanceof ParametersWithRandom)
            {
                cipherparameters = (ParametersWithRandom)cipherparameters;
                random = cipherparameters.getRandom();
                key = (GMSSPrivateKeyParameters)cipherparameters.getParameters();
                initSign();
                return;
            } else
            {
                random = new SecureRandom();
                key = (GMSSPrivateKeyParameters)cipherparameters;
                initSign();
                return;
            }
        } else
        {
            key = (GMSSPublicKeyParameters)cipherparameters;
            initVerify();
            return;
        }
    }

    public boolean verifySignature(byte abyte0[], byte abyte1[])
    {
        int i;
        int k;
        messDigestOTS.reset();
        k = numLayer - 1;
        i = 0;
_L8:
        if (k < 0) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        WinternitzOTSVerify winternitzotsverify = new WinternitzOTSVerify(digestProvider.get(), gmssPS.getWinternitzParameter()[k]);
        j = winternitzotsverify.getSignatureLength();
        l = gmssUtil.bytesToIntLittleEndian(abyte1, i);
        i += 4;
        byte abyte3[] = new byte[j];
        System.arraycopy(abyte1, i, abyte3, 0, j);
        abyte0 = winternitzotsverify.Verify(abyte0, abyte3);
        if (abyte0 != null) goto _L4; else goto _L3
_L3:
        System.err.println("OTS Public Key is null in GMSSSignature.verify");
_L6:
        return false;
_L4:
        int i1 = gmssPS.getHeightOfTrees()[k];
        int j1 = mdLength;
        byte abyte2[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            i1, j1
        });
        i = j + i;
        for (j = 0; j < abyte2.length; j++)
        {
            System.arraycopy(abyte1, i, abyte2[j], 0, mdLength);
            i += mdLength;
        }

        byte abyte4[] = new byte[mdLength];
        j = abyte2.length;
        j = (1 << j) + l;
        l = 0;
        while (l < abyte2.length) 
        {
            byte abyte5[] = new byte[mdLength << 1];
            if (j % 2 == 0)
            {
                System.arraycopy(abyte0, 0, abyte5, 0, mdLength);
                System.arraycopy(abyte2[l], 0, abyte5, mdLength, mdLength);
                j /= 2;
            } else
            {
                System.arraycopy(abyte2[l], 0, abyte5, 0, mdLength);
                System.arraycopy(abyte0, 0, abyte5, mdLength, abyte0.length);
                j = (j - 1) / 2;
            }
            messDigestTrees.update(abyte5, 0, abyte5.length);
            abyte0 = new byte[messDigestTrees.getDigestSize()];
            messDigestTrees.doFinal(abyte0, 0);
            l++;
        }
        k--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!Arrays.areEqual(pubKeyBytes, abyte0)) goto _L6; else goto _L5
_L5:
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
