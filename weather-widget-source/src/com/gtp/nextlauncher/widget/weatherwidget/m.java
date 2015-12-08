// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import java.nio.FloatBuffer;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            n

public class m
{

    public float a;
    public float b;
    public float c;
    private final short d;
    private n e;
    private n f;
    private boolean g;
    private float h[];

    public m(float f1, float f2, float f3, int i)
    {
        e = new n(0.0F, 0.0F);
        f = new n(0.0F, 0.0F);
        g = true;
        h = new float[3];
        a = f1;
        b = f2;
        c = f3;
        d = (short)i;
        h[0] = f1;
        h[1] = f2;
        h[2] = f3;
    }

    public short a()
    {
        return d;
    }

    public void a(float f1, float f2)
    {
        e.a = f1;
        e.b = f2;
    }

    public void a(float f1, float f2, float f3)
    {
        a = f1;
        b = f2;
        c = f3;
    }

    public void a(FloatBuffer floatbuffer)
    {
        floatbuffer.put(a);
        floatbuffer.put(b);
        floatbuffer.put(c);
    }

    public void a(FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
    {
        floatbuffer.put(a);
        floatbuffer.put(b);
        floatbuffer.put(c);
        floatbuffer1.put(e.a);
        floatbuffer1.put(e.b);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof m)
        {
            obj = (m)obj;
            flag = flag1;
            if (a == ((m) (obj)).a)
            {
                flag = flag1;
                if (b == ((m) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((m) (obj)).c)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
