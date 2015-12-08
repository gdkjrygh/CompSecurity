// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrm, zzrn, zzrq

public final class zzrf
{

    private final byte buffer[];
    private int zzaVK;
    private int zzaVL;
    private int zzaVM;
    private int zzaVN;
    private int zzaVO;
    private int zzaVP;
    private int zzaVQ;
    private int zzaVR;
    private int zzaVS;

    private zzrf(byte abyte0[], int i, int j)
    {
        zzaVP = 0x7fffffff;
        zzaVR = 64;
        zzaVS = 0x4000000;
        buffer = abyte0;
        zzaVK = i;
        zzaVL = i + j;
        zzaVN = i;
    }

    private void zzBC()
    {
        zzaVL = zzaVL + zzaVM;
        int i = zzaVL;
        if (i > zzaVP)
        {
            zzaVM = i - zzaVP;
            zzaVL = zzaVL - zzaVM;
            return;
        } else
        {
            zzaVM = 0;
            return;
        }
    }

    public static long zzV(long l)
    {
        return l >>> 1 ^ -(1L & l);
    }

    public static zzrf zza(byte abyte0[], int i, int j)
    {
        return new zzrf(abyte0, i, j);
    }

    public static int zzkB(int i)
    {
        return i >>> 1 ^ -(i & 1);
    }

    public static zzrf zzz(byte abyte0[])
    {
        return zza(abyte0, 0, abyte0.length);
    }

    public int getPosition()
    {
        return zzaVN - zzaVK;
    }

