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
import hdu;

public class HelpSupportActivity extends RdsMvcActivity
{

    public HelpSupportActivity()
    {
    }

    public static Intent a(Context context, String s)
    {
        return (new Intent(context, com/ubercab/rds/feature/help/HelpSupportActivity)).putExtra("com.ubercab.rds.NODE_UUID", s);
    }

    protected final gpz c()
    {
        ActionBar actionbar = b();
        actionbar.b(true);
        actionbar.a(getString(hbo.ub__rds__help));
        return new hdu(this, getIntent().getStringExtra("com.ubercab.rds.NODE_UUID"));
    }
}
