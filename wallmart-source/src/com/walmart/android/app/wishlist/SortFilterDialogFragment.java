// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.RadioButton;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.RadioButtonController;

public class SortFilterDialogFragment extends DialogFragment
{
    public static interface OnSortFilterOptionsSelectedListener
    {

        public abstract void onSortFilterOptionsSelected(String s, String s1, String s2);
    }


    private static final String FILTER_ARG = "filter";
    private static final String ORDER_ARG = "order";
    private static final String SORT_ARG = "sort";
    private static final int sFilterIds[] = {
        0x7f10061e, 0x7f100622, 0x7f100620
    };
    private static final String sFilterOptions[] = {
        "all", "purchased", "unpurchased"
    };
    private static final String sOrderOptions[] = {
        "desc", "asc", "desc"
    };
    private static final String sSortOptions[] = {
        "time", "price", "price"
    };
    private static final int sSortOrderIds[] = {
        0x7f100624, 0x7f100626, 0x7f100628
    };
    private OnSortFilterOptionsSelectedListener mSelectionListener;

    public SortFilterDialogFragment()
    {
    }

    private static int filter2Id(String s)
    {
        for (int i = 0; i < sFilterOptions.length; i++)
        {
            if (s.equals(sFilterOptions[i]))
            {
                return sFilterIds[i];
            }
        }

        return -1;
    }

    private static String id2Option(int i, int ai[], String as[])
    {
        for (int j = 0; j < ai.length; j++)
        {
            if (i == ai[j])
            {
                return as[j];
            }
        }

        return null;
    }

    public static SortFilterDialogFragment newInstance(String s, String s1, String s2)
    {
        SortFilterDialogFragment sortfilterdialogfragment = new SortFilterDialogFragment();
        Bundle bundle = new Bundle(3);
        bundle.putString("filter", s);
        bundle.putString("sort", s1);
        bundle.putString("order", s2);
        sortfilterdialogfragment.setArguments(bundle);
        return sortfilterdialogfragment;
    }

