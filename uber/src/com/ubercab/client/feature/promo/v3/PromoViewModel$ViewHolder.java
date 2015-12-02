// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v3;

import android.view.View;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import com.ubercab.ui.collection.model.ViewModel;
import hqt;

// Referenced classes of package com.ubercab.client.feature.promo.v3:
//            PromoViewModel

public class  extends hqt
{

    TextView mTextViewDescription;
    TextView mTextViewLeftFooter;
    TextView mTextViewRightFooter;
    TextView mTextViewTitle;

    private void a(PromoViewModel promoviewmodel)
    {
        mTextViewTitle.setText(promoviewmodel.a);
        mTextViewDescription.setText(promoviewmodel.b);
        mTextViewLeftFooter.setText(promoviewmodel.c);
        mTextViewRightFooter.setText(promoviewmodel.d);
    }

    public final volatile void a(ViewModel viewmodel)
    {
        a((PromoViewModel)viewmodel);
    }

    public (View view)
    {
        super(view);
        ButterKnife.inject(this, view);
    }
}
