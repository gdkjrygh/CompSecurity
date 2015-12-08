// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.content.DialogInterface;
import android.widget.Spinner;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PickupTimesSpinnerAdapter

class this._cls0
    implements android.content.sListener
{

    final ReviewOrderPresenter this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (ReviewOrderPresenter.access$1700(ReviewOrderPresenter.this) != null && ReviewOrderPresenter.access$1700(ReviewOrderPresenter.this).length > 0)
        {
            ReviewOrderPresenter.access$2902(ReviewOrderPresenter.this, ReviewOrderPresenter.access$3000(ReviewOrderPresenter.this));
            ReviewOrderPresenter.access$3002(ReviewOrderPresenter.this, ReviewOrderPresenter.access$1700(ReviewOrderPresenter.this));
            ReviewOrderPresenter.access$102(ReviewOrderPresenter.this, ReviewOrderPresenter.access$000(ReviewOrderPresenter.this));
            ReviewOrderPresenter.access$002(ReviewOrderPresenter.this, 0);
            ReviewOrderPresenter.access$3100(ReviewOrderPresenter.this).setSelection(ReviewOrderPresenter.access$000(ReviewOrderPresenter.this));
            ReviewOrderPresenter.access$3200(ReviewOrderPresenter.this).setItems(ReviewOrderPresenter.access$1700(ReviewOrderPresenter.this));
            dialoginterface = (r.PickupItem)ReviewOrderPresenter.access$3200(ReviewOrderPresenter.this).getItem(0);
            if (dialoginterface != null)
            {
                ReviewOrderPresenter.access$200(ReviewOrderPresenter.this, dialoginterface.getDate(), dialoginterface.getTime());
            }
        }
        ReviewOrderPresenter.access$1702(ReviewOrderPresenter.this, null);
    }

    r.PickupItem()
    {
        this$0 = ReviewOrderPresenter.this;
        super();
    }
}
