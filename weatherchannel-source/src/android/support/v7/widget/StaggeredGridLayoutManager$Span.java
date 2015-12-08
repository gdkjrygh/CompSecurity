// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager, OrientationHelper

class <init>
{

    static final int INVALID_LINE = 0x80000000;
    int mCachedEnd;
    int mCachedStart;
    int mDeletedSize;
    final int mIndex;
    private ArrayList mViews;
    final StaggeredGridLayoutManager this$0;

    void appendToSpan(View view)
    {
        tParams tparams = getLayoutParams(view);
        tparams.mSpan = this;
        mViews.add(view);
        mCachedEnd = 0x80000000;
        if (mViews.size() == 1)
        {
            mCachedStart = 0x80000000;
        }
        if (tparams.isItemRemoved() || tparams.isItemChanged())
        {
            mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
        }
    }

    void cacheReferenceLineAndClear(boolean flag, int i)
    {
        int j;
        if (flag)
        {
            j = getEndLine(0x80000000);
        } else
        {
            j = getStartLine(0x80000000);
        }
        clear();
        while (j == 0x80000000 || flag && j < mPrimaryOrientation.getEndAfterPadding() || !flag && j > mPrimaryOrientation.getStartAfterPadding()) 
        {
            return;
        }
        int k = j;
        if (i != 0x80000000)
        {
            k = j + i;
        }
        mCachedEnd = k;
        mCachedStart = k;
    }

    void calculateCachedEnd()
    {
        View view = (View)mViews.get(mViews.size() - 1);
        tParams tparams = getLayoutParams(view);
        mCachedEnd = mPrimaryOrientation.getDecoratedEnd(view);
        if (tparams.mFullSpan)
        {
            panLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(tparams.getViewLayoutPosition());
            if (fullspanitem != null && fullspanitem.mGapDir == 1)
            {
                mCachedEnd = mCachedEnd + fullspanitem.getGapForSpan(mIndex);
            }
        }
    }

    void calculateCachedStart()
    {
        View view = (View)mViews.get(0);
        tParams tparams = getLayoutParams(view);
        mCachedStart = mPrimaryOrientation.getDecoratedStart(view);
        if (tparams.mFullSpan)
        {
            panLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(tparams.getViewLayoutPosition());
            if (fullspanitem != null && fullspanitem.mGapDir == -1)
            {
                mCachedStart = mCachedStart - fullspanitem.getGapForSpan(mIndex);
            }
        }
    }

    void clear()
    {
        mViews.clear();
        invalidateCache();
        mDeletedSize = 0;
    }

    public int findFirstCompletelyVisibleItemPosition()
    {
        if (StaggeredGridLayoutManager.access$600(StaggeredGridLayoutManager.this))
        {
            return findOneVisibleChild(mViews.size() - 1, -1, true);
        } else
        {
            return findOneVisibleChild(0, mViews.size(), true);
        }
    }

    public int findFirstVisibleItemPosition()
    {
        if (StaggeredGridLayoutManager.access$600(StaggeredGridLayoutManager.this))
        {
            return findOneVisibleChild(mViews.size() - 1, -1, false);
        } else
        {
            return findOneVisibleChild(0, mViews.size(), false);
        }
    }

    public int findLastCompletelyVisibleItemPosition()
    {
        if (StaggeredGridLayoutManager.access$600(StaggeredGridLayoutManager.this))
        {
            return findOneVisibleChild(0, mViews.size(), true);
        } else
        {
            return findOneVisibleChild(mViews.size() - 1, -1, true);
        }
    }

    public int findLastVisibleItemPosition()
    {
        if (StaggeredGridLayoutManager.access$600(StaggeredGridLayoutManager.this))
        {
            return findOneVisibleChild(0, mViews.size(), false);
        } else
        {
            return findOneVisibleChild(mViews.size() - 1, -1, false);
        }
    }

    int findOneVisibleChild(int i, int j, boolean flag)
    {
        byte byte1 = -1;
        int l = mPrimaryOrientation.getStartAfterPadding();
        int i1 = mPrimaryOrientation.getEndAfterPadding();
        byte byte0;
        if (j > i)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        do
        {
label0:
            {
                View view;
label1:
                {
                    int k = byte1;
                    if (i != j)
                    {
                        view = (View)mViews.get(i);
                        k = mPrimaryOrientation.getDecoratedStart(view);
                        int j1 = mPrimaryOrientation.getDecoratedEnd(view);
                        if (k >= i1 || j1 <= l)
                        {
                            break label0;
                        }
                        if (!flag)
                        {
                            break label1;
                        }
                        if (k < l || j1 > i1)
                        {
                            break label0;
                        }
                        k = getPosition(view);
                    }
                    return k;
                }
                return getPosition(view);
            }
            i += byte0;
        } while (true);
    }

