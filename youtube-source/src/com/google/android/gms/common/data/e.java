// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gi;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class e
{

    protected final DataHolder mDataHolder;
    protected final int rJ;
    private final int rK;

    public e(DataHolder dataholder, int i)
    {
        mDataHolder = (DataHolder)gi.a(dataholder);
        boolean flag;
        if (i >= 0 && i < dataholder.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.a(flag);
        rJ = i;
        rK = dataholder.aU(rJ);
    }

    protected Uri S(String s)
    {
        return mDataHolder.parseUri(s, rJ, rK);
    }

    protected boolean T(String s)
    {
        return mDataHolder.hasNull(s, rJ, rK);
    }

    protected void a(String s, CharArrayBuffer chararraybuffer)
    {
        mDataHolder.copyToBuffer(s, rJ, rK, chararraybuffer);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof e)
        {
            obj = (e)obj;
            flag = flag1;
            if (ge.a(Integer.valueOf(((e) (obj)).rJ), Integer.valueOf(rJ)))
            {
                flag = flag1;
                if (ge.a(Integer.valueOf(((e) (obj)).rK), Integer.valueOf(rK)))
                {
                    flag = flag1;
                    if (((e) (obj)).mDataHolder == mDataHolder)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected boolean getBoolean(String s)
    {
        return mDataHolder.getBoolean(s, rJ, rK);
    }

    protected byte[] getByteArray(String s)
    {
        return mDataHolder.getByteArray(s, rJ, rK);
    }

    protected int getInteger(String s)
    {
        return mDataHolder.getInteger(s, rJ, rK);
    }

    protected long getLong(String s)
    {
        return mDataHolder.getLong(s, rJ, rK);
    }

    protected String getString(String s)
    {
        return mDataHolder.getString(s, rJ, rK);
    }

    public boolean hasColumn(String s)
    {
        return mDataHolder.hasColumn(s);
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(rJ), Integer.valueOf(rK), mDataHolder
        });
    }

    public boolean isDataValid()
    {
        return !mDataHolder.isClosed();
    }
}
