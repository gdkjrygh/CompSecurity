// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.a;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.wf.wellsfargomobile.notices.NoticeListActivity;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseActionBarActivity, WFApp

public class InfoActivity extends BaseActionBarActivity
{

    public InfoActivity()
    {
    }

    public void onClickInfoDoneButton(View view)
    {
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        int i = 0x7f040019;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            i = 0x7f04001a;
        }
        bundle = getLayoutInflater().inflate(i, null);
        a.a(bundle);
        setContentView(0x7f04005f);
        com.wf.wellsfargomobile.WFApp.a(this, (ImageView)findViewById(0x7f0f0061), null, null, (ImageView)findViewById(0x7f0f0062));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100001, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0f0125)
        {
            startActivity(new Intent(this, com/wf/wellsfargomobile/notices/NoticeListActivity));
            return true;
        } else
        {
            return false;
        }
    }
}
