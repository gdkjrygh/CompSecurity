// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

// Referenced classes of package com.go.weatherex.viewex:
//            k

public class CityNameSwitcher extends ViewSwitcher
{

    public CityNameSwitcher(Context context)
    {
        super(context);
    }

    public CityNameSwitcher(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(CharSequence charsequence, boolean flag)
    {
        k k1 = (k)getNextView();
        k1.c.setText(charsequence);
        charsequence = k1.b;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        charsequence.setVisibility(i);
        showNext();
    }

    public void a(boolean flag)
    {
        ImageView imageview = ((k)getCurrentView()).a;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    public void b(CharSequence charsequence, boolean flag)
    {
        k k1 = (k)getCurrentView();
        k1.c.setText(charsequence);
        charsequence = k1.b;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        charsequence.setVisibility(i);
    }
}
