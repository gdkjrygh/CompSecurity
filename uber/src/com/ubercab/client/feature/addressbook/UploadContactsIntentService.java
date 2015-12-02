// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.addressbook;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.ubercab.client.core.app.RiderApplication;
import czh;
import czi;
import czj;
import dyk;
import dyl;
import dyo;
import dyp;
import dyq;
import ijg;

public class UploadContactsIntentService extends IntentService
    implements czh, czi
{

    public dyo a;
    private dyp b;

    public UploadContactsIntentService()
    {
        super(com/ubercab/client/feature/addressbook/UploadContactsIntentService.getName());
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/ubercab/client/feature/addressbook/UploadContactsIntentService);
    }

    private dyp a()
    {
        return dyk.a().a(new dyq(this, this)).a(((RiderApplication)getApplication()).b()).a();
    }

    private void a(dyp dyp1)
    {
        dyp1.a(this);
    }

    private dyp b()
    {
        return b;
    }

    public final volatile void a(czj czj)
    {
        a((dyp)czj);
    }

    public final czj c()
    {
        return a();
    }

    public final czj d()
    {
        return b();
    }

    public void onCreate()
    {
        super.onCreate();
        b = a();
        b.a(this);
    }

    protected void onHandleIntent(Intent intent)
    {
        try
        {
            a.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            ijg.d("UploadContactsIntentService exception while synchronizing contacts", new Object[] {
                intent
            });
        }
    }
}
