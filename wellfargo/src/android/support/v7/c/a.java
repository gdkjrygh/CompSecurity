// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.c;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public abstract class a
{

    private Object a;
    private boolean b;

    public a()
    {
    }

    public abstract MenuInflater a();

    public abstract void a(int l);

    public abstract void a(View view);

    public abstract void a(CharSequence charsequence);

    public void a(Object obj)
    {
        a = obj;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public abstract Menu b();

    public abstract void b(int l);

    public abstract void b(CharSequence charsequence);

    public abstract void c();

    public abstract void d();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public boolean h()
    {
        return false;
    }

    public abstract View i();

    public Object j()
    {
        return a;
    }

    public boolean k()
    {
        return b;
    }
}
