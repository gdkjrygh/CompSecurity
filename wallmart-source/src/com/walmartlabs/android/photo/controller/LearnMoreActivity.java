// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import com.walmartlabs.android.photo.view.SystemBarTintHelper;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            PhotoAppCompatActivity

public class LearnMoreActivity extends PhotoAppCompatActivity
{

    public LearnMoreActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.walmartlabs.android.photo.R.layout.photo_activity_learn_more);
        getSupportActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_faq));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        SystemBarTintHelper.enableTint(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }
}
