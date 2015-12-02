// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.whatsapp.preference:
//            WaPreference

public class WaListPreference extends ListPreference
{

    public static boolean a;

    public WaListPreference(Context context)
    {
        super(context);
    }

    public WaListPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return WaPreference.a(super.onCreateView(viewgroup));
    }
}
