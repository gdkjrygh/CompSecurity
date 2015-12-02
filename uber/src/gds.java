// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

public final class gds
{

    public static int a(Context context, int i)
    {
        context = context.getResources();
        int j = context.getDimensionPixelSize(0x7f080230);
        if (i == 2)
        {
            j = context.getDimensionPixelSize(0x7f080232);
        } else
        if (i <= 4)
        {
            return context.getDimensionPixelSize(0x7f080231);
        }
        return j;
    }
}
