// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.notices;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.a;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.notices:
//            f, d, NoticeDetailActivity, NoticeListFragment

public class NoticeListActivity extends BaseActionBarActivity
    implements f
{

    private boolean b;

    public NoticeListActivity()
    {
    }

    public void a(String s)
    {
        if (b)
        {
            Bundle bundle = new Bundle();
            bundle.putString("item_id", s);
            s = new d();
            s.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(0x7f0f006c, s).commit();
            return;
        } else
        {
            Intent intent = new Intent(this, com/wf/wellsfargomobile/notices/NoticeDetailActivity);
            intent.putExtra("item_id", s);
            startActivity(intent);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040020);
        int i = 0x7f040019;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            i = 0x7f04001a;
        }
        bundle = getLayoutInflater().inflate(i, null);
        a.a(bundle);
        if (findViewById(0x7f0f006c) != null)
        {
            b = true;
            ((NoticeListFragment)getSupportFragmentManager().findFragmentById(0x7f0f006d)).a(true);
            ((NoticeListFragment)getSupportFragmentManager().findFragmentById(0x7f0f006d)).a(0);
            bundle = new Bundle();
            bundle.putString("item_id", "1");
            d d1 = new d();
            d1.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(0x7f0f006c, d1).commit();
        }
        WFApp.a(this, (ImageView)findViewById(0x7f0f0061), null, null, (ImageView)findViewById(0x7f0f0062));
    }
}
