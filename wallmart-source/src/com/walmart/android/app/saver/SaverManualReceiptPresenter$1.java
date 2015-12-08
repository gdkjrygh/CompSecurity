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

class val.today
    implements android.view.ceiptPresenter._cls1
{

    final SaverManualReceiptPresenter this$0;
    final Calendar val$today;

    public void onClick(final View calendar)
    {
        calendar = Calendar.getInstance();
        try
        {
            if (!TextUtils.isEmpty(SaverManualReceiptPresenter.access$000(SaverManualReceiptPresenter.this).getText()))
            {
                calendar.setTime(EReceiptsContractUtil.RECEIPT_SIMPLE_PRINT_FORMAT.parse(String.valueOf(SaverManualReceiptPresenter.access$000(SaverManualReceiptPresenter.this).getText())));
            }
        }
        catch (Exception exception) { }
        calendar = new DatePickerDialog(SaverManualReceiptPresenter.access$100(SaverManualReceiptPresenter.this), new android.app.DatePickerDialog.OnDateSetListener() {

            final SaverManualReceiptPresenter._cls1 this$1;
            final Calendar val$calendar;

            public void onDateSet(DatePicker datepicker, int i, int j, int k)
            {
                calendar.set(i, j, k);
                SaverManualReceiptPresenter.access$000(this$0).setText(EReceiptsContractUtil.RECEIPT_SIMPLE_PRINT_FORMAT.format(calendar.getTime()));
            }

            
            {
                this$1 = SaverManualReceiptPresenter._cls1.this;
                calendar = calendar1;
                super();
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        calendar.getDatePicker().setMaxDate(val$today.getTimeInMillis());
        calendar.show();
    }

    _cls1.val.calendar()
    {
        this$0 = final_savermanualreceiptpresenter;
        val$today = Calendar.this;
        super();
    }
}
