// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.internal.zzlg;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotContents, SnapshotContentsEntityCreator

public final class SnapshotContentsEntity
    implements SafeParcelable, SnapshotContents
{

    public static final SnapshotContentsEntityCreator CREATOR = new SnapshotContentsEntityCreator();
    private static final Object zzavj = new Object();
    private final int zzCY;
    private Contents zzafa;

    SnapshotContentsEntity(int i, Contents contents)
    {
        zzCY = i;
        zzafa = contents;
    }

    public SnapshotContentsEntity(Contents contents)
    {
        this(1, contents);
    }

    private boolean zza(int i, byte abyte0[], int j, int k, boolean flag)
    {
        Object obj;
        BufferedOutputStream bufferedoutputstream;
        Object obj1;
        boolean flag1;
        if (!isClosed())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        zzu.zza(flag1, "Must provide a previously opened SnapshotContents");
        obj = zzavj;
        obj;
        JVM INSTR monitorenter ;
        obj1 = new FileOutputStream(zzafa.getParcelFileDescriptor().getFileDescriptor());
        bufferedoutputstream = new BufferedOutputStream(((OutputStream) (obj1)));
        obj1 = ((FileOutputStream) (obj1)).getChannel();
        ((FileChannel) (obj1)).position(i);
        bufferedoutputstream.write(abyte0, j, k);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ((FileChannel) (obj1)).truncate(abyte0.length);
        bufferedoutputstream.flush();
        obj;
        JVM INSTR monitorexit ;
        return true;
        abyte0;
        GamesLog.zza("SnapshotContentsEntity", "Failed to write snapshot data", abyte0);
        obj;
        JVM INSTR monitorexit ;
        return false;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void close()
    {
        zzafa = null;
    }

    public int describeContents()
    {
        return 0;
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        boolean flag;
        if (!isClosed())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Cannot mutate closed contents!");
        return zzafa.getParcelFileDescriptor();
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public boolean isClosed()
    {
        return zzafa == null;
    }

    public boolean modifyBytes(int i, byte abyte0[], int j, int k)
    {
        return zza(i, abyte0, j, abyte0.length, false);
    }

    public byte[] readFully()
        throws IOException
    {
        boolean flag = false;
        if (!isClosed())
        {
            flag = true;
        }
        zzu.zza(flag, "Must provide a previously opened Snapshot");
        Object obj = zzavj;
        obj;
        JVM INSTR monitorenter ;
        FileInputStream fileinputstream;
        BufferedInputStream bufferedinputstream;
        fileinputstream = new FileInputStream(zzafa.getParcelFileDescriptor().getFileDescriptor());
        bufferedinputstream = new BufferedInputStream(fileinputstream);
        byte abyte0[];
        fileinputstream.getChannel().position(0L);
        abyte0 = zzlg.zza(bufferedinputstream, false);
        fileinputstream.getChannel().position(0L);
        return abyte0;
        Object obj1;
        obj1;
        GamesLog.zzb("SnapshotContentsEntity", "Failed to read snapshot data", ((Throwable) (obj1)));
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public boolean writeBytes(byte abyte0[])
    {
        return zza(0, abyte0, 0, abyte0.length, true);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotContentsEntityCreator.zza(this, parcel, i);
    }

    public Contents zzpe()
    {
        return zzafa;
    }

}
