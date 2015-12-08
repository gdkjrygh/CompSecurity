// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import android.content.Context;
import com.jiubang.playsdk.f.k;
import com.jiubang.playsdk.main.b;
import java.io.File;

public class a
    implements Runnable
{

    public a()
    {
    }

    public long a(File file)
    {
        long l = 0L;
        if (file != null) goto _L2; else goto _L1
_L1:
        long l1 = l;
_L4:
        return l1;
_L2:
label0:
        {
            if (!file.isDirectory())
            {
                break label0;
            }
            file = file.listFiles();
            l1 = l;
            if (file != null)
            {
                int j = file.length;
                int i = 0;
                do
                {
                    l1 = l;
                    if (i >= j)
                    {
                        break;
                    }
                    l1 = a(file[i]);
                    i++;
                    l = l1 + l;
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return file.length();
    }

    public void a(Context context)
    {
        context = new k(context, "request_info");
        long l = context.b("image_cache_time_id", 0L);
        long l1 = System.currentTimeMillis();
        if (l1 - l > 0xdbba00L)
        {
            context.a("image_cache_time_id", l1);
            context.a();
            context = new Thread(this);
            context.setName("DeleteLocalImageCacheRunable");
            context.start();
        }
    }

    public void run()
    {
        File file = new File(b.d);
        if (file.exists() && a(file) >= 0xc800000L)
        {
            File afile[] = file.listFiles();
            if (afile != null)
            {
                for (int i = 0; i < afile.length / 2; i++)
                {
                    File file1 = afile[i];
                    if (file1 != null)
                    {
                        file1.delete();
                    }
                }

            }
        }
    }
}
