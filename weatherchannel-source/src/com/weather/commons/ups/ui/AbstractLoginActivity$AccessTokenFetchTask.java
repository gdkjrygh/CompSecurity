// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.plus.model.people.Person;
import com.weather.commons.ups.backend.GooglePlusConnectionManager;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.ups.UserDetails;
import java.io.IOException;

// Referenced classes of package com.weather.commons.ups.ui:
//            AbstractLoginActivity

private class <init> extends AsyncTask
{

    final AbstractLoginActivity this$0;

    private void loginGoogleUser(Person person, String s, String s1)
    {
        s = new DsxAccount(person.getId(), s, com.weather.commons.ups.facade.PLUS);
        person = new UserDetails(person.getId(), person.getDisplayName(), null, s1);
        AbstractLoginActivity.access$1700(AbstractLoginActivity.this, person, s);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient String doInBackground(Void avoid[])
    {
        try
        {
            avoid = AbstractLoginActivity.access$1300(AbstractLoginActivity.this).retrieveToken(AbstractLoginActivity.this, AbstractLoginActivity.access$1300(AbstractLoginActivity.this).getAccountName(), "oauth2:https://www.googleapis.com/auth/plus.login");
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("LoginActivity", avoid.toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("LoginActivity", avoid.toString());
            avoid = avoid.getIntent();
            startActivityForResult(avoid, 0x186a0);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("LoginActivity", avoid.toString());
            return null;
        }
        return avoid;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        Person person = AbstractLoginActivity.access$1300(AbstractLoginActivity.this).getCurrentPerson();
        String s1 = AbstractLoginActivity.access$1300(AbstractLoginActivity.this).getAccountName();
        if (person != null && s1 != null)
        {
            loginGoogleUser(person, s, s1);
        }
    }

    private ()
    {
        this$0 = AbstractLoginActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
