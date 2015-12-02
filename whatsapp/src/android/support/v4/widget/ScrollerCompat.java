// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

public class ScrollerCompat
{

    ScrollerCompatImpl mImpl;
    Object mScroller;

    private ScrollerCompat(int i, Context context, Interpolator interpolator)
    {
label0:
        {
            int j = SlidingPaneLayout.a;
            super();
            if (i >= 14)
            {
                mImpl = new ScrollerCompatImplIcs();
                if (j == 0)
                {
                    break label0;
                }
            }
            if (i >= 9)
            {
                mImpl = new ScrollerCompatImplGingerbread();
                if (j == 0)
                {
                    break label0;
                }
            }
            mImpl = new ScrollerCompatImplBase();
        }
        mScroller = mImpl.createScroller(context, interpolator);
    }

    ScrollerCompat(Context context, Interpolator interpolator)
    {
        this(android.os.Build.VERSION.SDK_INT, context, interpolator);
    }

    public static ScrollerCompat create(Context context, Interpolator interpolator)
    {
        return new ScrollerCompat(context, interpolator);
    }

    public void abortAnimation()
    {
        mImpl.abortAnimation(mScroller);
    }

    public boolean computeScrollOffset()
    {
        return mImpl.computeScrollOffset(mScroller);
    }

    public int getCurrX()
    {
        return mImpl.getCurrX(mScroller);
    }

    public int getCurrY()
    {
        return mImpl.getCurrY(mScroller);
    }

    public int getFinalX()
    {
        return mImpl.getFinalX(mScroller);
    }

    public int getFinalY()
    {
        return mImpl.getFinalY(mScroller);
    }

    public void startScroll(int i, int j, int k, int l, int i1)
    {
        mImpl.startScroll(mScroller, i, j, k, l, i1);
    }

    private class ScrollerCompatImplIcs extends ScrollerCompatImplGingerbread
    {
        private class ScrollerCompatImplGingerbread
            implements ScrollerCompatImpl
        {

            public void abortAnimation(Object obj)
            {
                ScrollerCompatGingerbread.abortAnimation(obj);
            }

            public boolean computeScrollOffset(Object obj)
            {
                return ScrollerCompatGingerbread.computeScrollOffset(obj);
            }

            public Object createScroller(Context context, Interpolator interpolator)
            {
                return ScrollerCompatGingerbread.createScroller(context, interpolator);
            }

            public int getCurrX(Object obj)
            {
                return ScrollerCompatGingerbread.getCurrX(obj);
            }

            public int getCurrY(Object obj)
            {
                return ScrollerCompatGingerbread.getCurrY(obj);
            }

            public int getFinalX(Object obj)
            {
                return ScrollerCompatGingerbread.getFinalX(obj);
            }

            public int getFinalY(Object obj)
            {
                return ScrollerCompatGingerbread.getFinalY(obj);
            }

            public void startScroll(Object obj, int i, int j, int k, int l, int i1)
            {
                ScrollerCompatGingerbread.startScroll(obj, i, j, k, l, i1);
            }

            ScrollerCompatImplGingerbread()
            {
            }
        }


        ScrollerCompatImplIcs()
        {
        }
    }


    private class ScrollerCompatImplBase
        implements ScrollerCompatImpl
    {

        public void abortAnimation(Object obj)
        {
            ((Scroller)obj).abortAnimation();
        }

        public boolean computeScrollOffset(Object obj)
        {
            return ((Scroller)obj).computeScrollOffset();
        }

        public Object createScroller(Context context, Interpolator interpolator)
        {
            if (interpolator != null)
            {
                return new Scroller(context, interpolator);
            } else
            {
                return new Scroller(context);
            }
        }

        public int getCurrX(Object obj)
        {
            return ((Scroller)obj).getCurrX();
        }

        public int getCurrY(Object obj)
        {
            return ((Scroller)obj).getCurrY();
        }

        public int getFinalX(Object obj)
        {
            return ((Scroller)obj).getFinalX();
        }

        public int getFinalY(Object obj)
        {
            return ((Scroller)obj).getFinalY();
        }

        public void startScroll(Object obj, int i, int j, int k, int l, int i1)
        {
            ((Scroller)obj).startScroll(i, j, k, l, i1);
        }

        ScrollerCompatImplBase()
        {
        }
    }


    private class ScrollerCompatImpl
    {

        public abstract void abortAnimation(Object obj);

        public abstract boolean computeScrollOffset(Object obj);

        public abstract Object createScroller(Context context, Interpolator interpolator);

        public abstract int getCurrX(Object obj);

        public abstract int getCurrY(Object obj);

        public abstract int getFinalX(Object obj);

        public abstract int getFinalY(Object obj);

        public abstract void startScroll(Object obj, int i, int j, int k, int l, int i1);
    }

}
