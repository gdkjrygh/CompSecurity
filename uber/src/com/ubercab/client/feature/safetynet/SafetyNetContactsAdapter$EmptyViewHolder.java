// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.view.View;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetContactsAdapter

class a
{

    final SafetyNetContactsAdapter a;
    TextView mTextViewEmpty;

    public (SafetyNetContactsAdapter safetynetcontactsadapter, View view)
    {
        a = safetynetcontactsadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
