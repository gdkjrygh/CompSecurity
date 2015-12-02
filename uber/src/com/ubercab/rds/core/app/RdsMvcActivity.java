// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.app;

import android.content.Context;
import android.view.MenuItem;
import com.ubercab.mvc.app.MvcActivity;
import ijm;

public abstract class RdsMvcActivity extends MvcActivity
{

    public RdsMvcActivity()
    {
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(ijm.a(context));
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }
}