    public int getDeletedSize()
    {
        return mDeletedSize;
    }

    int getEndLine()
    {
        if (mCachedEnd != 0x80000000)
        {
            return mCachedEnd;
        } else
        {
            calculateCachedEnd();
            return mCachedEnd;
        }
    }

    int getEndLine(int i)
    {
        if (mCachedEnd != 0x80000000)
        {
            i = mCachedEnd;
        } else
        if (mViews.size() != 0)
        {
            calculateCachedEnd();
            return mCachedEnd;
        }
        return i;
    }

    tParams getLayoutParams(View view)
    {
        return (tParams)view.getLayoutParams();
    }

    int getNormalizedOffset(int i, int j, int k)
    {
        if (mViews.size() == 0)
        {
            j = 0;
        } else
        if (i < 0)
        {
            k = getEndLine() - k;
            if (k <= 0)
            {
                return 0;
            }
            j = i;
            if (-i > k)
            {
                return -k;
            }
        } else
        {
            j -= getStartLine();
            if (j <= 0)
            {
                return 0;
            }
            if (j < i)
            {
                i = j;
            }
            return i;
        }
        return j;
    }

    int getStartLine()
    {
        if (mCachedStart != 0x80000000)
        {
            return mCachedStart;
        } else
        {
            calculateCachedStart();
            return mCachedStart;
        }
    }

    int getStartLine(int i)
    {
        if (mCachedStart != 0x80000000)
        {
            i = mCachedStart;
        } else
        if (mViews.size() != 0)
        {
            calculateCachedStart();
            return mCachedStart;
        }
        return i;
    }

    void invalidateCache()
    {
        mCachedStart = 0x80000000;
        mCachedEnd = 0x80000000;
    }

    boolean isEmpty(int i, int j)
    {
        int l = mViews.size();
        for (int k = 0; k < l; k++)
        {
            View view = (View)mViews.get(k);
            if (mPrimaryOrientation.getDecoratedStart(view) < j && mPrimaryOrientation.getDecoratedEnd(view) > i)
            {
                return false;
            }
        }

        return true;
    }

    void onOffset(int i)
    {
        if (mCachedStart != 0x80000000)
        {
            mCachedStart = mCachedStart + i;
        }
        if (mCachedEnd != 0x80000000)
        {
            mCachedEnd = mCachedEnd + i;
        }
    }

    void popEnd()
    {
        int i = mViews.size();
        View view = (View)mViews.remove(i - 1);
        tParams tparams = getLayoutParams(view);
        tparams.mSpan = null;
        if (tparams.isItemRemoved() || tparams.isItemChanged())
        {
            mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
        }
        if (i == 1)
        {
            mCachedStart = 0x80000000;
        }
        mCachedEnd = 0x80000000;
    }

    void popStart()
    {
        View view = (View)mViews.remove(0);
        tParams tparams = getLayoutParams(view);
        tparams.mSpan = null;
        if (mViews.size() == 0)
        {
            mCachedEnd = 0x80000000;
        }
        if (tparams.isItemRemoved() || tparams.isItemChanged())
        {
            mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
        }
        mCachedStart = 0x80000000;
    }

    void prependToSpan(View view)
    {
        tParams tparams = getLayoutParams(view);
        tparams.mSpan = this;
        mViews.add(0, view);
        mCachedStart = 0x80000000;
        if (mViews.size() == 1)
        {
            mCachedEnd = 0x80000000;
        }
        if (tparams.isItemRemoved() || tparams.isItemChanged())
        {
            mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
        }
    }

    void setLine(int i)
    {
        mCachedStart = i;
        mCachedEnd = i;
    }


    private tParams(int i)
    {
        this$0 = StaggeredGridLayoutManager.this;
        super();
        mViews = new ArrayList();
        mCachedStart = 0x80000000;
        mCachedEnd = 0x80000000;
        mDeletedSize = 0;
        mIndex = i;
    }

    mIndex(int i, mIndex mindex)
    {
        this(i);
    }
}