    public byte[] readBytes()
        throws IOException
    {
        int i = zzBy();
        if (i <= zzaVL - zzaVN && i > 0)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, zzaVN, abyte0, 0, i);
            zzaVN = i + zzaVN;
            return abyte0;
        } else
        {
            return zzkF(i);
        }
    }

    public double readDouble()
        throws IOException
    {
        return Double.longBitsToDouble(zzBB());
    }

    public float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(zzBA());
    }

    public String readString()
        throws IOException
    {
        int i = zzBy();
        if (i <= zzaVL - zzaVN && i > 0)
        {
            String s = new String(buffer, zzaVN, i, "UTF-8");
            zzaVN = i + zzaVN;
            return s;
        } else
        {
            return new String(zzkF(i), "UTF-8");
        }
    }

    public int zzBA()
        throws IOException
    {
        return zzBF() & 0xff | (zzBF() & 0xff) << 8 | (zzBF() & 0xff) << 16 | (zzBF() & 0xff) << 24;
    }

    public long zzBB()
        throws IOException
    {
        int i = zzBF();
        int j = zzBF();
        int k = zzBF();
        int l = zzBF();
        int i1 = zzBF();
        int j1 = zzBF();
        int k1 = zzBF();
        int l1 = zzBF();
        long l2 = i;
        return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
    }

    public int zzBD()
    {
        if (zzaVP == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i = zzaVN;
            return zzaVP - i;
        }
    }

    public boolean zzBE()
    {
        return zzaVN == zzaVL;
    }

    public byte zzBF()
        throws IOException
    {
        if (zzaVN == zzaVL)
        {
            throw zzrm.zzBN();
        } else
        {
            byte abyte0[] = buffer;
            int i = zzaVN;
            zzaVN = i + 1;
            return abyte0[i];
        }
    }

    public int zzBr()
        throws IOException
    {
        if (zzBE())
        {
            zzaVO = 0;
            return 0;
        }
        zzaVO = zzBy();
        if (zzaVO == 0)
        {
            throw zzrm.zzBQ();
        } else
        {
            return zzaVO;
        }
    }

    public void zzBs()
        throws IOException
    {
        int i;
        do
        {
            i = zzBr();
        } while (i != 0 && zzkA(i));
    }

    public long zzBt()
        throws IOException
    {
        return zzBz();
    }

    public int zzBu()
        throws IOException
    {
        return zzBy();
    }

    public boolean zzBv()
        throws IOException
    {
        return zzBy() != 0;
    }

    public int zzBw()
        throws IOException
    {
        return zzkB(zzBy());
    }

    public long zzBx()
        throws IOException
    {
        return zzV(zzBz());
    }

    public int zzBy()
        throws IOException
    {
        int i = zzBF();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = zzBF();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = zzBF();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = zzBF();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = zzBF();
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
                    if (zzBF() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw zzrm.zzBP();
    }

    public long zzBz()
        throws IOException
    {
        int i = 0;
        long l = 0L;
        for (; i < 64; i += 7)
        {
            byte byte0 = zzBF();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw zzrm.zzBP();
    }

    public void zza(zzrn zzrn1)
        throws IOException
    {
        int i = zzBy();
        if (zzaVQ >= zzaVR)
        {
            throw zzrm.zzBT();
        } else
        {
            i = zzkC(i);
            zzaVQ = zzaVQ + 1;
            zzrn1.zzb(this);
            zzkz(0);
            zzaVQ = zzaVQ - 1;
            zzkD(i);
            return;
        }
    }

    public void zza(zzrn zzrn1, int i)
        throws IOException
    {
        if (zzaVQ >= zzaVR)
        {
            throw zzrm.zzBT();
        } else
        {
            zzaVQ = zzaVQ + 1;
            zzrn1.zzb(this);
            zzkz(zzrq.zzD(i, 4));
            zzaVQ = zzaVQ - 1;
            return;
        }
    }

    public boolean zzkA(int i)
        throws IOException
    {
        switch (zzrq.zzkU(i))
        {
        default:
            throw zzrm.zzBS();

        case 0: // '\0'
            zzBu();
            return true;

        case 1: // '\001'
            zzBB();
            return true;

        case 2: // '\002'
            zzkG(zzBy());
            return true;

        case 3: // '\003'
            zzBs();
            zzkz(zzrq.zzD(zzrq.zzkV(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            zzBA();
            break;
        }
        return true;
    }

    public int zzkC(int i)
        throws zzrm
    {
        if (i < 0)
        {
            throw zzrm.zzBO();
        }
        i = zzaVN + i;
        int j = zzaVP;
        if (i > j)
        {
            throw zzrm.zzBN();
        } else
        {
            zzaVP = i;
            zzBC();
            return j;
        }
    }

    public void zzkD(int i)
    {
        zzaVP = i;
        zzBC();
    }

    public void zzkE(int i)
    {
        if (i > zzaVN - zzaVK)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is beyond current ").append(zzaVN - zzaVK).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad position ").append(i).toString());
        } else
        {
            zzaVN = zzaVK + i;
            return;
        }
    }

    public byte[] zzkF(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw zzrm.zzBO();
        }
        if (zzaVN + i > zzaVP)
        {
            zzkG(zzaVP - zzaVN);
            throw zzrm.zzBN();
        }
        if (i <= zzaVL - zzaVN)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, zzaVN, abyte0, 0, i);
            zzaVN = zzaVN + i;
            return abyte0;
        } else
        {
            throw zzrm.zzBN();
        }
    }

    public void zzkG(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw zzrm.zzBO();
        }
        if (zzaVN + i > zzaVP)
        {
            zzkG(zzaVP - zzaVN);
            throw zzrm.zzBN();
        }
        if (i <= zzaVL - zzaVN)
        {
            zzaVN = zzaVN + i;
            return;
        } else
        {
            throw zzrm.zzBN();
        }
    }

    public void zzkz(int i)
        throws zzrm
    {
        if (zzaVO != i)
        {
            throw zzrm.zzBR();
        } else
        {
            return;
        }
    }

    public byte[] zzx(int i, int j)
    {
        if (j == 0)
        {
            return zzrq.zzaWo;
        } else
        {
            byte abyte0[] = new byte[j];
            int k = zzaVK;
            System.arraycopy(buffer, k + i, abyte0, 0, j);
            return abyte0;
        }
    }
}
