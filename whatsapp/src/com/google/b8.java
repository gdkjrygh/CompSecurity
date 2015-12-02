// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.google:
//            bs

public class b8
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private boolean a;
    private String b;
    private boolean c;
    private String d;
    private String e;
    private boolean f;

    public b8()
    {
        e = "";
        b = "";
        d = "";
    }

    public static bs g()
    {
        return new bs();
    }

    public b8 a(b8 b8_1)
    {
        if (b8_1.b())
        {
            a(b8_1.f());
        }
        if (b8_1.c())
        {
            b(b8_1.e());
        }
        if (b8_1.a())
        {
            c(b8_1.d());
        }
        return this;
    }

    public b8 a(String s)
    {
        f = true;
        e = s;
        return this;
    }

    public boolean a()
    {
        return c;
    }

    public b8 b(String s)
    {
        a = true;
        b = s;
        return this;
    }

    public boolean b()
    {
        return f;
    }

    public boolean b(b8 b8_1)
    {
        return e.equals(b8_1.e) && b.equals(b8_1.b) && d.equals(b8_1.d);
    }

    public b8 c(String s)
    {
        c = true;
        d = s;
        return this;
    }

    public boolean c()
    {
        return a;
    }

    public String d()
    {
        return d;
    }

    public String e()
    {
        return b;
    }

    public String f()
    {
        return e;
    }

    public void readExternal(ObjectInput objectinput)
    {
        if (objectinput.readBoolean())
        {
            a(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            b(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            c(objectinput.readUTF());
        }
    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        objectoutput.writeBoolean(f);
        if (f)
        {
            objectoutput.writeUTF(e);
        }
        objectoutput.writeBoolean(a);
        if (a)
        {
            objectoutput.writeUTF(b);
        }
        objectoutput.writeBoolean(c);
        if (c)
        {
            objectoutput.writeUTF(d);
        }
    }
}
