// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import com.walmartlabs.ui.FloatLabel;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            TransferRxPrescriptionInfoPresenter

class this._cls0
    implements android.widget.onInfoPresenter._cls1
{

    final TransferRxPrescriptionInfoPresenter this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag = ((String)adapterview.getAdapter().getItem(i)).equals(TransferRxPrescriptionInfoPresenter.access$100(TransferRxPrescriptionInfoPresenter.this));
        adapterview = TransferRxPrescriptionInfoPresenter.access$200(TransferRxPrescriptionInfoPresenter.this);
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        adapterview.setVisibility(i);
        if (flag)
        {
            TransferRxPrescriptionInfoPresenter.access$200(TransferRxPrescriptionInfoPresenter.this).requestFocus();
        }
        TransferRxPrescriptionInfoPresenter.access$300(TransferRxPrescriptionInfoPresenter.this).show();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = TransferRxPrescriptionInfoPresenter.this;
        super();
    }
}
