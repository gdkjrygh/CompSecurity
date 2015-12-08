// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.WindowCallbackWrapper;
import android.support.v7.internal.widget.DecorToolbar;
import android.view.Menu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.app:
//            ToolbarActionBar

private class this._cls0 extends WindowCallbackWrapper
{

    final ToolbarActionBar this$0;

    public View onCreatePanelView(int i)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 26;
           goto _L1 _L2
_L1:
        Menu menu;
        return super.onCreatePanelView(i);
_L2:
        if (onPreparePanel(i, null, menu = ToolbarActionBar.access$300(ToolbarActionBar.this).getMenu()) && onMenuOpened(i, menu))
        {
            return ToolbarActionBar.access$400(ToolbarActionBar.this, menu);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        boolean flag = super.onPreparePanel(i, view, menu);
        if (flag && !ToolbarActionBar.access$200(ToolbarActionBar.this))
        {
            ToolbarActionBar.access$300(ToolbarActionBar.this).setMenuPrepared();
            ToolbarActionBar.access$202(ToolbarActionBar.this, true);
        }
        return flag;
    }

    public (android.view.barCallbackWrapper barcallbackwrapper)
    {
        this$0 = ToolbarActionBar.this;
        super(barcallbackwrapper);
    }
}
