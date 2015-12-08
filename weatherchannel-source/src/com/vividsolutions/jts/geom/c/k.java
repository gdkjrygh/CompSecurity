// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;

public abstract class k
{

    private boolean a;

    public k()
    {
        a = false;
    }

    public final void a(i l)
    {
        int j1 = 0;
        do
        {
label0:
            {
                i i1;
label1:
                {
                    if (j1 < l.getNumGeometries() && !a)
                    {
                        i1 = l.getGeometryN(j1);
                        if (i1 instanceof j)
                        {
                            break label1;
                        }
                        b(i1);
                        if (!a())
                        {
                            break label0;
                        }
                        a = true;
                    }
                    return;
                }
                a(i1);
            }
            j1++;
        } while (true);
    }

    protected abstract boolean a();

    protected abstract void b(i l);
}
