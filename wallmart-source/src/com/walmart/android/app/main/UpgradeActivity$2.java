// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.walmart.android.util.GooglePlay;

// Referenced classes of package com.walmart.android.app.main:
//            UpgradeActivity

class this._cls0
    implements android.view.er
{

    final UpgradeActivity this$0;

    public void onClick(View view)
    {
        if (UpgradeActivity.access$000(UpgradeActivity.this))
        {
            view = new Intent("android.intent.action.VIEW", Uri.parse("http://m.walmart.com"));
            if (view.resolveActivity(getPackageManager()) != null)
            {
                startActivity(view);
            }
        } else
        {
            new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.walmart.android"));
            if (GooglePlay.isAvailable(UpgradeActivity.this))
            {
                UpgradeActivity.access$100(UpgradeActivity.this, true);
                GooglePlay.launch(UpgradeActivity.this);
                return;
            }
        }
    }

    ()
    {
        this$0 = UpgradeActivity.this;
        super();
    }
}
