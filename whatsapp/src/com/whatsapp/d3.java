// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;

// Referenced classes of package com.whatsapp:
//            du, App, bz

final class d3 extends du
{

    final Activity c;

    d3(Activity activity, int i, Activity activity1)
    {
        c = activity1;
        super(activity, i);
    }

    protected void onCreate(Bundle bundle)
    {
        int i;
label0:
        {
            int j = App.am;
            super.onCreate(bundle);
            bundle = DateFormat.getDateInstance(2);
            if (App.u == 2)
            {
                i = 0x7f0e03e8;
                if (j == 0)
                {
                    break label0;
                }
            }
            if (App.u == 0)
            {
                i = 0x7f0e03ea;
                if (j == 0)
                {
                    break label0;
                }
            }
            i = 0x7f0e03eb;
        }
        bundle = Html.fromHtml(c.getString(i, new Object[] {
            bundle.format(App.aM()), bundle.format(new Date())
        }));
        ((TextView)findViewById(0x7f0b0298)).setText(bundle);
        findViewById(0x7f0b0299).setOnClickListener(new bz(this));
    }
}
