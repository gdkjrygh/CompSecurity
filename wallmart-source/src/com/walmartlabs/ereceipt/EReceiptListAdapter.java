// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ui.PriceView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class EReceiptListAdapter extends BaseAdapter
{

    private static final String TAG = com/walmartlabs/ereceipt/EReceiptListAdapter.getSimpleName();
    private static final DateFormat sDayOfMonthFormat;
    private static final DateFormat sDayOfWeekFormat;
    private final Calendar mCalendar;
    private final Context mContext;
    private final ArrayList mEReceiptItems = new ArrayList();
    private final SparseArray mSectionForStartPosition = new SparseArray();
    private final HashMap mUuidMap = new HashMap();

    public EReceiptListAdapter(Context context)
    {
        mContext = context;
        mCalendar = Calendar.getInstance(Locale.US);
    }

    private void addItem(EReceipt ereceipt, boolean flag)
    {
        if (ereceipt != null && !mUuidMap.containsKey(ereceipt.uuid))
        {
            mEReceiptItems.add(ereceipt);
            mUuidMap.put(ereceipt.uuid, ereceipt);
            if (flag)
            {
                onDataSetChanged();
                return;
            }
        }
    }

    private void onDataSetChanged()
    {
        updateSections();
        notifyDataSetChanged();
    }

    private void populateFields(View view, EReceipt ereceipt, String s)
    {
        if (ereceipt == null)
        {
            return;
        }
        View view1 = ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.R.id.ereceipt_list_entry_section_container);
        if (!TextUtils.isEmpty(s))
        {
            ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.section_header_text, view1, s);
            view1.setVisibility(0);
        } else
        {
            view1.setVisibility(8);
        }
        mCalendar.setTimeInMillis(ereceipt.getTimeInMs());
        ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.day_of_month, view, sDayOfMonthFormat.format(mCalendar.getTime()));
        ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.day_of_week, view, sDayOfWeekFormat.format(mCalendar.getTime()).toLowerCase(Locale.US));
        ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.address_line_1, view, ereceipt.getFormattedAddressLine1());
        ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.address_line_2, view, ereceipt.getFormattedAddressLine2());
        ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.ereceipt_list_entry_items, view, mContext.getResources().getQuantityString(com.walmartlabs.android.ereceipt.R.plurals.item, ereceipt.itemsSold, new Object[] {
            Integer.valueOf(ereceipt.itemsSold)
        }));
        ((PriceView)ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.R.id.ereceipt_price)).setPrice(mContext.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_price, new Object[] {
            Float.valueOf(ereceipt.getPriceInDollar())
        }));
    }

    private void updateSections()
    {
        mSectionForStartPosition.clear();
        if (mEReceiptItems.size() != 0)
        {
            Collections.sort(mEReceiptItems);
            SimpleDateFormat simpledateformat = new SimpleDateFormat("MMMM yyyy", Locale.US);
            Date date = new Date();
            String s = "";
            int i = 0;
            while (i < mEReceiptItems.size()) 
            {
                date.setTime(((EReceipt)mEReceiptItems.get(i)).getTimeInMs());
                String s2 = simpledateformat.format(date);
                String s1 = s;
                if (!s2.equals(s))
                {
                    s1 = s2;
                    mSectionForStartPosition.put(i, s1);
                }
                i++;
                s = s1;
            }
        }
    }

    public void addItem(EReceipt ereceipt)
    {
        addItem(ereceipt, true);
    }

    public void addItems(EReceipt aereceipt[])
    {
        if (aereceipt == null || aereceipt.length == 0)
        {
            return;
        }
        for (int i = 0; i < aereceipt.length; i++)
        {
            EReceipt ereceipt = aereceipt[i];
            if (ereceipt != null)
            {
                addItem(ereceipt, false);
            }
        }

        onDataSetChanged();
    }

    public void clear()
    {
        mEReceiptItems.clear();
        mUuidMap.clear();
        onDataSetChanged();
    }

    public int getCount()
    {
        return mEReceiptItems.size();
    }

    public List getCustomerReceiptIds()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mEReceiptItems.iterator(); iterator.hasNext(); arraylist.add(Integer.toString(((EReceipt)iterator.next()).customerReceiptId))) { }
        return arraylist;
    }

    public EReceipt getItem(String s)
    {
        return (EReceipt)mUuidMap.get(s);
    }

    public Object getItem(int i)
    {
        return mEReceiptItems.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public EReceipt getReceiptItem(int i)
    {
        if (i < 0 || i >= mEReceiptItems.size())
        {
            return null;
        } else
        {
            return (EReceipt)mEReceiptItems.get(i);
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = ViewUtil.inflate(mContext, com.walmartlabs.android.ereceipt.R.layout.ereceipt_list_entry, viewgroup);
        }
        viewgroup = (String)mSectionForStartPosition.get(i);
        populateFields(view, (EReceipt)mEReceiptItems.get(i), viewgroup);
        return view;
    }

    public void removeItem(int i)
    {
        Iterator iterator = mEReceiptItems.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            EReceipt ereceipt = (EReceipt)iterator.next();
            if (ereceipt.customerReceiptId != i)
            {
                continue;
            }
            removeItem(ereceipt);
            break;
        } while (true);
    }

    public void removeItem(EReceipt ereceipt)
    {
        if (mEReceiptItems.remove(ereceipt))
        {
            mUuidMap.remove(ereceipt.uuid);
            onDataSetChanged();
        }
    }

    public void setItems(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt areceipt[])
    {
        mEReceiptItems.clear();
        mUuidMap.clear();
        addItems(areceipt);
    }

    static 
    {
        sDayOfMonthFormat = new SimpleDateFormat("d", Locale.US);
        sDayOfWeekFormat = new SimpleDateFormat("EEE", Locale.US);
    }
}
