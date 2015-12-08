// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.notices;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v7.app.a;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.notices:
//            d, NoticeListActivity

public class NoticeDetailActivity extends BaseActionBarActivity
{

    public NoticeDetailActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001f);
        a a1 = getSupportActionBar();
        a1.d(false);
        a1.a(false);
        a1.b(false);
        a1.c(false);
        a1.e(true);
        int i = 0x7f040019;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            i = 0x7f04001a;
        }
        a1.a(getLayoutInflater().inflate(i, null));
        if (bundle == null)
        {
            bundle = new Bundle();
            bundle.putString("item_id", getIntent().getStringExtra("item_id"));
            d d1 = new d();
            d1.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(0x7f0f006c, d1).commit();
        }
        WFApp.a(this, (ImageView)findViewById(0x7f0f0061), null, null, (ImageView)findViewById(0x7f0f0062));
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            NavUtils.navigateUpTo(this, new Intent(this, com/wf/wellsfargomobile/notices/NoticeListActivity));
            break;
        }
        return true;
    }
}
