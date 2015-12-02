// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            qt, qw

class qs
{

    private static final qt ayZ = new qt();
    private boolean aza;
    private int azb[];
    private qt azc[];
    private int mSize;

    public qs()
    {
        this(10);
    }

    public qs(int i)
    {
        aza = false;
        i = idealIntArraySize(i);
        azb = new int[i];
        azc = new qt[i];
        mSize = 0;
    }

    private boolean a(int ai[], int ai1[], int i)
    {
        boolean flag = qw.a;
        int j = 0;
        do
        {
            if (j >= i)
            {
                break;
            }
            if (ai[j] != ai1[j])
            {
                return false;
            }
            j++;
        } while (!flag);
        return true;
    }

    private boolean a(qt aqt[], qt aqt1[], int i)
    {
        boolean flag = qw.a;
        int j = 0;
        do
        {
            if (j >= i)
            {
                break;
            }
            if (!aqt[j].equals(aqt1[j]))
            {
                return false;
            }
            j++;
        } while (!flag);
        return true;
    }

    private void gc()
    {
        boolean flag = qw.a;
        int l = mSize;
        int ai[] = azb;
        qt aqt[] = azc;
        int k = 0;
        int i = 0;
        int j;
        do
        {
            j = i;
            if (k >= l)
            {
                break;
            }
            qt qt1 = aqt[k];
            j = i;
            if (qt1 != ayZ)
            {
                if (k != i)
                {
                    ai[i] = ai[k];
                    aqt[i] = qt1;
                    aqt[k] = null;
                }
                j = i + 1;
            }
            k++;
            i = j;
        } while (!flag);
        aza = false;
        mSize = j;
    }

    private int idealByteArraySize(int i)
    {
        boolean flag = qw.a;
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
            if (flag)
            {
                return i;
            }
        } while (true);
    }

    private int idealIntArraySize(int i)
    {
        return idealByteArraySize(i * 4) / 4;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof qs))
            {
                return false;
            }
            obj = (qs)obj;
            if (size() != ((qs) (obj)).size())
            {
                return false;
            }
            if (!a(azb, ((qs) (obj)).azb, mSize) || !a(azc, ((qs) (obj)).azc, mSize))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        boolean flag = qw.a;
        if (aza)
        {
            gc();
        }
        int i = 17;
        int j = 0;
        int k;
        do
        {
            k = i;
            if (j >= mSize)
            {
                break;
            }
            k = (i * 31 + azb[j]) * 31 + azc[j].hashCode();
            j++;
            i = k;
        } while (!flag);
        return k;
    }

    public qt hi(int i)
    {
        if (aza)
        {
            gc();
        }
        return azc[i];
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int size()
    {
        if (aza)
        {
            gc();
        }
        return mSize;
    }

}
