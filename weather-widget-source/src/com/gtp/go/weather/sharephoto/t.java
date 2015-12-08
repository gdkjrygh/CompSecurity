// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.ImageView;
import com.gtp.go.weather.sharephoto.d.p;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class t extends BroadcastReceiver
{

    final PhotoDetailActivity a;

    t(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            if (context != null && context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_USER_DATA"))
            {
                context = intent.getStringExtra("extra_user_id");
                intent = intent.getStringExtra("extra_user_gamil");
                PhotoDetailActivity photodetailactivity = a;
                boolean flag;
                if (!TextUtils.isEmpty(context) && !TextUtils.isEmpty(intent))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                PhotoDetailActivity.e(photodetailactivity, flag);
                if (PhotoDetailActivity.c(a) && PhotoDetailActivity.a(a) == 1)
                {
                    PhotoDetailActivity.d(a).setVisibility(0);
                    PhotoDetailActivity.b(a).d();
                    PhotoDetailActivity.z(a);
                }
            }
        }
    }
}
