// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener, ViewPropertyAnimatorCompat, ViewPropertyAnimatorUpdateListener

class mStarterMap
    implements mStarterMap
{

    WeakHashMap mStarterMap;

    private void postStartMessage(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        Runnable runnable;
        Object obj;
        if (mStarterMap != null)
        {
            runnable = (Runnable)mStarterMap.get(view);
        } else
        {
            runnable = null;
        }
        obj = runnable;
        if (runnable == null)
        {
            class Starter
                implements Runnable
            {

                WeakReference mViewRef;
                ViewPropertyAnimatorCompat mVpa;
                final ViewPropertyAnimatorCompat.BaseViewPropertyAnimatorCompatImpl this$0;

                public void run()
                {
                    View view1 = (View)mViewRef.get();
                    if (view1 != null)
                    {
                        startAnimation(mVpa, view1);
                    }
                }

            private Starter(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
            {
                this$0 = ViewPropertyAnimatorCompat.BaseViewPropertyAnimatorCompatImpl.this;
                super();
                mViewRef = new WeakReference(view);
                mVpa = viewpropertyanimatorcompat;
            }

            Starter(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorCompat._cls1 _pcls1)
            {
                this(viewpropertyanimatorcompat, view);
            }
            }

            obj = new Starter(viewpropertyanimatorcompat, view, null);
            if (mStarterMap == null)
            {
                mStarterMap = new WeakHashMap();
            }
            mStarterMap.put(view, obj);
        }
        view.removeCallbacks(((Runnable) (obj)));
        view.post(((Runnable) (obj)));
    }

    private void removeStartMessage(View view)
    {
        if (mStarterMap != null)
        {
            Runnable runnable = (Runnable)mStarterMap.get(view);
            if (runnable != null)
            {
                view.removeCallbacks(runnable);
            }
        }
    }

    private void startAnimation(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        Object obj = view.getTag(0x7e000000);
        Runnable runnable;
        if (obj instanceof ViewPropertyAnimatorListener)
        {
            obj = (ViewPropertyAnimatorListener)obj;
        } else
        {
            obj = null;
        }
        runnable = ViewPropertyAnimatorCompat.access$100(viewpropertyanimatorcompat);
        viewpropertyanimatorcompat = ViewPropertyAnimatorCompat.access$000(viewpropertyanimatorcompat);
        if (runnable != null)
        {
            runnable.run();
        }
        if (obj != null)
        {
            ((ViewPropertyAnimatorListener) (obj)).onAnimationStart(view);
            ((ViewPropertyAnimatorListener) (obj)).onAnimationEnd(view);
        }
        if (viewpropertyanimatorcompat != null)
        {
            viewpropertyanimatorcompat.run();
        }
        if (mStarterMap != null)
        {
            mStarterMap.remove(view);
        }
    }

    public void alpha(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void alphaBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void cancel(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public long getDuration(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        return 0L;
    }

    public Interpolator getInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        return null;
    }

    public long getStartDelay(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        return 0L;
    }

    public void rotation(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void rotationBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void rotationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void rotationXBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void rotationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void rotationYBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void scaleX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void scaleXBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void scaleY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void scaleYBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void setDuration(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l)
    {
    }

    public void setInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator)
    {
    }

    public void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        view.setTag(0x7e000000, viewpropertyanimatorlistener);
    }

    public void setStartDelay(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l)
    {
    }

    public void setUpdateListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
    {
    }

    public void start(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        removeStartMessage(view);
        startAnimation(viewpropertyanimatorcompat, view);
    }

    public void translationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void translationXBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void translationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void translationYBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void translationZ(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
    }

    public void translationZBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
    }

    public void withEndAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
    {
        ViewPropertyAnimatorCompat.access$002(viewpropertyanimatorcompat, runnable);
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void withLayer(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
    }

    public void withStartAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
    {
        ViewPropertyAnimatorCompat.access$102(viewpropertyanimatorcompat, runnable);
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void x(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void xBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void y(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void yBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        postStartMessage(viewpropertyanimatorcompat, view);
    }

    public void z(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
    }

    public void zBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
    }


    Starter()
    {
        mStarterMap = null;
    }
}
