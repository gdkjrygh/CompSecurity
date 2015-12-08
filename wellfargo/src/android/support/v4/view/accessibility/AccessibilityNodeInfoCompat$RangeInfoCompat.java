// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


public class <init>
{

    public static final int RANGE_TYPE_FLOAT = 1;
    public static final int RANGE_TYPE_INT = 0;
    public static final int RANGE_TYPE_PERCENT = 2;
    private final Object mInfo;

    public float getCurrent()
    {
        return getCurrent(mInfo);
    }

    public float getMax()
    {
        return getMax(mInfo);
    }

    public float getMin()
    {
        return getMin(mInfo);
    }

    public int getType()
    {
        return getType(mInfo);
    }

    private (Object obj)
    {
        mInfo = obj;
    }

    mInfo(Object obj, mInfo minfo)
    {
        this(obj);
    }
}
