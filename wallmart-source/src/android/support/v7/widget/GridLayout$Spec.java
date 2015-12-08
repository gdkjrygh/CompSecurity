// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            GridLayout

public static class weight
{

    static final float DEFAULT_WEIGHT = 0F;
    static final alignment UNDEFINED = GridLayout.spec(0x80000000);
    final ment alignment;
    final val span;
    final boolean startDefined;
    final float weight;

    final ment copyWriteAlignment(ment ment)
    {
        return new <init>(startDefined, span, ment, weight);
    }

    final val copyWriteSpan(val val)
    {
        return new <init>(startDefined, val, alignment, weight);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (weight)obj;
            if (!alignment.equals(((alignment) (obj)).alignment))
            {
                return false;
            }
            if (!span.equals(((val.equals) (obj)).span))
            {
                return false;
            }
        }
        return true;
    }

    public ment getAbsoluteAlignment(boolean flag)
    {
        if (alignment != GridLayout.UNDEFINED_ALIGNMENT)
        {
            return alignment;
        }
        if (weight == 0.0F)
        {
            if (flag)
            {
                return GridLayout.START;
            } else
            {
                return GridLayout.BASELINE;
            }
        } else
        {
            return GridLayout.FILL;
        }
    }

    final int getFlexibility()
    {
        return alignment != GridLayout.UNDEFINED_ALIGNMENT || weight != 0.0F ? 2 : 0;
    }

    public int hashCode()
    {
        return span.hashCode() * 31 + alignment.hashCode();
    }


    private ment(boolean flag, int i, int j, ment ment, float f)
    {
        this(flag, new val(i, i + j), ment, f);
    }

    ment(boolean flag, int i, int j, ment ment, float f, ment ment1)
    {
        this(flag, i, j, ment, f);
    }

    private ment(boolean flag, val val, ment ment, float f)
    {
        startDefined = flag;
        span = val;
        alignment = ment;
        weight = f;
    }
}
