// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

// Referenced classes of package com.google.android.apps.youtube.common.cache:
//            d, e

final class f
    implements Runnable
{

    final String a;
    final long b;

    f(String s, long l)
    {
        a = s;
        b = l;
        super();
    }

    public final void run()
    {
        String s = a;
        long l2 = b;
        File afile[];
        File file;
        boolean flag;
        if (l2 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "limit may not be <= 0");
        c.a(s, "dirCache may not be empty");
        file = new File(s);
        c.a(file.isDirectory(), (new StringBuilder()).append(s).append(" is not a directory").toString());
        afile = file.listFiles(new d());
        if (afile != null)
        {
            int i1 = afile.length;
            int j = 0;
            int i = 0;
            for (; j < i1; j++)
            {
                File file1 = afile[j];
                i = (int)((long)i + file1.length());
            }

            if ((long)i < l2)
            {
                L.e((new StringBuilder("Cache is below limit, no need to shrink: [size=")).append(i).append(", limit=").append(l2).append("]").toString());
            } else
            {
                HashMap hashmap = new HashMap(afile.length);
                int j1 = afile.length;
                for (int k = 0; k < j1; k++)
                {
                    File file3 = afile[k];
                    hashmap.put(file3, Long.valueOf(file3.lastModified()));
                }

                Arrays.sort(afile, new e(hashmap));
                int j2 = afile.length;
                j1 = 0;
                int l = 0;
                int k1 = i;
                while (l < j2) 
                {
                    File file2 = afile[l];
                    if ((long)k1 >= l2)
                    {
                        long l3 = file2.length();
                        int i2 = j1;
                        int l1 = k1;
                        if (file2.delete())
                        {
                            l1 = (int)((long)k1 - l3);
                            i2 = j1 + 1;
                        }
                        l++;
                        j1 = i2;
                        k1 = l1;
                    } else
                    {
                        L.e((new StringBuilder("Cache shrunk: [deleted=")).append(j1).append(", newSize=").append(k1).append(", previousSize=").append(i).append(", limit=").append(l2).append("]").toString());
                        return;
                    }
                }
            }
        }
    }
}
