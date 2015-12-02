// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;

public final class dtf extends AlertDialog
{

    private dtf(Context context)
    {
        super(context);
    }

    public static AlertDialog a(Context context)
    {
        return new dtf(context);
    }
}
