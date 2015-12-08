// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.drive.internal.zzx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataBufferAdapter extends BaseAdapter
{

    private final Context mContext;
    private final LayoutInflater mInflater;
    private final int zzajc;
    private int zzajd;
    private final int zzaje;
    private final List zzajf;
    private boolean zzajg;

    public DataBufferAdapter(Context context, int i)
    {
        this(context, i, 0, ((List) (new ArrayList())));
    }

    public DataBufferAdapter(Context context, int i, int j)
    {
        this(context, i, j, ((List) (new ArrayList())));
    }

    public DataBufferAdapter(Context context, int i, int j, List list)
    {
        zzajg = true;
        mContext = context;
        zzajd = i;
        zzajc = i;
        zzaje = j;
        zzajf = list;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public transient DataBufferAdapter(Context context, int i, int j, DataBuffer adatabuffer[])
    {
        this(context, i, j, Arrays.asList(adatabuffer));
    }

    public DataBufferAdapter(Context context, int i, List list)
    {
        this(context, i, 0, list);
    }

    public transient DataBufferAdapter(Context context, int i, DataBuffer adatabuffer[])
    {
        this(context, i, 0, Arrays.asList(adatabuffer));
    }

    private View zza(int i, View view, ViewGroup viewgroup, int j)
    {
        if (view == null)
        {
            view = mInflater.inflate(j, viewgroup, false);
        }
        if (zzaje != 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        viewgroup = (TextView)view;
_L1:
        Object obj = getItem(i);
        if (obj instanceof CharSequence)
        {
            viewgroup.setText((CharSequence)obj);
            return view;
        } else
        {
            viewgroup.setText(obj.toString());
            return view;
        }
        try
        {
            viewgroup = (TextView)view.findViewById(zzaje);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            zzx.zza("DataBufferAdapter", view, "You must supply a resource ID for a TextView");
            throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", view);
        }
          goto _L1
    }

    public void append(DataBuffer databuffer)
    {
        zzajf.add(databuffer);
        if (zzajg)
        {
            notifyDataSetChanged();
        }
    }

    public void clear()
    {
        for (Iterator iterator = zzajf.iterator(); iterator.hasNext(); ((DataBuffer)iterator.next()).release()) { }
        zzajf.clear();
        if (zzajg)
        {
            notifyDataSetChanged();
        }
    }

    public Context getContext()
    {
        return mContext;
    }

    public int getCount()
    {
        Iterator iterator = zzajf.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((DataBuffer)iterator.next()).getCount() + i) { }
        return i;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return zza(i, view, viewgroup, zzajd);
    }

    public Object getItem(int i)
        throws CursorIndexOutOfBoundsException
    {
        Iterator iterator = zzajf.iterator();
        int j = i;
        while (iterator.hasNext()) 
        {
            DataBuffer databuffer = (DataBuffer)iterator.next();
            int k = databuffer.getCount();
            if (k <= j)
            {
                j -= k;
            } else
            {
                Object obj;
                try
                {
                    obj = databuffer.get(j);
                }
                catch (CursorIndexOutOfBoundsException cursorindexoutofboundsexception)
                {
                    throw new CursorIndexOutOfBoundsException(i, getCount());
                }
                return obj;
            }
        }
        throw new CursorIndexOutOfBoundsException(i, getCount());
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return zza(i, view, viewgroup, zzajc);
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        zzajg = true;
    }

    public void setDropDownViewResource(int i)
    {
        zzajd = i;
    }

    public void setNotifyOnChange(boolean flag)
    {
        zzajg = flag;
    }
}
