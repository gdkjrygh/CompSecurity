// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ProgressDialog;
import android.content.Context;

public final class hcp extends ProgressDialog
{

    private hcp(Context context)
    {
        super(context);
    }

    public static hcp a(Context context, String s)
    {
        context = new hcp(context);
        context.setCancelable(false);
        context.setCanceledOnTouchOutside(false);
        context.setIndeterminate(true);
        context.setMessage(s);
        context.setProgress(0);
        return context;
    }
}
