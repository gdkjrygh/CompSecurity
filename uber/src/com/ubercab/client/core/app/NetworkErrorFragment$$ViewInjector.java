// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.app;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.internal.DebouncingOnClickListener;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.core.app:
//            NetworkErrorFragment

public class _cls2.a
    implements butterknife.t..ViewInjector
{

    public void inject(butterknife.t..ViewInjector viewinjector, NetworkErrorFragment networkerrorfragment, Object obj)
    {
        networkerrorfragment.mLayoutButtons = (LinearLayout)viewinjector.mLayoutButtons((View)viewinjector.(obj, 0x7f0e046f, "field 'mLayoutButtons'"), 0x7f0e046f, "field 'mLayoutButtons'");
        networkerrorfragment.mProgressBarRetrying = (ProgressBar)viewinjector.mProgressBarRetrying((View)viewinjector.(obj, 0x7f0e046e, "field 'mProgressBarRetrying'"), 0x7f0e046e, "field 'mProgressBarRetrying'");
        View view = (View)viewinjector.(obj, 0x7f0e0471, "field 'mTextViewSignOut' and method 'onClickButtonSignOut'");
        networkerrorfragment.mTextViewSignOut = (TextView)viewinjector.mTextViewSignOut(view, 0x7f0e0471, "field 'mTextViewSignOut'");
        view.setOnClickListener(new DebouncingOnClickListener(networkerrorfragment) {

            final NetworkErrorFragment a;
            final NetworkErrorFragment..ViewInjector b;

            public final void doClick(View view1)
            {
                a.onClickButtonSignOut();
            }

            
            {
                b = NetworkErrorFragment..ViewInjector.this;
                a = networkerrorfragment;
                super();
            }
        });
        ((View)viewinjector.(obj, 0x7f0e0470, "method 'onClickButtonRetry'")).setOnClickListener(new DebouncingOnClickListener(networkerrorfragment) {

            final NetworkErrorFragment a;
            final NetworkErrorFragment..ViewInjector b;

            public final void doClick(View view1)
            {
                a.onClickButtonRetry();
            }

            
            {
                b = NetworkErrorFragment..ViewInjector.this;
                a = networkerrorfragment;
                super();
            }
        });
    }

    public volatile void inject(butterknife.t..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (NetworkErrorFragment)obj, obj1);
    }

    public void reset(NetworkErrorFragment networkerrorfragment)
    {
        networkerrorfragment.mLayoutButtons = null;
        networkerrorfragment.mProgressBarRetrying = null;
        networkerrorfragment.mTextViewSignOut = null;
    }

    public volatile void reset(Object obj)
    {
        reset((NetworkErrorFragment)obj);
    }

    public _cls2.a()
    {
    }
}
