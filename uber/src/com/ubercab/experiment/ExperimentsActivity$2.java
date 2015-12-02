// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.experiment;

import android.app.Activity;
import android.app.ProgressDialog;
import com.ubercab.experiment.model.ExperimentDefinitions;
import gmg;
import gmv;
import java.util.concurrent.atomic.AtomicBoolean;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.experiment:
//            ExperimentsActivity

final class e
    implements Callback
{

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

    tions(Activity activity, ProgressDialog progressdialog, AtomicBoolean atomicboolean, gmv agmv[], gmg gmg)
    {
        a = activity;
        b = progressdialog;
        c = atomicboolean;
        d = agmv;
        e = gmg;
        super();
    }
}
