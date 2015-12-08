// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import com.walmartlabs.utils.WLog;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterManager, ShopFilterDialogListAdapter

public class RefinementsHelper
{
    public static interface OnRefinementsChangedListener
    {

        public abstract void onRefinementsChanged();
    }


    private static final String TAG = com/walmart/android/app/shop/RefinementsHelper.getSimpleName();
    private static final Comparator sPriceRangeComparator = new Comparator() {

        private final Pattern mPriceRangePattern = Pattern.compile("\\${0,1}([\\d\\.\\,]+)(\\+|\\s*-.*)");
        private final NumberFormat mUSNumberFormat;

        private double extractLowerEndValue(String s)
        {
            Matcher matcher = mPriceRangePattern.matcher(s);
            if (!matcher.matches()) goto _L2; else goto _L1
_L1:
            double d = mUSNumberFormat.parse(matcher.group(1)).doubleValue();
            return d;
            ParseException parseexception;
            parseexception;
            WLog.e(RefinementsHelper.TAG, (new StringBuilder()).append("Current price range could not be parsed: <").append(s).append(">").toString(), parseexception);
_L4:
            return 0.0D;
_L2:
            WLog.e(RefinementsHelper.TAG, "Current price range does not match the regex");
            if (true) goto _L4; else goto _L3
_L3:
        }

        public int compare(com.walmart.android.data.StoreQueryResult.Refinement refinement, com.walmart.android.data.StoreQueryResult.Refinement refinement1)
        {
            return Double.compare(extractLowerEndValue(refinement.getName()), extractLowerEndValue(refinement1.getName()));
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((com.walmart.android.data.StoreQueryResult.Refinement)obj, (com.walmart.android.data.StoreQueryResult.Refinement)obj1);
        }

            
            {
                mUSNumberFormat = NumberFormat.getInstance(Locale.US);
            }
    };

    public RefinementsHelper()
    {
    }

    public static Dialog showRefinementGroupDialog(Activity activity, ShopFilterManager shopfiltermanager, com.walmart.android.data.StoreQueryResult.RefinementGroup refinementgroup)
    {
        com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(activity);
        String s = refinementgroup.getName();
        if (s.equalsIgnoreCase("price"))
        {
            Arrays.sort(refinementgroup.getRefinements(), sPriceRangeComparator);
        }
        ArrayList arraylist = shopfiltermanager.getRefinementsInGroup(refinementgroup.getName());
        activity = new ShopFilterDialogListAdapter(new ContextThemeWrapper(activity, 0x7f0b01f1), arraylist);
        activity.setRefinementGroup(refinementgroup);
        builder.setAdapter(activity, null).setTitle(s).setCancelable(true).setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener(shopfiltermanager, s, arraylist) {

            final String val$refinementGroupName;
            final ArrayList val$selectedRefinementsFromGroup;
            final ShopFilterManager val$shopFilterManager;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                shopFilterManager.updateRefinementsInGroup(refinementGroupName, selectedRefinementsFromGroup);
            }

            
            {
                shopFilterManager = shopfiltermanager;
                refinementGroupName = s;
                selectedRefinementsFromGroup = arraylist;
                super();
            }
        }).setNegativeButton(0x7f0900a0, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            public void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface.dismiss();
            }

        });
        return builder.show();
    }


}
