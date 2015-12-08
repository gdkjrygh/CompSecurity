// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.DatePickerDialog;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFeedbackPresenter

class this._cls0 extends OnSingleClickListener
{

    final SaverFeedbackPresenter this$0;

    public void onSingleClick(View view)
    {
        SaverFeedbackPresenter.access$200(SaverFeedbackPresenter.this);
        view = new android.app.DatePickerDialog.OnDateSetListener() {

            final SaverFeedbackPresenter._cls4 this$1;

            public void onDateSet(DatePicker datepicker, int i, int j, int k)
            {
                SaverFeedbackPresenter.access$300(this$0).set(1, i);
                SaverFeedbackPresenter.access$300(this$0).set(2, j);
                SaverFeedbackPresenter.access$300(this$0).set(5, k);
                SaverFeedbackPresenter.access$500(this$0).setText(SaverFeedbackPresenter.access$400().format(SaverFeedbackPresenter.access$300(this$0).getTime()));
            }

            
            {
                this$1 = SaverFeedbackPresenter._cls4.this;
                super();
            }
        };
        view = new DatePickerDialog(SaverFeedbackPresenter.access$600(SaverFeedbackPresenter.this), view, SaverFeedbackPresenter.access$300(SaverFeedbackPresenter.this).get(1), SaverFeedbackPresenter.access$300(SaverFeedbackPresenter.this).get(2), SaverFeedbackPresenter.access$300(SaverFeedbackPresenter.this).get(5));
        long l;
        if (SaverFeedbackPresenter.access$700(SaverFeedbackPresenter.this) != null)
        {
            l = SaverFeedbackPresenter.access$700(SaverFeedbackPresenter.this).getTime();
        } else
        {
            l = SaverFeedbackPresenter.access$800(SaverFeedbackPresenter.this).getTimeInMillis();
        }
        view.getDatePicker().setMaxDate(l);
        view.show();
    }

    _cls1.this._cls1(Presenter presenter)
    {
        this$0 = SaverFeedbackPresenter.this;
        super(presenter);
    }
}
