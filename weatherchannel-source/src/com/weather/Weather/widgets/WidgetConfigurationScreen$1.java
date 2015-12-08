// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package com.weather.Weather.widgets:
//            WidgetConfigurationScreen

class val.item
    implements android.view.rationScreen._cls1
{

    final WidgetConfigurationScreen this$0;
    final MenuItem val$item;
    final Menu val$menu;

    public void onClick(View view)
    {
        val$menu.performIdentifierAction(val$item.getItemId(), 0);
    }

    ()
    {
        this$0 = final_widgetconfigurationscreen;
        val$menu = menu1;
        val$item = MenuItem.this;
        super();
    }
}
