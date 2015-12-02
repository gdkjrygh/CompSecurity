// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import android.util.Log;
import java.io.Writer;

// Referenced classes of package android.support.v4.util:
//            LruCache

public class LogWriter extends Writer
{

    private StringBuilder mBuilder;
    private final String mTag;

    public LogWriter(String s)
    {
        mBuilder = new StringBuilder(128);
        mTag = s;
    }

    private void flushBuilder()
    {
        if (mBuilder.length() > 0)
        {
            Log.d(mTag, mBuilder.toString());
            mBuilder.delete(0, mBuilder.length());
        }
    }

    public void close()
    {
        flushBuilder();
    }

    public void flush()
    {
        flushBuilder();
    }

    public void write(char ac[], int i, int j)
    {
        boolean flag = LruCache.a;
        int k = 0;
label0:
        do
        {
label1:
            {
                if (k >= j)
                {
                    break label0;
                }
                char c = ac[i + k];
                if (c == '\n')
                {
                    flushBuilder();
                    if (!flag)
                    {
                        break label1;
                    }
                }
                mBuilder.append(c);
            }
            k++;
        } while (!flag);
    }
}
