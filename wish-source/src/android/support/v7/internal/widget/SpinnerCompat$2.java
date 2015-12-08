// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat

class this._cls0
    implements android.view..OnGlobalLayoutListener
{

    final SpinnerCompat this$0;

    public void onGlobalLayout()
    {
        if (!SpinnerCompat.access$100(SpinnerCompat.this).isShowing())
        {
            SpinnerCompat.access$100(SpinnerCompat.this).show();
        }
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(this);
        }
    }

    innerPopup()
    {
        this$0 = SpinnerCompat.this;
        super();
    }
}
