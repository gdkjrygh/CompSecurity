// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.download;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;

public class b
{

    private static final String a = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/GOWeatherEX/download/").toString();

    public static void a(Context context, String s, String s1, long l, String s2)
    {
        if (context == null || s == null || "".equals(s.trim()) || s1 == null || "".equals(s1.trim()))
        {
            return;
        }
        String s3 = s.trim();
        int i = s3.lastIndexOf(".");
        s = s3;
        if (i != -1)
        {
            s = s3.substring(0, i);
            s3 = s3.substring(i);
            s = (new StringBuilder()).append(s).append("_").append(System.currentTimeMillis()).append(s3).toString();
        }
        s3 = (new StringBuilder()).append(a).append(s).toString();
        Intent intent = new Intent();
        intent.setAction("com.gau.go.launcherex.gowidget.download.DownloadBrocastReceiver.GOWEATHER_DOWNLOAD_START");
        intent.setData(Uri.parse("download://"));
        intent.putExtra("download_task_id_key", l);
        intent.putExtra("download_file_name_key", s);
        intent.putExtra("download_url_key", s1);
        intent.putExtra("download_save_file_path_key", s3);
        intent.putExtra("download_package_name_key", s2);
        context.sendBroadcast(intent);
    }

}
