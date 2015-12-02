// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.whatsapp.preference:
//            WaPreference

public class WaPreferenceCategory extends PreferenceCategory
{

    public WaPreferenceCategory(Context context)
    {
        super(context);
    }

    public WaPreferenceCategory(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public WaPreferenceCategory(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return WaPreference.a(super.onCreateView(viewgroup));
    }
}
