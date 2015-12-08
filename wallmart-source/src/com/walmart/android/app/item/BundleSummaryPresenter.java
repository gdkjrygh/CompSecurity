// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.BundleAddableToCartEvent;
import com.walmart.android.analytics.events.ProductType;
import com.walmart.android.app.cart.CartUtils;
import com.walmart.android.app.wishlist.ListCreatorActivity;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.cart.ListInfo;
import com.walmart.android.service.item.BundleModel;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.service.item.ItemPrice;
import com.walmart.android.service.wishlist.AddBundle;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.TextUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.CartManager;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.PriceView;
import com.walmartlabs.ui.StarsView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.app.item:
//            BundleConfiguration, ItemDetailsPresenter, BundlesShelfPresenter

public class BundleSummaryPresenter extends Presenter
{
    static interface BundlePriceCalculator
    {

        public abstract String getBundlePrice();
    }

    public static class BundlePriceCalculatorImpl
        implements BundlePriceCalculator
    {

        private BundleConfiguration mConfiguration;
        private ItemPrice mFallbackPricing;

        private float getFallbackBasePrice()
        {
            float f1 = 0.0F;
            float f = f1;
            if (mFallbackPricing != null)
            {
                Object obj = mFallbackPricing.getPriceString();
                obj = BundleSummaryPresenter.sPricePattern.matcher(((CharSequence) (obj)));
                f = f1;
                if (((Matcher) (obj)).matches())
                {
                    try
                    {
                        f = Float.parseFloat(((Matcher) (obj)).group(2));
                    }
                    catch (NumberFormatException numberformatexception)
                    {
                        Log.w(BundleSummaryPresenter.TAG, (new StringBuilder()).append("Failed to parse: ").append(((Matcher) (obj)).group(2)).toString());
                        return 0.0F;
                    }
                }
            }
            return f;
        }

        private int getFallbackBasePriceInCents()
        {
            return Math.round(getFallbackBasePrice() * 100F);
        }

        public String getBundlePrice()
        {
            int l;
            int i = 0;
            Object obj = new ArrayList(mConfiguration.getStandardGroupConfigurations());
            ((List) (obj)).addAll(mConfiguration.getRequiredGroupConfigurations());
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                l = i;
                if (!iterator.hasNext())
                {
                    break;
                }
                BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration = (BundleConfiguration.BundleGroupConfiguration)iterator.next();
                i += bundlegroupconfiguration.getBundleGroup().getBasePriceInCents();
                if (!bundlegroupconfiguration.getBundleGroup().isBasePriceInvalid())
                {
                    continue;
                }
                l = getFallbackBasePriceInCents();
                break;
            } while (true);
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Iterator iterator1 = ((BundleConfiguration.BundleGroupConfiguration)((Iterator) (obj)).next()).getSelectedOptions().iterator();
                int j = l;
                do
                {
                    l = j;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    j += ((com.walmart.android.service.item.BundleModel.GroupOption)iterator1.next()).getPriceModifierInCents();
                } while (true);
            } while (true);
            obj = mConfiguration.getOptionalGroupConfigurations().iterator();
            do
            {
label0:
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    Iterator iterator2 = ((BundleConfiguration.BundleGroupConfiguration)((Iterator) (obj)).next()).getSelectedOptions().iterator();
                    int k = l;
                    do
                    {
                        l = k;
                        if (!iterator2.hasNext())
                        {
                            break;
                        }
                        k += ((com.walmart.android.service.item.BundleModel.GroupOption)iterator2.next()).getPriceModifierInCents();
                    } while (true);
                }
            } while (true);
            return TextUtils.getPriceFromCents(l);
        }

        public BundlePriceCalculatorImpl(BundleConfiguration bundleconfiguration, ItemPrice itemprice)
        {
            mConfiguration = bundleconfiguration;
            mFallbackPricing = itemprice;
        }
    }


    private static final int DIALOG_CANCEL_BUNDLE_CHANGES = 3;
    private static final int DIALOG_CART_ADDING_ERROR = 2;
    private static final int DIALOG_SELECT_REQUIRED_ITEMS = 1;
    private static final String TAG = com/walmart/android/app/item/BundleSummaryPresenter.getSimpleName();
    private static final String TAG_HEADER = "HEADER";
    private static String sPrefixRegEx;
    private static Pattern sPricePattern;
    private static String sPriceRegEx;
    private Activity mActivity;
    private boolean mAddButtonHasBeenPressed;
    private int mBlueTextColor;
    private BundleAddableToCartEvent mBundleAddableToCartEvent;
    private BundleConfiguration mBundleConfiguration;
    private BundleModel mBundleModel;
    private BundlePriceCalculator mBundlePriceCalculator;
    private View mBundleSummaryView;
    private int mDialogConfig;
    private Handler mHandler;
    private boolean mHasAddedItem;
    private boolean mIsRecommendedItem;
    private ItemModel mItemModel;
    private ListInfo mListInfo;
    private boolean mPushedPresenter;
    private HashMap mThumbnailMap;

    public BundleSummaryPresenter(Activity activity, ItemModel itemmodel, ListInfo listinfo)
    {
        mDialogConfig = 0;
        mActivity = activity;
        mThumbnailMap = new HashMap();
        mHandler = new Handler();
        mItemModel = itemmodel;
        mBundleModel = itemmodel.getBundleModel();
        mBundleConfiguration = new BundleConfiguration(mBundleModel);
        mBundlePriceCalculator = new BundlePriceCalculatorImpl(mBundleConfiguration, itemmodel.getPrimaryBuyingOption().getPrice());
        mListInfo = listinfo;
        mBlueTextColor = mActivity.getResources().getColor(0x7f0f0063);
        setTitleText(mActivity.getString(0x7f090176));
    }

    private void addToCart()
    {
        Object obj = createOfferConfiguration();
        Services.get().getCartManager().addGrouping(mBundleModel.getGroupingId(), ((List) (obj)), 1, mListInfo, new CallbackSameThread() {

            final BundleSummaryPresenter this$0;

            public void onResultSameThread(Request request, Result result)
            {
                if (result.successful() && result.hasData())
                {
                    GoogleAnalytics.trackEvent("Cart", String.format(Locale.US, "Add to Cart %s", new Object[] {
                        "configurable_bundle"
                    }), mItemModel.getItemId());
                    if (mIsRecommendedItem)
                    {
                        GoogleAnalytics.trackEvent("Recommendations", "Item Page Add to Cart", mItemModel.getItemId());
                    }
                    onItemAdded();
                } else
                if (!isPopped())
                {
                    showDialog(2);
                    resetAddToCartButton();
                    return;
                }
            }

            
            {
                this$0 = BundleSummaryPresenter.this;
                super();
            }
        });
        obj = (Button)ViewUtil.findViewById(mBundleSummaryView, 0x7f1000b0);
        ((Button) (obj)).setText(mActivity.getString(0x7f09016a));
        ((Button) (obj)).setEnabled(false);
        mHasAddedItem = true;
        obj = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("addToCart")).putString("itemId", mItemModel.getItemId()).putString("itemPrice", CartUtils.formatPriceForAnalytics(mBundlePriceCalculator.getBundlePrice())).putString("prodType", ProductType.BUNDLE.toString()).putString("unitCount", "1");
        MessageBus.getBus().post(obj);
    }

    private boolean areRequiredItemsSelected()
    {
        boolean flag1 = true;
        Iterator iterator = mBundleConfiguration.getRequiredGroupConfigurations().iterator();
        boolean flag;
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            if (((BundleConfiguration.BundleGroupConfiguration)iterator.next()).hasMadeRequiredSelections())
            {
                continue;
            }
            flag = false;
            break;
        } while (true);
        return flag;
    }

    private boolean areSelectionsMade()
    {
        boolean flag1 = false;
        Iterator iterator = mBundleConfiguration.getRequiredGroupConfigurations().iterator();
        boolean flag;
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            if (!((BundleConfiguration.BundleGroupConfiguration)iterator.next()).hasMadeAnySelections())
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        return flag;
    }

    private void cleanupImages()
    {
        for (Iterator iterator = mThumbnailMap.values().iterator(); iterator.hasNext(); ((Bitmap)iterator.next()).recycle()) { }
        mThumbnailMap.clear();
    }

    private List createOfferConfiguration()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mBundleConfiguration.getStandardGroupConfigurations().iterator(); iterator.hasNext();)
        {
            BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration = (BundleConfiguration.BundleGroupConfiguration)iterator.next();
            Iterator iterator2 = bundlegroupconfiguration.getSelectedOptions().iterator();
            while (iterator2.hasNext()) 
            {
                arraylist.add(new com.walmart.android.service.cart.CartService.OfferConfiguration(bundlegroupconfiguration.getOfferId((com.walmart.android.service.item.BundleModel.GroupOption)iterator2.next()), 1));
            }
        }

        for (Iterator iterator1 = mBundleConfiguration.getRequiredGroupConfigurations().iterator(); iterator1.hasNext();)
        {
            BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration1 = (BundleConfiguration.BundleGroupConfiguration)iterator1.next();
            Iterator iterator3 = bundlegroupconfiguration1.getSelectedOptions().iterator();
            while (iterator3.hasNext()) 
            {
                arraylist.add(new com.walmart.android.service.cart.CartService.OfferConfiguration(bundlegroupconfiguration1.getOfferId((com.walmart.android.service.item.BundleModel.GroupOption)iterator3.next()), 1));
            }
        }

        return arraylist;
    }

    private void init()
    {
        renderRequiredComponentGroups();
        if (mBundleConfiguration.getOptionalGroupConfigurations().isEmpty())
        {
            mBundleSummaryView.findViewById(0x7f1000ac).setVisibility(8);
        }
        renderOptionalComponentGroups();
        updatePrice();
        mBundleSummaryView.findViewById(0x7f1000b0).setOnClickListener(new android.view.View.OnClickListener() {

            final BundleSummaryPresenter this$0;

            public void onClick(View view)
            {
                if (areRequiredItemsSelected())
                {
                    addToCart();
                } else
                {
                    showDialog(1);
                    showExclamation();
                }
                mAddButtonHasBeenPressed = true;
            }

            
            {
                this$0 = BundleSummaryPresenter.this;
                super();
            }
        });
        ViewUtil.findViewById(mBundleSummaryView, 0x7f1000b1).setOnClickListener(new android.view.View.OnClickListener() {

            final BundleSummaryPresenter this$0;

            public void onClick(View view)
            {
                if (areRequiredItemsSelected())
                {
                    view = new AddBundle(mBundleModel.getGroupingId(), 1, AddBundle.convertItems(createOfferConfiguration()));
                    ListCreatorActivity.launch(mActivity, view);
                    view = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("AddToListTap");
                    view.putString("itemId", mItemModel.getItemId());
                    MessageBus.getBus().post(view);
                }
            }

            
            {
                this$0 = BundleSummaryPresenter.this;
                super();
            }
        });
        updateAddToListState();
    }

    private void onBundleGroupSelected(BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration)
    {
        Object obj = bundlegroupconfiguration.getBundleGroup().getOptions();
        if (((List) (obj)).isEmpty())
        {
            return;
        }
        if (((List) (obj)).size() == 1)
        {
            obj = (com.walmart.android.service.item.BundleModel.GroupOption)((List) (obj)).get(0);
            ItemDetailsPresenter itemdetailspresenter = new ItemDetailsPresenter(mActivity, ((com.walmart.android.service.item.BundleModel.GroupOption) (obj)).getItemId());
            itemdetailspresenter.setBundleGroupConfiguration(bundlegroupconfiguration, ((com.walmart.android.service.item.BundleModel.GroupOption) (obj)));
            pushPresenterChecked(itemdetailspresenter);
            return;
        } else
        {
            pushPresenterChecked(new BundlesShelfPresenter(mActivity, bundlegroupconfiguration, mBundlePriceCalculator));
            return;
        }
    }

    private void onItemAdded()
    {
        if (!isPopped())
        {
            ((Button)ViewUtil.findViewById(mBundleSummaryView, 0x7f1000b0)).setText(mActivity.getString(0x7f090195));
            (new Handler()).postDelayed(new Runnable() {

                final BundleSummaryPresenter this$0;

                public void run()
                {
                    if (!isPopped())
                    {
                        resetAddToCartButton();
                    }
                }

            
            {
                this$0 = BundleSummaryPresenter.this;
                super();
            }
            }, 1500L);
        }
    }

    private void populateBundleEntry(View view, BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration, com.walmart.android.service.item.BundleModel.GroupOption groupoption)
    {
        ViewUtil.setText(0x7f1000b5, view, groupoption.getItemName());
        Object obj = (StarsView)ViewUtil.findViewById(view, 0x7f1000b6);
        SpannableStringBuilder spannablestringbuilder;
        com.walmart.android.service.item.VariantsModel.VariantItem variantitem;
        if (groupoption.getCustomerRating() > 0.0F)
        {
            ((StarsView) (obj)).setValue(groupoption.getCustomerRating());
        } else
        {
            ((StarsView) (obj)).setVisibility(4);
        }
        populateItemImage(view, groupoption.getProductImageUrl());
        obj = (TextView)ViewUtil.findViewById(view, 0x7f1000a6);
        spannablestringbuilder = new SpannableStringBuilder();
        variantitem = bundlegroupconfiguration.getSelectedVariantItem(groupoption);
        if (variantitem != null)
        {
            com.walmart.android.service.item.VariantsModel.VariantType varianttype;
            for (bundlegroupconfiguration = bundlegroupconfiguration.getSelectedVariantTypes(groupoption).iterator(); bundlegroupconfiguration.hasNext(); populateVariant(spannablestringbuilder, varianttype.getName(), variantitem.getValue(varianttype).getName()))
            {
                varianttype = (com.walmart.android.service.item.VariantsModel.VariantType)bundlegroupconfiguration.next();
            }

            ((TextView) (obj)).setText(spannablestringbuilder);
            ((TextView) (obj)).setVisibility(0);
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        bundlegroupconfiguration = (PriceView)ViewUtil.findViewById(view, 0x7f1000b8);
        if (groupoption.getPriceModifierInCents() > 0)
        {
            ViewUtil.findViewById(view, 0x7f1000b7).setVisibility(0);
            bundlegroupconfiguration.setVisibility(0);
            bundlegroupconfiguration.setPrice(TextUtils.getPriceFromCents(groupoption.getPriceModifierInCents()));
            return;
        } else
        {
            ViewUtil.findViewById(view, 0x7f1000b7).setVisibility(8);
            bundlegroupconfiguration.setVisibility(8);
            return;
        }
    }

    private void populateItemImage(View view, String s)
    {
        ImageView imageview = (ImageView)view.findViewById(0x7f1000b2);
        if (android.text.TextUtils.isEmpty(s))
        {
            imageview.setImageBitmap(((BitmapDrawable)view.getContext().getResources().getDrawable(0x7f02021b)).getBitmap());
            return;
        }
        Bitmap bitmap = (Bitmap)mThumbnailMap.get(s);
        if (bitmap == null)
        {
            Picasso.with(view.getContext()).load(s).placeholder(0x7f0200ab).error(0x7f02021b).into(imageview);
            return;
        } else
        {
            imageview.setImageBitmap(bitmap);
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
        s = new ForegroundColorSpan(mBlueTextColor);
        StyleSpan stylespan = new StyleSpan(2);
        TypefaceSpan typefacespan = new TypefaceSpan("sans-serif");
        spannablestringbuilder.setSpan(s, i, spannablestringbuilder.length(), 17);
        spannablestringbuilder.setSpan(stylespan, i, spannablestringbuilder.length(), 17);
        spannablestringbuilder.setSpan(typefacespan, i, spannablestringbuilder.length(), 17);
        spannablestringbuilder.append(s1);
    }

    private void pushPresenterChecked(Presenter presenter)
    {
        if (!mPushedPresenter)
        {
            mPushedPresenter = true;
            pushPresenter(presenter);
        }
    }

    private void renderBundleGroupsConfigurations(List list, ViewGroup viewgroup)
    {
        viewgroup.removeAllViews();
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            final BundleConfiguration.BundleGroupConfiguration bundleGroupConfiguration = (BundleConfiguration.BundleGroupConfiguration)iterator.next();
            com.walmart.android.service.item.BundleModel.BundleGroup bundlegroup = bundleGroupConfiguration.getBundleGroup();
            if (bundleGroupConfiguration.hasMadeAnySelections())
            {
                View view = ViewUtil.inflate(mActivity, 0x7f040030, viewgroup);
                ViewGroup viewgroup1 = (ViewGroup)ViewUtil.findViewById(view, 0x7f1000ba);
                list = ViewUtil.findViewById(view, 0x7f1000b9);
                list.setTag("HEADER");
                final com.walmart.android.service.item.BundleModel.GroupOption option;
                View view1;
                for (Iterator iterator1 = bundleGroupConfiguration.getSelectedOptions().iterator(); iterator1.hasNext(); view1.setOnLongClickListener(new android.view.View.OnLongClickListener() {

        final BundleSummaryPresenter this$0;
        final BundleConfiguration.BundleGroupConfiguration val$bundleGroupConfiguration;
        final com.walmart.android.service.item.BundleModel.GroupOption val$option;

        public boolean onLongClick(View view2)
        {
            showContextDialog(bundleGroupConfiguration, option);
            return true;
        }

            
            {
                this$0 = BundleSummaryPresenter.this;
                bundleGroupConfiguration = bundlegroupconfiguration;
                option = groupoption;
                super();
            }
    }))
                {
                    option = (com.walmart.android.service.item.BundleModel.GroupOption)iterator1.next();
                    view1 = ViewUtil.inflate(mActivity, 0x7f04002f, viewgroup1, false);
                    populateBundleEntry(view1, bundleGroupConfiguration, option);
                    if (com.walmart.android.service.item.BundleModel.GroupType.REQUIRED.equals(bundlegroup.getGroupType()))
                    {
                        ImageView imageview = (ImageView)ViewUtil.findViewById(view1, 0x7f1000b4);
                        imageview.setVisibility(0);
                        imageview.setImageResource(0x7f02008c);
                    }
                    viewgroup1.addView(view1);
                    view1.setOnClickListener(new android.view.View.OnClickListener() {

                        final BundleSummaryPresenter this$0;
                        final BundleConfiguration.BundleGroupConfiguration val$bundleGroupConfiguration;
                        final com.walmart.android.service.item.BundleModel.GroupOption val$option;

                        public void onClick(View view2)
                        {
                            showDetailsForComponentGroup(bundleGroupConfiguration, option);
                        }

            
            {
                this$0 = BundleSummaryPresenter.this;
                bundleGroupConfiguration = bundlegroupconfiguration;
                option = groupoption;
                super();
            }
                    });
                }

                viewgroup.addView(view);
            } else
            {
                list = ViewUtil.inflate(mActivity, 0x7f040031, viewgroup);
                list.setTag("HEADER");
                viewgroup.addView(list);
            }
            setHeaderTextForComponent(list, bundleGroupConfiguration);
            if (!com.walmart.android.service.item.BundleModel.GroupType.STANDARD.equals(bundlegroup.getGroupType()))
            {
                list.setOnClickListener(new android.view.View.OnClickListener() {

                    final BundleSummaryPresenter this$0;
                    final BundleConfiguration.BundleGroupConfiguration val$bundleGroupConfiguration;

                    public void onClick(View view2)
                    {
                        onBundleGroupSelected(bundleGroupConfiguration);
                    }

            
            {
                this$0 = BundleSummaryPresenter.this;
                bundleGroupConfiguration = bundlegroupconfiguration;
                super();
            }
                });
            } else
            {
                list.setOnClickListener(null);
                list.findViewById(0x7f1000bc).setVisibility(8);
            }
        }

    }

    private void renderOptionalComponentGroups()
    {
        ViewGroup viewgroup = (ViewGroup)mBundleSummaryView.findViewById(0x7f1000ad);
        List list = mBundleConfiguration.getOptionalGroupConfigurations();
        if (list.size() > 0)
        {
            viewgroup.setVisibility(0);
            renderBundleGroupsConfigurations(list, viewgroup);
        }
    }

    private void renderRequiredComponentGroups()
    {
        Object obj = mBundleConfiguration.getStandardGroupConfigurations();
        List list = mBundleConfiguration.getRequiredGroupConfigurations();
        obj = new ArrayList(((Collection) (obj)));
        ((List) (obj)).addAll(list);
        renderBundleGroupsConfigurations(((List) (obj)), (ViewGroup)ViewUtil.findViewById(mBundleSummaryView, 0x7f1000ab));
    }

    private void resetAddToCartButton()
    {
        if (!isPopped())
        {
            Button button = (Button)ViewUtil.findViewById(mBundleSummaryView, 0x7f1000b0);
            button.setEnabled(true);
            button.setText(mActivity.getString(0x7f09006a));
        }
    }

    private void setHeaderTextForComponent(View view, BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration)
    {
        Object obj1 = null;
        String s1 = null;
        int i = 1;
        com.walmart.android.service.item.BundleModel.BundleGroup bundlegroup = bundlegroupconfiguration.getBundleGroup();
        Object obj;
        TextView textview;
        int j;
        if (com.walmart.android.service.item.BundleModel.GroupType.STANDARD.equals(bundlegroup.getGroupType()))
        {
            obj = "Standard with this bundle";
            i = 0;
            bundlegroupconfiguration = s1;
        } else
        {
            String s = bundlegroup.getTitle();
            int k = bundlegroupconfiguration.getSelectedOptions().size();
            if (com.walmart.android.service.item.BundleModel.GroupType.REQUIRED.equals(bundlegroup.getGroupType()))
            {
                bundlegroupconfiguration = s1;
                obj = s;
                if (k > 0)
                {
                    bundlegroupconfiguration = obj1;
                    if (bundlegroup.getMinimumSelectionsRequired() > 1)
                    {
                        bundlegroupconfiguration = mActivity.getString(0x7f09009f, new Object[] {
                            Integer.valueOf(k), Integer.valueOf(bundlegroup.getMinimumSelectionsRequired())
                        });
                    }
                    i = 0;
                    obj = s;
                }
            } else
            {
                bundlegroupconfiguration = s1;
                obj = s;
                if (k > 0)
                {
                    bundlegroupconfiguration = mActivity.getString(0x7f09009e, new Object[] {
                        Integer.valueOf(k)
                    });
                    i = 0;
                    obj = s;
                }
            }
        }
        textview = (TextView)ViewUtil.findViewById(view, 0x7f1000be);
        s1 = mActivity.getString(0x7f090094);
        if (i != 0)
        {
            obj = (new StringBuilder()).append(s1).append(((String) (obj))).toString();
            ViewUtil.findViewById(view, 0x7f1000bb).setVisibility(0);
        } else
        {
            ViewUtil.findViewById(view, 0x7f1000bb).setVisibility(8);
        }
        j = ((String) (obj)).length();
        view = ((View) (obj));
        if (bundlegroupconfiguration != null)
        {
            view = (new StringBuilder()).append(((String) (obj))).append(bundlegroupconfiguration).toString();
        }
        obj = new SpannableString(view);
        if (i != 0)
        {
            i = s1.length();
            ((SpannableString) (obj)).setSpan(new ForegroundColorSpan(mBlueTextColor), 0, i, 0);
            ((SpannableString) (obj)).setSpan(new TypefaceSpan("sans-serif"), 0, i, 0);
        }
        if (bundlegroupconfiguration != null)
        {
            ((SpannableString) (obj)).setSpan(new ForegroundColorSpan(mBlueTextColor), j, view.length(), 0);
        }
        textview.setText(((CharSequence) (obj)));
    }

    private void showContextDialog(final BundleConfiguration.BundleGroupConfiguration bundleGroupConfiguration, final com.walmart.android.service.item.BundleModel.GroupOption option)
    {
        CharSequence acharsequence[];
        com.walmart.android.ui.CustomAlertDialog.Builder builder;
        if (com.walmart.android.service.item.BundleModel.GroupType.STANDARD.equals(bundleGroupConfiguration.getBundleGroup().getGroupType()))
        {
            acharsequence = new CharSequence[1];
            acharsequence[0] = "View item";
        } else
        {
            acharsequence = new CharSequence[2];
            acharsequence[0] = "View item";
            acharsequence[1] = "Remove item";
        }
        builder = new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig);
        builder.setTitle("Item options");
        builder.setItems(acharsequence, new android.content.DialogInterface.OnClickListener() {

            final BundleSummaryPresenter this$0;
            final BundleConfiguration.BundleGroupConfiguration val$bundleGroupConfiguration;
            final com.walmart.android.service.item.BundleModel.GroupOption val$option;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == 0)
                {
                    showDetailsForComponentGroup(bundleGroupConfiguration, option);
                } else
                if (i == 1)
                {
                    bundleGroupConfiguration.deselect(option);
                    renderRequiredComponentGroups();
                    renderOptionalComponentGroups();
                    return;
                }
            }

            
            {
                this$0 = BundleSummaryPresenter.this;
                bundleGroupConfiguration = bundlegroupconfiguration;
                option = groupoption;
                super();
            }
        });
        builder.show();
    }

    private void showDetailsForComponentGroup(BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration, com.walmart.android.service.item.BundleModel.GroupOption groupoption)
    {
        ItemDetailsPresenter itemdetailspresenter = new ItemDetailsPresenter(mActivity, groupoption.getItemId());
        itemdetailspresenter.setBundleGroupConfiguration(bundlegroupconfiguration, groupoption);
        pushPresenterChecked(itemdetailspresenter);
    }

    private void showExclamation()
    {
        ViewGroup viewgroup = (ViewGroup)ViewUtil.findViewById(mBundleSummaryView, 0x7f1000ab);
        int i = mBundleConfiguration.getStandardGroupConfigurations().size();
        for (Iterator iterator = mBundleConfiguration.getRequiredGroupConfigurations().iterator(); iterator.hasNext(); i++)
        {
            if (((BundleConfiguration.BundleGroupConfiguration)iterator.next()).hasMadeRequiredSelections())
            {
                continue;
            }
            Object obj = viewgroup.getChildAt(i);
            if (obj != null)
            {
                obj = (ImageView)ViewUtil.findViewById(((View) (obj)), 0x7f1000bd);
                ((ImageView) (obj)).setVisibility(0);
                ((ImageView) (obj)).setImageResource(0x7f02022d);
            }
        }

    }

    private void trackPageView()
    {
        GoogleAnalytics.trackPageView("Bundle Summary");
    }

    private void updateAddToListState()
    {
        ((Button)ViewUtil.findViewById(mBundleSummaryView, 0x7f1000b1)).setEnabled(areRequiredItemsSelected());
    }

    private void updatePrice()
    {
        Object obj = (TextView)ViewUtil.findViewById(mBundleSummaryView, 0x7f1000aa);
        if (areRequiredItemsSelected())
        {
            ((TextView) (obj)).setTextColor(mActivity.getResources().getColor(0x7f0f0011));
        } else
        {
            ((TextView) (obj)).setTextColor(mActivity.getResources().getColor(0x7f0f0068));
        }
        obj = mBundlePriceCalculator.getBundlePrice();
        ((PriceView)ViewUtil.findViewById(mBundleSummaryView, 0x7f1000ae)).setPrice(((String) (obj)));
    }

    public View getView()
    {
        return mBundleSummaryView;
    }

    public boolean interceptBack()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!mHasAddedItem)
        {
            flag = flag1;
            if (areSelectionsMade())
            {
                flag = true;
                showDialog(3);
            }
        }
        return flag;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        cleanupImages();
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mPushedPresenter = false;
        trackPageView();
        renderRequiredComponentGroups();
        renderOptionalComponentGroups();
        updatePrice();
        updateAddToListState();
        if (mAddButtonHasBeenPressed)
        {
            showExclamation();
        }
        if (mBundleAddableToCartEvent == null && areRequiredItemsSelected())
        {
            mBundleAddableToCartEvent = new BundleAddableToCartEvent(mItemModel.getItemId());
            MessageBus.getBus().post(mBundleAddableToCartEvent);
        }
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        trackPageView();
        MessageBus.getBus().register(this);
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig)).setTitle(0x7f090097).setMessage(0x7f090096).setPositiveButton(0x7f090292, null).setCancelable(true).create();

        case 2: // '\002'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig)).setTitle(0x7f0900a7).setMessage(0x7f0900a6).setPositiveButton(0x7f090292, null).setCancelable(true).create();

        case 3: // '\003'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig)).setMessage(0x7f090095).setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

                final BundleSummaryPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    pop();
                }

            
            {
                this$0 = BundleSummaryPresenter.this;
                super();
            }
            }).setNegativeButton(0x7f0900a0, null).setCancelable(true).create();
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mBundleSummaryView == null)
        {
            mBundleSummaryView = ViewUtil.inflate(mActivity, 0x7f04002e, viewgroup);
            ViewUtil.setText(0x7f1000aa, mBundleSummaryView, mItemModel.getProductName());
            init();
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        cleanupImages();
    }

    public void onPop()
    {
        super.onPop();
        MessageBus.getBus().unregister(this);
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        trackPageView();
        renderRequiredComponentGroups();
        renderOptionalComponentGroups();
        if (mAddButtonHasBeenPressed)
        {
            showExclamation();
        }
    }

    public void onStopAsTop()
    {
        super.onStopAsTop();
        cleanupImages();
    }

    public void setIsRecommendedItem(boolean flag)
    {
        mIsRecommendedItem = flag;
    }

    static 
    {
        sPrefixRegEx = "([^$]*?)";
        sPriceRegEx = "\\$?(\\d{1,3}(?:,?\\d{3})*(\\.\\d{2})?)";
        sPricePattern = Pattern.compile((new StringBuilder()).append("^").append(sPrefixRegEx).append(sPriceRegEx).append("(.*)$").toString());
    }


















/*
    static boolean access$502(BundleSummaryPresenter bundlesummarypresenter, boolean flag)
    {
        bundlesummarypresenter.mAddButtonHasBeenPressed = flag;
        return flag;
    }

*/




}
