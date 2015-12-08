// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            bf, a

class ax
    implements bf
{

    ax()
    {
    }

    public int a(View view)
    {
        return 2;
    }

    long a()
    {
        return 10L;
    }

    public void a(View view, int i, int j, int k, int l)
    {
        view.postInvalidateDelayed(a(), i, j, k, l);
    }

    public void a(View view, int i, Paint paint)
    {
    }

    public void a(View view, Paint paint)
    {
    }

    public void a(View view, a a1)
    {
    }

    public void a(View view, Runnable runnable)
    {
        view.postDelayed(runnable, a());
    }

    public boolean a(View view, int i)
    {
        return false;
    }

    public void b(View view)
    {
        view.postInvalidateDelayed(a());
    }

    public void b(View view, int i)
    {
    }

    public int c(View view)
    {
        return 0;
    }

    public int d(View view)
    {
        return 0;
    }

    public int e(View view)
    {
        return 0;
    }

    public ViewParent f(View view)
    {
        return view.getParent();
    }

    public boolean g(View view)
    {
        boolean flag1 = false;
        view = view.getBackground();
        boolean flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view.getOpacity() == -1)
            {
                flag = true;
            }
        }
        return flag;
    }
}
