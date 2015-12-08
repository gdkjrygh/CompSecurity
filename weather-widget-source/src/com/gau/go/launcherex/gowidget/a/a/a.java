// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.a.a;

import android.os.AsyncTask;
import android.os.Environment;
import com.gau.go.launcherex.gowidget.statistics.w;
import java.io.File;
import java.io.IOException;

public class a extends AsyncTask
{

    public a()
    {
    }

    protected transient Void a(Void avoid[])
    {
        if (w.a())
        {
            avoid = new File(Environment.getExternalStorageDirectory(), "/GOWeatherEX");
            if (!avoid.exists())
            {
                avoid.mkdirs();
            }
            avoid = new File(avoid, ".nomedia");
            if (!avoid.exists())
            {
                try
                {
                    avoid.createNewFile();
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    avoid.printStackTrace();
                }
            }
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
