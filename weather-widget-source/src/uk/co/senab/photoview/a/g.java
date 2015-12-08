// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview.a;

import android.content.Context;

// Referenced classes of package uk.co.senab.photoview.a:
//            a, e, b, c, 
//            f

public final class g
{

    public static e a(Context context, f f)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 5)
        {
            context = new a(context);
        } else
        if (i < 8)
        {
            context = new b(context);
        } else
        {
            context = new c(context);
        }
        context.a(f);
        return context;
    }
}
