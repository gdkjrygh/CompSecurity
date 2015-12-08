// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.walmart.android.service.saver.SaverContractUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptItemListAdapter

public class SaverReceiptFilteredListAdapter extends BaseAdapter
    implements BasicFilterAdapter.DelegateAdapter, BasicFilterAdapter.FilteredAdapter
{
    private static class ReceiptWithItems
    {

        private final SaverReceiptItemListAdapter mAdapter;
        private final EReceipt mReceipt;
        private String mSectionHeader;

        private void setItems(List list)
        {
            mAdapter.setItems(list);
        }




/*
        static String access$102(ReceiptWithItems receiptwithitems, String s)
        {
            receiptwithitems.mSectionHeader = s;
            return s;
        }

*/



        private ReceiptWithItems(Activity activity, EReceipt ereceipt)
        {
            mReceipt = ereceipt;
            mAdapter = new SaverReceiptItemListAdapter(activity);
        }

    }


    private static final DateFormat DAY_OF_MONTH_FORMAT = new SimpleDateFormat("d");
    private static final DateFormat DAY_OF_WEEK_FORMAT = new SimpleDateFormat("EEE");
    private static final DateFormat SECTION_HEADER_FORMAT = new SimpleDateFormat("MMMM yyyy");
    private static final String TAG = com/walmart/android/app/saver/SaverReceiptFilteredListAdapter.getSimpleName();
    private final Activity mActivity;
    private List mData;
    private AsyncTask mDataTask;
    private View mEmptyView;
    private boolean mEnabled;
    private String mSearchQuery;

    public SaverReceiptFilteredListAdapter(Activity activity)
    {
        mActivity = activity;
    }

    private void populateFields(View view, ReceiptWithItems receiptwithitems)
    {
        ViewUtil.setTextHideIfEmpty(0x7f1004aa, view, receiptwithitems.mSectionHeader);
        Calendar calendar = Calendar.getInstance();
        Object obj;
        int k;
        int l;
        try
        {
            calendar.setTime(EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(receiptwithitems.mReceipt.localDate));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            calendar.setTimeInMillis(receiptwithitems.mReceipt.getTimeInMs());
        }
        ViewUtil.setTextHideIfEmpty(0x7f100102, view, DAY_OF_MONTH_FORMAT.format(calendar.getTime()));
        ViewUtil.setTextHideIfEmpty(0x7f100103, view, DAY_OF_WEEK_FORMAT.format(calendar.getTime()).toLowerCase(Locale.US));
        ViewUtil.findViewById(view, 0x7f1004ac).setVisibility(8);
        ViewUtil.findViewById(view, 0x7f1004b0).setVisibility(8);
        ViewUtil.setTextHideIfEmpty(0x7f100104, view, receiptwithitems.mReceipt.getFormattedAddressLine1());
        ViewUtil.setTextHideIfEmpty(0x7f100105, view, receiptwithitems.mReceipt.getFormattedAddressLine2());
        ViewUtil.setTextHideIfEmpty(0x7f1004af, view, mActivity.getResources().getQuantityString(0x7f110003, receiptwithitems.mReceipt.itemsSold, new Object[] {
            Integer.valueOf(receiptwithitems.mReceipt.itemsSold)
        }));
        ViewUtil.setTextHideIfEmpty(0x7f1004ae, view, mActivity.getString(0x7f0900fc, new Object[] {
            Float.valueOf(receiptwithitems.mReceipt.getPriceInDollar())
        }));
        obj = (ViewGroup)ViewUtil.findViewById(view, 0x7f1004b2);
        l = ((ViewGroup) (obj)).getChildCount();
        k = receiptwithitems.mAdapter.getCount();
        for (int i = k * 2 - 1; i < l; i++)
        {
            ((ViewGroup) (obj)).getChildAt(i).setVisibility(8);
        }

        int j = 0;
        while (j < k * 2 - 1) 
        {
            View view1 = ((ViewGroup) (obj)).getChildAt(j);
            if (j % 2 == 0)
            {
                view = receiptwithitems.mAdapter.getView(j / 2, view1, ((ViewGroup) (obj)));
                ViewUtil.findViewById(view, 0x7f1004dc).setBackgroundDrawable(null);
            } else
            if (view1 == null)
            {
                view = new View(mActivity);
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, 1));
                view.setBackgroundColor(mActivity.getResources().getColor(0x7f0f003c));
            } else
            {
                view = view1;
            }
            if (view1 == null)
            {
                ((ViewGroup) (obj)).addView(view, j);
            } else
            {
                view1.setVisibility(0);
            }
            j++;
        }
    }

    public void cancelSetData()
    {
        if (mDataTask != null)
        {
            mDataTask.cancel(true);
        }
    }

    public void clearAll()
    {
        if (mData != null)
        {
            mData.clear();
        }
        mData = null;
        mSearchQuery = null;
        notifyDataSetChanged();
    }

    public int getCount()
    {
        if (mData == null || mData.isEmpty())
        {
            return 1;
        } else
        {
            return mData.size();
        }
    }

    public Object getItem(int i)
    {
        if (mData == null || mData.isEmpty())
        {
            return null;
        } else
        {
            return ((ReceiptWithItems)mData.get(i)).mReceipt;
        }
    }

    public long getItemId(int i)
    {
        if (mData == null || mData.isEmpty())
        {
            return 0L;
        } else
        {
            return ((ReceiptWithItems)mData.get(i)).mReceipt.rowId;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if ((mData == null || mData.isEmpty()) && mEmptyView == null)
        {
            mEmptyView = ViewUtil.inflate(mActivity, 0x7f04014b, viewgroup, false);
        }
        if (mData == null || mData.isEmpty())
        {
            int k;
            if (mData != null)
            {
                ViewUtil.findViewById(mEmptyView, 0x7f100096).setVisibility(8);
                ViewUtil.findViewById(mEmptyView, 0x7f10047e).setVisibility(0);
            } else
            {
                ViewUtil.findViewById(mEmptyView, 0x7f100096).setVisibility(0);
                ViewUtil.findViewById(mEmptyView, 0x7f10047e).setVisibility(8);
            }
            i = viewgroup.getHeight();
            k = i;
            if (viewgroup instanceof ListView)
            {
                int l = ((ListView)viewgroup).getHeaderViewsCount();
                int j = 0;
                do
                {
                    k = i;
                    if (j >= l)
                    {
                        break;
                    }
                    k = i;
                    if (j >= viewgroup.getChildCount())
                    {
                        break;
                    }
                    view = viewgroup.getChildAt(j);
                    k = i;
                    if (view != null)
                    {
                        k = i - view.getHeight();
                    }
                    j++;
                    i = k;
                } while (true);
            }
            ViewUtil.setText(0x7f10047f, mEmptyView, 0x7f090503, new Object[] {
                mSearchQuery
            });
            mEmptyView.setMinimumHeight(k);
            return mEmptyView;
        }
        if (view == null || view == mEmptyView)
        {
            view = ViewUtil.inflate(mActivity, 0x7f040155, viewgroup, false);
        }
        ViewUtil.findViewById(view, 0x7f1004b1).setVisibility(0);
        ViewUtil.findViewById(view, 0x7f1004b2).setVisibility(0);
        populateFields(view, (ReceiptWithItems)mData.get(i));
        return view;
    }

    public boolean isConvertView(View view)
    {
        return view != null && (view == mEmptyView || view.getId() == 0x7f1004a9);
    }

    public boolean isEnabled(int i)
    {
        return mEnabled && mData != null && !mData.isEmpty();
    }

    public void setData(final String searchQuery, Cursor cursor)
    {
        if (mDataTask != null)
        {
            mDataTask.cancel(true);
        }
        mDataTask = new AsyncTask() {

            final SaverReceiptFilteredListAdapter this$0;
            final String val$searchQuery;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Cursor[])aobj);
            }

            protected transient List doInBackground(Cursor acursor[])
            {
                Object obj;
                Cursor cursor1;
                cursor1 = acursor[0];
                obj = null;
                if (cursor1 == null) goto _L2; else goto _L1
_L1:
                ArrayList arraylist;
                ArrayList arraylist1;
                Date date;
                arraylist = new ArrayList();
                acursor = null;
                date = new Date();
                obj = "";
                arraylist1 = new ArrayList();
_L4:
label0:
                {
label1:
                    {
                        if (!cursor1.moveToNext() || isCancelled())
                        {
                            break label0;
                        }
                        EReceipt ereceipt = EReceiptsContractUtil.populateEReceipt(cursor1, new EReceipt());
                        com.walmart.android.service.saver.SaverReceipt.Item item = SaverContractUtil.populateSaverReceiptItem(cursor1, (com.walmart.android.service.saver.SaverReceipt.Item)EReceiptsContractUtil.populateEReceiptItem(cursor1, new com.walmart.android.service.saver.SaverReceipt.Item()));
                        Object obj1;
                        Object obj2;
                        if (acursor != null)
                        {
                            obj1 = acursor;
                            obj2 = obj;
                            if (((ReceiptWithItems) (acursor)).mReceipt.rowId == ereceipt.rowId)
                            {
                                break label1;
                            }
                        }
                        if (acursor != null)
                        {
                            acursor.setItems(arraylist1);
                        }
                        ReceiptWithItems receiptwithitems = new ReceiptWithItems(mActivity, ereceipt);
                        arraylist1.clear();
                        arraylist.add(receiptwithitems);
                        try
                        {
                            acursor = SaverReceiptFilteredListAdapter.SECTION_HEADER_FORMAT.format(EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(ereceipt.localDate));
                        }
                        // Misplaced declaration of an exception variable
                        catch (Cursor acursor[])
                        {
                            date.setTime(ereceipt.getTimeInMs());
                            acursor = SaverReceiptFilteredListAdapter.SECTION_HEADER_FORMAT.format(date);
                        }
                        obj1 = receiptwithitems;
                        obj2 = obj;
                        if (!acursor.equals(obj))
                        {
                            receiptwithitems.mSectionHeader = acursor;
                            obj2 = acursor;
                            obj1 = receiptwithitems;
                        }
                    }
                    arraylist1.add(item);
                    acursor = ((Cursor []) (obj1));
                    obj = obj2;
                    continue; /* Loop/switch isn't completed */
                }
                obj = arraylist;
                if (acursor != null)
                {
                    acursor.setItems(arraylist1);
                    obj = arraylist;
                }
_L2:
                return ((List) (obj));
                if (true) goto _L4; else goto _L3
_L3:
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((List)obj);
            }

            protected void onPostExecute(List list)
            {
                mSearchQuery = searchQuery;
                mData = list;
                notifyDataSetChanged();
            }

            
            {
                this$0 = SaverReceiptFilteredListAdapter.this;
                searchQuery = s;
                super();
            }
        };
        mDataTask.execute(new Cursor[] {
            cursor
        });
    }

    void setEnabled(boolean flag)
    {
        mEnabled = flag;
    }





/*
    static String access$702(SaverReceiptFilteredListAdapter saverreceiptfilteredlistadapter, String s)
    {
        saverreceiptfilteredlistadapter.mSearchQuery = s;
        return s;
    }

*/


/*
    static List access$802(SaverReceiptFilteredListAdapter saverreceiptfilteredlistadapter, List list)
    {
        saverreceiptfilteredlistadapter.mData = list;
        return list;
    }

*/
}
