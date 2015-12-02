// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.mvc.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.ubercab.core.support.v7.app.CoreActionBarActivity;
import gpz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class MvcActivity extends CoreActionBarActivity
{

    private final List a = new ArrayList();
    private gpz b;

    public MvcActivity()
    {
    }

    public abstract gpz c();

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
        b = c();
        b.a((ViewGroup)findViewById(0x1020002), bundle);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
        b.e();
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            NavUtils.navigateUpFromSameTask(this);
            break;
        }
        return true;
    }

    protected void onPause()
    {
        super.onPause();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    protected void onResume()
    {
        super.onResume();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
        b.a(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    protected void onStop()
    {
        super.onStop();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }
}
