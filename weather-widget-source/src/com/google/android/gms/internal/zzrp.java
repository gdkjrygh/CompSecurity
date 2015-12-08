// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrw, zzrx, zzsa

public final class zzrp
{

    private final byte buffer[];
    private int zzbbQ;
    private int zzbbR;
    private int zzbbS;
    private int zzbbT;
    private int zzbbU;
    private int zzbbV;
    private int zzbbW;
    private int zzbbX;
    private int zzbbY;

    private zzrp(byte abyte0[], int i, int j)
    {
        zzbbV = 0x7fffffff;
        zzbbX = 64;
        zzbbY = 0x4000000;
        buffer = abyte0;
        zzbbQ = i;
        zzbbR = i + j;
        zzbbT = i;
    }

    private void zzDe()
    {
        zzbbR = zzbbR + zzbbS;
        int i = zzbbR;
        if (i > zzbbV)
        {
            zzbbS = i - zzbbV;
            zzbbR = zzbbR - zzbbS;
            return;
        } else
        {
            zzbbS = 0;
            return;
        }
    }

    public static long zzV(long l)
    {
        return l >>> 1 ^ -(1L & l);
    }

    public static zzrp zza(byte abyte0[], int i, int j)
    {
        return new zzrp(abyte0, i, j);
    }

    public static int zzlk(int i)
    {
        return i >>> 1 ^ -(i & 1);
    }

    public static zzrp zzz(byte abyte0[])
    {
        return zza(abyte0, 0, abyte0.length);
    }

    public int getPosition()
    {
        return zzbbT - zzbbQ;
    }

