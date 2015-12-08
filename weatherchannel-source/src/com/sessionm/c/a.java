// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.c;

import com.sessionm.net.Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.sessionm.c:
//            c

public class a
    implements c
{

    private static final int iq = 20;
    private int ir;
    private final List is = new ArrayList();

    public a()
    {
        ir = 20;
    }

    public long bF()
    {
        return -1L;
    }

    public void close()
    {
    }

    public long getSize()
    {
        this;
        JVM INSTR monitorenter ;
        int i = is.size();
        long l1 = i;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean l(Request request)
    {
        if (is.size() > ir)
        {
            return false;
        } else
        {
            request.c(this);
            is.add(request);
            return true;
        }
    }

    public boolean m(Request request)
    {
        boolean flag1;
        if (request.bc() > 1)
        {
            request = request.bb().iterator();
            boolean flag = true;
            do
            {
                flag1 = flag;
                if (!request.hasNext())
                {
                    break;
                }
                Request request1 = (Request)request.next();
                flag1 = is.remove(request1);
                if (!flag1 && flag)
                {
                    flag = flag1;
                }
            } while (true);
        } else
        {
            flag1 = is.remove(request);
        }
        return flag1;
    }

    public List r(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = i;
        Object obj;
        if (i > is.size())
        {
            j = is.size();
        }
        obj = is.subList(0, j);
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Request request = (Request)iterator.next();
            if (request.bd() == com.sessionm.net.Request.State.gJ)
            {
                request.reset();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_93;
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
    }

    public boolean removeAll()
    {
        this;
        JVM INSTR monitorenter ;
        is.clear();
        this;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        throw exception;
    }

    public void s(int i)
    {
        ir = i;
    }
}
