// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.photobillpay:
//            u, PhotoBillPayScanActivity

public class PhotoBillPayPhotoTipsActivity extends BaseActionBarActivity
    implements android.view.View.OnClickListener
{

    private Button b;
    private Button c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;

    public PhotoBillPayPhotoTipsActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        setResult(j, intent);
        finish();
    }

    public void onClick(View view)
    {
        if (view == b)
        {
            setResult(0, new Intent());
            finish();
        } else
        if (view == c)
        {
            com.wf.wellsfargomobile.photobillpay.u.a();
            view = new Intent(this, com/wf/wellsfargomobile/photobillpay/PhotoBillPayScanActivity);
            view.putExtra("activitySource", d);
            view.putExtra("timoutSeconds", g);
            view.putExtra("responseWaitTimoutSeconds", h);
            view.putExtra("actionMethod", e);
            view.putExtra("callBackFunctionName", f);
            startActivityForResult(view, 120);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        updateUserLocale();
        int i = 0x7f040019;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            i = 0x7f04001a;
        }
        bundle = getLayoutInflater().inflate(i, null);
        a.a(bundle);
        setContentView(0x7f04004d);
        WFApp.a(this, (ImageView)findViewById(0x7f0f0061), null, null, (ImageView)findViewById(0x7f0f0062));
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            d = bundle.getString("activitySource");
            e = bundle.getString("actionMethod");
            g = bundle.getLong("timoutSeconds");
            h = bundle.getLong("responseWaitTimoutSeconds");
            f = bundle.getString("callBackFunctionName");
        }
        b = (Button)findViewById(0x7f0f00f6);
        c = (Button)findViewById(0x7f0f00f7);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
    }
}
