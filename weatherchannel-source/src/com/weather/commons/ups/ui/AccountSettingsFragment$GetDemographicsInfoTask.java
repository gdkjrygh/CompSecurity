// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;
import com.weather.util.date.Day;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.ui.ValueAdapterSupport;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

private class <init> extends AsyncTask
{

    final AccountSettingsFragment this$0;

    private void setCableProviderSpinner(String s)
    {
        if (s != null)
        {
            int j = AccountSettingsFragment.access$1500(AccountSettingsFragment.this).getPosition(s);
            s = AccountSettingsFragment.access$1600(AccountSettingsFragment.this);
            int i = j;
            if (j == -1)
            {
                i = 0;
            }
            s.setSelection(i);
        }
    }

    private void setDateOfBirth(CharSequence charsequence)
    {
        if (charsequence != null)
        {
            charsequence = Day.valueOf(charsequence);
            dateOfBirth = charsequence;
            userAge = dateOfBirth.getAge();
            if (charsequence != null)
            {
                userAge = charsequence.getAge();
                setDateBasedOnDeviceLocale(charsequence.getMonthOfYear() + 1, charsequence.getYear(), charsequence.getDayOfMonth());
            }
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
                    genderAdapterSupport.selectItem(otask);
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
            demographics = AccountSettingsFragment.access$900(AccountSettingsFragment.this).getDemographics();
        }
        catch (Exception exception)
        {
            LogUtil.e("AccountSettingsFragment", LoggingMetaTags.TWC_UPS, exception.getMessage(), new Object[0]);
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
        AccountSettingsFragment.access$1002(AccountSettingsFragment.this, demographics);
        if (isVisible() && demographics != null)
        {
            AccountSettingsFragment.access$1102(AccountSettingsFragment.this, demographics.getFirstName());
            AccountSettingsFragment.access$1202(AccountSettingsFragment.this, demographics.getLastName());
            String s = demographics.getTwcAccountEmail();
            String s1 = demographics.getGender();
            if (AccountSettingsFragment.access$1100(AccountSettingsFragment.this) != null)
            {
                String s2 = String.format("%s %s", new Object[] {
                    AccountSettingsFragment.access$1100(AccountSettingsFragment.this), AccountSettingsFragment.access$1200(AccountSettingsFragment.this)
                });
                AccountSettingsFragment.access$1300(AccountSettingsFragment.this).setText(s2);
            }
            if (s != null)
            {
                AccountSettingsFragment.access$1400(AccountSettingsFragment.this).setText(s);
                AccountSettingsFragment.access$1400(AccountSettingsFragment.this).setTextColor(getResources().getColor(0x106000c));
            } else
            {
                AccountSettingsFragment.access$1400(AccountSettingsFragment.this).setTextColor(getResources().getColor(com.weather.commons.foTask.this._fld0));
            }
            setDateOfBirth(demographics.getDateOfBirth());
            if (s1 != null)
            {
                setGender(s1);
            }
            setCableProviderSpinner(demographics.getCableProvider());
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Demographics)obj);
    }

    private ()
    {
        this$0 = AccountSettingsFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
