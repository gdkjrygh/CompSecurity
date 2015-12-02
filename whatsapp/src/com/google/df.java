// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google:
//            dl, af

public class df
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private boolean a;
    private String b;
    private List c;
    private boolean d;
    private boolean e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private boolean j;
    private boolean k;

    public df()
    {
        h = "";
        g = "";
        c = new ArrayList();
        b = "";
        i = false;
        f = "";
    }

    public static dl a()
    {
        return new dl();
    }

    public df a(df df1)
    {
        int j1 = af.k;
        int i1;
        int k1;
        try
        {
            if (df1.j())
            {
                a(df1.e());
            }
        }
        // Misplaced declaration of an exception variable
        catch (df df1)
        {
            throw df1;
        }
        try
        {
            if (df1.f())
            {
                e(df1.d());
            }
        }
        // Misplaced declaration of an exception variable
        catch (df df1)
        {
            throw df1;
        }
        k1 = df1.c();
        i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            d(df1.a(i1));
            i1++;
        } while (j1 == 0);
        try
        {
            if (df1.n())
            {
                b(df1.m());
            }
        }
        // Misplaced declaration of an exception variable
        catch (df df1)
        {
            throw df1;
        }
        try
        {
            if (df1.k())
            {
                c(df1.b());
            }
        }
        // Misplaced declaration of an exception variable
        catch (df df1)
        {
            throw df1;
        }
        a(df1.l());
        return this;
    }

    public df a(String s)
    {
        d = true;
        h = s;
        return this;
    }

    public df a(boolean flag)
    {
        e = true;
        i = flag;
        return this;
    }

    public String a(int i1)
    {
        return (String)c.get(i1);
    }

    public df b(String s)
    {
        a = true;
        b = s;
        return this;
    }

    public String b()
    {
        return f;
    }

    public int c()
    {
        return c.size();
    }

    public df c(String s)
    {
        j = true;
        f = s;
        return this;
    }

    public df d(String s)
    {
        if (s == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        } else
        {
            c.add(s);
            return this;
        }
    }

    public String d()
    {
        return g;
    }

    public df e(String s)
    {
        k = true;
        g = s;
        return this;
    }

    public String e()
    {
        return h;
    }

    public boolean f()
    {
        return k;
    }

    public df g()
    {
        a = false;
        b = "";
        return this;
    }

    public boolean h()
    {
        return e;
    }

    public List i()
    {
        return c;
    }

    public boolean j()
    {
        return d;
    }

    public boolean k()
    {
        return j;
    }

    public boolean l()
    {
        return i;
    }

    public String m()
    {
        return b;
    }

    public boolean n()
    {
        return a;
    }

    public void readExternal(ObjectInput objectinput)
    {
        int j1 = af.k;
        a(objectinput.readUTF());
        e(objectinput.readUTF());
        int k1 = objectinput.readInt();
        int i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            c.add(objectinput.readUTF());
            i1++;
        } while (j1 == 0);
        try
        {
            if (objectinput.readBoolean())
            {
                b(objectinput.readUTF());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInput objectinput)
        {
            throw objectinput;
        }
        try
        {
            if (objectinput.readBoolean())
            {
                c(objectinput.readUTF());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInput objectinput)
        {
            throw objectinput;
        }
        a(objectinput.readBoolean());
    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        int j1 = af.k;
        objectoutput.writeUTF(h);
        objectoutput.writeUTF(g);
        int k1 = c();
        objectoutput.writeInt(k1);
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < k1)
                {
                    objectoutput.writeUTF((String)c.get(i1));
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                try
                {
                    objectoutput.writeBoolean(a);
                    if (a)
                    {
                        objectoutput.writeUTF(b);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (ObjectOutput objectoutput)
                {
                    throw objectoutput;
                }
                try
                {
                    objectoutput.writeBoolean(j);
                    if (j)
                    {
                        objectoutput.writeUTF(f);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (ObjectOutput objectoutput)
                {
                    throw objectoutput;
                }
                objectoutput.writeBoolean(i);
                return;
            }
            i1++;
        } while (true);
    }
}
