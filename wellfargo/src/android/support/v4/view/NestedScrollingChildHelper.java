// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            ViewParentCompat, ViewCompat

public class NestedScrollingChildHelper
{

    private boolean mIsNestedScrollingEnabled;
    private ViewParent mNestedScrollingParent;
    private int mTempNestedScrollConsumed[];
    private final View mView;

    public NestedScrollingChildHelper(View view)
    {
        mView = view;
    }

    public boolean dispatchNestedFling(float f, float f1, boolean flag)
    {
        if (isNestedScrollingEnabled() && mNestedScrollingParent != null)
        {
            return ViewParentCompat.onNestedFling(mNestedScrollingParent, mView, f, f1, flag);
        } else
        {
            return false;
        }
    }

    public boolean dispatchNestedPreFling(float f, float f1)
    {
        if (isNestedScrollingEnabled() && mNestedScrollingParent != null)
        {
            return ViewParentCompat.onNestedPreFling(mNestedScrollingParent, mView, f, f1);
        } else
        {
            return false;
        }
    }

    public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!isNestedScrollingEnabled()) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (mNestedScrollingParent == null) goto _L2; else goto _L3
_L3:
        if (i == 0 && j == 0) goto _L5; else goto _L4
_L4:
        int ai2[];
        int k;
        int l;
        if (ai1 != null)
        {
            mView.getLocationInWindow(ai1);
            l = ai1[0];
            k = ai1[1];
        } else
        {
            k = 0;
            l = 0;
        }
        ai2 = ai;
        if (ai == null)
        {
            if (mTempNestedScrollConsumed == null)
            {
                mTempNestedScrollConsumed = new int[2];
            }
            ai2 = mTempNestedScrollConsumed;
        }
        ai2[0] = 0;
        ai2[1] = 0;
        ViewParentCompat.onNestedPreScroll(mNestedScrollingParent, mView, i, j, ai2);
        if (ai1 != null)
        {
            mView.getLocationInWindow(ai1);
            ai1[0] = ai1[0] - l;
            ai1[1] = ai1[1] - k;
        }
        if (ai2[0] != 0) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (ai2[1] == 0) goto _L2; else goto _L7
_L7:
        flag = true;
_L2:
        return flag;
_L5:
        flag = flag1;
        if (ai1 != null)
        {
            ai1[0] = 0;
            ai1[1] = 0;
            return false;
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (isNestedScrollingEnabled())
        {
            flag = flag1;
            if (mNestedScrollingParent != null)
            {
                if (i != 0 || j != 0 || k != 0 || l != 0)
                {
                    int i1;
                    int j1;
                    if (ai != null)
                    {
                        mView.getLocationInWindow(ai);
                        j1 = ai[0];
                        i1 = ai[1];
                    } else
                    {
                        i1 = 0;
                        j1 = 0;
                    }
                    ViewParentCompat.onNestedScroll(mNestedScrollingParent, mView, i, j, k, l);
                    if (ai != null)
                    {
                        mView.getLocationInWindow(ai);
                        ai[0] = ai[0] - j1;
                        ai[1] = ai[1] - i1;
                    }
                    flag = true;
                } else
                {
                    flag = flag1;
                    if (ai != null)
                    {
                        ai[0] = 0;
                        ai[1] = 0;
                        return false;
                    }
                }
            }
        }
        return flag;
    }

    public boolean hasNestedScrollingParent()
    {
        return mNestedScrollingParent != null;
    }

    public boolean isNestedScrollingEnabled()
    {
        return mIsNestedScrollingEnabled;
    }

    public void onDetachedFromWindow()
    {
        ViewCompat.stopNestedScroll(mView);
    }

    public void onStopNestedScroll(View view)
    {
        ViewCompat.stopNestedScroll(mView);
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        if (mIsNestedScrollingEnabled)
        {
            ViewCompat.stopNestedScroll(mView);
        }
        mIsNestedScrollingEnabled = flag;
    }

    public boolean startNestedScroll(int i)
    {
        if (hasNestedScrollingParent())
        {
            return true;
        }
        if (isNestedScrollingEnabled())
        {
            ViewParent viewparent = mView.getParent();
            View view = mView;
            for (; viewparent != null; viewparent = viewparent.getParent())
            {
                if (ViewParentCompat.onStartNestedScroll(viewparent, view, mView, i))
                {
                    mNestedScrollingParent = viewparent;
                    ViewParentCompat.onNestedScrollAccepted(viewparent, view, mView, i);
                    return true;
                }
                if (viewparent instanceof View)
                {
                    view = (View)viewparent;
                }
            }

        }
        return false;
    }

    public void stopNestedScroll()
    {
        if (mNestedScrollingParent != null)
        {
            ViewParentCompat.onStopNestedScroll(mNestedScrollingParent, mView);
            mNestedScrollingParent = null;
        }
    }
}
