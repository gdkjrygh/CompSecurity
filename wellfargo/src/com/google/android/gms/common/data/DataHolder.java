// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.data:
//            h, c, d

public final class DataHolder
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    private static final d l = new c(new String[0], null);
    Bundle a;
    int b[];
    int c;
    boolean d;
    private final int e;
    private final String f[];
    private final CursorWindow g[];
    private final int h;
    private final Bundle i;
    private Object j;
    private boolean k;

    DataHolder(int i1, String as[], CursorWindow acursorwindow[], int j1, Bundle bundle)
    {
        d = false;
        k = true;
        e = i1;
        f = as;
        g = acursorwindow;
        h = j1;
        i = bundle;
    }

    private void a(String s, int i1)
    {
        if (a == null || !a.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No such column: ").append(s).toString());
        }
        if (h())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i1 < 0 || i1 >= c)
        {
            throw new CursorIndexOutOfBoundsException(i1, c);
        } else
        {
            return;
        }
    }

    public int a(int i1)
    {
        int k1 = 0;
        boolean flag;
        if (i1 >= 0 && i1 < c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag);
        do
        {
label0:
            {
                int j1 = k1;
                if (k1 < b.length)
                {
                    if (i1 >= b[k1])
                    {
                        break label0;
                    }
                    j1 = k1 - 1;
                }
                i1 = j1;
                if (j1 == b.length)
                {
                    i1 = j1 - 1;
                }
                return i1;
            }
            k1++;
        } while (true);
    }

    public String a(String s, int i1, int j1)
    {
        a(s, i1);
        return g[j1].getString(i1, a.getInt(s));
    }

    public void a()
    {
        int k1 = 0;
        a = new Bundle();
        for (int i1 = 0; i1 < f.length; i1++)
        {
            a.putInt(f[i1], i1);
        }

        b = new int[g.length];
        boolean flag = false;
        int j1 = k1;
        k1 = ((flag) ? 1 : 0);
        for (; j1 < g.length; j1++)
        {
            b[j1] = k1;
            int l1 = g[j1].getStartPosition();
            k1 += g[j1].getNumRows() - (k1 - l1);
        }

        c = k1;
    }

    public void a(Object obj)
    {
        j = obj;
    }

    int b()
    {
        return e;
    }

    String[] c()
    {
        return f;
    }

    CursorWindow[] d()
    {
        return g;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return h;
    }

    public Bundle f()
    {
        return i;
    }

    protected void finalize()
    {
        if (!k || g.length <= 0 || h()) goto _L2; else goto _L1
_L1:
        String s;
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        s = (new StringBuilder()).append("internal object: ").append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder()).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (").append(s).append(")").toString());
        i();
_L2:
        super.finalize();
        return;
        s = j.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public int g()
    {
        return c;
    }

    public boolean h()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (d) goto _L2; else goto _L1
_L1:
        d = true;
        int i1 = 0;
_L3:
        if (i1 >= g.length)
        {
            break; /* Loop/switch isn't completed */
        }
        g[i1].close();
        i1++;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.common.data.h.a(this, parcel, i1);
    }

}
