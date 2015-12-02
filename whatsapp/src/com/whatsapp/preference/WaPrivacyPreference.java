// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;

// Referenced classes of package com.whatsapp.preference:
//            WaListPreference

public class WaPrivacyPreference extends WaListPreference
{

    private ProgressBar b;
    private boolean c;

    public WaPrivacyPreference(Context context)
    {
        super(context);
    }

    public WaPrivacyPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(boolean flag)
    {
        c = flag;
        if (b != null)
        {
            ProgressBar progressbar = b;
            int i;
            if (c)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            progressbar.setVisibility(i);
        }
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        b = (ProgressBar)view.findViewById(0x7f0b0274);
        view = b;
        int i;
        if (c)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }
}
