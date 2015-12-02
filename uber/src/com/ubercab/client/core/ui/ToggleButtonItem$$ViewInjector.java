// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.view.View;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.core.ui:
//            ToggleButtonItem

public class 
    implements butterknife...ViewInjector
{

    public void inject(butterknife...ViewInjector viewinjector, ToggleButtonItem togglebuttonitem, Object obj)
    {
        togglebuttonitem.mTitle = (TextView)viewinjector.mTitle((View)viewinjector.View(obj, 0x7f0e0523, "field 'mTitle'"), 0x7f0e0523, "field 'mTitle'");
        togglebuttonitem.mTagline = (TextView)viewinjector.mTagline((View)viewinjector.View(obj, 0x7f0e0524, "field 'mTagline'"), 0x7f0e0524, "field 'mTagline'");
    }

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ToggleButtonItem)obj, obj1);
    }

    public void reset(ToggleButtonItem togglebuttonitem)
    {
        togglebuttonitem.mTitle = null;
        togglebuttonitem.mTagline = null;
    }

    public volatile void reset(Object obj)
    {
        reset((ToggleButtonItem)obj);
    }

    public ()
    {
    }
}
