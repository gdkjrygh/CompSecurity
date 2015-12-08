// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;

// Referenced classes of package com.weather.commons.ups.ui:
//            AbstractLoginActivity, SaveDemographicsInfoTask

private class <init> extends AsyncTask
{

    final onPostExecute this$1;

    private void saveDemographicsInfo(Demographics demographics)
    {
        ProgressDialog progressdialog = new ProgressDialog(this._cls1.this.<init>);
        (new SaveDemographicsInfoTask(_fld1, progressdialog)).execute(new Demographics[] {
            demographics
        });
    }

    protected transient Demographics doInBackground(Void avoid[])
    {
        avoid = null;
        Demographics demographics;
        try
        {
            demographics = accountManager.getDemographics();
        }
        catch (Exception exception)
        {
            Log.e("LoginActivity", exception.getMessage());
            return avoid;
        }
        avoid = demographics;
        BasicDemographicsStorage.getInstance().write(demographics);
        return demographics;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Demographics demographics)
    {
        if (demographics == null || doInBackground(this._cls1.this) == null || demographics.getFirstName() != null && !demographics.getFirstName().isEmpty() || demographics.getLastName() != null && !demographics.getLastName().isEmpty() || demographics.getTwcAccountEmail() != null && !demographics.getTwcAccountEmail().isEmpty())
        {
            return;
        } else
        {
            demographics = new Demographics();
            demographics.setUserDetails(this._mth1(this._cls1.this));
            saveDemographicsInfo(demographics);
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Demographics)obj);
    }

    private ()
    {
        this$1 = this._cls1.this;
        super();
    }

    this._cls1(this._cls1 _pcls1_1)
    {
        this();
    }
}
