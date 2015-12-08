// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.graphics.drawable.DrawableWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class ListViewCompat extends ListView
{
    private static class GateKeeperDrawable extends DrawableWrapper
    {

        private boolean mEnabled;

        public void draw(Canvas canvas)
        {
            if (mEnabled)
            {
                super.draw(canvas);
            }
        }

        void setEnabled(boolean flag)
        {
            mEnabled = flag;
        }

        public void setHotspot(float f, float f1)
        {
            if (mEnabled)
            {
                super.setHotspot(f, f1);
            }
        }

        public void setHotspotBounds(int i, int j, int k, int l)
        {
            if (mEnabled)
            {
                super.setHotspotBounds(i, j, k, l);
            }
        }

        public boolean setState(int ai[])
        {
            if (mEnabled)
            {
                return super.setState(ai);
            } else
            {
                return false;
            }
        }

        public boolean setVisible(boolean flag, boolean flag1)
        {
            if (mEnabled)
            {
                return super.setVisible(flag, flag1);
            } else
            {
                return false;
            }
        }

        public GateKeeperDrawable(Drawable drawable)
        {
            super(drawable);
            mEnabled = true;
        }
    }


    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private static final int STATE_SET_NOTHING[] = {
        0
    };
    private Field mIsChildViewEnabled;
    int mSelectionBottomPadding;
    int mSelectionLeftPadding;
    int mSelectionRightPadding;
    int mSelectionTopPadding;
    private GateKeeperDrawable mSelector;
    final Rect mSelectorRect;

    public ListViewCompat(Context context)
    {
        this(context, null);
    }

    public ListViewCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ListViewCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSelectorRect = new Rect();
        mSelectionLeftPadding = 0;
        mSelectionTopPadding = 0;
        mSelectionRightPadding = 0;
        mSelectionBottomPadding = 0;
        try
        {
            mIsChildViewEnabled = android/widget/AbsListView.getDeclaredField("mIsChildViewEnabled");
            mIsChildViewEnabled.setAccessible(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }

    protected void drawSelectorCompat(Canvas canvas)
    {
        if (!mSelectorRect.isEmpty())
        {
            Drawable drawable = getSelector();
            if (drawable != null)
            {
                drawable.setBounds(mSelectorRect);
                drawable.draw(canvas);
            }
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        updateSelectorStateCompat();
    }

    public int lookForSelectablePosition(int i, boolean flag)
    {
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && !isInTouchMode()) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        int j;
        int k;
        k = listadapter.getCount();
        if (getAdapter().areAllItemsEnabled())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            i = Math.max(0, i);
            do
            {
                j = i;
                if (i >= k)
                {
                    continue; /* Loop/switch isn't completed */
                }
                j = i;
                if (listadapter.isEnabled(i))
                {
                    continue; /* Loop/switch isn't completed */
                }
                i++;
            } while (true);
        }
        i = Math.min(i, k - 1);
        do
        {
            j = i;
            if (i < 0)
            {
                break;
            }
            j = i;
            if (listadapter.isEnabled(i))
            {
                break;
            }
            i--;
        } while (true);
        if (j < 0 || j >= k) goto _L1; else goto _L3
_L3:
        return j;
        if (i < 0 || i >= k) goto _L1; else goto _L4
_L4:
        return i;
    }

    public int measureHeightOfChildrenCompat(int i, int j, int k, int l, int i1)
    {
        Object obj;
        ListAdapter listadapter;
        int j1;
        j = getListPaddingTop();
        k = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        j1 = getDividerHeight();
        obj = getDivider();
        listadapter = getAdapter();
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        j += k;
_L4:
        return j;
_L2:
        k = j + k;
        int i2;
        int k2;
        if (j1 <= 0 || obj == null)
        {
            j1 = 0;
        }
        j = 0;
        obj = null;
        i2 = 0;
        k2 = listadapter.getCount();
        for (int k1 = 0; k1 < k2;)
        {
            int j2 = listadapter.getItemViewType(k1);
            int l1 = i2;
            if (j2 != i2)
            {
                obj = null;
                l1 = j2;
            }
            obj = listadapter.getView(k1, ((View) (obj)), this);
            android.view.ViewGroup.LayoutParams layoutparams = ((View) (obj)).getLayoutParams();
            if (layoutparams != null && layoutparams.height > 0)
            {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
            } else
            {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            ((View) (obj)).measure(i, i2);
            i2 = k;
            if (k1 > 0)
            {
                i2 = k + j1;
            }
            k = i2 + ((View) (obj)).getMeasuredHeight();
            if (k >= l)
            {
                if (i1 < 0 || k1 <= i1 || j <= 0 || k == l)
                {
                    return l;
                }
                continue; /* Loop/switch isn't completed */
            }
            i2 = j;
            if (i1 >= 0)
            {
                i2 = j;
                if (k1 >= i1)
                {
                    i2 = k;
                }
            }
            k1++;
            j = i2;
            i2 = l1;
        }

        return k;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void positionSelectorCompat(int i, View view)
    {
        Rect rect = mSelectorRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left = rect.left - mSelectionLeftPadding;
        rect.top = rect.top - mSelectionTopPadding;
        rect.right = rect.right + mSelectionRightPadding;
        rect.bottom = rect.bottom + mSelectionBottomPadding;
        boolean flag;
        flag = mIsChildViewEnabled.getBoolean(this);
        if (view.isEnabled() == flag)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        view = mIsChildViewEnabled;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            view.set(this, Boolean.valueOf(flag));
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
            return;
        }
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        refreshDrawableState();
    }

    protected void positionSelectorLikeFocusCompat(int i, View view)
    {
        boolean flag1 = true;
        Drawable drawable = getSelector();
        boolean flag;
        if (drawable != null && i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            drawable.setVisible(false, false);
        }
        positionSelectorCompat(i, view);
        if (flag)
        {
            view = mSelectorRect;
            float f = view.exactCenterX();
            float f1 = view.exactCenterY();
            if (getVisibility() != 0)
            {
                flag1 = false;
            }
            drawable.setVisible(flag1, false);
            DrawableCompat.setHotspot(drawable, f, f1);
        }
    }

    protected void positionSelectorLikeTouchCompat(int i, View view, float f, float f1)
    {
        positionSelectorLikeFocusCompat(i, view);
        view = getSelector();
        if (view != null && i != -1)
        {
            DrawableCompat.setHotspot(view, f, f1);
        }
    }

    public void setSelector(Drawable drawable)
    {
        Object obj;
        if (drawable != null)
        {
            obj = new GateKeeperDrawable(drawable);
        } else
        {
            obj = null;
        }
        mSelector = ((GateKeeperDrawable) (obj));
        super.setSelector(mSelector);
        obj = new Rect();
        if (drawable != null)
        {
            drawable.getPadding(((Rect) (obj)));
        }
        mSelectionLeftPadding = ((Rect) (obj)).left;
        mSelectionTopPadding = ((Rect) (obj)).top;
        mSelectionRightPadding = ((Rect) (obj)).right;
        mSelectionBottomPadding = ((Rect) (obj)).bottom;
    }

    protected void setSelectorEnabled(boolean flag)
    {
        if (mSelector != null)
        {
            mSelector.setEnabled(flag);
        }
    }

    protected boolean shouldShowSelectorCompat()
    {
        return touchModeDrawsInPressedStateCompat() && isPressed();
    }

    protected boolean touchModeDrawsInPressedStateCompat()
    {
        return false;
    }

    protected void updateSelectorStateCompat()
    {
        Drawable drawable = getSelector();
        if (drawable != null && shouldShowSelectorCompat())
        {
            drawable.setState(getDrawableState());
        }
    }

}