    private static int sortOrder2Id(String s, String s1)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 32
    //                   3560141: 69
    //                   106934601: 55;
           goto _L1 _L2 _L3
_L1:
        switch (byte0)
        {
        default:
            return 0x7f100624;

        case 0: // '\0'
            break;
        }
        break; /* Loop/switch isn't completed */
_L3:
        if (s.equals("price"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("time"))
        {
            byte0 = 1;
        }
        if (true) goto _L1; else goto _L4
_L4:
        return !s1.equals("asc") ? 0x7f100628 : 0x7f100626;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        super.onCreateDialog(bundle);
        Object obj1 = getActivity();
        Object obj = getArguments();
        bundle = ((Bundle) (obj)).getString("filter");
        obj = ((Bundle) (obj)).getString("sort");
        String s = getArguments().getString("order");
        obj1 = ViewUtil.inflate(((android.content.Context) (obj1)), 0x7f0401e0);
        final RadioButtonController filterController = (RadioButton)ViewUtil.findViewById(((View) (obj1)), 0x7f10061e);
        RadioButton radiobutton1 = (RadioButton)ViewUtil.findViewById(((View) (obj1)), 0x7f100620);
        RadioButton radiobutton2 = (RadioButton)ViewUtil.findViewById(((View) (obj1)), 0x7f100622);
        final RadioButtonController sortController = (RadioButton)ViewUtil.findViewById(((View) (obj1)), 0x7f100624);
        Object obj2 = (RadioButton)ViewUtil.findViewById(((View) (obj1)), 0x7f100626);
        RadioButton radiobutton = (RadioButton)ViewUtil.findViewById(((View) (obj1)), 0x7f100628);
        View view = ViewUtil.findViewById(((View) (obj1)), 0x7f10061d);
        View view1 = ViewUtil.findViewById(((View) (obj1)), 0x7f10061f);
        View view2 = ViewUtil.findViewById(((View) (obj1)), 0x7f100621);
        View view3 = ViewUtil.findViewById(((View) (obj1)), 0x7f100623);
        View view4 = ViewUtil.findViewById(((View) (obj1)), 0x7f100625);
        View view5 = ViewUtil.findViewById(((View) (obj1)), 0x7f100627);
        filterController = new RadioButtonController(new RadioButton[] {
            filterController, radiobutton1, radiobutton2
        });
        sortController = new RadioButtonController(new RadioButton[] {
            sortController, obj2, radiobutton
        });
        obj2 = new android.view.View.OnClickListener() {

            final SortFilterDialogFragment this$0;
            final RadioButtonController val$filterController;
            final RadioButtonController val$sortController;

            public void onClick(View view6)
            {
                switch (view6.getId())
                {
                case 2131756574: 
                case 2131756576: 
                case 2131756578: 
                case 2131756580: 
                case 2131756582: 
                default:
                    return;

                case 2131756573: 
                    filterController.check(0x7f10061e);
                    return;

                case 2131756575: 
                    filterController.check(0x7f100620);
                    return;

                case 2131756577: 
                    filterController.check(0x7f100622);
                    return;

                case 2131756579: 
                    sortController.check(0x7f100624);
                    return;

                case 2131756581: 
                    sortController.check(0x7f100626);
                    return;

                case 2131756583: 
                    sortController.check(0x7f100628);
                    break;
                }
            }

            
            {
                this$0 = SortFilterDialogFragment.this;
                filterController = radiobuttoncontroller;
                sortController = radiobuttoncontroller1;
                super();
            }
        };
        view.setOnClickListener(((android.view.View.OnClickListener) (obj2)));
        view1.setOnClickListener(((android.view.View.OnClickListener) (obj2)));
        view2.setOnClickListener(((android.view.View.OnClickListener) (obj2)));
        view3.setOnClickListener(((android.view.View.OnClickListener) (obj2)));
        view4.setOnClickListener(((android.view.View.OnClickListener) (obj2)));
        view5.setOnClickListener(((android.view.View.OnClickListener) (obj2)));
        filterController.check(filter2Id(bundle));
        sortController.check(sortOrder2Id(((String) (obj)), s));
        bundle = (new com.walmart.android.ui.dialog.AlertDialog.Builder(getActivity())).setView(((View) (obj1))).setPositiveButton(0x7f09007a, new android.content.DialogInterface.OnClickListener() {

            final SortFilterDialogFragment this$0;
            final RadioButtonController val$filterController;
            final RadioButtonController val$sortController;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (mSelectionListener != null)
                {
                    mSelectionListener.onSortFilterOptionsSelected(SortFilterDialogFragment.id2Option(filterController.getCheckedRadioButtonId(), SortFilterDialogFragment.sFilterIds, SortFilterDialogFragment.sFilterOptions), SortFilterDialogFragment.id2Option(sortController.getCheckedRadioButtonId(), SortFilterDialogFragment.sSortOrderIds, SortFilterDialogFragment.sSortOptions), SortFilterDialogFragment.id2Option(sortController.getCheckedRadioButtonId(), SortFilterDialogFragment.sSortOrderIds, SortFilterDialogFragment.sOrderOptions));
                }
            }

            
            {
                this$0 = SortFilterDialogFragment.this;
                filterController = radiobuttoncontroller;
                sortController = radiobuttoncontroller1;
                super();
            }
        }).setNegativeButton(0x7f0900a0, new android.content.DialogInterface.OnClickListener() {

            final SortFilterDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = SortFilterDialogFragment.this;
                super();
            }
        }).create();
        bundle.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

            final SortFilterDialogFragment this$0;

            public void onShow(DialogInterface dialoginterface)
            {
                dialoginterface = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "list sort").putString("section", "lists");
                MessageBus.getBus().post(dialoginterface);
            }

            
            {
                this$0 = SortFilterDialogFragment.this;
                super();
            }
        });
        return bundle;
    }

    public void setOnSortFilterOptionsSelectedListener(OnSortFilterOptionsSelectedListener onsortfilteroptionsselectedlistener)
    {
        mSelectionListener = onsortfilteroptionsselectedlistener;
    }








}
