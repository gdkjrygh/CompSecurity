// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview.b;

import android.content.Context;

// Referenced classes of package uk.co.senab.photoview.b:
//            c, a, b

public abstract class d
{

    public d()
    {
    }

    public static d a(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            return new c(context);
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return new a(context);
        } else
        {
            return new b(context);
        }
    }

    public abstract void a(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2);

    public abstract void a(boolean flag);

    public abstract boolean a();

    public abstract boolean b();

    public abstract int c();

    public abstract int d();
}
