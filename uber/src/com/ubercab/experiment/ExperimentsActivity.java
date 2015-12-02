// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.experiment;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.ubercab.experiment.model.ExperimentDefinitions;
import com.ubercab.experiment.model.Experiments;
import com.ubercab.experiment.network.ExperimentApi;
import gmg;
import gms;
import gmv;
import gmw;
import java.util.concurrent.atomic.AtomicBoolean;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class ExperimentsActivity extends Activity
{

    public ExperimentsActivity()
    {
    }

    public static void a(Activity activity, gmg gmg1, gmv agmv[])
    {
        AtomicBoolean atomicboolean = new AtomicBoolean(false);
        ProgressDialog progressdialog = ProgressDialog.show(activity, null, activity.getString(gms.loading_experiments), true, true, new android.content.DialogInterface.OnCancelListener(atomicboolean) {

            final AtomicBoolean a;

            public final void onCancel(DialogInterface dialoginterface)
            {
                a.set(true);
            }

            
            {
                a = atomicboolean;
                super();
            }
        });
        gmg1.a().getExperimentDefinitions(new Callback(activity, progressdialog, atomicboolean, agmv, gmg1) {

            final Activity a;
            final ProgressDialog b;
            final AtomicBoolean c;
            final gmv d[];
            final gmg e;

            private void a(ExperimentDefinitions experimentdefinitions)
            {
            /* block-local class not found */
            class _cls1 {}

                a.runOnUiThread(new _cls1(experimentdefinitions));
            }

            public final void failure(RetrofitError retrofiterror)
            {
            /* block-local class not found */
            class _cls2 {}

                a.runOnUiThread(new _cls2(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((ExperimentDefinitions)obj);
            }

            
            {
                a = activity;
                b = progressdialog;
                c = atomicboolean;
                d = agmv;
                e = gmg1;
                super();
            }
        });
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayHomeAsUpEnabled(true);
        }
        bundle = (Experiments)getIntent().getParcelableExtra("current_treatments");
        ExperimentDefinitions experimentdefinitions = (ExperimentDefinitions)getIntent().getParcelableExtra("experiment_definitions");
        if (bundle != null && experimentdefinitions != null)
        {
            getFragmentManager().beginTransaction().replace(0x1020002, gmw.a(bundle, experimentdefinitions, getIntent().getStringExtra("override_preference_file"))).commit();
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onMenuItemSelected(i, menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }
}
