// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.gtp.a.a.b.c;

// Referenced classes of package com.go.weatherex.home.current:
//            PollenIndex

class z extends BroadcastReceiver
{

    final PollenIndex a;

    z(PollenIndex pollenindex)
    {
        a = pollenindex;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        context = intent.getAction();
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA"))
        {
            PollenIndex.a(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DOWNLOAD_PHOTO"))
        {
            context = intent.getStringExtra("extra_photo_path");
            c.a("PollenIndex", (new StringBuilder()).append("download done: ").append(context).toString());
            if (context != null && !TextUtils.isEmpty(context))
            {
                int i = 0;
                while (i < 2) 
                {
                    if (context.equalsIgnoreCase((String)PollenIndex.b(a)[i].getTag()))
                    {
                        try
                        {
                            PollenIndex.b(a)[i].setImageBitmap(BitmapFactory.decodeFile(context, null));
                            com.go.weatherex.home.current.PollenIndex.c(a).setVisibility(0);
                            PollenIndex.d(a)[i].setVisibility(0);
                            c.a("PollenIndex", (new StringBuilder()).append("show: ").append(context).toString());
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Context context)
                        {
                            return;
                        }
                    }
                    i++;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
