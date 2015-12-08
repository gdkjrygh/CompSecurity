// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.drive:
//            a, DriveId

public class Contents
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int jE;
    private boolean mClosed;
    final ParcelFileDescriptor sp;
    final int uL;
    final int uM;
    final DriveId uN;
    private boolean uO;
    private boolean uP;

    Contents(int i, ParcelFileDescriptor parcelfiledescriptor, int j, int k, DriveId driveid)
    {
        mClosed = false;
        uO = false;
        uP = false;
        jE = i;
        sp = parcelfiledescriptor;
        uL = j;
        uM = k;
        uN = driveid;
    }

    public int cK()
    {
        return uL;
    }

    public void close()
    {
        mClosed = true;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return uN;
    }

    public InputStream getInputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if (uM != 0x10000000)
        {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if (uO)
        {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else
        {
            uO = true;
            return new FileInputStream(sp.getFileDescriptor());
        }
    }

    public int getMode()
    {
        return uM;
    }

    public OutputStream getOutputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (uM != 0x20000000)
        {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (uP)
        {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else
        {
            uP = true;
            return new FileOutputStream(sp.getFileDescriptor());
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else
        {
            return sp;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
