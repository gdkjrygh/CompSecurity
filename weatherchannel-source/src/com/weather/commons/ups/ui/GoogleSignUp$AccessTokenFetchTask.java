// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
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
//            GoogleSignUp, SocialSignUpFragment

private class <init> extends AsyncTask
{

    final GoogleSignUp this$0;

    private void completeProfileForGP(Person person, String s, String s1)
    {
        s = new DsxAccount(person.getId(), s, com.weather.commons.ups.facade.R_GOOGLE_PLUS);
        person = new UserDetails(person.getId(), person.getDisplayName(), null, s1);
        SocialSignUpFragment.newInstance(GoogleSignUp.access$100(GoogleSignUp.this).getFragmentManager(), s, person);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient String doInBackground(Void avoid[])
    {
        try
        {
            avoid = GoogleSignUp.access$200(GoogleSignUp.this).retrieveToken(GoogleSignUp.access$100(GoogleSignUp.this), GoogleSignUp.access$200(GoogleSignUp.this).getAccountName(), "oauth2:https://www.googleapis.com/auth/plus.login");
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("GoogleSignUp", avoid.toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("GoogleSignUp", avoid.toString());
            avoid = avoid.getIntent();
            GoogleSignUp.access$100(GoogleSignUp.this).startActivityForResult(avoid, 0x186a0);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("GoogleSignUp", avoid.toString());
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
        super.onPostExecute(s);
        Person person = GoogleSignUp.access$200(GoogleSignUp.this).getCurrentPerson();
        String s1 = GoogleSignUp.access$200(GoogleSignUp.this).getAccountName();
        if (person != null && s1 != null && s != null)
        {
            completeProfileForGP(person, s, s1);
        }
    }

    private ()
    {
        this$0 = GoogleSignUp.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