    public byte[] readBytes()
        throws IOException
    {
        int i = zzDa();
        if (i <= zzbbR - zzbbT && i > 0)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, zzbbT, abyte0, 0, i);
            zzbbT = i + zzbbT;
            return abyte0;
        } else
        {
            return zzlo(i);
        }
    }

    public double readDouble()
        throws IOException
    {
        return Double.longBitsToDouble(zzDd());
    }

    public float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(zzDc());
    }

    public String readString()
        throws IOException
    {
        int i = zzDa();
        if (i <= zzbbR - zzbbT && i > 0)
        {
            String s = new String(buffer, zzbbT, i, "UTF-8");
            zzbbT = i + zzbbT;
            return s;
        } else
        {
            return new String(zzlo(i), "UTF-8");
        }
    }

    public int zzCT()
        throws IOException
    {
        if (zzDg())
        {
            zzbbU = 0;
            return 0;
        }
        zzbbU = zzDa();
        if (zzbbU == 0)
        {
            throw zzrw.zzDs();
        } else
        {
            return zzbbU;
        }
    }

    public void zzCU()
        throws IOException
    {
        int i;
        do
        {
            i = zzCT();
        } while (i != 0 && zzlj(i));
    }

    public long zzCV()
        throws IOException
    {
        return zzDb();
    }

    public int zzCW()
        throws IOException
    {
        return zzDa();
    }

    public boolean zzCX()
        throws IOException
    {
        return zzDa() != 0;
    }

    public int zzCY()
        throws IOException
    {
        return zzlk(zzDa());
    }

    public long zzCZ()
        throws IOException
    {
        return zzV(zzDb());
    }

    public int zzDa()
        throws IOException
    {
        int i = zzDh();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = zzDh();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = zzDh();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = zzDh();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = zzDh();
        k = i | (k & 0x7f) << 21 | byte0 << 28;
        i = k;
        if (byte0 < 0)
        {
            int j = 0;
label0:
            do
            {
label1:
                {
                    if (j >= 5)
                    {
                        break label1;
                    }
                    i = k;
                    if (zzDh() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw zzrw.zzDr();
    }

    public long zzDb()
        throws IOException
    {
        int i = 0;
        long l = 0L;
        for (; i < 64; i += 7)
        {
            byte byte0 = zzDh();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw zzrw.zzDr();
    }

    public int zzDc()
        throws IOException
    {
        return zzDh() & 0xff | (zzDh() & 0xff) << 8 | (zzDh() & 0xff) << 16 | (zzDh() & 0xff) << 24;
    }

    public long zzDd()
        throws IOException
    {
        int i = zzDh();
        int j = zzDh();
        int k = zzDh();
        int l = zzDh();
        int i1 = zzDh();
        int j1 = zzDh();
        int k1 = zzDh();
        int l1 = zzDh();
        long l2 = i;
        return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
    }

    public int zzDf()
    {
        if (zzbbV == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i = zzbbT;
            return zzbbV - i;
        }
    }

    public boolean zzDg()
    {
        return zzbbT == zzbbR;
    }

    public byte zzDh()
        throws IOException
    {
        if (zzbbT == zzbbR)
        {
            throw zzrw.zzDp();
        } else
        {
            byte abyte0[] = buffer;
            int i = zzbbT;
            zzbbT = i + 1;
            return abyte0[i];
        }
    }

    public void zza(zzrx zzrx1)
        throws IOException
    {
        int i = zzDa();
        if (zzbbW >= zzbbX)
        {
            throw zzrw.zzDv();
        } else
        {
            i = zzll(i);
            zzbbW = zzbbW + 1;
            zzrx1.zzb(this);
            zzli(0);
            zzbbW = zzbbW - 1;
            zzlm(i);
            return;
        }
    }

    public void zza(zzrx zzrx1, int i)
        throws IOException
    {
        if (zzbbW >= zzbbX)
        {
            throw zzrw.zzDv();
        } else
        {
            zzbbW = zzbbW + 1;
            zzrx1.zzb(this);
            zzli(zzsa.zzE(i, 4));
            zzbbW = zzbbW - 1;
            return;
        }
    }

    public void zzli(int i)
        throws zzrw
    {
        if (zzbbU != i)
        {
            throw zzrw.zzDt();
        } else
        {
            return;
        }
    }

    public boolean zzlj(int i)
        throws IOException
    {
        switch (zzsa.zzlD(i))
        {
        default:
            throw zzrw.zzDu();

        case 0: // '\0'
            zzCW();
            return true;

        case 1: // '\001'
            zzDd();
            return true;

        case 2: // '\002'
            zzlp(zzDa());
            return true;

        case 3: // '\003'
            zzCU();
            zzli(zzsa.zzE(zzsa.zzlE(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            zzDc();
            break;
        }
        return true;
    }

    public int zzll(int i)
        throws zzrw
    {
        if (i < 0)
        {
            throw zzrw.zzDq();
        }
        i = zzbbT + i;
        int j = zzbbV;
        if (i > j)
        {
            throw zzrw.zzDp();
        } else
        {
            zzbbV = i;
            zzDe();
            return j;
        }
    }

    public void zzlm(int i)
    {
        zzbbV = i;
        zzDe();
    }

    public void zzln(int i)
    {
        if (i > zzbbT - zzbbQ)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is beyond current ").append(zzbbT - zzbbQ).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad position ").append(i).toString());
        } else
        {
            zzbbT = zzbbQ + i;
            return;
        }
    }

    public byte[] zzlo(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw zzrw.zzDq();
        }
        if (zzbbT + i > zzbbV)
        {
            zzlp(zzbbV - zzbbT);
            throw zzrw.zzDp();
        }
        if (i <= zzbbR - zzbbT)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, zzbbT, abyte0, 0, i);
            zzbbT = zzbbT + i;
            return abyte0;
        } else
        {
            throw zzrw.zzDp();
        }
    }

    public void zzlp(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw zzrw.zzDq();
        }
        if (zzbbT + i > zzbbV)
        {
            zzlp(zzbbV - zzbbT);
            throw zzrw.zzDp();
        }
        if (i <= zzbbR - zzbbT)
        {
            zzbbT = zzbbT + i;
            return;
        } else
        {
            throw zzrw.zzDp();
        }
    }

    public byte[] zzy(int i, int j)
    {
        if (j == 0)
        {
            return zzsa.zzbcu;
        } else
        {
            byte abyte0[] = new byte[j];
            int k = zzbbQ;
            System.arraycopy(buffer, k + i, abyte0, 0, j);
            return abyte0;
        }
    }
}
