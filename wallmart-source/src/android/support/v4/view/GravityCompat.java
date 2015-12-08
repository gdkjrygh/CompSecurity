// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Rect;

public class GravityCompat
{

    public static final int END = 0x800005;
    static final GravityCompatImpl IMPL;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 0x800007;
    public static final int RELATIVE_LAYOUT_DIRECTION = 0x800000;
    public static final int START = 0x800003;

    public GravityCompat()
    {
    }

    public static void apply(int i, int j, int k, Rect rect, int l, int i1, Rect rect1, int j1)
    {
    /* block-local class not found */
    class GravityCompatImpl {}

        IMPL.apply(i, j, k, rect, l, i1, rect1, j1);
    }

    public static void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
    {
        IMPL.apply(i, j, k, rect, rect1, l);
    }

    public static void applyDisplay(int i, Rect rect, Rect rect1, int j)
    {
        IMPL.applyDisplay(i, rect, rect1, j);
    }

    public static int getAbsoluteGravity(int i, int j)
    {
        return IMPL.getAbsoluteGravity(i, j);
    }

    static 
    {
    /* block-local class not found */
    class GravityCompatImplBase {}

    /* block-local class not found */
    class GravityCompatImplJellybeanMr1 {}

        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            IMPL = new GravityCompatImplJellybeanMr1();
        } else
        {
            IMPL = new GravityCompatImplBase();
        }
    }
}
