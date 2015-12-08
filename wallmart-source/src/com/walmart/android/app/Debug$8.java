// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// Referenced classes of package com.walmart.android.app:
//            Debug

static final class val.dateView
    implements android.view.lickListener
{

    final Context val$context;
    final TextView val$dateView;

    public void onClick(View view)
    {
        view = Calendar.getInstance();
        (new DatePickerDialog(val$context, new android.app.DatePickerDialog.OnDateSetListener() {

            final Debug._cls8 this$0;

            public void onDateSet(DatePicker datepicker, int i, int j, int k)
            {
                datepicker = Calendar.getInstance();
                datepicker.set(i, j, k);
                dateView.setText(EReceiptsContractUtil.LOCAL_DATE_FORMAT.format(datepicker.getTime()));
            }

            
            {
                this$0 = Debug._cls8.this;
                super();
            }
        }, view.get(1), view.get(2), view.get(5))).show();
    }

    _cls1.this._cls0(Context context1, TextView textview)
    {
        val$context = context1;
        val$dateView = textview;
        super();
    }
}
