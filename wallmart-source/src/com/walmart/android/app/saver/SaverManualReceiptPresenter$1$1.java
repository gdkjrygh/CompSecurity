// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.DatePickerDialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverManualReceiptPresenter

class val.calendar
    implements android.app.er
{

    final val.calendar this$1;
    final Calendar val$calendar;

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        val$calendar.set(i, j, k);
        SaverManualReceiptPresenter.access$000(_fld0).setText(EReceiptsContractUtil.RECEIPT_SIMPLE_PRINT_FORMAT.format(val$calendar.getTime()));
    }

    l.today()
    {
        this$1 = final_today;
        val$calendar = Calendar.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/saver/SaverManualReceiptPresenter$1

/* anonymous class */
    class SaverManualReceiptPresenter._cls1
        implements android.view.View.OnClickListener
    {

        final SaverManualReceiptPresenter this$0;
        final Calendar val$today;

        public void onClick(View view)
        {
            view = Calendar.getInstance();
            try
            {
                if (!TextUtils.isEmpty(SaverManualReceiptPresenter.access$000(SaverManualReceiptPresenter.this).getText()))
                {
                    view.setTime(EReceiptsContractUtil.RECEIPT_SIMPLE_PRINT_FORMAT.parse(String.valueOf(SaverManualReceiptPresenter.access$000(SaverManualReceiptPresenter.this).getText())));
                }
            }
            catch (Exception exception) { }
            view = new DatePickerDialog(SaverManualReceiptPresenter.access$100(SaverManualReceiptPresenter.this), view. new SaverManualReceiptPresenter._cls1._cls1(), view.get(1), view.get(2), view.get(5));
            view.getDatePicker().setMaxDate(today.getTimeInMillis());
            view.show();
        }

            
            {
                this$0 = final_savermanualreceiptpresenter;
                today = Calendar.this;
                super();
            }
    }

}
