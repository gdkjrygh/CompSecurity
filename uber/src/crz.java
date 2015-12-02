// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ProgressDialog;
import android.content.Context;

public final class crz extends ProgressDialog
{

    private crz(Context context)
    {
        super(context);
    }

    private static ProgressDialog a(ProgressDialog progressdialog, CharSequence charsequence)
    {
        progressdialog.setMessage(charsequence);
        progressdialog.setIndeterminate(true);
        progressdialog.setCancelable(false);
        progressdialog.setOnDismissListener(null);
        progressdialog.setCanceledOnTouchOutside(false);
        progressdialog.setProgress(0);
        return progressdialog;
    }

    public static ProgressDialog a(Context context, CharSequence charsequence)
    {
        return a(((ProgressDialog) (new crz(context))), charsequence);
    }
}
