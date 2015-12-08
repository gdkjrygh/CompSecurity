// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.view.View;

// Referenced classes of package com.walmartlabs.payment.view:
//            SlidingUpPanelLayout, ViewDragHelper

private class <init> extends <init>
{

    final SlidingUpPanelLayout this$0;

    public int clampViewPositionVertical(View view, int i, int j)
    {
        j = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this, 0.0F);
        int k = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this, 1.0F);
        if (SlidingUpPanelLayout.access$1000(SlidingUpPanelLayout.this))
        {
            return Math.min(Math.max(i, k), j);
        } else
        {
            return Math.min(Math.max(i, j), k);
        }
    }

    public int getViewVerticalDragRange(View view)
    {
        return SlidingUpPanelLayout.access$1200(SlidingUpPanelLayout.this);
    }

    public void onViewCaptured(View view, int i)
    {
        setAllChildrenVisible();
    }

    public void onViewDragStateChanged(int i)
    {
        if (SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this).getViewDragState() != 0) goto _L2; else goto _L1
_L1:
        SlidingUpPanelLayout.access$602(SlidingUpPanelLayout.this, SlidingUpPanelLayout.access$700(SlidingUpPanelLayout.this, SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this).getTop()));
        SlidingUpPanelLayout.access$800(SlidingUpPanelLayout.this);
        if (SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this) != 1.0F) goto _L4; else goto _L3
_L3:
        if (SlidingUpPanelLayout.access$100(SlidingUpPanelLayout.this) != )
        {
            updateObscuredViewVisibility();
            SlidingUpPanelLayout.access$102(SlidingUpPanelLayout.this, );
            dispatchOnPanelExpanded(SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this));
        }
_L2:
        return;
_L4:
        if (SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this) != 0.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        if (SlidingUpPanelLayout.access$100(SlidingUpPanelLayout.this) != D)
        {
            SlidingUpPanelLayout.access$102(SlidingUpPanelLayout.this, D);
            dispatchOnPanelCollapsed(SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this));
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this) < 0.0F)
        {
            SlidingUpPanelLayout.access$102(SlidingUpPanelLayout.this, this._fld0);
            SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this).setVisibility(4);
            dispatchOnPanelHidden(SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this));
            return;
        }
        if (SlidingUpPanelLayout.access$100(SlidingUpPanelLayout.this) != )
        {
            updateObscuredViewVisibility();
            SlidingUpPanelLayout.access$102(SlidingUpPanelLayout.this, );
            dispatchOnPanelAnchored(SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this));
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onViewPositionChanged(View view, int i, int j, int k, int l)
    {
        SlidingUpPanelLayout.access$900(SlidingUpPanelLayout.this, j);
        invalidate();
    }

    public void onViewReleased(View view, float f, float f1)
    {
        int i;
        if (SlidingUpPanelLayout.access$1000(SlidingUpPanelLayout.this))
        {
            f = -f1;
        } else
        {
            f = f1;
        }
        if (f > 0.0F && SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this) <= SlidingUpPanelLayout.access$200(SlidingUpPanelLayout.this))
        {
            i = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this, SlidingUpPanelLayout.access$200(SlidingUpPanelLayout.this));
        } else
        if (f > 0.0F && SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this) > SlidingUpPanelLayout.access$200(SlidingUpPanelLayout.this))
        {
            i = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this, 1.0F);
        } else
        if (f < 0.0F && SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this) >= SlidingUpPanelLayout.access$200(SlidingUpPanelLayout.this))
        {
            i = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this, SlidingUpPanelLayout.access$200(SlidingUpPanelLayout.this));
        } else
        if (f < 0.0F && SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this) < SlidingUpPanelLayout.access$200(SlidingUpPanelLayout.this))
        {
            i = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this, 0.0F);
        } else
        if (SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this) >= (SlidingUpPanelLayout.access$200(SlidingUpPanelLayout.this) + 1.0F) / 2.0F)
        {
            i = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this, 1.0F);
        } else
        if (SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this) >= SlidingUpPanelLayout.access$200(SlidingUpPanelLayout.this) / 2.0F)
        {
            i = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this, SlidingUpPanelLayout.access$200(SlidingUpPanelLayout.this));
        } else
        {
            i = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this, 0.0F);
        }
        SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this).settleCapturedViewAt(view.getLeft(), i);
        invalidate();
    }

    public boolean tryCaptureView(View view, int i)
    {
        while (SlidingUpPanelLayout.access$300(SlidingUpPanelLayout.this) || view != SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this)) 
        {
            return false;
        }
        return true;
    }

    private ()
    {
        this$0 = SlidingUpPanelLayout.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
