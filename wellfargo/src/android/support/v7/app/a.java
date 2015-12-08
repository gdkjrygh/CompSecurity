// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.c.b;
import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            b

public abstract class a
{

    public a()
    {
    }

    public abstract int a();

    public android.support.v7.c.a a(b b1)
    {
        return null;
    }

    public void a(float f1)
    {
        if (f1 != 0.0F)
        {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        } else
        {
            return;
        }
    }

    public void a(int k)
    {
    }

    public void a(Configuration configuration)
    {
    }

    public abstract void a(View view);

    public abstract void a(View view, android.support.v7.app.b b1);

    public void a(CharSequence charsequence)
    {
    }

    public abstract void a(boolean flag);

    public boolean a(int k, KeyEvent keyevent)
    {
        return false;
    }

    public abstract void b();

    public abstract void b(boolean flag);

    public Context c()
    {
        return null;
    }

    public abstract void c(boolean flag);

    public abstract void d(boolean flag);

    public boolean d()
    {
        return false;
    }

    public abstract void e(boolean flag);

    public boolean e()
    {
        return false;
    }

    public void f(boolean flag)
    {
    }

    public void g(boolean flag)
    {
        if (flag)
        {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        } else
        {
            return;
        }
    }

    public void h(boolean flag)
    {
    }

    public void i(boolean flag)
    {
    }

    public void j(boolean flag)
    {
    }
}
