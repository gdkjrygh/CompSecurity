// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.help;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import com.ubercab.rds.core.app.RdsMvcActivity;
import gpz;
import hbo;
import hdi;

public class HelpActivity extends RdsMvcActivity
{

    public HelpActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/ubercab/rds/feature/help/HelpActivity);
    }

    public static void b(Context context)
    {
        context.startActivity((new Intent(context, com/ubercab/rds/feature/help/HelpActivity)).addFlags(0x4000000));
    }

    protected final gpz c()
    {
        ActionBar actionbar = b();
        actionbar.b(true);
        actionbar.a(getString(hbo.ub__rds__help));
        return new hdi(this);
    }
}
