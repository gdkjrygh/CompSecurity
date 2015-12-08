// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.bean;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

public class d
{

    public int a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;

    public d()
    {
        a = -1;
        b = -1;
        c = -1;
        d = "";
        e = "";
        f = "";
    }

    public d(int i, int j, long l, String s)
    {
        a = -1;
        b = -1;
        c = -1;
        d = "";
        e = "";
        f = "";
        b = i;
        c = j;
        e = s;
        a(l);
    }

    public String a()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(b);
        stringbuffer.append("#");
        stringbuffer.append(c);
        stringbuffer.append("#");
        stringbuffer.append(d);
        stringbuffer.append("#");
        stringbuffer.append(e);
        return stringbuffer.toString();
    }

    public void a(long l)
    {
        d = (new SimpleDateFormat("yyyyMMddHHmmss")).format(new Date(l));
    }

    public void a(String s)
    {
        String as[];
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        as = s.split("#");
        b = Integer.parseInt(as[0]);
        c = Integer.parseInt(as[1]);
        if (as.length > 2)
        {
            s = as[2];
        } else
        {
            s = "";
        }
        d = s;
        if (as.length > 3)
        {
            s = as[3];
        } else
        {
            s = "";
        }
        try
        {
            e = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public String toString()
    {
        return (new StringBuilder("PushLog [mId=")).append(a).append(", mType=").append(b).append(", mCode=").append(c).append(", mValue=").append(d).append(", mInfo=").append(e).append(", mTime=").append(f).append("]").toString();
    }
}
