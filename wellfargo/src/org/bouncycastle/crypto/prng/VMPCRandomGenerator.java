// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.prng;


// Referenced classes of package org.bouncycastle.crypto.prng:
//            RandomGenerator

public class VMPCRandomGenerator
    implements RandomGenerator
{

    private byte P[] = {
        -69, 44, 98, 127, -75, -86, -44, 13, -127, -2, 
        -78, -126, -53, -96, -95, 8, 24, 113, 86, -24, 
        73, 2, 16, -60, -34, 53, -91, -20, -128, 18, 
        -72, 105, -38, 47, 117, -52, -94, 9, 54, 3, 
        97, 45, -3, -32, -35, 5, 67, -112, -83, -56, 
        -31, -81, 87, -101, 76, -40, 81, -82, 80, -123, 
        60, 10, -28, -13, -100, 38, 35, 83, -55, -125, 
        -105, 70, -79, -103, 100, 49, 119, -43, 29, -42, 
        120, -67, 94, -80, -118, 34, 56, -8, 104, 43, 
        42, -59, -45, -9, -68, 111, -33, 4, -27, -107, 
        62, 37, -122, -90, 11, -113, -15, 36, 14, -41, 
        64, -77, -49, 126, 6, 21, -102, 77, 28, -93, 
        -37, 50, -110, 88, 17, 39, -12, 89, -48, 78, 
        106, 23, 91, -84, -1, 7, -64, 101, 121, -4, 
        -57, -51, 118, 66, 93, -25, 58, 52, 122, 48, 
        40, 15, 115, 1, -7, -47, -46, 25, -23, -111, 
        -71, 90, -19, 65, 109, -76, -61, -98, -65, 99, 
        -6, 31, 51, 96, 71, -119, -16, -106, 26, 95, 
        -109, 61, 55, 75, -39, -88, -63, 27, -10, 57, 
        -117, -73, 12, 32, -50, -120, 110, -74, 116, -114, 
        -115, 22, 41, -14, -121, -11, -21, 112, -29, -5, 
        85, -97, -58, 68, 74, 69, 125, -30, 107, 92, 
        108, 102, -87, -116, -18, -124, 19, -89, 30, -99, 
        -36, 103, 72, -70, 46, -26, -92, -85, 124, -108, 
        0, 33, -17, -22, -66, -54, 114, 79, 82, -104, 
        63, -62, 20, 123, 59, 84
    };
    private byte n;
    private byte s;

    public VMPCRandomGenerator()
    {
        n = 0;
        s = -66;
    }

    public void addSeedMaterial(long l)
    {
        byte byte0 = (byte)(int)(255L & l);
        byte byte1 = (byte)(int)((65280L & l) >> 8);
        byte byte2 = (byte)(int)((0xff0000L & l) >> 16);
        addSeedMaterial(new byte[] {
            (byte)(int)((0xffffffffff000000L & l) >> 24), byte2, byte1, byte0
        });
    }

    public void addSeedMaterial(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            s = P[s + P[n & 0xff] + abyte0[i] & 0xff];
            byte byte0 = P[n & 0xff];
            P[n & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte0;
            n = (byte)(n + 1 & 0xff);
        }

    }

    public void nextBytes(byte abyte0[])
    {
        nextBytes(abyte0, 0, abyte0.length);
    }

    public void nextBytes(byte abyte0[], int i, int j)
    {
        byte abyte1[] = P;
        abyte1;
        JVM INSTR monitorenter ;
        int k = i;
_L2:
        if (k == i + j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = P[s + P[n & 0xff] & 0xff];
        abyte0[k] = P[P[P[s & 0xff] & 0xff] + 1 & 0xff];
        byte byte0 = P[n & 0xff];
        P[n & 0xff] = P[s & 0xff];
        P[s & 0xff] = byte0;
        n = (byte)(n + 1 & 0xff);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        abyte1;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        abyte1;
        JVM INSTR monitorexit ;
        throw abyte0;
    }
}
