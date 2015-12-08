// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.data:
//            zze

public final class DataHolder
    implements SafeParcelable
{
    public static class zza
    {

        private final String zzabk[];
        private final ArrayList zzabt;
        private final String zzabu;
        private final HashMap zzabv;
        private boolean zzabw;
        private String zzabx;

        static String[] zza(zza zza1)
        {
            return zza1.zzabk;
        }

        static ArrayList zzb(zza zza1)
        {
            return zza1.zzabt;
        }

        private zza(String as[], String s)
        {
            zzabk = (String[])zzx.zzv(as);
            zzabt = new ArrayList();
            zzabu = s;
            zzabv = new HashMap();
            zzabw = false;
            zzabx = null;
        }

    }

    public static class zzb extends RuntimeException
    {

        public zzb(String s)
        {
            super(s);
        }
    }


    public static final zze CREATOR = new zze();
    private static final zza zzabs = new zza(new String[0], null) {

    };
    boolean mClosed;
    private final int mVersionCode;
    private final int zzWu;
    private final String zzabk[];
    Bundle zzabl;
    private final CursorWindow zzabm[];
    private final Bundle zzabn;
    int zzabo[];
    int zzabp;
    private Object zzabq;
    private boolean zzabr;

    DataHolder(int i, String as[], CursorWindow acursorwindow[], int j, Bundle bundle)
    {
        mClosed = false;
        zzabr = true;
        mVersionCode = i;
        zzabk = as;
        zzabm = acursorwindow;
        zzWu = j;
        zzabn = bundle;
    }

    private DataHolder(zza zza1, int i, Bundle bundle)
    {
        this(zza.zza(zza1), zza(zza1, -1), i, bundle);
    }

    public DataHolder(String as[], CursorWindow acursorwindow[], int i, Bundle bundle)
    {
        mClosed = false;
        zzabr = true;
        mVersionCode = 1;
        zzabk = (String[])zzx.zzv(as);
        zzabm = (CursorWindow[])zzx.zzv(acursorwindow);
        zzWu = i;
        zzabn = bundle;
        zznT();
    }

    public static DataHolder zza(int i, Bundle bundle)
    {
        return new DataHolder(zzabs, i, bundle);
    }

    private static CursorWindow[] zza(zza zza1, int i)
    {
        CursorWindow cursorwindow;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        int j;
        boolean flag;
        flag = false;
        if (zza.zza(zza1).length == 0)
        {
            return new CursorWindow[0];
        }
        int l;
        if (i < 0 || i >= zza.zzb(zza1).size())
        {
            obj1 = zza.zzb(zza1);
        } else
        {
            obj1 = zza.zzb(zza1).subList(0, i);
        }
        l = ((List) (obj1)).size();
        obj = new CursorWindow(false);
        arraylist = new ArrayList();
        arraylist.add(obj);
        ((CursorWindow) (obj)).setNumColumns(zza.zza(zza1).length);
        i = 0;
        j = 0;
_L4:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        cursorwindow = ((CursorWindow) (obj));
        if (((CursorWindow) (obj)).allocRow())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        Log.d("DataHolder", (new StringBuilder()).append("Allocating additional cursor window for large data set (row ").append(i).append(")").toString());
        obj = new CursorWindow(false);
        ((CursorWindow) (obj)).setStartPosition(i);
        ((CursorWindow) (obj)).setNumColumns(zza.zza(zza1).length);
        arraylist.add(obj);
        cursorwindow = ((CursorWindow) (obj));
        if (((CursorWindow) (obj)).allocRow())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        Log.e("DataHolder", "Unable to allocate row to hold data.");
        arraylist.remove(obj);
        zza1 = (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
        return zza1;
        obj = (Map)((List) (obj1)).get(i);
        int k;
        k = 0;
        String s;
        Object obj2;
        long l1;
        for (boolean flag1 = true; k >= zza.zza(zza1).length || !flag1; k++)
        {
            break MISSING_BLOCK_LABEL_565;
        }

        s = zza.zza(zza1)[k];
        obj2 = ((Map) (obj)).get(s);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        flag1 = cursorwindow.putNull(i, k);
        break MISSING_BLOCK_LABEL_705;
        if (obj2 instanceof String)
        {
            flag1 = cursorwindow.putString((String)obj2, i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        if (obj2 instanceof Long)
        {
            flag1 = cursorwindow.putLong(((Long)obj2).longValue(), i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        if (obj2 instanceof Integer)
        {
            flag1 = cursorwindow.putLong(((Integer)obj2).intValue(), i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        if (!(obj2 instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_406;
        }
        if (((Boolean)obj2).booleanValue())
        {
            l1 = 1L;
        } else
        {
            l1 = 0L;
        }
        flag1 = cursorwindow.putLong(l1, i, k);
        break MISSING_BLOCK_LABEL_705;
        if (obj2 instanceof byte[])
        {
            flag1 = cursorwindow.putBlob((byte[])(byte[])obj2, i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        if (obj2 instanceof Double)
        {
            flag1 = cursorwindow.putDouble(((Double)obj2).doubleValue(), i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        if (obj2 instanceof Float)
        {
            flag1 = cursorwindow.putDouble(((Float)obj2).floatValue(), i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported object for column ").append(s).append(": ").append(obj2).toString());
        }
        // Misplaced declaration of an exception variable
        catch (zza zza1)
        {
            j = arraylist.size();
        }
        for (i = ((flag) ? 1 : 0); i < j; i++)
        {
            ((CursorWindow)arraylist.get(i)).close();
        }

        break MISSING_BLOCK_LABEL_686;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_674;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        throw new zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
        Log.d("DataHolder", (new StringBuilder()).append("Couldn't populate window data for row ").append(i).append(" - allocating new window.").toString());
        cursorwindow.freeLastRow();
        cursorwindow = new CursorWindow(false);
        cursorwindow.setStartPosition(i);
        cursorwindow.setNumColumns(zza.zza(zza1).length);
        arraylist.add(cursorwindow);
        j = i - 1;
        i = 1;
_L2:
        k = i;
        i = j + 1;
        obj = cursorwindow;
        j = k;
        continue; /* Loop/switch isn't completed */
        k = 0;
        j = i;
        i = k;
        if (true) goto _L2; else goto _L1
_L1:
        throw zza1;
        if (true) goto _L4; else goto _L3
_L3:
        return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
    }

    public static DataHolder zzbp(int i)
    {
        return zza(i, ((Bundle) (null)));
    }

    private void zzh(String s, int i)
    {
        if (zzabl == null || !zzabl.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No such column: ").append(s).toString());
        }
        if (isClosed())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= zzabp)
        {
            throw new CursorIndexOutOfBoundsException(i, zzabp);
        } else
        {
            return;
        }
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
        if (i >= zzabm.length)
        {
            break; /* Loop/switch isn't completed */
        }
        zzabm[i].close();
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

    public int describeContents()
    {
        return 0;
    }

    protected void finalize()
        throws Throwable
    {
        if (!zzabr || zzabm.length <= 0 || isClosed()) goto _L2; else goto _L1
_L1:
        String s;
        if (zzabq != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s = (new StringBuilder()).append("internal object: ").append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder()).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (").append(s).append(")").toString());
        close();
_L2:
        super.finalize();
        return;
        s = zzabq.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public int getCount()
    {
        return zzabp;
    }

    public int getStatusCode()
    {
        return zzWu;
    }

    int getVersionCode()
    {
        return mVersionCode;
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
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.data.zze.zza(this, parcel, i);
    }

    public void zza(String s, int i, int j, CharArrayBuffer chararraybuffer)
    {
        zzh(s, i);
        zzabm[j].copyStringToBuffer(i, zzabl.getInt(s), chararraybuffer);
    }

    public long zzb(String s, int i, int j)
    {
        zzh(s, i);
        return zzabm[j].getLong(i, zzabl.getInt(s));
    }

    public int zzbo(int i)
    {
        int k = 0;
        boolean flag;
        if (i >= 0 && i < zzabp)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzY(flag);
        do
        {
label0:
            {
                int j = k;
                if (k < zzabo.length)
                {
                    if (i >= zzabo[k])
                    {
                        break label0;
                    }
                    j = k - 1;
                }
                i = j;
                if (j == zzabo.length)
                {
                    i = j - 1;
                }
                return i;
            }
            k++;
        } while (true);
    }

    public int zzc(String s, int i, int j)
    {
        zzh(s, i);
        return zzabm[j].getInt(i, zzabl.getInt(s));
    }

    public boolean zzcd(String s)
    {
        return zzabl.containsKey(s);
    }

    public String zzd(String s, int i, int j)
    {
        zzh(s, i);
        return zzabm[j].getString(i, zzabl.getInt(s));
    }

    public boolean zze(String s, int i, int j)
    {
        zzh(s, i);
        return Long.valueOf(zzabm[j].getLong(i, zzabl.getInt(s))).longValue() == 1L;
    }

    public float zzf(String s, int i, int j)
    {
        zzh(s, i);
        return zzabm[j].getFloat(i, zzabl.getInt(s));
    }

    public byte[] zzg(String s, int i, int j)
    {
        zzh(s, i);
        return zzabm[j].getBlob(i, zzabl.getInt(s));
    }

    public Uri zzh(String s, int i, int j)
    {
        s = zzd(s, i, j);
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public boolean zzi(String s, int i, int j)
    {
        zzh(s, i);
        return zzabm[j].isNull(i, zzabl.getInt(s));
    }

    public Bundle zznP()
    {
        return zzabn;
    }

    public void zznT()
    {
        int k = 0;
        zzabl = new Bundle();
        for (int i = 0; i < zzabk.length; i++)
        {
            zzabl.putInt(zzabk[i], i);
        }

        zzabo = new int[zzabm.length];
        boolean flag = false;
        int j = k;
        k = ((flag) ? 1 : 0);
        for (; j < zzabm.length; j++)
        {
            zzabo[j] = k;
            int l = zzabm[j].getStartPosition();
            k += zzabm[j].getNumRows() - (k - l);
        }

        zzabp = k;
    }

    String[] zznU()
    {
        return zzabk;
    }

    CursorWindow[] zznV()
    {
        return zzabm;
    }

    public void zzq(Object obj)
    {
        zzabq = obj;
    }

}
