// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.Cursor;
import android.os.AsyncTask;
import com.walmart.android.service.saver.SaverContractUtil;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptFilteredListAdapter

class val.searchQuery extends AsyncTask
{

    final SaverReceiptFilteredListAdapter this$0;
    final String val$searchQuery;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Cursor[])aobj);
    }

    protected transient List doInBackground(Cursor acursor[])
    {
        Object obj;
        Cursor cursor;
        cursor = acursor[0];
        obj = null;
        if (cursor == null) goto _L2; else goto _L1
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
                if (!cursor.moveToNext() || isCancelled())
                {
                    break label0;
                }
                EReceipt ereceipt = EReceiptsContractUtil.populateEReceipt(cursor, new EReceipt());
                com.walmart.android.service.saver.tWithItems twithitems = SaverContractUtil.populateSaverReceiptItem(cursor, (com.walmart.android.service.saver.eiptItem)EReceiptsContractUtil.populateEReceiptItem(cursor, new com.walmart.android.service.saver.iptItem()));
                Object obj1;
                Object obj2;
                if (acursor != null)
                {
                    obj1 = acursor;
                    obj2 = obj;
                    if (ceiptWithItems.access._mth000(acursor).rowId == ereceipt.rowId)
                    {
                        break label1;
                    }
                }
                if (acursor != null)
                {
                    ceiptWithItems.access._mth300(acursor, arraylist1);
                }
                ceiptWithItems ceiptwithitems = new ceiptWithItems(SaverReceiptFilteredListAdapter.access$400(SaverReceiptFilteredListAdapter.this), ereceipt, null);
                arraylist1.clear();
                arraylist.add(ceiptwithitems);
                try
                {
                    acursor = SaverReceiptFilteredListAdapter.access$600().format(EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(ereceipt.localDate));
                }
                // Misplaced declaration of an exception variable
                catch (Cursor acursor[])
                {
                    date.setTime(ereceipt.getTimeInMs());
                    acursor = SaverReceiptFilteredListAdapter.access$600().format(date);
                }
                obj1 = ceiptwithitems;
                obj2 = obj;
                if (!acursor.equals(obj))
                {
                    ceiptWithItems.access._mth102(ceiptwithitems, acursor);
                    obj2 = acursor;
                    obj1 = ceiptwithitems;
                }
            }
            arraylist1.add(twithitems);
            acursor = ((Cursor []) (obj1));
            obj = obj2;
            continue; /* Loop/switch isn't completed */
        }
        obj = arraylist;
        if (acursor != null)
        {
            ceiptWithItems.access._mth300(acursor, arraylist1);
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
        SaverReceiptFilteredListAdapter.access$702(SaverReceiptFilteredListAdapter.this, val$searchQuery);
        SaverReceiptFilteredListAdapter.access$802(SaverReceiptFilteredListAdapter.this, list);
        notifyDataSetChanged();
    }

    ceiptWithItems()
    {
        this$0 = final_saverreceiptfilteredlistadapter;
        val$searchQuery = String.this;
        super();
    }
}
