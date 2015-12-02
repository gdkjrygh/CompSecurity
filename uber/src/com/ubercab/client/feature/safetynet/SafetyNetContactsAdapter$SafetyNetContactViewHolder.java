// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cev;
import com.ubercab.client.core.model.SafetyNetContact;
import com.ubercab.ui.TextView;
import ffe;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetContactsAdapter

class a
{

    final SafetyNetContactsAdapter a;
    private SafetyNetContact b;
    CheckBox mCheckBoxIsInvited;
    ImageButton mImageRemove;
    ImageView mImageViewPicture;
    TextView mTextViewName;
    TextView mTextViewNumber;

    final void a(SafetyNetContact safetynetcontact)
    {
        b = safetynetcontact;
    }

    void onClickRemove()
    {
        SafetyNetContactsAdapter.a(a).c(new ffe(b));
    }

    public (SafetyNetContactsAdapter safetynetcontactsadapter, View view)
    {
        a = safetynetcontactsadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
