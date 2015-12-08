// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.app.WalmartLinkMovementMethod;
import com.walmart.android.app.item.view.LegalBadgeMap;
import com.walmart.android.app.item.view.ModuleView;
import com.walmart.android.app.item.view.builder.DrugFactsViewBuilder;
import com.walmart.android.app.item.view.builder.NutritionViewBuilder;
import com.walmart.android.app.item.view.builder.SupplementsViewBuilder;
import com.walmart.android.app.item.view.builder.TableViewBuilder;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.item.DescriptionModel;
import com.walmart.android.service.item.model.DrugFacts;
import com.walmart.android.service.item.model.Nutrition;
import com.walmart.android.service.item.model.SupplementFacts;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.CollectionUtils;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AboutItemPresenter extends Presenter
{

    public static final String TAG = com/walmart/android/app/item/AboutItemPresenter.getSimpleName();
    private final Context mContext;
    private final String mItemId;
    private final CharSequence mLongDescription;
    private final DescriptionModel mModel;
    private final String mProductName;
    private final String mProductType;
    private View mRoot;
    private final CharSequence mShortDescription;

    public AboutItemPresenter(Context context, String s, String s1, String s2, DescriptionModel descriptionmodel)
    {
        mContext = context;
        mProductType = s2;
        mProductName = s1;
        mItemId = s;
        mModel = descriptionmodel;
        if (!TextUtils.isEmpty(descriptionmodel.getShortDescription()))
        {
            context = descriptionmodel.getShortDescription();
        } else
        {
            context = "";
        }
        mShortDescription = context;
        if (!TextUtils.isEmpty(descriptionmodel.getLongDescription()))
        {
            context = descriptionmodel.getLongDescription();
        } else
        {
            context = "";
        }
        mLongDescription = context;
        setTitleText(mContext.getString(0x7f090167));
    }

    private void addLegalBadges(List list)
    {
        LinearLayout linearlayout = (LinearLayout)ViewUtil.findViewById(mRoot, 0x7f100076);
        View view;
        for (list = list.iterator(); list.hasNext(); linearlayout.addView(view))
        {
            com.walmart.android.service.item.DescriptionModel.IconDescription icondescription = (com.walmart.android.service.item.DescriptionModel.IconDescription)list.next();
            view = ViewUtil.inflate(mContext, 0x7f04001c, linearlayout, false);
            setShowAndSetText(view, 0x7f10004f, icondescription.getTitle());
            setShowAndSetText(view, 0x7f10007a, icondescription.getText());
            ViewUtil.setImageResource(view, LegalBadgeMap.getBadge(icondescription.getImageName()), 0x7f10004e);
        }

    }

    private void addModules(ViewGroup viewgroup)
    {
        ArrayList arraylist = new ArrayList();
        CollectionUtils.addIfNotNull(arraylist, createListModule(mModel.getDirections(), 0x7f0901b0));
        CollectionUtils.addIfNotNull(arraylist, createListModule(mModel.getIndications(), 0x7f0901b9));
        CollectionUtils.addIfNotNull(arraylist, createListModule(mModel.getWarnings(), 0x7f0901c2));
        CollectionUtils.addIfNotNull(arraylist, createListModule(mModel.getIngredients(), 0x7f0901ba));
        CollectionUtils.addIfNotNull(arraylist, createListModule(mModel.getSpecifications(), 0x7f0901bf));
        CollectionUtils.addIfNotNull(arraylist, createListModule(mModel.getTrackListing(), 0x7f0901c1, true));
        CollectionUtils.addIfNotNull(arraylist, createNutritionFactModule(mModel.getNutritionFacts()));
        CollectionUtils.addIfNotNull(arraylist, createDrugFactsModule(mModel.getDrugFacts()));
        CollectionUtils.addIfNotNull(arraylist, createSupplementFactsModule(mModel.getSupplementFacts()));
        CollectionUtils.addIfNotNull(arraylist, createListModule(mModel.getWhatsIncluded(), 0x7f0901b8));
        CollectionUtils.addIfNotNull(arraylist, createListModule(mModel.getWarranties(), 0x7f090059));
        inflateModules(viewgroup, arraylist);
    }

    private Pair createDrugFactsModule(DrugFacts drugfacts)
    {
        if (drugfacts != null)
        {
            return new Pair(Integer.valueOf(0x7f0901b1), (new DrugFactsViewBuilder(mContext)).build(drugfacts));
        } else
        {
            return null;
        }
    }

    private Pair createListModule(List list, int i)
    {
        return createListModule(list, i, false);
    }

    private Pair createListModule(List list, int i, boolean flag)
    {
        if (!list.isEmpty())
        {
            return new Pair(Integer.valueOf(i), (new TableViewBuilder(mContext)).setRows(list).withNumbers(flag).build());
        } else
        {
            return null;
        }
    }

    private Pair createNutritionFactModule(Nutrition nutrition)
    {
        if (nutrition != null)
        {
            return new Pair(Integer.valueOf(0x7f0901bb), (new NutritionViewBuilder(mContext)).build(nutrition));
        } else
        {
            return null;
        }
    }

    private Pair createSupplementFactsModule(SupplementFacts supplementfacts)
    {
        if (supplementfacts != null)
        {
            return new Pair(Integer.valueOf(0x7f0901c0), (new SupplementsViewBuilder(mContext)).build(supplementfacts));
        } else
        {
            return null;
        }
    }

    private void inflateModules(ViewGroup viewgroup, ArrayList arraylist)
    {
        boolean flag = true;
        arraylist = arraylist.iterator();
        do
        {
            if (arraylist.hasNext())
            {
                Pair pair = (Pair)arraylist.next();
                ModuleView moduleview = new ModuleView(mContext);
                boolean flag1;
                if (pair.first instanceof Integer)
                {
                    moduleview.setTitle(((Integer)pair.first).intValue());
                } else
                if (pair.first instanceof String)
                {
                    moduleview.setTitle((String)pair.first);
                }
                if (pair.second instanceof View)
                {
                    moduleview.setContent((View)pair.second);
                } else
                if (pair.second instanceof String)
                {
                    moduleview.setContent((String)pair.second);
                }
                flag1 = flag;
                if (flag)
                {
                    moduleview.setExpanded(true);
                    flag1 = false;
                }
                viewgroup.addView(moduleview);
                flag = flag1;
                continue;
            }
            return;
        } while (true);
    }

    private static void setShowAndSetText(View view, int i, CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            TextView textview = (TextView)ViewUtil.findViewById(view, i);
            textview.setText(charsequence);
            textview.setMovementMethod(WalmartLinkMovementMethod.getInstance(view.getContext()));
            textview.setVisibility(0);
        }
    }

    public View getView()
    {
        return mRoot;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        mRoot = ViewUtil.inflate(mContext, 0x7f04001b, viewgroup, false);
        viewgroup = (ViewGroup)ViewUtil.findViewById(mRoot, 0x7f100074);
        ViewUtil.setText(0x7f100075, viewgroup, mProductName);
        if (!TextUtils.isEmpty(mShortDescription))
        {
            TextView textview = (TextView)ViewUtil.findViewById(viewgroup, 0x7f100077);
            textview.setVisibility(0);
            textview.setText(mShortDescription);
            textview.setMovementMethod(WalmartLinkMovementMethod.getInstance(mContext));
        }
        if (!TextUtils.isEmpty(mLongDescription))
        {
            TextView textview1 = (TextView)ViewUtil.findViewById(viewgroup, 0x7f100078);
            textview1.setVisibility(0);
            textview1.setText(mLongDescription);
            textview1.setMovementMethod(WalmartLinkMovementMethod.getInstance(mContext));
        }
        addLegalBadges(mModel.getLegalBadges());
        addModules(viewgroup);
    }

    protected void onPageView()
    {
        super.onPageView();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "product detail:description").putString("section", "shop").putString("itemId", mItemId).putString("prodType", mProductType);
        MessageBus.getBus().post(builder);
    }

}
