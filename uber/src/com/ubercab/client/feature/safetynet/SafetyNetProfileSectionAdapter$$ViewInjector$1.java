// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetProfileSectionAdapter

final class a extends DebouncingOnClickListener
{

    final SafetyNetProfileSectionAdapter a;
    final  b;

    public final void doClick(View view)
    {
        a.onClickSafetyNet();
    }

    Y(Y y, SafetyNetProfileSectionAdapter safetynetprofilesectionadapter)
    {
        b = y;
        a = safetynetprofilesectionadapter;
        super();
    }
}
