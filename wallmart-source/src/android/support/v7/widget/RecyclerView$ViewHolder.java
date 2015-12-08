// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class itemView
{

    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_BOUND = 1;
    static final int FLAG_CHANGED = 64;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    public final View itemView;
    private int mFlags;
    private int mIsRecyclableCount;
    long mItemId;
    int mItemViewType;
    int mOldPosition;
    RecyclerView mOwnerRecyclerView;
    int mPosition;
    int mPreLayoutPosition;
    private mFlags mScrapContainer;
    mFlags mShadowedHolder;
    mFlags mShadowingHolder;

    private boolean doesTransientStatePreventRecycling()
    {
        return (mFlags & 0x10) == 0 && ViewCompat.hasTransientState(itemView);
    }

    private boolean shouldBeKeptAsChild()
    {
        return (mFlags & 0x10) != 0;
    }

    void addFlags(int i)
    {
        mFlags = mFlags | i;
    }

    void clearOldPosition()
    {
        mOldPosition = -1;
        mPreLayoutPosition = -1;
    }

    void clearReturnedFromScrapFlag()
    {
        mFlags = mFlags & 0xffffffdf;
    }

    void clearTmpDetachFlag()
    {
        mFlags = mFlags & 0xfffffeff;
    }

    void flagRemovedAndOffsetPosition(int i, int j, boolean flag)
    {
        addFlags(8);
        offsetPosition(j, flag);
        mPosition = i;
    }

    public final int getAdapterPosition()
    {
        if (mOwnerRecyclerView == null)
        {
            return -1;
        } else
        {
            return RecyclerView.access$4600(mOwnerRecyclerView, this);
        }
    }

    public final long getItemId()
    {
        return mItemId;
    }

    public final int getItemViewType()
    {
        return mItemViewType;
    }

    public final int getLayoutPosition()
    {
        if (mPreLayoutPosition == -1)
        {
            return mPosition;
        } else
        {
            return mPreLayoutPosition;
        }
    }

    public final int getOldPosition()
    {
        return mOldPosition;
    }

    public final int getPosition()
    {
        if (mPreLayoutPosition == -1)
        {
            return mPosition;
        } else
        {
            return mPreLayoutPosition;
        }
    }

    boolean hasAnyOfTheFlags(int i)
    {
        return (mFlags & i) != 0;
    }

    boolean isAdapterPositionUnknown()
    {
        return (mFlags & 0x200) != 0 || isInvalid();
    }

    boolean isBound()
    {
        return (mFlags & 1) != 0;
    }

    boolean isChanged()
    {
        return (mFlags & 0x40) != 0;
    }

    boolean isInvalid()
    {
        return (mFlags & 4) != 0;
    }

    public final boolean isRecyclable()
    {
        return (mFlags & 0x10) == 0 && !ViewCompat.hasTransientState(itemView);
    }

    boolean isRemoved()
    {
        return (mFlags & 8) != 0;
    }

    boolean isScrap()
    {
        return mScrapContainer != null;
    }

    boolean isTmpDetached()
    {
        return (mFlags & 0x100) != 0;
    }

    boolean needsUpdate()
    {
        return (mFlags & 2) != 0;
    }

    void offsetPosition(int i, boolean flag)
    {
        if (mOldPosition == -1)
        {
            mOldPosition = mPosition;
        }
        if (mPreLayoutPosition == -1)
        {
            mPreLayoutPosition = mPosition;
        }
        if (flag)
        {
            mPreLayoutPosition = mPreLayoutPosition + i;
        }
        mPosition = mPosition + i;
        if (itemView.getLayoutParams() != null)
        {
            ((s)itemView.getLayoutParams()).mInsetsDirty = true;
        }
    }

    void resetInternal()
    {
        mFlags = 0;
        mPosition = -1;
        mOldPosition = -1;
        mItemId = -1L;
        mPreLayoutPosition = -1;
        mIsRecyclableCount = 0;
        mShadowedHolder = null;
        mShadowingHolder = null;
    }

    void saveOldPosition()
    {
        if (mOldPosition == -1)
        {
            mOldPosition = mPosition;
        }
    }

    void setFlags(int i, int j)
    {
        mFlags = mFlags & ~j | i & j;
    }

    public final void setIsRecyclable(boolean flag)
    {
        int i;
        if (flag)
        {
            i = mIsRecyclableCount - 1;
        } else
        {
            i = mIsRecyclableCount + 1;
        }
        mIsRecyclableCount = i;
        if (mIsRecyclableCount < 0)
        {
            mIsRecyclableCount = 0;
            Log.e("View", (new StringBuilder()).append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this).toString());
        } else
        {
            if (!flag && mIsRecyclableCount == 1)
            {
                mFlags = mFlags | 0x10;
                return;
            }
            if (flag && mIsRecyclableCount == 0)
            {
                mFlags = mFlags & 0xffffffef;
                return;
            }
        }
    }

    void setScrapContainer(mFlags mflags)
    {
        mScrapContainer = mflags;
    }

    boolean shouldIgnore()
    {
        return (mFlags & 0x80) != 0;
    }

    void stopIgnoring()
    {
        mFlags = mFlags & 0xffffff7f;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append("ViewHolder{").append(Integer.toHexString(hashCode())).append(" position=").append(mPosition).append(" id=").append(mItemId).append(", oldPos=").append(mOldPosition).append(", pLpos:").append(mPreLayoutPosition).toString());
        if (isScrap())
        {
            stringbuilder.append(" scrap");
        }
        if (isInvalid())
        {
            stringbuilder.append(" invalid");
        }
        if (!isBound())
        {
            stringbuilder.append(" unbound");
        }
        if (needsUpdate())
        {
            stringbuilder.append(" update");
        }
        if (isRemoved())
        {
            stringbuilder.append(" removed");
        }
        if (shouldIgnore())
        {
            stringbuilder.append(" ignored");
        }
        if (isChanged())
        {
            stringbuilder.append(" changed");
        }
        if (isTmpDetached())
        {
            stringbuilder.append(" tmpDetached");
        }
        if (!isRecyclable())
        {
            stringbuilder.append((new StringBuilder()).append(" not recyclable(").append(mIsRecyclableCount).append(")").toString());
        }
        if (isAdapterPositionUnknown())
        {
            stringbuilder.append("undefined adapter position");
        }
        if (itemView.getParent() == null)
        {
            stringbuilder.append(" no parent");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    void unScrap()
    {
        mScrapContainer.scrapView(this);
    }

    boolean wasReturnedFromScrap()
    {
        return (mFlags & 0x20) != 0;
    }



/*
    static s access$4102(s s, s s1)
    {
        s.mScrapContainer = s1;
        return s1;
    }

*/



    public mScrapContainer(View view)
    {
        mPosition = -1;
        mOldPosition = -1;
        mItemId = -1L;
        mItemViewType = -1;
        mPreLayoutPosition = -1;
        mShadowedHolder = null;
        mShadowingHolder = null;
        mIsRecyclableCount = 0;
        mScrapContainer = null;
        if (view == null)
        {
            throw new IllegalArgumentException("itemView may not be null");
        } else
        {
            itemView = view;
            return;
        }
    }
}
