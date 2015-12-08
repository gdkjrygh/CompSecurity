// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.AbstractWindowedCursor;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.data:
//            c, a, b

public class DataHolder
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    private static final b rV = new a(new String[0], null);
    private final int jE;
    boolean mClosed;
    private final int qo;
    private final String rN[];
    Bundle rO;
    private final CursorWindow rP[];
    private final Bundle rQ;
    int rR[];
    int rS;
    private Object rT;
    private boolean rU;

    DataHolder(int i, String as[], CursorWindow acursorwindow[], int j, Bundle bundle)
    {
        mClosed = false;
        rU = true;
        jE = i;
        rN = as;
        rP = acursorwindow;
        qo = j;
        rQ = bundle;
    }

    public DataHolder(AbstractWindowedCursor abstractwindowedcursor, int i, Bundle bundle)
    {
        this(abstractwindowedcursor.getColumnNames(), a(abstractwindowedcursor), i, bundle);
    }

    private DataHolder(b b1, int i, Bundle bundle)
    {
        this(com.google.android.gms.common.data.b.a(b1), a(b1, -1), i, bundle);
    }

    private DataHolder(b b1, int i, Bundle bundle, int j)
    {
        this(com.google.android.gms.common.data.b.a(b1), a(b1, j), i, bundle);
    }

    DataHolder(b b1, int i, Bundle bundle, int j, a a1)
    {
        this(b1, i, bundle, j);
    }

    DataHolder(b b1, int i, Bundle bundle, a a1)
    {
        this(b1, i, bundle);
    }

    public DataHolder(String as[], CursorWindow acursorwindow[], int i, Bundle bundle)
    {
        mClosed = false;
        rU = true;
        jE = 1;
        rN = (String[])gi.a(as);
        rP = (CursorWindow[])gi.a(acursorwindow);
        qo = i;
        rQ = bundle;
        validateContents();
    }

    private static CursorWindow[] a(AbstractWindowedCursor abstractwindowedcursor)
    {
        ArrayList arraylist = new ArrayList();
        CursorWindow cursorwindow;
        int j;
        j = abstractwindowedcursor.getCount();
        cursorwindow = abstractwindowedcursor.getWindow();
        if (cursorwindow == null) goto _L2; else goto _L1
_L1:
        if (cursorwindow.getStartPosition() != 0) goto _L2; else goto _L3
_L3:
        int i;
        cursorwindow.acquireReference();
        abstractwindowedcursor.setWindow(null);
        arraylist.add(cursorwindow);
        i = cursorwindow.getNumRows();
_L11:
        if (i >= j) goto _L5; else goto _L4
_L4:
        if (!abstractwindowedcursor.moveToPosition(i)) goto _L5; else goto _L6
_L6:
        cursorwindow = abstractwindowedcursor.getWindow();
        if (cursorwindow == null) goto _L8; else goto _L7
_L7:
        cursorwindow.acquireReference();
        abstractwindowedcursor.setWindow(null);
_L9:
        if (cursorwindow.getNumRows() != 0)
        {
            arraylist.add(cursorwindow);
            i = cursorwindow.getStartPosition();
            i = cursorwindow.getNumRows() + i;
            continue; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
_L8:
        cursorwindow = new CursorWindow(false);
        cursorwindow.setStartPosition(i);
        abstractwindowedcursor.fillWindow(i, cursorwindow);
        if (true) goto _L9; else goto _L5
        Exception exception;
        exception;
        abstractwindowedcursor.close();
        throw exception;
_L5:
        abstractwindowedcursor.close();
        return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
_L2:
        i = 0;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static CursorWindow[] a(b b1, int i)
    {
        CursorWindow cursorwindow;
        Object obj;
        ArrayList arraylist;
        int j;
        boolean flag;
        flag = false;
        if (com.google.android.gms.common.data.b.a(b1).length == 0)
        {
            return new CursorWindow[0];
        }
        int l;
        if (i < 0 || i >= com.google.android.gms.common.data.b.b(b1).size())
        {
            obj = com.google.android.gms.common.data.b.b(b1);
        } else
        {
            obj = com.google.android.gms.common.data.b.b(b1).subList(0, i);
        }
        l = ((List) (obj)).size();
        cursorwindow = new CursorWindow(false);
        arraylist = new ArrayList();
        arraylist.add(cursorwindow);
        cursorwindow.setNumColumns(com.google.android.gms.common.data.b.a(b1).length);
        i = 0;
        j = 0;
_L4:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        if (cursorwindow.allocRow())
        {
            break MISSING_BLOCK_LABEL_212;
        }
        Log.d("DataHolder", (new StringBuilder("Allocating additional cursor window for large data set (row ")).append(i).append(")").toString());
        cursorwindow = new CursorWindow(false);
        cursorwindow.setStartPosition(i);
        cursorwindow.setNumColumns(com.google.android.gms.common.data.b.a(b1).length);
        arraylist.add(cursorwindow);
        if (cursorwindow.allocRow())
        {
            break MISSING_BLOCK_LABEL_209;
        }
        Log.e("DataHolder", "Unable to allocate row to hold data.");
        arraylist.remove(cursorwindow);
        b1 = (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
        return b1;
        j = 0;
        Map map = (Map)((List) (obj)).get(i);
        boolean flag1;
        flag1 = true;
        String s;
        Object obj1;
        long l1;
        for (int k = 0; k >= com.google.android.gms.common.data.b.a(b1).length || !flag1; k++)
        {
            break MISSING_BLOCK_LABEL_504;
        }

        s = com.google.android.gms.common.data.b.a(b1)[k];
        obj1 = map.get(s);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        flag1 = cursorwindow.putNull(j, k);
        break MISSING_BLOCK_LABEL_627;
        if (obj1 instanceof String)
        {
            flag1 = cursorwindow.putString((String)obj1, j, k);
            break MISSING_BLOCK_LABEL_627;
        }
        if (obj1 instanceof Long)
        {
            flag1 = cursorwindow.putLong(((Long)obj1).longValue(), j, k);
            break MISSING_BLOCK_LABEL_627;
        }
        if (obj1 instanceof Integer)
        {
            flag1 = cursorwindow.putLong(((Integer)obj1).intValue(), j, k);
            break MISSING_BLOCK_LABEL_627;
        }
        if (!(obj1 instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_405;
        }
        if (((Boolean)obj1).booleanValue())
        {
            l1 = 1L;
        } else
        {
            l1 = 0L;
        }
        flag1 = cursorwindow.putLong(l1, j, k);
        break MISSING_BLOCK_LABEL_627;
        if (obj1 instanceof byte[])
        {
            flag1 = cursorwindow.putBlob((byte[])obj1, j, k);
            break MISSING_BLOCK_LABEL_627;
        }
        try
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported object for column ")).append(s).append(": ").append(obj1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            j = arraylist.size();
        }
        for (i = ((flag) ? 1 : 0); i < j; i++)
        {
            ((CursorWindow)arraylist.get(i)).close();
        }

        break MISSING_BLOCK_LABEL_605;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_590;
        }
        Log.d("DataHolder", (new StringBuilder("Couldn't populate window data for row ")).append(i).append(" - allocating new window.").toString());
        cursorwindow.freeLastRow();
        cursorwindow = new CursorWindow(false);
        cursorwindow.setNumColumns(com.google.android.gms.common.data.b.a(b1).length);
        arraylist.add(cursorwindow);
        j = i - 1;
        i = 0;
_L2:
        k = j + 1;
        j = i;
        i = k;
        continue; /* Loop/switch isn't completed */
        k = j + 1;
        j = i;
        i = k;
        if (true) goto _L2; else goto _L1
_L1:
        throw b1;
        if (true) goto _L4; else goto _L3
_L3:
        return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
    }

    private void b(String s, int i)
    {
        if (rO == null || !rO.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder("No such column: ")).append(s).toString());
        }
        if (isClosed())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= rS)
        {
            throw new CursorIndexOutOfBoundsException(i, rS);
        } else
        {
            return;
        }
    }

    public static b builder(String as[])
    {
        return new b(as, null, (byte)0);
    }

    public static b builder(String as[], String s)
    {
        gi.a(s);
        return new b(as, s, (byte)0);
    }

    public static DataHolder empty(int i)
    {
        return empty(i, null);
    }

    public static DataHolder empty(int i, Bundle bundle)
    {
        return new DataHolder(rV, i, bundle);
    }

    public int aU(int i)
    {
        int k = 0;
        boolean flag;
        if (i >= 0 && i < rS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.a(flag);
        do
        {
label0:
            {
                int j = k;
                if (k < rR.length)
                {
                    if (i >= rR[k])
                    {
                        break label0;
                    }
                    j = k - 1;
                }
                i = j;
                if (j == rR.length)
                {
                    i = j - 1;
                }
                return i;
            }
            k++;
        } while (true);
    }

    String[] bA()
    {
        return rN;
    }

    CursorWindow[] bB()
    {
        return rP;
    }

    public void c(Object obj)
    {
        rT = obj;
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (mClosed) goto _L2; else goto _L1
_L1:
        mClosed = true;
        int i = 0;
_L3:
        if (i >= rP.length)
        {
            break; /* Loop/switch isn't completed */
        }
        rP[i].close();
        i++;
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

    public void copyToBuffer(String s, int i, int j, CharArrayBuffer chararraybuffer)
    {
        b(s, i);
        rP[j].copyStringToBuffer(i, rO.getInt(s), chararraybuffer);
    }

    public int describeContents()
    {
        return 0;
    }

    protected void finalize()
    {
        if (!rU || rP.length <= 0 || isClosed()) goto _L2; else goto _L1
_L1:
        String s;
        if (rT != null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = (new StringBuilder("internal object: ")).append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call close() on all DataBuffer extending objects when you are done with them. (")).append(s).append(")").toString());
        close();
_L2:
        super.finalize();
        return;
        s = rT.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public boolean getBoolean(String s, int i, int j)
    {
        b(s, i);
        return Long.valueOf(rP[j].getLong(i, rO.getInt(s))).longValue() == 1L;
    }

    public byte[] getByteArray(String s, int i, int j)
    {
        b(s, i);
        return rP[j].getBlob(i, rO.getInt(s));
    }

    public int getCount()
    {
        return rS;
    }

    public int getInteger(String s, int i, int j)
    {
        b(s, i);
        return rP[j].getInt(i, rO.getInt(s));
    }

    public long getLong(String s, int i, int j)
    {
        b(s, i);
        return rP[j].getLong(i, rO.getInt(s));
    }

    public Bundle getMetadata()
    {
        return rQ;
    }

    public int getStatusCode()
    {
        return qo;
    }

    public String getString(String s, int i, int j)
    {
        b(s, i);
        return rP[j].getString(i, rO.getInt(s));
    }

    int getVersionCode()
    {
        return jE;
    }

    public boolean hasColumn(String s)
    {
        return rO.containsKey(s);
    }

    public boolean hasNull(String s, int i, int j)
    {
        b(s, i);
        return rP[j].isNull(i, rO.getInt(s));
    }

    public boolean isClosed()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mClosed;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public Uri parseUri(String s, int i, int j)
    {
        s = getString(s, i, j);
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public void validateContents()
    {
        int k = 0;
        rO = new Bundle();
        for (int i = 0; i < rN.length; i++)
        {
            rO.putInt(rN[i], i);
        }

        rR = new int[rP.length];
        boolean flag = false;
        int j = k;
        k = ((flag) ? 1 : 0);
        for (; j < rP.length; j++)
        {
            rR[j] = k;
            int l = rP[j].getStartPosition();
            k += rP[j].getNumRows() - (k - l);
        }

        rS = k;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.data.c.a(this, parcel, i);
    }

}
