// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompat, AccessibilityNodeInfoCompat

static interface 
{

    public abstract int getAddedCount(Object obj);

    public abstract CharSequence getBeforeText(Object obj);

    public abstract CharSequence getClassName(Object obj);

    public abstract CharSequence getContentDescription(Object obj);

    public abstract int getCurrentItemIndex(Object obj);

    public abstract int getFromIndex(Object obj);

    public abstract int getItemCount(Object obj);

    public abstract int getMaxScrollX(Object obj);

    public abstract int getMaxScrollY(Object obj);

    public abstract Parcelable getParcelableData(Object obj);

    public abstract int getRemovedCount(Object obj);

    public abstract int getScrollX(Object obj);

    public abstract int getScrollY(Object obj);

    public abstract AccessibilityNodeInfoCompat getSource(Object obj);

    public abstract List getText(Object obj);

    public abstract int getToIndex(Object obj);

    public abstract int getWindowId(Object obj);

    public abstract boolean isChecked(Object obj);

    public abstract boolean isEnabled(Object obj);

    public abstract boolean isFullScreen(Object obj);

    public abstract boolean isPassword(Object obj);

    public abstract boolean isScrollable(Object obj);

    public abstract Object obtain();

    public abstract Object obtain(Object obj);

    public abstract void recycle(Object obj);

    public abstract void setAddedCount(Object obj, int i);

    public abstract void setBeforeText(Object obj, CharSequence charsequence);

    public abstract void setChecked(Object obj, boolean flag);

    public abstract void setClassName(Object obj, CharSequence charsequence);

    public abstract void setContentDescription(Object obj, CharSequence charsequence);

    public abstract void setCurrentItemIndex(Object obj, int i);

    public abstract void setEnabled(Object obj, boolean flag);

    public abstract void setFromIndex(Object obj, int i);

    public abstract void setFullScreen(Object obj, boolean flag);

    public abstract void setItemCount(Object obj, int i);

    public abstract void setMaxScrollX(Object obj, int i);

    public abstract void setMaxScrollY(Object obj, int i);

    public abstract void setParcelableData(Object obj, Parcelable parcelable);

    public abstract void setPassword(Object obj, boolean flag);

    public abstract void setRemovedCount(Object obj, int i);

    public abstract void setScrollX(Object obj, int i);

    public abstract void setScrollY(Object obj, int i);

    public abstract void setScrollable(Object obj, boolean flag);

    public abstract void setSource(Object obj, View view);

    public abstract void setSource(Object obj, View view, int i);

    public abstract void setToIndex(Object obj, int i);
}
