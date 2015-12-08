// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.location.LocationManager;
import com.gtp.a.a.b.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class i
{

    public static int a(LocationManager locationmanager, String s)
    {
        byte byte0 = 2;
        boolean flag;
        try
        {
            flag = locationmanager.isProviderEnabled(s);
        }
        // Misplaced declaration of an exception variable
        catch (LocationManager locationmanager)
        {
            if (c.a())
            {
                locationmanager.printStackTrace();
            }
            return 3;
        }
        // Misplaced declaration of an exception variable
        catch (LocationManager locationmanager)
        {
            if (c.a())
            {
                locationmanager.printStackTrace();
            }
            return 3;
        }
        if (flag)
        {
            byte0 = 1;
        }
        return byte0;
    }

    public static SQLiteDatabase a(Context context, int j)
    {
        String s;
        Object obj = (new StringBuilder()).append(context.getFilesDir()).append("/city").toString();
        s = (new StringBuilder()).append(((String) (obj))).append("/").append("go_city.db").toString();
        obj = new File(((String) (obj)));
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdir();
        }
        FileOutputStream fileoutputstream;
        byte abyte0[];
        if ((new File(s)).exists())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        context = context.getResources().openRawResource(j);
        fileoutputstream = new FileOutputStream(s);
        abyte0 = new byte[8192];
_L1:
        j = context.read(abyte0);
label0:
        {
            if (j <= 0)
            {
                break label0;
            }
            try
            {
                fileoutputstream.write(abyte0, 0, j);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return null;
            }
        }
          goto _L1
        fileoutputstream.close();
        context.close();
        context = SQLiteDatabase.openOrCreateDatabase(s, null);
        return context;
    }
}
