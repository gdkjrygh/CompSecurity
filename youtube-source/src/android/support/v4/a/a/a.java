// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a.a;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.a.a:
//            e, d, b, c

public final class a
{

    static final c a;

    public static void a(Drawable drawable)
    {
        a.a(drawable);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 19)
        {
            a = new e();
        } else
        if (i >= 11)
        {
            a = new d();
        } else
        {
            a = new b();
        }
    }
}
