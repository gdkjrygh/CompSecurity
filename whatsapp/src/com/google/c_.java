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
//            cu, af, e_

public class c_
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private List a;

    public c_()
    {
        a = new ArrayList();
    }

    public static cu d()
    {
        return new cu();
    }

    public c_ a()
    {
        a.clear();
        return this;
    }

    public c_ a(e_ e_1)
    {
        if (e_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (e_ e_1)
            {
                throw e_1;
            }
        } else
        {
            a.add(e_1);
            return this;
        }
    }

    public int b()
    {
        return a.size();
    }

    public List c()
    {
        return a;
    }

    public void readExternal(ObjectInput objectinput)
    {
        int j = af.k;
        int k = objectinput.readInt();
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            e_ e_1 = new e_();
            e_1.readExternal(objectinput);
            a.add(e_1);
            i++;
        } while (j == 0);
    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        int j = af.k;
        int k = b();
        objectoutput.writeInt(k);
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    ((e_)a.get(i)).writeExternal(objectoutput);
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }
}
