// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.data.ProfileData;
import org.apache.commons.lang3.text.WordUtils;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyResponse

class this._cls0 extends AsyncCallbackOnThread
{

    final ReviewOrderPresenter this$0;

    private void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        if (isPopped())
        {
            return;
        }
        if (pharmacyresponse != null && pharmacyresponse.status == 1 && pharmacyresponse.data != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            com.walmartlabs.android.pharmacy.data.n n = ((ProfileData)pharmacyresponse.data).patientName;
            if (!TextUtils.isEmpty(n.firstName))
            {
                stringbuilder.append(WordUtils.capitalizeFully(n.firstName)).append(" ");
            }
            if (!TextUtils.isEmpty(n.middleName))
            {
                stringbuilder.append(WordUtils.capitalizeFully(n.middleName)).append(" ");
            }
            if (!TextUtils.isEmpty(n.lastName))
            {
                stringbuilder.append(WordUtils.capitalizeFully(n.lastName));
            }
            if (stringbuilder.length() == 0)
            {
                stringbuilder.append(ReviewOrderPresenter.access$700(ReviewOrderPresenter.this).getString(t_name));
            }
            ViewUtil.setText(t_name, ReviewOrderPresenter.access$600(ReviewOrderPresenter.this), stringbuilder.toString());
            ReviewOrderPresenter.access$4102(ReviewOrderPresenter.this, ((ProfileData)pharmacyresponse.data).communication);
            ReviewOrderPresenter.access$4202(ReviewOrderPresenter.this, ReviewOrderPresenter.access$4100(ReviewOrderPresenter.this).determinePreferredPhoneType());
            pharmacyresponse = ReviewOrderPresenter.access$4100(ReviewOrderPresenter.this).getPhoneNumber(ReviewOrderPresenter.access$4200(ReviewOrderPresenter.this));
            updatePhoneNumber(pharmacyresponse);
        } else
        {
            ViewUtil.findViewById(ReviewOrderPresenter.access$600(ReviewOrderPresenter.this), this._fld0).setVisibility(8);
        }
        ReviewOrderPresenter.access$2400(ReviewOrderPresenter.this, 8);
    }

    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
    {
        handleServerResponse(pharmacyresponse);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
    }

    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
    {
        handleServerResponse(pharmacyresponse);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    cation(Handler handler)
    {
        this$0 = ReviewOrderPresenter.this;
        super(handler);
    }
}
