// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzrk

class zzrj
    implements Cloneable
{

    private static final zzrk zzaVX = new zzrk();
    private int mSize;
    private boolean zzaVY;
    private int zzaVZ[];
    private zzrk zzaWa[];

    public zzrj()
    {
        this(10);
    }

    public zzrj(int i)
    {
        zzaVY = false;
        i = idealIntArraySize(i);
        zzaVZ = new int[i];
        zzaWa = new zzrk[i];
        mSize = 0;
    }

    private void gc()
    {
        int l = mSize;
        int ai[] = zzaVZ;
        zzrk azzrk[] = zzaWa;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            zzrk zzrk1 = azzrk[i];
            k = j;
            if (zzrk1 != zzaVX)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    azzrk[j] = zzrk1;
                    azzrk[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        zzaVY = false;
        mSize = j;
    }

    private int idealByteArraySize(int i)
    {
        int j = 4;
        do
        {
label0:
            {
                int k = i;
                if (j < 32)
                {
                    if (i > (1 << j) - 12)
                    {
                        break label0;
                    }
                    k = (1 << j) - 12;
                }
                return k;
            }
            j++;
        } while (true);
    }

    private int idealIntArraySize(int i)
    {
        return idealByteArraySize(i * 4) / 4;
    }

    private boolean zza(int ai[], int ai1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (ai[j] != ai1[j])
            {
                return false;
            }
        }

        return true;
    }

    private boolean zza(zzrk azzrk[], zzrk azzrk1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (!azzrk[j].equals(azzrk1[j]))
            {
                return false;
            }
        }

        return true;
    }

    private int zzkT(int i)
    {
        int j = 0;
        for (int k = mSize - 1; j <= k;)
        {
            int l = j + k >>> 1;
            int i1 = zzaVZ[l];
            if (i1 < i)
            {
                j = l + 1;
            } else
            if (i1 > i)
            {
                k = l - 1;
            } else
            {
                return l;
            }
        }

        return ~j;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzBL();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzrj))
            {
                return false;
            }
            obj = (zzrj)obj;
            if (size() != ((zzrj) (obj)).size())
            {
                return false;
            }
            if (!zza(zzaVZ, ((zzrj) (obj)).zzaVZ, mSize) || !zza(zzaWa, ((zzrj) (obj)).zzaWa, mSize))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (zzaVY)
        {
            gc();
        }
        int j = 17;
        for (int i = 0; i < mSize; i++)
        {
            j = (j * 31 + zzaVZ[i]) * 31 + zzaWa[i].hashCode();
        }

        return j;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int size()
    {
        if (zzaVY)
        {
            gc();
        }
        return mSize;
    }

    public final zzrj zzBL()
    {
        int i = 0;
        int j = size();
        zzrj zzrj1 = new zzrj(j);
        System.arraycopy(zzaVZ, 0, zzrj1.zzaVZ, 0, j);
        for (; i < j; i++)
        {
            if (zzaWa[i] != null)
            {
                zzrj1.zzaWa[i] = zzaWa[i].zzBM();
            }
        }

        zzrj1.mSize = j;
        return zzrj1;
    }

    public void zza(int i, zzrk zzrk1)
    {
        int j = zzkT(i);
        if (j >= 0)
        {
            zzaWa[j] = zzrk1;
            return;
        }
        int k = ~j;
        if (k < mSize && zzaWa[k] == zzaVX)
        {
            zzaVZ[k] = i;
            zzaWa[k] = zzrk1;
            return;
        }
        j = k;
        if (zzaVY)
        {
            j = k;
            if (mSize >= zzaVZ.length)
            {
                gc();
                j = ~zzkT(i);
            }
        }
        if (mSize >= zzaVZ.length)
        {
            int l = idealIntArraySize(mSize + 1);
            int ai[] = new int[l];
            zzrk azzrk[] = new zzrk[l];
            System.arraycopy(zzaVZ, 0, ai, 0, zzaVZ.length);
            System.arraycopy(zzaWa, 0, azzrk, 0, zzaWa.length);
            zzaVZ = ai;
            zzaWa = azzrk;
        }
        if (mSize - j != 0)
        {
            System.arraycopy(zzaVZ, j, zzaVZ, j + 1, mSize - j);
            System.arraycopy(zzaWa, j, zzaWa, j + 1, mSize - j);
        }
        zzaVZ[j] = i;
        zzaWa[j] = zzrk1;
        mSize = mSize + 1;
    }

    public zzrk zzkR(int i)
    {
        i = zzkT(i);
        if (i < 0 || zzaWa[i] == zzaVX)
        {
            return null;
        } else
        {
            return zzaWa[i];
        }
    }

    public zzrk zzkS(int i)
    {
        if (zzaVY)
        {
            gc();
        }
        return zzaWa[i];
    }

}
