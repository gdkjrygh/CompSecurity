// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Environment;
import android.os.StatFs;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.common.e.e;
import com.google.android.apps.youtube.common.e.k;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.a;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.youtube.j;
import com.google.android.youtube.p;
import com.google.android.youtube.r;
import java.io.File;

public class StorageBarPreference extends Preference
{

    private Context a;
    private final boolean b;

    public StorageBarPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = context;
        context = context.obtainStyledAttributes(attributeset, r.E);
        b = context.getBoolean(0, false);
        context.recycle();
    }

    public StorageBarPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = context;
        context = context.obtainStyledAttributes(attributeset, r.E);
        b = context.getBoolean(0, false);
        context.recycle();
    }

    protected void onBindView(View view)
    {
        long l1 = 0L;
        super.onBindView(view);
        Object obj1 = ((BaseApplication)a.getApplicationContext()).y();
        Object obj;
        long l;
        if (b)
        {
            obj = ((a) (obj1)).bo();
            obj1 = ((a) (obj1)).bs();
            if (!((k) (obj1)).b())
            {
                l = 0L;
            } else
            {
                obj1 = new StatFs(((k) (obj1)).c().getAbsolutePath());
                l = ((StatFs) (obj1)).getAvailableBlocks();
                l = (long)((StatFs) (obj1)).getBlockSize() * l;
            }
            l = Util.a(l);
        } else
        {
            obj = ((a) (obj1)).bn();
            if (!"mounted".equals(Environment.getExternalStorageState()))
            {
                l = 0L;
            } else
            {
                l = e.c(Environment.getExternalStorageDirectory());
            }
            l = Util.a(l);
        }
        if (obj != null)
        {
            l1 = Util.a(((com.google.android.exoplayer.upstream.cache.a) (obj)).b());
        }
        obj = (ProgressBar)view.findViewById(j.eS);
        ((ProgressBar) (obj)).setMax(1000);
        ((ProgressBar) (obj)).setProgress((int)((1000F * (float)l1) / ((float)l1 + (float)l)));
        ((TextView)view.findViewById(j.eU)).setText(a.getResources().getString(p.dY, new Object[] {
            m.a(l1)
        }));
        ((TextView)view.findViewById(j.eT)).setText(a.getResources().getString(p.dX, new Object[] {
            m.a(l)
        }));
    }
}
