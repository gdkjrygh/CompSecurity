// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.support;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import com.ubercab.rds.core.app.RdsActivity;
import gzo;
import gzs;
import gzz;
import haa;
import hab;
import hac;
import hae;
import hbk;
import hbm;
import hbo;
import hbt;
import hfp;
import hfq;
import hgq;
import java.util.List;

public class SupportPhotoActivity extends RdsActivity
    implements gzs, hac
{

    public SupportPhotoActivity()
    {
    }

    public static Intent a(Context context, String s)
    {
        return (new Intent(context, com/ubercab/rds/feature/support/SupportPhotoActivity)).putExtra("com.ubercab.rds.EXTRA_PHOTO_CAPTION", s);
    }

    private void a(hgq hgq1)
    {
        hgq1.a(this);
    }

    private hgq v()
    {
        return hfp.a().a(new hbt(getApplication())).a();
    }

    private void w()
    {
        Object obj = getIntent().getStringExtra("com.ubercab.rds.EXTRA_PHOTO_CAPTION");
        hab hab1 = (new hab(600, 600)).a(this);
        if (obj == null)
        {
            obj = "";
        }
        obj = hab1.a(((String) (obj))).a(80).a(hae.c).a(gzz.a).b();
        ((haa) (obj)).a(this);
        a(hbk.ub__support_picture_viewgroup_content, ((android.support.v4.app.Fragment) (obj)));
    }

    public final void a(Uri uri)
    {
        setResult(-1, (new Intent()).setData(uri));
        finish();
    }

    public final void a(gzo gzo)
    {
    }

    protected final volatile void a(Object obj)
    {
        a((hgq)obj);
    }

    public final void a(List list)
    {
    }

    public final void b(List list)
    {
    }

    protected final Object c()
    {
        return v();
    }

    public final void f()
    {
    }

    public final void g()
    {
    }

    public final void h()
    {
    }

    public final void i()
    {
    }

    public final void j()
    {
    }

    public final void k()
    {
    }

    public final void l()
    {
    }

    public final void m()
    {
    }

    public final void n()
    {
    }

    public final void o()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(hbm.ub__support_activity_photo);
        b().a(hbo.ub__rds__take_a_photo);
        w();
    }

    public final void p()
    {
    }

    public final void q()
    {
    }

    public final void r()
    {
    }
}
