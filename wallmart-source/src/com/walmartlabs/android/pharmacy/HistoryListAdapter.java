// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.lang3.text.WordUtils;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyUtils

public class HistoryListAdapter extends BaseAdapter
{

    private static final String TAG = com/walmartlabs/android/pharmacy/HistoryListAdapter.getSimpleName();
    private static final SimpleDateFormat sHeaderFormat;
    private static final SimpleDateFormat sLastRefillFormat;
    private static final SimpleDateFormat sRefillFormat;
    private final Context mContext;
    private final ArrayList mList = new ArrayList();
    private final SparseArray mSectionForStartPosition = new SparseArray();
    private boolean mShowSections;

    public HistoryListAdapter(Context context)
    {
        mContext = context;
        setupTestFairy();
    }

    private void populateFields(View view, com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill rxfill, String s)
    {
        if (rxfill == null)
        {
            return;
        }
        TextView textview = (TextView)ViewUtil.findViewById(view, R.id.history_list_entry_date_header);
        int i;
        if (!TextUtils.isEmpty(s))
        {
            textview.setText(s.toUpperCase(Locale.US));
            textview.setVisibility(0);
        } else
        {
            textview.setVisibility(8);
        }
        try
        {
            s = sRefillFormat.parse(rxfill.fillDate);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            s = new Date();
        }
        ViewUtil.setText(R.id.history_fill_date, view, mContext.getString(R.string.pharmacy_ordered_date, new Object[] {
            sLastRefillFormat.format(s)
        }));
        i = R.id.drug;
        if (!TextUtils.isEmpty(rxfill.dispensedDrugName))
        {
            s = rxfill.dispensedDrugName;
        } else
        {
            s = rxfill.prescribedDrugName;
        }
        ViewUtil.setText(i, view, WordUtils.capitalizeFully(s));
        ViewUtil.setText(R.id.rxnbr, view, mContext.getString(R.string.pharmacy_rx_number, new Object[] {
            Integer.valueOf(rxfill.rxNumber)
        }));
        setUpFillStatusFlag(view, rxfill);
        if (TextUtils.isEmpty(rxfill.fillStatus) || rxfill.isFillStatusIn(new String[] {
    "PROCESSING", "ACKNOWLEDGED", "CANCELLED"
}))
        {
            ViewUtil.findViewById(view, R.id.price).setVisibility(4);
            return;
        } else
        {
            ViewUtil.setText(R.id.price, view, mContext.getString(R.string.pharmacy_price, new Object[] {
                Float.valueOf(rxfill.customerPriceForRx)
            }));
            ViewUtil.findViewById(view, R.id.price).setVisibility(0);
            return;
        }
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(R.id.drug);
        TestFairyUtils.hideView(R.id.rxnbr);
    }

    private void updateSections()
    {
        mSectionForStartPosition.clear();
        if (mList.size() != 0 && mShowSections) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        int i;
        s1 = "";
        i = 0;
_L4:
        String s;
        if (i >= mList.size())
        {
            continue; /* Loop/switch isn't completed */
        }
        s = s1;
        Object obj = sRefillFormat.parse(((com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill)mList.get(i)).fillDate);
        s = s1;
        String s2 = sHeaderFormat.format(((Date) (obj)));
        obj = s1;
        s = s1;
        if (!s2.equals(s1))
        {
            obj = s2;
            s = ((String) (obj));
            try
            {
                mSectionForStartPosition.put(i, obj);
            }
            catch (ParseException parseexception)
            {
                parseexception.printStackTrace();
                obj = s;
            }
        }
        i++;
        s1 = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    public int getCount()
    {
        return mList.size();
    }

    public Object getItem(int i)
    {
        return mList.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = ViewUtil.inflate(mContext, R.layout.pharmacy_history_list_entry, viewgroup);
        }
        viewgroup = (String)mSectionForStartPosition.get(i);
        populateFields(view, (com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill)mList.get(i), viewgroup);
        return view;
    }

    public void notifyDataSetChanged()
    {
        updateSections();
        super.notifyDataSetChanged();
    }

    public void setItems(ArrayList arraylist)
    {
        mList.clear();
        if (arraylist != null)
        {
            mList.addAll(arraylist);
        }
        notifyDataSetChanged();
    }

    public void setShowSections(boolean flag)
    {
        if (mShowSections != flag)
        {
            mShowSections = flag;
            notifyDataSetChanged();
        }
    }

    public void setUpFillStatusFlag(View view, com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill rxfill)
    {
        if (!TextUtils.isEmpty(rxfill.fillStatus))
        {
            int i = PharmacyUtils.mapFillStatusToFlagResId(rxfill);
            int j = PharmacyUtils.mapFillStatusToStringResId(rxfill);
            if (i != 0 && j != 0)
            {
                rxfill = (TextView)ViewUtil.findViewById(view, R.id.history_list_entry_status);
                rxfill.setBackgroundResource(i);
                rxfill.setText(j);
                ViewUtil.findViewById(view, R.id.history_list_entry_status).setVisibility(0);
                return;
            } else
            {
                ViewUtil.findViewById(view, R.id.history_list_entry_status).setVisibility(8);
                return;
            }
        } else
        {
            ViewUtil.findViewById(view, R.id.history_list_entry_status).setVisibility(8);
            return;
        }
    }

    static 
    {
        sRefillFormat = new SimpleDateFormat("MMddyyyy", Locale.US);
        sHeaderFormat = new SimpleDateFormat("MMMM yyyy", Locale.US);
        sLastRefillFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
    }
}
