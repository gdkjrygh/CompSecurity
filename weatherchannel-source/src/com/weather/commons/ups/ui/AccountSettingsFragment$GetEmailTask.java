// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.widget.TextView;
import com.weather.commons.ups.backend.AccountManager;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

private class <init> extends AsyncTask
{

    final AccountSettingsFragment this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient String doInBackground(Void avoid[])
    {
        return AccountManager.getInstance().getWxAccountId();
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
label0:
        {
            if (isAdded())
            {
                if (s == null)
                {
                    break label0;
                }
                AccountSettingsFragment.access$1400(AccountSettingsFragment.this).setText(s);
                AccountSettingsFragment.access$1400(AccountSettingsFragment.this).setTextColor(getResources().getColor(0x106000c));
            }
            return;
        }
        AccountSettingsFragment.access$1400(AccountSettingsFragment.this).setTextColor(getResources().getColor(com.weather.commons.ources));
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
