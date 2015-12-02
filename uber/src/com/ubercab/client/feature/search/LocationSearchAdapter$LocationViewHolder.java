// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import cev;
import com.ubercab.client.core.model.FareInfo;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.client.core.model.UpfrontFareMetadata;
import com.ubercab.ui.TextView;
import ffy;
import fga;
import fgb;
import fgc;
import fgd;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchAdapter

final class a
{

    final LocationSearchAdapter a;
    private int b;
    private ffy c;
    ImageButton mEditLocationButton;
    ImageView mImageViewIcon;
    LinearLayout mItemView;
    LinearLayout mLayoutFare;
    TextView mTextViewFare;
    TextView mTextViewFareDescription;
    TextView mTextViewSubtitle;
    TextView mTextViewTagline;
    TextView mTextViewTitle;

    private int a(int i)
    {
        if (i == 0 && LocationSearchAdapter.f(a).size() == 1)
        {
            return 0x7f0200e8;
        }
        if (i == 0)
        {
            return 0x7f02010d;
        }
        return i != LocationSearchAdapter.f(a).size() - 1 ? 0x7f0200fb : 0x7f0200e9;
    }

    public final void a(ffy ffy1, int i)
    {
        boolean flag1 = true;
        c = ffy1;
        b = i;
        android.content.res.Resources resources = LocationSearchAdapter.b(a).getResources();
        String s = ffy1.a(resources);
        String s1 = ffy1.e();
        mImageViewIcon.setImageResource(ffy1.d());
        boolean flag;
        if (!TextUtils.isEmpty(LocationSearchAdapter.c(a)) && b == 0)
        {
            mTextViewTagline.setVisibility(0);
            mTextViewTagline.setText(LocationSearchAdapter.c(a));
        } else
        {
            mTextViewTagline.setVisibility(8);
        }
        if (ffy1.a() && ffy1.c() != null)
        {
            mEditLocationButton.setVisibility(0);
        } else
        {
            mEditLocationButton.setVisibility(8);
        }
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (TextUtils.isEmpty(s1))
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            mTextViewTitle.setText(s);
            mTextViewSubtitle.setText(s1);
            mTextViewSubtitle.setVisibility(0);
        } else
        if (!flag)
        {
            mTextViewTitle.setText(s1);
            mTextViewSubtitle.setVisibility(8);
        } else
        {
            mTextViewTitle.setText(s);
            mTextViewSubtitle.setVisibility(8);
        }
        mTextViewTitle.setTextColor(ffy1.b(resources));
        if (LocationSearchAdapter.d(a))
        {
            mItemView.setBackgroundResource(a(i));
        }
        if (!LocationSearchAdapter.e(a))
        {
            mEditLocationButton.setClickable(false);
        }
        if (ffy1.f())
        {
            ffy1 = ffy1.g().getMetadata();
            mLayoutFare.setVisibility(0);
            mTextViewFare.setText(ffy1.getFormattedFare());
            mTextViewFareDescription.setText(ffy1.getShortDescription());
            return;
        } else
        {
            mLayoutFare.setVisibility(8);
            return;
        }
    }

    public final void onClickEdit()
    {
        if (c == null)
        {
            return;
        } else
        {
            LocationSearchAdapter.a(a).c(new fgb(c.b(), c.c(), b));
            return;
        }
    }

    public final void onItemClick()
    {
        if (c != null)
        {
            Object obj = c.c();
            if (c.a() && obj == null)
            {
                LocationSearchAdapter.a(a).c(new fga(c.b(), b));
                return;
            }
            if (obj != null && ((LocationSearchResult) (obj)).getUberLatLng() != null)
            {
                LocationSearchAdapter.a(a).c(new fgd(((LocationSearchResult) (obj)), c.g(), c.b()));
                return;
            }
            if (obj != null)
            {
                String s = ((LocationSearchResult) (obj)).getReference();
                obj = ((LocationSearchResult) (obj)).getType();
                LocationSearchAdapter.a(a).c(new fgc(s, ((String) (obj))));
                return;
            }
        }
    }

    public (LocationSearchAdapter locationsearchadapter, View view)
    {
        a = locationsearchadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
