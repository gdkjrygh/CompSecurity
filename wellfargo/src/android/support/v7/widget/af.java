// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v7.a.b;
import android.support.v7.internal.widget.aj;
import android.view.MotionEvent;
import android.view.View;

class af extends aj
{

    private boolean f;
    private boolean g;
    private boolean h;
    private ViewPropertyAnimatorCompat i;
    private ListViewAutoScrollHelper j;

    public af(Context context, boolean flag)
    {
        super(context, null, b.dropDownListViewStyle);
        g = flag;
        setCacheColorHint(0);
    }

    private void a(View view, int k)
    {
        performItemClick(view, k, getItemIdAtPosition(k));
    }

    private void a(View view, int k, float f1, float f2)
    {
        h = true;
        setPressed(true);
        layoutChildren();
        setSelection(k);
        a(k, view, f1, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    static boolean a(af af1, boolean flag)
    {
        af1.f = flag;
        return flag;
    }

    private void d()
    {
        h = false;
        setPressed(false);
        drawableStateChanged();
        if (i != null)
        {
            i.cancel();
            i = null;
        }
    }

    public boolean a(MotionEvent motionevent, int k)
    {
        int l = MotionEventCompat.getActionMasked(motionevent);
        l;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 108
    //                   2 227
    //                   3 100;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_227;
_L1:
        boolean flag;
        k = 0;
        flag = true;
_L7:
        if (!flag || k != 0)
        {
            d();
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        if (j == null)
        {
            j = new ListViewAutoScrollHelper(this);
        }
        j.setEnabled(true);
        j.onTouch(this, motionevent);
_L9:
        return flag;
_L4:
        k = 0;
        flag = false;
          goto _L7
_L2:
        flag = false;
_L10:
        int i1;
        int j1;
        i1 = motionevent.findPointerIndex(k);
        if (i1 < 0)
        {
            k = 0;
            flag = false;
        } else
        {
label0:
            {
                k = (int)motionevent.getX(i1);
                i1 = (int)motionevent.getY(i1);
                j1 = pointToPosition(k, i1);
                if (j1 != -1)
                {
                    break label0;
                }
                k = 1;
            }
        }
          goto _L7
        View view = getChildAt(j1 - getFirstVisiblePosition());
        a(view, j1, k, i1);
        if (l == 1)
        {
            a(view, j1);
        }
          goto _L1
_L6:
        if (j == null) goto _L9; else goto _L8
_L8:
        j.setEnabled(false);
        return flag;
        flag = true;
          goto _L10
    }

    protected boolean c()
    {
        return h || super.c();
    }

    public boolean hasFocus()
    {
        return g || super.hasFocus();
    }

    public boolean hasWindowFocus()
    {
        return g || super.hasWindowFocus();
    }

    public boolean isFocused()
    {
        return g || super.isFocused();
    }

    public boolean isInTouchMode()
    {
        return g && f || super.isInTouchMode();
    }
}
