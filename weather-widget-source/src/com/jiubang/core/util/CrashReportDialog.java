// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.util;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Button;
import com.gtp.a.a.b.c;

// Referenced classes of package com.jiubang.core.util:
//            ErrorReporter

public class CrashReportDialog extends Activity
{

    private static final String TAG = "zyp";
    String mReportFileName;

    public CrashReportDialog()
    {
        mReportFileName = null;
    }

    private void onNo()
    {
        finish();
        System.exit(0);
    }

    private void onYes()
    {
        try
        {
            Object obj = ErrorReporter.getInstance();
            obj.getClass();
            obj = new ErrorReporter.ReportsSenderWorker(((ErrorReporter) (obj)));
            ((ErrorReporter.ReportsSenderWorker) (obj)).setCommentReportFileName(mReportFileName);
            ((ErrorReporter.ReportsSenderWorker) (obj)).start();
        }
        catch (Exception exception)
        {
            c.b("zyp", "", exception);
        }
        finish();
    }

    protected void cancelNotification()
    {
        ((NotificationManager)getSystemService("notification")).cancel(666);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.i("====", "CrashReportDialog on create");
        requestWindowFeature(1);
        setContentView(0x7f0300ef);
        getWindow().clearFlags(0x8000000);
        mReportFileName = getIntent().getStringExtra("REPORT_FILE_NAME");
        if (mReportFileName == null)
        {
            Log.i("====", "CrashReportDialog return");
            finish();
        }
        Log.i("====", "CrashReportDialog before button");
        bundle = (Button)findViewById(0x7f0904d9);
        Button button = (Button)findViewById(0x7f0904da);
        bundle.setOnClickListener(new _cls1());
        button.setOnClickListener(new _cls2());
        cancelNotification();
    }

    protected void onStop()
    {
        super.onStop();
        finish();
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CrashReportDialog this$0;

        public void onClick(View view)
        {
            onYes();
        }

        _cls1()
        {
            this$0 = CrashReportDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CrashReportDialog this$0;

        public void onClick(View view)
        {
            onNo();
        }

        _cls2()
        {
            this$0 = CrashReportDialog.this;
            super();
        }
    }

}
