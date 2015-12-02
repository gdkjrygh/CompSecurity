// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ubercab.rider.realtime.model.MobileMessageDisplayProperties;
import com.ubercab.rider.realtime.model.MobileMessageModule;
import com.ubercab.ui.PagerIndicator;
import efc;
import efe;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.mobilemessage:
//            MobileMessageViewPager, MobileMessageModuleContentView

public class MobileMessageModuleView extends LinearLayout
    implements efc
{

    private final Set a;
    private efe b;
    private MobileMessageModule c;
    private String d;

    public MobileMessageModuleView(Context context)
    {
        this(context, null);
    }

    public MobileMessageModuleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MobileMessageModuleView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new HashSet();
        setOrientation(1);
    }

    private PagerIndicator a(ViewPager viewpager)
    {
        int i = getResources().getDimensionPixelSize(0x7f0802da);
        PagerIndicator pagerindicator = new PagerIndicator(getContext());
        pagerindicator.a(viewpager);
        pagerindicator.setPadding(i, i, i, i);
        return pagerindicator;
    }

    public final String a()
    {
        return d;
    }

    public final void a(int i)
    {
        a.add(Integer.valueOf(i));
        List list = c.getContent();
        if (list == null)
        {
            i = 0;
        } else
        {
            i = list.size();
        }
        if (a.size() == i && b != null)
        {
            b.e_();
        }
    }

    public final void a(efe efe1)
    {
        b = efe1;
    }

    public final void a(String s)
    {
        if (b != null)
        {
            b.a(s);
        }
    }

    public final void a(String s, MobileMessageModule mobilemessagemodule, Object obj)
    {
        d = s;
        c = mobilemessagemodule;
        a.clear();
        removeAllViews();
        boolean flag;
        if (mobilemessagemodule.getDisplayProps() != null && mobilemessagemodule.getDisplayProps().getShowPageControlIndicator() != null)
        {
            flag = mobilemessagemodule.getDisplayProps().getShowPageControlIndicator().booleanValue();
        } else
        {
            flag = false;
        }
        if (flag)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            s = MobileMessageViewPager.a(getContext(), this, s, mobilemessagemodule, obj);
            addView(s, layoutparams);
            addView(a(((ViewPager) (s))), layoutparams);
        } else
        {
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
            j = 0;
            while (j < i) 
            {
                addView(MobileMessageModuleContentView.a(getContext(), this, s, mobilemessagemodule, obj, j), new android.widget.LinearLayout.LayoutParams(-1, -2));
                j++;
            }
        }
    }
}
