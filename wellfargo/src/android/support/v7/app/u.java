// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            aa, z, AppCompatDelegateImplV7, t, 
//            a, f

public abstract class u
{

    u()
    {
    }

    public static u a(Activity activity, t t)
    {
        return a(((Context) (activity)), activity.getWindow(), t);
    }

    public static u a(Dialog dialog, t t)
    {
        return a(dialog.getContext(), dialog.getWindow(), t);
    }

    private static u a(Context context, Window window, t t)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14)
        {
            return new aa(context, window, t);
        }
        if (i >= 11)
        {
            return new z(context, window, t);
        } else
        {
            return new AppCompatDelegateImplV7(context, window, t);
        }
    }

    public abstract android.support.v7.app.a a();

    public abstract a a(b b1);

    public abstract void a(int i);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void a(CharSequence charsequence);

    public abstract MenuInflater b();

    public abstract void b(Bundle bundle);

    public abstract void b(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract boolean b(int i);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract f g();

    public abstract void h();
}
