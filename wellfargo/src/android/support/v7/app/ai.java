// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.support.v7.internal.widget.bd;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class ai extends FrameLayout
{

    final AppCompatDelegateImplV7 a;

    public ai(AppCompatDelegateImplV7 appcompatdelegateimplv7, Context context)
    {
        a = appcompatdelegateimplv7;
        super(context);
    }

    private boolean a(int i, int j)
    {
        return i < -5 || j < -5 || i > getWidth() + 5 || j > getHeight() + 5;
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return a.a(keyevent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0 && a((int)motionevent.getX(), (int)motionevent.getY()))
        {
            AppCompatDelegateImplV7.d(a, 0);
            return true;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    public void setBackgroundResource(int i)
    {
        setBackgroundDrawable(bd.a(getContext(), i));
    }
}
