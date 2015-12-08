// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.monitor;

import java.io.File;

// Referenced classes of package org.apache.commons.io.monitor:
//            FileAlterationObserver

public interface FileAlterationListener
{

    public abstract void onDirectoryChange(File file);

    public abstract void onDirectoryCreate(File file);

    public abstract void onDirectoryDelete(File file);

    public abstract void onFileChange(File file);

    public abstract void onFileCreate(File file);

    public abstract void onFileDelete(File file);

    public abstract void onStart(FileAlterationObserver filealterationobserver);

    public abstract void onStop(FileAlterationObserver filealterationobserver);
}
