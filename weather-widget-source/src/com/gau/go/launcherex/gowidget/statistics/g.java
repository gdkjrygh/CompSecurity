// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.format.Time;
import com.jiubang.goweather.b.f;
import java.util.TimeZone;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            i

public class g
    implements android.os.Handler.Callback
{

    private Handler a;
    private Time b;
    private Context c;

    public g(Context context)
    {
        c = context.getApplicationContext();
        a = new Handler(Looper.getMainLooper(), this);
        b = new Time();
    }

    private String a()
    {
        b.setToNow();
        b.switchTimezone(TimeZone.getTimeZone("GMT+0800").getID());
        return (new StringBuilder()).append(b.format("%Y-%m-%d %H:%M:%S")).append(" ").append(b.timezone).toString();
    }

    public void a(String s, f f1)
    {
        if (f1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        if (f1.c() != 1 && f1.c() != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        j = 0;
_L5:
        if (j == 3 || j == 4 || j == 5 || j == 6 || j == 2 || j == 102 || j == 103 || j == 104 || j == 100)
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append("===========");
            stringbuffer.append(a());
            stringbuffer.append("===========");
            stringbuffer.append("\n");
            stringbuffer.append("URL : ");
            stringbuffer.append(s);
            stringbuffer.append("\n");
            stringbuffer.append("error status code : ");
            stringbuffer.append(j);
            stringbuffer.append("\n");
            if (j == 3)
            {
                stringbuffer.append("http response status code : ");
                stringbuffer.append(f1.n());
                stringbuffer.append("\n");
            }
            stringbuffer.append("error message : ");
            stringbuffer.append(f1.j());
            stringbuffer.append("\n");
            stringbuffer.append("json from server : ");
            stringbuffer.append(f1.l());
            stringbuffer.append("\n");
            if (j == 2 || j == 100)
            {
                stringbuffer.append("StackTraceInfo : ");
                stringbuffer.append(f1.m());
                stringbuffer.append("\n");
            }
            stringbuffer.append("\n");
            stringbuffer.append("\n");
            s = Message.obtain();
            s.what = 1;
            s.obj = stringbuffer.toString();
            a.sendMessage(s);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        switch (f1.e())
        {
        case 1: // '\001'
        case 2: // '\002'
        case 9: // '\t'
        case 11: // '\013'
        default:
            j = 100;
            break;

        case 6: // '\006'
            j = 1;
            break;

        case 7: // '\007'
            j = 2;
            break;

        case 8: // '\b'
            j = 3;
            break;

        case 0: // '\0'
            j = 4;
            break;

        case -1: 
            j = 5;
            break;

        case 10: // '\n'
            j = 6;
            break;

        case 12: // '\f'
            j = 7;
            break;

        case 3: // '\003'
            j = 101;
            break;

        case 4: // '\004'
            j = 102;
            break;

        case 5: // '\005'
            j = 103;
            break;

        case 13: // '\r'
            j = 104;
            break;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void b(String s, f f1)
    {
        a(s, f1);
    }

    public void c(String s, f f1)
    {
        a(s, f1);
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            i.a(c).a((String)message.obj);
            break;
        }
        return true;
    }
}
