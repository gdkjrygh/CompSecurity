// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.core.ui:
//            ToggleButton, ToggleButtonItem

public class _cls2.a
    implements butterknife...ViewInjector
{

    public void inject(butterknife...ViewInjector viewinjector, ToggleButton togglebutton, Object obj)
    {
        togglebutton.mFootnote = (TextView)viewinjector.((View)viewinjector.iredView(obj, 0x7f0e0522, "field 'mFootnote'"), 0x7f0e0522, "field 'mFootnote'");
        View view = (View)viewinjector.iredView(obj, 0x7f0e0520, "field 'mLeftItem' and method 'onLeftButtonClick'");
        togglebutton.mLeftItem = (ToggleButtonItem)viewinjector.(view, 0x7f0e0520, "field 'mLeftItem'");
        view.setOnClickListener(new DebouncingOnClickListener(togglebutton) {

            final ToggleButton a;
            final ToggleButton..ViewInjector b;

            public final void doClick(View view1)
            {
                a.onLeftButtonClick();
            }

            
            {
                b = ToggleButton..ViewInjector.this;
                a = togglebutton;
                super();
            }
        });
        obj = (View)viewinjector.iredView(obj, 0x7f0e0521, "field 'mRightItem' and method 'onRightButtonClick'");
        togglebutton.mRightItem = (ToggleButtonItem)viewinjector.(((View) (obj)), 0x7f0e0521, "field 'mRightItem'");
        ((View) (obj)).setOnClickListener(new DebouncingOnClickListener(togglebutton) {

            final ToggleButton a;
            final ToggleButton..ViewInjector b;

            public final void doClick(View view1)
            {
                a.onRightButtonClick();
            }

            
            {
                b = ToggleButton..ViewInjector.this;
                a = togglebutton;
                super();
            }
        });
    }

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ToggleButton)obj, obj1);
    }

    public void reset(ToggleButton togglebutton)
    {
        togglebutton.mFootnote = null;
        togglebutton.mLeftItem = null;
        togglebutton.mRightItem = null;
    }

    public volatile void reset(Object obj)
    {
        reset((ToggleButton)obj);
    }

    public _cls2.a()
    {
    }
}
