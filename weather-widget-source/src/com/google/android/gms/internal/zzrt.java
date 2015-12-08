// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzru

class zzrt
    implements Cloneable
{

    private static final zzru zzbcd = new zzru();
    private int mSize;
    private boolean zzbce;
    private int zzbcf[];
    private zzru zzbcg[];

    public zzrt()
    {
        this(10);
    }

    public zzrt(int i)
    {
        zzbce = false;
        i = idealIntArraySize(i);
        zzbcf = new int[i];
        zzbcg = new zzru[i];
        mSize = 0;
    }

    private void gc()
    {
        int l = mSize;
        int ai[] = zzbcf;
        zzru azzru[] = zzbcg;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            zzru zzru1 = azzru[i];
            k = j;
            if (zzru1 != zzbcd)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    azzru[j] = zzru1;
                    azzru[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        zzbce = false;
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

    private boolean zza(zzru azzru[], zzru azzru1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (!azzru[j].equals(azzru1[j]))
            {
                return false;
            }
        }

        return true;
    }

    private int zzlC(int i)
    {
        int j = 0;
        for (int k = mSize - 1; j <= k;)
        {
            int l = j + k >>> 1;
            int i1 = zzbcf[l];
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
        return zzDn();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzrt))
            {
                return false;
            }
            obj = (zzrt)obj;
            if (size() != ((zzrt) (obj)).size())
            {
                return false;
            }
            if (!zza(zzbcf, ((zzrt) (obj)).zzbcf, mSize) || !zza(zzbcg, ((zzrt) (obj)).zzbcg, mSize))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (zzbce)
        {
            gc();
        }
        int j = 17;
        for (int i = 0; i < mSize; i++)
        {
            j = (j * 31 + zzbcf[i]) * 31 + zzbcg[i].hashCode();
        }

        return j;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int size()
    {
        if (zzbce)
        {
            gc();
        }
        return mSize;
    }

    public final zzrt zzDn()
    {
        int i = 0;
        int j = size();
        zzrt zzrt1 = new zzrt(j);
        System.arraycopy(zzbcf, 0, zzrt1.zzbcf, 0, j);
        for (; i < j; i++)
        {
            if (zzbcg[i] != null)
            {
                zzrt1.zzbcg[i] = zzbcg[i].zzDo();
            }
        }

        zzrt1.mSize = j;
        return zzrt1;
    }

    public void zza(int i, zzru zzru1)
    {
        int j = zzlC(i);
        if (j >= 0)
        {
            zzbcg[j] = zzru1;
            return;
        }
        int k = ~j;
        if (k < mSize && zzbcg[k] == zzbcd)
        {
            zzbcf[k] = i;
            zzbcg[k] = zzru1;
            return;
        }
        j = k;
        if (zzbce)
        {
            j = k;
            if (mSize >= zzbcf.length)
            {
                gc();
                j = ~zzlC(i);
            }
        }
        if (mSize >= zzbcf.length)
        {
            int l = idealIntArraySize(mSize + 1);
            int ai[] = new int[l];
            zzru azzru[] = new zzru[l];
            System.arraycopy(zzbcf, 0, ai, 0, zzbcf.length);
            System.arraycopy(zzbcg, 0, azzru, 0, zzbcg.length);
            zzbcf = ai;
            zzbcg = azzru;
        }
        if (mSize - j != 0)
        {
            System.arraycopy(zzbcf, j, zzbcf, j + 1, mSize - j);
            System.arraycopy(zzbcg, j, zzbcg, j + 1, mSize - j);
        }
        zzbcf[j] = i;
        zzbcg[j] = zzru1;
        mSize = mSize + 1;
    }

    public zzru zzlA(int i)
    {
        i = zzlC(i);
        if (i < 0 || zzbcg[i] == zzbcd)
        {
            return null;
        } else
        {
            return zzbcg[i];
        }
    }

    public zzru zzlB(int i)
    {
        if (zzbce)
        {
            gc();
        }
        return zzbcg[i];
    }

}
