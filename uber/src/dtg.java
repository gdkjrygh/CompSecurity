// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ProgressDialog;
import android.content.Context;

public final class dtg extends ProgressDialog
{

    private dtg(Context context)
    {
        super(context);
    }

    private dtg(Context context, byte byte0)
    {
        super(context, 3);
    }

    private static ProgressDialog a(ProgressDialog progressdialog, CharSequence charsequence, boolean flag, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        progressdialog.setMessage(charsequence);
        progressdialog.setIndeterminate(true);
        progressdialog.setCancelable(flag);
        progressdialog.setOnDismissListener(ondismisslistener);
        progressdialog.setCanceledOnTouchOutside(false);
        progressdialog.setProgress(0);
        return progressdialog;
    }

    public static ProgressDialog a(Context context, CharSequence charsequence)
    {
        return a(context, charsequence, false, null);
    }

    public static ProgressDialog a(Context context, CharSequence charsequence, boolean flag, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        return a(((ProgressDialog) (new dtg(context))), charsequence, flag, ondismisslistener);
    }

    public static ProgressDialog b(Context context, CharSequence charsequence)
    {
        return a(new dtg(context, (byte)0), charsequence, true, null);
    }
}
