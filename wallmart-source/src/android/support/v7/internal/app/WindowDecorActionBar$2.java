// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.app:
//            WindowDecorActionBar

class pter extends ViewPropertyAnimatorListenerAdapter
{

    final WindowDecorActionBar this$0;

    public void onAnimationEnd(View view)
    {
        WindowDecorActionBar.access$502(WindowDecorActionBar.this, null);
        WindowDecorActionBar.access$200(WindowDecorActionBar.this).requestLayout();
    }

    pter()
    {
        this$0 = WindowDecorActionBar.this;
        super();
    }
}
