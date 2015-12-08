// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;


// Referenced classes of package ch.boye.httpclientandroidlib.impl.auth:
//            NTLMEngineImpl

static class dataBuffer
{

    protected int A;
    protected int B;
    protected int C;
    protected int D;
    protected long count;
    protected byte dataBuffer[];

    byte[] getOutput()
    {
        int i = (int)(count & 63L);
        byte abyte0[];
        if (i < 56)
        {
            i = 56 - i;
        } else
        {
            i = 120 - i;
        }
        abyte0 = new byte[i + 8];
        abyte0[0] = -128;
        for (int j = 0; j < 8; j++)
        {
            abyte0[i + j] = (byte)(int)(count * 8L >>> j * 8);
        }

        update(abyte0);
        abyte0 = new byte[16];
        NTLMEngineImpl.writeULong(abyte0, A, 0);
        NTLMEngineImpl.writeULong(abyte0, B, 4);
        NTLMEngineImpl.writeULong(abyte0, C, 8);
        NTLMEngineImpl.writeULong(abyte0, D, 12);
        return abyte0;
    }

    protected void processBuffer()
    {
        int ai[] = new int[16];
        for (int i = 0; i < 16; i++)
        {
            ai[i] = (dataBuffer[i * 4] & 0xff) + ((dataBuffer[i * 4 + 1] & 0xff) << 8) + ((dataBuffer[i * 4 + 2] & 0xff) << 16) + ((dataBuffer[i * 4 + 3] & 0xff) << 24);
        }

        int j = A;
        int k = B;
        int l = C;
        int i1 = D;
        round1(ai);
        round2(ai);
        round3(ai);
        A = A + j;
        B = B + k;
        C = C + l;
        D = D + i1;
    }

    protected void round1(int ai[])
    {
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.F(B, C, D) + ai[0], 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.F(A, B, C) + ai[1], 7);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.F(D, A, B) + ai[2], 11);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.F(C, D, A) + ai[3], 19);
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.F(B, C, D) + ai[4], 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.F(A, B, C) + ai[5], 7);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.F(D, A, B) + ai[6], 11);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.F(C, D, A) + ai[7], 19);
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.F(B, C, D) + ai[8], 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.F(A, B, C) + ai[9], 7);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.F(D, A, B) + ai[10], 11);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.F(C, D, A) + ai[11], 19);
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.F(B, C, D) + ai[12], 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.F(A, B, C) + ai[13], 7);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.F(D, A, B) + ai[14], 11);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.F(C, D, A) + ai[15], 19);
    }

    protected void round2(int ai[])
    {
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.G(B, C, D) + ai[0] + 0x5a827999, 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.G(A, B, C) + ai[4] + 0x5a827999, 5);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.G(D, A, B) + ai[8] + 0x5a827999, 9);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.G(C, D, A) + ai[12] + 0x5a827999, 13);
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.G(B, C, D) + ai[1] + 0x5a827999, 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.G(A, B, C) + ai[5] + 0x5a827999, 5);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.G(D, A, B) + ai[9] + 0x5a827999, 9);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.G(C, D, A) + ai[13] + 0x5a827999, 13);
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.G(B, C, D) + ai[2] + 0x5a827999, 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.G(A, B, C) + ai[6] + 0x5a827999, 5);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.G(D, A, B) + ai[10] + 0x5a827999, 9);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.G(C, D, A) + ai[14] + 0x5a827999, 13);
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.G(B, C, D) + ai[3] + 0x5a827999, 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.G(A, B, C) + ai[7] + 0x5a827999, 5);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.G(D, A, B) + ai[11] + 0x5a827999, 9);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.G(C, D, A) + ai[15] + 0x5a827999, 13);
    }

    protected void round3(int ai[])
    {
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.H(B, C, D) + ai[0] + 0x6ed9eba1, 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.H(A, B, C) + ai[8] + 0x6ed9eba1, 9);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.H(D, A, B) + ai[4] + 0x6ed9eba1, 11);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.H(C, D, A) + ai[12] + 0x6ed9eba1, 15);
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.H(B, C, D) + ai[2] + 0x6ed9eba1, 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.H(A, B, C) + ai[10] + 0x6ed9eba1, 9);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.H(D, A, B) + ai[6] + 0x6ed9eba1, 11);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.H(C, D, A) + ai[14] + 0x6ed9eba1, 15);
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.H(B, C, D) + ai[1] + 0x6ed9eba1, 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.H(A, B, C) + ai[9] + 0x6ed9eba1, 9);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.H(D, A, B) + ai[5] + 0x6ed9eba1, 11);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.H(C, D, A) + ai[13] + 0x6ed9eba1, 15);
        A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.H(B, C, D) + ai[3] + 0x6ed9eba1, 3);
        D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.H(A, B, C) + ai[11] + 0x6ed9eba1, 9);
        C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.H(D, A, B) + ai[7] + 0x6ed9eba1, 11);
        B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.H(C, D, A) + ai[15] + 0x6ed9eba1, 15);
    }

    void update(byte abyte0[])
    {
        int j = (int)(count & 63L);
        int i;
        for (i = 0; (abyte0.length - i) + j >= dataBuffer.length;)
        {
            int k = dataBuffer.length - j;
            System.arraycopy(abyte0, i, dataBuffer, j, k);
            count = count + (long)k;
            j = 0;
            i += k;
            processBuffer();
        }

        if (i < abyte0.length)
        {
            int l = abyte0.length - i;
            System.arraycopy(abyte0, i, dataBuffer, j, l);
            count = count + (long)l;
        }
    }

    ()
    {
        A = 0x67452301;
        B = 0xefcdab89;
        C = 0x98badcfe;
        D = 0x10325476;
        count = 0L;
        dataBuffer = new byte[64];
    }
}
