// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.EditText;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;
import com.weather.util.ui.ValueAdapterSupport;

// Referenced classes of package com.weather.commons.ups.ui:
//            ProfileCompletionFragment

private class <init> extends AsyncTask
{

    final AccountManager accountManager;
    final ProfileCompletionFragment this$0;

    private void selectAgeRange(String s)
    {
        s = com.weather.dal2.ups.oTask(s);
        if (s != null)
        {
            ProfileCompletionFragment.access$300(ProfileCompletionFragment.this).selectItem(s);
        }
    }

    private void setGender(String s)
    {
        com.weather.dal2.ups.oTask aotask[] = com.weather.dal2.ups.oTask();
        int j = aotask.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    com.weather.dal2.ups.oTask otask = aotask[i];
                    if (!s.equals(otask.oTask()))
                    {
                        break label0;
                    }
                    ProfileCompletionFragment.access$200(ProfileCompletionFragment.this).selectItem(otask);
                }
                return;
            }
            i++;
        } while (true);
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
            Log.e("ProfileCompletionFragment", exception.getMessage());
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
        if (isVisible() && demographics != null)
        {
            String s = demographics.getUserName();
            String s1 = demographics.getAgeRange();
            demographics = demographics.getGender();
            if (s != null)
            {
                ProfileCompletionFragment.access$100(ProfileCompletionFragment.this).setText(s);
            }
            if (demographics != null)
            {
                setGender(demographics);
            }
            if (s1 != null)
            {
                selectAgeRange(s1);
            }
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Demographics)obj);
    }

    private ()
    {
        this$0 = ProfileCompletionFragment.this;
        super();
        accountManager = AccountManager.getInstance();
    }

    accountManager(accountManager accountmanager)
    {
        this();
    }
}
