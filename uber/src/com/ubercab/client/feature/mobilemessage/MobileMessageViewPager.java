// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebView;
import com.ubercab.rider.realtime.model.MobileMessageModule;
import efc;
import efi;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.mobilemessage:
//            MobileMessageModuleContentView

public class MobileMessageViewPager extends ViewPager
{

    private MobileMessageViewPager(Context context)
    {
        super(context);
    }

    public MobileMessageViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static MobileMessageViewPager a(Context context, efc efc, String s, MobileMessageModule mobilemessagemodule, Object obj)
    {
        MobileMessageViewPager mobilemessageviewpager = new MobileMessageViewPager(context);
        ArrayList arraylist = new ArrayList();
        List list = mobilemessagemodule.getContent();
        int i;
        int j;
        if (list == null)
        {
            i = 0;
        } else
        {
            i = list.size();
        }
        for (j = 0; j < i; j++)
        {
            arraylist.add(MobileMessageModuleContentView.a(context, efc, s, mobilemessagemodule, obj, j));
        }

        mobilemessageviewpager.setAdapter(new efi(arraylist));
        return mobilemessageviewpager;
    }

    protected void onMeasure(int i, int j)
    {
        float f = getResources().getDisplayMetrics().density;
        j = 0;
        int k;
        int l;
        for (k = 0; j < getChildCount(); k = l)
        {
            View view = getChildAt(j);
            view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int i1 = (int)((float)((WebView)view).getContentHeight() * f);
            l = k;
            if (i1 > k)
            {
                l = i1;
            }
            j++;
        }

        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000));
    }
}
