// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            EditState, ViewVisitor

private static class run
    implements android.view.balLayoutListener, Runnable
{

    private boolean mAlive;
    private volatile boolean mDying;
    private final ViewVisitor mEdit;
    private final Handler mHandler;
    private final WeakReference mViewRoot;

    private void cleanUp()
    {
        if (mAlive)
        {
            Object obj = (View)mViewRoot.get();
            if (obj != null)
            {
                obj = ((View) (obj)).getViewTreeObserver();
                if (((ViewTreeObserver) (obj)).isAlive())
                {
                    ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                }
            }
            mEdit.cleanup();
        }
        mAlive = false;
    }

    public void kill()
    {
        mDying = true;
        mHandler.post(this);
    }

    public void onGlobalLayout()
    {
        run();
    }

    public void run()
    {
        if (!mAlive)
        {
            return;
        }
        View view = (View)mViewRoot.get();
        if (view == null || mDying)
        {
            cleanUp();
            return;
        } else
        {
            mEdit.visit(view);
            mHandler.removeCallbacks(this);
            mHandler.postDelayed(this, 1000L);
            return;
        }
    }

    public (View view, ViewVisitor viewvisitor, Handler handler)
    {
        mEdit = viewvisitor;
        mViewRoot = new WeakReference(view);
        mHandler = handler;
        mAlive = true;
        mDying = false;
        view = view.getViewTreeObserver();
        if (view.isAlive())
        {
            view.addOnGlobalLayoutListener(this);
        }
        run();
    }
}
