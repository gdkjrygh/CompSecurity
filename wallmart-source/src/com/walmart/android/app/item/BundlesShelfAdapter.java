// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmart.android.utils.UrlUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.ItemImageDownloaderFactory;
import com.walmartlabs.ui.ImageAdapter;
import com.walmartlabs.ui.PriceView;
import com.walmartlabs.ui.StarsView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class BundlesShelfAdapter extends ImageAdapter
{
    static interface Listener
    {

        public abstract void onCheckItem(com.walmart.android.service.item.BundleModel.GroupOption groupoption);
    }


    private Context mContext;
    private BundleConfiguration.BundleGroupConfiguration mGroupConfiguration;
    private boolean mImageDownloadingEnabled;
    private boolean mIsStopped;
    private List mItems;
    private Listener mListener;

    public BundlesShelfAdapter(Context context, BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration)
    {
        super(ItemImageDownloaderFactory.createImageDownloader(context));
        mImageDownloadingEnabled = true;
        mContext = context;
        mGroupConfiguration = bundlegroupconfiguration;
        mItems = new ArrayList(bundlegroupconfiguration.getBundleGroup().getOptions());
        Collections.sort(mItems, new Comparator() {

            final BundlesShelfAdapter this$0;

            public int compare(com.walmart.android.service.item.BundleModel.GroupOption groupoption, com.walmart.android.service.item.BundleModel.GroupOption groupoption1)
            {
                boolean flag = groupoption.isAvailable();
                boolean flag1 = groupoption1.isAvailable();
                if (!flag || flag1)
                {
                    if (!flag && flag1)
                    {
                        return 1;
                    }
                    if (groupoption.getPriceModifierInCents() >= groupoption1.getPriceModifierInCents())
                    {
                        if (groupoption.getPriceModifierInCents() == groupoption1.getPriceModifierInCents())
                        {
                            return groupoption.getRanking() - groupoption1.getRanking();
                        } else
                        {
                            return 1;
                        }
                    }
                }
                return -1;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((com.walmart.android.service.item.BundleModel.GroupOption)obj, (com.walmart.android.service.item.BundleModel.GroupOption)obj1);
            }

            
            {
                this$0 = BundlesShelfAdapter.this;
                super();
            }
        });
    }

    private void populateItemImage(View view, String s, int i)
    {
        if (!mIsStopped && !TextUtils.isEmpty(s))
        {
            setImage(i, view, 0x7f1000a1, UrlUtils.getURLFromThumbnailURL(UrlUtils.IMAGE_SIZE_100, s));
        } else
        if (TextUtils.isEmpty(s))
        {
            ((ImageView)view.findViewById(0x7f1000a1)).setImageBitmap(((BitmapDrawable)mContext.getResources().getDrawable(0x7f02021b)).getBitmap());
            return;
        }
    }

    private void populateVariant(SpannableStringBuilder spannablestringbuilder, String s, String s1)
    {
        int i = spannablestringbuilder.length();
        if (i > 0)
        {
            spannablestringbuilder.append("\n");
        }
        spannablestringbuilder.append(s).append(": ");
        s = new ForegroundColorSpan(mContext.getResources().getColor(0x7f0f0063));
        StyleSpan stylespan = new StyleSpan(2);
        TypefaceSpan typefacespan = new TypefaceSpan("sans-serif");
        spannablestringbuilder.setSpan(s, i, spannablestringbuilder.length(), 17);
        spannablestringbuilder.setSpan(stylespan, i, spannablestringbuilder.length(), 17);
        spannablestringbuilder.setSpan(typefacespan, i, spannablestringbuilder.length(), 17);
        spannablestringbuilder.append(s1);
    }

    private void populateVariantInfo(TextView textview, com.walmart.android.service.item.BundleModel.GroupOption groupoption)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        com.walmart.android.service.item.VariantsModel.VariantItem variantitem = mGroupConfiguration.getSelectedVariantItem(groupoption);
        if (variantitem != null)
        {
            com.walmart.android.service.item.VariantsModel.VariantType varianttype;
            for (groupoption = mGroupConfiguration.getSelectedVariantTypes(groupoption).iterator(); groupoption.hasNext(); populateVariant(spannablestringbuilder, varianttype.getName(), variantitem.getValue(varianttype).getName()))
            {
                varianttype = (com.walmart.android.service.item.VariantsModel.VariantType)groupoption.next();
            }

            textview.setText(spannablestringbuilder);
            textview.setVisibility(0);
            return;
        } else
        {
            textview.setVisibility(8);
            return;
        }
    }

    private void populateView(int i, View view)
    {
        final com.walmart.android.service.item.BundleModel.GroupOption option = (com.walmart.android.service.item.BundleModel.GroupOption)mItems.get(i);
        ((TextView)ViewUtil.findViewById(view, 0x7f10004f)).setText(option.getItemName());
        populateItemImage(view, option.getProductImageUrl(), i);
        Object obj = (StarsView)ViewUtil.findViewById(view, 0x7f1000a5);
        TextView textview;
        PriceView priceview;
        final boolean isOptionalGroup;
        if (option.getCustomerRating() > 0.0F)
        {
            ((StarsView) (obj)).setValue(option.getCustomerRating());
        } else
        {
            ((StarsView) (obj)).setVisibility(8);
        }
        populateVariantInfo((TextView)ViewUtil.findViewById(view, 0x7f1000a6), option);
        textview = (TextView)ViewUtil.findViewById(view, 0x7f1000a7);
        priceview = (PriceView)ViewUtil.findViewById(view, 0x7f1000a8);
        isOptionalGroup = com.walmart.android.service.item.BundleModel.GroupType.OPTIONAL.equals(mGroupConfiguration.getBundleGroup().getGroupType());
        if (option.isAvailable())
        {
            i = 0;
            obj = (CheckBox)ViewUtil.findViewById(view, 0x7f10009d);
            ViewUtil.findViewById(view, 0x7f10009e).setVisibility(8);
            ViewUtil.findViewById(view, 0x7f1000a9).setVisibility(8);
            String s;
            Object obj1;
            View view1;
            if (mGroupConfiguration.isSelected(option))
            {
                ((CheckBox) (obj)).setChecked(true);
                i = 1;
            } else
            {
                ((CheckBox) (obj)).setChecked(false);
            }
            ((CheckBox) (obj)).setClickable(false);
            view.findViewById(0x7f10009c).setOnClickListener(new android.view.View.OnClickListener() {

                final BundlesShelfAdapter this$0;
                final boolean val$isOptionalGroup;
                final com.walmart.android.service.item.BundleModel.GroupOption val$option;

                public void onClick(View view2)
                {
                    if (mListener != null && !isOptionalGroup)
                    {
                        mListener.onCheckItem(option);
                    }
                }

            
            {
                this$0 = BundlesShelfAdapter.this;
                isOptionalGroup = flag;
                option = groupoption;
                super();
            }
            });
            ((CheckBox) (obj)).setVisibility(0);
            obj1 = null;
            s = null;
            view1 = ViewUtil.findViewById(view, 0x7f1000a2);
            if (mGroupConfiguration.isSelected(option) || !option.isVariant())
            {
                if (option.getPriceModifierInCents() != 0)
                {
                    obj = "Adds ";
                    if (i != 0)
                    {
                        obj = "Added ";
                    }
                    s = com.walmart.android.util.TextUtils.getPriceFromCents(option.getPriceModifierInCents());
                    view1.setVisibility(8);
                } else
                {
                    obj = obj1;
                    if (isOptionalGroup)
                    {
                        s = com.walmart.android.util.TextUtils.getPriceFromCents(option.getCurrencyAmountInCents());
                        obj = obj1;
                    }
                }
            } else
            {
                view1.setVisibility(0);
                obj = obj1;
            }
            if (s != null)
            {
                priceview.setVisibility(0);
                priceview.setPrice(s);
            } else
            {
                priceview.setVisibility(4);
            }
            if (obj != null)
            {
                textview.setText(((CharSequence) (obj)));
                textview.setVisibility(0);
            } else
            {
                textview.setVisibility(4);
            }
        } else
        {
            textview.setVisibility(4);
            ViewUtil.findViewById(view, 0x7f10009d).setVisibility(8);
            ViewUtil.findViewById(view, 0x7f10009c).setOnClickListener(null);
            ViewUtil.findViewById(view, 0x7f10009e).setVisibility(0);
            ViewUtil.findViewById(view, 0x7f1000a9).setVisibility(0);
            priceview.setVisibility(4);
        }
        if (isOptionalGroup)
        {
            textview.setVisibility(4);
            ViewUtil.findViewById(view, 0x7f10009c).setVisibility(8);
            ViewUtil.findViewById(view, 0x7f10009d).setVisibility(8);
            ViewUtil.findViewById(view, 0x7f10009e).setVisibility(4);
        }
    }

    public void destroy()
    {
        clearImages();
    }

    public int getCount()
    {
        return mItems.size();
    }

    public Object getItem(int i)
    {
        if (i < mItems.size())
        {
            return mItems.get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = LayoutInflater.from(mContext).inflate(0x7f04002d, viewgroup, false);
        }
        populateView(i, view);
        return view;
    }

    public void setImageDownloadingEnabled(boolean flag)
    {
        boolean flag1 = mImageDownloadingEnabled;
        mImageDownloadingEnabled = flag;
        if (!flag1 && mImageDownloadingEnabled)
        {
            notifyDataSetChanged();
        }
    }

    public void setListener(Listener listener)
    {
        mListener = listener;
    }

    public void start()
    {
        enable(true);
        mIsStopped = false;
        mImageDownloadingEnabled = true;
        notifyDataSetChanged();
    }

    public void stop()
    {
        enable(false);
        mIsStopped = true;
        clearImages();
    }

}
