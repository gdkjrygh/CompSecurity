// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.view.View;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.core.ui:
//            DividerWithText

public class 
    implements butterknife...ViewInjector
{

    public void inject(butterknife...ViewInjector viewinjector, DividerWithText dividerwithtext, Object obj)
    {
        dividerwithtext.mTextViewText = (TextView)viewinjector.mTextViewText((View)viewinjector.dView(obj, 0x7f0e069a, "field 'mTextViewText'"), 0x7f0e069a, "field 'mTextViewText'");
    }

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DividerWithText)obj, obj1);
    }

    public void reset(DividerWithText dividerwithtext)
    {
        dividerwithtext.mTextViewText = null;
    }

    public volatile void reset(Object obj)
    {
        reset((DividerWithText)obj);
    }

    public ()
    {
    }
}
