// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            GridLayout

static final class max
{

    public final int max;
    public final int min;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (max)obj;
            if (max != ((max) (obj)).max)
            {
                return false;
            }
            if (min != ((min) (obj)).min)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return min * 31 + max;
    }

    max inverse()
    {
        return new <init>(max, min);
    }

    int size()
    {
        return max - min;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(min).append(", ").append(max).append("]").toString();
    }

    public (int i, int j)
    {
        min = i;
        max = j;
    }
}
