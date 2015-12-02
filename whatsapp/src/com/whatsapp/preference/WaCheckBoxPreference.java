// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.whatsapp.preference:
//            WaPreference

public class WaCheckBoxPreference extends CheckBoxPreference
{

    public WaCheckBoxPreference(Context context)
    {
        super(context);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return WaPreference.a(super.onCreateView(viewgroup));
    }
}
