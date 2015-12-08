// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.util.Log;
import com.google.android.gms.internal.jr;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            PIMEUpdate, d

public final class e
    implements Iterable, Iterator
{

    jr a;
    final PIMEUpdate b;
    private int c;
    private int d;
    private boolean e;

    public e(PIMEUpdate pimeupdate)
    {
        b = pimeupdate;
        super();
        pimeupdate = b.kg;
        a = jr.a(pimeupdate, 0, pimeupdate.length);
        c = 0;
        d = 0;
        e = true;
    }

    private d a()
    {
        boolean flag = false;
        Object obj;
        try
        {
            d = a.a();
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        try
        {
            obj = new String(b.kf, c, d, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new IllegalStateException(unsupportedencodingexception);
        }
        obj = new d(((String) (obj)), e, (byte)0);
        c = c + d;
        if (!e)
        {
            flag = true;
        }
        e = flag;
        return ((d) (obj));
    }

    public final boolean hasNext()
    {
        boolean flag = false;
        boolean flag1;
        try
        {
            flag1 = a.b();
        }
        catch (IOException ioexception)
        {
            Log.wtf("AppDataSearchClient", ioexception);
            return false;
        }
        if (!flag1)
        {
            flag = true;
        }
        return flag;
    }

    public final Iterator iterator()
    {
        return this;
    }

    public final Object next()
    {
        return a();
    }

    public final void remove()
    {
        throw new IllegalStateException("remove not implemented");
    }
}
