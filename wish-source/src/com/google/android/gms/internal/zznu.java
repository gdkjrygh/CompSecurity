// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zznv

class zznu
    implements Cloneable
{

    private static final zznv zzaNW = new zznv();
    private int mSize;
    private boolean zzaNX;
    private int zzaNY[];
    private zznv zzaNZ[];

    public zznu()
    {
        this(10);
    }

    public zznu(int i)
    {
        zzaNX = false;
        i = idealIntArraySize(i);
        zzaNY = new int[i];
        zzaNZ = new zznv[i];
        mSize = 0;
    }

    private void gc()
    {
        int l = mSize;
        int ai[] = zzaNY;
        zznv azznv[] = zzaNZ;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            zznv zznv1 = azznv[i];
            k = j;
            if (zznv1 != zzaNW)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    azznv[j] = zznv1;
                    azznv[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        zzaNX = false;
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

    private boolean zza(zznv azznv[], zznv azznv1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (!azznv[j].equals(azznv1[j]))
            {
                return false;
            }
        }

        return true;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzzP();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zznu))
            {
                return false;
            }
            obj = (zznu)obj;
            if (size() != ((zznu) (obj)).size())
            {
                return false;
            }
            if (!zza(zzaNY, ((zznu) (obj)).zzaNY, mSize) || !zza(zzaNZ, ((zznu) (obj)).zzaNZ, mSize))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (zzaNX)
        {
            gc();
        }
        int j = 17;
        for (int i = 0; i < mSize; i++)
        {
            j = (j * 31 + zzaNY[i]) * 31 + zzaNZ[i].hashCode();
        }

        return j;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int size()
    {
        if (zzaNX)
        {
            gc();
        }
        return mSize;
    }

    public zznv zzjE(int i)
    {
        if (zzaNX)
        {
            gc();
        }
        return zzaNZ[i];
    }

    public final zznu zzzP()
    {
        int i = 0;
        int j = size();
        zznu zznu1 = new zznu(j);
        System.arraycopy(zzaNY, 0, zznu1.zzaNY, 0, j);
        for (; i < j; i++)
        {
            if (zzaNZ[i] != null)
            {
                zznu1.zzaNZ[i] = zzaNZ[i].zzzQ();
            }
        }

        zznu1.mSize = j;
        return zznu1;
    }

}
