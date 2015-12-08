// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.crypto.prng:
//            RandomGenerator

public class DigestRandomGenerator
    implements RandomGenerator
{

    private static long CYCLE_COUNT = 10L;
    private Digest digest;
    private byte seed[];
    private long seedCounter;
    private byte state[];
    private long stateCounter;

    public DigestRandomGenerator(Digest digest1)
    {
        digest = digest1;
        seed = new byte[digest1.getDigestSize()];
        seedCounter = 1L;
        state = new byte[digest1.getDigestSize()];
        stateCounter = 1L;
    }

    private void cycleSeed()
    {
        digestUpdate(seed);
        long l = seedCounter;
        seedCounter = 1L + l;
        digestAddCounter(l);
        digestDoFinal(seed);
    }

    private void digestAddCounter(long l)
    {
        for (int i = 0; i != 8; i++)
        {
            digest.update((byte)(int)l);
            l >>>= 8;
        }

    }

    private void digestDoFinal(byte abyte0[])
    {
        digest.doFinal(abyte0, 0);
    }

    private void digestUpdate(byte abyte0[])
    {
        digest.update(abyte0, 0, abyte0.length);
    }

    private void generateState()
    {
        long l = stateCounter;
        stateCounter = 1L + l;
        digestAddCounter(l);
        digestUpdate(state);
        digestUpdate(seed);
        digestDoFinal(state);
        if (stateCounter % CYCLE_COUNT == 0L)
        {
            cycleSeed();
        }
    }

    public void addSeedMaterial(long l)
    {
        this;
        JVM INSTR monitorenter ;
        digestAddCounter(l);
        digestUpdate(seed);
        digestDoFinal(seed);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void addSeedMaterial(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        digestUpdate(abyte0);
        digestUpdate(seed);
        digestDoFinal(seed);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void nextBytes(byte abyte0[])
    {
        nextBytes(abyte0, 0, abyte0.length);
    }

    public void nextBytes(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        generateState();
        int k;
        int l;
        k = 0;
        l = i;
_L2:
        int i1;
        i1 = l;
        if (i1 == i + j)
        {
            break; /* Loop/switch isn't completed */
        }
        l = k;
        if (k != state.length)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        generateState();
        l = 0;
        abyte0[i1] = state[l];
        i1++;
        k = l + 1;
        l = i1;
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

}
