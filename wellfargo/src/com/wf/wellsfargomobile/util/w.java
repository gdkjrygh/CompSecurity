// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.content.Context;
import android.os.AsyncTask;
import android.webkit.WebViewDatabase;

final class w extends AsyncTask
{

    final Context a;

    w(Context context)
    {
        a = context;
        super();
    }

    protected transient Void a(Void avoid[])
    {
        try
        {
            avoid = WebViewDatabase.getInstance(a);
            avoid.clearFormData();
            avoid.clearUsernamePassword();
            avoid.clearHttpAuthUsernamePassword();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[]) { }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
