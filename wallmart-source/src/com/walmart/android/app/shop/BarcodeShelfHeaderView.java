// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.app.shop.giq.GiqProductItem;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.utils.ViewUtil;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfItemBarcodeView

public class BarcodeShelfHeaderView extends LinearLayout
{
    public static interface BarcodeAvailabilityListener
    {

        public abstract void onAvailabilityViewClicked();

        public abstract void onInfoViewClicked();
    }


    private ShelfItemBarcodeView mAvailabilityView;
    private TextView mInfoView;
    private BarcodeAvailabilityListener mListener;
    private TextView mNoResultsView;
    private String mProductSearchName;
    private TextView mResultsHeaderView;

    public BarcodeShelfHeaderView(Context context)
    {
        super(context);
    }

    public BarcodeShelfHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BarcodeShelfHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void setInfoMessage(CharSequence charsequence)
    {
        mInfoView.setText(charsequence);
        mAvailabilityView.setVisibility(8);
        mInfoView.setVisibility(0);
    }

    private void setSearchResultsHeader(String s)
    {
        mProductSearchName = s;
        mResultsHeaderView.setText(getContext().getString(0x7f090090, new Object[] {
            s
        }));
    }

    public String getProductSearchName()
    {
        return mProductSearchName;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mInfoView = (TextView)ViewUtil.findViewById(this, 0x7f100540);
        mInfoView.setOnClickListener(new android.view.View.OnClickListener() {

            final BarcodeShelfHeaderView this$0;

            public void onClick(View view)
            {
                if (mListener != null)
                {
                    mListener.onInfoViewClicked();
                }
            }

            
            {
                this$0 = BarcodeShelfHeaderView.this;
                super();
            }
        });
        mResultsHeaderView = (TextView)ViewUtil.findViewById(this, 0x7f100542);
        mAvailabilityView = (ShelfItemBarcodeView)ViewUtil.findViewById(this, 0x7f100541);
        mAvailabilityView.setOnClickListener(new android.view.View.OnClickListener() {

            final BarcodeShelfHeaderView this$0;

            public void onClick(View view)
            {
                if (mListener != null)
                {
                    mListener.onAvailabilityViewClicked();
                }
            }

            
            {
                this$0 = BarcodeShelfHeaderView.this;
                super();
            }
        });
        mNoResultsView = (TextView)ViewUtil.findViewById(this, 0x7f100543);
    }

    public boolean setAvailabilityData(StoreAvailabilityData storeavailabilitydata, boolean flag)
    {
        byte byte0 = 8;
        boolean flag1 = false;
        Object obj = null;
        com.walmart.android.data.StoreQueryResult.Item item = obj;
        if (storeavailabilitydata != null)
        {
            String s = storeavailabilitydata.name;
            item = obj;
            if (!TextUtils.isEmpty(s))
            {
                item = new com.walmart.android.data.StoreQueryResult.Item();
                item.setName(s);
                item.setiD(storeavailabilitydata.wwwItemId);
                item.setImageThumbnailUrl(storeavailabilitydata.productImageUrl);
                item.setPrice(String.format(Locale.US, "$%s", new Object[] {
                    storeavailabilitydata.price
                }));
                setSearchResultsHeader(item.getName());
                mAvailabilityView.setItem(item, flag, storeavailabilitydata);
            }
        }
        storeavailabilitydata = mAvailabilityView;
        int i;
        if (item != null)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        storeavailabilitydata.setVisibility(i);
        storeavailabilitydata = mInfoView;
        if (item != null)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        storeavailabilitydata.setVisibility(i);
        flag = flag1;
        if (item != null)
        {
            flag = true;
        }
        return flag;
    }

    public void setBarcodeAvailabilityListener(BarcodeAvailabilityListener barcodeavailabilitylistener)
    {
        mListener = barcodeavailabilitylistener;
    }

    public void setClickable(boolean flag)
    {
        super.setClickable(flag);
        if (mAvailabilityView != null)
        {
            mAvailabilityView.setClickable(false);
        }
    }

    public void setError(CharSequence charsequence)
    {
        setInfoMessage(charsequence);
        mResultsHeaderView.setText("");
    }

    public void setGiqProductItem(GiqProductItem giqproductitem, boolean flag, boolean flag1)
    {
        if (giqproductitem != null && !TextUtils.isEmpty(giqproductitem.description))
        {
            String s;
            SpannableStringBuilder spannablestringbuilder;
            StyleSpan stylespan;
            int i;
            if (flag)
            {
                i = 0x7f090088;
            } else
            if (flag1)
            {
                i = 0x7f090086;
            } else
            {
                i = 0x7f090087;
            }
            s = getContext().getString(i, new Object[] {
                giqproductitem.description
            });
            spannablestringbuilder = new SpannableStringBuilder(s);
            stylespan = new StyleSpan(1);
            i = s.indexOf(giqproductitem.description);
            spannablestringbuilder.setSpan(stylespan, i, giqproductitem.description.length() + i, 17);
            spannablestringbuilder.append("\n\n");
            i = spannablestringbuilder.length();
            if (flag || flag1)
            {
                spannablestringbuilder.append(getContext().getString(0x7f09008d));
            } else
            {
                spannablestringbuilder.append(getContext().getString(0x7f09008c));
            }
            spannablestringbuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(0x7f0f0124)), i, spannablestringbuilder.length(), 17);
            setInfoMessage(spannablestringbuilder);
            setSearchResultsHeader(giqproductitem.description);
            return;
        }
        int j;
        if (flag)
        {
            j = 0x7f09008b;
        } else
        if (flag1)
        {
            j = 0x7f090089;
        } else
        {
            j = 0x7f09008a;
        }
        giqproductitem = new SpannableStringBuilder(getContext().getString(j));
        giqproductitem.append("\n\n");
        j = giqproductitem.length();
        if (flag || flag1)
        {
            giqproductitem.append(getContext().getString(0x7f09008d));
        } else
        {
            giqproductitem.append(getContext().getString(0x7f09008c));
        }
        giqproductitem.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(0x7f0f0124)), j, giqproductitem.length(), 17);
        setError(giqproductitem);
    }

    public void setNoProductsFound(boolean flag)
    {
        TextView textview = mNoResultsView;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

}
