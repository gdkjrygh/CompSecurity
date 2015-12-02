// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

public final class eel
{

    private final int a;
    private final int b;
    private final float c;

    private eel(Resources resources, int i, int j)
    {
        c = resources.getDimensionPixelSize(0x7f0800d8);
        a = resources.getColor(i);
        b = resources.getColor(j);
    }

    public static eel a(Context context)
    {
        return new eel(context.getResources(), 0x7f0d0078, 0x7f0d0079);
    }

    public static eel b(Context context)
    {
        return new eel(context.getResources(), 0x7f0d0080, 0x7f0d0080);
    }

    public final int a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final float c()
    {
        return c;
    }
}
