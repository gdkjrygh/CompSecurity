// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.notices;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.wf.wellsfargomobile.BaseActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.a.a;

// Referenced classes of package com.wf.wellsfargomobile.notices:
//            NoticeActivity

public class InfoActivity extends BaseActivity
{

    public InfoActivity()
    {
    }

    public void closeViewAsDialog(View view)
    {
        finish();
        overridePendingTransition(0x7f05000d, 0x7f05000f);
    }

    public void onBackPressed()
    {
        closeViewAsDialog(null);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setFinishOnTouchOutside(false);
        }
        setContentView(0x7f040035);
        bundle = Typeface.createFromAsset(getAssets(), "fonts/02520_Arial2.ttf");
        Object obj = Typeface.createFromAsset(getAssets(), "fonts/02534_ArialFett2.ttf");
        ((TextView)findViewById(0x7f0f0099)).setTypeface(((Typeface) (obj)));
        ((TextView)findViewById(0x7f0f009b)).setTypeface(bundle);
        obj = (TextView)findViewById(0x7f0f009c);
        ((TextView) (obj)).setText(WFApp.X());
        ((TextView) (obj)).setTypeface(bundle);
        ((TextView)findViewById(0x7f0f009e)).setTypeface(bundle);
        obj = (TextView)findViewById(0x7f0f0096);
        ((TextView) (obj)).setTypeface(bundle);
        ((TextView) (obj)).setText(a.j());
        ((TextView)findViewById(0x7f0f00a0)).setTypeface(bundle);
        obj = (TextView)findViewById(0x7f0f0097);
        ((TextView) (obj)).setTypeface(bundle);
        ((TextView) (obj)).setText(a.k());
        ((TextView)findViewById(0x7f0f00a2)).setTypeface(bundle);
        ((TextView)findViewById(0x7f0f00a4)).setTypeface(bundle);
    }

    public void showLegalNotices(View view)
    {
        startActivity(new Intent(this, com/wf/wellsfargomobile/notices/NoticeActivity));
        finish();
        overridePendingTransition(0x7f050010, 0x7f05000d);
    }
}
