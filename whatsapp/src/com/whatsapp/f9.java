// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.EditText;
import com.whatsapp.fieldstats.ax;

// Referenced classes of package com.whatsapp:
//            App, DescribeProblemActivity, asw

class f9
    implements android.view.View.OnClickListener
{

    final DescribeProblemActivity a;

    f9(DescribeProblemActivity describeproblemactivity)
    {
        a = describeproblemactivity;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            int i = App.am;
            int j = DescribeProblemActivity.a(a).getText().toString().trim().getBytes().length;
            if (j < 10)
            {
                if (j == 0)
                {
                    App.b(a.getBaseContext(), a.getString(0x7f0e0131), 0);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                App.b(a.getBaseContext(), a.getString(0x7f0e0132), 0);
                if (i == 0)
                {
                    break label0;
                }
            }
            DescribeProblemActivity.f(a).j = DescribeProblemActivity.a(a).getText().toString().trim();
            asw.a(DescribeProblemActivity.e(a), new Void[0]);
        }
    }
}
